// $ANTLR 3.0.1 etc/XQFT.g 2007-11-26 13:29:28

	package no.ntnu.xqft.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "XQUERY", "VERSION", "StringLiteral", "ENCODING", "SEMICOLONSi", "MODULE", "NAMESPACE", "NCName", "EQSi", "COMMASi", "DECLARE", "DEFAULT", "ELEMENT", "FUNCTION", "BOUNDARYSPACE", "PRESERVE", "STRIP", "COLLATION", "BASE_URI", "CONSTRUCTION", "ORDERING", "ORDERED", "UNORDERED", "ORDER", "EMPTY", "GREATEST", "LEAST", "COPY_NAMESPACES", "NOPRESERVE", "INHERIT", "NOINHERIT", "IMPORT", "SCHEMA", "AT", "VARIABLE", "DOLLARSi", "ASSIGNSi", "EXTERNAL", "COLONSi", "AS", "LPARSi", "RPARSi", "LBRACESi", "RBRACSi", "OPTION", "FTOPTION", "EMPTY_SEQUENCE", "ITEM", "DOCUMENT_NODE", "QUESTIONSi", "STARSi", "SCHEMAELEMENT", "ATTRIBUTE", "SCHEMAATTRIBUTE", "PROCESSING_INSTRUCTION", "COMMENT", "TEXT", "NODE", "PLUSSi", "RETURN", "FOR", "IN", "SCORE", "LET", "WHERE", "BY", "STABLE", "ASCENDING", "DESCENDING", "SOME", "EVERY", "SATISFIES", "TYPESWITCH", "CASE", "IF", "THEN", "ELSE", "OR", "AND", "FTCONTAINS", "TO", "MINUSSi", "DIV", "IDIV", "MOD", "UNION", "PIPESi", "INTERSECT", "EXCEPT", "INSTANCE", "OF", "TREAT", "CASTABLE", "CAST", "WITHOUT", "CONTENT", "EQ", "NE", "LT", "LE", "GT", "GE", "NEQSi", "LTSi", "LTOREQSi", "GTSi", "GTOREQSi", "IS", "NODEBEFORESi", "NODEAFTERSi", "WEIGHT", "FTOR", "FTAND", "NOT", "FTNOT", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "ANY", "WORD", "ALL", "WORDS", "PHRASE", "OCCURS", "TIMES", "EXACTLY", "MOST", "FROM", "LPRAGSi", "PragmaContents", "RPRAGSi", "WINDOW", "SENTENCES", "PARAGRAPHS", "DISTANCE", "SAME", "DIFFERENT", "SENTENCE", "PARAGRAPH", "START", "END", "ENTIRE", "LANGUAGE", "WITH", "WILDCARDS", "THESAURUS", "RELATIONSHIP", "LEVELS", "STEMMING", "INSENSITIVE", "SENSITIVE", "LOWERCASE", "UPPERCASE", "DIACRITICS", "STOP", "VALIDATE", "LAX", "STRICT", "DBLSLASHSi", "SLASHSi", "PARENT", "ANCESTOR", "PRECEDING_SIBLING", "PRECEDING", "ANCESTOR_OR_SELF", "DBLCOLONSi", "DOTDOTSi", "CHILD", "DESCENDANT", "SELF", "DESCENDANT_OR_SELF", "FOLLOWING_SIBLING", "FOLLOWING", "ATSi", "LBRACKSi", "RBRACKSi", "DOTSi", "RSELFTERMSi", "LENDTAGSi", "QUOTSi", "QuotAttributeContent", "APOSSi", "AposAttributeContent", "ElementContent", "LCDATASi", "CDataContents", "RCDATASi", "LCOMMENTSi", "DirCommentContent", "RCOMMENTSi", "LPISi", "PiTarget", "DirPiContents", "RPISi", "DOCUMENT", "CDataSectionLEX", "DirPIConstructor", "DirCommentConstLEX", "PragmaLEX", "Comment", "LexSigns", "S", "LexLiterals", "TOKENSWITCH", "PredefinedEntityRef", "CharRef", "AMPERSi", "QuotAttrContentChar", "AposAttrContentChar", "ElementContentChar", "CREFDECSi", "CREFHEXSi", "NotChar", "Name", "Letter", "UNDERSCORESi", "NameChar", "Digit", "CombiningChar", "Extender", "SHARPSi", "LXQCOMMENTSi", "RXQCOMMENTSi", "Digits", "NCNameStartChar", "NCNameChar", "EXCLSi", "BACKSLASHSi", "ExtraChar", "BaseChar", "Ideographic", "CleanChar", "Char"
    };
    public static final int FUNCTION=17;
    public static final int MOD=88;
    public static final int LPISi=194;
    public static final int CREFHEXSi=215;
    public static final int NOT=117;
    public static final int EXCEPT=92;
    public static final int EOF=-1;
    public static final int PragmaContents=133;
    public static final int BaseChar=233;
    public static final int Ideographic=234;
    public static final int DISTANCE=138;
    public static final int IMPORT=35;
    public static final int ASSIGNSi=40;
    public static final int CREFDECSi=214;
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
    public static final int UNDERSCORESi=219;
    public static final int ELSE=80;
    public static final int RCDATASi=190;
    public static final int TYPESWITCH=76;
    public static final int STOP=158;
    public static final int CONTENT=99;
    public static final int S=205;
    public static final int FTOR=115;
    public static final int EMPTY=28;
    public static final int INTERSECT=91;
    public static final int MINUSSi=85;
    public static final int FTAND=116;
    public static final int LANGUAGE=146;
    public static final int LOWERCASE=155;
    public static final int LPRAGSi=132;
    public static final int INSENSITIVE=153;
    public static final int APOSSi=185;
    public static final int LBRACKSi=178;
    public static final int RSELFTERMSi=181;
    public static final int GT=104;
    public static final int END=144;
    public static final int DoubleLiteral=121;
    public static final int QUOTSi=183;
    public static final int LexLiterals=206;
    public static final int DirCommentContent=192;
    public static final int CharRef=209;
    public static final int OPTION=48;
    public static final int Extender=223;
    public static final int OCCURS=127;
    public static final int THESAURUS=149;
    public static final int SATISFIES=75;
    public static final int VERSION=5;
    public static final int RXQCOMMENTSi=226;
    public static final int IDIV=87;
    public static final int ASCENDING=71;
    public static final int ExtraChar=232;
    public static final int AT=37;
    public static final int EMPTY_SEQUENCE=50;
    public static final int AS=43;
    public static final int PARENT=164;
    public static final int CONSTRUCTION=23;
    public static final int THEN=79;
    public static final int ATSi=177;
    public static final int DOCUMENT=198;
    public static final int DBLSLASHSi=162;
    public static final int COLLATION=21;
    public static final int LCOMMENTSi=191;
    public static final int ANCESTOR=165;
    public static final int AMPERSi=210;
    public static final int CleanChar=235;
    public static final int CASTABLE=96;
    public static final int ElementContent=187;
    public static final int MOST=130;
    public static final int EQSi=12;
    public static final int BY=69;
    public static final int NODEBEFORESi=112;
    public static final int DOTSi=180;
    public static final int NCNameChar=229;
    public static final int ITEM=51;
    public static final int TO=84;
    public static final int INHERIT=33;
    public static final int ANCESTOR_OR_SELF=168;
    public static final int DOTDOTSi=170;
    public static final int STEMMING=152;
    public static final int LTOREQSi=108;
    public static final int NotChar=216;
    public static final int DirPIConstructor=200;
    public static final int TEXT=60;
    public static final int MODULE=9;
    public static final int FTNOT=118;
    public static final int ORDERED=25;
    public static final int SAME=139;
    public static final int UNION=89;
    public static final int StringLiteral=6;
    public static final int FOLLOWING_SIBLING=175;
    public static final int SCHEMA=36;
    public static final int COLONSi=42;
    public static final int PiTarget=195;
    public static final int ENTIRE=145;
    public static final int INSTANCE=93;
    public static final int VALIDATE=159;
    public static final int WILDCARDS=148;
    public static final int NOINHERIT=34;
    public static final int DECLARE=14;
    public static final int START=143;
    public static final int IntegerLiteral=119;
    public static final int DIV=86;
    public static final int CombiningChar=222;
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
    public static final int BACKSLASHSi=231;
    public static final int CASE=77;
    public static final int ENCODING=7;
    public static final int RCOMMENTSi=193;
    public static final int PLUSSi=62;
    public static final int DIFFERENT=140;
    public static final int PragmaLEX=202;
    public static final int SCHEMAATTRIBUTE=57;
    public static final int DOCUMENT_NODE=52;
    public static final int LXQCOMMENTSi=225;
    public static final int SEMICOLONSi=8;
    public static final int WORD=123;
    public static final int SHARPSi=224;
    public static final int UPPERCASE=156;
    public static final int Comment=203;
    public static final int Char=236;
    public static final int Digits=227;
    public static final int QuotAttrContentChar=211;
    public static final int FTOPTION=49;
    public static final int AposAttributeContent=186;
    public static final int COMMENT=59;
    public static final int NE=101;
    public static final int CDataSectionLEX=199;
    public static final int BOUNDARYSPACE=18;
    public static final int NODE=61;
    public static final int CDataContents=189;
    public static final int AposAttrContentChar=212;
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
    public static final int LCDATASi=188;
    public static final int LBRACESi=46;
    public static final int VARIABLE=38;
    public static final int DESCENDANT_OR_SELF=174;
    public static final int BASE_URI=22;
    public static final int NOPRESERVE=32;
    public static final int DirPiContents=196;
    public static final int OR=81;
    public static final int LPARSi=44;
    public static final int STARSi=54;
    public static final int QuotAttributeContent=184;
    public static final int RPISi=197;
    public static final int FROM=131;
    public static final int PRECEDING_SIBLING=166;
    public static final int Letter=218;
    public static final int NCName=11;
    public static final int WHERE=68;
    public static final int LAX=160;
    public static final int ORDER=27;
    public static final int ATTRIBUTE=56;
    public static final int FOR=64;
    public static final int EXCLSi=230;
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
    public static final int ALL=124;
    public static final int STRIP=20;
    public static final int STABLE=70;
    public static final int PIPESi=90;
    public static final int WITH=147;
    public static final int NCNameStartChar=228;
    public static final int LENDTAGSi=182;
    public static final int RBRACSi=47;
    public static final int GTSi=109;
    public static final int XQUERY=4;
    public static final int EXACTLY=129;
    public static final int DEFAULT=15;
    public static final int DESCENDANT=172;
    public static final int NameChar=220;
    public static final int COMMASi=13;
    public static final int SLASHSi=163;
    public static final int Digit=221;
    public static final int DecimalLiteral=120;
    public static final int GTOREQSi=110;
    public static final int UNORDERED=26;
    public static final int PHRASE=126;
    public static final int TOKENSWITCH=207;
    public static final int ElementContentChar=213;
    public static final int ANY=122;
    public static final int SCORE=66;
    public static final int LexSigns=204;
    public static final int ORDERING=24;
    public static final int PredefinedEntityRef=208;
    public static final int Name=217;
    public static final int LEAST=30;
    public static final int WINDOW=135;
    public static final int TIMES=128;
    public static final int PARAGRAPHS=137;
    public static final int LEVELS=151;
    public static final int DirCommentConstLEX=201;
    public static final int LET=67;
    public static final int TREAT=95;
    public static final int LE=103;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[178+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }


    	
    	/* Root scope */
    	//Scope currentScope = new Scope();	   // @init-ting her ogsaa
    	XQFTLexer lexer;
    	
    	public void setTokenStream(TokenStream input) {
    		lexer = (XQFTLexer)input.getTokenSource();
    		UnbufferedCommonTokenStream tokenz = new UnbufferedCommonTokenStream();
    		tokenz.setTokenSource(lexer);
    		super.setTokenStream(tokenz);
     	
    	}



    // $ANTLR start module
    // etc/XQFT.g:64:1: module : ( versionDecl )? ( libraryModule | mainModule ) ;
    public final void module() throws RecognitionException {
        try {
            // etc/XQFT.g:64:32: ( ( versionDecl )? ( libraryModule | mainModule ) )
            // etc/XQFT.g:64:34: ( versionDecl )? ( libraryModule | mainModule )
            {
            // etc/XQFT.g:64:34: ( versionDecl )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==XQUERY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:64:34: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module92);
                    versionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:64:47: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                alt2=1;
            }
            else if ( (LA2_0==StringLiteral||LA2_0==NCName||LA2_0==DECLARE||LA2_0==ELEMENT||(LA2_0>=ORDERED && LA2_0<=UNORDERED)||LA2_0==IMPORT||LA2_0==DOLLARSi||LA2_0==LPARSi||LA2_0==DOCUMENT_NODE||(LA2_0>=STARSi && LA2_0<=PLUSSi)||LA2_0==FOR||LA2_0==LET||(LA2_0>=SOME && LA2_0<=EVERY)||LA2_0==TYPESWITCH||LA2_0==IF||LA2_0==MINUSSi||LA2_0==LTSi||(LA2_0>=IntegerLiteral && LA2_0<=DoubleLiteral)||LA2_0==LPRAGSi||LA2_0==VALIDATE||(LA2_0>=DBLSLASHSi && LA2_0<=ANCESTOR_OR_SELF)||(LA2_0>=DOTDOTSi && LA2_0<=ATSi)||LA2_0==DOTSi||LA2_0==LCOMMENTSi||LA2_0==LPISi||LA2_0==DOCUMENT) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("64:47: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:64:48: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module96);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:64:64: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module100);
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
    // etc/XQFT.g:66:2: versionDecl : XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator ;
    public final void versionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:66:33: ( XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator )
            // etc/XQFT.g:66:35: XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator
            {
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl129); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl131); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl133); if (failed) return ;
            // etc/XQFT.g:66:64: ( ENCODING StringLiteral )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:66:65: ENCODING StringLiteral
                    {
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl136); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl138); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl142);
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
    // etc/XQFT.g:67:3: separator : SEMICOLONSi ;
    public final void separator() throws RecognitionException {
        try {
            // etc/XQFT.g:67:34: ( SEMICOLONSi )
            // etc/XQFT.g:67:36: SEMICOLONSi
            {
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator172); if (failed) return ;

            }

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
    // etc/XQFT.g:69:2: libraryModule : moduleDecl prolog ;
    public final void libraryModule() throws RecognitionException {
        try {
            // etc/XQFT.g:69:33: ( moduleDecl prolog )
            // etc/XQFT.g:69:35: moduleDecl prolog
            {
            pushFollow(FOLLOW_moduleDecl_in_libraryModule200);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule202);
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
    // etc/XQFT.g:70:3: moduleDecl : MODULE NAMESPACE NCName EQSi uriLiteral separator ;
    public final void moduleDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:70:34: ( MODULE NAMESPACE NCName EQSi uriLiteral separator )
            // etc/XQFT.g:70:36: MODULE NAMESPACE NCName EQSi uriLiteral separator
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl231); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl233); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl235); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl237); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl239);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl241);
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
    // etc/XQFT.g:71:4: uriLiteral : StringLiteral ;
    public final void uriLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:71:35: ( StringLiteral )
            // etc/XQFT.g:71:37: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral271); if (failed) return ;

            }

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
    // etc/XQFT.g:74:2: mainModule : prolog queryBody ;
    public final void mainModule() throws RecognitionException {
        try {
            // etc/XQFT.g:74:33: ( prolog queryBody )
            // etc/XQFT.g:74:35: prolog queryBody
            {
            pushFollow(FOLLOW_prolog_in_mainModule303);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule305);
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
    // etc/XQFT.g:76:3: queryBody : expr ;
    public final void queryBody() throws RecognitionException {
        try {
            // etc/XQFT.g:76:34: ( expr )
            // etc/XQFT.g:76:36: expr
            {
            pushFollow(FOLLOW_expr_in_queryBody336);
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
    // etc/XQFT.g:77:4: expr : exprSingle ( COMMASi exprSingle )* ;
    public final void expr() throws RecognitionException {
        try {
            // etc/XQFT.g:77:35: ( exprSingle ( COMMASi exprSingle )* )
            // etc/XQFT.g:77:37: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr372);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:77:48: ( COMMASi exprSingle )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMASi) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:77:49: COMMASi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr375); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr377);
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
    // etc/XQFT.g:83:1: prolog : ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* ;
    public final void prolog() throws RecognitionException {
        try {
            // etc/XQFT.g:83:32: ( ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* )
            // etc/XQFT.g:83:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            {
            // etc/XQFT.g:83:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )*
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
            	    // etc/XQFT.g:84:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator
            	    {
            	    // etc/XQFT.g:84:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )
            	    int alt5=4;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case DEFAULT:
            	            {
            	            int LA5_3 = input.LA(3);

            	            if ( (LA5_3==COLLATION||LA5_3==ORDER) ) {
            	                alt5=2;
            	            }
            	            else if ( ((LA5_3>=ELEMENT && LA5_3<=FUNCTION)) ) {
            	                alt5=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("84:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 3, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case BOUNDARYSPACE:
            	        case BASE_URI:
            	        case CONSTRUCTION:
            	        case ORDERING:
            	        case COPY_NAMESPACES:
            	            {
            	            alt5=2;
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
            	                new NoViableAltException("84:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA5_0==IMPORT) ) {
            	        alt5=4;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("84:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // etc/XQFT.g:84:13: defaultNamespaceDecl
            	            {
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog442);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:84:36: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog446);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:84:45: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog450);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:84:61: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog454);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog469);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // etc/XQFT.g:87:12: ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DECLARE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:88:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator
            	    {
            	    // etc/XQFT.g:88:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )
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
            	                new NoViableAltException("88:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("88:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // etc/XQFT.g:88:13: varDecl
            	            {
            	            pushFollow(FOLLOW_varDecl_in_prolog511);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:88:23: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog515);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:88:38: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog519);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:88:51: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog523);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog537);
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
    // etc/XQFT.g:93:1: defaultNamespaceDecl : DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final void defaultNamespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:93:32: ( DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:93:34: DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl570); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl572); if (failed) return ;
            if ( (input.LA(1)>=ELEMENT && input.LA(1)<=FUNCTION) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl574);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl582); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl584);
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
    // etc/XQFT.g:95:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );
    public final void setter() throws RecognitionException {
        try {
            // etc/XQFT.g:95:32: ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl )
            int alt9=7;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DECLARE) ) {
                switch ( input.LA(2) ) {
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
                case BASE_URI:
                    {
                    alt9=3;
                    }
                    break;
                case DEFAULT:
                    {
                    int LA9_5 = input.LA(3);

                    if ( (LA9_5==COLLATION) ) {
                        alt9=2;
                    }
                    else if ( (LA9_5==ORDER) ) {
                        alt9=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("95:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 5, input);

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
                        new NoViableAltException("95:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("95:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:95:34: boundarySpaceDecl
                    {
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter616);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:96:13: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter631);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:97:13: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter646);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:98:13: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter661);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:99:13: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter676);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:100:13: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter691);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:101:13: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter706);
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
    // etc/XQFT.g:102:2: boundarySpaceDecl : DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final void boundarySpaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:102:33: ( DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:102:35: DECLARE BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl727); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl729); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl731);    throw mse;
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
    // etc/XQFT.g:103:2: defaultCollationDecl : DECLARE DEFAULT COLLATION uriLiteral ;
    public final void defaultCollationDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:103:33: ( DECLARE DEFAULT COLLATION uriLiteral )
            // etc/XQFT.g:103:35: DECLARE DEFAULT COLLATION uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl755); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl757); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl759); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl761);
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
    // etc/XQFT.g:104:2: baseURIDecl : DECLARE BASE_URI uriLiteral ;
    public final void baseURIDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:104:33: ( DECLARE BASE_URI uriLiteral )
            // etc/XQFT.g:104:35: DECLARE BASE_URI uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl788); if (failed) return ;
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl790); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl792);
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
    // etc/XQFT.g:105:2: constructionDecl : DECLARE CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final void constructionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:105:33: ( DECLARE CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:105:35: DECLARE CONSTRUCTION ( STRIP | PRESERVE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl814); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl816); if (failed) return ;
            if ( (input.LA(1)>=PRESERVE && input.LA(1)<=STRIP) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl818);    throw mse;
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
    // etc/XQFT.g:106:2: orderingModeDecl : DECLARE ORDERING ( ORDERED | UNORDERED ) ;
    public final void orderingModeDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:106:33: ( DECLARE ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:106:35: DECLARE ORDERING ( ORDERED | UNORDERED )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl846); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl848); if (failed) return ;
            if ( (input.LA(1)>=ORDERED && input.LA(1)<=UNORDERED) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl850);    throw mse;
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
    // etc/XQFT.g:107:2: emptyOrderDecl : DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) ;
    public final void emptyOrderDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:107:33: ( DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:107:35: DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl880); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl882); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl884); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl886); if (failed) return ;
            if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl888);    throw mse;
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
    // etc/XQFT.g:108:2: copyNamespacesDecl : DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode ;
    public final void copyNamespacesDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:108:33: ( DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:108:35: DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl914); if (failed) return ;
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl916); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl918);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl920); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl922);
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
    // etc/XQFT.g:109:3: preserveMode : ( PRESERVE | NOPRESERVE );
    public final void preserveMode() throws RecognitionException {
        try {
            // etc/XQFT.g:109:34: ( PRESERVE | NOPRESERVE )
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
    // etc/XQFT.g:110:3: inheritMode : ( INHERIT | NOINHERIT );
    public final void inheritMode() throws RecognitionException {
        try {
            // etc/XQFT.g:110:34: ( INHERIT | NOINHERIT )
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
    // etc/XQFT.g:112:1: namespaceDecl : DECLARE NAMESPACE NCName EQSi uriLiteral ;
    public final void namespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:112:32: ( DECLARE NAMESPACE NCName EQSi uriLiteral )
            // etc/XQFT.g:112:34: DECLARE NAMESPACE NCName EQSi uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl1013); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl1015); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl1017); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl1019); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl1021);
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
    // etc/XQFT.g:114:1: importStmt : ( schemaImport | moduleImport );
    public final void importStmt() throws RecognitionException {
        try {
            // etc/XQFT.g:114:32: ( schemaImport | moduleImport )
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
                        new NoViableAltException("114:1: importStmt : ( schemaImport | moduleImport );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("114:1: importStmt : ( schemaImport | moduleImport );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:114:34: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt1049);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:114:49: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1053);
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
    // etc/XQFT.g:115:2: schemaImport : IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void schemaImport() throws RecognitionException {
        try {
            // etc/XQFT.g:115:33: ( IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:115:35: IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport1079); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1081); if (failed) return ;
            // etc/XQFT.g:115:49: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAMESPACE||LA11_0==DEFAULT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:115:49: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1083);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1086);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:115:74: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:115:75: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_schemaImport1089); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1091);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:115:89: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:115:90: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1094); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1096);
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
    // etc/XQFT.g:116:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final void schemaPrefix() throws RecognitionException {
        try {
            // etc/XQFT.g:116:34: ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
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
                    new NoViableAltException("116:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:116:36: ( NAMESPACE NCName EQSi )
                    {
                    // etc/XQFT.g:116:36: ( NAMESPACE NCName EQSi )
                    // etc/XQFT.g:116:37: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1128); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix1130); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1132); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:116:62: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:116:62: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:116:63: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1138); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1140); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1142); if (failed) return ;

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
    // etc/XQFT.g:117:2: moduleImport : IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void moduleImport() throws RecognitionException {
        try {
            // etc/XQFT.g:117:33: ( IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:117:35: IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport1169); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1171); if (failed) return ;
            // etc/XQFT.g:117:49: ( NAMESPACE NCName EQSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:117:50: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1174); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport1176); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1178); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1182);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:117:85: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:117:86: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_moduleImport1185); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1187);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:117:100: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:117:101: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1190); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1192);
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
    // etc/XQFT.g:119:1: varDecl : DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) ;
    public final void varDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:119:32: ( DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:119:34: DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl1228); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl1230); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl1232); if (failed) return ;
            pushFollow(FOLLOW_qName_in_varDecl1234);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:119:66: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:119:66: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl1236);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:119:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )
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
                    new NoViableAltException("119:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:119:84: ( ASSIGNSi exprSingle )
                    {
                    // etc/XQFT.g:119:84: ( ASSIGNSi exprSingle )
                    // etc/XQFT.g:119:85: ASSIGNSi exprSingle
                    {
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl1241); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl1243);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:119:108: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl1248); if (failed) return ;

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
    // etc/XQFT.g:120:2: qName returns [String text] : nc1= NCName (c= COLONSi nc2= NCName )? ;
    public final String qName() throws RecognitionException {
        String text = null;

        Token nc1=null;
        Token c=null;
        Token nc2=null;

        try {
            // etc/XQFT.g:120:36: (nc1= NCName (c= COLONSi nc2= NCName )? )
            // etc/XQFT.g:120:38: nc1= NCName (c= COLONSi nc2= NCName )?
            {
            nc1=(Token)input.LT(1);
            match(input,NCName,FOLLOW_NCName_in_qName1269); if (failed) return text;
            // etc/XQFT.g:120:49: (c= COLONSi nc2= NCName )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLONSi) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:120:50: c= COLONSi nc2= NCName
                    {
                    c=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName1274); if (failed) return text;
                    nc2=(Token)input.LT(1);
                    match(input,NCName,FOLLOW_NCName_in_qName1278); if (failed) return text;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               text = nc1.getText() + (c != null ? c.getText() + nc2.getText() : ""); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return text;
    }
    // $ANTLR end qName


    // $ANTLR start typeDeclaration
    // etc/XQFT.g:121:2: typeDeclaration : AS sequenceType ;
    public final void typeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:121:33: ( AS sequenceType )
            // etc/XQFT.g:121:35: AS sequenceType
            {
            match(input,AS,FOLLOW_AS_in_typeDeclaration1305); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration1307);
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
    // etc/XQFT.g:125:1: functionDecl : DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) ;
    public final void functionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:125:32: ( DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) )
            // etc/XQFT.g:125:34: DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl1336); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl1338); if (failed) return ;
            pushFollow(FOLLOW_qName_in_functionDecl1340);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl1342); if (failed) return ;
            // etc/XQFT.g:125:64: ( paramList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOLLARSi) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:125:64: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl1344);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl1347); if (failed) return ;
            // etc/XQFT.g:126:12: ( AS sequenceType )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:126:13: AS sequenceType
                    {
                    match(input,AS,FOLLOW_AS_in_functionDecl1362); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl1364);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:126:31: ( enclosedExpr | EXTERNAL )
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
                    new NoViableAltException("126:31: ( enclosedExpr | EXTERNAL )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:126:32: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl1369);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:126:47: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl1373); if (failed) return ;

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
    // etc/XQFT.g:127:2: paramList : param ( COMMASi param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // etc/XQFT.g:127:33: ( param ( COMMASi param )* )
            // etc/XQFT.g:127:35: param ( COMMASi param )*
            {
            pushFollow(FOLLOW_param_in_paramList1403);
            param();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:127:41: ( COMMASi param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:127:42: COMMASi param
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList1406); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList1408);
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
    // etc/XQFT.g:128:3: param : DOLLARSi qName ( typeDeclaration )? ;
    public final void param() throws RecognitionException {
        try {
            // etc/XQFT.g:128:34: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:128:36: DOLLARSi qName ( typeDeclaration )?
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param1444); if (failed) return ;
            pushFollow(FOLLOW_qName_in_param1446);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:128:51: ( typeDeclaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:128:51: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param1448);
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
    // etc/XQFT.g:134:2: enclosedExpr : LBRACESi expr RBRACSi ;
    public final void enclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:134:33: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:135:13: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr1493); if (failed) return ;
            pushFollow(FOLLOW_expr_in_enclosedExpr1508);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr1523); if (failed) return ;

            }

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
    // etc/XQFT.g:143:1: optionDecl : DECLARE OPTION qName StringLiteral ;
    public final void optionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:143:32: ( DECLARE OPTION qName StringLiteral )
            // etc/XQFT.g:143:34: DECLARE OPTION qName StringLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl1570); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl1572); if (failed) return ;
            pushFollow(FOLLOW_qName_in_optionDecl1574);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl1576); if (failed) return ;

            }

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
    // etc/XQFT.g:145:1: ftOptionDecl : DECLARE FTOPTION ftMatchOptions ;
    public final void ftOptionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:145:32: ( DECLARE FTOPTION ftMatchOptions )
            // etc/XQFT.g:145:34: DECLARE FTOPTION ftMatchOptions
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl1602); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl1604); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl1606);
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
    // etc/XQFT.g:146:2: ftMatchOptions : ( ftMatchOption )+ ;
    public final void ftMatchOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:146:33: ( ( ftMatchOption )+ )
            // etc/XQFT.g:146:35: ( ftMatchOption )+
            {
            // etc/XQFT.g:146:35: ( ftMatchOption )+
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
            	    // etc/XQFT.g:146:35: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions1630);
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
    // etc/XQFT.g:152:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );
    public final void sequenceType() throws RecognitionException {
        try {
            // etc/XQFT.g:152:32: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:152:34: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType1682);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType1684);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:153:13: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType1698);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:154:13: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType1712); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType1714); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType1716); if (failed) return ;

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
    // etc/XQFT.g:156:2: itemType : ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) ;
    public final void itemType() throws RecognitionException {
        try {
            // etc/XQFT.g:156:33: ( ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) )
            // etc/XQFT.g:156:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            {
            // etc/XQFT.g:156:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
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
                    new NoViableAltException("156:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:156:36: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType1758);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:156:47: ( ITEM LPARSi RPARSi )
                    {
                    // etc/XQFT.g:156:47: ( ITEM LPARSi RPARSi )
                    // etc/XQFT.g:156:48: ITEM LPARSi RPARSi
                    {
                    match(input,ITEM,FOLLOW_ITEM_in_itemType1763); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType1765); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType1767); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:156:70: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType1772);
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
    // etc/XQFT.g:157:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final void kindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:157:34: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
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
                    new NoViableAltException("157:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:157:36: documentTest
                    {
                    pushFollow(FOLLOW_documentTest_in_kindTest1804);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:158:39: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest1844);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:159:39: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest1884);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:160:39: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest1924);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:161:39: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest1964);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:162:39: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest2004);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:163:39: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest2044);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:164:39: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest2084);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:165:39: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest2124);
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
    // etc/XQFT.g:166:4: documentTest : DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi ;
    public final void documentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:166:35: ( DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi )
            // etc/XQFT.g:166:37: DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi
            {
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest2152); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest2154); if (failed) return ;
            // etc/XQFT.g:166:58: ( elementTest | schemaElementTest )?
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
                    // etc/XQFT.g:166:59: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest2157);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:166:73: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest2161);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest2165); if (failed) return ;

            }

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
    // etc/XQFT.g:167:5: elementTest : ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi ;
    public final void elementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:167:34: ( ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi )
            // etc/XQFT.g:167:36: ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest2193); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest2195); if (failed) return ;
            // etc/XQFT.g:167:51: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NCName||LA33_0==STARSi) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // etc/XQFT.g:167:52: elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest2198);
                    elementNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:167:74: ( COMMASi typeName ( QUESTIONSi )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMASi) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // etc/XQFT.g:167:75: COMMASi typeName ( QUESTIONSi )?
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest2201); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest2203);
                            typeName();
                            _fsp--;
                            if (failed) return ;
                            // etc/XQFT.g:167:92: ( QUESTIONSi )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==QUESTIONSi) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // etc/XQFT.g:167:92: QUESTIONSi
                                    {
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest2205); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest2212); if (failed) return ;

            }

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
    // etc/XQFT.g:168:6: elementNameOrWildcard : ( elementName | STARSi );
    public final void elementNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:168:37: ( elementName | STARSi )
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
                    new NoViableAltException("168:6: elementNameOrWildcard : ( elementName | STARSi );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:168:39: elementName
                    {
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard2269);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:168:53: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard2273); if (failed) return ;

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
    // etc/XQFT.g:169:7: elementName : qName ;
    public final void elementName() throws RecognitionException {
        try {
            // etc/XQFT.g:169:38: ( qName )
            // etc/XQFT.g:169:40: qName
            {
            pushFollow(FOLLOW_qName_in_elementName2305);
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
    // etc/XQFT.g:170:6: typeName : qName ;
    public final void typeName() throws RecognitionException {
        try {
            // etc/XQFT.g:170:37: ( qName )
            // etc/XQFT.g:170:39: qName
            {
            pushFollow(FOLLOW_qName_in_typeName2339);
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
    // etc/XQFT.g:171:5: schemaElementTest : SCHEMAELEMENT LPARSi elementDeclaration RPARSi ;
    public final void schemaElementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:171:37: ( SCHEMAELEMENT LPARSi elementDeclaration RPARSi )
            // etc/XQFT.g:171:39: SCHEMAELEMENT LPARSi elementDeclaration RPARSi
            {
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest2364); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest2366); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest2368);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest2370); if (failed) return ;

            }

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
    // etc/XQFT.g:172:6: elementDeclaration : elementName ;
    public final void elementDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:172:37: ( elementName )
            // etc/XQFT.g:172:39: elementName
            {
            pushFollow(FOLLOW_elementName_in_elementDeclaration2394);
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
    // etc/XQFT.g:178:4: attributeTest : ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi ;
    public final void attributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:178:35: ( ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi )
            // etc/XQFT.g:178:37: ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest2426); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest2428); if (failed) return ;
            // etc/XQFT.g:178:54: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NCName||LA36_0==STARSi) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:178:55: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest2431);
                    attribNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:178:76: ( COMMASi typeName )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMASi) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // etc/XQFT.g:178:77: COMMASi typeName
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest2434); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest2436);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest2442); if (failed) return ;

            }

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
    // etc/XQFT.g:179:5: attribNameOrWildcard : ( attributeName | STARSi );
    public final void attribNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:179:36: ( attributeName | STARSi )
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
                    new NoViableAltException("179:5: attribNameOrWildcard : ( attributeName | STARSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:179:38: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard2463);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:179:54: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard2467); if (failed) return ;

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
    // etc/XQFT.g:180:6: attributeName : qName ;
    public final void attributeName() throws RecognitionException {
        try {
            // etc/XQFT.g:180:37: ( qName )
            // etc/XQFT.g:180:39: qName
            {
            pushFollow(FOLLOW_qName_in_attributeName2496);
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
    // etc/XQFT.g:185:4: schemaAttributeTest : SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi ;
    public final void schemaAttributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:185:35: ( SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi )
            // etc/XQFT.g:185:37: SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi
            {
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2521); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest2523); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest2525);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest2527); if (failed) return ;

            }

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
    // etc/XQFT.g:186:5: attributeDeclaration : attributeName ;
    public final void attributeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:186:36: ( attributeName )
            // etc/XQFT.g:186:38: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration2548);
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
    // etc/XQFT.g:188:4: piTest : PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi ;
    public final void piTest() throws RecognitionException {
        try {
            // etc/XQFT.g:188:35: ( PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi )
            // etc/XQFT.g:188:37: PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest2583); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest2585); if (failed) return ;
            // etc/XQFT.g:188:67: ( NCName | StringLiteral )?
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest2587);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_piTest2596); if (failed) return ;

            }

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
    // etc/XQFT.g:189:4: commentTest : COMMENT LPARSi RPARSi ;
    public final void commentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:189:35: ( COMMENT LPARSi RPARSi )
            // etc/XQFT.g:189:37: COMMENT LPARSi RPARSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest2625); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest2627); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest2629); if (failed) return ;

            }

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
    // etc/XQFT.g:190:4: textTest : TEXT LPARSi RPARSi ;
    public final void textTest() throws RecognitionException {
        try {
            // etc/XQFT.g:190:35: ( TEXT LPARSi RPARSi )
            // etc/XQFT.g:190:37: TEXT LPARSi RPARSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_textTest2661); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest2663); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest2665); if (failed) return ;

            }

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
    // etc/XQFT.g:191:4: anyKindTest : NODE LPARSi RPARSi ;
    public final void anyKindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:191:35: ( NODE LPARSi RPARSi )
            // etc/XQFT.g:191:37: NODE LPARSi RPARSi
            {
            match(input,NODE,FOLLOW_NODE_in_anyKindTest2694); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest2696); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest2698); if (failed) return ;

            }

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
    // etc/XQFT.g:192:2: occurrenceIndicator : ( QUESTIONSi | STARSi | PLUSSi );
    public final void occurrenceIndicator() throws RecognitionException {
        try {
            // etc/XQFT.g:192:33: ( QUESTIONSi | STARSi | PLUSSi )
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
    // etc/XQFT.g:196:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );
    public final void exprSingle() throws RecognitionException {
        try {
            // etc/XQFT.g:196:32: ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr )
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
            case LCOMMENTSi:
            case LPISi:
            case DOCUMENT:
                {
                alt39=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("196:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // etc/XQFT.g:197:11: fLWORExpr
                    {
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle2768);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:198:37: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle2806);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:199:37: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle2844);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:200:37: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle2882);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:201:37: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle2920);
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
    // etc/XQFT.g:203:2: fLWORExpr : ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle ;
    public final void fLWORExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:203:33: ( ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle )
            // etc/XQFT.g:203:35: ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:203:35: ( forClause | letClause )+
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
            	    // etc/XQFT.g:203:36: forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr2985);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:203:48: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr2989);
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

            // etc/XQFT.g:203:60: ( whereClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:203:60: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr2993);
                    whereClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:203:73: ( orderByClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER||LA42_0==STABLE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:203:73: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr2996);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr2999); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr3001);
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
    // etc/XQFT.g:205:3: forClause : FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* ;
    public final void forClause() throws RecognitionException {
        try {
            // etc/XQFT.g:205:34: ( FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* )
            // etc/XQFT.g:205:36: FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            {
            match(input,FOR,FOLLOW_FOR_in_forClause3033); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3035); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause3037);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:205:57: ( typeDeclaration )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // etc/XQFT.g:205:57: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClause3039);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:205:74: ( positionalVar )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:205:74: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClause3042);
                    positionalVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:205:89: ( ftScoreVar )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SCORE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:205:89: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClause3045);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause3048); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause3050);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:206:14: ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMASi) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // etc/XQFT.g:206:15: COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause3067); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3069); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause3071);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:206:40: ( typeDeclaration )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==AS) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // etc/XQFT.g:206:40: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause3073);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:206:57: ( positionalVar )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==AT) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // etc/XQFT.g:206:57: positionalVar
            	            {
            	            pushFollow(FOLLOW_positionalVar_in_forClause3076);
            	            positionalVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:206:72: ( ftScoreVar )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==SCORE) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // etc/XQFT.g:206:72: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause3079);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause3082); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause3084);
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
    // etc/XQFT.g:207:4: varName returns [String name] : qn= qName ;
    public final String varName() throws RecognitionException {
        String name = null;

        String qn = null;


        try {
            // etc/XQFT.g:207:43: (qn= qName )
            // etc/XQFT.g:207:45: qn= qName
            {
            pushFollow(FOLLOW_qName_in_varName3111);
            qn=qName();
            _fsp--;
            if (failed) return name;
            if ( backtracking==0 ) {
              name = qn;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end varName


    // $ANTLR start positionalVar
    // etc/XQFT.g:210:4: positionalVar : AT DOLLARSi varName ;
    public final void positionalVar() throws RecognitionException {
        try {
            // etc/XQFT.g:210:35: ( AT DOLLARSi varName )
            // etc/XQFT.g:210:37: AT DOLLARSi varName
            {
            match(input,AT,FOLLOW_AT_in_positionalVar3142); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar3144); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar3146);
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
    // etc/XQFT.g:212:4: ftScoreVar : SCORE DOLLARSi varName ;
    public final void ftScoreVar() throws RecognitionException {
        try {
            // etc/XQFT.g:212:35: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:212:37: SCORE DOLLARSi varName
            {
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar3177); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar3179); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar3181);
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
    // etc/XQFT.g:216:3: letClause : LET varBinding ( COMMASi varBinding )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:216:39: ( LET varBinding ( COMMASi varBinding )* )
            // etc/XQFT.g:216:41: LET varBinding ( COMMASi varBinding )*
            {
            match(input,LET,FOLLOW_LET_in_letClause3231); if (failed) return ;
            pushFollow(FOLLOW_varBinding_in_letClause3233);
            varBinding();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:216:56: ( COMMASi varBinding )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMASi) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // etc/XQFT.g:216:57: COMMASi varBinding
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause3236); if (failed) return ;
            	    pushFollow(FOLLOW_varBinding_in_letClause3238);
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
    // etc/XQFT.g:217:3: varBinding : ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle ;
    public final void varBinding() throws RecognitionException {
        String v1 = null;

        String v2 = null;


        try {
            // etc/XQFT.g:217:14: ( ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle )
            // etc/XQFT.g:218:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle
            {
            // etc/XQFT.g:218:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==DOLLARSi) ) {
                alt52=1;
            }
            else if ( (LA52_0==SCORE) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("218:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // etc/XQFT.g:218:5: DOLLARSi v1= varName ( typeDeclaration )?
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3253); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3257);
                    v1=varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:218:25: ( typeDeclaration )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==AS) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // etc/XQFT.g:218:25: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_varBinding3259);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:218:96: SCORE DOLLARSi v2= varName
                    {
                    match(input,SCORE,FOLLOW_SCORE_in_varBinding3266); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3268); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3272);
                    v2=varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varBinding3289); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_varBinding3291);
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
    // etc/XQFT.g:229:3: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:229:33: ( WHERE exprSingle )
            // etc/XQFT.g:229:35: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause3329); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause3331);
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
    // etc/XQFT.g:232:3: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:232:33: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList )
            // etc/XQFT.g:232:35: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:232:35: ( ORDER BY | STABLE ORDER BY )
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
                    new NoViableAltException("232:35: ( ORDER BY | STABLE ORDER BY )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // etc/XQFT.g:232:36: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3363); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3365); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:232:47: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause3369); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3371); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3373); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause3376);
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
    // etc/XQFT.g:233:4: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:233:34: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:233:36: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList3402);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:233:46: ( COMMASi orderSpec )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMASi) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // etc/XQFT.g:233:47: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList3405); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList3407);
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
    // etc/XQFT.g:234:5: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:234:35: ( exprSingle orderModifier )
            // etc/XQFT.g:234:37: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec3440);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec3442);
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
    // etc/XQFT.g:236:6: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:236:36: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:236:38: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:236:38: ( ASCENDING | DESCENDING )?
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3471);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:236:64: ( EMPTY ( GREATEST | LEAST ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EMPTY) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // etc/XQFT.g:236:65: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier3481); if (failed) return ;
                    if ( (input.LA(1)>=GREATEST && input.LA(1)<=LEAST) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3483);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:236:92: ( COLLATION uriLiteral )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLLATION) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:236:93: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier3494); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier3496);
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
    // etc/XQFT.g:242:2: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:242:33: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:242:35: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( (input.LA(1)>=SOME && input.LA(1)<=EVERY) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr3531);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3539); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr3541);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:242:67: ( typeDeclaration )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:242:67: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3543);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr3546); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3548);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:243:13: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMASi) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // etc/XQFT.g:243:14: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr3564); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3566); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr3568);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:243:39: ( typeDeclaration )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==AS) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // etc/XQFT.g:243:39: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3570);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr3573); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3575);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr3579); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3581);
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
    // etc/XQFT.g:247:2: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:247:33: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:247:35: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr3614); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr3616); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr3618);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr3620); if (failed) return ;
            // etc/XQFT.g:247:65: ( caseClause )+
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
            	    // etc/XQFT.g:247:65: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr3622);
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

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr3638); if (failed) return ;
            // etc/XQFT.g:248:21: ( DOLLARSi varName )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==DOLLARSi) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // etc/XQFT.g:248:22: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr3641); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr3643);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr3647); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr3649);
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
    // etc/XQFT.g:251:3: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:251:34: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:251:36: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause3680); if (failed) return ;
            // etc/XQFT.g:251:41: ( DOLLARSi varName AS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==DOLLARSi) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // etc/XQFT.g:251:42: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause3683); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause3685);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause3687); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause3691);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause3693); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause3695);
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
    // etc/XQFT.g:259:2: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:259:33: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:259:35: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr3736); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr3738); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr3740);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr3742); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr3744); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3746);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr3748); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr3750);
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
    // etc/XQFT.g:265:2: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:265:33: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:265:35: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr3791);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:265:43: ( OR andExpr )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==OR) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // etc/XQFT.g:265:45: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr3795); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr3797);
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
    // etc/XQFT.g:266:3: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:266:34: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:266:36: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr3832);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:266:51: ( AND comparisonExpr )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==AND) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // etc/XQFT.g:266:53: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr3836); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr3838);
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
    // etc/XQFT.g:272:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:272:32: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:272:34: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3872);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:272:49: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EQSi||(LA67_0>=EQ && LA67_0<=NODEAFTERSi)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // etc/XQFT.g:272:51: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:272:51: ( valueComp | generalComp | nodeComp )
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
                            new NoViableAltException("272:51: ( valueComp | generalComp | nodeComp )", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // etc/XQFT.g:272:52: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr3877);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:272:64: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr3881);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:272:78: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr3885);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3888);
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
    // etc/XQFT.g:275:2: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:275:33: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:275:35: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr3917);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:275:45: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==FTCONTAINS) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:275:47: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr3921); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr3923);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:275:70: ( ftIgnoreOption )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==WITHOUT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // etc/XQFT.g:275:70: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr3925);
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
    // etc/XQFT.g:277:3: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:277:34: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:277:36: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr3961);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:277:49: ( TO additiveExpr )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==TO) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // etc/XQFT.g:277:51: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr3965); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr3967);
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
    // etc/XQFT.g:278:4: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:278:35: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:278:37: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr3998);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:278:56: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==PLUSSi||LA71_0==MINUSSi) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // etc/XQFT.g:278:58: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( input.LA(1)==PLUSSi||input.LA(1)==MINUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr4002);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4010);
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
    // etc/XQFT.g:279:5: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:279:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:279:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4036);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:279:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==STARSi||(LA72_0>=DIV && LA72_0<=MOD)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // etc/XQFT.g:279:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==STARSi||(input.LA(1)>=DIV && input.LA(1)<=MOD) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr4040);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4056);
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
    // etc/XQFT.g:280:6: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:280:37: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:280:39: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4092);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:280:59: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=UNION && LA73_0<=PIPESi)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // etc/XQFT.g:280:61: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( (input.LA(1)>=UNION && input.LA(1)<=PIPESi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr4096);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4104);
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
    // etc/XQFT.g:281:7: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:281:38: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:281:40: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4131);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:281:55: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=INTERSECT && LA74_0<=EXCEPT)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // etc/XQFT.g:281:57: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( (input.LA(1)>=INTERSECT && input.LA(1)<=EXCEPT) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr4135);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4143);
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
    // etc/XQFT.g:282:8: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:282:39: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:282:41: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr4176);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:282:51: ( INSTANCE OF sequenceType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==INSTANCE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // etc/XQFT.g:282:53: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr4180); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr4182); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr4184);
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
    // etc/XQFT.g:283:9: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:283:40: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:283:42: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr4223);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:283:55: ( TREAT AS sequenceType )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==TREAT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // etc/XQFT.g:283:57: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr4227); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr4229); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr4231);
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
    // etc/XQFT.g:284:10: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:284:41: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:284:43: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr4268);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:284:52: ( CASTABLE AS singleType )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==CASTABLE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:284:54: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr4272); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr4274); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr4276);
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
    // etc/XQFT.g:285:11: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:285:42: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:285:44: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr4318);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:285:54: ( CAST AS singleType )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==CAST) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:285:56: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr4322); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr4324); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr4326);
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
    // etc/XQFT.g:286:12: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:286:43: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:286:45: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:286:45: ( MINUSSi | PLUSSi )*
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
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr4368);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr4377);
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
    // etc/XQFT.g:288:12: singleType : atomicType ( QUESTIONSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:288:43: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:288:45: atomicType ( QUESTIONSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType4416);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:288:56: ( QUESTIONSi )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==QUESTIONSi) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:288:56: QUESTIONSi
                    {
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType4418); if (failed) return ;

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
    // etc/XQFT.g:289:13: atomicType : qName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:289:44: ( qName )
            // etc/XQFT.g:289:46: qName
            {
            pushFollow(FOLLOW_qName_in_atomicType4458);
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
    // etc/XQFT.g:297:3: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:297:34: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:297:36: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption4494); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption4496); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption4498);
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
    // etc/XQFT.g:301:2: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:301:33: ( EQ | NE | LT | LE | GT | GE )
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
    // etc/XQFT.g:304:2: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:304:33: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
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
    // etc/XQFT.g:307:2: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:307:33: ( IS | NODEBEFORESi | NODEAFTERSi )
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
    // etc/XQFT.g:311:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:311:32: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:311:34: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection4676);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:311:39: ( ftPosFilter )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==ORDERED||LA81_0==AT||LA81_0==WINDOW||(LA81_0>=DISTANCE && LA81_0<=DIFFERENT)||LA81_0==ENTIRE) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // etc/XQFT.g:311:39: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection4678);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // etc/XQFT.g:311:52: ( WEIGHT rangeExpr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==WEIGHT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:311:53: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection4682); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection4684);
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
    // etc/XQFT.g:314:2: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:314:33: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:314:35: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr4722);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:314:41: ( FTOR ftAnd )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==FTOR) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // etc/XQFT.g:314:43: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr4726); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr4728);
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
    // etc/XQFT.g:315:3: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:315:34: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:315:36: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd4765);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:315:46: ( FTAND ftMildNot )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==FTAND) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // etc/XQFT.g:315:48: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd4769); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd4771);
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
    // etc/XQFT.g:316:4: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:316:35: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:316:37: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4805);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:316:48: ( NOT IN ftUnaryNot )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==NOT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // etc/XQFT.g:316:50: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot4809); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot4811); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4813);
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
    // etc/XQFT.g:317:5: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:317:36: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:317:38: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:317:38: ( FTNOT )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==FTNOT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:317:39: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot4848); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4852);
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
    // etc/XQFT.g:318:6: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:318:37: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:318:39: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions4874);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:318:49: ( ftMatchOptions )?
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
                    // etc/XQFT.g:318:49: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4876);
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
    // etc/XQFT.g:320:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:320:38: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
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
                    new NoViableAltException("320:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:320:40: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary4917);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:320:48: ( ftTimes )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==OCCURS) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // etc/XQFT.g:320:48: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary4919);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:321:19: LPARSi ftSelection RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary4941); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary4943);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary4945); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:322:19: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary4966);
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
    // etc/XQFT.g:324:8: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:324:39: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:324:41: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords5020);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:324:54: ( ftAnyallOption )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==ANY||LA90_0==ALL||LA90_0==PHRASE) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // etc/XQFT.g:324:54: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords5022);
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
    // etc/XQFT.g:325:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:325:40: ( literal | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("325:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:325:42: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue5056);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:325:52: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:325:52: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:325:53: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue5061); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue5063);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue5065); if (failed) return ;

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
    // etc/XQFT.g:326:10: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:326:41: ( numericLiteral | StringLiteral )
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
                    new NoViableAltException("326:10: literal : ( numericLiteral | StringLiteral );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:326:43: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal5105);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:326:60: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal5109); if (failed) return ;

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
    // etc/XQFT.g:327:11: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:327:42: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
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
    // etc/XQFT.g:328:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:328:40: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
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
                    new NoViableAltException("328:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // etc/XQFT.g:328:42: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:328:42: ( ANY ( WORD )? )
                    // etc/XQFT.g:328:43: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption5182); if (failed) return ;
                    // etc/XQFT.g:328:47: ( WORD )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==WORD) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // etc/XQFT.g:328:47: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption5184); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:328:56: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:328:56: ( ALL ( WORDS )? )
                    // etc/XQFT.g:328:57: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption5191); if (failed) return ;
                    // etc/XQFT.g:328:61: ( WORDS )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==WORDS) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // etc/XQFT.g:328:61: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption5193); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:328:71: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption5199); if (failed) return ;

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
    // etc/XQFT.g:329:8: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:329:39: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:329:41: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes5236); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes5238);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes5240); if (failed) return ;

            }

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
    // etc/XQFT.g:330:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:330:40: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
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
                        new NoViableAltException("330:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 2, input);

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
                    new NoViableAltException("330:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // etc/XQFT.g:330:42: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:330:42: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:330:43: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange5279); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5281);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:331:39: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:331:39: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:331:40: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5323); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange5325); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5327);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:332:40: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:332:40: ( AT MOST additiveExpr )
                    // etc/XQFT.g:332:41: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5370); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange5372); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5374);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:333:45: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:333:45: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:333:46: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange5422); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5424);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange5426); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5428);
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
    // etc/XQFT.g:336:8: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:336:39: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:336:41: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            // etc/XQFT.g:336:41: ( pragma )+
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
            	    // etc/XQFT.g:336:41: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection5455);
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

            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection5458); if (failed) return ;
            // etc/XQFT.g:336:58: ( ftSelection )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==StringLiteral||LA98_0==LPARSi||LA98_0==LBRACESi||(LA98_0>=FTNOT && LA98_0<=DoubleLiteral)||LA98_0==LPRAGSi) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:336:58: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection5460);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection5463); if (failed) return ;

            }

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
    // etc/XQFT.g:337:9: pragma : LPRAGSi qName ( PragmaContents )? RPRAGSi ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:337:40: ( LPRAGSi qName ( PragmaContents )? RPRAGSi )
            // etc/XQFT.g:337:42: LPRAGSi qName ( PragmaContents )? RPRAGSi
            {
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma5502); if (failed) return ;
            pushFollow(FOLLOW_qName_in_pragma5504);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:337:56: ( PragmaContents )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==PragmaContents) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // etc/XQFT.g:337:56: PragmaContents
                    {
                    match(input,PragmaContents,FOLLOW_PragmaContents_in_pragma5506); if (failed) return ;

                    }
                    break;

            }

            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma5509); if (failed) return ;

            }

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
    // etc/XQFT.g:344:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:344:33: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
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
                    new NoViableAltException("344:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // etc/XQFT.g:344:35: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter5564);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:344:45: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter5568);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:344:56: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter5572);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:344:69: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter5576);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:344:79: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter5580);
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
    // etc/XQFT.g:345:3: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:345:34: ( ORDERED )
            // etc/XQFT.g:345:36: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder5612); if (failed) return ;

            }

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
    // etc/XQFT.g:346:3: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:346:34: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:346:36: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow5643); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow5645);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow5647);
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
    // etc/XQFT.g:348:4: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:348:35: ( WORDS | SENTENCES | PARAGRAPHS )
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
    // etc/XQFT.g:349:3: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:349:34: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:349:36: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance5720); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance5722);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance5724);
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
    // etc/XQFT.g:356:3: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:356:34: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:356:36: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( (input.LA(1)>=SAME && input.LA(1)<=DIFFERENT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope5762);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope5770);
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
    // etc/XQFT.g:357:4: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:357:35: ( SENTENCE | PARAGRAPH )
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
    // etc/XQFT.g:358:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:358:34: ( AT START | AT END | ENTIRE CONTENT )
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
                        new NoViableAltException("358:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA101_0==ENTIRE) ) {
                alt101=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("358:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:358:36: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5836); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent5838); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:358:47: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent5842); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent5844); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:358:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent5848); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent5850); if (failed) return ;

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
    // etc/XQFT.g:367:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:367:32: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
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
                case THESAURUS:
                    {
                    alt102=3;
                    }
                    break;
                case DEFAULT:
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
                        new NoViableAltException("367:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 2, input);

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
                        new NoViableAltException("367:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 3, input);

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
                    new NoViableAltException("367:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:367:34: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption5888);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:368:37: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption5926);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:369:37: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption5964);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:370:37: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption6002);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:371:37: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption6040);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:372:37: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption6078);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:373:37: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption6116);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:374:37: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption6154);
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
    // etc/XQFT.g:377:2: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:377:33: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:377:35: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption6279); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption6281); if (failed) return ;

            }

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
    // etc/XQFT.g:380:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:380:33: ( WITH WILDCARDS | WITHOUT WILDCARDS )
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
                    new NoViableAltException("380:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:380:35: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption6307); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6309); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:380:52: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption6313); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6315); if (failed) return ;

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
    // etc/XQFT.g:383:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:383:31: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS )
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
                            new NoViableAltException("383:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("383:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA107_0==WITHOUT) ) {
                alt107=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("383:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // etc/XQFT.g:383:33: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6338); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6340); if (failed) return ;
                    // etc/XQFT.g:383:48: ( ftThesaurusID | DEFAULT )
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
                            new NoViableAltException("383:48: ( ftThesaurusID | DEFAULT )", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // etc/XQFT.g:383:49: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6343);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:383:65: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6347); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:384:14: WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6363); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6365); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption6367); if (failed) return ;
                    // etc/XQFT.g:384:36: ( ftThesaurusID | DEFAULT )
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
                            new NoViableAltException("384:36: ( ftThesaurusID | DEFAULT )", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // etc/XQFT.g:384:37: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6370);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:384:53: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6374); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:384:62: ( COMMASi ftThesaurusID )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==COMMASi) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // etc/XQFT.g:384:63: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption6378); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6380);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption6384); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:385:38: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption6423); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6425); if (failed) return ;

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
    // etc/XQFT.g:387:3: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:387:34: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:387:36: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID6487); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID6489);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:387:50: ( RELATIONSHIP StringLiteral )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RELATIONSHIP) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // etc/XQFT.g:387:51: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID6492); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID6494); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:387:80: ( ftRange LEVELS )?
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
                    // etc/XQFT.g:387:81: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID6499);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID6501); if (failed) return ;

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
    // etc/XQFT.g:397:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:397:33: ( WITH STEMMING | WITHOUT STEMMING )
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
                    new NoViableAltException("397:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:397:35: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption6546); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6548); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:397:51: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption6552); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6554); if (failed) return ;

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
    // etc/XQFT.g:400:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:400:33: ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE )
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
                        new NoViableAltException("400:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 1, input);

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
                    new NoViableAltException("400:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:400:35: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6584); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption6586); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:401:38: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption6625); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption6627); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:402:38: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption6666); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:403:38: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption6705); if (failed) return ;

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
    // etc/XQFT.g:407:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:407:33: ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==DIACRITICS) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==SENSITIVE) ) {
                    alt112=2;
                }
                else if ( (LA112_1==INSENSITIVE) ) {
                    alt112=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("407:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("407:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:407:35: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption6867); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption6869); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:408:14: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption6884); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption6886); if (failed) return ;

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
    // etc/XQFT.g:411:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:411:33: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
            int alt115=3;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==WITH) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==STOP) ) {
                    alt115=1;
                }
                else if ( (LA115_1==DEFAULT) ) {
                    alt115=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("411:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA115_0==WITHOUT) ) {
                alt115=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("411:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:411:35: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption6942); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption6944); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption6946); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption6948);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:411:63: ( ftInclExclStringLiteral )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==UNION||LA113_0==EXCEPT) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // etc/XQFT.g:411:63: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption6950);
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
                    // etc/XQFT.g:412:14: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption6966); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption6968); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption6970); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:413:38: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7009); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption7011); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7013); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7015); if (failed) return ;
                    // etc/XQFT.g:413:62: ( ftInclExclStringLiteral )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==UNION||LA114_0==EXCEPT) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // etc/XQFT.g:413:62: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7017);
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
    // etc/XQFT.g:415:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:415:34: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
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
                    new NoViableAltException("415:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // etc/XQFT.g:415:36: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:415:36: ( AT uriLiteral )
                    // etc/XQFT.g:415:37: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList7083); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList7085);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:416:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList7102); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7104); if (failed) return ;
                    // etc/XQFT.g:416:36: ( COMMASi StringLiteral )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMASi) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // etc/XQFT.g:416:37: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList7107); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7109); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList7113); if (failed) return ;

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
    // etc/XQFT.g:418:3: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:418:34: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:418:36: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==UNION||input.LA(1)==EXCEPT ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral7130);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7138);
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
    // etc/XQFT.g:421:2: ftExtensionOption : OPTION qName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:421:33: ( OPTION qName StringLiteral )
            // etc/XQFT.g:421:35: OPTION qName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption7172); if (failed) return ;
            pushFollow(FOLLOW_qName_in_ftExtensionOption7174);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption7176); if (failed) return ;

            }

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
    // etc/XQFT.g:425:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:425:32: ( validateExpr | pathExpr | extensionExpr )
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
            case LCOMMENTSi:
            case LPISi:
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
                    new NoViableAltException("425:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // etc/XQFT.g:425:34: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr7208);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:425:49: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr7212);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:425:60: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr7216);
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
    // etc/XQFT.g:428:2: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:428:33: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:428:35: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr7244); if (failed) return ;
            // etc/XQFT.g:428:44: ( validationMode )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=LAX && LA119_0<=STRICT)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:428:44: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr7246);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr7249); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr7251);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr7253); if (failed) return ;

            }

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
    // etc/XQFT.g:429:3: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:429:34: ( LAX | STRICT )
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
    // etc/XQFT.g:434:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:434:33: ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr )
            int alt120=4;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:434:35: ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr
                    {
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr7329); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7331);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:435:14: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7355); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7357);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:436:14: SLASHSi
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7372); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:437:14: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7387);
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
    // etc/XQFT.g:438:3: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:438:34: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:438:36: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr7410);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:438:45: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( ((LA121_0>=DBLSLASHSi && LA121_0<=SLASHSi)) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // etc/XQFT.g:438:46: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    if ( (input.LA(1)>=DBLSLASHSi && input.LA(1)<=SLASHSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr7413);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr7421);
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
    // etc/XQFT.g:439:4: stepExpr : ( filterExpr | axisStep );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:439:35: ( filterExpr | axisStep )
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
            case LCOMMENTSi:
            case LPISi:
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

                        if ( (LA122_10==EOF||LA122_10==SEMICOLONSi||(LA122_10>=EQSi && LA122_10<=COMMASi)||LA122_10==DEFAULT||LA122_10==COLLATION||(LA122_10>=ORDER && LA122_10<=EMPTY)||LA122_10==RPARSi||LA122_10==RBRACSi||LA122_10==STARSi||(LA122_10>=PLUSSi && LA122_10<=FOR)||(LA122_10>=LET && LA122_10<=WHERE)||(LA122_10>=STABLE && LA122_10<=DESCENDING)||LA122_10==SATISFIES||LA122_10==CASE||(LA122_10>=ELSE && LA122_10<=INSTANCE)||(LA122_10>=TREAT && LA122_10<=WITHOUT)||(LA122_10>=EQ && LA122_10<=NODEAFTERSi)||LA122_10==WORDS||LA122_10==TIMES||(LA122_10>=SENTENCES && LA122_10<=PARAGRAPHS)||LA122_10==LEVELS||(LA122_10>=DBLSLASHSi && LA122_10<=SLASHSi)||(LA122_10>=LBRACKSi && LA122_10<=RBRACKSi)) ) {
                            alt122=2;
                        }
                        else if ( (LA122_10==LPARSi) ) {
                            alt122=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case LPARSi:
                    {
                    alt122=1;
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
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 2, input);

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
                        new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 3, input);

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
                        new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 4, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA122_5 = input.LA(2);

                if ( (LA122_5==LPARSi) ) {
                    alt122=2;
                }
                else if ( (LA122_5==LBRACESi) ) {
                    alt122=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 5, input);

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
                        new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 6, input);

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
                        new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 7, input);

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
                    new NoViableAltException("439:4: stepExpr : ( filterExpr | axisStep );", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:439:37: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7457);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:439:50: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7461);
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
    // etc/XQFT.g:441:4: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:441:35: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:441:37: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:441:37: ( reverseStep | forwardStep )
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
                    new NoViableAltException("441:37: ( reverseStep | forwardStep )", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:441:38: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7495);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:441:52: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7499);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7502);
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
    // etc/XQFT.g:443:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:443:36: ( reverseAxis nodeTest | abbrevReverseStep )
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
                    new NoViableAltException("443:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:443:38: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7536);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7538);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:443:61: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7542);
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
    // etc/XQFT.g:444:6: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:444:37: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:444:39: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            if ( (input.LA(1)>=PARENT && input.LA(1)<=ANCESTOR_OR_SELF) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis7573);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis7593); if (failed) return ;

            }

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
    // etc/XQFT.g:445:6: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:445:37: ( kindTest | nameTest )
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
                    new NoViableAltException("445:6: nodeTest : ( kindTest | nameTest );", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:445:39: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest7627);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:445:50: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest7631);
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
    // etc/XQFT.g:447:7: nameTest : ( qName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:447:38: ( qName | wildcard )
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
                            new NoViableAltException("447:7: nameTest : ( qName | wildcard );", 126, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA126_1==EOF||LA126_1==SEMICOLONSi||(LA126_1>=EQSi && LA126_1<=COMMASi)||LA126_1==DEFAULT||LA126_1==COLLATION||(LA126_1>=ORDER && LA126_1<=EMPTY)||LA126_1==RPARSi||LA126_1==RBRACSi||LA126_1==STARSi||(LA126_1>=PLUSSi && LA126_1<=FOR)||(LA126_1>=LET && LA126_1<=WHERE)||(LA126_1>=STABLE && LA126_1<=DESCENDING)||LA126_1==SATISFIES||LA126_1==CASE||(LA126_1>=ELSE && LA126_1<=INSTANCE)||(LA126_1>=TREAT && LA126_1<=WITHOUT)||(LA126_1>=EQ && LA126_1<=NODEAFTERSi)||LA126_1==WORDS||LA126_1==TIMES||(LA126_1>=SENTENCES && LA126_1<=PARAGRAPHS)||LA126_1==LEVELS||(LA126_1>=DBLSLASHSi && LA126_1<=SLASHSi)||(LA126_1>=LBRACKSi && LA126_1<=RBRACKSi)) ) {
                    alt126=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("447:7: nameTest : ( qName | wildcard );", 126, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA126_0==STARSi) ) {
                alt126=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("447:7: nameTest : ( qName | wildcard );", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:447:40: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest7667);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:447:48: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest7671);
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
    // etc/XQFT.g:448:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:448:39: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi )
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
                        new NoViableAltException("448:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA127_0==NCName) ) {
                alt127=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("448:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:448:41: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7717); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7719); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard7721); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:449:20: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7746); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:450:44: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard7791); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7793); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7795); if (failed) return ;

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
    // etc/XQFT.g:451:21: abbrevReverseStep : DOTDOTSi ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:451:52: ( DOTDOTSi )
            // etc/XQFT.g:451:54: DOTDOTSi
            {
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep7836); if (failed) return ;

            }

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
    // etc/XQFT.g:453:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:453:48: ( forwardAxis nodeTest | abbrevForwardStep )
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
                        new NoViableAltException("453:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 1, input);

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
                    new NoViableAltException("453:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // etc/XQFT.g:453:50: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep7899);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep7901);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:453:73: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep7905);
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
    // etc/XQFT.g:454:18: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:454:49: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:454:51: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            if ( input.LA(1)==ATTRIBUTE||(input.LA(1)>=CHILD && input.LA(1)<=FOLLOWING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis7952);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis8008); if (failed) return ;

            }

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
    // etc/XQFT.g:462:6: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:462:37: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:462:39: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:462:39: ( ATSi )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ATSi) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:462:39: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep8039); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep8042);
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
    // etc/XQFT.g:464:17: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:464:48: ( ( predicate )* )
            // etc/XQFT.g:464:50: ( predicate )*
            {
            // etc/XQFT.g:464:50: ( predicate )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==LBRACKSi) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // etc/XQFT.g:464:50: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList8116);
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
    // etc/XQFT.g:465:18: predicate : LBRACKSi expr RBRACKSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:465:49: ( LBRACKSi expr RBRACKSi )
            // etc/XQFT.g:465:51: LBRACKSi expr RBRACKSi
            {
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate8176); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate8178);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate8180); if (failed) return ;

            }

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
    // etc/XQFT.g:470:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:470:36: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:470:38: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            // etc/XQFT.g:470:38: ( pragma )+
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
            	    // etc/XQFT.g:470:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr8220);
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

            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr8223); if (failed) return ;
            // etc/XQFT.g:470:55: ( expr )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==StringLiteral||LA132_0==NCName||LA132_0==ELEMENT||(LA132_0>=ORDERED && LA132_0<=UNORDERED)||LA132_0==DOLLARSi||LA132_0==LPARSi||LA132_0==DOCUMENT_NODE||(LA132_0>=STARSi && LA132_0<=PLUSSi)||LA132_0==FOR||LA132_0==LET||(LA132_0>=SOME && LA132_0<=EVERY)||LA132_0==TYPESWITCH||LA132_0==IF||LA132_0==MINUSSi||LA132_0==LTSi||(LA132_0>=IntegerLiteral && LA132_0<=DoubleLiteral)||LA132_0==LPRAGSi||LA132_0==VALIDATE||(LA132_0>=DBLSLASHSi && LA132_0<=ANCESTOR_OR_SELF)||(LA132_0>=DOTDOTSi && LA132_0<=ATSi)||LA132_0==DOTSi||LA132_0==LCOMMENTSi||LA132_0==LPISi||LA132_0==DOCUMENT) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // etc/XQFT.g:470:55: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr8225);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr8228); if (failed) return ;

            }

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
    // etc/XQFT.g:478:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:478:32: ( primaryExpr predicateList )
            // etc/XQFT.g:478:34: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr8263);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr8265);
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
    // etc/XQFT.g:481:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:481:33: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
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
            case LCOMMENTSi:
            case LPISi:
            case DOCUMENT:
                {
                alt133=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("481:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // etc/XQFT.g:481:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr8294);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:482:14: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr8310);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:483:14: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr8326);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:484:14: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr8342);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:485:14: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr8358);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:486:14: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr8374);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:487:14: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr8390);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:488:14: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr8406);
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
    // etc/XQFT.g:492:3: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:492:34: ( DOLLARSi varName )
            // etc/XQFT.g:492:36: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef8444); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef8446);
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
    // etc/XQFT.g:494:3: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:494:34: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:494:36: LPARSi ( expr )? RPARSi
            {
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr8469); if (failed) return ;
            // etc/XQFT.g:494:43: ( expr )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==StringLiteral||LA134_0==NCName||LA134_0==ELEMENT||(LA134_0>=ORDERED && LA134_0<=UNORDERED)||LA134_0==DOLLARSi||LA134_0==LPARSi||LA134_0==DOCUMENT_NODE||(LA134_0>=STARSi && LA134_0<=PLUSSi)||LA134_0==FOR||LA134_0==LET||(LA134_0>=SOME && LA134_0<=EVERY)||LA134_0==TYPESWITCH||LA134_0==IF||LA134_0==MINUSSi||LA134_0==LTSi||(LA134_0>=IntegerLiteral && LA134_0<=DoubleLiteral)||LA134_0==LPRAGSi||LA134_0==VALIDATE||(LA134_0>=DBLSLASHSi && LA134_0<=ANCESTOR_OR_SELF)||(LA134_0>=DOTDOTSi && LA134_0<=ATSi)||LA134_0==DOTSi||LA134_0==LCOMMENTSi||LA134_0==LPISi||LA134_0==DOCUMENT) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:494:43: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr8471);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr8474); if (failed) return ;

            }

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
    // etc/XQFT.g:497:3: contextItemExpr : DOTSi ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:497:34: ( DOTSi )
            // etc/XQFT.g:497:36: DOTSi
            {
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr8500); if (failed) return ;

            }

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
    // etc/XQFT.g:498:3: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:498:34: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi )
            // etc/XQFT.g:498:36: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall8527);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall8529); if (failed) return ;
            // etc/XQFT.g:499:14: ( exprSingle ( COMMASi exprSingle )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==StringLiteral||LA136_0==NCName||LA136_0==ELEMENT||(LA136_0>=ORDERED && LA136_0<=UNORDERED)||LA136_0==DOLLARSi||LA136_0==LPARSi||LA136_0==DOCUMENT_NODE||(LA136_0>=STARSi && LA136_0<=PLUSSi)||LA136_0==FOR||LA136_0==LET||(LA136_0>=SOME && LA136_0<=EVERY)||LA136_0==TYPESWITCH||LA136_0==IF||LA136_0==MINUSSi||LA136_0==LTSi||(LA136_0>=IntegerLiteral && LA136_0<=DoubleLiteral)||LA136_0==LPRAGSi||LA136_0==VALIDATE||(LA136_0>=DBLSLASHSi && LA136_0<=ANCESTOR_OR_SELF)||(LA136_0>=DOTDOTSi && LA136_0<=ATSi)||LA136_0==DOTSi||LA136_0==LCOMMENTSi||LA136_0==LPISi||LA136_0==DOCUMENT) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // etc/XQFT.g:499:15: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall8547);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:499:26: ( COMMASi exprSingle )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==COMMASi) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // etc/XQFT.g:499:27: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall8550); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall8552);
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

            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall8572); if (failed) return ;

            }

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
    // etc/XQFT.g:502:3: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:502:34: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:502:36: ORDERED LBRACESi expr RBRACSi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr8602); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr8604); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr8606);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr8608); if (failed) return ;

            }

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
    // etc/XQFT.g:505:3: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:505:34: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:505:36: UNORDERED LBRACESi expr RBRACSi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr8636); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr8638); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr8640);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr8642); if (failed) return ;

            }

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
    // etc/XQFT.g:508:3: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:508:34: ( directConstructor | computedConstructor )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LTSi||LA137_0==LCOMMENTSi||LA137_0==LPISi) ) {
                alt137=1;
            }
            else if ( (LA137_0==ELEMENT||LA137_0==ATTRIBUTE||(LA137_0>=PROCESSING_INSTRUCTION && LA137_0<=TEXT)||LA137_0==DOCUMENT) ) {
                alt137=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("508:3: constructor : ( directConstructor | computedConstructor );", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:508:36: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor8673);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:508:56: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor8677);
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
    // etc/XQFT.g:511:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:511:35: ( dirElemConstructor | dirCommentConstructor | dirPIConstructor )
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
            case LPISi:
                {
                alt138=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("511:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // etc/XQFT.g:511:37: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor8717);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:512:40: dirCommentConstructor
                    {
                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor8758);
                    dirCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:513:28: dirPIConstructor
                    {
                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor8787);
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
    // etc/XQFT.g:515:14: dirElemConstructor : LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:515:45: ( LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) )
            // etc/XQFT.g:515:47: LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            {
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor8845); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.IN_TAG;
            }
            pushFollow(FOLLOW_qName_in_dirElemConstructor8874);
            qName();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor8876);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:517:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==RSELFTERMSi) ) {
                alt140=1;
            }
            else if ( (LA140_0==GTSi) ) {
                alt140=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("517:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // etc/XQFT.g:517:25: RSELFTERMSi
                    {
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor8906); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:518:26: GTSi ( dirElemContent )* LENDTAGSi qName GTSi
                    {
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor8935); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_ELEMENT;
                    }
                    // etc/XQFT.g:519:26: ( dirElemContent )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==LBRACESi||LA139_0==LTSi||(LA139_0>=ElementContent && LA139_0<=LCDATASi)||LA139_0==LCOMMENTSi||LA139_0==LPISi) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // etc/XQFT.g:519:26: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor8964);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor8993); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }
                    pushFollow(FOLLOW_qName_in_dirElemConstructor9023);
                    qName();
                    _fsp--;
                    if (failed) return ;
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor9052); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
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
    // $ANTLR end dirElemConstructor


    // $ANTLR start dirAttributeList
    // etc/XQFT.g:524:15: dirAttributeList : ( qName EQSi dirAttributeValue )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:524:46: ( ( qName EQSi dirAttributeValue )* )
            // etc/XQFT.g:524:48: ( qName EQSi dirAttributeValue )*
            {
            // etc/XQFT.g:524:48: ( qName EQSi dirAttributeValue )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==NCName) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // etc/XQFT.g:524:49: qName EQSi dirAttributeValue
            	    {
            	    pushFollow(FOLLOW_qName_in_dirAttributeList9119);
            	    qName();
            	    _fsp--;
            	    if (failed) return ;
            	    match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList9121); if (failed) return ;
            	    pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList9123);
            	    dirAttributeValue();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop141;
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
    // etc/XQFT.g:525:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:525:47: ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==QUOTSi) ) {
                alt144=1;
            }
            else if ( (LA144_0==APOSSi) ) {
                alt144=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("525:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:525:49: QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi
                    {
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9161); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_QUOT_ATTRIBUTE;
                    }
                    // etc/XQFT.g:526:27: ( QuotAttributeContent | xmlEnclosedExpr )*
                    loop142:
                    do {
                        int alt142=3;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==QuotAttributeContent) ) {
                            alt142=1;
                        }
                        else if ( (LA142_0==LBRACESi) ) {
                            alt142=2;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // etc/XQFT.g:526:28: QuotAttributeContent
                    	    {
                    	    match(input,QuotAttributeContent,FOLLOW_QuotAttributeContent_in_dirAttributeValue9192); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:526:51: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9196);
                    	    xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9228); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:528:31: APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi
                    {
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9262); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_APOS_ATTRIBUTE;
                    }
                    // etc/XQFT.g:529:30: ( AposAttributeContent | xmlEnclosedExpr )*
                    loop143:
                    do {
                        int alt143=3;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==AposAttributeContent) ) {
                            alt143=1;
                        }
                        else if ( (LA143_0==LBRACESi) ) {
                            alt143=2;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // etc/XQFT.g:529:31: AposAttributeContent
                    	    {
                    	    match(input,AposAttributeContent,FOLLOW_AposAttributeContent_in_dirAttributeValue9296); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:529:54: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9300);
                    	    xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9335); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
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
    // $ANTLR end dirAttributeValue


    // $ANTLR start xmlEnclosedExpr
    // etc/XQFT.g:531:14: xmlEnclosedExpr : LBRACESi expr RBRACSi ;
    public final void xmlEnclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:531:48: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:531:50: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_xmlEnclosedExpr9376); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.DEFAULT;
            }
            pushFollow(FOLLOW_expr_in_xmlEnclosedExpr9404);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_xmlEnclosedExpr9432); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.state = lexer.stack.pop();
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
    // $ANTLR end xmlEnclosedExpr


    // $ANTLR start dirElemContent
    // etc/XQFT.g:537:6: dirElemContent : ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:537:37: ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr )
            int alt145=4;
            switch ( input.LA(1) ) {
            case LTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt145=1;
                }
                break;
            case LCDATASi:
                {
                alt145=2;
                }
                break;
            case ElementContent:
                {
                alt145=3;
                }
                break;
            case LBRACESi:
                {
                alt145=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("537:6: dirElemContent : ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr );", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // etc/XQFT.g:537:39: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent9465);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:537:59: cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent9469);
                    cDataSection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:537:74: ElementContent
                    {
                    match(input,ElementContent,FOLLOW_ElementContent_in_dirElemContent9473); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:537:91: xmlEnclosedExpr
                    {
                    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirElemContent9477);
                    xmlEnclosedExpr();
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
    // $ANTLR end dirElemContent


    // $ANTLR start cDataSection
    // etc/XQFT.g:539:7: cDataSection : LCDATASi CDataContents RCDATASi ;
    public final void cDataSection() throws RecognitionException {
        try {
            // etc/XQFT.g:539:26: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:539:28: LCDATASi CDataContents RCDATASi
            {
            match(input,LCDATASi,FOLLOW_LCDATASi_in_cDataSection9497); if (failed) return ;
            match(input,CDataContents,FOLLOW_CDataContents_in_cDataSection9499); if (failed) return ;
            match(input,RCDATASi,FOLLOW_RCDATASi_in_cDataSection9501); if (failed) return ;

            }

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
    // etc/XQFT.g:544:5: dirCommentConstructor : LCOMMENTSi DirCommentContent RCOMMENTSi ;
    public final void dirCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:544:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:544:33: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            match(input,LCOMMENTSi,FOLLOW_LCOMMENTSi_in_dirCommentConstructor9524); if (failed) return ;
            match(input,DirCommentContent,FOLLOW_DirCommentContent_in_dirCommentConstructor9526); if (failed) return ;
            match(input,RCOMMENTSi,FOLLOW_RCOMMENTSi_in_dirCommentConstructor9528); if (failed) return ;

            }

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


    // $ANTLR start dirPIConstructor
    // etc/XQFT.g:546:5: dirPIConstructor : LPISi PiTarget ( DirPiContents )? RPISi ;
    public final void dirPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:546:27: ( LPISi PiTarget ( DirPiContents )? RPISi )
            // etc/XQFT.g:546:29: LPISi PiTarget ( DirPiContents )? RPISi
            {
            match(input,LPISi,FOLLOW_LPISi_in_dirPIConstructor9549); if (failed) return ;
            match(input,PiTarget,FOLLOW_PiTarget_in_dirPIConstructor9551); if (failed) return ;
            // etc/XQFT.g:546:44: ( DirPiContents )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==DirPiContents) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // etc/XQFT.g:546:44: DirPiContents
                    {
                    match(input,DirPiContents,FOLLOW_DirPiContents_in_dirPIConstructor9553); if (failed) return ;

                    }
                    break;

            }

            match(input,RPISi,FOLLOW_RPISi_in_dirPIConstructor9556); if (failed) return ;

            }

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


    // $ANTLR start computedConstructor
    // etc/XQFT.g:548:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:548:35: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt147=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt147=1;
                }
                break;
            case ELEMENT:
                {
                alt147=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt147=3;
                }
                break;
            case TEXT:
                {
                alt147=4;
                }
                break;
            case COMMENT:
                {
                alt147=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt147=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("548:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // etc/XQFT.g:548:37: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor9582);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:549:40: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor9623);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:550:40: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor9664);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:551:40: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor9705);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:552:40: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor9746);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:553:40: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor9787);
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
    // etc/XQFT.g:555:5: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:555:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:555:38: DOCUMENT LBRACESi expr RBRACSi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor9815); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor9817); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor9819);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor9821); if (failed) return ;

            }

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
    // etc/XQFT.g:559:5: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:559:36: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:559:38: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor9850); if (failed) return ;
            // etc/XQFT.g:559:46: ( qName | LBRACESi expr RBRACSi )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==NCName) ) {
                alt148=1;
            }
            else if ( (LA148_0==LBRACESi) ) {
                alt148=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("559:46: ( qName | LBRACESi expr RBRACSi )", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // etc/XQFT.g:559:47: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor9853);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:559:55: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9857); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor9859);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9861); if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9880); if (failed) return ;
            // etc/XQFT.g:560:25: ( contentExpr )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==StringLiteral||LA149_0==NCName||LA149_0==ELEMENT||(LA149_0>=ORDERED && LA149_0<=UNORDERED)||LA149_0==DOLLARSi||LA149_0==LPARSi||LA149_0==DOCUMENT_NODE||(LA149_0>=STARSi && LA149_0<=PLUSSi)||LA149_0==FOR||LA149_0==LET||(LA149_0>=SOME && LA149_0<=EVERY)||LA149_0==TYPESWITCH||LA149_0==IF||LA149_0==MINUSSi||LA149_0==LTSi||(LA149_0>=IntegerLiteral && LA149_0<=DoubleLiteral)||LA149_0==LPRAGSi||LA149_0==VALIDATE||(LA149_0>=DBLSLASHSi && LA149_0<=ANCESTOR_OR_SELF)||(LA149_0>=DOTDOTSi && LA149_0<=ATSi)||LA149_0==DOTSi||LA149_0==LCOMMENTSi||LA149_0==LPISi||LA149_0==DOCUMENT) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:560:25: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor9882);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9885); if (failed) return ;

            }

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
    // etc/XQFT.g:563:6: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:563:37: ( expr )
            // etc/XQFT.g:563:39: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr9918);
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
    // etc/XQFT.g:567:5: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:567:36: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:567:38: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor9963); if (failed) return ;
            // etc/XQFT.g:567:48: ( qName | ( LBRACESi expr RBRACSi ) )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==NCName) ) {
                alt150=1;
            }
            else if ( (LA150_0==LBRACESi) ) {
                alt150=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("567:48: ( qName | ( LBRACESi expr RBRACSi ) )", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:567:49: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor9966);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:567:57: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:567:57: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:567:58: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9971); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9973);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9975); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9995); if (failed) return ;
            // etc/XQFT.g:568:25: ( expr )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==StringLiteral||LA151_0==NCName||LA151_0==ELEMENT||(LA151_0>=ORDERED && LA151_0<=UNORDERED)||LA151_0==DOLLARSi||LA151_0==LPARSi||LA151_0==DOCUMENT_NODE||(LA151_0>=STARSi && LA151_0<=PLUSSi)||LA151_0==FOR||LA151_0==LET||(LA151_0>=SOME && LA151_0<=EVERY)||LA151_0==TYPESWITCH||LA151_0==IF||LA151_0==MINUSSi||LA151_0==LTSi||(LA151_0>=IntegerLiteral && LA151_0<=DoubleLiteral)||LA151_0==LPRAGSi||LA151_0==VALIDATE||(LA151_0>=DBLSLASHSi && LA151_0<=ANCESTOR_OR_SELF)||(LA151_0>=DOTDOTSi && LA151_0<=ATSi)||LA151_0==DOTSi||LA151_0==LCOMMENTSi||LA151_0==LPISi||LA151_0==DOCUMENT) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:568:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9997);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor10000); if (failed) return ;

            }

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
    // etc/XQFT.g:570:5: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:570:36: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:570:38: TEXT LBRACESi expr RBRACSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor10036); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor10038); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor10040);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor10042); if (failed) return ;

            }

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
    // etc/XQFT.g:572:5: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:572:36: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:572:38: COMMENT LBRACESi expr RBRACSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor10066); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor10068); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor10070);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor10072); if (failed) return ;

            }

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
    // etc/XQFT.g:574:5: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:574:36: ( PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:574:38: PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10101); if (failed) return ;
            // etc/XQFT.g:574:61: ( NCName | ( LBRACESi expr RBRACSi ) )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==NCName) ) {
                alt152=1;
            }
            else if ( (LA152_0==LBRACESi) ) {
                alt152=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("574:61: ( NCName | ( LBRACESi expr RBRACSi ) )", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // etc/XQFT.g:574:62: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor10104); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:574:71: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:574:71: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:574:72: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10109); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor10111);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10113); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10133); if (failed) return ;
            // etc/XQFT.g:575:25: ( expr )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==StringLiteral||LA153_0==NCName||LA153_0==ELEMENT||(LA153_0>=ORDERED && LA153_0<=UNORDERED)||LA153_0==DOLLARSi||LA153_0==LPARSi||LA153_0==DOCUMENT_NODE||(LA153_0>=STARSi && LA153_0<=PLUSSi)||LA153_0==FOR||LA153_0==LET||(LA153_0>=SOME && LA153_0<=EVERY)||LA153_0==TYPESWITCH||LA153_0==IF||LA153_0==MINUSSi||LA153_0==LTSi||(LA153_0>=IntegerLiteral && LA153_0<=DoubleLiteral)||LA153_0==LPRAGSi||LA153_0==VALIDATE||(LA153_0>=DBLSLASHSi && LA153_0<=ANCESTOR_OR_SELF)||(LA153_0>=DOTDOTSi && LA153_0<=ATSi)||LA153_0==DOTSi||LA153_0==LCOMMENTSi||LA153_0==LPISi||LA153_0==DOCUMENT) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // etc/XQFT.g:575:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor10135);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10138); if (failed) return ;

            }

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
        // etc/XQFT.g:152:34: ( itemType occurrenceIndicator )
        // etc/XQFT.g:152:35: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred11675);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred11677);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:434:35: ( DBLSLASHSi relativePathExpr )
        // etc/XQFT.g:434:36: DBLSLASHSi relativePathExpr
        {
        match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_synpred27323); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred27325);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:435:14: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:435:15: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred37348); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred37350);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:448:41: ( STARSi COLONSi NCName )
        // etc/XQFT.g:448:42: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred47708); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred47710); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred47712); if (failed) return ;

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
        "\u01c2\uffff";
    static final String DFA27_eofS =
        "\13\uffff\1\31\14\uffff\1\104\1\uffff\1\104\3\uffff\1\31\2\uffff"+
        "\1\31\2\uffff\1\31\3\uffff\6\31\2\uffff\1\31\52\uffff\1\31\7\uffff"+
        "\1\31\1\uffff\1\31\50\uffff\1\104\30\uffff\1\104\1\uffff\1\104\31"+
        "\uffff\1\104\1\uffff\2\104\u00fb\uffff";
    static final String DFA27_minS =
        "\1\13\12\54\1\10\1\uffff\1\20\4\13\1\6\4\55\1\13\1\6\1\uffff\1\6"+
        "\1\uffff\2\54\1\10\2\15\1\10\2\15\1\10\2\52\1\55\6\10\3\6\50\uffff"+
        "\1\0\2\6\7\13\1\10\1\13\1\10\1\6\1\56\1\6\3\0\1\13\3\0\2\56\1\13"+
        "\1\u00c0\1\u00c3\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9\1\13\4"+
        "\54\1\0\1\13\11\uffff\1\10\25\uffff\4\6\1\uffff\1\6\31\uffff\1\10"+
        "\3\6\2\15\1\55\1\52\1\15\1\52\1\15\1\52\2\55\1\0\1\56\75\0\21\uffff"+
        "\72\0\1\uffff\2\0\11\uffff\133\0";
    static final String DFA27_maxS =
        "\1\75\12\54\1\u00b3\1\uffff\1\67\2\66\2\13\5\55\1\13\1\u00c6\1\uffff"+
        "\1\u00c6\1\uffff\2\54\1\u00b3\2\55\1\u00b3\2\55\1\u00b3\3\55\6\u00b3"+
        "\3\u00c6\50\uffff\1\0\2\u00c6\1\66\6\13\1\u00b3\1\13\1\u00b3\1\u00c6"+
        "\1\u00a1\1\u00c6\3\0\1\13\3\0\2\56\1\13\1\u00c0\1\u00c3\2\56\1\u00a9"+
        "\3\56\1\u00a9\1\0\1\u00a9\1\75\4\54\1\0\1\13\11\uffff\1\u00b5\25"+
        "\uffff\4\u00c6\1\uffff\1\u00c6\31\uffff\1\u00b5\3\u00c6\5\55\1\65"+
        "\4\55\1\0\1\56\75\0\21\uffff\72\0\1\uffff\2\0\11\uffff\133\0";
    static final String DFA27_acceptS =
        "\14\uffff\1\3\14\uffff\1\2\1\uffff\1\1\25\uffff\50\1\54\uffff\11"+
        "\1\1\uffff\25\1\4\uffff\1\1\1\uffff\31\1\115\uffff\21\1\72\uffff"+
        "\1\1\2\uffff\11\1\133\uffff";
    static final String DFA27_specialS =
        "\13\uffff\1\17\14\uffff\1\41\1\uffff\1\31\3\uffff\1\40\2\uffff\1"+
        "\13\2\uffff\1\20\3\uffff\1\26\1\2\1\1\1\0\1\27\1\37\1\uffff\1\21"+
        "\1\12\50\uffff\1\23\1\22\1\14\7\uffff\1\16\1\uffff\1\30\3\uffff"+
        "\1\34\1\3\1\4\1\uffff\1\7\1\15\1\6\14\uffff\1\5\6\uffff\1\11\12"+
        "\uffff\1\32\30\uffff\1\24\1\uffff\1\35\31\uffff\1\33\1\uffff\1\25"+
        "\1\36\12\uffff\1\10\u00f0\uffff}>";
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
            "\1\31\1\uffff\1\107\2\uffff\1\31\1\100\1\63\1\uffff\1\121\1"+
            "\31\4\uffff\1\117\3\uffff\2\31\1\111\1\116\10\uffff\1\65\1\uffff"+
            "\1\31\1\61\1\62\2\uffff\1\31\1\64\1\70\1\105\4\uffff\1\31\1"+
            "\uffff\1\60\7\31\1\56\1\71\1\113\1\67\1\66\1\114\1\110\1\uffff"+
            "\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff\1\123\1\103"+
            "\1\102\1\76\1\75\1\56\3\74\2\73\2\72\1\130\4\uffff\1\124\1\uffff"+
            "\6\77\1\100\1\57\3\100\3\101\5\uffff\3\31\3\uffff\1\126\2\uffff"+
            "\1\125\3\uffff\1\31\3\uffff\2\126\15\uffff\1\127\7\uffff\1\31"+
            "\2\uffff\7\31\1\uffff\10\31\1\uffff\1\106\1\31\12\uffff\1\31"+
            "\2\uffff\1\31\3\uffff\1\31",
            "",
            "\1\31\1\uffff\1\107\2\uffff\1\31\1\100\1\63\1\uffff\1\121\1"+
            "\31\4\uffff\1\117\3\uffff\2\31\1\111\1\116\10\uffff\1\65\1\uffff"+
            "\1\31\1\61\1\62\2\uffff\1\31\1\64\1\70\1\105\4\uffff\1\31\1"+
            "\uffff\1\133\7\31\1\131\1\71\1\113\1\67\1\66\1\114\1\110\1\uffff"+
            "\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff\1\123\1\103"+
            "\1\102\1\76\1\75\1\131\3\74\2\73\2\72\1\130\4\uffff\1\124\1"+
            "\uffff\6\77\1\100\1\132\3\100\3\101\5\uffff\3\31\3\uffff\1\126"+
            "\2\uffff\1\125\3\uffff\1\31\3\uffff\2\126\15\uffff\1\127\7\uffff"+
            "\1\31\2\uffff\7\31\1\uffff\10\31\1\uffff\1\106\1\31\12\uffff"+
            "\1\31\2\uffff\1\31\3\uffff\1\31",
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
            "\1\153\4\uffff\1\157\4\uffff\1\166\10\uffff\1\160\1\161\14\uffff"+
            "\1\154\4\uffff\1\155\7\uffff\1\177\1\uffff\1\u0083\1\u0080\1"+
            "\167\1\u0081\1\172\1\171\1\170\1\u0082\1\146\26\uffff\1\146"+
            "\25\uffff\1\162\13\uffff\3\152\12\uffff\1\u0084\32\uffff\1\147"+
            "\2\uffff\1\150\1\151\5\173\1\uffff\1\174\6\175\1\176\2\uffff"+
            "\1\156\12\uffff\1\163\2\uffff\1\164\3\uffff\1\165",
            "\1\u008a\4\uffff\1\u008e\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008b\4\uffff\1\u008c\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0085\26\uffff\1\u0085\25\uffff\1\u0091\13\uffff\3\u0089"+
            "\12\uffff\1\u00a3\32\uffff\1\u0086\2\uffff\1\u0087\1\u0088\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008d\12\uffff"+
            "\1\u0092\2\uffff\1\u0093\3\uffff\1\u0094",
            "\1\u00ab\1\uffff\1\31\2\uffff\1\u00af\2\31\1\uffff\1\31\1\u00b5"+
            "\4\uffff\1\31\3\uffff\1\u00b0\1\u00b1\2\31\12\uffff\1\u00ac"+
            "\2\uffff\1\31\1\uffff\1\u00ad\1\31\1\uffff\1\31\4\uffff\1\u00be"+
            "\1\uffff\1\u00a7\1\u00bf\1\u00b6\1\u00c0\1\u00b9\1\u00b8\1\u00b7"+
            "\1\u00c1\1\u00a5\2\31\2\uffff\2\31\1\uffff\3\31\2\uffff\1\31"+
            "\1\uffff\1\31\2\uffff\5\31\1\u00a5\10\31\1\uffff\4\31\1\uffff"+
            "\7\31\1\u00a6\6\31\5\uffff\3\u00aa\3\uffff\1\31\2\uffff\1\31"+
            "\3\uffff\1\u00c2\3\uffff\2\31\15\uffff\1\31\7\uffff\1\u00a8"+
            "\2\uffff\1\u00a4\1\u00a9\5\u00ba\1\uffff\1\u00bb\6\u00bc\1\u00bd"+
            "\2\31\1\u00ae\12\uffff\1\u00b2\2\uffff\1\u00b3\3\uffff\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\u008a\4\uffff\1\u00c3\4\uffff\1\u0095\10\uffff\1\u008f\1"+
            "\u0090\14\uffff\1\u008b\4\uffff\1\u008c\7\uffff\1\u009e\1\uffff"+
            "\1\u00a2\1\u009f\1\u0096\1\u00a0\1\u0099\1\u0098\1\u0097\1\u00a1"+
            "\1\u0085\26\uffff\1\u0085\25\uffff\1\u0091\13\uffff\3\u0089"+
            "\12\uffff\1\u00a3\32\uffff\1\u0086\2\uffff\1\u0087\1\u0088\5"+
            "\u009a\1\uffff\1\u009b\6\u009c\1\u009d\2\uffff\1\u008d\12\uffff"+
            "\1\u0092\2\uffff\1\u0093\3\uffff\1\u0094",
            "\1\u00ab\1\uffff\1\31\2\uffff\1\u00af\2\31\1\uffff\1\31\1\u00b5"+
            "\4\uffff\1\31\3\uffff\1\u00b0\1\u00b1\2\31\12\uffff\1\u00ac"+
            "\2\uffff\1\31\1\uffff\1\u00ad\1\31\1\uffff\1\31\4\uffff\1\u00be"+
            "\1\uffff\1\u00c5\1\u00bf\1\u00b6\1\u00c0\1\u00b9\1\u00b8\1\u00b7"+
            "\1\u00c1\1\u00a5\2\31\2\uffff\2\31\1\uffff\3\31\2\uffff\1\31"+
            "\1\uffff\1\31\2\uffff\5\31\1\u00a5\10\31\1\uffff\4\31\1\uffff"+
            "\7\31\1\u00a6\6\31\5\uffff\3\u00aa\3\uffff\1\31\2\uffff\1\31"+
            "\3\uffff\1\u00c2\3\uffff\2\31\15\uffff\1\31\7\uffff\1\u00a8"+
            "\2\uffff\1\u00c4\1\u00c6\5\u00ba\1\uffff\1\u00bb\6\u00bc\1\u00bd"+
            "\2\31\1\u00ae\12\uffff\1\u00b2\2\uffff\1\u00b3\3\uffff\1\u00b4",
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
            "\1\153\4\uffff\1\157\4\uffff\1\166\10\uffff\1\160\1\161\14\uffff"+
            "\1\154\4\uffff\1\u00d1\7\uffff\1\177\1\uffff\1\u0083\1\u0080"+
            "\1\167\1\u0081\1\172\1\171\1\170\1\u0082\1\146\26\uffff\1\146"+
            "\25\uffff\1\162\13\uffff\3\152\12\uffff\1\u0084\32\uffff\1\147"+
            "\2\uffff\1\150\1\151\5\173\1\uffff\1\174\6\175\1\176\2\uffff"+
            "\1\156\12\uffff\1\163\2\uffff\1\164\3\uffff\1\165",
            "\1\u00d3\161\uffff\2\u00d2",
            "\1\u00d5\4\uffff\1\u00d9\4\uffff\1\u00e0\10\uffff\1\u00da\1"+
            "\u00db\14\uffff\1\u00d6\4\uffff\1\u00d7\7\uffff\1\u00e9\1\uffff"+
            "\1\u00ed\1\u00ea\1\u00e1\1\u00eb\1\u00e4\1\u00e3\1\u00e2\1\u00ec"+
            "\55\uffff\1\u00dc\13\uffff\3\u00d4\52\uffff\5\u00e5\1\uffff"+
            "\1\u00e6\6\u00e7\1\u00e8\2\uffff\1\u00d8\12\uffff\1\u00dd\2"+
            "\uffff\1\u00de\3\uffff\1\u00df",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00ee",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f6\40\uffff\1\u00f5\1\uffff\1\u00f7",
            "\1\u00fa\40\uffff\1\u00f9\1\uffff\1\u00fb\172\uffff\1\u00f8",
            "\1\u00fd\1\uffff\1\u00fc",
            "\1\u00ff\1\uffff\1\u00fe",
            "\1\u0101\40\uffff\1\u0100\1\uffff\1\u0102",
            "\1\u0103",
            "\1\uffff",
            "\1\u00f8",
            "\1\u0109\4\uffff\1\u0104\43\uffff\1\177\1\uffff\1\u0083\1\u0080"+
            "\1\u0105\1\u0081\1\u0106\1\u0107\1\u0108\1\u0082",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\uffff",
            "\1\u010e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\2\uffff\1\31\1\uffff\1\u011d\1\uffff\1\121\5\uffff\1"+
            "\117\5\uffff\1\111\1\116\15\uffff\1\u010f\1\uffff\1\u0110\1"+
            "\u011f\1\uffff\1\u011e\6\uffff\1\u0119\7\uffff\1\u011a\1\u0120"+
            "\1\113\2\uffff\1\114\1\110\1\uffff\1\112\2\115\2\uffff\1\120"+
            "\1\uffff\1\122\2\uffff\1\123\1\103\1\102\1\u011c\1\u011b\1\u011a"+
            "\3\u0119\2\u0118\2\u0117\1\u0116\1\uffff\1\u0115\1\u0114\1\u0113"+
            "\13\uffff\1\31\64\uffff\2\u0112\16\uffff\1\u0111\1\106\1\uffff"+
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0122\4\uffff\1\u0126\4\uffff\1\u012d\10\uffff\1\u0127\1"+
            "\u0128\14\uffff\1\u0123\4\uffff\1\u0124\7\uffff\1\u0136\1\uffff"+
            "\1\u013a\1\u0137\1\u012e\1\u0138\1\u0131\1\u0130\1\u012f\1\u0139"+
            "\55\uffff\1\u0129\13\uffff\3\u0121\52\uffff\5\u0132\1\uffff"+
            "\1\u0133\6\u0134\1\u0135\2\uffff\1\u0125\12\uffff\1\u012a\2"+
            "\uffff\1\u012b\3\uffff\1\u012c",
            "\1\u0140\4\uffff\1\u0144\4\uffff\1\u014b\10\uffff\1\u0145\1"+
            "\u0146\14\uffff\1\u0141\4\uffff\1\u0142\7\uffff\1\u0154\1\uffff"+
            "\1\u0158\1\u0155\1\u014c\1\u0156\1\u014f\1\u014e\1\u014d\1\u0157"+
            "\1\u013b\26\uffff\1\u013b\25\uffff\1\u0147\13\uffff\3\u013f"+
            "\12\uffff\1\u0159\32\uffff\1\u013c\2\uffff\1\u013d\1\u013e\5"+
            "\u0150\1\uffff\1\u0151\6\u0152\1\u0153\2\uffff\1\u0143\12\uffff"+
            "\1\u0148\2\uffff\1\u0149\3\uffff\1\u014a",
            "\1\31\4\uffff\1\u015a\4\uffff\1\31\10\uffff\2\31\14\uffff\1"+
            "\31\4\uffff\1\31\7\uffff\1\31\1\uffff\11\31\26\uffff\1\31\25"+
            "\uffff\1\31\13\uffff\3\31\12\uffff\1\31\32\uffff\1\31\2\uffff"+
            "\7\31\1\uffff\10\31\2\uffff\1\31\12\uffff\1\31\2\uffff\1\31"+
            "\3\uffff\1\31",
            "\1\31\1\uffff\1\107\2\uffff\1\31\1\100\1\u011d\1\uffff\1\121"+
            "\1\31\4\uffff\1\117\3\uffff\2\31\1\111\1\116\12\uffff\1\31\2"+
            "\uffff\1\u015b\1\uffff\1\31\1\u0165\1\uffff\1\105\4\uffff\1"+
            "\31\1\uffff\1\60\7\31\1\56\1\u0120\1\113\2\uffff\1\114\1\110"+
            "\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff\1\123"+
            "\1\103\1\102\1\76\1\75\1\56\3\74\2\u0164\2\u0163\1\u0162\1\uffff"+
            "\1\u0161\1\u0160\1\u015f\1\124\1\uffff\6\77\1\100\1\57\3\100"+
            "\3\101\5\uffff\3\31\3\uffff\1\126\2\uffff\1\125\3\uffff\1\31"+
            "\3\uffff\2\126\15\uffff\1\127\7\uffff\1\31\2\uffff\1\u015c\1"+
            "\u015d\5\31\1\uffff\10\31\1\u015e\1\106\1\31\12\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31",
            "",
            "\1\u016a\1\uffff\1\107\2\uffff\1\u016e\1\100\1\u011d\1\uffff"+
            "\1\121\1\u0174\4\uffff\1\117\3\uffff\1\u016f\1\u0170\1\111\1"+
            "\116\12\uffff\1\u016b\4\uffff\1\u016c\1\u0165\1\uffff\1\105"+
            "\4\uffff\1\u017d\1\uffff\1\u0168\1\u017e\1\u0175\1\u017f\1\u0178"+
            "\1\u0177\1\u0176\1\u0180\1\u0166\1\u0120\1\113\2\uffff\1\114"+
            "\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff"+
            "\1\123\1\103\1\102\1\76\1\75\1\u0166\3\74\2\u0164\2\u0163\1"+
            "\u0162\1\uffff\1\u0161\1\u0160\1\u015f\1\124\1\uffff\6\77\1"+
            "\100\1\u0167\3\100\3\101\5\uffff\3\u0169\3\uffff\1\126\2\uffff"+
            "\1\125\7\uffff\2\126\15\uffff\1\127\14\uffff\5\u0179\1\uffff"+
            "\1\u017a\6\u017b\1\u017c\1\uffff\1\106\1\u016d\12\uffff\1\u0171"+
            "\2\uffff\1\u0172\3\uffff\1\u0173",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\2\uffff\1\31\1\uffff\1\u011d\1\uffff\1\121\5\uffff\1"+
            "\117\5\uffff\1\111\1\116\15\uffff\1\u0181\1\uffff\1\u0110\1"+
            "\u011f\1\uffff\1\u011e\6\uffff\1\u0119\7\uffff\1\u011a\1\u0120"+
            "\1\113\2\uffff\1\114\1\110\1\uffff\1\112\2\115\2\uffff\1\120"+
            "\1\uffff\1\122\2\uffff\1\123\1\103\1\102\1\u011c\1\u011b\1\u011a"+
            "\3\u0119\2\u0118\2\u0117\1\u0116\1\uffff\1\u0115\1\u0114\1\u0113"+
            "\13\uffff\1\31\64\uffff\2\u0112\16\uffff\1\u0111\1\106\1\uffff"+
            "\1\31",
            "\1\u0183\4\uffff\1\u0187\4\uffff\1\u018e\10\uffff\1\u0188\1"+
            "\u0189\14\uffff\1\u0184\4\uffff\1\u0185\7\uffff\1\u0197\1\uffff"+
            "\1\u019b\1\u0198\1\u018f\1\u0199\1\u0192\1\u0191\1\u0190\1\u019a"+
            "\55\uffff\1\u018a\13\uffff\3\u0182\52\uffff\5\u0193\1\uffff"+
            "\1\u0194\6\u0195\1\u0196\2\uffff\1\u0186\12\uffff\1\u018b\2"+
            "\uffff\1\u018c\3\uffff\1\u018d",
            "\1\31\1\uffff\1\107\2\uffff\1\31\1\100\1\u011d\1\uffff\1\121"+
            "\1\31\4\uffff\1\117\3\uffff\2\31\1\111\1\116\12\uffff\1\31\2"+
            "\uffff\1\u015b\1\uffff\1\31\1\u0165\1\uffff\1\105\4\uffff\1"+
            "\31\1\uffff\1\u01a0\7\31\1\u019c\1\u0120\1\113\2\uffff\1\114"+
            "\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff"+
            "\1\123\1\103\1\102\1\76\1\75\1\u019c\3\74\2\u0164\2\u0163\1"+
            "\u0162\1\uffff\1\u0161\1\u0160\1\u015f\1\124\1\uffff\6\77\1"+
            "\100\1\u019f\3\100\3\101\5\uffff\3\31\3\uffff\1\126\2\uffff"+
            "\1\125\3\uffff\1\31\3\uffff\2\126\15\uffff\1\127\7\uffff\1\31"+
            "\2\uffff\1\u019d\1\u019e\5\31\1\uffff\10\31\1\u015e\1\106\1"+
            "\31\12\uffff\1\31\2\uffff\1\31\3\uffff\1\31",
            "\1\u01a4\1\uffff\1\107\2\uffff\1\u01a8\1\100\1\u011d\1\uffff"+
            "\1\121\1\u01ae\4\uffff\1\117\3\uffff\1\u01a9\1\u01aa\1\111\1"+
            "\116\12\uffff\1\u01a5\4\uffff\1\u01a6\1\u0165\1\uffff\1\105"+
            "\4\uffff\1\u01b7\1\uffff\1\u01a2\1\u01b8\1\u01af\1\u01b9\1\u01b2"+
            "\1\u01b1\1\u01b0\1\u01ba\1\u0166\1\u0120\1\113\2\uffff\1\114"+
            "\1\110\1\uffff\1\112\2\115\2\uffff\1\120\1\uffff\1\122\2\uffff"+
            "\1\123\1\103\1\102\1\76\1\75\1\u0166\3\74\2\u0164\2\u0163\1"+
            "\u0162\1\uffff\1\u0161\1\u0160\1\u015f\1\124\1\uffff\6\77\1"+
            "\100\1\u01a1\3\100\3\101\5\uffff\3\u01a3\3\uffff\1\126\2\uffff"+
            "\1\125\7\uffff\2\126\15\uffff\1\127\14\uffff\5\u01b3\1\uffff"+
            "\1\u01b4\6\u01b5\1\u01b6\1\uffff\1\106\1\u01a7\12\uffff\1\u01ab"+
            "\2\uffff\1\u01ac\3\uffff\1\u01ad",
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
            "\1\uffff",
            "\1\u00d3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "152:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
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
                    case 1 : 
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
                    case 2 : 
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
                    case 3 : 
                        int LA27_106 = input.LA(1);

                         
                        int index27_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_106);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_107 = input.LA(1);

                         
                        int index27_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_107);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_124 = input.LA(1);

                         
                        int index27_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_124);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_111 = input.LA(1);

                         
                        int index27_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_111);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_109 = input.LA(1);

                         
                        int index27_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_109);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_209 = input.LA(1);

                         
                        int index27_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 358;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_209);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_131 = input.LA(1);

                         
                        int index27_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_131);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_48 = input.LA(1);

                         
                        int index27_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_48==EOF||LA27_48==SEMICOLONSi||(LA27_48>=EQSi && LA27_48<=COMMASi)||LA27_48==DEFAULT||LA27_48==COLLATION||(LA27_48>=ORDER && LA27_48<=EMPTY)||LA27_48==COLONSi||LA27_48==RPARSi||LA27_48==RBRACSi||(LA27_48>=RETURN && LA27_48<=FOR)||(LA27_48>=LET && LA27_48<=WHERE)||(LA27_48>=STABLE && LA27_48<=DESCENDING)||LA27_48==SATISFIES||LA27_48==CASE||(LA27_48>=ELSE && LA27_48<=TO)||(LA27_48>=DIV && LA27_48<=INSTANCE)||(LA27_48>=TREAT && LA27_48<=WITHOUT)||(LA27_48>=EQ && LA27_48<=NEQSi)||(LA27_48>=LTOREQSi && LA27_48<=NODEAFTERSi)||LA27_48==WORDS||LA27_48==TIMES||(LA27_48>=SENTENCES && LA27_48<=PARAGRAPHS)||LA27_48==LEVELS||(LA27_48>=LBRACKSi && LA27_48<=RBRACKSi)) ) {s = 25;}

                        else if ( (LA27_48==DBLSLASHSi) ) {s = 164;}

                        else if ( (LA27_48==PLUSSi||LA27_48==MINUSSi) ) {s = 165;}

                        else if ( (LA27_48==LTSi) ) {s = 166;}

                        else if ( (LA27_48==STARSi) ) {s = 167;}

                        else if ( (LA27_48==VALIDATE) && (synpred1())) {s = 168;}

                        else if ( (LA27_48==SLASHSi) ) {s = 169;}

                        else if ( ((LA27_48>=IntegerLiteral && LA27_48<=DoubleLiteral)) && (synpred1())) {s = 170;}

                        else if ( (LA27_48==StringLiteral) && (synpred1())) {s = 171;}

                        else if ( (LA27_48==DOLLARSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_48==LPARSi) && (synpred1())) {s = 173;}

                        else if ( (LA27_48==DOTSi) && (synpred1())) {s = 174;}

                        else if ( (LA27_48==NCName) && (synpred1())) {s = 175;}

                        else if ( (LA27_48==ORDERED) && (synpred1())) {s = 176;}

                        else if ( (LA27_48==UNORDERED) && (synpred1())) {s = 177;}

                        else if ( (LA27_48==LCOMMENTSi) && (synpred1())) {s = 178;}

                        else if ( (LA27_48==LPISi) && (synpred1())) {s = 179;}

                        else if ( (LA27_48==DOCUMENT) && (synpred1())) {s = 180;}

                        else if ( (LA27_48==ELEMENT) && (synpred1())) {s = 181;}

                        else if ( (LA27_48==ATTRIBUTE) && (synpred1())) {s = 182;}

                        else if ( (LA27_48==TEXT) && (synpred1())) {s = 183;}

                        else if ( (LA27_48==COMMENT) && (synpred1())) {s = 184;}

                        else if ( (LA27_48==PROCESSING_INSTRUCTION) && (synpred1())) {s = 185;}

                        else if ( ((LA27_48>=PARENT && LA27_48<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 186;}

                        else if ( (LA27_48==DOTDOTSi) && (synpred1())) {s = 187;}

                        else if ( ((LA27_48>=CHILD && LA27_48<=FOLLOWING)) && (synpred1())) {s = 188;}

                        else if ( (LA27_48==ATSi) && (synpred1())) {s = 189;}

                        else if ( (LA27_48==DOCUMENT_NODE) && (synpred1())) {s = 190;}

                        else if ( (LA27_48==SCHEMAELEMENT) && (synpred1())) {s = 191;}

                        else if ( (LA27_48==SCHEMAATTRIBUTE) && (synpred1())) {s = 192;}

                        else if ( (LA27_48==NODE) && (synpred1())) {s = 193;}

                        else if ( (LA27_48==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_48);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
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
                    case 12 : 
                        int LA27_91 = input.LA(1);

                         
                        int index27_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_91==EOF||LA27_91==SEMICOLONSi||(LA27_91>=EQSi && LA27_91<=COMMASi)||LA27_91==DEFAULT||LA27_91==COLLATION||(LA27_91>=ORDER && LA27_91<=EMPTY)||LA27_91==COLONSi||LA27_91==RPARSi||LA27_91==RBRACSi||(LA27_91>=RETURN && LA27_91<=FOR)||(LA27_91>=LET && LA27_91<=WHERE)||(LA27_91>=STABLE && LA27_91<=DESCENDING)||LA27_91==SATISFIES||LA27_91==CASE||(LA27_91>=ELSE && LA27_91<=TO)||(LA27_91>=DIV && LA27_91<=INSTANCE)||(LA27_91>=TREAT && LA27_91<=WITHOUT)||(LA27_91>=EQ && LA27_91<=NEQSi)||(LA27_91>=LTOREQSi && LA27_91<=NODEAFTERSi)||LA27_91==WORDS||LA27_91==TIMES||(LA27_91>=SENTENCES && LA27_91<=PARAGRAPHS)||LA27_91==LEVELS||(LA27_91>=LBRACKSi && LA27_91<=RBRACKSi)) ) {s = 25;}

                        else if ( (LA27_91==DBLSLASHSi) ) {s = 196;}

                        else if ( (LA27_91==STARSi) ) {s = 197;}

                        else if ( (LA27_91==LTSi) ) {s = 166;}

                        else if ( (LA27_91==PLUSSi||LA27_91==MINUSSi) ) {s = 165;}

                        else if ( (LA27_91==VALIDATE) && (synpred1())) {s = 168;}

                        else if ( (LA27_91==SLASHSi) ) {s = 198;}

                        else if ( ((LA27_91>=IntegerLiteral && LA27_91<=DoubleLiteral)) && (synpred1())) {s = 170;}

                        else if ( (LA27_91==StringLiteral) && (synpred1())) {s = 171;}

                        else if ( (LA27_91==DOLLARSi) && (synpred1())) {s = 172;}

                        else if ( (LA27_91==LPARSi) && (synpred1())) {s = 173;}

                        else if ( (LA27_91==DOTSi) && (synpred1())) {s = 174;}

                        else if ( (LA27_91==NCName) && (synpred1())) {s = 175;}

                        else if ( (LA27_91==ORDERED) && (synpred1())) {s = 176;}

                        else if ( (LA27_91==UNORDERED) && (synpred1())) {s = 177;}

                        else if ( (LA27_91==LCOMMENTSi) && (synpred1())) {s = 178;}

                        else if ( (LA27_91==LPISi) && (synpred1())) {s = 179;}

                        else if ( (LA27_91==DOCUMENT) && (synpred1())) {s = 180;}

                        else if ( (LA27_91==ELEMENT) && (synpred1())) {s = 181;}

                        else if ( (LA27_91==ATTRIBUTE) && (synpred1())) {s = 182;}

                        else if ( (LA27_91==TEXT) && (synpred1())) {s = 183;}

                        else if ( (LA27_91==COMMENT) && (synpred1())) {s = 184;}

                        else if ( (LA27_91==PROCESSING_INSTRUCTION) && (synpred1())) {s = 185;}

                        else if ( ((LA27_91>=PARENT && LA27_91<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 186;}

                        else if ( (LA27_91==DOTDOTSi) && (synpred1())) {s = 187;}

                        else if ( ((LA27_91>=CHILD && LA27_91<=FOLLOWING)) && (synpred1())) {s = 188;}

                        else if ( (LA27_91==ATSi) && (synpred1())) {s = 189;}

                        else if ( (LA27_91==DOCUMENT_NODE) && (synpred1())) {s = 190;}

                        else if ( (LA27_91==SCHEMAELEMENT) && (synpred1())) {s = 191;}

                        else if ( (LA27_91==SCHEMAATTRIBUTE) && (synpred1())) {s = 192;}

                        else if ( (LA27_91==NODE) && (synpred1())) {s = 193;}

                        else if ( (LA27_91==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_91);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_110 = input.LA(1);

                         
                        int index27_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_110);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
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
                    case 15 : 
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
                    case 16 : 
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
                    case 17 : 
                        int LA27_47 = input.LA(1);

                         
                        int index27_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_47==PLUSSi||LA27_47==MINUSSi) && (synpred1())) {s = 133;}

                        else if ( (LA27_47==VALIDATE) && (synpred1())) {s = 134;}

                        else if ( (LA27_47==DBLSLASHSi) && (synpred1())) {s = 135;}

                        else if ( (LA27_47==SLASHSi) && (synpred1())) {s = 136;}

                        else if ( ((LA27_47>=IntegerLiteral && LA27_47<=DoubleLiteral)) && (synpred1())) {s = 137;}

                        else if ( (LA27_47==StringLiteral) && (synpred1())) {s = 138;}

                        else if ( (LA27_47==DOLLARSi) && (synpred1())) {s = 139;}

                        else if ( (LA27_47==LPARSi) && (synpred1())) {s = 140;}

                        else if ( (LA27_47==DOTSi) && (synpred1())) {s = 141;}

                        else if ( (LA27_47==NCName) ) {s = 142;}

                        else if ( (LA27_47==ORDERED) && (synpred1())) {s = 143;}

                        else if ( (LA27_47==UNORDERED) && (synpred1())) {s = 144;}

                        else if ( (LA27_47==LTSi) && (synpred1())) {s = 145;}

                        else if ( (LA27_47==LCOMMENTSi) && (synpred1())) {s = 146;}

                        else if ( (LA27_47==LPISi) && (synpred1())) {s = 147;}

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
                    case 18 : 
                        int LA27_90 = input.LA(1);

                         
                        int index27_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_90==NCName) ) {s = 195;}

                        else if ( (LA27_90==PLUSSi||LA27_90==MINUSSi) && (synpred1())) {s = 133;}

                        else if ( (LA27_90==VALIDATE) && (synpred1())) {s = 134;}

                        else if ( (LA27_90==DBLSLASHSi) && (synpred1())) {s = 135;}

                        else if ( (LA27_90==SLASHSi) && (synpred1())) {s = 136;}

                        else if ( ((LA27_90>=IntegerLiteral && LA27_90<=DoubleLiteral)) && (synpred1())) {s = 137;}

                        else if ( (LA27_90==StringLiteral) && (synpred1())) {s = 138;}

                        else if ( (LA27_90==DOLLARSi) && (synpred1())) {s = 139;}

                        else if ( (LA27_90==LPARSi) && (synpred1())) {s = 140;}

                        else if ( (LA27_90==DOTSi) && (synpred1())) {s = 141;}

                        else if ( (LA27_90==ORDERED) && (synpred1())) {s = 143;}

                        else if ( (LA27_90==UNORDERED) && (synpred1())) {s = 144;}

                        else if ( (LA27_90==LTSi) && (synpred1())) {s = 145;}

                        else if ( (LA27_90==LCOMMENTSi) && (synpred1())) {s = 146;}

                        else if ( (LA27_90==LPISi) && (synpred1())) {s = 147;}

                        else if ( (LA27_90==DOCUMENT) && (synpred1())) {s = 148;}

                        else if ( (LA27_90==ELEMENT) && (synpred1())) {s = 149;}

                        else if ( (LA27_90==ATTRIBUTE) && (synpred1())) {s = 150;}

                        else if ( (LA27_90==TEXT) && (synpred1())) {s = 151;}

                        else if ( (LA27_90==COMMENT) && (synpred1())) {s = 152;}

                        else if ( (LA27_90==PROCESSING_INSTRUCTION) && (synpred1())) {s = 153;}

                        else if ( ((LA27_90>=PARENT && LA27_90<=ANCESTOR_OR_SELF)) && (synpred1())) {s = 154;}

                        else if ( (LA27_90==DOTDOTSi) && (synpred1())) {s = 155;}

                        else if ( ((LA27_90>=CHILD && LA27_90<=FOLLOWING)) && (synpred1())) {s = 156;}

                        else if ( (LA27_90==ATSi) && (synpred1())) {s = 157;}

                        else if ( (LA27_90==DOCUMENT_NODE) && (synpred1())) {s = 158;}

                        else if ( (LA27_90==SCHEMAELEMENT) && (synpred1())) {s = 159;}

                        else if ( (LA27_90==SCHEMAATTRIBUTE) && (synpred1())) {s = 160;}

                        else if ( (LA27_90==NODE) && (synpred1())) {s = 161;}

                        else if ( (LA27_90==STARSi) && (synpred1())) {s = 162;}

                        else if ( (LA27_90==LPRAGSi) && (synpred1())) {s = 163;}

                         
                        input.seek(index27_90);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA27_89 = input.LA(1);

                         
                        int index27_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_89);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_167 = input.LA(1);

                         
                        int index27_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_167==COLONSi) && (synpred1())) {s = 347;}

                        else if ( (LA27_167==PLUSSi||LA27_167==MINUSSi) ) {s = 46;}

                        else if ( (LA27_167==StringLiteral||LA27_167==NCName||LA27_167==ELEMENT||(LA27_167>=ORDERED && LA27_167<=UNORDERED)||LA27_167==DOLLARSi||LA27_167==LPARSi||LA27_167==DOCUMENT_NODE||(LA27_167>=SCHEMAELEMENT && LA27_167<=NODE)||(LA27_167>=IntegerLiteral && LA27_167<=DoubleLiteral)||LA27_167==LPRAGSi||LA27_167==VALIDATE||(LA27_167>=PARENT && LA27_167<=ANCESTOR_OR_SELF)||(LA27_167>=DOTDOTSi && LA27_167<=ATSi)||LA27_167==DOTSi||LA27_167==LCOMMENTSi||LA27_167==LPISi||LA27_167==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_167==DBLSLASHSi) ) {s = 348;}

                        else if ( (LA27_167==SLASHSi) ) {s = 349;}

                        else if ( (LA27_167==LTSi) ) {s = 47;}

                        else if ( (LA27_167==STARSi) ) {s = 48;}

                        else if ( (LA27_167==LBRACKSi) && (synpred1())) {s = 350;}

                        else if ( (LA27_167==CAST) && (synpred1())) {s = 351;}

                        else if ( (LA27_167==CASTABLE) && (synpred1())) {s = 352;}

                        else if ( (LA27_167==TREAT) && (synpred1())) {s = 353;}

                        else if ( (LA27_167==INSTANCE) && (synpred1())) {s = 354;}

                        else if ( ((LA27_167>=INTERSECT && LA27_167<=EXCEPT)) && (synpred1())) {s = 355;}

                        else if ( ((LA27_167>=UNION && LA27_167<=PIPESi)) && (synpred1())) {s = 356;}

                        else if ( (LA27_167==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_167==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_167>=EQ && LA27_167<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_167==EQSi||LA27_167==NEQSi||(LA27_167>=LTOREQSi && LA27_167<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_167>=IS && LA27_167<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_167==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_167==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_167==COMMASi) && (synpred1())) {s = 285;}

                        else if ( (LA27_167==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_167==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_167==RPARSi) && (synpred1())) {s = 357;}

                        else if ( (LA27_167==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_167==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_167==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_167==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_167==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_167==RETURN) && (synpred1())) {s = 288;}

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
                    case 21 : 
                        int LA27_197 = input.LA(1);

                         
                        int index27_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_197==COLONSi) && (synpred1())) {s = 347;}

                        else if ( (LA27_197==PLUSSi||LA27_197==MINUSSi) ) {s = 412;}

                        else if ( (LA27_197==StringLiteral||LA27_197==NCName||LA27_197==ELEMENT||(LA27_197>=ORDERED && LA27_197<=UNORDERED)||LA27_197==DOLLARSi||LA27_197==LPARSi||LA27_197==DOCUMENT_NODE||(LA27_197>=SCHEMAELEMENT && LA27_197<=NODE)||(LA27_197>=IntegerLiteral && LA27_197<=DoubleLiteral)||LA27_197==LPRAGSi||LA27_197==VALIDATE||(LA27_197>=PARENT && LA27_197<=ANCESTOR_OR_SELF)||(LA27_197>=DOTDOTSi && LA27_197<=ATSi)||LA27_197==DOTSi||LA27_197==LCOMMENTSi||LA27_197==LPISi||LA27_197==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_197==DBLSLASHSi) ) {s = 413;}

                        else if ( (LA27_197==SLASHSi) ) {s = 414;}

                        else if ( (LA27_197==LTSi) ) {s = 415;}

                        else if ( (LA27_197==STARSi) ) {s = 416;}

                        else if ( (LA27_197==LBRACKSi) && (synpred1())) {s = 350;}

                        else if ( (LA27_197==CAST) && (synpred1())) {s = 351;}

                        else if ( (LA27_197==CASTABLE) && (synpred1())) {s = 352;}

                        else if ( (LA27_197==TREAT) && (synpred1())) {s = 353;}

                        else if ( (LA27_197==INSTANCE) && (synpred1())) {s = 354;}

                        else if ( ((LA27_197>=INTERSECT && LA27_197<=EXCEPT)) && (synpred1())) {s = 355;}

                        else if ( ((LA27_197>=UNION && LA27_197<=PIPESi)) && (synpred1())) {s = 356;}

                        else if ( (LA27_197==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_197==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_197>=EQ && LA27_197<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_197==EQSi||LA27_197==NEQSi||(LA27_197>=LTOREQSi && LA27_197<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_197>=IS && LA27_197<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_197==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_197==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_197==COMMASi) && (synpred1())) {s = 285;}

                        else if ( (LA27_197==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_197==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_197==RPARSi) && (synpred1())) {s = 357;}

                        else if ( (LA27_197==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_197==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_197==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_197==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_197==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_197==RETURN) && (synpred1())) {s = 288;}

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
                    case 22 : 
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
                    case 23 : 
                        int LA27_44 = input.LA(1);

                         
                        int index27_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_44==STARSi) ) {s = 24;}

                        else if ( (LA27_44==EOF||LA27_44==SEMICOLONSi||(LA27_44>=EQSi && LA27_44<=COMMASi)||LA27_44==DEFAULT||LA27_44==COLLATION||(LA27_44>=ORDER && LA27_44<=EMPTY)||LA27_44==AT||(LA27_44>=ASSIGNSi && LA27_44<=EXTERNAL)||(LA27_44>=RPARSi && LA27_44<=RBRACSi)||(LA27_44>=RETURN && LA27_44<=WHERE)||(LA27_44>=STABLE && LA27_44<=DESCENDING)||LA27_44==SATISFIES||LA27_44==CASE||(LA27_44>=ELSE && LA27_44<=INSTANCE)||LA27_44==WITHOUT||(LA27_44>=EQ && LA27_44<=NODEAFTERSi)||LA27_44==WORDS||LA27_44==TIMES||(LA27_44>=SENTENCES && LA27_44<=PARAGRAPHS)||LA27_44==LEVELS||LA27_44==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_44==PLUSSi) ) {s = 26;}

                        else if ( (LA27_44==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA27_101 = input.LA(1);

                         
                        int index27_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_101==STARSi) ) {s = 24;}

                        else if ( (LA27_101==EOF||LA27_101==SEMICOLONSi||(LA27_101>=EQSi && LA27_101<=COMMASi)||LA27_101==DEFAULT||LA27_101==COLLATION||(LA27_101>=ORDER && LA27_101<=EMPTY)||LA27_101==AT||(LA27_101>=ASSIGNSi && LA27_101<=EXTERNAL)||(LA27_101>=RPARSi && LA27_101<=RBRACSi)||(LA27_101>=RETURN && LA27_101<=WHERE)||(LA27_101>=STABLE && LA27_101<=DESCENDING)||LA27_101==SATISFIES||LA27_101==CASE||(LA27_101>=ELSE && LA27_101<=INSTANCE)||LA27_101==WITHOUT||(LA27_101>=EQ && LA27_101<=NODEAFTERSi)||LA27_101==WORDS||LA27_101==TIMES||(LA27_101>=SENTENCES && LA27_101<=PARAGRAPHS)||LA27_101==LEVELS||LA27_101==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_101==PLUSSi) ) {s = 26;}

                        else if ( (LA27_101==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_101);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA27_26 = input.LA(1);

                         
                        int index27_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_26==PLUSSi||LA27_26==MINUSSi) ) {s = 89;}

                        else if ( (LA27_26==StringLiteral||LA27_26==NCName||LA27_26==ELEMENT||(LA27_26>=ORDERED && LA27_26<=UNORDERED)||LA27_26==DOLLARSi||LA27_26==LPARSi||LA27_26==DOCUMENT_NODE||(LA27_26>=SCHEMAELEMENT && LA27_26<=NODE)||(LA27_26>=IntegerLiteral && LA27_26<=DoubleLiteral)||LA27_26==LPRAGSi||LA27_26==VALIDATE||(LA27_26>=DBLSLASHSi && LA27_26<=ANCESTOR_OR_SELF)||(LA27_26>=DOTDOTSi && LA27_26<=ATSi)||LA27_26==DOTSi||LA27_26==LCOMMENTSi||LA27_26==LPISi||LA27_26==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_26==LTSi) ) {s = 90;}

                        else if ( (LA27_26==STARSi) ) {s = 91;}

                        else if ( (LA27_26==ASSIGNSi) && (synpred1())) {s = 49;}

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

                        else if ( ((LA27_26>=DIV && LA27_26<=MOD)) && (synpred1())) {s = 60;}

                        else if ( (LA27_26==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_26==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_26>=EQ && LA27_26<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_26==EQSi||LA27_26==NEQSi||(LA27_26>=LTOREQSi && LA27_26<=GTOREQSi)) && (synpred1())) {s = 64;}

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

                         
                        input.seek(index27_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA27_142 = input.LA(1);

                         
                        int index27_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_142==COLONSi) ) {s = 271;}

                        else if ( (LA27_142==LPARSi) && (synpred1())) {s = 272;}

                        else if ( (LA27_142==NCName||LA27_142==GTSi||LA27_142==RSELFTERMSi) ) {s = 25;}

                        else if ( (LA27_142==LBRACKSi) && (synpred1())) {s = 273;}

                        else if ( ((LA27_142>=DBLSLASHSi && LA27_142<=SLASHSi)) && (synpred1())) {s = 274;}

                        else if ( (LA27_142==CAST) && (synpred1())) {s = 275;}

                        else if ( (LA27_142==CASTABLE) && (synpred1())) {s = 276;}

                        else if ( (LA27_142==TREAT) && (synpred1())) {s = 277;}

                        else if ( (LA27_142==INSTANCE) && (synpred1())) {s = 278;}

                        else if ( ((LA27_142>=INTERSECT && LA27_142<=EXCEPT)) && (synpred1())) {s = 279;}

                        else if ( ((LA27_142>=UNION && LA27_142<=PIPESi)) && (synpred1())) {s = 280;}

                        else if ( (LA27_142==STARSi||(LA27_142>=DIV && LA27_142<=MOD)) && (synpred1())) {s = 281;}

                        else if ( (LA27_142==PLUSSi||LA27_142==MINUSSi) && (synpred1())) {s = 282;}

                        else if ( (LA27_142==TO) && (synpred1())) {s = 283;}

                        else if ( (LA27_142==FTCONTAINS) && (synpred1())) {s = 284;}

                        else if ( (LA27_142==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_142==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_142==COMMASi) && (synpred1())) {s = 285;}

                        else if ( (LA27_142==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_142==RBRACSi) && (synpred1())) {s = 286;}

                        else if ( (LA27_142==RPARSi) && (synpred1())) {s = 287;}

                        else if ( (LA27_142==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_142==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_142==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_142==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_142==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_142==RETURN) && (synpred1())) {s = 288;}

                        else if ( (LA27_142==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_142==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_142>=ASCENDING && LA27_142<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_142==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_142==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_142==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_142==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_142==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_142==ELSE) && (synpred1())) {s = 83;}

                         
                        input.seek(index27_142);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA27_195 = input.LA(1);

                         
                        int index27_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_195==COLONSi) ) {s = 385;}

                        else if ( (LA27_195==NCName||LA27_195==GTSi||LA27_195==RSELFTERMSi) ) {s = 25;}

                        else if ( (LA27_195==LPARSi) && (synpred1())) {s = 272;}

                        else if ( (LA27_195==LBRACKSi) && (synpred1())) {s = 273;}

                        else if ( ((LA27_195>=DBLSLASHSi && LA27_195<=SLASHSi)) && (synpred1())) {s = 274;}

                        else if ( (LA27_195==CAST) && (synpred1())) {s = 275;}

                        else if ( (LA27_195==CASTABLE) && (synpred1())) {s = 276;}

                        else if ( (LA27_195==TREAT) && (synpred1())) {s = 277;}

                        else if ( (LA27_195==INSTANCE) && (synpred1())) {s = 278;}

                        else if ( ((LA27_195>=INTERSECT && LA27_195<=EXCEPT)) && (synpred1())) {s = 279;}

                        else if ( ((LA27_195>=UNION && LA27_195<=PIPESi)) && (synpred1())) {s = 280;}

                        else if ( (LA27_195==STARSi||(LA27_195>=DIV && LA27_195<=MOD)) && (synpred1())) {s = 281;}

                        else if ( (LA27_195==PLUSSi||LA27_195==MINUSSi) && (synpred1())) {s = 282;}

                        else if ( (LA27_195==TO) && (synpred1())) {s = 283;}

                        else if ( (LA27_195==FTCONTAINS) && (synpred1())) {s = 284;}

                        else if ( (LA27_195==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_195==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_195==COMMASi) && (synpred1())) {s = 285;}

                        else if ( (LA27_195==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_195==RBRACSi) && (synpred1())) {s = 286;}

                        else if ( (LA27_195==RPARSi) && (synpred1())) {s = 287;}

                        else if ( (LA27_195==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_195==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_195==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_195==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_195==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_195==RETURN) && (synpred1())) {s = 288;}

                        else if ( (LA27_195==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_195==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_195>=ASCENDING && LA27_195<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_195==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_195==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_195==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_195==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_195==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_195==ELSE) && (synpred1())) {s = 83;}

                         
                        input.seek(index27_195);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA27_105 = input.LA(1);

                         
                        int index27_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_105);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA27_169 = input.LA(1);

                         
                        int index27_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_169==CAST) && (synpred1())) {s = 351;}

                        else if ( (LA27_169==CASTABLE) && (synpred1())) {s = 352;}

                        else if ( (LA27_169==TREAT) && (synpred1())) {s = 353;}

                        else if ( (LA27_169==INSTANCE) && (synpred1())) {s = 354;}

                        else if ( ((LA27_169>=INTERSECT && LA27_169<=EXCEPT)) && (synpred1())) {s = 355;}

                        else if ( ((LA27_169>=UNION && LA27_169<=PIPESi)) && (synpred1())) {s = 356;}

                        else if ( (LA27_169==PLUSSi||LA27_169==MINUSSi) && (synpred1())) {s = 358;}

                        else if ( (LA27_169==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_169==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_169>=EQ && LA27_169<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_169==LTSi) ) {s = 359;}

                        else if ( ((LA27_169>=IS && LA27_169<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_169==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_169==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_169==COMMASi) && (synpred1())) {s = 285;}

                        else if ( (LA27_169==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_169==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_169==RPARSi) && (synpred1())) {s = 357;}

                        else if ( (LA27_169==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_169==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_169==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_169==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_169==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_169==RETURN) && (synpred1())) {s = 288;}

                        else if ( (LA27_169==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_169==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_169>=ASCENDING && LA27_169<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_169==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_169==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_169==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_169==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_169==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_169==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_169==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_169==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_169==WORDS||(LA27_169>=SENTENCES && LA27_169<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_169==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_169==STARSi) ) {s = 360;}

                        else if ( ((LA27_169>=IntegerLiteral && LA27_169<=DoubleLiteral)) ) {s = 361;}

                        else if ( (LA27_169==StringLiteral) ) {s = 362;}

                        else if ( (LA27_169==DOLLARSi) ) {s = 363;}

                        else if ( (LA27_169==LPARSi) ) {s = 364;}

                        else if ( (LA27_169==DOTSi) ) {s = 365;}

                        else if ( (LA27_169==NCName) ) {s = 366;}

                        else if ( (LA27_169==ORDERED) ) {s = 367;}

                        else if ( (LA27_169==UNORDERED) ) {s = 368;}

                        else if ( (LA27_169==EQSi||LA27_169==NEQSi||(LA27_169>=LTOREQSi && LA27_169<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_169==LCOMMENTSi) ) {s = 369;}

                        else if ( (LA27_169==LPISi) ) {s = 370;}

                        else if ( (LA27_169==DOCUMENT) ) {s = 371;}

                        else if ( (LA27_169==ELEMENT) ) {s = 372;}

                        else if ( (LA27_169==ATTRIBUTE) ) {s = 373;}

                        else if ( (LA27_169==TEXT) ) {s = 374;}

                        else if ( (LA27_169==COMMENT) ) {s = 375;}

                        else if ( (LA27_169==PROCESSING_INSTRUCTION) ) {s = 376;}

                        else if ( ((LA27_169>=PARENT && LA27_169<=ANCESTOR_OR_SELF)) ) {s = 377;}

                        else if ( (LA27_169==DOTDOTSi) ) {s = 378;}

                        else if ( ((LA27_169>=CHILD && LA27_169<=FOLLOWING)) ) {s = 379;}

                        else if ( (LA27_169==ATSi) ) {s = 380;}

                        else if ( (LA27_169==DOCUMENT_NODE) ) {s = 381;}

                        else if ( (LA27_169==SCHEMAELEMENT) ) {s = 382;}

                        else if ( (LA27_169==SCHEMAATTRIBUTE) ) {s = 383;}

                        else if ( (LA27_169==NODE) ) {s = 384;}

                        else if ( ((LA27_169>=DIV && LA27_169<=MOD)) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_169);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA27_198 = input.LA(1);

                         
                        int index27_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_198==CAST) && (synpred1())) {s = 351;}

                        else if ( (LA27_198==CASTABLE) && (synpred1())) {s = 352;}

                        else if ( (LA27_198==TREAT) && (synpred1())) {s = 353;}

                        else if ( (LA27_198==INSTANCE) && (synpred1())) {s = 354;}

                        else if ( ((LA27_198>=INTERSECT && LA27_198<=EXCEPT)) && (synpred1())) {s = 355;}

                        else if ( ((LA27_198>=UNION && LA27_198<=PIPESi)) && (synpred1())) {s = 356;}

                        else if ( (LA27_198==PLUSSi||LA27_198==MINUSSi) && (synpred1())) {s = 358;}

                        else if ( (LA27_198==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_198==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_198>=EQ && LA27_198<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_198==LTSi) ) {s = 417;}

                        else if ( ((LA27_198>=IS && LA27_198<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_198==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_198==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_198==COMMASi) && (synpred1())) {s = 285;}

                        else if ( (LA27_198==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_198==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_198==RPARSi) && (synpred1())) {s = 357;}

                        else if ( (LA27_198==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_198==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_198==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_198==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_198==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_198==RETURN) && (synpred1())) {s = 288;}

                        else if ( (LA27_198==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_198==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_198>=ASCENDING && LA27_198<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_198==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_198==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_198==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_198==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_198==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_198==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_198==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_198==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_198==WORDS||(LA27_198>=SENTENCES && LA27_198<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_198==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_198==STARSi) ) {s = 418;}

                        else if ( ((LA27_198>=IntegerLiteral && LA27_198<=DoubleLiteral)) ) {s = 419;}

                        else if ( (LA27_198==StringLiteral) ) {s = 420;}

                        else if ( (LA27_198==DOLLARSi) ) {s = 421;}

                        else if ( (LA27_198==LPARSi) ) {s = 422;}

                        else if ( (LA27_198==DOTSi) ) {s = 423;}

                        else if ( (LA27_198==NCName) ) {s = 424;}

                        else if ( (LA27_198==ORDERED) ) {s = 425;}

                        else if ( (LA27_198==UNORDERED) ) {s = 426;}

                        else if ( (LA27_198==EQSi||LA27_198==NEQSi||(LA27_198>=LTOREQSi && LA27_198<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_198==LCOMMENTSi) ) {s = 427;}

                        else if ( (LA27_198==LPISi) ) {s = 428;}

                        else if ( (LA27_198==DOCUMENT) ) {s = 429;}

                        else if ( (LA27_198==ELEMENT) ) {s = 430;}

                        else if ( (LA27_198==ATTRIBUTE) ) {s = 431;}

                        else if ( (LA27_198==TEXT) ) {s = 432;}

                        else if ( (LA27_198==COMMENT) ) {s = 433;}

                        else if ( (LA27_198==PROCESSING_INSTRUCTION) ) {s = 434;}

                        else if ( ((LA27_198>=PARENT && LA27_198<=ANCESTOR_OR_SELF)) ) {s = 435;}

                        else if ( (LA27_198==DOTDOTSi) ) {s = 436;}

                        else if ( ((LA27_198>=CHILD && LA27_198<=FOLLOWING)) ) {s = 437;}

                        else if ( (LA27_198==ATSi) ) {s = 438;}

                        else if ( (LA27_198==DOCUMENT_NODE) ) {s = 439;}

                        else if ( (LA27_198==SCHEMAELEMENT) ) {s = 440;}

                        else if ( (LA27_198==SCHEMAATTRIBUTE) ) {s = 441;}

                        else if ( (LA27_198==NODE) ) {s = 442;}

                        else if ( ((LA27_198>=DIV && LA27_198<=MOD)) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_198);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
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
                    case 32 : 
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
                    case 33 : 
                        int LA27_24 = input.LA(1);

                         
                        int index27_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_24==PLUSSi||LA27_24==MINUSSi) ) {s = 46;}

                        else if ( (LA27_24==StringLiteral||LA27_24==NCName||LA27_24==ELEMENT||(LA27_24>=ORDERED && LA27_24<=UNORDERED)||LA27_24==DOLLARSi||LA27_24==LPARSi||LA27_24==DOCUMENT_NODE||(LA27_24>=SCHEMAELEMENT && LA27_24<=NODE)||(LA27_24>=IntegerLiteral && LA27_24<=DoubleLiteral)||LA27_24==LPRAGSi||LA27_24==VALIDATE||(LA27_24>=DBLSLASHSi && LA27_24<=ANCESTOR_OR_SELF)||(LA27_24>=DOTDOTSi && LA27_24<=ATSi)||LA27_24==DOTSi||LA27_24==LCOMMENTSi||LA27_24==LPISi||LA27_24==DOCUMENT) ) {s = 25;}

                        else if ( (LA27_24==LTSi) ) {s = 47;}

                        else if ( (LA27_24==STARSi) ) {s = 48;}

                        else if ( (LA27_24==ASSIGNSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_24==EXTERNAL) && (synpred1())) {s = 50;}

                        else if ( (LA27_24==COMMASi) && (synpred1())) {s = 51;}

                        else if ( (LA27_24==RPARSi) && (synpred1())) {s = 52;}

                        else if ( (LA27_24==AT) && (synpred1())) {s = 53;}

                        else if ( (LA27_24==SCORE) && (synpred1())) {s = 54;}

                        else if ( (LA27_24==IN) && (synpred1())) {s = 55;}

                        else if ( (LA27_24==LBRACESi) && (synpred1())) {s = 56;}

                        else if ( (LA27_24==RETURN) && (synpred1())) {s = 57;}

                        else if ( ((LA27_24>=INTERSECT && LA27_24<=EXCEPT)) && (synpred1())) {s = 58;}

                        else if ( ((LA27_24>=UNION && LA27_24<=PIPESi)) && (synpred1())) {s = 59;}

                        else if ( ((LA27_24>=DIV && LA27_24<=MOD)) && (synpred1())) {s = 60;}

                        else if ( (LA27_24==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_24==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( ((LA27_24>=EQ && LA27_24<=GE)) && (synpred1())) {s = 63;}

                        else if ( (LA27_24==EQSi||LA27_24==NEQSi||(LA27_24>=LTOREQSi && LA27_24<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( ((LA27_24>=IS && LA27_24<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_24==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_24==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_24==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_24==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_24==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_24==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_24==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_24==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_24==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_24==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_24==LET) && (synpred1())) {s = 76;}

                        else if ( ((LA27_24>=ASCENDING && LA27_24<=DESCENDING)) && (synpred1())) {s = 77;}

                        else if ( (LA27_24==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_24==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_24==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_24==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_24==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_24==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_24==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_24==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_24==WORDS||(LA27_24>=SENTENCES && LA27_24<=PARAGRAPHS)) && (synpred1())) {s = 86;}

                        else if ( (LA27_24==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_24==INSTANCE) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_24);
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
        "\u01d0\uffff";
    static final String DFA120_eofS =
        "\2\uffff\1\36\32\uffff\1\66\1\uffff\1\36\3\uffff\1\36\1\uffff\1"+
        "\36\u0086\uffff\1\66\30\uffff\1\66\31\uffff\1\66\1\uffff\1\36\u00ee"+
        "\uffff";
    static final String DFA120_minS =
        "\1\6\1\uffff\1\6\11\uffff\1\6\20\uffff\1\6\1\uffff\1\10\1\uffff"+
        "\5\6\46\uffff\1\13\3\uffff\1\6\1\56\1\6\3\0\1\13\3\0\2\56\1\13\1"+
        "\u00c0\1\u00c3\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9\1\13\4\54"+
        "\1\0\1\13\2\0\1\13\3\0\2\56\1\13\1\u00c0\1\u00c3\1\56\2\13\2\54"+
        "\1\13\1\u00a9\1\0\1\u00a9\1\13\4\54\1\0\1\6\3\0\1\13\3\0\2\56\1"+
        "\u00c0\1\u00c3\1\56\2\13\2\54\1\13\1\u00a9\1\0\1\u00a9\1\13\4\54"+
        "\11\uffff\1\10\25\uffff\1\6\1\uffff\2\6\10\uffff\1\6\20\uffff\1"+
        "\6\1\uffff\1\10\1\0\1\56\176\0\17\uffff\71\0\7\uffff\33\0\1\uffff"+
        "\2\0\1\uffff";
    static final String DFA120_maxS =
        "\1\u00c6\1\uffff\1\u00c6\11\uffff\1\u00c6\20\uffff\1\u00c6\1\uffff"+
        "\1\u00b5\1\uffff\5\u00c6\46\uffff\1\66\3\uffff\1\u00c6\1\u00a1\1"+
        "\u00c6\3\0\1\13\3\0\2\56\1\13\1\u00c0\1\u00c3\2\56\1\u00a9\3\56"+
        "\1\u00a9\1\0\1\u00a9\1\75\4\54\1\0\1\13\2\0\1\13\3\0\2\56\1\13\1"+
        "\u00c0\1\u00c3\2\56\1\u00a9\3\56\1\u00a9\1\0\1\u00a9\1\75\4\54\1"+
        "\0\1\u00c6\3\0\1\13\3\0\2\56\1\u00c0\1\u00c3\2\56\1\u00a9\3\56\1"+
        "\u00a9\1\0\1\u00a9\1\75\4\54\11\uffff\1\u00b5\25\uffff\1\u00c6\1"+
        "\uffff\2\u00c6\10\uffff\1\u00c6\20\uffff\1\u00c6\1\uffff\1\u00b5"+
        "\1\0\1\56\176\0\17\uffff\71\0\7\uffff\33\0\1\uffff\2\0\1\uffff";
    static final String DFA120_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\10\2\1\uffff\20\2\1\uffff\1\3\1\uffff\1"+
        "\2\5\uffff\46\2\1\uffff\3\2\123\uffff\11\2\1\uffff\25\2\1\uffff"+
        "\1\2\2\uffff\10\2\1\uffff\20\2\1\uffff\1\2\u0081\uffff\17\2\71\uffff"+
        "\7\2\33\uffff\1\2\2\uffff\1\2";
    static final String DFA120_specialS =
        "\1\17\1\uffff\1\11\32\uffff\1\22\1\uffff\1\2\4\uffff\1\20\1\16\55"+
        "\uffff\1\21\1\7\1\32\1\uffff\1\5\1\34\1\14\14\uffff\1\24\6\uffff"+
        "\1\0\1\uffff\1\4\1\30\1\uffff\1\27\1\12\1\33\14\uffff\1\37\6\uffff"+
        "\1\25\1\uffff\1\6\1\3\1\31\1\uffff\1\15\1\13\1\35\13\uffff\1\40"+
        "\17\uffff\1\36\30\uffff\1\26\31\uffff\1\23\1\uffff\1\10\1\1\u00ed"+
        "\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\3\4\uffff\1\3\4\uffff\1\3\10\uffff\2\3\14\uffff\1\3\4\uffff"+
            "\1\3\7\uffff\1\3\1\uffff\10\3\55\uffff\1\3\13\uffff\3\3\50\uffff"+
            "\1\1\1\2\5\3\1\uffff\10\3\2\uffff\1\3\12\uffff\1\3\2\uffff\1"+
            "\3\3\uffff\1\3",
            "",
            "\1\5\1\uffff\1\36\2\uffff\1\11\2\36\1\uffff\1\36\1\20\4\uffff"+
            "\1\36\3\uffff\1\12\1\13\2\36\12\uffff\1\6\4\uffff\1\7\1\36\1"+
            "\uffff\1\36\4\uffff\1\31\1\uffff\1\35\1\32\1\21\1\33\1\24\1"+
            "\23\1\22\1\34\3\36\2\uffff\2\36\1\uffff\3\36\2\uffff\1\36\1"+
            "\uffff\1\36\2\uffff\16\36\1\uffff\4\36\1\uffff\7\36\1\14\6\36"+
            "\5\uffff\3\4\3\uffff\1\36\2\uffff\1\36\7\uffff\2\36\15\uffff"+
            "\1\36\14\uffff\5\25\1\uffff\1\26\6\27\1\30\1\uffff\1\36\1\10"+
            "\12\uffff\1\15\2\uffff\1\16\3\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\4\uffff\1\37\4\uffff\1\36\10\uffff\2\36\14\uffff\1\36"+
            "\4\uffff\1\36\7\uffff\1\36\1\uffff\11\36\26\uffff\1\36\25\uffff"+
            "\1\36\13\uffff\3\36\12\uffff\1\36\32\uffff\1\36\2\uffff\7\36"+
            "\1\uffff\10\36\2\uffff\1\36\12\uffff\1\36\2\uffff\1\36\3\uffff"+
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\uffff\1\72\2\uffff\1\36\1\61\1\65\1\uffff\1\105\1\36"+
            "\4\uffff\1\103\3\uffff\2\36\1\74\1\102\12\uffff\1\36\2\uffff"+
            "\1\40\1\uffff\1\36\1\70\1\uffff\1\67\4\uffff\1\36\1\uffff\1"+
            "\45\7\36\1\41\1\76\1\77\2\uffff\1\100\1\73\1\uffff\1\75\2\101"+
            "\2\uffff\1\104\1\uffff\1\106\2\uffff\1\107\1\64\1\63\1\57\1"+
            "\56\1\41\3\55\2\54\2\53\1\52\1\uffff\1\51\1\50\1\47\1\110\1"+
            "\uffff\6\60\1\61\1\44\3\61\3\62\5\uffff\3\36\3\uffff\1\112\2"+
            "\uffff\1\111\3\uffff\1\36\3\uffff\2\112\15\uffff\1\113\7\uffff"+
            "\1\36\2\uffff\1\42\1\43\5\36\1\uffff\10\36\1\46\1\71\1\36\12"+
            "\uffff\1\36\2\uffff\1\36\3\uffff\1\36",
            "",
            "\1\36\2\uffff\1\115\1\uffff\1\36\1\uffff\1\36\5\uffff\1\36\5"+
            "\uffff\2\36\15\uffff\1\114\1\uffff\2\36\1\uffff\1\36\6\uffff"+
            "\1\36\7\uffff\3\36\2\uffff\2\36\1\uffff\3\36\2\uffff\1\36\1"+
            "\uffff\1\36\2\uffff\16\36\1\uffff\3\36\13\uffff\1\117\64\uffff"+
            "\2\36\16\uffff\2\36\1\uffff\1\116",
            "",
            "\1\125\4\uffff\1\131\4\uffff\1\140\10\uffff\1\132\1\133\14\uffff"+
            "\1\126\4\uffff\1\127\7\uffff\1\151\1\uffff\1\155\1\152\1\141"+
            "\1\153\1\144\1\143\1\142\1\154\1\120\26\uffff\1\120\25\uffff"+
            "\1\134\13\uffff\3\124\12\uffff\1\156\32\uffff\1\121\2\uffff"+
            "\1\122\1\123\5\145\1\uffff\1\146\6\147\1\150\2\uffff\1\130\12"+
            "\uffff\1\135\2\uffff\1\136\3\uffff\1\137",
            "\1\160\4\uffff\1\164\4\uffff\1\173\10\uffff\1\165\1\166\14\uffff"+
            "\1\161\4\uffff\1\162\7\uffff\1\u0084\1\uffff\1\u0088\1\u0085"+
            "\1\174\1\u0086\1\177\1\176\1\175\1\u0087\55\uffff\1\167\13\uffff"+
            "\3\157\52\uffff\5\u0080\1\uffff\1\u0081\6\u0082\1\u0083\2\uffff"+
            "\1\163\12\uffff\1\170\2\uffff\1\171\3\uffff\1\172",
            "\1\u008c\1\uffff\1\36\2\uffff\1\u0090\2\36\1\uffff\1\36\1\u0096"+
            "\4\uffff\1\36\3\uffff\1\u0091\1\u0092\2\36\12\uffff\1\u008d"+
            "\4\uffff\1\u008e\1\36\1\uffff\1\36\4\uffff\1\u009f\1\uffff\1"+
            "\u008a\1\u00a0\1\u0097\1\u00a1\1\u009a\1\u0099\1\u0098\1\u00a2"+
            "\3\36\2\uffff\2\36\1\uffff\3\36\2\uffff\1\36\1\uffff\1\36\2"+
            "\uffff\16\36\1\uffff\4\36\1\uffff\7\36\1\u0089\6\36\5\uffff"+
            "\3\u008b\3\uffff\1\36\2\uffff\1\36\7\uffff\2\36\15\uffff\1\36"+
            "\14\uffff\5\u009b\1\uffff\1\u009c\6\u009d\1\u009e\1\uffff\1"+
            "\36\1\u008f\12\uffff\1\u0093\2\uffff\1\u0094\3\uffff\1\u0095",
            "\1\u00a8\4\uffff\1\u00ac\4\uffff\1\u00b3\10\uffff\1\u00ad\1"+
            "\u00ae\14\uffff\1\u00a9\4\uffff\1\u00aa\7\uffff\1\u00bc\1\uffff"+
            "\1\u00c0\1\u00bd\1\u00b4\1\u00be\1\u00b7\1\u00b6\1\u00b5\1\u00bf"+
            "\1\u00a3\26\uffff\1\u00a3\25\uffff\1\u00af\13\uffff\3\u00a7"+
            "\12\uffff\1\u00c1\32\uffff\1\u00a4\2\uffff\1\u00a5\1\u00a6\5"+
            "\u00b8\1\uffff\1\u00b9\6\u00ba\1\u00bb\2\uffff\1\u00ab\12\uffff"+
            "\1\u00b0\2\uffff\1\u00b1\3\uffff\1\u00b2",
            "\1\u00c7\1\uffff\1\36\2\uffff\1\u00cb\2\36\1\uffff\1\36\1\u00d2"+
            "\4\uffff\1\36\3\uffff\1\u00cc\1\u00cd\2\36\12\uffff\1\u00c8"+
            "\2\uffff\1\36\1\uffff\1\u00c9\1\36\1\uffff\1\36\4\uffff\1\u00db"+
            "\1\uffff\1\u00df\1\u00dc\1\u00d3\1\u00dd\1\u00d6\1\u00d5\1\u00d4"+
            "\1\u00de\1\u00c2\2\36\2\uffff\2\36\1\uffff\3\36\2\uffff\1\36"+
            "\1\uffff\1\36\2\uffff\5\36\1\u00c2\10\36\1\uffff\4\36\1\uffff"+
            "\7\36\1\u00ce\6\36\5\uffff\3\u00c6\3\uffff\1\36\2\uffff\1\36"+
            "\3\uffff\1\u00e0\3\uffff\2\36\15\uffff\1\36\7\uffff\1\u00c3"+
            "\2\uffff\1\u00c4\1\u00c5\5\u00d7\1\uffff\1\u00d8\6\u00d9\1\u00da"+
            "\2\36\1\u00ca\12\uffff\1\u00cf\2\uffff\1\u00d0\3\uffff\1\u00d1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e1\52\uffff\1\36",
            "",
            "",
            "",
            "\1\125\4\uffff\1\131\4\uffff\1\140\10\uffff\1\132\1\133\14\uffff"+
            "\1\126\4\uffff\1\u00e2\7\uffff\1\151\1\uffff\1\155\1\152\1\141"+
            "\1\153\1\144\1\143\1\142\1\154\1\120\26\uffff\1\120\25\uffff"+
            "\1\134\13\uffff\3\124\12\uffff\1\156\32\uffff\1\121\2\uffff"+
            "\1\122\1\123\5\145\1\uffff\1\146\6\147\1\150\2\uffff\1\130\12"+
            "\uffff\1\135\2\uffff\1\136\3\uffff\1\137",
            "\1\u00e4\161\uffff\2\u00e3",
            "\1\u00e6\4\uffff\1\u00ea\4\uffff\1\u00f1\10\uffff\1\u00eb\1"+
            "\u00ec\14\uffff\1\u00e7\4\uffff\1\u00e8\7\uffff\1\u00fa\1\uffff"+
            "\1\u00fe\1\u00fb\1\u00f2\1\u00fc\1\u00f5\1\u00f4\1\u00f3\1\u00fd"+
            "\55\uffff\1\u00ed\13\uffff\3\u00e5\52\uffff\5\u00f6\1\uffff"+
            "\1\u00f7\6\u00f8\1\u00f9\2\uffff\1\u00e9\12\uffff\1\u00ee\2"+
            "\uffff\1\u00ef\3\uffff\1\u00f0",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00ff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0107\40\uffff\1\u0106\1\uffff\1\u0108",
            "\1\u010b\40\uffff\1\u010a\1\uffff\1\u010c\172\uffff\1\u0109",
            "\1\u010e\1\uffff\1\u010d",
            "\1\u0110\1\uffff\1\u010f",
            "\1\u0112\40\uffff\1\u0111\1\uffff\1\u0113",
            "\1\u0114",
            "\1\uffff",
            "\1\u0109",
            "\1\u011a\4\uffff\1\u0115\43\uffff\1\151\1\uffff\1\155\1\152"+
            "\1\u0116\1\153\1\u0117\1\u0118\1\u0119\1\154",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\uffff",
            "\1\u011f",
            "\1\uffff",
            "\1\uffff",
            "\1\u0120",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0128\40\uffff\1\u0127\1\uffff\1\u0129",
            "\1\u012c\40\uffff\1\u012b\1\uffff\1\u012d\172\uffff\1\u012a",
            "\1\u012f\1\uffff\1\u012e",
            "\1\u0131\1\uffff\1\u0130",
            "\1\u0133\40\uffff\1\u0132\1\uffff\1\u0134",
            "\1\u0135",
            "\1\uffff",
            "\1\u012a",
            "\1\u013b\4\uffff\1\u0136\43\uffff\1\u0084\1\uffff\1\u0088\1"+
            "\u0085\1\u0137\1\u0086\1\u0138\1\u0139\1\u013a\1\u0087",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\uffff",
            "\1\36\4\uffff\1\u0140\4\uffff\1\36\10\uffff\2\36\14\uffff\1"+
            "\36\4\uffff\1\36\7\uffff\1\36\1\uffff\11\36\26\uffff\1\36\25"+
            "\uffff\1\36\13\uffff\3\36\12\uffff\1\36\32\uffff\1\36\2\uffff"+
            "\7\36\1\uffff\10\36\2\uffff\1\36\12\uffff\1\36\2\uffff\1\36"+
            "\3\uffff\1\36",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0141",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0148\40\uffff\1\u0147\1\uffff\1\u0149",
            "\1\u014c\40\uffff\1\u014b\1\uffff\1\u014d\172\uffff\1\u014a",
            "\1\u014f\1\uffff\1\u014e",
            "\1\u0151\1\uffff\1\u0150",
            "\1\u0153\40\uffff\1\u0152\1\uffff\1\u0154",
            "\1\u0155",
            "\1\uffff",
            "\1\u014a",
            "\1\u015b\4\uffff\1\u0156\43\uffff\1\u009f\1\uffff\1\u015c\1"+
            "\u00a0\1\u0157\1\u00a1\1\u0158\1\u0159\1\u015a\1\u00a2",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\72\2\uffff\1\36\1\uffff\1\65\1\uffff\1\105\5\uffff\1\103"+
            "\5\uffff\1\74\1\102\15\uffff\1\u0161\1\uffff\1\u0162\1\u0170"+
            "\1\uffff\1\u016f\6\uffff\1\u016b\7\uffff\1\u016c\1\76\1\77\2"+
            "\uffff\1\100\1\73\1\uffff\1\75\2\101\2\uffff\1\104\1\uffff\1"+
            "\106\2\uffff\1\107\1\64\1\63\1\u016e\1\u016d\1\u016c\3\u016b"+
            "\2\u016a\2\u0169\1\u0168\1\uffff\1\u0167\1\u0166\1\u0165\13"+
            "\uffff\1\36\64\uffff\2\u0164\16\uffff\1\u0163\1\71\1\uffff\1"+
            "\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0176\4\uffff\1\u017a\4\uffff\1\u0181\10\uffff\1\u017b\1"+
            "\u017c\14\uffff\1\u0177\4\uffff\1\u0178\7\uffff\1\u018a\1\uffff"+
            "\1\u018e\1\u018b\1\u0182\1\u018c\1\u0185\1\u0184\1\u0183\1\u018d"+
            "\1\u0171\26\uffff\1\u0171\25\uffff\1\u017d\13\uffff\3\u0175"+
            "\12\uffff\1\u018f\32\uffff\1\u0172\2\uffff\1\u0173\1\u0174\5"+
            "\u0186\1\uffff\1\u0187\6\u0188\1\u0189\2\uffff\1\u0179\12\uffff"+
            "\1\u017e\2\uffff\1\u017f\3\uffff\1\u0180",
            "",
            "\1\u0191\4\uffff\1\u0195\4\uffff\1\u019c\10\uffff\1\u0196\1"+
            "\u0197\14\uffff\1\u0192\4\uffff\1\u0193\7\uffff\1\u01a5\1\uffff"+
            "\1\u01a9\1\u01a6\1\u019d\1\u01a7\1\u01a0\1\u019f\1\u019e\1\u01a8"+
            "\55\uffff\1\u0198\13\uffff\3\u0190\52\uffff\5\u01a1\1\uffff"+
            "\1\u01a2\6\u01a3\1\u01a4\2\uffff\1\u0194\12\uffff\1\u0199\2"+
            "\uffff\1\u019a\3\uffff\1\u019b",
            "\1\u01b4\1\uffff\1\72\2\uffff\1\u01b8\1\61\1\65\1\uffff\1\105"+
            "\1\u01be\4\uffff\1\103\3\uffff\1\u01b9\1\u01ba\1\74\1\102\12"+
            "\uffff\1\u01b5\4\uffff\1\u01b6\1\70\1\uffff\1\67\4\uffff\1\u01c7"+
            "\1\uffff\1\u01b2\1\u01c8\1\u01bf\1\u01c9\1\u01c2\1\u01c1\1\u01c0"+
            "\1\u01ca\1\u01b0\1\76\1\77\2\uffff\1\100\1\73\1\uffff\1\75\2"+
            "\101\2\uffff\1\104\1\uffff\1\106\2\uffff\1\107\1\64\1\63\1\57"+
            "\1\56\1\u01b0\3\55\2\u01af\2\u01ae\1\u01ad\1\uffff\1\u01ac\1"+
            "\u01ab\1\u01aa\1\110\1\uffff\6\60\1\61\1\u01b1\3\61\3\62\5\uffff"+
            "\3\u01b3\3\uffff\1\112\2\uffff\1\111\7\uffff\2\112\15\uffff"+
            "\1\113\14\uffff\5\u01c3\1\uffff\1\u01c4\6\u01c5\1\u01c6\1\uffff"+
            "\1\71\1\u01b7\12\uffff\1\u01bb\2\uffff\1\u01bc\3\uffff\1\u01bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\4\uffff\1\u01cb\4\uffff\1\36\10\uffff\2\36\14\uffff\1"+
            "\36\4\uffff\1\36\7\uffff\1\36\1\uffff\11\36\26\uffff\1\36\25"+
            "\uffff\1\36\13\uffff\3\36\12\uffff\1\36\32\uffff\1\36\2\uffff"+
            "\7\36\1\uffff\10\36\2\uffff\1\36\12\uffff\1\36\2\uffff\1\36"+
            "\3\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\uffff\1\72\2\uffff\1\36\1\61\1\65\1\uffff\1\105\1\36"+
            "\4\uffff\1\103\3\uffff\2\36\1\74\1\102\12\uffff\1\36\2\uffff"+
            "\1\u01cc\1\uffff\1\36\1\70\1\uffff\1\67\4\uffff\1\36\1\uffff"+
            "\1\45\7\36\1\41\1\76\1\77\2\uffff\1\100\1\73\1\uffff\1\75\2"+
            "\101\2\uffff\1\104\1\uffff\1\106\2\uffff\1\107\1\64\1\63\1\57"+
            "\1\56\1\41\3\55\2\u01af\2\u01ae\1\u01ad\1\uffff\1\u01ac\1\u01ab"+
            "\1\u01aa\1\110\1\uffff\6\60\1\61\1\44\3\61\3\62\5\uffff\3\36"+
            "\3\uffff\1\112\2\uffff\1\111\3\uffff\1\36\3\uffff\2\112\15\uffff"+
            "\1\113\7\uffff\1\36\2\uffff\1\u01cd\1\u01ce\5\36\1\uffff\10"+
            "\36\1\u01cf\1\71\1\36\12\uffff\1\36\2\uffff\1\36\3\uffff\1\36",
            "",
            "\1\36\2\uffff\1\115\1\uffff\1\36\1\uffff\1\36\5\uffff\1\36\5"+
            "\uffff\2\36\17\uffff\2\36\1\uffff\1\36\6\uffff\1\36\7\uffff"+
            "\3\36\2\uffff\2\36\1\uffff\3\36\2\uffff\1\36\1\uffff\1\36\2"+
            "\uffff\16\36\1\uffff\3\36\13\uffff\1\117\64\uffff\2\36\16\uffff"+
            "\2\36\1\uffff\1\116",
            "\1\uffff",
            "\1\u00e4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "434:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_109 = input.LA(1);

                         
                        int index120_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_109);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_226 = input.LA(1);

                         
                        int index120_226 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 463;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_226);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA120_31 = input.LA(1);

                         
                        int index120_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_31==COLONSi) ) {s = 76;}

                        else if ( (LA120_31==EOF||LA120_31==SEMICOLONSi||LA120_31==COMMASi||LA120_31==DEFAULT||LA120_31==COLLATION||(LA120_31>=ORDER && LA120_31<=EMPTY)||(LA120_31>=LPARSi && LA120_31<=RPARSi)||LA120_31==RBRACSi||LA120_31==STARSi||(LA120_31>=PLUSSi && LA120_31<=FOR)||(LA120_31>=LET && LA120_31<=WHERE)||(LA120_31>=STABLE && LA120_31<=DESCENDING)||LA120_31==SATISFIES||LA120_31==CASE||(LA120_31>=ELSE && LA120_31<=INSTANCE)||(LA120_31>=TREAT && LA120_31<=CAST)||(LA120_31>=DBLSLASHSi && LA120_31<=SLASHSi)||(LA120_31>=LBRACKSi && LA120_31<=RBRACKSi)) ) {s = 30;}

                        else if ( (LA120_31==NCName) && (synpred3())) {s = 77;}

                        else if ( (LA120_31==RSELFTERMSi) && (synpred3())) {s = 78;}

                        else if ( (LA120_31==GTSi) && (synpred3())) {s = 79;}

                         
                        input.seek(index120_31);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA120_139 = input.LA(1);

                         
                        int index120_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_139);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA120_111 = input.LA(1);

                         
                        int index120_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_111);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA120_87 = input.LA(1);

                         
                        int index120_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_87);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA120_138 = input.LA(1);

                         
                        int index120_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_138);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA120_84 = input.LA(1);

                         
                        int index120_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_84);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA120_225 = input.LA(1);

                         
                        int index120_225 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_225==EOF||LA120_225==SEMICOLONSi||LA120_225==COMMASi||LA120_225==DEFAULT||LA120_225==COLLATION||(LA120_225>=ORDER && LA120_225<=EMPTY)||(LA120_225>=LPARSi && LA120_225<=RPARSi)||LA120_225==RBRACSi||LA120_225==STARSi||(LA120_225>=PLUSSi && LA120_225<=FOR)||(LA120_225>=LET && LA120_225<=WHERE)||(LA120_225>=STABLE && LA120_225<=DESCENDING)||LA120_225==SATISFIES||LA120_225==CASE||(LA120_225>=ELSE && LA120_225<=INSTANCE)||(LA120_225>=TREAT && LA120_225<=CAST)||(LA120_225>=DBLSLASHSi && LA120_225<=SLASHSi)||(LA120_225>=LBRACKSi && LA120_225<=RBRACKSi)) ) {s = 30;}

                        else if ( (LA120_225==NCName) && (synpred3())) {s = 77;}

                        else if ( (LA120_225==RSELFTERMSi) && (synpred3())) {s = 78;}

                        else if ( (LA120_225==GTSi) && (synpred3())) {s = 79;}

                         
                        input.seek(index120_225);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA120_2 = input.LA(1);

                         
                        int index120_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA120_2>=IntegerLiteral && LA120_2<=DoubleLiteral)) && (synpred3())) {s = 4;}

                        else if ( (LA120_2==StringLiteral) && (synpred3())) {s = 5;}

                        else if ( (LA120_2==DOLLARSi) && (synpred3())) {s = 6;}

                        else if ( (LA120_2==LPARSi) && (synpred3())) {s = 7;}

                        else if ( (LA120_2==DOTSi) && (synpred3())) {s = 8;}

                        else if ( (LA120_2==NCName) && (synpred3())) {s = 9;}

                        else if ( (LA120_2==ORDERED) && (synpred3())) {s = 10;}

                        else if ( (LA120_2==UNORDERED) && (synpred3())) {s = 11;}

                        else if ( (LA120_2==LTSi) ) {s = 12;}

                        else if ( (LA120_2==LCOMMENTSi) && (synpred3())) {s = 13;}

                        else if ( (LA120_2==LPISi) && (synpred3())) {s = 14;}

                        else if ( (LA120_2==DOCUMENT) && (synpred3())) {s = 15;}

                        else if ( (LA120_2==ELEMENT) && (synpred3())) {s = 16;}

                        else if ( (LA120_2==ATTRIBUTE) && (synpred3())) {s = 17;}

                        else if ( (LA120_2==TEXT) && (synpred3())) {s = 18;}

                        else if ( (LA120_2==COMMENT) && (synpred3())) {s = 19;}

                        else if ( (LA120_2==PROCESSING_INSTRUCTION) && (synpred3())) {s = 20;}

                        else if ( ((LA120_2>=PARENT && LA120_2<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 21;}

                        else if ( (LA120_2==DOTDOTSi) && (synpred3())) {s = 22;}

                        else if ( ((LA120_2>=CHILD && LA120_2<=FOLLOWING)) && (synpred3())) {s = 23;}

                        else if ( (LA120_2==ATSi) && (synpred3())) {s = 24;}

                        else if ( (LA120_2==DOCUMENT_NODE) && (synpred3())) {s = 25;}

                        else if ( (LA120_2==SCHEMAELEMENT) && (synpred3())) {s = 26;}

                        else if ( (LA120_2==SCHEMAATTRIBUTE) && (synpred3())) {s = 27;}

                        else if ( (LA120_2==NODE) && (synpred3())) {s = 28;}

                        else if ( (LA120_2==STARSi) ) {s = 29;}

                        else if ( (LA120_2==EOF||LA120_2==SEMICOLONSi||(LA120_2>=EQSi && LA120_2<=COMMASi)||LA120_2==DEFAULT||LA120_2==COLLATION||(LA120_2>=ORDER && LA120_2<=EMPTY)||LA120_2==RPARSi||LA120_2==RBRACSi||(LA120_2>=PLUSSi && LA120_2<=FOR)||(LA120_2>=LET && LA120_2<=WHERE)||(LA120_2>=STABLE && LA120_2<=DESCENDING)||LA120_2==SATISFIES||LA120_2==CASE||(LA120_2>=ELSE && LA120_2<=INSTANCE)||(LA120_2>=TREAT && LA120_2<=WITHOUT)||(LA120_2>=EQ && LA120_2<=NEQSi)||(LA120_2>=LTOREQSi && LA120_2<=NODEAFTERSi)||LA120_2==WORDS||LA120_2==TIMES||(LA120_2>=SENTENCES && LA120_2<=PARAGRAPHS)||LA120_2==LEVELS||LA120_2==RBRACKSi) ) {s = 30;}

                         
                        input.seek(index120_2);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA120_115 = input.LA(1);

                         
                        int index120_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_115);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA120_143 = input.LA(1);

                         
                        int index120_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_143);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA120_89 = input.LA(1);

                         
                        int index120_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_89);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA120_142 = input.LA(1);

                         
                        int index120_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_142);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA120_37 = input.LA(1);

                         
                        int index120_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_37==EOF||LA120_37==SEMICOLONSi||(LA120_37>=EQSi && LA120_37<=COMMASi)||LA120_37==DEFAULT||LA120_37==COLLATION||(LA120_37>=ORDER && LA120_37<=EMPTY)||LA120_37==COLONSi||LA120_37==RPARSi||LA120_37==RBRACSi||(LA120_37>=RETURN && LA120_37<=FOR)||(LA120_37>=LET && LA120_37<=WHERE)||(LA120_37>=STABLE && LA120_37<=DESCENDING)||LA120_37==SATISFIES||LA120_37==CASE||(LA120_37>=ELSE && LA120_37<=TO)||(LA120_37>=DIV && LA120_37<=INSTANCE)||(LA120_37>=TREAT && LA120_37<=WITHOUT)||(LA120_37>=EQ && LA120_37<=NEQSi)||(LA120_37>=LTOREQSi && LA120_37<=NODEAFTERSi)||LA120_37==WORDS||LA120_37==TIMES||(LA120_37>=SENTENCES && LA120_37<=PARAGRAPHS)||LA120_37==LEVELS||(LA120_37>=LBRACKSi && LA120_37<=RBRACKSi)) ) {s = 30;}

                        else if ( (LA120_37==PLUSSi||LA120_37==MINUSSi) ) {s = 194;}

                        else if ( (LA120_37==VALIDATE) && (synpred3())) {s = 195;}

                        else if ( (LA120_37==DBLSLASHSi) ) {s = 196;}

                        else if ( (LA120_37==SLASHSi) ) {s = 197;}

                        else if ( ((LA120_37>=IntegerLiteral && LA120_37<=DoubleLiteral)) && (synpred3())) {s = 198;}

                        else if ( (LA120_37==StringLiteral) && (synpred3())) {s = 199;}

                        else if ( (LA120_37==DOLLARSi) && (synpred3())) {s = 200;}

                        else if ( (LA120_37==LPARSi) && (synpred3())) {s = 201;}

                        else if ( (LA120_37==DOTSi) && (synpred3())) {s = 202;}

                        else if ( (LA120_37==NCName) && (synpred3())) {s = 203;}

                        else if ( (LA120_37==ORDERED) && (synpred3())) {s = 204;}

                        else if ( (LA120_37==UNORDERED) && (synpred3())) {s = 205;}

                        else if ( (LA120_37==LTSi) ) {s = 206;}

                        else if ( (LA120_37==LCOMMENTSi) && (synpred3())) {s = 207;}

                        else if ( (LA120_37==LPISi) && (synpred3())) {s = 208;}

                        else if ( (LA120_37==DOCUMENT) && (synpred3())) {s = 209;}

                        else if ( (LA120_37==ELEMENT) && (synpred3())) {s = 210;}

                        else if ( (LA120_37==ATTRIBUTE) && (synpred3())) {s = 211;}

                        else if ( (LA120_37==TEXT) && (synpred3())) {s = 212;}

                        else if ( (LA120_37==COMMENT) && (synpred3())) {s = 213;}

                        else if ( (LA120_37==PROCESSING_INSTRUCTION) && (synpred3())) {s = 214;}

                        else if ( ((LA120_37>=PARENT && LA120_37<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 215;}

                        else if ( (LA120_37==DOTDOTSi) && (synpred3())) {s = 216;}

                        else if ( ((LA120_37>=CHILD && LA120_37<=FOLLOWING)) && (synpred3())) {s = 217;}

                        else if ( (LA120_37==ATSi) && (synpred3())) {s = 218;}

                        else if ( (LA120_37==DOCUMENT_NODE) && (synpred3())) {s = 219;}

                        else if ( (LA120_37==SCHEMAELEMENT) && (synpred3())) {s = 220;}

                        else if ( (LA120_37==SCHEMAATTRIBUTE) && (synpred3())) {s = 221;}

                        else if ( (LA120_37==NODE) && (synpred3())) {s = 222;}

                        else if ( (LA120_37==STARSi) ) {s = 223;}

                        else if ( (LA120_37==LPRAGSi) && (synpred3())) {s = 224;}

                         
                        input.seek(index120_37);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA120_0 = input.LA(1);

                         
                        int index120_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_0==DBLSLASHSi) && (synpred2())) {s = 1;}

                        else if ( (LA120_0==SLASHSi) ) {s = 2;}

                        else if ( (LA120_0==StringLiteral||LA120_0==NCName||LA120_0==ELEMENT||(LA120_0>=ORDERED && LA120_0<=UNORDERED)||LA120_0==DOLLARSi||LA120_0==LPARSi||LA120_0==DOCUMENT_NODE||(LA120_0>=STARSi && LA120_0<=NODE)||LA120_0==LTSi||(LA120_0>=IntegerLiteral && LA120_0<=DoubleLiteral)||(LA120_0>=PARENT && LA120_0<=ANCESTOR_OR_SELF)||(LA120_0>=DOTDOTSi && LA120_0<=ATSi)||LA120_0==DOTSi||LA120_0==LCOMMENTSi||LA120_0==LPISi||LA120_0==DOCUMENT) ) {s = 3;}

                         
                        input.seek(index120_0);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA120_36 = input.LA(1);

                         
                        int index120_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_36==PLUSSi||LA120_36==MINUSSi) && (synpred3())) {s = 163;}

                        else if ( (LA120_36==VALIDATE) && (synpred3())) {s = 164;}

                        else if ( (LA120_36==DBLSLASHSi) && (synpred3())) {s = 165;}

                        else if ( (LA120_36==SLASHSi) && (synpred3())) {s = 166;}

                        else if ( ((LA120_36>=IntegerLiteral && LA120_36<=DoubleLiteral)) && (synpred3())) {s = 167;}

                        else if ( (LA120_36==StringLiteral) && (synpred3())) {s = 168;}

                        else if ( (LA120_36==DOLLARSi) && (synpred3())) {s = 169;}

                        else if ( (LA120_36==LPARSi) && (synpred3())) {s = 170;}

                        else if ( (LA120_36==DOTSi) && (synpred3())) {s = 171;}

                        else if ( (LA120_36==NCName) ) {s = 172;}

                        else if ( (LA120_36==ORDERED) && (synpred3())) {s = 173;}

                        else if ( (LA120_36==UNORDERED) && (synpred3())) {s = 174;}

                        else if ( (LA120_36==LTSi) && (synpred3())) {s = 175;}

                        else if ( (LA120_36==LCOMMENTSi) && (synpred3())) {s = 176;}

                        else if ( (LA120_36==LPISi) && (synpred3())) {s = 177;}

                        else if ( (LA120_36==DOCUMENT) && (synpred3())) {s = 178;}

                        else if ( (LA120_36==ELEMENT) && (synpred3())) {s = 179;}

                        else if ( (LA120_36==ATTRIBUTE) && (synpred3())) {s = 180;}

                        else if ( (LA120_36==TEXT) && (synpred3())) {s = 181;}

                        else if ( (LA120_36==COMMENT) && (synpred3())) {s = 182;}

                        else if ( (LA120_36==PROCESSING_INSTRUCTION) && (synpred3())) {s = 183;}

                        else if ( ((LA120_36>=PARENT && LA120_36<=ANCESTOR_OR_SELF)) && (synpred3())) {s = 184;}

                        else if ( (LA120_36==DOTDOTSi) && (synpred3())) {s = 185;}

                        else if ( ((LA120_36>=CHILD && LA120_36<=FOLLOWING)) && (synpred3())) {s = 186;}

                        else if ( (LA120_36==ATSi) && (synpred3())) {s = 187;}

                        else if ( (LA120_36==DOCUMENT_NODE) && (synpred3())) {s = 188;}

                        else if ( (LA120_36==SCHEMAELEMENT) && (synpred3())) {s = 189;}

                        else if ( (LA120_36==SCHEMAATTRIBUTE) && (synpred3())) {s = 190;}

                        else if ( (LA120_36==NODE) && (synpred3())) {s = 191;}

                        else if ( (LA120_36==STARSi) && (synpred3())) {s = 192;}

                        else if ( (LA120_36==LPRAGSi) && (synpred3())) {s = 193;}

                         
                        input.seek(index120_36);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA120_83 = input.LA(1);

                         
                        int index120_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_83);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA120_29 = input.LA(1);

                         
                        int index120_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_29==COLONSi) && (synpred3())) {s = 32;}

                        else if ( (LA120_29==PLUSSi||LA120_29==MINUSSi) ) {s = 33;}

                        else if ( (LA120_29==StringLiteral||LA120_29==NCName||LA120_29==ELEMENT||(LA120_29>=ORDERED && LA120_29<=UNORDERED)||LA120_29==DOLLARSi||LA120_29==LPARSi||LA120_29==DOCUMENT_NODE||(LA120_29>=SCHEMAELEMENT && LA120_29<=NODE)||(LA120_29>=IntegerLiteral && LA120_29<=DoubleLiteral)||LA120_29==LPRAGSi||LA120_29==VALIDATE||(LA120_29>=PARENT && LA120_29<=ANCESTOR_OR_SELF)||(LA120_29>=DOTDOTSi && LA120_29<=ATSi)||LA120_29==DOTSi||LA120_29==LCOMMENTSi||LA120_29==LPISi||LA120_29==DOCUMENT) ) {s = 30;}

                        else if ( (LA120_29==DBLSLASHSi) ) {s = 34;}

                        else if ( (LA120_29==SLASHSi) ) {s = 35;}

                        else if ( (LA120_29==LTSi) ) {s = 36;}

                        else if ( (LA120_29==STARSi) ) {s = 37;}

                        else if ( (LA120_29==LBRACKSi) && (synpred3())) {s = 38;}

                        else if ( (LA120_29==CAST) && (synpred3())) {s = 39;}

                        else if ( (LA120_29==CASTABLE) && (synpred3())) {s = 40;}

                        else if ( (LA120_29==TREAT) && (synpred3())) {s = 41;}

                        else if ( (LA120_29==INSTANCE) && (synpred3())) {s = 42;}

                        else if ( ((LA120_29>=INTERSECT && LA120_29<=EXCEPT)) && (synpred3())) {s = 43;}

                        else if ( ((LA120_29>=UNION && LA120_29<=PIPESi)) && (synpred3())) {s = 44;}

                        else if ( ((LA120_29>=DIV && LA120_29<=MOD)) && (synpred3())) {s = 45;}

                        else if ( (LA120_29==TO) && (synpred3())) {s = 46;}

                        else if ( (LA120_29==FTCONTAINS) && (synpred3())) {s = 47;}

                        else if ( ((LA120_29>=EQ && LA120_29<=GE)) && (synpred3())) {s = 48;}

                        else if ( (LA120_29==EQSi||LA120_29==NEQSi||(LA120_29>=LTOREQSi && LA120_29<=GTOREQSi)) && (synpred3())) {s = 49;}

                        else if ( ((LA120_29>=IS && LA120_29<=NODEAFTERSi)) && (synpred3())) {s = 50;}

                        else if ( (LA120_29==AND) && (synpred3())) {s = 51;}

                        else if ( (LA120_29==OR) && (synpred3())) {s = 52;}

                        else if ( (LA120_29==COMMASi) && (synpred3())) {s = 53;}

                        else if ( (LA120_29==EOF) && (synpred3())) {s = 54;}

                        else if ( (LA120_29==RBRACSi) && (synpred3())) {s = 55;}

                        else if ( (LA120_29==RPARSi) && (synpred3())) {s = 56;}

                        else if ( (LA120_29==RBRACKSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_29==SEMICOLONSi) && (synpred3())) {s = 58;}

                        else if ( (LA120_29==WHERE) && (synpred3())) {s = 59;}

                        else if ( (LA120_29==ORDER) && (synpred3())) {s = 60;}

                        else if ( (LA120_29==STABLE) && (synpred3())) {s = 61;}

                        else if ( (LA120_29==RETURN) && (synpred3())) {s = 62;}

                        else if ( (LA120_29==FOR) && (synpred3())) {s = 63;}

                        else if ( (LA120_29==LET) && (synpred3())) {s = 64;}

                        else if ( ((LA120_29>=ASCENDING && LA120_29<=DESCENDING)) && (synpred3())) {s = 65;}

                        else if ( (LA120_29==EMPTY) && (synpred3())) {s = 66;}

                        else if ( (LA120_29==COLLATION) && (synpred3())) {s = 67;}

                        else if ( (LA120_29==SATISFIES) && (synpred3())) {s = 68;}

                        else if ( (LA120_29==DEFAULT) && (synpred3())) {s = 69;}

                        else if ( (LA120_29==CASE) && (synpred3())) {s = 70;}

                        else if ( (LA120_29==ELSE) && (synpred3())) {s = 71;}

                        else if ( (LA120_29==WITHOUT) && (synpred3())) {s = 72;}

                        else if ( (LA120_29==TIMES) && (synpred3())) {s = 73;}

                        else if ( (LA120_29==WORDS||(LA120_29>=SENTENCES && LA120_29<=PARAGRAPHS)) && (synpred3())) {s = 74;}

                        else if ( (LA120_29==LEVELS) && (synpred3())) {s = 75;}

                         
                        input.seek(index120_29);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA120_223 = input.LA(1);

                         
                        int index120_223 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_223==COLONSi) && (synpred3())) {s = 460;}

                        else if ( (LA120_223==PLUSSi||LA120_223==MINUSSi) ) {s = 33;}

                        else if ( (LA120_223==StringLiteral||LA120_223==NCName||LA120_223==ELEMENT||(LA120_223>=ORDERED && LA120_223<=UNORDERED)||LA120_223==DOLLARSi||LA120_223==LPARSi||LA120_223==DOCUMENT_NODE||(LA120_223>=SCHEMAELEMENT && LA120_223<=NODE)||(LA120_223>=IntegerLiteral && LA120_223<=DoubleLiteral)||LA120_223==LPRAGSi||LA120_223==VALIDATE||(LA120_223>=PARENT && LA120_223<=ANCESTOR_OR_SELF)||(LA120_223>=DOTDOTSi && LA120_223<=ATSi)||LA120_223==DOTSi||LA120_223==LCOMMENTSi||LA120_223==LPISi||LA120_223==DOCUMENT) ) {s = 30;}

                        else if ( (LA120_223==DBLSLASHSi) ) {s = 461;}

                        else if ( (LA120_223==SLASHSi) ) {s = 462;}

                        else if ( (LA120_223==LTSi) ) {s = 36;}

                        else if ( (LA120_223==STARSi) ) {s = 37;}

                        else if ( (LA120_223==LBRACKSi) && (synpred3())) {s = 463;}

                        else if ( (LA120_223==CAST) && (synpred3())) {s = 426;}

                        else if ( (LA120_223==CASTABLE) && (synpred3())) {s = 427;}

                        else if ( (LA120_223==TREAT) && (synpred3())) {s = 428;}

                        else if ( (LA120_223==INSTANCE) && (synpred3())) {s = 429;}

                        else if ( ((LA120_223>=INTERSECT && LA120_223<=EXCEPT)) && (synpred3())) {s = 430;}

                        else if ( ((LA120_223>=UNION && LA120_223<=PIPESi)) && (synpred3())) {s = 431;}

                        else if ( (LA120_223==TO) && (synpred3())) {s = 46;}

                        else if ( (LA120_223==FTCONTAINS) && (synpred3())) {s = 47;}

                        else if ( ((LA120_223>=EQ && LA120_223<=GE)) && (synpred3())) {s = 48;}

                        else if ( (LA120_223==EQSi||LA120_223==NEQSi||(LA120_223>=LTOREQSi && LA120_223<=GTOREQSi)) && (synpred3())) {s = 49;}

                        else if ( ((LA120_223>=IS && LA120_223<=NODEAFTERSi)) && (synpred3())) {s = 50;}

                        else if ( (LA120_223==AND) && (synpred3())) {s = 51;}

                        else if ( (LA120_223==OR) && (synpred3())) {s = 52;}

                        else if ( (LA120_223==COMMASi) && (synpred3())) {s = 53;}

                        else if ( (LA120_223==EOF) && (synpred3())) {s = 54;}

                        else if ( (LA120_223==RBRACSi) && (synpred3())) {s = 55;}

                        else if ( (LA120_223==RPARSi) && (synpred3())) {s = 56;}

                        else if ( (LA120_223==RBRACKSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_223==SEMICOLONSi) && (synpred3())) {s = 58;}

                        else if ( (LA120_223==WHERE) && (synpred3())) {s = 59;}

                        else if ( (LA120_223==ORDER) && (synpred3())) {s = 60;}

                        else if ( (LA120_223==STABLE) && (synpred3())) {s = 61;}

                        else if ( (LA120_223==RETURN) && (synpred3())) {s = 62;}

                        else if ( (LA120_223==FOR) && (synpred3())) {s = 63;}

                        else if ( (LA120_223==LET) && (synpred3())) {s = 64;}

                        else if ( ((LA120_223>=ASCENDING && LA120_223<=DESCENDING)) && (synpred3())) {s = 65;}

                        else if ( (LA120_223==EMPTY) && (synpred3())) {s = 66;}

                        else if ( (LA120_223==COLLATION) && (synpred3())) {s = 67;}

                        else if ( (LA120_223==SATISFIES) && (synpred3())) {s = 68;}

                        else if ( (LA120_223==DEFAULT) && (synpred3())) {s = 69;}

                        else if ( (LA120_223==CASE) && (synpred3())) {s = 70;}

                        else if ( (LA120_223==ELSE) && (synpred3())) {s = 71;}

                        else if ( (LA120_223==WITHOUT) && (synpred3())) {s = 72;}

                        else if ( (LA120_223==TIMES) && (synpred3())) {s = 73;}

                        else if ( (LA120_223==WORDS||(LA120_223>=SENTENCES && LA120_223<=PARAGRAPHS)) && (synpred3())) {s = 74;}

                        else if ( (LA120_223==LEVELS) && (synpred3())) {s = 75;}

                        else if ( ((LA120_223>=DIV && LA120_223<=MOD)) && (synpred3())) {s = 45;}

                         
                        input.seek(index120_223);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA120_102 = input.LA(1);

                         
                        int index120_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_102);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA120_136 = input.LA(1);

                         
                        int index120_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_136);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA120_197 = input.LA(1);

                         
                        int index120_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_197==CAST) && (synpred3())) {s = 426;}

                        else if ( (LA120_197==CASTABLE) && (synpred3())) {s = 427;}

                        else if ( (LA120_197==TREAT) && (synpred3())) {s = 428;}

                        else if ( (LA120_197==INSTANCE) && (synpred3())) {s = 429;}

                        else if ( ((LA120_197>=INTERSECT && LA120_197<=EXCEPT)) && (synpred3())) {s = 430;}

                        else if ( ((LA120_197>=UNION && LA120_197<=PIPESi)) && (synpred3())) {s = 431;}

                        else if ( (LA120_197==PLUSSi||LA120_197==MINUSSi) && (synpred3())) {s = 432;}

                        else if ( (LA120_197==TO) && (synpred3())) {s = 46;}

                        else if ( (LA120_197==FTCONTAINS) && (synpred3())) {s = 47;}

                        else if ( ((LA120_197>=EQ && LA120_197<=GE)) && (synpred3())) {s = 48;}

                        else if ( (LA120_197==LTSi) ) {s = 433;}

                        else if ( ((LA120_197>=IS && LA120_197<=NODEAFTERSi)) && (synpred3())) {s = 50;}

                        else if ( (LA120_197==AND) && (synpred3())) {s = 51;}

                        else if ( (LA120_197==OR) && (synpred3())) {s = 52;}

                        else if ( (LA120_197==COMMASi) && (synpred3())) {s = 53;}

                        else if ( (LA120_197==EOF) && (synpred3())) {s = 54;}

                        else if ( (LA120_197==RBRACSi) && (synpred3())) {s = 55;}

                        else if ( (LA120_197==RPARSi) && (synpred3())) {s = 56;}

                        else if ( (LA120_197==RBRACKSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_197==SEMICOLONSi) && (synpred3())) {s = 58;}

                        else if ( (LA120_197==WHERE) && (synpred3())) {s = 59;}

                        else if ( (LA120_197==ORDER) && (synpred3())) {s = 60;}

                        else if ( (LA120_197==STABLE) && (synpred3())) {s = 61;}

                        else if ( (LA120_197==RETURN) && (synpred3())) {s = 62;}

                        else if ( (LA120_197==FOR) && (synpred3())) {s = 63;}

                        else if ( (LA120_197==LET) && (synpred3())) {s = 64;}

                        else if ( ((LA120_197>=ASCENDING && LA120_197<=DESCENDING)) && (synpred3())) {s = 65;}

                        else if ( (LA120_197==EMPTY) && (synpred3())) {s = 66;}

                        else if ( (LA120_197==COLLATION) && (synpred3())) {s = 67;}

                        else if ( (LA120_197==SATISFIES) && (synpred3())) {s = 68;}

                        else if ( (LA120_197==DEFAULT) && (synpred3())) {s = 69;}

                        else if ( (LA120_197==CASE) && (synpred3())) {s = 70;}

                        else if ( (LA120_197==ELSE) && (synpred3())) {s = 71;}

                        else if ( (LA120_197==WITHOUT) && (synpred3())) {s = 72;}

                        else if ( (LA120_197==TIMES) && (synpred3())) {s = 73;}

                        else if ( (LA120_197==WORDS||(LA120_197>=SENTENCES && LA120_197<=PARAGRAPHS)) && (synpred3())) {s = 74;}

                        else if ( (LA120_197==LEVELS) && (synpred3())) {s = 75;}

                        else if ( (LA120_197==STARSi) ) {s = 434;}

                        else if ( ((LA120_197>=IntegerLiteral && LA120_197<=DoubleLiteral)) ) {s = 435;}

                        else if ( (LA120_197==StringLiteral) ) {s = 436;}

                        else if ( (LA120_197==DOLLARSi) ) {s = 437;}

                        else if ( (LA120_197==LPARSi) ) {s = 438;}

                        else if ( (LA120_197==DOTSi) ) {s = 439;}

                        else if ( (LA120_197==NCName) ) {s = 440;}

                        else if ( (LA120_197==ORDERED) ) {s = 441;}

                        else if ( (LA120_197==UNORDERED) ) {s = 442;}

                        else if ( (LA120_197==EQSi||LA120_197==NEQSi||(LA120_197>=LTOREQSi && LA120_197<=GTOREQSi)) && (synpred3())) {s = 49;}

                        else if ( (LA120_197==LCOMMENTSi) ) {s = 443;}

                        else if ( (LA120_197==LPISi) ) {s = 444;}

                        else if ( (LA120_197==DOCUMENT) ) {s = 445;}

                        else if ( (LA120_197==ELEMENT) ) {s = 446;}

                        else if ( (LA120_197==ATTRIBUTE) ) {s = 447;}

                        else if ( (LA120_197==TEXT) ) {s = 448;}

                        else if ( (LA120_197==COMMENT) ) {s = 449;}

                        else if ( (LA120_197==PROCESSING_INSTRUCTION) ) {s = 450;}

                        else if ( ((LA120_197>=PARENT && LA120_197<=ANCESTOR_OR_SELF)) ) {s = 451;}

                        else if ( (LA120_197==DOTDOTSi) ) {s = 452;}

                        else if ( ((LA120_197>=CHILD && LA120_197<=FOLLOWING)) ) {s = 453;}

                        else if ( (LA120_197==ATSi) ) {s = 454;}

                        else if ( (LA120_197==DOCUMENT_NODE) ) {s = 455;}

                        else if ( (LA120_197==SCHEMAELEMENT) ) {s = 456;}

                        else if ( (LA120_197==SCHEMAATTRIBUTE) ) {s = 457;}

                        else if ( (LA120_197==NODE) ) {s = 458;}

                        else if ( ((LA120_197>=DIV && LA120_197<=MOD)) && (synpred3())) {s = 45;}

                         
                        input.seek(index120_197);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA120_114 = input.LA(1);

                         
                        int index120_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_114);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA120_112 = input.LA(1);

                         
                        int index120_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_112);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA120_140 = input.LA(1);

                         
                        int index120_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_140);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA120_85 = input.LA(1);

                         
                        int index120_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_85);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA120_116 = input.LA(1);

                         
                        int index120_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_116);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA120_88 = input.LA(1);

                         
                        int index120_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_88);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA120_144 = input.LA(1);

                         
                        int index120_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_144);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA120_172 = input.LA(1);

                         
                        int index120_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_172==COLONSi) ) {s = 353;}

                        else if ( (LA120_172==LPARSi) && (synpred3())) {s = 354;}

                        else if ( (LA120_172==NCName||LA120_172==GTSi||LA120_172==RSELFTERMSi) ) {s = 30;}

                        else if ( (LA120_172==LBRACKSi) && (synpred3())) {s = 355;}

                        else if ( ((LA120_172>=DBLSLASHSi && LA120_172<=SLASHSi)) && (synpred3())) {s = 356;}

                        else if ( (LA120_172==CAST) && (synpred3())) {s = 357;}

                        else if ( (LA120_172==CASTABLE) && (synpred3())) {s = 358;}

                        else if ( (LA120_172==TREAT) && (synpred3())) {s = 359;}

                        else if ( (LA120_172==INSTANCE) && (synpred3())) {s = 360;}

                        else if ( ((LA120_172>=INTERSECT && LA120_172<=EXCEPT)) && (synpred3())) {s = 361;}

                        else if ( ((LA120_172>=UNION && LA120_172<=PIPESi)) && (synpred3())) {s = 362;}

                        else if ( (LA120_172==STARSi||(LA120_172>=DIV && LA120_172<=MOD)) && (synpred3())) {s = 363;}

                        else if ( (LA120_172==PLUSSi||LA120_172==MINUSSi) && (synpred3())) {s = 364;}

                        else if ( (LA120_172==TO) && (synpred3())) {s = 365;}

                        else if ( (LA120_172==FTCONTAINS) && (synpred3())) {s = 366;}

                        else if ( (LA120_172==AND) && (synpred3())) {s = 51;}

                        else if ( (LA120_172==OR) && (synpred3())) {s = 52;}

                        else if ( (LA120_172==COMMASi) && (synpred3())) {s = 53;}

                        else if ( (LA120_172==EOF) && (synpred3())) {s = 54;}

                        else if ( (LA120_172==RBRACSi) && (synpred3())) {s = 367;}

                        else if ( (LA120_172==RPARSi) && (synpred3())) {s = 368;}

                        else if ( (LA120_172==RBRACKSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_172==SEMICOLONSi) && (synpred3())) {s = 58;}

                        else if ( (LA120_172==WHERE) && (synpred3())) {s = 59;}

                        else if ( (LA120_172==ORDER) && (synpred3())) {s = 60;}

                        else if ( (LA120_172==STABLE) && (synpred3())) {s = 61;}

                        else if ( (LA120_172==RETURN) && (synpred3())) {s = 62;}

                        else if ( (LA120_172==FOR) && (synpred3())) {s = 63;}

                        else if ( (LA120_172==LET) && (synpred3())) {s = 64;}

                        else if ( ((LA120_172>=ASCENDING && LA120_172<=DESCENDING)) && (synpred3())) {s = 65;}

                        else if ( (LA120_172==EMPTY) && (synpred3())) {s = 66;}

                        else if ( (LA120_172==COLLATION) && (synpred3())) {s = 67;}

                        else if ( (LA120_172==SATISFIES) && (synpred3())) {s = 68;}

                        else if ( (LA120_172==DEFAULT) && (synpred3())) {s = 69;}

                        else if ( (LA120_172==CASE) && (synpred3())) {s = 70;}

                        else if ( (LA120_172==ELSE) && (synpred3())) {s = 71;}

                         
                        input.seek(index120_172);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA120_129 = input.LA(1);

                         
                        int index120_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_129);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA120_156 = input.LA(1);

                         
                        int index120_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_156);
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
 

    public static final BitSet FOLLOW_versionDecl_in_module92 = new BitSet(new long[]{0x7FD0108806014A40L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_libraryModule_in_module96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl133 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl136 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl138 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_versionDecl142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule200 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl231 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl233 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl237 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl239 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_moduleDecl241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule303 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_queryBody_in_mainModule305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr372 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_expr375 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_expr377 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog442 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_setter_in_prolog446 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog450 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_importStmt_in_prolog454 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog469 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_varDecl_in_prolog511 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_functionDecl_in_prolog515 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_optionDecl_in_prolog519 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog523 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_separator_in_prolog537 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl570 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl572 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl574 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl582 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl727 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl729 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl755 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl757 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl788 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl814 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl816 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_constructionDecl818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl846 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl848 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl880 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl882 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl884 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl886 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl914 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl916 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl918 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl920 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl1013 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl1015 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl1017 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl1019 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport1079 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1081 = new BitSet(new long[]{0x0000000000008440L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1086 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_schemaImport1089 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1091 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1094 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1096 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1128 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix1130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1138 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1140 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport1169 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1171 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1174 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_moduleImport1176 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1182 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_AT_in_moduleImport1185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1187 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1190 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1192 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl1228 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl1230 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl1232 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_varDecl1234 = new BitSet(new long[]{0x00000B0000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl1236 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl1241 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1269 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_COLONSi_in_qName1274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_qName1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration1305 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl1336 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl1338 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_functionDecl1340 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl1342 = new BitSet(new long[]{0x0000208000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl1344 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl1347 = new BitSet(new long[]{0x00004A0000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl1362 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl1364 = new BitSet(new long[]{0x0000420000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList1403 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_paramList1406 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_param_in_paramList1408 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOLLARSi_in_param1444 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_param1446 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_param1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr1493 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr1508 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl1570 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl1572 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_optionDecl1574 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl1602 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl1604 = new BitSet(new long[]{0x0001000000000000L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions1630 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1682 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType1712 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType1714 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType1763 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType1765 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest2152 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest2154 = new BitSet(new long[]{0x0080200000010000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest2157 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest2161 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest2193 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest2195 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest2198 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest2201 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_elementTest2203 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest2205 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest2364 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest2366 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest2368 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest2426 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest2428 = new BitSet(new long[]{0x0040200000000800L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest2431 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest2434 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_typeName_in_attributeTest2436 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2521 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest2523 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest2525 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest2583 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest2585 = new BitSet(new long[]{0x0000200000000840L});
    public static final BitSet FOLLOW_set_in_piTest2587 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest2625 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest2627 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest2661 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest2663 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest2694 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest2696 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr2985 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr2989 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000059L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr2993 = new BitSet(new long[]{0x8000000008000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr2996 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr2999 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause3033 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3035 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause3037 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3039 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause3048 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3050 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_forClause3067 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3069 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_forClause3071 = new BitSet(new long[]{0x0000082000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3073 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_forClause3082 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3084 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_qName_in_varName3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar3142 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar3144 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_positionalVar3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar3177 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar3179 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause3231 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varBinding_in_letClause3233 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_letClause3236 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varBinding_in_letClause3238 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3253 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varBinding3257 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varBinding3259 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SCORE_in_varBinding3266 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3268 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varBinding3272 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varBinding3289 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_varBinding3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause3329 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3365 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause3369 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_BY_in_orderByClause3373 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3402 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList3405 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3407 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec3440 = new BitSet(new long[]{0x0000000010200002L,0x0000000000000180L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier3471 = new BitSet(new long[]{0x0000000010200002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier3481 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_set_in_orderModifier3483 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier3494 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr3531 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3539 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3541 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3546 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3548 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr3564 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3566 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3568 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3573 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3575 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000800L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr3579 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr3614 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr3616 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr3618 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr3622 = new BitSet(new long[]{0x0000000000008000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr3638 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr3641 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr3643 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr3647 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause3680 = new BitSet(new long[]{0x3F9C008000010800L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause3683 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_caseClause3685 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_caseClause3687 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause3691 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause3693 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr3736 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr3738 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_ifExpr3740 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr3742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr3744 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr3748 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_OR_in_orExpr3795 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3832 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_AND_in_andExpr3836 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3838 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3872 = new BitSet(new long[]{0x0000000000001002L,0x0003FFF000000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr3877 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr3881 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr3885 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr3917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr3921 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr3923 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr3965 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr3998 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_additiveExpr4002 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4010 = new BitSet(new long[]{0x4000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4036 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr4040 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4056 = new BitSet(new long[]{0x0040000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4092 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_set_in_unionExpr4096 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4104 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4131 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr4135 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4143 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr4176 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr4180 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr4182 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr4223 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr4227 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_treatExpr4229 = new BitSet(new long[]{0x3F9C000000010800L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr4268 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr4272 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castableExpr4274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castableExpr4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr4318 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_CAST_in_castExpr4322 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_AS_in_castExpr4324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_singleType_in_castExpr4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr4368 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType4416 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption4494 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption4496 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection4676 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000021C80L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection4678 = new BitSet(new long[]{0x0000002002000002L,0x0004000000000000L,0x0000000000021C80L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection4682 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4722 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_FTOR_in_ftOr4726 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4728 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4765 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd4769 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4771 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4805 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot4809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_ftMildNot4811 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4813 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot4848 = new BitSet(new long[]{0x0000500000000040L,0x0380000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions4874 = new BitSet(new long[]{0x0001000000000002L,0x0000000400002000L,0x00000000380C0000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary4917 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary4941 = new BitSet(new long[]{0x0000500000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary4943 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords5020 = new BitSet(new long[]{0x0000000000000002L,0x5400000000000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue5061 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue5063 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption5182 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption5191 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes5236 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftTimes5238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange5279 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5323 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LEAST_in_ftRange5325 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_MOST_in_ftRange5372 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange5422 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TO_in_ftRange5426 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection5455 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection5458 = new BitSet(new long[]{0x0000D00000000040L,0x03C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection5460 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma5502 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_pragma5504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_PragmaContents_in_pragma5506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow5643 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000200000L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow5645 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance5720 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftDistance5722 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope5762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_START_in_ftContent5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ftContent5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent5848 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption6279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption6307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption6313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6340 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6365 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption6367 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6370 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6374 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption6378 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6380 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption6423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID6487 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID6489 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000040000AL});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID6492 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID6494 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID6499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption6546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption6552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption6625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption6867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption6884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption6942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption6944 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption6946 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption6948 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption6950 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption6966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption6968 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7009 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption7011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7013 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7015 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7017 = new BitSet(new long[]{0x0000000000000002L,0x0000000012000000L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList7083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList7102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7104 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList7107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7109 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral7130 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption7172 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption7174 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr7244 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr7246 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr7249 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_validateExpr7251 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr7329 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x8013FDF000000000L,0x0000000000000044L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7355 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x8013FDF000000000L,0x0000000000000044L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr7413 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x8013FDF000000000L,0x0000000000000044L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7536 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis7573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7717 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7719 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_wildcard7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard7791 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7793 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep7899 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis7952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep8039 = new BitSet(new long[]{0x3FD0000000010800L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList8116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate8176 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_predicate8178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr8220 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr8223 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_extensionExpr8225 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr8263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr8342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr8390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr8406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef8444 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_varName_in_varRef8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr8469 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr8471 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall8527 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall8529 = new BitSet(new long[]{0x7FD0308006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8547 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall8550 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8552 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr8602 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr8604 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_orderedExpr8606 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr8608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr8636 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr8638 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr8640 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor8677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor8787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor8845 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8874 = new BitSet(new long[]{0x0000000000000800L,0x0000200000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor8876 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor8935 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0x9840000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor8964 = new BitSet(new long[]{0x0000400000000000L,0x0000080000000000L,0x9840000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor8993 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor9023 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList9119 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList9121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0280000000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList9123 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9161 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_QuotAttributeContent_in_dirAttributeValue9192 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9196 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9262 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_AposAttributeContent_in_dirAttributeValue9296 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9300 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_xmlEnclosedExpr9376 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_xmlEnclosedExpr9404 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_xmlEnclosedExpr9432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent9465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContent_in_dirElemContent9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirElemContent9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCDATASi_in_cDataSection9497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CDataContents_in_cDataSection9499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_RCDATASi_in_cDataSection9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCOMMENTSi_in_dirCommentConstructor9524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DirCommentContent_in_dirCommentConstructor9526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RCOMMENTSi_in_dirCommentConstructor9528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPIConstructor9549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_PiTarget_in_dirPIConstructor9551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_DirPiContents_in_dirPIConstructor9553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPISi_in_dirPIConstructor9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor9787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor9815 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor9817 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor9819 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor9821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor9850 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor9853 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9857 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor9859 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9861 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9880 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor9882 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr9918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor9963 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor9966 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9971 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9973 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9975 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9995 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9997 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor10000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor10036 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor10038 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor10040 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor10042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor10066 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor10068 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor10070 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10101 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor10104 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10109 = new BitSet(new long[]{0x7FD0108006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10111 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10113 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10133 = new BitSet(new long[]{0x7FD0908006010840L,0x0380080000205609L,0x8013FDFC80000010L,0x0000000000000044L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10135 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred11675 = new BitSet(new long[]{0x4060000000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_synpred27323 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x8013FDF000000000L,0x0000000000000044L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred27325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred37348 = new BitSet(new long[]{0x3FD0108006010840L,0x0380080000000000L,0x8013FDF000000000L,0x0000000000000044L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred37350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred47708 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred47710 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NCName_in_synpred47712 = new BitSet(new long[]{0x0000000000000002L});

}