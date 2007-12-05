// $ANTLR 3.0.1 etc/XQFT.g 2007-12-05 18:23:44

	package no.ntnu.xqft.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "ANY", "ANCESTOR", "ANCESTOR_OR_SELF", "AND", "AS", "ASCENDING", "AT", "ATTRIBUTE", "BASE_URI", "BY", "BOUNDARYSPACE", "CASE", "CAST", "CASTABLE", "CHILD", "COLLATION", "COMMENT", "CONSTRUCTION", "CONTENT", "COPY_NAMESPACES", "DECLARE", "DEFAULT", "DESCENDANT", "DESCENDANT_OR_SELF", "DESCENDING", "DIACRITICS", "DIFFERENT", "DISTANCE", "DIV", "DOCUMENT", "DOCUMENT_NODE", "ELEMENT", "ELSE", "ENCODING", "END", "ENTIRE", "EMPTY", "EMPTY_SEQUENCE", "EQ", "EVERY", "EXACTLY", "EXCEPT", "EXTERNAL", "FOLLOWING", "FOLLOWING_SIBLING", "FOR", "FROM", "FTAND", "FTCONTAINS", "FTNOT", "FTOPTION", "FTOR", "FUNCTION", "GE", "GREATEST", "GT", "IDIV", "IF", "IMPORT", "IN", "INHERIT", "INSENSITIVE", "INSTANCE", "INTERSECT", "IS", "ITEM", "LANGUAGE", "LAX", "LE", "LEAST", "LET", "LEVELS", "LOWERCASE", "LT", "MOD", "MODULE", "MOST", "NAMESPACE", "NE", "NODE", "NOINHERIT", "NOPRESERVE", "NOT", "OCCURS", "OF", "OPTION", "OR", "ORDER", "ORDERED", "ORDERING", "PARAGRAPH", "PARAGRAPHS", "PARENT", "PHRASE", "PRECEDING", "PRECEDING_SIBLING", "PRESERVE", "PROCESSING_INSTRUCTION", "RELATIONSHIP", "RETURN", "SAME", "SATISFIES", "SCHEMA", "SCHEMAATTRIBUTE", "SCHEMAELEMENT", "SCORE", "SELF", "SENSITIVE", "SENTENCES", "SENTENCE", "SOME", "STABLE", "START", "STEMMING", "STOP", "STRICT", "STRIP", "TEXT", "THESAURUS", "THEN", "TIMES", "TO", "TREAT", "TYPESWITCH", "UNION", "UNORDERED", "UPPERCASE", "VALIDATE", "VARIABLE", "VERSION", "WEIGHT", "WHERE", "WILDCARDS", "WINDOW", "WITH", "WITHOUT", "WORD", "WORDS", "XQUERY", "StringLiteral", "SEMICOLONSi", "NCName", "EQSi", "COMMASi", "DOLLARSi", "ASSIGNSi", "COLONSi", "LPARSi", "RPARSi", "LBRACESi", "RBRACSi", "QUESTIONSi", "STARSi", "PLUSSi", "MINUSSi", "PIPESi", "NEQSi", "LTSi", "LTOREQSi", "GTSi", "GTOREQSi", "NODEBEFORESi", "NODEAFTERSi", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "LPRAGSi", "PragmaContents", "RPRAGSi", "DBLSLASHSi", "SLASHSi", "DBLCOLONSi", "DOTDOTSi", "ATSi", "LBRACKSi", "RBRACKSi", "DOTSi", "RSELFTERMSi", "LENDTAGSi", "QUOTSi", "QuotAttributeContent", "APOSSi", "AposAttributeContent", "ElementContent", "LCDATASi", "CDataContents", "RCDATASi", "LCOMMENTSi", "DirCommentContent", "RCOMMENTSi", "LPISi", "PiTarget", "DirPiContents", "RPISi", "CDataSectionLEX", "DirPIConstructor", "DirCommentConstLEX", "PragmaLEX", "Comment", "NumberLEX", "LexSigns", "S", "LexLiterals", "TOKENSWITCH", "PredefinedEntityRef", "CharRef", "AMPERSi", "QuotAttrContentChar", "AposAttrContentChar", "ElementContentChar", "CREFDECSi", "CREFHEXSi", "NotChar", "Name", "Letter", "UNDERSCORESi", "NameChar", "Digit", "CombiningChar", "Extender", "SHARPSi", "LXQCOMMENTSi", "RXQCOMMENTSi", "Digits", "NCNameStartChar", "NCNameChar", "EXCLSi", "BACKSLASHSi", "ExtraChar", "BaseChar", "Ideographic", "CleanChar", "Char"
    };
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
    public static final int LBRACKSi=179;
    public static final int RSELFTERMSi=182;
    public static final int GT=60;
    public static final int END=39;
    public static final int DoubleLiteral=170;
    public static final int QUOTSi=184;
    public static final int LexLiterals=207;
    public static final int DirCommentContent=193;
    public static final int CharRef=210;
    public static final int OPTION=90;
    public static final int Extender=224;
    public static final int OCCURS=88;
    public static final int THESAURUS=123;
    public static final int SATISFIES=106;
    public static final int VERSION=134;
    public static final int RXQCOMMENTSi=227;
    public static final int IDIV=61;
    public static final int ASCENDING=10;
    public static final int ExtraChar=233;
    public static final int AT=11;
    public static final int AS=9;
    public static final int EMPTY_SEQUENCE=42;
    public static final int PARENT=97;
    public static final int CONSTRUCTION=22;
    public static final int THEN=124;
    public static final int ATSi=178;
    public static final int DOCUMENT=34;
    public static final int DBLSLASHSi=174;
    public static final int COLLATION=20;
    public static final int LCOMMENTSi=192;
    public static final int ANCESTOR=6;
    public static final int AMPERSi=211;
    public static final int CleanChar=236;
    public static final int ElementContent=188;
    public static final int CASTABLE=18;
    public static final int MOST=81;
    public static final int EQSi=147;
    public static final int BY=14;
    public static final int NODEBEFORESi=166;
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
    public static final int FOLLOWING=48;
    public static final int AND=8;
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
    public static final int RBRACSi=155;
    public static final int GTSi=164;
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
    public static final int LEVELS=76;
    public static final int PARAGRAPHS=96;
    public static final int TIMES=125;
    public static final int DirCommentConstLEX=201;
    public static final int LET=75;
    public static final int LE=73;
    public static final int TREAT=127;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[178+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }


    	
    	/* Root scope */
    	//Scope currentScope = new Scope();	   // @init-ting her ogsaa
    	XQFTLexer lexer;
    	/*
    	public void setTokenStream(TokenStream input) {
    				String inputz =  "<html> \n" +                                                   //1
                            "{ \n"+                                                         //2
                            "for $act in doc(\"hamlet.xml\")//ACT\n" +                      //3
                            "let $speakers := distinct-values($act//SPEAKER)\n"+            //4
                            "return\n"+                                                     //5
                            "<span>\n"+                                                     //6
                            "<h1>{ $act/TITLE/text() }</h1>\n"+                             //7
                            "<ul>\n"+                                                       //8
                            "{\n"+                                                          //9
                            "for $speaker in $speakers\n"+                                  //10
                            "return <li>{ $speaker }</li>\n"+                               //11
                            "}\n"+                                                          //12
                            "</ul>\n"+                                                      //13
                            "</span>\n"+                                                    //14
                            "}\n"+                                                          //15
                            "</html>\n";                                                    //16
                            	CharStream cs = new ANTLRStringStream(inputz);
    		lexer = (XQFTLexer)input.getTokenSource();
    		lexer.setCharStream(cs);
    		UnbufferedCommonTokenStream tokenz = new UnbufferedCommonTokenStream();
    		tokenz.setTokenSource(lexer);
    		super.setTokenStream(tokenz);
     	
    	}
    */

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




    // $ANTLR start module
    // etc/XQFT.g:259:1: module : ( versionDecl )? ( libraryModule | mainModule ) ;
    public final void module() throws RecognitionException {
        try {
            // etc/XQFT.g:259:32: ( ( versionDecl )? ( libraryModule | mainModule ) )
            // etc/XQFT.g:259:34: ( versionDecl )? ( libraryModule | mainModule )
            {
            // etc/XQFT.g:259:34: ( versionDecl )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==XQUERY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:259:34: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module522);
                    versionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:259:47: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=ANCESTOR && LA2_0<=ANCESTOR_OR_SELF)||LA2_0==ATTRIBUTE||LA2_0==CHILD||LA2_0==COMMENT||LA2_0==DECLARE||(LA2_0>=DESCENDANT && LA2_0<=DESCENDANT_OR_SELF)||(LA2_0>=DOCUMENT && LA2_0<=ELEMENT)||LA2_0==EVERY||(LA2_0>=FOLLOWING && LA2_0<=FOR)||(LA2_0>=IF && LA2_0<=IMPORT)||LA2_0==LET||LA2_0==NODE||LA2_0==ORDERED||LA2_0==PARENT||(LA2_0>=PRECEDING && LA2_0<=PRECEDING_SIBLING)||LA2_0==PROCESSING_INSTRUCTION||(LA2_0>=SCHEMAATTRIBUTE && LA2_0<=SCHEMAELEMENT)||LA2_0==SELF||LA2_0==SOME||LA2_0==TEXT||LA2_0==TYPESWITCH||LA2_0==UNORDERED||LA2_0==VALIDATE||LA2_0==StringLiteral||LA2_0==NCName||LA2_0==DOLLARSi||LA2_0==LPARSi||(LA2_0>=STARSi && LA2_0<=MINUSSi)||LA2_0==LTSi||(LA2_0>=IntegerLiteral && LA2_0<=LPRAGSi)||(LA2_0>=DBLSLASHSi && LA2_0<=SLASHSi)||(LA2_0>=DOTDOTSi && LA2_0<=ATSi)||LA2_0==DOTSi||LA2_0==LCOMMENTSi||LA2_0==LPISi) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("259:47: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:259:48: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module526);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:259:64: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module530);
                    mainModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end module


    // $ANTLR start versionDecl
    // etc/XQFT.g:261:2: versionDecl : XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator ;
    public final void versionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:261:33: ( XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator )
            // etc/XQFT.g:261:35: XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator
            {
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl559); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl561); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl563); if (failed) return ;
            // etc/XQFT.g:261:64: ( ENCODING StringLiteral )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:261:65: ENCODING StringLiteral
                    {
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl566); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl568); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl572);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end versionDecl


    // $ANTLR start separator
    // etc/XQFT.g:262:3: separator : SEMICOLONSi ;
    public final void separator() throws RecognitionException {
        try {
            // etc/XQFT.g:262:34: ( SEMICOLONSi )
            // etc/XQFT.g:262:36: SEMICOLONSi
            {
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator602); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end separator


    // $ANTLR start libraryModule
    // etc/XQFT.g:264:2: libraryModule : moduleDecl prolog ;
    public final void libraryModule() throws RecognitionException {
        try {
            // etc/XQFT.g:264:33: ( moduleDecl prolog )
            // etc/XQFT.g:264:35: moduleDecl prolog
            {
            pushFollow(FOLLOW_moduleDecl_in_libraryModule630);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule632);
            prolog();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end libraryModule


    // $ANTLR start moduleDecl
    // etc/XQFT.g:265:3: moduleDecl : MODULE NAMESPACE NCName EQSi uriLiteral separator ;
    public final void moduleDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:265:34: ( MODULE NAMESPACE NCName EQSi uriLiteral separator )
            // etc/XQFT.g:265:36: MODULE NAMESPACE NCName EQSi uriLiteral separator
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl661); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl663); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl665); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl667); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl669);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl671);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleDecl


    // $ANTLR start uriLiteral
    // etc/XQFT.g:266:4: uriLiteral : StringLiteral ;
    public final void uriLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:266:35: ( StringLiteral )
            // etc/XQFT.g:266:37: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral701); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end uriLiteral


    // $ANTLR start mainModule
    // etc/XQFT.g:269:2: mainModule : prolog queryBody ;
    public final void mainModule() throws RecognitionException {
        try {
            // etc/XQFT.g:269:33: ( prolog queryBody )
            // etc/XQFT.g:269:35: prolog queryBody
            {
            pushFollow(FOLLOW_prolog_in_mainModule733);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule735);
            queryBody();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end mainModule


    // $ANTLR start queryBody
    // etc/XQFT.g:271:3: queryBody : expr ;
    public final void queryBody() throws RecognitionException {
        try {
            // etc/XQFT.g:271:34: ( expr )
            // etc/XQFT.g:271:36: expr
            {
            pushFollow(FOLLOW_expr_in_queryBody766);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end queryBody


    // $ANTLR start expr
    // etc/XQFT.g:272:4: expr : exprSingle ( COMMASi exprSingle )* ;
    public final void expr() throws RecognitionException {
        try {
            // etc/XQFT.g:272:35: ( exprSingle ( COMMASi exprSingle )* )
            // etc/XQFT.g:272:37: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr802);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:272:48: ( COMMASi exprSingle )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMASi) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:272:49: COMMASi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr805); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr807);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end expr


    // $ANTLR start prolog
    // etc/XQFT.g:278:1: prolog : ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* ;
    public final void prolog() throws RecognitionException {
        try {
            // etc/XQFT.g:278:32: ( ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* )
            // etc/XQFT.g:278:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            {
            // etc/XQFT.g:278:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DECLARE) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==BASE_URI||LA6_1==BOUNDARYSPACE||LA6_1==CONSTRUCTION||LA6_1==COPY_NAMESPACES||LA6_1==DEFAULT||LA6_1==NAMESPACE||LA6_1==ORDERING) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==IMPORT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // etc/XQFT.g:279:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator
            	    {
            	    // etc/XQFT.g:279:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )
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
            	            else if ( (LA5_3==ELEMENT||LA5_3==FUNCTION) ) {
            	                alt5=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("279:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 3, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case BASE_URI:
            	        case BOUNDARYSPACE:
            	        case CONSTRUCTION:
            	        case COPY_NAMESPACES:
            	        case ORDERING:
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
            	                new NoViableAltException("279:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA5_0==IMPORT) ) {
            	        alt5=4;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("279:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // etc/XQFT.g:279:13: defaultNamespaceDecl
            	            {
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog872);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:279:36: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog876);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:279:45: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog880);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:279:61: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog884);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog899);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // etc/XQFT.g:282:12: ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DECLARE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:283:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator
            	    {
            	    // etc/XQFT.g:283:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )
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
            	                new NoViableAltException("283:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("283:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // etc/XQFT.g:283:13: varDecl
            	            {
            	            pushFollow(FOLLOW_varDecl_in_prolog941);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:283:23: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog945);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:283:38: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog949);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:283:51: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog953);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog967);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end prolog


    // $ANTLR start defaultNamespaceDecl
    // etc/XQFT.g:288:1: defaultNamespaceDecl : DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final void defaultNamespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:288:32: ( DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:288:34: DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl1000); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl1002); if (failed) return ;
            if ( input.LA(1)==ELEMENT||input.LA(1)==FUNCTION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl1004);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl1012); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl1014);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultNamespaceDecl


    // $ANTLR start setter
    // etc/XQFT.g:290:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );
    public final void setter() throws RecognitionException {
        try {
            // etc/XQFT.g:290:32: ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl )
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
                            new NoViableAltException("290:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 5, input);

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
                        new NoViableAltException("290:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("290:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:290:34: boundarySpaceDecl
                    {
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter1046);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:291:13: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter1061);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:292:13: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter1076);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:293:13: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter1091);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:294:13: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter1106);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:295:13: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter1121);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:296:13: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter1136);
                    copyNamespacesDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end setter


    // $ANTLR start boundarySpaceDecl
    // etc/XQFT.g:297:2: boundarySpaceDecl : DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final void boundarySpaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:297:33: ( DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:297:35: DECLARE BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl1157); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1159); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl1161);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end boundarySpaceDecl


    // $ANTLR start defaultCollationDecl
    // etc/XQFT.g:298:2: defaultCollationDecl : DECLARE DEFAULT COLLATION uriLiteral ;
    public final void defaultCollationDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:298:33: ( DECLARE DEFAULT COLLATION uriLiteral )
            // etc/XQFT.g:298:35: DECLARE DEFAULT COLLATION uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl1185); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl1187); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl1189); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl1191);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultCollationDecl


    // $ANTLR start baseURIDecl
    // etc/XQFT.g:299:2: baseURIDecl : DECLARE BASE_URI uriLiteral ;
    public final void baseURIDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:299:33: ( DECLARE BASE_URI uriLiteral )
            // etc/XQFT.g:299:35: DECLARE BASE_URI uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl1218); if (failed) return ;
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl1220); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl1222);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end baseURIDecl


    // $ANTLR start constructionDecl
    // etc/XQFT.g:300:2: constructionDecl : DECLARE CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final void constructionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:300:33: ( DECLARE CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:300:35: DECLARE CONSTRUCTION ( STRIP | PRESERVE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl1244); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl1246); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl1248);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end constructionDecl


    // $ANTLR start orderingModeDecl
    // etc/XQFT.g:301:2: orderingModeDecl : DECLARE ORDERING ( ORDERED | UNORDERED ) ;
    public final void orderingModeDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:301:33: ( DECLARE ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:301:35: DECLARE ORDERING ( ORDERED | UNORDERED )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl1276); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl1278); if (failed) return ;
            if ( input.LA(1)==ORDERED||input.LA(1)==UNORDERED ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl1280);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderingModeDecl


    // $ANTLR start emptyOrderDecl
    // etc/XQFT.g:302:2: emptyOrderDecl : DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) ;
    public final void emptyOrderDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:302:33: ( DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:302:35: DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl1310); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl1312); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl1314); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl1316); if (failed) return ;
            if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl1318);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end emptyOrderDecl


    // $ANTLR start copyNamespacesDecl
    // etc/XQFT.g:303:2: copyNamespacesDecl : DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode ;
    public final void copyNamespacesDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:303:33: ( DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:303:35: DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl1344); if (failed) return ;
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1346); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl1348);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl1350); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl1352);
            inheritMode();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end copyNamespacesDecl


    // $ANTLR start preserveMode
    // etc/XQFT.g:304:3: preserveMode : ( PRESERVE | NOPRESERVE );
    public final void preserveMode() throws RecognitionException {
        try {
            // etc/XQFT.g:304:34: ( PRESERVE | NOPRESERVE )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==NOPRESERVE||input.LA(1)==PRESERVE ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end preserveMode


    // $ANTLR start inheritMode
    // etc/XQFT.g:305:3: inheritMode : ( INHERIT | NOINHERIT );
    public final void inheritMode() throws RecognitionException {
        try {
            // etc/XQFT.g:305:34: ( INHERIT | NOINHERIT )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==INHERIT||input.LA(1)==NOINHERIT ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end inheritMode


    // $ANTLR start namespaceDecl
    // etc/XQFT.g:307:1: namespaceDecl : DECLARE NAMESPACE NCName EQSi uriLiteral ;
    public final void namespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:307:32: ( DECLARE NAMESPACE NCName EQSi uriLiteral )
            // etc/XQFT.g:307:34: DECLARE NAMESPACE NCName EQSi uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl1443); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl1445); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl1447); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl1449); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl1451);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end namespaceDecl


    // $ANTLR start importStmt
    // etc/XQFT.g:309:1: importStmt : ( schemaImport | moduleImport );
    public final void importStmt() throws RecognitionException {
        try {
            // etc/XQFT.g:309:32: ( schemaImport | moduleImport )
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
                        new NoViableAltException("309:1: importStmt : ( schemaImport | moduleImport );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("309:1: importStmt : ( schemaImport | moduleImport );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:309:34: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt1479);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:309:49: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1483);
                    moduleImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end importStmt


    // $ANTLR start schemaImport
    // etc/XQFT.g:310:2: schemaImport : IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void schemaImport() throws RecognitionException {
        try {
            // etc/XQFT.g:310:33: ( IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:310:35: IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport1509); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1511); if (failed) return ;
            // etc/XQFT.g:310:49: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DEFAULT||LA11_0==NAMESPACE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:310:49: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1513);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1516);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:310:74: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:310:75: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_schemaImport1519); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1521);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:310:89: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:310:90: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1524); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1526);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaImport


    // $ANTLR start schemaPrefix
    // etc/XQFT.g:311:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final void schemaPrefix() throws RecognitionException {
        try {
            // etc/XQFT.g:311:34: ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
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
                    new NoViableAltException("311:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:311:36: ( NAMESPACE NCName EQSi )
                    {
                    // etc/XQFT.g:311:36: ( NAMESPACE NCName EQSi )
                    // etc/XQFT.g:311:37: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1558); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix1560); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1562); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:311:62: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:311:62: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:311:63: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1568); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1570); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1572); if (failed) return ;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaPrefix


    // $ANTLR start moduleImport
    // etc/XQFT.g:312:2: moduleImport : IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void moduleImport() throws RecognitionException {
        try {
            // etc/XQFT.g:312:33: ( IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:312:35: IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport1599); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1601); if (failed) return ;
            // etc/XQFT.g:312:49: ( NAMESPACE NCName EQSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:312:50: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1604); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport1606); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1608); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1612);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:312:85: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:312:86: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_moduleImport1615); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1617);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:312:100: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:312:101: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1620); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1622);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleImport


    // $ANTLR start varDecl
    // etc/XQFT.g:314:1: varDecl : DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) ;
    public final void varDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:314:32: ( DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:314:34: DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl1658); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl1660); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl1662); if (failed) return ;
            pushFollow(FOLLOW_qName_in_varDecl1664);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:314:66: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:314:66: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl1666);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:314:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )
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
                    new NoViableAltException("314:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:314:84: ( ASSIGNSi exprSingle )
                    {
                    // etc/XQFT.g:314:84: ( ASSIGNSi exprSingle )
                    // etc/XQFT.g:314:85: ASSIGNSi exprSingle
                    {
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl1671); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl1673);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:314:108: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl1678); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end varDecl


    // $ANTLR start qName
    // etc/XQFT.g:315:2: qName returns [String text] : nc1= NCName (c= COLONSi nc2= NCName )? ;
    public final String qName() throws RecognitionException {
        String text = null;

        Token nc1=null;
        Token c=null;
        Token nc2=null;

        try {
            // etc/XQFT.g:315:36: (nc1= NCName (c= COLONSi nc2= NCName )? )
            // etc/XQFT.g:315:38: nc1= NCName (c= COLONSi nc2= NCName )?
            {
            nc1=(Token)input.LT(1);
            match(input,NCName,FOLLOW_NCName_in_qName1699); if (failed) return text;
            // etc/XQFT.g:315:49: (c= COLONSi nc2= NCName )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLONSi) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:315:50: c= COLONSi nc2= NCName
                    {
                    c=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName1704); if (failed) return text;
                    nc2=(Token)input.LT(1);
                    match(input,NCName,FOLLOW_NCName_in_qName1708); if (failed) return text;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               text = nc1.getText() + (c != null ? c.getText() + nc2.getText() : ""); 
            }

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return text;
    }
    // $ANTLR end qName


    // $ANTLR start typeDeclaration
    // etc/XQFT.g:316:2: typeDeclaration : AS sequenceType ;
    public final void typeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:316:33: ( AS sequenceType )
            // etc/XQFT.g:316:35: AS sequenceType
            {
            match(input,AS,FOLLOW_AS_in_typeDeclaration1735); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration1737);
            sequenceType();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end typeDeclaration


    // $ANTLR start functionDecl
    // etc/XQFT.g:320:1: functionDecl : DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) ;
    public final void functionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:320:32: ( DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) )
            // etc/XQFT.g:320:34: DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl1766); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl1768); if (failed) return ;
            pushFollow(FOLLOW_qName_in_functionDecl1770);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl1772); if (failed) return ;
            // etc/XQFT.g:320:64: ( paramList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOLLARSi) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:320:64: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl1774);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl1777); if (failed) return ;
            // etc/XQFT.g:321:12: ( AS sequenceType )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:321:13: AS sequenceType
                    {
                    match(input,AS,FOLLOW_AS_in_functionDecl1792); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl1794);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:321:31: ( enclosedExpr | EXTERNAL )
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
                    new NoViableAltException("321:31: ( enclosedExpr | EXTERNAL )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:321:32: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl1799);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:321:47: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl1803); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end functionDecl


    // $ANTLR start paramList
    // etc/XQFT.g:322:2: paramList : param ( COMMASi param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // etc/XQFT.g:322:33: ( param ( COMMASi param )* )
            // etc/XQFT.g:322:35: param ( COMMASi param )*
            {
            pushFollow(FOLLOW_param_in_paramList1833);
            param();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:322:41: ( COMMASi param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:322:42: COMMASi param
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList1836); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList1838);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end paramList


    // $ANTLR start param
    // etc/XQFT.g:323:3: param : DOLLARSi qName ( typeDeclaration )? ;
    public final void param() throws RecognitionException {
        try {
            // etc/XQFT.g:323:34: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:323:36: DOLLARSi qName ( typeDeclaration )?
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param1874); if (failed) return ;
            pushFollow(FOLLOW_qName_in_param1876);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:323:51: ( typeDeclaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:323:51: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param1878);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end param


    // $ANTLR start enclosedExpr
    // etc/XQFT.g:329:2: enclosedExpr : LBRACESi expr RBRACSi ;
    public final void enclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:329:33: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:330:13: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr1923); if (failed) return ;
            pushFollow(FOLLOW_expr_in_enclosedExpr1938);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr1953); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end enclosedExpr


    // $ANTLR start optionDecl
    // etc/XQFT.g:338:1: optionDecl : DECLARE OPTION qName StringLiteral ;
    public final void optionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:338:32: ( DECLARE OPTION qName StringLiteral )
            // etc/XQFT.g:338:34: DECLARE OPTION qName StringLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl2000); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl2002); if (failed) return ;
            pushFollow(FOLLOW_qName_in_optionDecl2004);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl2006); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end optionDecl


    // $ANTLR start ftOptionDecl
    // etc/XQFT.g:340:1: ftOptionDecl : DECLARE FTOPTION ftMatchOptions ;
    public final void ftOptionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:340:32: ( DECLARE FTOPTION ftMatchOptions )
            // etc/XQFT.g:340:34: DECLARE FTOPTION ftMatchOptions
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl2032); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl2034); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl2036);
            ftMatchOptions();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOptionDecl


    // $ANTLR start ftMatchOptions
    // etc/XQFT.g:341:2: ftMatchOptions : ( ftMatchOption )+ ;
    public final void ftMatchOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:341:33: ( ( ftMatchOption )+ )
            // etc/XQFT.g:341:35: ( ftMatchOption )+
            {
            // etc/XQFT.g:341:35: ( ftMatchOption )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case WITHOUT:
                    {
                    int LA26_2 = input.LA(2);

                    if ( ((LA26_2>=STEMMING && LA26_2<=STOP)||LA26_2==THESAURUS||LA26_2==WILDCARDS) ) {
                        alt26=1;
                    }


                    }
                    break;
                case CASE:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (LA26_3==INSENSITIVE||LA26_3==SENSITIVE) ) {
                        alt26=1;
                    }


                    }
                    break;
                case DIACRITICS:
                case LANGUAGE:
                case LOWERCASE:
                case OPTION:
                case UPPERCASE:
                case WITH:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // etc/XQFT.g:341:35: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions2060);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOptions


    // $ANTLR start sequenceType
    // etc/XQFT.g:347:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );
    public final void sequenceType() throws RecognitionException {
        try {
            // etc/XQFT.g:347:32: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:347:34: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType2112);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType2114);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:348:13: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType2128);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:349:13: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType2142); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType2144); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType2146); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end sequenceType


    // $ANTLR start itemType
    // etc/XQFT.g:351:2: itemType : ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) ;
    public final void itemType() throws RecognitionException {
        try {
            // etc/XQFT.g:351:33: ( ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) )
            // etc/XQFT.g:351:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            {
            // etc/XQFT.g:351:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            int alt28=3;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
            case COMMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case NODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case TEXT:
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
                    new NoViableAltException("351:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:351:36: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType2188);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:351:47: ( ITEM LPARSi RPARSi )
                    {
                    // etc/XQFT.g:351:47: ( ITEM LPARSi RPARSi )
                    // etc/XQFT.g:351:48: ITEM LPARSi RPARSi
                    {
                    match(input,ITEM,FOLLOW_ITEM_in_itemType2193); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType2195); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType2197); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:351:70: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType2202);
                    atomicType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end itemType


    // $ANTLR start kindTest
    // etc/XQFT.g:352:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final void kindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:352:34: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
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
                    new NoViableAltException("352:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:352:36: documentTest
                    {
                    pushFollow(FOLLOW_documentTest_in_kindTest2234);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:353:39: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest2274);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:354:39: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest2314);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:355:39: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest2354);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:356:39: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest2394);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:357:39: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest2434);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:358:39: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest2474);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:359:39: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest2514);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:360:39: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest2554);
                    anyKindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end kindTest


    // $ANTLR start documentTest
    // etc/XQFT.g:361:4: documentTest : DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi ;
    public final void documentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:361:35: ( DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi )
            // etc/XQFT.g:361:37: DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi
            {
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest2582); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest2584); if (failed) return ;
            // etc/XQFT.g:361:58: ( elementTest | schemaElementTest )?
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
                    // etc/XQFT.g:361:59: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest2587);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:361:73: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest2591);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest2595); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end documentTest


    // $ANTLR start elementTest
    // etc/XQFT.g:362:5: elementTest : ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi ;
    public final void elementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:362:34: ( ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi )
            // etc/XQFT.g:362:36: ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest2623); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest2625); if (failed) return ;
            // etc/XQFT.g:362:51: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NCName||LA33_0==STARSi) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // etc/XQFT.g:362:52: elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest2628);
                    elementNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:362:74: ( COMMASi typeName ( QUESTIONSi )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMASi) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // etc/XQFT.g:362:75: COMMASi typeName ( QUESTIONSi )?
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest2631); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest2633);
                            typeName();
                            _fsp--;
                            if (failed) return ;
                            // etc/XQFT.g:362:92: ( QUESTIONSi )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==QUESTIONSi) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // etc/XQFT.g:362:92: QUESTIONSi
                                    {
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest2635); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest2642); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementTest


    // $ANTLR start elementNameOrWildcard
    // etc/XQFT.g:363:6: elementNameOrWildcard : ( elementName | STARSi );
    public final void elementNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:363:37: ( elementName | STARSi )
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
                    new NoViableAltException("363:6: elementNameOrWildcard : ( elementName | STARSi );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:363:39: elementName
                    {
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard2699);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:363:53: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard2703); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementNameOrWildcard


    // $ANTLR start elementName
    // etc/XQFT.g:364:7: elementName : qName ;
    public final void elementName() throws RecognitionException {
        try {
            // etc/XQFT.g:364:38: ( qName )
            // etc/XQFT.g:364:40: qName
            {
            pushFollow(FOLLOW_qName_in_elementName2735);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementName


    // $ANTLR start typeName
    // etc/XQFT.g:365:6: typeName : qName ;
    public final void typeName() throws RecognitionException {
        try {
            // etc/XQFT.g:365:37: ( qName )
            // etc/XQFT.g:365:39: qName
            {
            pushFollow(FOLLOW_qName_in_typeName2769);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end typeName


    // $ANTLR start schemaElementTest
    // etc/XQFT.g:366:5: schemaElementTest : SCHEMAELEMENT LPARSi elementDeclaration RPARSi ;
    public final void schemaElementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:366:37: ( SCHEMAELEMENT LPARSi elementDeclaration RPARSi )
            // etc/XQFT.g:366:39: SCHEMAELEMENT LPARSi elementDeclaration RPARSi
            {
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest2794); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest2796); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest2798);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest2800); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaElementTest


    // $ANTLR start elementDeclaration
    // etc/XQFT.g:367:6: elementDeclaration : elementName ;
    public final void elementDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:367:37: ( elementName )
            // etc/XQFT.g:367:39: elementName
            {
            pushFollow(FOLLOW_elementName_in_elementDeclaration2824);
            elementName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementDeclaration


    // $ANTLR start attributeTest
    // etc/XQFT.g:373:4: attributeTest : ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi ;
    public final void attributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:373:35: ( ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi )
            // etc/XQFT.g:373:37: ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest2856); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest2858); if (failed) return ;
            // etc/XQFT.g:373:54: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NCName||LA36_0==STARSi) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:373:55: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest2861);
                    attribNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:373:76: ( COMMASi typeName )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMASi) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // etc/XQFT.g:373:77: COMMASi typeName
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest2864); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest2866);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest2872); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeTest


    // $ANTLR start attribNameOrWildcard
    // etc/XQFT.g:374:5: attribNameOrWildcard : ( attributeName | STARSi );
    public final void attribNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:374:36: ( attributeName | STARSi )
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
                    new NoViableAltException("374:5: attribNameOrWildcard : ( attributeName | STARSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:374:38: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard2893);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:374:54: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard2897); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attribNameOrWildcard


    // $ANTLR start attributeName
    // etc/XQFT.g:375:6: attributeName : qName ;
    public final void attributeName() throws RecognitionException {
        try {
            // etc/XQFT.g:375:37: ( qName )
            // etc/XQFT.g:375:39: qName
            {
            pushFollow(FOLLOW_qName_in_attributeName2926);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeName


    // $ANTLR start schemaAttributeTest
    // etc/XQFT.g:380:4: schemaAttributeTest : SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi ;
    public final void schemaAttributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:380:35: ( SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi )
            // etc/XQFT.g:380:37: SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi
            {
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2951); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest2953); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest2955);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest2957); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaAttributeTest


    // $ANTLR start attributeDeclaration
    // etc/XQFT.g:381:5: attributeDeclaration : attributeName ;
    public final void attributeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:381:36: ( attributeName )
            // etc/XQFT.g:381:38: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration2978);
            attributeName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeDeclaration


    // $ANTLR start piTest
    // etc/XQFT.g:383:4: piTest : PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi ;
    public final void piTest() throws RecognitionException {
        try {
            // etc/XQFT.g:383:35: ( PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi )
            // etc/XQFT.g:383:37: PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest3013); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest3015); if (failed) return ;
            // etc/XQFT.g:383:67: ( NCName | StringLiteral )?
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest3017);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_piTest3026); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end piTest


    // $ANTLR start commentTest
    // etc/XQFT.g:384:4: commentTest : COMMENT LPARSi RPARSi ;
    public final void commentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:384:35: ( COMMENT LPARSi RPARSi )
            // etc/XQFT.g:384:37: COMMENT LPARSi RPARSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest3055); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest3057); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest3059); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end commentTest


    // $ANTLR start textTest
    // etc/XQFT.g:385:4: textTest : TEXT LPARSi RPARSi ;
    public final void textTest() throws RecognitionException {
        try {
            // etc/XQFT.g:385:35: ( TEXT LPARSi RPARSi )
            // etc/XQFT.g:385:37: TEXT LPARSi RPARSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_textTest3091); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest3093); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest3095); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end textTest


    // $ANTLR start anyKindTest
    // etc/XQFT.g:386:4: anyKindTest : NODE LPARSi RPARSi ;
    public final void anyKindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:386:35: ( NODE LPARSi RPARSi )
            // etc/XQFT.g:386:37: NODE LPARSi RPARSi
            {
            match(input,NODE,FOLLOW_NODE_in_anyKindTest3124); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest3126); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest3128); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end anyKindTest


    // $ANTLR start occurrenceIndicator
    // etc/XQFT.g:387:2: occurrenceIndicator : ( QUESTIONSi | STARSi | PLUSSi );
    public final void occurrenceIndicator() throws RecognitionException {
        try {
            // etc/XQFT.g:387:33: ( QUESTIONSi | STARSi | PLUSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=QUESTIONSi && input.LA(1)<=PLUSSi) ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end occurrenceIndicator


    // $ANTLR start exprSingle
    // etc/XQFT.g:391:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );
    public final void exprSingle() throws RecognitionException {
        try {
            // etc/XQFT.g:391:32: ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr )
            int alt39=5;
            switch ( input.LA(1) ) {
            case FOR:
            case LET:
                {
                alt39=1;
                }
                break;
            case EVERY:
            case SOME:
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
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case ATTRIBUTE:
            case CHILD:
            case COMMENT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case NODE:
            case ORDERED:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case SELF:
            case TEXT:
            case UNORDERED:
            case VALIDATE:
            case StringLiteral:
            case NCName:
            case DOLLARSi:
            case LPARSi:
            case STARSi:
            case PLUSSi:
            case MINUSSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case LPRAGSi:
            case DBLSLASHSi:
            case SLASHSi:
            case DOTDOTSi:
            case ATSi:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt39=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("391:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // etc/XQFT.g:392:11: fLWORExpr
                    {
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle3198);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:393:37: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle3236);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:394:37: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle3274);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:395:37: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle3312);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:396:37: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle3350);
                    orExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end exprSingle


    // $ANTLR start fLWORExpr
    // etc/XQFT.g:398:2: fLWORExpr : ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle ;
    public final void fLWORExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:398:33: ( ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle )
            // etc/XQFT.g:398:35: ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:398:35: ( forClause | letClause )+
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
            	    // etc/XQFT.g:398:36: forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr3415);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:398:48: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr3419);
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

            // etc/XQFT.g:398:60: ( whereClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:398:60: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr3423);
                    whereClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:398:73: ( orderByClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER||LA42_0==STABLE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:398:73: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr3426);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr3429); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr3431);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end fLWORExpr


    // $ANTLR start forClause
    // etc/XQFT.g:400:3: forClause : FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* ;
    public final void forClause() throws RecognitionException {
        try {
            // etc/XQFT.g:400:34: ( FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* )
            // etc/XQFT.g:400:36: FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            {
            match(input,FOR,FOLLOW_FOR_in_forClause3463); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3465); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause3467);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:400:57: ( typeDeclaration )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // etc/XQFT.g:400:57: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClause3469);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:400:74: ( positionalVar )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:400:74: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClause3472);
                    positionalVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:400:89: ( ftScoreVar )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SCORE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:400:89: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClause3475);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause3478); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause3480);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:401:14: ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMASi) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // etc/XQFT.g:401:15: COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause3497); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3499); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause3501);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:401:40: ( typeDeclaration )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==AS) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // etc/XQFT.g:401:40: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause3503);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:401:57: ( positionalVar )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==AT) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // etc/XQFT.g:401:57: positionalVar
            	            {
            	            pushFollow(FOLLOW_positionalVar_in_forClause3506);
            	            positionalVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:401:72: ( ftScoreVar )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==SCORE) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // etc/XQFT.g:401:72: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause3509);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause3512); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause3514);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end forClause


    // $ANTLR start varName
    // etc/XQFT.g:402:4: varName returns [String name] : qn= qName ;
    public final String varName() throws RecognitionException {
        String name = null;

        String qn = null;


        try {
            // etc/XQFT.g:402:43: (qn= qName )
            // etc/XQFT.g:402:45: qn= qName
            {
            pushFollow(FOLLOW_qName_in_varName3541);
            qn=qName();
            _fsp--;
            if (failed) return name;
            if ( backtracking==0 ) {
              name = qn;
            }

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return name;
    }
    // $ANTLR end varName


    // $ANTLR start positionalVar
    // etc/XQFT.g:405:4: positionalVar : AT DOLLARSi varName ;
    public final void positionalVar() throws RecognitionException {
        try {
            // etc/XQFT.g:405:35: ( AT DOLLARSi varName )
            // etc/XQFT.g:405:37: AT DOLLARSi varName
            {
            match(input,AT,FOLLOW_AT_in_positionalVar3572); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar3574); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar3576);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end positionalVar


    // $ANTLR start ftScoreVar
    // etc/XQFT.g:407:4: ftScoreVar : SCORE DOLLARSi varName ;
    public final void ftScoreVar() throws RecognitionException {
        try {
            // etc/XQFT.g:407:35: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:407:37: SCORE DOLLARSi varName
            {
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar3607); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar3609); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar3611);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScoreVar


    // $ANTLR start letClause
    // etc/XQFT.g:411:3: letClause : LET varBinding ( COMMASi varBinding )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:411:39: ( LET varBinding ( COMMASi varBinding )* )
            // etc/XQFT.g:411:41: LET varBinding ( COMMASi varBinding )*
            {
            match(input,LET,FOLLOW_LET_in_letClause3661); if (failed) return ;
            pushFollow(FOLLOW_varBinding_in_letClause3663);
            varBinding();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:411:56: ( COMMASi varBinding )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMASi) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // etc/XQFT.g:411:57: COMMASi varBinding
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause3666); if (failed) return ;
            	    pushFollow(FOLLOW_varBinding_in_letClause3668);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end letClause


    // $ANTLR start varBinding
    // etc/XQFT.g:412:3: varBinding : ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle ;
    public final void varBinding() throws RecognitionException {
        String v1 = null;

        String v2 = null;


        try {
            // etc/XQFT.g:412:14: ( ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle )
            // etc/XQFT.g:413:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle
            {
            // etc/XQFT.g:413:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName )
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
                    new NoViableAltException("413:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // etc/XQFT.g:413:5: DOLLARSi v1= varName ( typeDeclaration )?
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3683); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3687);
                    v1=varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:413:25: ( typeDeclaration )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==AS) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // etc/XQFT.g:413:25: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_varBinding3689);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:413:96: SCORE DOLLARSi v2= varName
                    {
                    match(input,SCORE,FOLLOW_SCORE_in_varBinding3696); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3698); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3702);
                    v2=varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varBinding3719); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_varBinding3721);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end varBinding


    // $ANTLR start whereClause
    // etc/XQFT.g:424:3: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:424:33: ( WHERE exprSingle )
            // etc/XQFT.g:424:35: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause3759); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause3761);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end whereClause


    // $ANTLR start orderByClause
    // etc/XQFT.g:427:3: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:427:33: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList )
            // etc/XQFT.g:427:35: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:427:35: ( ORDER BY | STABLE ORDER BY )
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
                    new NoViableAltException("427:35: ( ORDER BY | STABLE ORDER BY )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // etc/XQFT.g:427:36: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3793); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3795); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:427:47: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause3799); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3801); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3803); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause3806);
            orderSpecList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderByClause


    // $ANTLR start orderSpecList
    // etc/XQFT.g:428:4: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:428:34: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:428:36: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList3832);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:428:46: ( COMMASi orderSpec )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMASi) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // etc/XQFT.g:428:47: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList3835); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList3837);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpecList


    // $ANTLR start orderSpec
    // etc/XQFT.g:429:5: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:429:35: ( exprSingle orderModifier )
            // etc/XQFT.g:429:37: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec3870);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec3872);
            orderModifier();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpec


    // $ANTLR start orderModifier
    // etc/XQFT.g:431:6: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:431:36: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:431:38: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:431:38: ( ASCENDING | DESCENDING )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ASCENDING||LA55_0==DESCENDING) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // etc/XQFT.g:
                    {
                    if ( input.LA(1)==ASCENDING||input.LA(1)==DESCENDING ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3901);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:431:64: ( EMPTY ( GREATEST | LEAST ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EMPTY) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // etc/XQFT.g:431:65: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier3911); if (failed) return ;
                    if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3913);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:431:92: ( COLLATION uriLiteral )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLLATION) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:431:93: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier3924); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier3926);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderModifier


    // $ANTLR start quantifiedExpr
    // etc/XQFT.g:437:2: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:437:33: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:437:35: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( input.LA(1)==EVERY||input.LA(1)==SOME ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr3961);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3969); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr3971);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:437:67: ( typeDeclaration )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:437:67: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3973);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr3976); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3978);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:438:13: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMASi) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // etc/XQFT.g:438:14: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr3994); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3996); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr3998);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:438:39: ( typeDeclaration )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==AS) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // etc/XQFT.g:438:39: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr4000);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr4003); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr4005);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr4009); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr4011);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end quantifiedExpr


    // $ANTLR start typeswitchExpr
    // etc/XQFT.g:442:2: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:442:33: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:442:35: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr4044); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr4046); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr4048);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr4050); if (failed) return ;
            // etc/XQFT.g:442:65: ( caseClause )+
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
            	    // etc/XQFT.g:442:65: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr4052);
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

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr4068); if (failed) return ;
            // etc/XQFT.g:443:21: ( DOLLARSi varName )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==DOLLARSi) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // etc/XQFT.g:443:22: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr4071); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr4073);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr4077); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr4079);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end typeswitchExpr


    // $ANTLR start caseClause
    // etc/XQFT.g:446:3: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:446:34: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:446:36: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause4110); if (failed) return ;
            // etc/XQFT.g:446:41: ( DOLLARSi varName AS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==DOLLARSi) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // etc/XQFT.g:446:42: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause4113); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause4115);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause4117); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause4121);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause4123); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause4125);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end caseClause


    // $ANTLR start ifExpr
    // etc/XQFT.g:454:2: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:454:33: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:454:35: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr4166); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr4168); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr4170);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr4172); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr4174); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr4176);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr4178); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr4180);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ifExpr


    // $ANTLR start orExpr
    // etc/XQFT.g:460:2: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:460:33: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:460:35: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr4221);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:460:43: ( OR andExpr )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==OR) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // etc/XQFT.g:460:45: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr4225); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr4227);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orExpr


    // $ANTLR start andExpr
    // etc/XQFT.g:461:3: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:461:34: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:461:36: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr4262);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:461:51: ( AND comparisonExpr )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==AND) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // etc/XQFT.g:461:53: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr4266); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr4268);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end andExpr


    // $ANTLR start comparisonExpr
    // etc/XQFT.g:467:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:467:32: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:467:34: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr4302);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:467:49: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EQ||LA67_0==GE||LA67_0==GT||LA67_0==IS||LA67_0==LE||LA67_0==LT||LA67_0==NE||LA67_0==EQSi||(LA67_0>=NEQSi && LA67_0<=NODEAFTERSi)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // etc/XQFT.g:467:51: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:467:51: ( valueComp | generalComp | nodeComp )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case EQ:
                    case GE:
                    case GT:
                    case LE:
                    case LT:
                    case NE:
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
                            new NoViableAltException("467:51: ( valueComp | generalComp | nodeComp )", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // etc/XQFT.g:467:52: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr4307);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:467:64: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr4311);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:467:78: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr4315);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr4318);
                    ftContainsExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end comparisonExpr


    // $ANTLR start ftContainsExpr
    // etc/XQFT.g:470:2: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:470:33: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:470:35: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr4347);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:470:45: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==FTCONTAINS) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:470:47: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr4351); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr4353);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:470:70: ( ftIgnoreOption )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==WITHOUT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // etc/XQFT.g:470:70: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr4355);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContainsExpr


    // $ANTLR start rangeExpr
    // etc/XQFT.g:472:3: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:472:34: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:472:36: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr4391);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:472:49: ( TO additiveExpr )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==TO) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // etc/XQFT.g:472:51: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr4395); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr4397);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end rangeExpr


    // $ANTLR start additiveExpr
    // etc/XQFT.g:473:4: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:473:35: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:473:37: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4428);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:473:56: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=PLUSSi && LA71_0<=MINUSSi)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // etc/XQFT.g:473:58: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr4432);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4440);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end additiveExpr


    // $ANTLR start multiplicativeExpr
    // etc/XQFT.g:474:5: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:474:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:474:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4466);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:474:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==DIV||LA72_0==IDIV||LA72_0==MOD||LA72_0==STARSi) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // etc/XQFT.g:474:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==DIV||input.LA(1)==IDIV||input.LA(1)==MOD||input.LA(1)==STARSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr4470);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4486);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end multiplicativeExpr


    // $ANTLR start unionExpr
    // etc/XQFT.g:475:6: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:475:37: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:475:39: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4522);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:475:59: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==UNION||LA73_0==PIPESi) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // etc/XQFT.g:475:61: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( input.LA(1)==UNION||input.LA(1)==PIPESi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr4526);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4534);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end unionExpr


    // $ANTLR start intersectExceptExpr
    // etc/XQFT.g:476:7: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:476:38: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:476:40: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4561);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:476:55: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==EXCEPT||LA74_0==INTERSECT) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // etc/XQFT.g:476:57: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( input.LA(1)==EXCEPT||input.LA(1)==INTERSECT ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr4565);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4573);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end intersectExceptExpr


    // $ANTLR start instanceofExpr
    // etc/XQFT.g:477:8: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:477:39: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:477:41: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr4606);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:477:51: ( INSTANCE OF sequenceType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==INSTANCE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // etc/XQFT.g:477:53: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr4610); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr4612); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr4614);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end instanceofExpr


    // $ANTLR start treatExpr
    // etc/XQFT.g:478:9: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:478:40: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:478:42: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr4653);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:478:55: ( TREAT AS sequenceType )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==TREAT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // etc/XQFT.g:478:57: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr4657); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr4659); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr4661);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end treatExpr


    // $ANTLR start castableExpr
    // etc/XQFT.g:479:10: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:479:41: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:479:43: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr4698);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:479:52: ( CASTABLE AS singleType )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==CASTABLE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:479:54: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr4702); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr4704); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr4706);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end castableExpr


    // $ANTLR start castExpr
    // etc/XQFT.g:480:11: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:480:42: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:480:44: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr4748);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:480:54: ( CAST AS singleType )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==CAST) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:480:56: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr4752); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr4754); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr4756);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end castExpr


    // $ANTLR start unaryExpr
    // etc/XQFT.g:481:12: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:481:43: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:481:45: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:481:45: ( MINUSSi | PLUSSi )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=PLUSSi && LA79_0<=MINUSSi)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // etc/XQFT.g:
            	    {
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr4798);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr4807);
            valueExpr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end unaryExpr


    // $ANTLR start singleType
    // etc/XQFT.g:483:12: singleType : atomicType ( QUESTIONSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:483:43: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:483:45: atomicType ( QUESTIONSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType4846);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:483:56: ( QUESTIONSi )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==QUESTIONSi) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:483:56: QUESTIONSi
                    {
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType4848); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end singleType


    // $ANTLR start atomicType
    // etc/XQFT.g:484:13: atomicType : qName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:484:44: ( qName )
            // etc/XQFT.g:484:46: qName
            {
            pushFollow(FOLLOW_qName_in_atomicType4888);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end atomicType


    // $ANTLR start ftIgnoreOption
    // etc/XQFT.g:492:3: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:492:34: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:492:36: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption4924); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption4926); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption4928);
            unionExpr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftIgnoreOption


    // $ANTLR start valueComp
    // etc/XQFT.g:496:2: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:496:33: ( EQ | NE | LT | LE | GT | GE )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==EQ||input.LA(1)==GE||input.LA(1)==GT||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end valueComp


    // $ANTLR start generalComp
    // etc/XQFT.g:499:2: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:499:33: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end generalComp


    // $ANTLR start nodeComp
    // etc/XQFT.g:502:2: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:502:33: ( IS | NODEBEFORESi | NODEAFTERSi )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==IS||(input.LA(1)>=NODEBEFORESi && input.LA(1)<=NODEAFTERSi) ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeComp


    // $ANTLR start ftSelection
    // etc/XQFT.g:506:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:506:32: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:506:34: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection5106);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:506:39: ( ftPosFilter )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==AT||(LA81_0>=DIFFERENT && LA81_0<=DISTANCE)||LA81_0==ENTIRE||LA81_0==ORDERED||LA81_0==SAME||LA81_0==WINDOW) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // etc/XQFT.g:506:39: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection5108);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // etc/XQFT.g:506:52: ( WEIGHT rangeExpr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==WEIGHT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:506:53: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection5112); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection5114);
                    rangeExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftSelection


    // $ANTLR start ftOr
    // etc/XQFT.g:509:2: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:509:33: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:509:35: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr5152);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:509:41: ( FTOR ftAnd )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==FTOR) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // etc/XQFT.g:509:43: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr5156); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr5158);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOr


    // $ANTLR start ftAnd
    // etc/XQFT.g:510:3: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:510:34: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:510:36: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd5195);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:510:46: ( FTAND ftMildNot )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==FTAND) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // etc/XQFT.g:510:48: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd5199); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd5201);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnd


    // $ANTLR start ftMildNot
    // etc/XQFT.g:511:4: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:511:35: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:511:37: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot5235);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:511:48: ( NOT IN ftUnaryNot )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==NOT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // etc/XQFT.g:511:50: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot5239); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot5241); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot5243);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMildNot


    // $ANTLR start ftUnaryNot
    // etc/XQFT.g:512:5: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:512:36: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:512:38: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:512:38: ( FTNOT )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==FTNOT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:512:39: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot5278); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot5282);
            ftPrimaryWithOptions();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnaryNot


    // $ANTLR start ftPrimaryWithOptions
    // etc/XQFT.g:513:6: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:513:37: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:513:39: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions5304);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:513:49: ( ftMatchOptions )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case DIACRITICS:
                case LANGUAGE:
                case LOWERCASE:
                case OPTION:
                case UPPERCASE:
                case WITH:
                    {
                    alt87=1;
                    }
                    break;
                case WITHOUT:
                    {
                    int LA87_2 = input.LA(2);

                    if ( ((LA87_2>=STEMMING && LA87_2<=STOP)||LA87_2==THESAURUS||LA87_2==WILDCARDS) ) {
                        alt87=1;
                    }
                    }
                    break;
                case CASE:
                    {
                    int LA87_3 = input.LA(2);

                    if ( (LA87_3==INSENSITIVE||LA87_3==SENSITIVE) ) {
                        alt87=1;
                    }
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // etc/XQFT.g:513:49: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions5306);
                    ftMatchOptions();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimaryWithOptions


    // $ANTLR start ftPrimary
    // etc/XQFT.g:515:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:515:38: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
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
                    new NoViableAltException("515:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:515:40: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary5347);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:515:48: ( ftTimes )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==OCCURS) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // etc/XQFT.g:515:48: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary5349);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:516:19: LPARSi ftSelection RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary5371); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary5373);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary5375); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:517:19: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary5396);
                    ftExtensionSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimary


    // $ANTLR start ftWords
    // etc/XQFT.g:519:8: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:519:39: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:519:41: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords5450);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:519:54: ( ftAnyallOption )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=ALL && LA90_0<=ANY)||LA90_0==PHRASE) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // etc/XQFT.g:519:54: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords5452);
                    ftAnyallOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWords


    // $ANTLR start ftWordsValue
    // etc/XQFT.g:520:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:520:40: ( literal | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("520:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:520:42: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue5486);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:520:52: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:520:52: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:520:53: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue5491); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue5493);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue5495); if (failed) return ;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWordsValue


    // $ANTLR start literal
    // etc/XQFT.g:521:10: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:521:41: ( numericLiteral | StringLiteral )
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
                    new NoViableAltException("521:10: literal : ( numericLiteral | StringLiteral );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:521:43: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal5535);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:521:60: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal5539); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end literal


    // $ANTLR start numericLiteral
    // etc/XQFT.g:522:11: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:522:42: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end numericLiteral


    // $ANTLR start ftAnyallOption
    // etc/XQFT.g:523:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:523:40: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
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
                    new NoViableAltException("523:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // etc/XQFT.g:523:42: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:523:42: ( ANY ( WORD )? )
                    // etc/XQFT.g:523:43: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption5612); if (failed) return ;
                    // etc/XQFT.g:523:47: ( WORD )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==WORD) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // etc/XQFT.g:523:47: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption5614); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:523:56: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:523:56: ( ALL ( WORDS )? )
                    // etc/XQFT.g:523:57: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption5621); if (failed) return ;
                    // etc/XQFT.g:523:61: ( WORDS )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==WORDS) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // etc/XQFT.g:523:61: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption5623); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:523:71: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption5629); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnyallOption


    // $ANTLR start ftTimes
    // etc/XQFT.g:524:8: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:524:39: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:524:41: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes5666); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes5668);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes5670); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftTimes


    // $ANTLR start ftRange
    // etc/XQFT.g:525:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:525:40: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
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
                        new NoViableAltException("525:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 2, input);

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
                    new NoViableAltException("525:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // etc/XQFT.g:525:42: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:525:42: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:525:43: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange5709); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5711);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:526:39: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:526:39: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:526:40: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5753); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange5755); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5757);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:527:40: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:527:40: ( AT MOST additiveExpr )
                    // etc/XQFT.g:527:41: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5800); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange5802); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5804);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:528:45: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:528:45: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:528:46: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange5852); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5854);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange5856); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5858);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRange


    // $ANTLR start ftExtensionSelection
    // etc/XQFT.g:531:8: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:531:39: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:531:41: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            // etc/XQFT.g:531:41: ( pragma )+
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
            	    // etc/XQFT.g:531:41: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection5885);
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

            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection5888); if (failed) return ;
            // etc/XQFT.g:531:58: ( ftSelection )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==FTNOT||LA98_0==StringLiteral||LA98_0==LPARSi||LA98_0==LBRACESi||(LA98_0>=IntegerLiteral && LA98_0<=LPRAGSi)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:531:58: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection5890);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection5893); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionSelection


    // $ANTLR start pragma
    // etc/XQFT.g:532:9: pragma : LPRAGSi qName ( PragmaContents )? RPRAGSi ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:532:40: ( LPRAGSi qName ( PragmaContents )? RPRAGSi )
            // etc/XQFT.g:532:42: LPRAGSi qName ( PragmaContents )? RPRAGSi
            {
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma5932); if (failed) return ;
            pushFollow(FOLLOW_qName_in_pragma5934);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:532:56: ( PragmaContents )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==PragmaContents) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // etc/XQFT.g:532:56: PragmaContents
                    {
                    match(input,PragmaContents,FOLLOW_PragmaContents_in_pragma5936); if (failed) return ;

                    }
                    break;

            }

            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma5939); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end pragma


    // $ANTLR start ftPosFilter
    // etc/XQFT.g:539:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:539:33: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
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
            case DIFFERENT:
            case SAME:
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
                    new NoViableAltException("539:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // etc/XQFT.g:539:35: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter5994);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:539:45: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter5998);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:539:56: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter6002);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:539:69: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter6006);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:539:79: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter6010);
                    ftContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPosFilter


    // $ANTLR start ftOrder
    // etc/XQFT.g:540:3: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:540:34: ( ORDERED )
            // etc/XQFT.g:540:36: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder6042); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOrder


    // $ANTLR start ftWindow
    // etc/XQFT.g:541:3: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:541:34: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:541:36: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow6073); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow6075);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow6077);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWindow


    // $ANTLR start ftUnit
    // etc/XQFT.g:543:4: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:543:35: ( WORDS | SENTENCES | PARAGRAPHS )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==PARAGRAPHS||input.LA(1)==SENTENCES||input.LA(1)==WORDS ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnit


    // $ANTLR start ftDistance
    // etc/XQFT.g:544:3: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:544:34: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:544:36: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance6150); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance6152);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance6154);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDistance


    // $ANTLR start ftScope
    // etc/XQFT.g:551:3: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:551:34: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:551:36: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( input.LA(1)==DIFFERENT||input.LA(1)==SAME ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope6192);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope6200);
            ftBigUnit();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScope


    // $ANTLR start ftBigUnit
    // etc/XQFT.g:552:4: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:552:35: ( SENTENCE | PARAGRAPH )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==PARAGRAPH||input.LA(1)==SENTENCE ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftBigUnit


    // $ANTLR start ftContent
    // etc/XQFT.g:553:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:553:34: ( AT START | AT END | ENTIRE CONTENT )
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
                        new NoViableAltException("553:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA101_0==ENTIRE) ) {
                alt101=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("553:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:553:36: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent6266); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent6268); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:553:47: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent6272); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent6274); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:553:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent6278); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent6280); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContent


    // $ANTLR start ftMatchOption
    // etc/XQFT.g:562:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:562:32: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
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
                        new NoViableAltException("562:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 2, input);

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
                        new NoViableAltException("562:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 3, input);

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
                    new NoViableAltException("562:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:562:34: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption6318);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:563:37: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption6356);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:564:37: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption6394);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:565:37: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption6432);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:566:37: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption6470);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:567:37: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption6508);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:568:37: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption6546);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:569:37: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption6584);
                    ftExtensionOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOption


    // $ANTLR start ftLanguageOption
    // etc/XQFT.g:572:2: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:572:33: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:572:35: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption6709); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption6711); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftLanguageOption


    // $ANTLR start ftWildCardOption
    // etc/XQFT.g:575:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:575:33: ( WITH WILDCARDS | WITHOUT WILDCARDS )
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
                    new NoViableAltException("575:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:575:35: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption6737); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6739); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:575:52: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption6743); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6745); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWildCardOption


    // $ANTLR start ftThesaurusOption
    // etc/XQFT.g:578:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:578:31: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS )
            int alt107=3;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==WITH) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==THESAURUS) ) {
                    int LA107_3 = input.LA(3);

                    if ( (LA107_3==LPARSi) ) {
                        alt107=2;
                    }
                    else if ( (LA107_3==AT||LA107_3==DEFAULT) ) {
                        alt107=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("578:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("578:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA107_0==WITHOUT) ) {
                alt107=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("578:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // etc/XQFT.g:578:33: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6768); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6770); if (failed) return ;
                    // etc/XQFT.g:578:48: ( ftThesaurusID | DEFAULT )
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
                            new NoViableAltException("578:48: ( ftThesaurusID | DEFAULT )", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // etc/XQFT.g:578:49: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6773);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:578:65: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6777); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:579:14: WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6793); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6795); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption6797); if (failed) return ;
                    // etc/XQFT.g:579:36: ( ftThesaurusID | DEFAULT )
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
                            new NoViableAltException("579:36: ( ftThesaurusID | DEFAULT )", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // etc/XQFT.g:579:37: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6800);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:579:53: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6804); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:579:62: ( COMMASi ftThesaurusID )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==COMMASi) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // etc/XQFT.g:579:63: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption6808); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6810);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption6814); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:580:38: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption6853); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6855); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusOption


    // $ANTLR start ftThesaurusID
    // etc/XQFT.g:582:3: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:582:34: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:582:36: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID6917); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID6919);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:582:50: ( RELATIONSHIP StringLiteral )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RELATIONSHIP) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // etc/XQFT.g:582:51: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID6922); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID6924); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:582:80: ( ftRange LEVELS )?
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
                    // etc/XQFT.g:582:81: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID6929);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID6931); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusID


    // $ANTLR start ftStemOption
    // etc/XQFT.g:592:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:592:33: ( WITH STEMMING | WITHOUT STEMMING )
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
                    new NoViableAltException("592:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:592:35: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption6976); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6978); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:592:51: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption6982); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6984); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStemOption


    // $ANTLR start ftCaseOption
    // etc/XQFT.g:595:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:595:33: ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE )
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
                        new NoViableAltException("595:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 1, input);

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
                    new NoViableAltException("595:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:595:35: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption7014); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption7016); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:596:38: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption7055); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption7057); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:597:38: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption7096); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:598:38: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption7135); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftCaseOption


    // $ANTLR start ftDiacriticsOption
    // etc/XQFT.g:602:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:602:33: ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE )
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
                        new NoViableAltException("602:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("602:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:602:35: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption7297); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption7299); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:603:14: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption7314); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption7316); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDiacriticsOption


    // $ANTLR start ftStopwordOption
    // etc/XQFT.g:606:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:606:33: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
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
                        new NoViableAltException("606:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA115_0==WITHOUT) ) {
                alt115=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("606:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:606:35: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7372); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7374); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7376); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption7378);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:606:63: ( ftInclExclStringLiteral )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==EXCEPT||LA113_0==UNION) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // etc/XQFT.g:606:63: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7380);
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
                    // etc/XQFT.g:607:14: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption7396); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7398); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7400); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:608:38: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7439); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption7441); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7443); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7445); if (failed) return ;
                    // etc/XQFT.g:608:62: ( ftInclExclStringLiteral )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==EXCEPT||LA114_0==UNION) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // etc/XQFT.g:608:62: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7447);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStopwordOption


    // $ANTLR start ftRefOrList
    // etc/XQFT.g:610:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:610:34: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
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
                    new NoViableAltException("610:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // etc/XQFT.g:610:36: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:610:36: ( AT uriLiteral )
                    // etc/XQFT.g:610:37: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList7513); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList7515);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:611:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList7532); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7534); if (failed) return ;
                    // etc/XQFT.g:611:36: ( COMMASi StringLiteral )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMASi) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // etc/XQFT.g:611:37: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList7537); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7539); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList7543); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRefOrList


    // $ANTLR start ftInclExclStringLiteral
    // etc/XQFT.g:613:3: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:613:34: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:613:36: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral7560);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7568);
            ftRefOrList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftInclExclStringLiteral


    // $ANTLR start ftExtensionOption
    // etc/XQFT.g:616:2: ftExtensionOption : OPTION qName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:616:33: ( OPTION qName StringLiteral )
            // etc/XQFT.g:616:35: OPTION qName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption7602); if (failed) return ;
            pushFollow(FOLLOW_qName_in_ftExtensionOption7604);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption7606); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionOption


    // $ANTLR start valueExpr
    // etc/XQFT.g:620:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:620:32: ( validateExpr | pathExpr | extensionExpr )
            int alt118=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                alt118=1;
                }
                break;
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case ATTRIBUTE:
            case CHILD:
            case COMMENT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case NODE:
            case ORDERED:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case SELF:
            case TEXT:
            case UNORDERED:
            case StringLiteral:
            case NCName:
            case DOLLARSi:
            case LPARSi:
            case STARSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case DBLSLASHSi:
            case SLASHSi:
            case DOTDOTSi:
            case ATSi:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
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
                    new NoViableAltException("620:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // etc/XQFT.g:620:34: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr7638);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:620:49: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr7642);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:620:60: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr7646);
                    extensionExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end valueExpr


    // $ANTLR start validateExpr
    // etc/XQFT.g:623:2: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:623:33: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:623:35: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr7674); if (failed) return ;
            // etc/XQFT.g:623:44: ( validationMode )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==LAX||LA119_0==STRICT) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:623:44: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr7676);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr7679); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr7681);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr7683); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end validateExpr


    // $ANTLR start validationMode
    // etc/XQFT.g:624:3: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:624:34: ( LAX | STRICT )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==LAX||input.LA(1)==STRICT ) {
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end validationMode


    // $ANTLR start pathExpr
    // etc/XQFT.g:629:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:629:33: ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr )
            int alt120=4;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:629:35: ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr
                    {
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr7759); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7761);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:630:14: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7785); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7787);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:631:14: SLASHSi
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7802); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:632:14: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7817);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end pathExpr


    // $ANTLR start relativePathExpr
    // etc/XQFT.g:633:3: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:633:34: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:633:36: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr7840);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:633:45: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( ((LA121_0>=DBLSLASHSi && LA121_0<=SLASHSi)) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // etc/XQFT.g:633:46: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    if ( (input.LA(1)>=DBLSLASHSi && input.LA(1)<=SLASHSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr7843);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr7851);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end relativePathExpr


    // $ANTLR start stepExpr
    // etc/XQFT.g:634:4: stepExpr : ( filterExpr | axisStep );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:634:35: ( filterExpr | axisStep )
            int alt122=2;
            switch ( input.LA(1) ) {
            case DOCUMENT:
            case ORDERED:
            case UNORDERED:
            case StringLiteral:
            case DOLLARSi:
            case LPARSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
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

                        if ( (LA122_10==EOF||LA122_10==AND||LA122_10==ASCENDING||(LA122_10>=CASE && LA122_10<=CASTABLE)||LA122_10==COLLATION||LA122_10==DEFAULT||LA122_10==DESCENDING||LA122_10==DIV||LA122_10==ELSE||LA122_10==EMPTY||LA122_10==EQ||LA122_10==EXCEPT||LA122_10==FOR||LA122_10==FTCONTAINS||LA122_10==GE||(LA122_10>=GT && LA122_10<=IDIV)||(LA122_10>=INSTANCE && LA122_10<=IS)||LA122_10==LE||(LA122_10>=LET && LA122_10<=LEVELS)||(LA122_10>=LT && LA122_10<=MOD)||LA122_10==NE||(LA122_10>=OR && LA122_10<=ORDER)||LA122_10==PARAGRAPHS||LA122_10==RETURN||LA122_10==SATISFIES||LA122_10==SENTENCES||LA122_10==STABLE||(LA122_10>=TIMES && LA122_10<=TREAT)||LA122_10==UNION||LA122_10==WHERE||LA122_10==WITHOUT||LA122_10==WORDS||LA122_10==SEMICOLONSi||(LA122_10>=EQSi && LA122_10<=COMMASi)||LA122_10==RPARSi||LA122_10==RBRACSi||(LA122_10>=STARSi && LA122_10<=NODEAFTERSi)||(LA122_10>=DBLSLASHSi && LA122_10<=SLASHSi)||(LA122_10>=LBRACKSi && LA122_10<=RBRACKSi)) ) {
                            alt122=2;
                        }
                        else if ( (LA122_10==LPARSi) ) {
                            alt122=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 9, input);

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
                case AND:
                case ASCENDING:
                case CASE:
                case CAST:
                case CASTABLE:
                case COLLATION:
                case DEFAULT:
                case DESCENDING:
                case DIV:
                case ELSE:
                case EMPTY:
                case EQ:
                case EXCEPT:
                case FOR:
                case FTCONTAINS:
                case GE:
                case GT:
                case IDIV:
                case INSTANCE:
                case INTERSECT:
                case IS:
                case LE:
                case LET:
                case LEVELS:
                case LT:
                case MOD:
                case NE:
                case OR:
                case ORDER:
                case PARAGRAPHS:
                case RETURN:
                case SATISFIES:
                case SENTENCES:
                case STABLE:
                case TIMES:
                case TO:
                case TREAT:
                case UNION:
                case WHERE:
                case WITHOUT:
                case WORDS:
                case SEMICOLONSi:
                case EQSi:
                case COMMASi:
                case RPARSi:
                case RBRACSi:
                case STARSi:
                case PLUSSi:
                case MINUSSi:
                case PIPESi:
                case NEQSi:
                case LTSi:
                case LTOREQSi:
                case GTSi:
                case GTOREQSi:
                case NODEBEFORESi:
                case NODEAFTERSi:
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
                        new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 2, input);

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
                        new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 3, input);

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
                        new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 4, input);

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
                        new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 5, input);

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
                        new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 6, input);

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
                        new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 7, input);

                    throw nvae;
                }
                }
                break;
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case CHILD:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DOCUMENT_NODE:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case NODE:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case SELF:
            case STARSi:
            case DOTDOTSi:
            case ATSi:
                {
                alt122=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("634:4: stepExpr : ( filterExpr | axisStep );", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:634:37: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7887);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:634:50: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7891);
                    axisStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end stepExpr


    // $ANTLR start axisStep
    // etc/XQFT.g:636:4: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:636:35: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:636:37: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:636:37: ( reverseStep | forwardStep )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=ANCESTOR && LA123_0<=ANCESTOR_OR_SELF)||LA123_0==PARENT||(LA123_0>=PRECEDING && LA123_0<=PRECEDING_SIBLING)||LA123_0==DOTDOTSi) ) {
                alt123=1;
            }
            else if ( (LA123_0==ATTRIBUTE||LA123_0==CHILD||LA123_0==COMMENT||(LA123_0>=DESCENDANT && LA123_0<=DESCENDANT_OR_SELF)||(LA123_0>=DOCUMENT_NODE && LA123_0<=ELEMENT)||(LA123_0>=FOLLOWING && LA123_0<=FOLLOWING_SIBLING)||LA123_0==NODE||LA123_0==PROCESSING_INSTRUCTION||(LA123_0>=SCHEMAATTRIBUTE && LA123_0<=SCHEMAELEMENT)||LA123_0==SELF||LA123_0==TEXT||LA123_0==NCName||LA123_0==STARSi||LA123_0==ATSi) ) {
                alt123=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("636:37: ( reverseStep | forwardStep )", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:636:38: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7925);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:636:52: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7929);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7932);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end axisStep


    // $ANTLR start reverseStep
    // etc/XQFT.g:638:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:638:36: ( reverseAxis nodeTest | abbrevReverseStep )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=ANCESTOR && LA124_0<=ANCESTOR_OR_SELF)||LA124_0==PARENT||(LA124_0>=PRECEDING && LA124_0<=PRECEDING_SIBLING)) ) {
                alt124=1;
            }
            else if ( (LA124_0==DOTDOTSi) ) {
                alt124=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("638:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:638:38: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7966);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7968);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:638:61: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7972);
                    abbrevReverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseStep


    // $ANTLR start reverseAxis
    // etc/XQFT.g:639:6: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:639:37: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:639:39: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            if ( (input.LA(1)>=ANCESTOR && input.LA(1)<=ANCESTOR_OR_SELF)||input.LA(1)==PARENT||(input.LA(1)>=PRECEDING && input.LA(1)<=PRECEDING_SIBLING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis8003);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis8023); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseAxis


    // $ANTLR start nodeTest
    // etc/XQFT.g:640:6: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:640:37: ( kindTest | nameTest )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ATTRIBUTE||LA125_0==COMMENT||(LA125_0>=DOCUMENT_NODE && LA125_0<=ELEMENT)||LA125_0==NODE||LA125_0==PROCESSING_INSTRUCTION||(LA125_0>=SCHEMAATTRIBUTE && LA125_0<=SCHEMAELEMENT)||LA125_0==TEXT) ) {
                alt125=1;
            }
            else if ( (LA125_0==NCName||LA125_0==STARSi) ) {
                alt125=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("640:6: nodeTest : ( kindTest | nameTest );", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:640:39: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest8057);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:640:50: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest8061);
                    nameTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeTest


    // $ANTLR start nameTest
    // etc/XQFT.g:642:7: nameTest : ( qName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:642:38: ( qName | wildcard )
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
                            new NoViableAltException("642:7: nameTest : ( qName | wildcard );", 126, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA126_1==EOF||LA126_1==AND||LA126_1==ASCENDING||(LA126_1>=CASE && LA126_1<=CASTABLE)||LA126_1==COLLATION||LA126_1==DEFAULT||LA126_1==DESCENDING||LA126_1==DIV||LA126_1==ELSE||LA126_1==EMPTY||LA126_1==EQ||LA126_1==EXCEPT||LA126_1==FOR||LA126_1==FTCONTAINS||LA126_1==GE||(LA126_1>=GT && LA126_1<=IDIV)||(LA126_1>=INSTANCE && LA126_1<=IS)||LA126_1==LE||(LA126_1>=LET && LA126_1<=LEVELS)||(LA126_1>=LT && LA126_1<=MOD)||LA126_1==NE||(LA126_1>=OR && LA126_1<=ORDER)||LA126_1==PARAGRAPHS||LA126_1==RETURN||LA126_1==SATISFIES||LA126_1==SENTENCES||LA126_1==STABLE||(LA126_1>=TIMES && LA126_1<=TREAT)||LA126_1==UNION||LA126_1==WHERE||LA126_1==WITHOUT||LA126_1==WORDS||LA126_1==SEMICOLONSi||(LA126_1>=EQSi && LA126_1<=COMMASi)||LA126_1==RPARSi||LA126_1==RBRACSi||(LA126_1>=STARSi && LA126_1<=NODEAFTERSi)||(LA126_1>=DBLSLASHSi && LA126_1<=SLASHSi)||(LA126_1>=LBRACKSi && LA126_1<=RBRACKSi)) ) {
                    alt126=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("642:7: nameTest : ( qName | wildcard );", 126, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA126_0==STARSi) ) {
                alt126=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("642:7: nameTest : ( qName | wildcard );", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:642:40: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest8097);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:642:48: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest8101);
                    wildcard();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end nameTest


    // $ANTLR start wildcard
    // etc/XQFT.g:643:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:643:39: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi )
            int alt127=3;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==STARSi) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==COLONSi) && (synpred4())) {
                    alt127=1;
                }
                else if ( (LA127_1==EOF||LA127_1==AND||LA127_1==ASCENDING||(LA127_1>=CASE && LA127_1<=CASTABLE)||LA127_1==COLLATION||LA127_1==DEFAULT||LA127_1==DESCENDING||LA127_1==DIV||LA127_1==ELSE||LA127_1==EMPTY||LA127_1==EQ||LA127_1==EXCEPT||LA127_1==FOR||LA127_1==FTCONTAINS||LA127_1==GE||(LA127_1>=GT && LA127_1<=IDIV)||(LA127_1>=INSTANCE && LA127_1<=IS)||LA127_1==LE||(LA127_1>=LET && LA127_1<=LEVELS)||(LA127_1>=LT && LA127_1<=MOD)||LA127_1==NE||(LA127_1>=OR && LA127_1<=ORDER)||LA127_1==PARAGRAPHS||LA127_1==RETURN||LA127_1==SATISFIES||LA127_1==SENTENCES||LA127_1==STABLE||(LA127_1>=TIMES && LA127_1<=TREAT)||LA127_1==UNION||LA127_1==WHERE||LA127_1==WITHOUT||LA127_1==WORDS||LA127_1==SEMICOLONSi||(LA127_1>=EQSi && LA127_1<=COMMASi)||LA127_1==RPARSi||LA127_1==RBRACSi||(LA127_1>=STARSi && LA127_1<=NODEAFTERSi)||(LA127_1>=DBLSLASHSi && LA127_1<=SLASHSi)||(LA127_1>=LBRACKSi && LA127_1<=RBRACKSi)) ) {
                    alt127=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("643:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA127_0==NCName) ) {
                alt127=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("643:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:643:41: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard8147); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard8149); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard8151); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:644:20: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard8176); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:645:44: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard8221); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard8223); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard8225); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end wildcard


    // $ANTLR start abbrevReverseStep
    // etc/XQFT.g:646:21: abbrevReverseStep : DOTDOTSi ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:646:52: ( DOTDOTSi )
            // etc/XQFT.g:646:54: DOTDOTSi
            {
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep8266); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevReverseStep


    // $ANTLR start forwardStep
    // etc/XQFT.g:648:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:648:48: ( forwardAxis nodeTest | abbrevForwardStep )
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
                        new NoViableAltException("648:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 1, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case NODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case TEXT:
            case NCName:
            case STARSi:
            case ATSi:
                {
                alt128=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case SELF:
                {
                alt128=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("648:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // etc/XQFT.g:648:50: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep8329);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep8331);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:648:73: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep8335);
                    abbrevForwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardStep


    // $ANTLR start forwardAxis
    // etc/XQFT.g:649:18: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:649:49: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:649:51: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==CHILD||(input.LA(1)>=DESCENDANT && input.LA(1)<=DESCENDANT_OR_SELF)||(input.LA(1)>=FOLLOWING && input.LA(1)<=FOLLOWING_SIBLING)||input.LA(1)==SELF ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis8382);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis8438); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardAxis


    // $ANTLR start abbrevForwardStep
    // etc/XQFT.g:657:6: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:657:37: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:657:39: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:657:39: ( ATSi )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ATSi) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:657:39: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep8469); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep8472);
            nodeTest();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevForwardStep


    // $ANTLR start predicateList
    // etc/XQFT.g:659:17: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:659:48: ( ( predicate )* )
            // etc/XQFT.g:659:50: ( predicate )*
            {
            // etc/XQFT.g:659:50: ( predicate )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==LBRACKSi) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // etc/XQFT.g:659:50: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList8546);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end predicateList


    // $ANTLR start predicate
    // etc/XQFT.g:660:18: predicate : LBRACKSi expr RBRACKSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:660:49: ( LBRACKSi expr RBRACKSi )
            // etc/XQFT.g:660:51: LBRACKSi expr RBRACKSi
            {
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate8606); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate8608);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate8610); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end predicate


    // $ANTLR start extensionExpr
    // etc/XQFT.g:665:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:665:36: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:665:38: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            // etc/XQFT.g:665:38: ( pragma )+
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
            	    // etc/XQFT.g:665:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr8650);
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

            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr8653); if (failed) return ;
            // etc/XQFT.g:665:55: ( expr )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=ANCESTOR && LA132_0<=ANCESTOR_OR_SELF)||LA132_0==ATTRIBUTE||LA132_0==CHILD||LA132_0==COMMENT||(LA132_0>=DESCENDANT && LA132_0<=DESCENDANT_OR_SELF)||(LA132_0>=DOCUMENT && LA132_0<=ELEMENT)||LA132_0==EVERY||(LA132_0>=FOLLOWING && LA132_0<=FOR)||LA132_0==IF||LA132_0==LET||LA132_0==NODE||LA132_0==ORDERED||LA132_0==PARENT||(LA132_0>=PRECEDING && LA132_0<=PRECEDING_SIBLING)||LA132_0==PROCESSING_INSTRUCTION||(LA132_0>=SCHEMAATTRIBUTE && LA132_0<=SCHEMAELEMENT)||LA132_0==SELF||LA132_0==SOME||LA132_0==TEXT||LA132_0==TYPESWITCH||LA132_0==UNORDERED||LA132_0==VALIDATE||LA132_0==StringLiteral||LA132_0==NCName||LA132_0==DOLLARSi||LA132_0==LPARSi||(LA132_0>=STARSi && LA132_0<=MINUSSi)||LA132_0==LTSi||(LA132_0>=IntegerLiteral && LA132_0<=LPRAGSi)||(LA132_0>=DBLSLASHSi && LA132_0<=SLASHSi)||(LA132_0>=DOTDOTSi && LA132_0<=ATSi)||LA132_0==DOTSi||LA132_0==LCOMMENTSi||LA132_0==LPISi) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // etc/XQFT.g:665:55: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr8655);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr8658); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end extensionExpr


    // $ANTLR start filterExpr
    // etc/XQFT.g:673:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:673:32: ( primaryExpr predicateList )
            // etc/XQFT.g:673:34: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr8693);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr8695);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end filterExpr


    // $ANTLR start primaryExpr
    // etc/XQFT.g:676:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:676:33: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
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
            case ATTRIBUTE:
            case COMMENT:
            case DOCUMENT:
            case ELEMENT:
            case PROCESSING_INSTRUCTION:
            case TEXT:
            case LTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt133=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("676:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // etc/XQFT.g:676:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr8724);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:677:14: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr8740);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:678:14: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr8756);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:679:14: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr8772);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:680:14: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr8788);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:681:14: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr8804);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:682:14: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr8820);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:683:14: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr8836);
                    constructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end primaryExpr


    // $ANTLR start varRef
    // etc/XQFT.g:687:3: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:687:34: ( DOLLARSi varName )
            // etc/XQFT.g:687:36: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef8874); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef8876);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end varRef


    // $ANTLR start parenthesizedExpr
    // etc/XQFT.g:689:3: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:689:34: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:689:36: LPARSi ( expr )? RPARSi
            {
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr8899); if (failed) return ;
            // etc/XQFT.g:689:43: ( expr )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=ANCESTOR && LA134_0<=ANCESTOR_OR_SELF)||LA134_0==ATTRIBUTE||LA134_0==CHILD||LA134_0==COMMENT||(LA134_0>=DESCENDANT && LA134_0<=DESCENDANT_OR_SELF)||(LA134_0>=DOCUMENT && LA134_0<=ELEMENT)||LA134_0==EVERY||(LA134_0>=FOLLOWING && LA134_0<=FOR)||LA134_0==IF||LA134_0==LET||LA134_0==NODE||LA134_0==ORDERED||LA134_0==PARENT||(LA134_0>=PRECEDING && LA134_0<=PRECEDING_SIBLING)||LA134_0==PROCESSING_INSTRUCTION||(LA134_0>=SCHEMAATTRIBUTE && LA134_0<=SCHEMAELEMENT)||LA134_0==SELF||LA134_0==SOME||LA134_0==TEXT||LA134_0==TYPESWITCH||LA134_0==UNORDERED||LA134_0==VALIDATE||LA134_0==StringLiteral||LA134_0==NCName||LA134_0==DOLLARSi||LA134_0==LPARSi||(LA134_0>=STARSi && LA134_0<=MINUSSi)||LA134_0==LTSi||(LA134_0>=IntegerLiteral && LA134_0<=LPRAGSi)||(LA134_0>=DBLSLASHSi && LA134_0<=SLASHSi)||(LA134_0>=DOTDOTSi && LA134_0<=ATSi)||LA134_0==DOTSi||LA134_0==LCOMMENTSi||LA134_0==LPISi) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:689:43: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr8901);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr8904); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end parenthesizedExpr


    // $ANTLR start contextItemExpr
    // etc/XQFT.g:692:3: contextItemExpr : DOTSi ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:692:34: ( DOTSi )
            // etc/XQFT.g:692:36: DOTSi
            {
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr8930); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end contextItemExpr


    // $ANTLR start functionCall
    // etc/XQFT.g:693:3: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:693:34: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi )
            // etc/XQFT.g:693:36: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall8957);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall8959); if (failed) return ;
            // etc/XQFT.g:694:14: ( exprSingle ( COMMASi exprSingle )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=ANCESTOR && LA136_0<=ANCESTOR_OR_SELF)||LA136_0==ATTRIBUTE||LA136_0==CHILD||LA136_0==COMMENT||(LA136_0>=DESCENDANT && LA136_0<=DESCENDANT_OR_SELF)||(LA136_0>=DOCUMENT && LA136_0<=ELEMENT)||LA136_0==EVERY||(LA136_0>=FOLLOWING && LA136_0<=FOR)||LA136_0==IF||LA136_0==LET||LA136_0==NODE||LA136_0==ORDERED||LA136_0==PARENT||(LA136_0>=PRECEDING && LA136_0<=PRECEDING_SIBLING)||LA136_0==PROCESSING_INSTRUCTION||(LA136_0>=SCHEMAATTRIBUTE && LA136_0<=SCHEMAELEMENT)||LA136_0==SELF||LA136_0==SOME||LA136_0==TEXT||LA136_0==TYPESWITCH||LA136_0==UNORDERED||LA136_0==VALIDATE||LA136_0==StringLiteral||LA136_0==NCName||LA136_0==DOLLARSi||LA136_0==LPARSi||(LA136_0>=STARSi && LA136_0<=MINUSSi)||LA136_0==LTSi||(LA136_0>=IntegerLiteral && LA136_0<=LPRAGSi)||(LA136_0>=DBLSLASHSi && LA136_0<=SLASHSi)||(LA136_0>=DOTDOTSi && LA136_0<=ATSi)||LA136_0==DOTSi||LA136_0==LCOMMENTSi||LA136_0==LPISi) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // etc/XQFT.g:694:15: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall8977);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:694:26: ( COMMASi exprSingle )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==COMMASi) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // etc/XQFT.g:694:27: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall8980); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall8982);
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

            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall9002); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end functionCall


    // $ANTLR start orderedExpr
    // etc/XQFT.g:697:3: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:697:34: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:697:36: ORDERED LBRACESi expr RBRACSi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr9032); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr9034); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr9036);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr9038); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderedExpr


    // $ANTLR start unorderedExpr
    // etc/XQFT.g:700:3: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:700:34: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:700:36: UNORDERED LBRACESi expr RBRACSi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr9066); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr9068); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr9070);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr9072); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end unorderedExpr


    // $ANTLR start constructor
    // etc/XQFT.g:703:3: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:703:34: ( directConstructor | computedConstructor )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LTSi||LA137_0==LCOMMENTSi||LA137_0==LPISi) ) {
                alt137=1;
            }
            else if ( (LA137_0==ATTRIBUTE||LA137_0==COMMENT||LA137_0==DOCUMENT||LA137_0==ELEMENT||LA137_0==PROCESSING_INSTRUCTION||LA137_0==TEXT) ) {
                alt137=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("703:3: constructor : ( directConstructor | computedConstructor );", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:703:36: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor9103);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:703:56: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor9107);
                    computedConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end constructor


    // $ANTLR start directConstructor
    // etc/XQFT.g:706:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:706:35: ( dirElemConstructor | dirCommentConstructor | dirPIConstructor )
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
                    new NoViableAltException("706:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // etc/XQFT.g:706:37: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor9147);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:707:40: dirCommentConstructor
                    {
                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor9188);
                    dirCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:708:28: dirPIConstructor
                    {
                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor9217);
                    dirPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end directConstructor


    // $ANTLR start dirElemConstructor
    // etc/XQFT.g:710:14: dirElemConstructor : LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:710:45: ( LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) )
            // etc/XQFT.g:710:47: LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            {
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor9275); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.IN_TAG;
            }
            pushFollow(FOLLOW_qName_in_dirElemConstructor9304);
            qName();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor9306);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:712:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
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
                    new NoViableAltException("712:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // etc/XQFT.g:712:25: RSELFTERMSi
                    {
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor9336); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:713:26: GTSi ( dirElemContent )* LENDTAGSi qName GTSi
                    {
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor9365); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_ELEMENT;
                    }
                    // etc/XQFT.g:714:26: ( dirElemContent )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==LBRACESi||LA139_0==LTSi||(LA139_0>=ElementContent && LA139_0<=LCDATASi)||LA139_0==LCOMMENTSi||LA139_0==LPISi) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // etc/XQFT.g:714:26: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor9394);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor9423); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }
                    pushFollow(FOLLOW_qName_in_dirElemConstructor9453);
                    qName();
                    _fsp--;
                    if (failed) return ;
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor9482); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemConstructor


    // $ANTLR start dirAttributeList
    // etc/XQFT.g:719:15: dirAttributeList : ( qName EQSi dirAttributeValue )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:719:46: ( ( qName EQSi dirAttributeValue )* )
            // etc/XQFT.g:719:48: ( qName EQSi dirAttributeValue )*
            {
            // etc/XQFT.g:719:48: ( qName EQSi dirAttributeValue )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==NCName) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // etc/XQFT.g:719:49: qName EQSi dirAttributeValue
            	    {
            	    pushFollow(FOLLOW_qName_in_dirAttributeList9549);
            	    qName();
            	    _fsp--;
            	    if (failed) return ;
            	    match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList9551); if (failed) return ;
            	    pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList9553);
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

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeList


    // $ANTLR start dirAttributeValue
    // etc/XQFT.g:720:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:720:47: ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi )
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
                    new NoViableAltException("720:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:720:49: QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi
                    {
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9591); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_QUOT_ATTRIBUTE;
                    }
                    // etc/XQFT.g:721:27: ( QuotAttributeContent | xmlEnclosedExpr )*
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
                    	    // etc/XQFT.g:721:28: QuotAttributeContent
                    	    {
                    	    match(input,QuotAttributeContent,FOLLOW_QuotAttributeContent_in_dirAttributeValue9622); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:721:51: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9626);
                    	    xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9658); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:723:31: APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi
                    {
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9692); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_APOS_ATTRIBUTE;
                    }
                    // etc/XQFT.g:724:30: ( AposAttributeContent | xmlEnclosedExpr )*
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
                    	    // etc/XQFT.g:724:31: AposAttributeContent
                    	    {
                    	    match(input,AposAttributeContent,FOLLOW_AposAttributeContent_in_dirAttributeValue9726); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:724:54: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9730);
                    	    xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9765); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeValue


    // $ANTLR start xmlEnclosedExpr
    // etc/XQFT.g:726:14: xmlEnclosedExpr : LBRACESi expr RBRACSi ;
    public final void xmlEnclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:726:48: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:726:50: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_xmlEnclosedExpr9806); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.DEFAULT;
            }
            pushFollow(FOLLOW_expr_in_xmlEnclosedExpr9834);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_xmlEnclosedExpr9862); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.state = lexer.stack.pop();
            }

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end xmlEnclosedExpr


    // $ANTLR start dirElemContent
    // etc/XQFT.g:732:6: dirElemContent : ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:732:37: ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr )
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
                    new NoViableAltException("732:6: dirElemContent : ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr );", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // etc/XQFT.g:732:39: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent9895);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:732:59: cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent9899);
                    cDataSection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:732:74: ElementContent
                    {
                    match(input,ElementContent,FOLLOW_ElementContent_in_dirElemContent9903); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:732:91: xmlEnclosedExpr
                    {
                    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirElemContent9907);
                    xmlEnclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemContent


    // $ANTLR start cDataSection
    // etc/XQFT.g:734:7: cDataSection : LCDATASi CDataContents RCDATASi ;
    public final void cDataSection() throws RecognitionException {
        try {
            // etc/XQFT.g:734:26: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:734:28: LCDATASi CDataContents RCDATASi
            {
            match(input,LCDATASi,FOLLOW_LCDATASi_in_cDataSection9927); if (failed) return ;
            match(input,CDataContents,FOLLOW_CDataContents_in_cDataSection9929); if (failed) return ;
            match(input,RCDATASi,FOLLOW_RCDATASi_in_cDataSection9931); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end cDataSection


    // $ANTLR start dirCommentConstructor
    // etc/XQFT.g:739:5: dirCommentConstructor : LCOMMENTSi DirCommentContent RCOMMENTSi ;
    public final void dirCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:739:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:739:33: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            match(input,LCOMMENTSi,FOLLOW_LCOMMENTSi_in_dirCommentConstructor9954); if (failed) return ;
            match(input,DirCommentContent,FOLLOW_DirCommentContent_in_dirCommentConstructor9956); if (failed) return ;
            match(input,RCOMMENTSi,FOLLOW_RCOMMENTSi_in_dirCommentConstructor9958); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirCommentConstructor


    // $ANTLR start dirPIConstructor
    // etc/XQFT.g:741:5: dirPIConstructor : LPISi PiTarget ( DirPiContents )? RPISi ;
    public final void dirPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:741:27: ( LPISi PiTarget ( DirPiContents )? RPISi )
            // etc/XQFT.g:741:29: LPISi PiTarget ( DirPiContents )? RPISi
            {
            match(input,LPISi,FOLLOW_LPISi_in_dirPIConstructor9979); if (failed) return ;
            match(input,PiTarget,FOLLOW_PiTarget_in_dirPIConstructor9981); if (failed) return ;
            // etc/XQFT.g:741:44: ( DirPiContents )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==DirPiContents) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // etc/XQFT.g:741:44: DirPiContents
                    {
                    match(input,DirPiContents,FOLLOW_DirPiContents_in_dirPIConstructor9983); if (failed) return ;

                    }
                    break;

            }

            match(input,RPISi,FOLLOW_RPISi_in_dirPIConstructor9986); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirPIConstructor


    // $ANTLR start computedConstructor
    // etc/XQFT.g:743:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:743:35: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
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
                    new NoViableAltException("743:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // etc/XQFT.g:743:37: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor10012);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:744:40: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor10053);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:745:40: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor10094);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:746:40: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor10135);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:747:40: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor10176);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:748:40: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor10217);
                    compPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end computedConstructor


    // $ANTLR start compDocConstructor
    // etc/XQFT.g:750:5: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:750:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:750:38: DOCUMENT LBRACESi expr RBRACSi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor10245); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor10247); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor10249);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor10251); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compDocConstructor


    // $ANTLR start compElemConstructor
    // etc/XQFT.g:754:5: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:754:36: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:754:38: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor10280); if (failed) return ;
            // etc/XQFT.g:754:46: ( qName | LBRACESi expr RBRACSi )
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
                    new NoViableAltException("754:46: ( qName | LBRACESi expr RBRACSi )", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // etc/XQFT.g:754:47: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor10283);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:754:55: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor10287); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor10289);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor10291); if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor10310); if (failed) return ;
            // etc/XQFT.g:755:25: ( contentExpr )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=ANCESTOR && LA149_0<=ANCESTOR_OR_SELF)||LA149_0==ATTRIBUTE||LA149_0==CHILD||LA149_0==COMMENT||(LA149_0>=DESCENDANT && LA149_0<=DESCENDANT_OR_SELF)||(LA149_0>=DOCUMENT && LA149_0<=ELEMENT)||LA149_0==EVERY||(LA149_0>=FOLLOWING && LA149_0<=FOR)||LA149_0==IF||LA149_0==LET||LA149_0==NODE||LA149_0==ORDERED||LA149_0==PARENT||(LA149_0>=PRECEDING && LA149_0<=PRECEDING_SIBLING)||LA149_0==PROCESSING_INSTRUCTION||(LA149_0>=SCHEMAATTRIBUTE && LA149_0<=SCHEMAELEMENT)||LA149_0==SELF||LA149_0==SOME||LA149_0==TEXT||LA149_0==TYPESWITCH||LA149_0==UNORDERED||LA149_0==VALIDATE||LA149_0==StringLiteral||LA149_0==NCName||LA149_0==DOLLARSi||LA149_0==LPARSi||(LA149_0>=STARSi && LA149_0<=MINUSSi)||LA149_0==LTSi||(LA149_0>=IntegerLiteral && LA149_0<=LPRAGSi)||(LA149_0>=DBLSLASHSi && LA149_0<=SLASHSi)||(LA149_0>=DOTDOTSi && LA149_0<=ATSi)||LA149_0==DOTSi||LA149_0==LCOMMENTSi||LA149_0==LPISi) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:755:25: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor10312);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor10315); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compElemConstructor


    // $ANTLR start contentExpr
    // etc/XQFT.g:758:6: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:758:37: ( expr )
            // etc/XQFT.g:758:39: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr10348);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end contentExpr


    // $ANTLR start compAttrConstructor
    // etc/XQFT.g:762:5: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:762:36: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:762:38: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor10393); if (failed) return ;
            // etc/XQFT.g:762:48: ( qName | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("762:48: ( qName | ( LBRACESi expr RBRACSi ) )", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:762:49: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor10396);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:762:57: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:762:57: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:762:58: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor10401); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor10403);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor10405); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor10425); if (failed) return ;
            // etc/XQFT.g:763:25: ( expr )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( ((LA151_0>=ANCESTOR && LA151_0<=ANCESTOR_OR_SELF)||LA151_0==ATTRIBUTE||LA151_0==CHILD||LA151_0==COMMENT||(LA151_0>=DESCENDANT && LA151_0<=DESCENDANT_OR_SELF)||(LA151_0>=DOCUMENT && LA151_0<=ELEMENT)||LA151_0==EVERY||(LA151_0>=FOLLOWING && LA151_0<=FOR)||LA151_0==IF||LA151_0==LET||LA151_0==NODE||LA151_0==ORDERED||LA151_0==PARENT||(LA151_0>=PRECEDING && LA151_0<=PRECEDING_SIBLING)||LA151_0==PROCESSING_INSTRUCTION||(LA151_0>=SCHEMAATTRIBUTE && LA151_0<=SCHEMAELEMENT)||LA151_0==SELF||LA151_0==SOME||LA151_0==TEXT||LA151_0==TYPESWITCH||LA151_0==UNORDERED||LA151_0==VALIDATE||LA151_0==StringLiteral||LA151_0==NCName||LA151_0==DOLLARSi||LA151_0==LPARSi||(LA151_0>=STARSi && LA151_0<=MINUSSi)||LA151_0==LTSi||(LA151_0>=IntegerLiteral && LA151_0<=LPRAGSi)||(LA151_0>=DBLSLASHSi && LA151_0<=SLASHSi)||(LA151_0>=DOTDOTSi && LA151_0<=ATSi)||LA151_0==DOTSi||LA151_0==LCOMMENTSi||LA151_0==LPISi) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:763:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor10427);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor10430); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compAttrConstructor


    // $ANTLR start compTextConstructor
    // etc/XQFT.g:765:5: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:765:36: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:765:38: TEXT LBRACESi expr RBRACSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor10466); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor10468); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor10470);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor10472); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compTextConstructor


    // $ANTLR start compCommentConstructor
    // etc/XQFT.g:767:5: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:767:36: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:767:38: COMMENT LBRACESi expr RBRACSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor10496); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor10498); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor10500);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor10502); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compCommentConstructor


    // $ANTLR start compPIConstructor
    // etc/XQFT.g:769:5: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:769:36: ( PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:769:38: PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10531); if (failed) return ;
            // etc/XQFT.g:769:61: ( NCName | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("769:61: ( NCName | ( LBRACESi expr RBRACSi ) )", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // etc/XQFT.g:769:62: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor10534); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:769:71: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:769:71: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:769:72: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10539); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor10541);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10543); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10563); if (failed) return ;
            // etc/XQFT.g:770:25: ( expr )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=ANCESTOR && LA153_0<=ANCESTOR_OR_SELF)||LA153_0==ATTRIBUTE||LA153_0==CHILD||LA153_0==COMMENT||(LA153_0>=DESCENDANT && LA153_0<=DESCENDANT_OR_SELF)||(LA153_0>=DOCUMENT && LA153_0<=ELEMENT)||LA153_0==EVERY||(LA153_0>=FOLLOWING && LA153_0<=FOR)||LA153_0==IF||LA153_0==LET||LA153_0==NODE||LA153_0==ORDERED||LA153_0==PARENT||(LA153_0>=PRECEDING && LA153_0<=PRECEDING_SIBLING)||LA153_0==PROCESSING_INSTRUCTION||(LA153_0>=SCHEMAATTRIBUTE && LA153_0<=SCHEMAELEMENT)||LA153_0==SELF||LA153_0==SOME||LA153_0==TEXT||LA153_0==TYPESWITCH||LA153_0==UNORDERED||LA153_0==VALIDATE||LA153_0==StringLiteral||LA153_0==NCName||LA153_0==DOLLARSi||LA153_0==LPARSi||(LA153_0>=STARSi && LA153_0<=MINUSSi)||LA153_0==LTSi||(LA153_0>=IntegerLiteral && LA153_0<=LPRAGSi)||(LA153_0>=DBLSLASHSi && LA153_0<=SLASHSi)||(LA153_0>=DOTDOTSi && LA153_0<=ATSi)||LA153_0==DOTSi||LA153_0==LCOMMENTSi||LA153_0==LPISi) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // etc/XQFT.g:770:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor10565);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10568); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compPIConstructor

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:347:34: ( itemType occurrenceIndicator )
        // etc/XQFT.g:347:35: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred12105);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred12107);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:629:35: ( DBLSLASHSi relativePathExpr )
        // etc/XQFT.g:629:36: DBLSLASHSi relativePathExpr
        {
        match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_synpred27753); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred27755);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:630:14: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:630:15: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred37778); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred37780);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:643:41: ( STARSi COLONSi NCName )
        // etc/XQFT.g:643:42: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred48138); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred48140); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred48142); if (failed) return ;

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
        "\1\14\12\u0098\1\10\1\uffff\1\44\4\u0092\1\u0090\4\u0099\1\u0092"+
        "\1\6\1\uffff\1\6\1\uffff\2\u0098\1\10\2\u0094\1\10\2\u0094\1\10"+
        "\2\u0097\1\u0099\6\10\3\6\50\uffff\1\0\2\6\7\u0092\1\10\1\u0092"+
        "\1\10\1\6\1\110\1\6\3\0\1\u0092\3\0\2\u009a\1\u0092\1\u00c1\1\u00c4"+
        "\1\u009a\2\u0092\2\u0098\1\u0092\1\u00b0\1\0\1\u00b0\1\14\4\u0098"+
        "\1\0\1\u0092\11\uffff\1\10\25\uffff\4\6\1\uffff\1\6\31\uffff\1\10"+
        "\3\6\2\u0094\1\u0099\1\u0097\1\u0094\1\u0097\1\u0094\1\u0097\2\u0099"+
        "\1\0\1\u009a\75\0\21\uffff\72\0\1\uffff\2\0\11\uffff\133\0";
    static final String DFA27_maxS =
        "\1\u0092\12\u0098\1\u00b4\1\uffff\1\u0099\2\u009d\2\u0092\5\u0099"+
        "\1\u0092\1\u00c3\1\uffff\1\u00c3\1\uffff\2\u0098\1\u00b4\2\u0099"+
        "\1\u00b4\2\u0099\1\u00b4\3\u0099\6\u00b4\3\u00c3\50\uffff\1\0\2"+
        "\u00c3\1\u009d\6\u0092\1\u00b4\1\u0092\1\u00b4\1\u00c3\1\u009a\1"+
        "\u00c3\3\0\1\u0092\3\0\2\u009a\1\u0092\1\u00c1\1\u00c4\2\u009a\1"+
        "\u00b0\3\u009a\1\u00b0\1\0\1\u00b0\1\u009d\4\u0098\1\0\1\u0092\11"+
        "\uffff\1\u00b6\25\uffff\4\u00c3\1\uffff\1\u00c3\31\uffff\1\u00b6"+
        "\3\u00c3\5\u0099\1\u009c\4\u0099\1\0\1\u009a\75\0\21\uffff\72\0"+
        "\1\uffff\2\0\11\uffff\133\0";
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
            "\1\3\10\uffff\1\7\15\uffff\1\1\1\2\5\uffff\1\14\33\uffff\1\12"+
            "\15\uffff\1\11\21\uffff\1\6\5\uffff\1\5\1\4\14\uffff\1\10\27"+
            "\uffff\1\13",
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
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\1\27\1\uffff\3\31\1\33"+
            "\1\30\1\32\11\31\14\uffff\1\31",
            "",
            "\1\34\110\uffff\1\35\53\uffff\1\36",
            "\1\37\6\uffff\1\41\3\uffff\1\40",
            "\1\42\6\uffff\1\44\3\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47\1\uffff\1\47\6\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\2\31\1\102\1\uffff\1\115\1\65\1\31\3\uffff\1\122\2\uffff\1"+
            "\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1\74\3\31\1"+
            "\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\72\1\62\2\31\1\113"+
            "\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74\2\uffff\1\67\2"+
            "\uffff\1\130\1\72\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff"+
            "\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111\1\31\2\uffff"+
            "\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\71\1\uffff\1"+
            "\120\1\uffff\2\31\1\66\1\31\1\uffff\1\126\2\uffff\1\112\5\uffff"+
            "\1\31\2\uffff\1\125\1\75\2\uffff\1\73\1\31\1\uffff\1\31\3\uffff"+
            "\1\110\3\uffff\1\124\1\uffff\1\126\1\uffff\1\31\1\107\1\31\1"+
            "\100\1\63\1\31\1\61\1\uffff\1\31\1\64\1\70\1\105\1\uffff\1\60"+
            "\2\56\1\73\1\100\1\57\3\100\2\101\4\31\2\uffff\2\31\1\uffff"+
            "\2\31\1\uffff\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "",
            "\2\31\1\102\1\uffff\1\115\1\65\1\31\3\uffff\1\122\2\uffff\1"+
            "\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1\74\3\31\1"+
            "\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\72\1\62\2\31\1\113"+
            "\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74\2\uffff\1\67\2"+
            "\uffff\1\130\1\72\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff"+
            "\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111\1\31\2\uffff"+
            "\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\71\1\uffff\1"+
            "\120\1\uffff\2\31\1\66\1\31\1\uffff\1\126\2\uffff\1\112\5\uffff"+
            "\1\31\2\uffff\1\125\1\75\2\uffff\1\73\1\31\1\uffff\1\31\3\uffff"+
            "\1\110\3\uffff\1\124\1\uffff\1\126\1\uffff\1\31\1\107\1\31\1"+
            "\100\1\63\1\31\1\61\1\uffff\1\31\1\64\1\70\1\105\1\uffff\1\133"+
            "\2\131\1\73\1\100\1\132\3\100\2\101\4\31\2\uffff\2\31\1\uffff"+
            "\2\31\1\uffff\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "",
            "\1\134",
            "\1\135",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\137\2\uffff\1\136\1\uffff\1\41",
            "\1\137\4\uffff\1\41",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\141\2\uffff\1\140\1\uffff\1\44",
            "\1\141\4\uffff\1\44",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\142\1\uffff\1\143",
            "\1\144\1\uffff\1\145",
            "\1\50",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\2\173\4\uffff\1\167\6\uffff\1\175\1\uffff\1\171\5\uffff\2\175"+
            "\5\uffff\1\165\1\177\1\166\13\uffff\2\175\42\uffff\1\u0082\10"+
            "\uffff\1\160\3\uffff\1\173\1\uffff\2\173\1\uffff\1\172\5\uffff"+
            "\1\u0081\1\u0080\1\uffff\1\175\12\uffff\1\170\7\uffff\1\161"+
            "\1\uffff\1\147\13\uffff\1\153\1\uffff\1\157\2\uffff\1\154\2"+
            "\uffff\1\155\4\uffff\1\u0083\2\146\2\uffff\1\162\5\uffff\3\152"+
            "\1\u0084\2\uffff\1\150\1\151\1\uffff\1\174\1\176\2\uffff\1\156"+
            "\12\uffff\1\163\2\uffff\1\164",
            "\2\u009a\4\uffff\1\u0096\6\uffff\1\u009c\1\uffff\1\u0098\5\uffff"+
            "\2\u009c\5\uffff\1\u0094\1\u009e\1\u0095\13\uffff\2\u009c\42"+
            "\uffff\1\u00a1\10\uffff\1\u008f\3\uffff\1\u009a\1\uffff\2\u009a"+
            "\1\uffff\1\u0099\5\uffff\1\u00a0\1\u009f\1\uffff\1\u009c\12"+
            "\uffff\1\u0097\7\uffff\1\u0090\1\uffff\1\u0086\13\uffff\1\u008a"+
            "\1\uffff\1\u008e\2\uffff\1\u008b\2\uffff\1\u008c\4\uffff\1\u00a2"+
            "\2\u0085\2\uffff\1\u0091\5\uffff\3\u0089\1\u00a3\2\uffff\1\u0087"+
            "\1\u0088\1\uffff\1\u009b\1\u009d\2\uffff\1\u008d\12\uffff\1"+
            "\u0092\2\uffff\1\u0093",
            "\2\u00ba\1\31\1\uffff\1\31\1\uffff\1\u00b6\3\uffff\3\31\1\u00bc"+
            "\1\31\1\u00b8\4\uffff\1\31\2\u00bc\1\31\3\uffff\1\31\1\u00b4"+
            "\1\u00be\1\u00b5\1\31\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31"+
            "\1\uffff\2\u00bc\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31"+
            "\5\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1\uffff\2\31\3\uffff"+
            "\1\31\1\u00c1\6\uffff\2\31\1\u00b0\2\uffff\1\31\1\u00ba\1\uffff"+
            "\2\u00ba\1\uffff\1\u00b9\1\uffff\1\31\1\uffff\1\31\1\uffff\1"+
            "\u00c0\1\u00bf\1\uffff\1\u00bc\1\uffff\1\31\2\uffff\1\31\5\uffff"+
            "\1\u00b7\2\uffff\3\31\1\uffff\1\31\1\u00b1\1\uffff\1\u00a8\3"+
            "\uffff\1\31\3\uffff\1\31\1\uffff\1\31\1\uffff\1\u00ab\1\31\1"+
            "\u00af\2\31\1\u00ac\1\uffff\1\31\1\u00ad\1\31\1\uffff\1\31\1"+
            "\uffff\1\u00a7\2\u00a5\2\31\1\u00a6\5\31\3\u00aa\1\u00c2\2\uffff"+
            "\1\u00a4\1\u00a9\1\uffff\1\u00bb\1\u00bd\2\31\1\u00ae\12\uffff"+
            "\1\u00b2\2\uffff\1\u00b3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\2\u009a\4\uffff\1\u0096\6\uffff\1\u009c\1\uffff\1\u0098\5\uffff"+
            "\2\u009c\5\uffff\1\u0094\1\u009e\1\u0095\13\uffff\2\u009c\42"+
            "\uffff\1\u00a1\10\uffff\1\u008f\3\uffff\1\u009a\1\uffff\2\u009a"+
            "\1\uffff\1\u0099\5\uffff\1\u00a0\1\u009f\1\uffff\1\u009c\12"+
            "\uffff\1\u0097\7\uffff\1\u0090\1\uffff\1\u0086\13\uffff\1\u008a"+
            "\1\uffff\1\u00c3\2\uffff\1\u008b\2\uffff\1\u008c\4\uffff\1\u00a2"+
            "\2\u0085\2\uffff\1\u0091\5\uffff\3\u0089\1\u00a3\2\uffff\1\u0087"+
            "\1\u0088\1\uffff\1\u009b\1\u009d\2\uffff\1\u008d\12\uffff\1"+
            "\u0092\2\uffff\1\u0093",
            "\2\u00ba\1\31\1\uffff\1\31\1\uffff\1\u00b6\3\uffff\3\31\1\u00bc"+
            "\1\31\1\u00b8\4\uffff\1\31\2\u00bc\1\31\3\uffff\1\31\1\u00b4"+
            "\1\u00be\1\u00b5\1\31\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31"+
            "\1\uffff\2\u00bc\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31"+
            "\5\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1\uffff\2\31\3\uffff"+
            "\1\31\1\u00c1\6\uffff\2\31\1\u00b0\2\uffff\1\31\1\u00ba\1\uffff"+
            "\2\u00ba\1\uffff\1\u00b9\1\uffff\1\31\1\uffff\1\31\1\uffff\1"+
            "\u00c0\1\u00bf\1\uffff\1\u00bc\1\uffff\1\31\2\uffff\1\31\5\uffff"+
            "\1\u00b7\2\uffff\3\31\1\uffff\1\31\1\u00b1\1\uffff\1\u00a8\3"+
            "\uffff\1\31\3\uffff\1\31\1\uffff\1\31\1\uffff\1\u00ab\1\31\1"+
            "\u00af\2\31\1\u00ac\1\uffff\1\31\1\u00ad\1\31\1\uffff\1\31\1"+
            "\uffff\1\u00c5\2\u00a5\2\31\1\u00a6\5\31\3\u00aa\1\u00c2\2\uffff"+
            "\1\u00c4\1\u00c6\1\uffff\1\u00bb\1\u00bd\2\31\1\u00ae\12\uffff"+
            "\1\u00b2\2\uffff\1\u00b3",
            "\1\u00c7\6\uffff\1\u00c9\3\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\u00d0",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\2\173\4\uffff\1\167\6\uffff\1\175\1\uffff\1\171\5\uffff\2\175"+
            "\5\uffff\1\165\1\177\1\166\13\uffff\2\175\42\uffff\1\u0082\10"+
            "\uffff\1\160\3\uffff\1\173\1\uffff\2\173\1\uffff\1\172\5\uffff"+
            "\1\u0081\1\u0080\1\uffff\1\175\12\uffff\1\170\7\uffff\1\161"+
            "\1\uffff\1\147\13\uffff\1\153\1\uffff\1\157\2\uffff\1\154\2"+
            "\uffff\1\u00d1\4\uffff\1\u0083\2\146\2\uffff\1\162\5\uffff\3"+
            "\152\1\u0084\2\uffff\1\150\1\151\1\uffff\1\174\1\176\2\uffff"+
            "\1\156\12\uffff\1\163\2\uffff\1\164",
            "\1\u00d2\57\uffff\1\u00d2\41\uffff\1\u00d3",
            "\2\u00e5\4\uffff\1\u00e1\6\uffff\1\u00e7\1\uffff\1\u00e3\5\uffff"+
            "\2\u00e7\5\uffff\1\u00df\1\u00e9\1\u00e0\13\uffff\2\u00e7\42"+
            "\uffff\1\u00ec\10\uffff\1\u00da\3\uffff\1\u00e5\1\uffff\2\u00e5"+
            "\1\uffff\1\u00e4\5\uffff\1\u00eb\1\u00ea\1\uffff\1\u00e7\12"+
            "\uffff\1\u00e2\7\uffff\1\u00db\15\uffff\1\u00d5\1\uffff\1\u00d9"+
            "\2\uffff\1\u00d6\2\uffff\1\u00d7\4\uffff\1\u00ed\4\uffff\1\u00dc"+
            "\5\uffff\3\u00d4\6\uffff\1\u00e6\1\u00e8\2\uffff\1\u00d8\12"+
            "\uffff\1\u00dd\2\uffff\1\u00de",
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
            "\1\u00f6\5\uffff\1\u00f5\1\uffff\1\u00f7",
            "\1\u00fa\5\uffff\1\u00f9\1\uffff\1\u00fb\25\uffff\1\u00f8",
            "\1\u00fd\1\uffff\1\u00fc",
            "\1\u00ff\1\uffff\1\u00fe",
            "\1\u0101\5\uffff\1\u0100\1\uffff\1\u0102",
            "\1\u0103",
            "\1\uffff",
            "\1\u00f8",
            "\1\u0105\10\uffff\1\u0107\15\uffff\1\177\1\u0104\57\uffff\1"+
            "\u0082\21\uffff\1\u0106\5\uffff\1\u0081\1\u0080\14\uffff\1\u0108"+
            "\27\uffff\1\u0109\12\uffff\1\u0083",
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
            "\1\102\1\uffff\1\115\5\uffff\1\122\1\u0113\1\u0114\1\uffff\1"+
            "\117\5\uffff\1\121\2\uffff\1\115\3\uffff\1\u0119\3\uffff\1\123"+
            "\3\uffff\1\116\4\uffff\1\u0117\3\uffff\1\113\2\uffff\1\u011c"+
            "\7\uffff\1\u0119\5\uffff\1\u0116\1\u0117\6\uffff\1\114\3\uffff"+
            "\1\u0119\13\uffff\1\103\1\111\13\uffff\1\u0120\1\uffff\1\120"+
            "\11\uffff\1\112\11\uffff\1\u011b\1\u0115\1\uffff\1\u0118\6\uffff"+
            "\1\110\10\uffff\1\107\1\31\1\uffff\1\u011d\2\uffff\1\u010f\1"+
            "\u0110\1\u011f\1\uffff\1\u011e\1\uffff\1\u0119\2\u011a\1\u0118"+
            "\3\uffff\1\31\11\uffff\2\u0112\3\uffff\1\u0111\1\106\1\uffff"+
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
            "\2\u0132\4\uffff\1\u012e\6\uffff\1\u0134\1\uffff\1\u0130\5\uffff"+
            "\2\u0134\5\uffff\1\u012c\1\u0136\1\u012d\13\uffff\2\u0134\42"+
            "\uffff\1\u0139\10\uffff\1\u0127\3\uffff\1\u0132\1\uffff\2\u0132"+
            "\1\uffff\1\u0131\5\uffff\1\u0138\1\u0137\1\uffff\1\u0134\12"+
            "\uffff\1\u012f\7\uffff\1\u0128\15\uffff\1\u0122\1\uffff\1\u0126"+
            "\2\uffff\1\u0123\2\uffff\1\u0124\4\uffff\1\u013a\4\uffff\1\u0129"+
            "\5\uffff\3\u0121\6\uffff\1\u0133\1\u0135\2\uffff\1\u0125\12"+
            "\uffff\1\u012a\2\uffff\1\u012b",
            "\2\u0150\4\uffff\1\u014c\6\uffff\1\u0152\1\uffff\1\u014e\5\uffff"+
            "\2\u0152\5\uffff\1\u014a\1\u0154\1\u014b\13\uffff\2\u0152\42"+
            "\uffff\1\u0157\10\uffff\1\u0145\3\uffff\1\u0150\1\uffff\2\u0150"+
            "\1\uffff\1\u014f\5\uffff\1\u0156\1\u0155\1\uffff\1\u0152\12"+
            "\uffff\1\u014d\7\uffff\1\u0146\1\uffff\1\u013c\13\uffff\1\u0140"+
            "\1\uffff\1\u0144\2\uffff\1\u0141\2\uffff\1\u0142\4\uffff\1\u0158"+
            "\2\u013b\2\uffff\1\u0147\5\uffff\3\u013f\1\u0159\2\uffff\1\u013d"+
            "\1\u013e\1\uffff\1\u0151\1\u0153\2\uffff\1\u0143\12\uffff\1"+
            "\u0148\2\uffff\1\u0149",
            "\2\31\4\uffff\1\31\6\uffff\1\31\1\uffff\1\31\5\uffff\2\31\5"+
            "\uffff\3\31\13\uffff\2\31\42\uffff\1\31\10\uffff\1\31\3\uffff"+
            "\1\31\1\uffff\2\31\1\uffff\1\31\5\uffff\2\31\1\uffff\1\31\12"+
            "\uffff\1\31\7\uffff\1\31\1\uffff\1\31\13\uffff\1\31\1\uffff"+
            "\1\u015a\2\uffff\1\31\2\uffff\1\31\4\uffff\3\31\2\uffff\1\31"+
            "\5\uffff\4\31\2\uffff\2\31\1\uffff\2\31\2\uffff\1\31\12\uffff"+
            "\1\31\2\uffff\1\31",
            "\2\31\1\102\1\uffff\1\115\1\uffff\1\31\3\uffff\1\122\1\u015f"+
            "\1\u0160\1\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1"+
            "\74\3\31\1\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\u0163\1"+
            "\uffff\2\31\1\113\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74"+
            "\5\uffff\1\u0162\1\u0163\1\101\3\uffff\1\77\1\uffff\1\114\1"+
            "\127\1\uffff\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111"+
            "\1\31\2\uffff\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1"+
            "\u0120\1\uffff\1\120\1\uffff\2\31\1\uffff\1\31\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\31\2\uffff\1\125\1\75\1\u0161\1\uffff"+
            "\1\u0164\1\31\1\uffff\1\31\3\uffff\1\110\3\uffff\1\124\1\uffff"+
            "\1\126\1\uffff\1\31\1\107\1\31\1\100\1\u011d\1\31\1\uffff\1"+
            "\u015b\1\31\1\u0165\1\uffff\1\105\1\uffff\1\60\2\56\1\u0164"+
            "\1\100\1\57\3\100\2\101\4\31\2\uffff\1\u015c\1\u015d\1\uffff"+
            "\2\31\1\u015e\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "",
            "\2\u0179\1\102\1\uffff\1\115\1\uffff\1\u0175\3\uffff\1\122\1"+
            "\u015f\1\u0160\1\u017b\1\117\1\u0177\4\uffff\1\121\2\u017b\1"+
            "\115\3\uffff\1\74\1\u0173\1\u017d\1\u0174\1\123\3\uffff\1\116"+
            "\1\uffff\1\77\2\uffff\1\u0163\1\uffff\2\u017b\1\113\2\uffff"+
            "\1\76\4\uffff\1\77\1\uffff\1\77\1\74\5\uffff\1\u0162\1\u0163"+
            "\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff\1\77\1\74\3"+
            "\uffff\1\77\1\u0180\6\uffff\1\103\1\111\1\u016f\2\uffff\1\126"+
            "\1\u0179\1\uffff\2\u0179\1\uffff\1\u0178\1\uffff\1\u0120\1\uffff"+
            "\1\120\1\uffff\1\u017f\1\u017e\1\uffff\1\u017b\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\u0176\2\uffff\1\125\1\75\1\u0161\1"+
            "\uffff\1\u0164\1\u0170\5\uffff\1\110\3\uffff\1\124\1\uffff\1"+
            "\126\1\uffff\1\u016a\1\107\1\u016e\1\100\1\u011d\1\u016b\2\uffff"+
            "\1\u016c\1\u0165\1\uffff\1\105\1\uffff\1\u0168\2\u0166\1\u0164"+
            "\1\100\1\u0167\3\100\2\101\3\u0169\6\uffff\1\u017a\1\u017c\1"+
            "\uffff\1\106\1\u016d\12\uffff\1\u0171\2\uffff\1\u0172",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\uffff\1\115\5\uffff\1\122\1\u0113\1\u0114\1\uffff\1"+
            "\117\5\uffff\1\121\2\uffff\1\115\3\uffff\1\u0119\3\uffff\1\123"+
            "\3\uffff\1\116\4\uffff\1\u0117\3\uffff\1\113\2\uffff\1\u011c"+
            "\7\uffff\1\u0119\5\uffff\1\u0116\1\u0117\6\uffff\1\114\3\uffff"+
            "\1\u0119\13\uffff\1\103\1\111\13\uffff\1\u0120\1\uffff\1\120"+
            "\11\uffff\1\112\11\uffff\1\u011b\1\u0115\1\uffff\1\u0118\6\uffff"+
            "\1\110\10\uffff\1\107\1\31\1\uffff\1\u011d\2\uffff\1\u0181\1"+
            "\u0110\1\u011f\1\uffff\1\u011e\1\uffff\1\u0119\2\u011a\1\u0118"+
            "\3\uffff\1\31\11\uffff\2\u0112\3\uffff\1\u0111\1\106\1\uffff"+
            "\1\31",
            "\2\u0193\4\uffff\1\u018f\6\uffff\1\u0195\1\uffff\1\u0191\5\uffff"+
            "\2\u0195\5\uffff\1\u018d\1\u0197\1\u018e\13\uffff\2\u0195\42"+
            "\uffff\1\u019a\10\uffff\1\u0188\3\uffff\1\u0193\1\uffff\2\u0193"+
            "\1\uffff\1\u0192\5\uffff\1\u0199\1\u0198\1\uffff\1\u0195\12"+
            "\uffff\1\u0190\7\uffff\1\u0189\15\uffff\1\u0183\1\uffff\1\u0187"+
            "\2\uffff\1\u0184\2\uffff\1\u0185\4\uffff\1\u019b\4\uffff\1\u018a"+
            "\5\uffff\3\u0182\6\uffff\1\u0194\1\u0196\2\uffff\1\u0186\12"+
            "\uffff\1\u018b\2\uffff\1\u018c",
            "\2\31\1\102\1\uffff\1\115\1\uffff\1\31\3\uffff\1\122\1\u015f"+
            "\1\u0160\1\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1"+
            "\74\3\31\1\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\u0163\1"+
            "\uffff\2\31\1\113\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74"+
            "\5\uffff\1\u0162\1\u0163\1\101\3\uffff\1\77\1\uffff\1\114\1"+
            "\127\1\uffff\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111"+
            "\1\31\2\uffff\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1"+
            "\u0120\1\uffff\1\120\1\uffff\2\31\1\uffff\1\31\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\31\2\uffff\1\125\1\75\1\u0161\1\uffff"+
            "\1\u0164\1\31\1\uffff\1\31\3\uffff\1\110\3\uffff\1\124\1\uffff"+
            "\1\126\1\uffff\1\31\1\107\1\31\1\100\1\u011d\1\31\1\uffff\1"+
            "\u015b\1\31\1\u0165\1\uffff\1\105\1\uffff\1\u01a0\2\u019c\1"+
            "\u0164\1\100\1\u019f\3\100\2\101\4\31\2\uffff\1\u019d\1\u019e"+
            "\1\uffff\2\31\1\u015e\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "\2\u01b3\1\102\1\uffff\1\115\1\uffff\1\u01af\3\uffff\1\122\1"+
            "\u015f\1\u0160\1\u01b5\1\117\1\u01b1\4\uffff\1\121\2\u01b5\1"+
            "\115\3\uffff\1\74\1\u01ad\1\u01b7\1\u01ae\1\123\3\uffff\1\116"+
            "\1\uffff\1\77\2\uffff\1\u0163\1\uffff\2\u01b5\1\113\2\uffff"+
            "\1\76\4\uffff\1\77\1\uffff\1\77\1\74\5\uffff\1\u0162\1\u0163"+
            "\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff\1\77\1\74\3"+
            "\uffff\1\77\1\u01ba\6\uffff\1\103\1\111\1\u01a9\2\uffff\1\126"+
            "\1\u01b3\1\uffff\2\u01b3\1\uffff\1\u01b2\1\uffff\1\u0120\1\uffff"+
            "\1\120\1\uffff\1\u01b9\1\u01b8\1\uffff\1\u01b5\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\u01b0\2\uffff\1\125\1\75\1\u0161\1"+
            "\uffff\1\u0164\1\u01aa\5\uffff\1\110\3\uffff\1\124\1\uffff\1"+
            "\126\1\uffff\1\u01a4\1\107\1\u01a8\1\100\1\u011d\1\u01a5\2\uffff"+
            "\1\u01a6\1\u0165\1\uffff\1\105\1\uffff\1\u01a2\2\u0166\1\u0164"+
            "\1\100\1\u01a1\3\100\2\101\3\u01a3\6\uffff\1\u01b4\1\u01b6\1"+
            "\uffff\1\106\1\u01a7\12\uffff\1\u01ab\2\uffff\1\u01ac",
            "\1\u01bc\2\uffff\1\u01bb\1\uffff\1\u00c9",
            "\1\u01bc\4\uffff\1\u00c9",
            "\1\36",
            "\1\u01bd\1\uffff\1\u01be",
            "\1\137\4\uffff\1\41",
            "\1\u01bf\1\uffff\1\41\2\uffff\1\u01c0",
            "\1\141\4\uffff\1\44",
            "\1\u01c1\1\uffff\1\44",
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
            return "347:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );";
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

                        else if ( (LA27_43==EOF||LA27_43==AND||(LA27_43>=ASCENDING && LA27_43<=AT)||LA27_43==CASE||LA27_43==COLLATION||LA27_43==DEFAULT||LA27_43==DESCENDING||LA27_43==DIV||LA27_43==ELSE||LA27_43==EMPTY||LA27_43==EQ||(LA27_43>=EXCEPT && LA27_43<=EXTERNAL)||LA27_43==FOR||LA27_43==FTCONTAINS||LA27_43==GE||(LA27_43>=GT && LA27_43<=IDIV)||LA27_43==IN||(LA27_43>=INSTANCE && LA27_43<=IS)||LA27_43==LE||(LA27_43>=LET && LA27_43<=LEVELS)||(LA27_43>=LT && LA27_43<=MOD)||LA27_43==NE||(LA27_43>=OR && LA27_43<=ORDER)||LA27_43==PARAGRAPHS||LA27_43==RETURN||LA27_43==SATISFIES||LA27_43==SCORE||LA27_43==SENTENCES||LA27_43==STABLE||(LA27_43>=TIMES && LA27_43<=TO)||LA27_43==UNION||LA27_43==WHERE||LA27_43==WITHOUT||LA27_43==WORDS||LA27_43==SEMICOLONSi||(LA27_43>=EQSi && LA27_43<=COMMASi)||LA27_43==ASSIGNSi||(LA27_43>=RPARSi && LA27_43<=RBRACSi)||(LA27_43>=MINUSSi && LA27_43<=NODEAFTERSi)||LA27_43==RBRACKSi) ) {s = 25;}

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
                        if ( (LA27_42==EOF||LA27_42==AND||(LA27_42>=ASCENDING && LA27_42<=AT)||LA27_42==CASE||LA27_42==COLLATION||LA27_42==DEFAULT||LA27_42==DESCENDING||LA27_42==DIV||LA27_42==ELSE||LA27_42==EMPTY||LA27_42==EQ||(LA27_42>=EXCEPT && LA27_42<=EXTERNAL)||LA27_42==FOR||LA27_42==FTCONTAINS||LA27_42==GE||(LA27_42>=GT && LA27_42<=IDIV)||LA27_42==IN||(LA27_42>=INSTANCE && LA27_42<=IS)||LA27_42==LE||(LA27_42>=LET && LA27_42<=LEVELS)||(LA27_42>=LT && LA27_42<=MOD)||LA27_42==NE||(LA27_42>=OR && LA27_42<=ORDER)||LA27_42==PARAGRAPHS||LA27_42==RETURN||LA27_42==SATISFIES||LA27_42==SCORE||LA27_42==SENTENCES||LA27_42==STABLE||(LA27_42>=TIMES && LA27_42<=TO)||LA27_42==UNION||LA27_42==WHERE||LA27_42==WITHOUT||LA27_42==WORDS||LA27_42==SEMICOLONSi||(LA27_42>=EQSi && LA27_42<=COMMASi)||LA27_42==ASSIGNSi||(LA27_42>=RPARSi && LA27_42<=RBRACSi)||(LA27_42>=MINUSSi && LA27_42<=NODEAFTERSi)||LA27_42==RBRACKSi) ) {s = 25;}

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

                        else if ( (LA27_41==EOF||LA27_41==AND||(LA27_41>=ASCENDING && LA27_41<=AT)||LA27_41==CASE||LA27_41==COLLATION||LA27_41==DEFAULT||LA27_41==DESCENDING||LA27_41==DIV||LA27_41==ELSE||LA27_41==EMPTY||LA27_41==EQ||(LA27_41>=EXCEPT && LA27_41<=EXTERNAL)||LA27_41==FOR||LA27_41==FTCONTAINS||LA27_41==GE||(LA27_41>=GT && LA27_41<=IDIV)||LA27_41==IN||(LA27_41>=INSTANCE && LA27_41<=IS)||LA27_41==LE||(LA27_41>=LET && LA27_41<=LEVELS)||(LA27_41>=LT && LA27_41<=MOD)||LA27_41==NE||(LA27_41>=OR && LA27_41<=ORDER)||LA27_41==PARAGRAPHS||LA27_41==RETURN||LA27_41==SATISFIES||LA27_41==SCORE||LA27_41==SENTENCES||LA27_41==STABLE||(LA27_41>=TIMES && LA27_41<=TO)||LA27_41==UNION||LA27_41==WHERE||LA27_41==WITHOUT||LA27_41==WORDS||LA27_41==SEMICOLONSi||(LA27_41>=EQSi && LA27_41<=COMMASi)||LA27_41==ASSIGNSi||(LA27_41>=RPARSi && LA27_41<=RBRACSi)||(LA27_41>=MINUSSi && LA27_41<=NODEAFTERSi)||LA27_41==RBRACKSi) ) {s = 25;}

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
                        if ( (LA27_48==EOF||LA27_48==AND||LA27_48==ASCENDING||(LA27_48>=CASE && LA27_48<=CASTABLE)||LA27_48==COLLATION||LA27_48==DEFAULT||LA27_48==DESCENDING||LA27_48==DIV||LA27_48==ELSE||LA27_48==EMPTY||LA27_48==EQ||LA27_48==EXCEPT||LA27_48==FOR||LA27_48==FTCONTAINS||LA27_48==GE||(LA27_48>=GT && LA27_48<=IDIV)||(LA27_48>=INSTANCE && LA27_48<=IS)||LA27_48==LE||(LA27_48>=LET && LA27_48<=LEVELS)||(LA27_48>=LT && LA27_48<=MOD)||LA27_48==NE||(LA27_48>=OR && LA27_48<=ORDER)||LA27_48==PARAGRAPHS||LA27_48==RETURN||LA27_48==SATISFIES||LA27_48==SENTENCES||LA27_48==STABLE||(LA27_48>=TIMES && LA27_48<=TREAT)||LA27_48==UNION||LA27_48==WHERE||LA27_48==WITHOUT||LA27_48==WORDS||LA27_48==SEMICOLONSi||(LA27_48>=EQSi && LA27_48<=COMMASi)||LA27_48==COLONSi||LA27_48==RPARSi||LA27_48==RBRACSi||(LA27_48>=PIPESi && LA27_48<=NEQSi)||(LA27_48>=LTOREQSi && LA27_48<=NODEAFTERSi)||(LA27_48>=LBRACKSi && LA27_48<=RBRACKSi)) ) {s = 25;}

                        else if ( (LA27_48==DBLSLASHSi) ) {s = 164;}

                        else if ( ((LA27_48>=PLUSSi && LA27_48<=MINUSSi)) ) {s = 165;}

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

                        else if ( ((LA27_48>=ANCESTOR && LA27_48<=ANCESTOR_OR_SELF)||LA27_48==PARENT||(LA27_48>=PRECEDING && LA27_48<=PRECEDING_SIBLING)) && (synpred1())) {s = 186;}

                        else if ( (LA27_48==DOTDOTSi) && (synpred1())) {s = 187;}

                        else if ( (LA27_48==CHILD||(LA27_48>=DESCENDANT && LA27_48<=DESCENDANT_OR_SELF)||(LA27_48>=FOLLOWING && LA27_48<=FOLLOWING_SIBLING)||LA27_48==SELF) && (synpred1())) {s = 188;}

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

                        else if ( (LA27_33==EOF||LA27_33==AND||(LA27_33>=ASCENDING && LA27_33<=AT)||LA27_33==CASE||LA27_33==COLLATION||LA27_33==DEFAULT||LA27_33==DESCENDING||LA27_33==DIV||LA27_33==ELSE||LA27_33==EMPTY||LA27_33==EQ||(LA27_33>=EXCEPT && LA27_33<=EXTERNAL)||LA27_33==FOR||LA27_33==FTCONTAINS||LA27_33==GE||(LA27_33>=GT && LA27_33<=IDIV)||LA27_33==IN||(LA27_33>=INSTANCE && LA27_33<=IS)||LA27_33==LE||(LA27_33>=LET && LA27_33<=LEVELS)||(LA27_33>=LT && LA27_33<=MOD)||LA27_33==NE||(LA27_33>=OR && LA27_33<=ORDER)||LA27_33==PARAGRAPHS||LA27_33==RETURN||LA27_33==SATISFIES||LA27_33==SCORE||LA27_33==SENTENCES||LA27_33==STABLE||(LA27_33>=TIMES && LA27_33<=TO)||LA27_33==UNION||LA27_33==WHERE||LA27_33==WITHOUT||LA27_33==WORDS||LA27_33==SEMICOLONSi||(LA27_33>=EQSi && LA27_33<=COMMASi)||LA27_33==ASSIGNSi||(LA27_33>=RPARSi && LA27_33<=RBRACSi)||(LA27_33>=MINUSSi && LA27_33<=NODEAFTERSi)||LA27_33==RBRACKSi) ) {s = 25;}

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
                        if ( (LA27_91==EOF||LA27_91==AND||LA27_91==ASCENDING||(LA27_91>=CASE && LA27_91<=CASTABLE)||LA27_91==COLLATION||LA27_91==DEFAULT||LA27_91==DESCENDING||LA27_91==DIV||LA27_91==ELSE||LA27_91==EMPTY||LA27_91==EQ||LA27_91==EXCEPT||LA27_91==FOR||LA27_91==FTCONTAINS||LA27_91==GE||(LA27_91>=GT && LA27_91<=IDIV)||(LA27_91>=INSTANCE && LA27_91<=IS)||LA27_91==LE||(LA27_91>=LET && LA27_91<=LEVELS)||(LA27_91>=LT && LA27_91<=MOD)||LA27_91==NE||(LA27_91>=OR && LA27_91<=ORDER)||LA27_91==PARAGRAPHS||LA27_91==RETURN||LA27_91==SATISFIES||LA27_91==SENTENCES||LA27_91==STABLE||(LA27_91>=TIMES && LA27_91<=TREAT)||LA27_91==UNION||LA27_91==WHERE||LA27_91==WITHOUT||LA27_91==WORDS||LA27_91==SEMICOLONSi||(LA27_91>=EQSi && LA27_91<=COMMASi)||LA27_91==COLONSi||LA27_91==RPARSi||LA27_91==RBRACSi||(LA27_91>=PIPESi && LA27_91<=NEQSi)||(LA27_91>=LTOREQSi && LA27_91<=NODEAFTERSi)||(LA27_91>=LBRACKSi && LA27_91<=RBRACKSi)) ) {s = 25;}

                        else if ( (LA27_91==DBLSLASHSi) ) {s = 196;}

                        else if ( (LA27_91==STARSi) ) {s = 197;}

                        else if ( (LA27_91==LTSi) ) {s = 166;}

                        else if ( ((LA27_91>=PLUSSi && LA27_91<=MINUSSi)) ) {s = 165;}

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

                        else if ( ((LA27_91>=ANCESTOR && LA27_91<=ANCESTOR_OR_SELF)||LA27_91==PARENT||(LA27_91>=PRECEDING && LA27_91<=PRECEDING_SIBLING)) && (synpred1())) {s = 186;}

                        else if ( (LA27_91==DOTDOTSi) && (synpred1())) {s = 187;}

                        else if ( (LA27_91==CHILD||(LA27_91>=DESCENDANT && LA27_91<=DESCENDANT_OR_SELF)||(LA27_91>=FOLLOWING && LA27_91<=FOLLOWING_SIBLING)||LA27_91==SELF) && (synpred1())) {s = 188;}

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

                        else if ( (LA27_99==EOF||LA27_99==AND||(LA27_99>=ASCENDING && LA27_99<=AT)||LA27_99==CASE||LA27_99==COLLATION||LA27_99==DEFAULT||LA27_99==DESCENDING||LA27_99==DIV||LA27_99==ELSE||LA27_99==EMPTY||LA27_99==EQ||(LA27_99>=EXCEPT && LA27_99<=EXTERNAL)||LA27_99==FOR||LA27_99==FTCONTAINS||LA27_99==GE||(LA27_99>=GT && LA27_99<=IDIV)||LA27_99==IN||(LA27_99>=INSTANCE && LA27_99<=IS)||LA27_99==LE||(LA27_99>=LET && LA27_99<=LEVELS)||(LA27_99>=LT && LA27_99<=MOD)||LA27_99==NE||(LA27_99>=OR && LA27_99<=ORDER)||LA27_99==PARAGRAPHS||LA27_99==RETURN||LA27_99==SATISFIES||LA27_99==SCORE||LA27_99==SENTENCES||LA27_99==STABLE||(LA27_99>=TIMES && LA27_99<=TO)||LA27_99==UNION||LA27_99==WHERE||LA27_99==WITHOUT||LA27_99==WORDS||LA27_99==SEMICOLONSi||(LA27_99>=EQSi && LA27_99<=COMMASi)||LA27_99==ASSIGNSi||(LA27_99>=RPARSi && LA27_99<=RBRACSi)||(LA27_99>=MINUSSi && LA27_99<=NODEAFTERSi)||LA27_99==RBRACKSi) ) {s = 25;}

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

                        else if ( (LA27_11==EOF||LA27_11==AND||(LA27_11>=ASCENDING && LA27_11<=AT)||LA27_11==CASE||LA27_11==COLLATION||LA27_11==DEFAULT||LA27_11==DESCENDING||LA27_11==DIV||LA27_11==ELSE||LA27_11==EMPTY||LA27_11==EQ||(LA27_11>=EXCEPT && LA27_11<=EXTERNAL)||LA27_11==FOR||LA27_11==FTCONTAINS||LA27_11==GE||(LA27_11>=GT && LA27_11<=IDIV)||LA27_11==IN||(LA27_11>=INSTANCE && LA27_11<=IS)||LA27_11==LE||(LA27_11>=LET && LA27_11<=LEVELS)||(LA27_11>=LT && LA27_11<=MOD)||LA27_11==NE||(LA27_11>=OR && LA27_11<=ORDER)||LA27_11==PARAGRAPHS||LA27_11==RETURN||LA27_11==SATISFIES||LA27_11==SCORE||LA27_11==SENTENCES||LA27_11==STABLE||(LA27_11>=TIMES && LA27_11<=TO)||LA27_11==UNION||LA27_11==WHERE||LA27_11==WITHOUT||LA27_11==WORDS||LA27_11==SEMICOLONSi||(LA27_11>=EQSi && LA27_11<=COMMASi)||LA27_11==ASSIGNSi||(LA27_11>=RPARSi && LA27_11<=RBRACSi)||(LA27_11>=MINUSSi && LA27_11<=NODEAFTERSi)||LA27_11==RBRACKSi) ) {s = 25;}

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
                        if ( (LA27_36==EOF||LA27_36==AND||(LA27_36>=ASCENDING && LA27_36<=AT)||LA27_36==CASE||LA27_36==COLLATION||LA27_36==DEFAULT||LA27_36==DESCENDING||LA27_36==DIV||LA27_36==ELSE||LA27_36==EMPTY||LA27_36==EQ||(LA27_36>=EXCEPT && LA27_36<=EXTERNAL)||LA27_36==FOR||LA27_36==FTCONTAINS||LA27_36==GE||(LA27_36>=GT && LA27_36<=IDIV)||LA27_36==IN||(LA27_36>=INSTANCE && LA27_36<=IS)||LA27_36==LE||(LA27_36>=LET && LA27_36<=LEVELS)||(LA27_36>=LT && LA27_36<=MOD)||LA27_36==NE||(LA27_36>=OR && LA27_36<=ORDER)||LA27_36==PARAGRAPHS||LA27_36==RETURN||LA27_36==SATISFIES||LA27_36==SCORE||LA27_36==SENTENCES||LA27_36==STABLE||(LA27_36>=TIMES && LA27_36<=TO)||LA27_36==UNION||LA27_36==WHERE||LA27_36==WITHOUT||LA27_36==WORDS||LA27_36==SEMICOLONSi||(LA27_36>=EQSi && LA27_36<=COMMASi)||LA27_36==ASSIGNSi||(LA27_36>=RPARSi && LA27_36<=RBRACSi)||(LA27_36>=MINUSSi && LA27_36<=NODEAFTERSi)||LA27_36==RBRACKSi) ) {s = 25;}

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
                        if ( ((LA27_47>=PLUSSi && LA27_47<=MINUSSi)) && (synpred1())) {s = 133;}

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

                        else if ( ((LA27_47>=ANCESTOR && LA27_47<=ANCESTOR_OR_SELF)||LA27_47==PARENT||(LA27_47>=PRECEDING && LA27_47<=PRECEDING_SIBLING)) && (synpred1())) {s = 154;}

                        else if ( (LA27_47==DOTDOTSi) && (synpred1())) {s = 155;}

                        else if ( (LA27_47==CHILD||(LA27_47>=DESCENDANT && LA27_47<=DESCENDANT_OR_SELF)||(LA27_47>=FOLLOWING && LA27_47<=FOLLOWING_SIBLING)||LA27_47==SELF) && (synpred1())) {s = 156;}

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

                        else if ( ((LA27_90>=PLUSSi && LA27_90<=MINUSSi)) && (synpred1())) {s = 133;}

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

                        else if ( ((LA27_90>=ANCESTOR && LA27_90<=ANCESTOR_OR_SELF)||LA27_90==PARENT||(LA27_90>=PRECEDING && LA27_90<=PRECEDING_SIBLING)) && (synpred1())) {s = 154;}

                        else if ( (LA27_90==DOTDOTSi) && (synpred1())) {s = 155;}

                        else if ( (LA27_90==CHILD||(LA27_90>=DESCENDANT && LA27_90<=DESCENDANT_OR_SELF)||(LA27_90>=FOLLOWING && LA27_90<=FOLLOWING_SIBLING)||LA27_90==SELF) && (synpred1())) {s = 156;}

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

                        else if ( ((LA27_167>=PLUSSi && LA27_167<=MINUSSi)) ) {s = 46;}

                        else if ( ((LA27_167>=ANCESTOR && LA27_167<=ANCESTOR_OR_SELF)||LA27_167==ATTRIBUTE||LA27_167==CHILD||LA27_167==COMMENT||(LA27_167>=DESCENDANT && LA27_167<=DESCENDANT_OR_SELF)||(LA27_167>=DOCUMENT && LA27_167<=ELEMENT)||(LA27_167>=FOLLOWING && LA27_167<=FOLLOWING_SIBLING)||LA27_167==NODE||LA27_167==ORDERED||LA27_167==PARENT||(LA27_167>=PRECEDING && LA27_167<=PRECEDING_SIBLING)||LA27_167==PROCESSING_INSTRUCTION||(LA27_167>=SCHEMAATTRIBUTE && LA27_167<=SCHEMAELEMENT)||LA27_167==SELF||LA27_167==TEXT||LA27_167==UNORDERED||LA27_167==VALIDATE||LA27_167==StringLiteral||LA27_167==NCName||LA27_167==DOLLARSi||LA27_167==LPARSi||(LA27_167>=IntegerLiteral && LA27_167<=LPRAGSi)||(LA27_167>=DOTDOTSi && LA27_167<=ATSi)||LA27_167==DOTSi||LA27_167==LCOMMENTSi||LA27_167==LPISi) ) {s = 25;}

                        else if ( (LA27_167==DBLSLASHSi) ) {s = 348;}

                        else if ( (LA27_167==SLASHSi) ) {s = 349;}

                        else if ( (LA27_167==LTSi) ) {s = 47;}

                        else if ( (LA27_167==STARSi) ) {s = 48;}

                        else if ( (LA27_167==LBRACKSi) && (synpred1())) {s = 350;}

                        else if ( (LA27_167==CAST) && (synpred1())) {s = 351;}

                        else if ( (LA27_167==CASTABLE) && (synpred1())) {s = 352;}

                        else if ( (LA27_167==TREAT) && (synpred1())) {s = 353;}

                        else if ( (LA27_167==INSTANCE) && (synpred1())) {s = 354;}

                        else if ( (LA27_167==EXCEPT||LA27_167==INTERSECT) && (synpred1())) {s = 355;}

                        else if ( (LA27_167==UNION||LA27_167==PIPESi) && (synpred1())) {s = 356;}

                        else if ( (LA27_167==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_167==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_167==EQ||LA27_167==GE||LA27_167==GT||LA27_167==LE||LA27_167==LT||LA27_167==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_167==EQSi||LA27_167==NEQSi||(LA27_167>=LTOREQSi && LA27_167<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_167==IS||(LA27_167>=NODEBEFORESi && LA27_167<=NODEAFTERSi)) && (synpred1())) {s = 65;}

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

                        else if ( (LA27_167==ASCENDING||LA27_167==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_167==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_167==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_167==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_167==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_167==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_167==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_167==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_167==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_167==PARAGRAPHS||LA27_167==SENTENCES||LA27_167==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_167==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_167==DIV||LA27_167==IDIV||LA27_167==MOD) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_167);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA27_197 = input.LA(1);

                         
                        int index27_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_197==COLONSi) && (synpred1())) {s = 347;}

                        else if ( ((LA27_197>=PLUSSi && LA27_197<=MINUSSi)) ) {s = 412;}

                        else if ( ((LA27_197>=ANCESTOR && LA27_197<=ANCESTOR_OR_SELF)||LA27_197==ATTRIBUTE||LA27_197==CHILD||LA27_197==COMMENT||(LA27_197>=DESCENDANT && LA27_197<=DESCENDANT_OR_SELF)||(LA27_197>=DOCUMENT && LA27_197<=ELEMENT)||(LA27_197>=FOLLOWING && LA27_197<=FOLLOWING_SIBLING)||LA27_197==NODE||LA27_197==ORDERED||LA27_197==PARENT||(LA27_197>=PRECEDING && LA27_197<=PRECEDING_SIBLING)||LA27_197==PROCESSING_INSTRUCTION||(LA27_197>=SCHEMAATTRIBUTE && LA27_197<=SCHEMAELEMENT)||LA27_197==SELF||LA27_197==TEXT||LA27_197==UNORDERED||LA27_197==VALIDATE||LA27_197==StringLiteral||LA27_197==NCName||LA27_197==DOLLARSi||LA27_197==LPARSi||(LA27_197>=IntegerLiteral && LA27_197<=LPRAGSi)||(LA27_197>=DOTDOTSi && LA27_197<=ATSi)||LA27_197==DOTSi||LA27_197==LCOMMENTSi||LA27_197==LPISi) ) {s = 25;}

                        else if ( (LA27_197==DBLSLASHSi) ) {s = 413;}

                        else if ( (LA27_197==SLASHSi) ) {s = 414;}

                        else if ( (LA27_197==LTSi) ) {s = 415;}

                        else if ( (LA27_197==STARSi) ) {s = 416;}

                        else if ( (LA27_197==LBRACKSi) && (synpred1())) {s = 350;}

                        else if ( (LA27_197==CAST) && (synpred1())) {s = 351;}

                        else if ( (LA27_197==CASTABLE) && (synpred1())) {s = 352;}

                        else if ( (LA27_197==TREAT) && (synpred1())) {s = 353;}

                        else if ( (LA27_197==INSTANCE) && (synpred1())) {s = 354;}

                        else if ( (LA27_197==EXCEPT||LA27_197==INTERSECT) && (synpred1())) {s = 355;}

                        else if ( (LA27_197==UNION||LA27_197==PIPESi) && (synpred1())) {s = 356;}

                        else if ( (LA27_197==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_197==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_197==EQ||LA27_197==GE||LA27_197==GT||LA27_197==LE||LA27_197==LT||LA27_197==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_197==EQSi||LA27_197==NEQSi||(LA27_197>=LTOREQSi && LA27_197<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_197==IS||(LA27_197>=NODEBEFORESi && LA27_197<=NODEAFTERSi)) && (synpred1())) {s = 65;}

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

                        else if ( (LA27_197==ASCENDING||LA27_197==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_197==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_197==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_197==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_197==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_197==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_197==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_197==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_197==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_197==PARAGRAPHS||LA27_197==SENTENCES||LA27_197==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_197==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_197==DIV||LA27_197==IDIV||LA27_197==MOD) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_197);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA27_40 = input.LA(1);

                         
                        int index27_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_40==EOF||LA27_40==AND||(LA27_40>=ASCENDING && LA27_40<=AT)||LA27_40==CASE||LA27_40==COLLATION||LA27_40==DEFAULT||LA27_40==DESCENDING||LA27_40==DIV||LA27_40==ELSE||LA27_40==EMPTY||LA27_40==EQ||(LA27_40>=EXCEPT && LA27_40<=EXTERNAL)||LA27_40==FOR||LA27_40==FTCONTAINS||LA27_40==GE||(LA27_40>=GT && LA27_40<=IDIV)||LA27_40==IN||(LA27_40>=INSTANCE && LA27_40<=IS)||LA27_40==LE||(LA27_40>=LET && LA27_40<=LEVELS)||(LA27_40>=LT && LA27_40<=MOD)||LA27_40==NE||(LA27_40>=OR && LA27_40<=ORDER)||LA27_40==PARAGRAPHS||LA27_40==RETURN||LA27_40==SATISFIES||LA27_40==SCORE||LA27_40==SENTENCES||LA27_40==STABLE||(LA27_40>=TIMES && LA27_40<=TO)||LA27_40==UNION||LA27_40==WHERE||LA27_40==WITHOUT||LA27_40==WORDS||LA27_40==SEMICOLONSi||(LA27_40>=EQSi && LA27_40<=COMMASi)||LA27_40==ASSIGNSi||(LA27_40>=RPARSi && LA27_40<=RBRACSi)||(LA27_40>=MINUSSi && LA27_40<=NODEAFTERSi)||LA27_40==RBRACKSi) ) {s = 25;}

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

                        else if ( (LA27_44==EOF||LA27_44==AND||(LA27_44>=ASCENDING && LA27_44<=AT)||LA27_44==CASE||LA27_44==COLLATION||LA27_44==DEFAULT||LA27_44==DESCENDING||LA27_44==DIV||LA27_44==ELSE||LA27_44==EMPTY||LA27_44==EQ||(LA27_44>=EXCEPT && LA27_44<=EXTERNAL)||LA27_44==FOR||LA27_44==FTCONTAINS||LA27_44==GE||(LA27_44>=GT && LA27_44<=IDIV)||LA27_44==IN||(LA27_44>=INSTANCE && LA27_44<=IS)||LA27_44==LE||(LA27_44>=LET && LA27_44<=LEVELS)||(LA27_44>=LT && LA27_44<=MOD)||LA27_44==NE||(LA27_44>=OR && LA27_44<=ORDER)||LA27_44==PARAGRAPHS||LA27_44==RETURN||LA27_44==SATISFIES||LA27_44==SCORE||LA27_44==SENTENCES||LA27_44==STABLE||(LA27_44>=TIMES && LA27_44<=TO)||LA27_44==UNION||LA27_44==WHERE||LA27_44==WITHOUT||LA27_44==WORDS||LA27_44==SEMICOLONSi||(LA27_44>=EQSi && LA27_44<=COMMASi)||LA27_44==ASSIGNSi||(LA27_44>=RPARSi && LA27_44<=RBRACSi)||(LA27_44>=MINUSSi && LA27_44<=NODEAFTERSi)||LA27_44==RBRACKSi) ) {s = 25;}

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

                        else if ( (LA27_101==EOF||LA27_101==AND||(LA27_101>=ASCENDING && LA27_101<=AT)||LA27_101==CASE||LA27_101==COLLATION||LA27_101==DEFAULT||LA27_101==DESCENDING||LA27_101==DIV||LA27_101==ELSE||LA27_101==EMPTY||LA27_101==EQ||(LA27_101>=EXCEPT && LA27_101<=EXTERNAL)||LA27_101==FOR||LA27_101==FTCONTAINS||LA27_101==GE||(LA27_101>=GT && LA27_101<=IDIV)||LA27_101==IN||(LA27_101>=INSTANCE && LA27_101<=IS)||LA27_101==LE||(LA27_101>=LET && LA27_101<=LEVELS)||(LA27_101>=LT && LA27_101<=MOD)||LA27_101==NE||(LA27_101>=OR && LA27_101<=ORDER)||LA27_101==PARAGRAPHS||LA27_101==RETURN||LA27_101==SATISFIES||LA27_101==SCORE||LA27_101==SENTENCES||LA27_101==STABLE||(LA27_101>=TIMES && LA27_101<=TO)||LA27_101==UNION||LA27_101==WHERE||LA27_101==WITHOUT||LA27_101==WORDS||LA27_101==SEMICOLONSi||(LA27_101>=EQSi && LA27_101<=COMMASi)||LA27_101==ASSIGNSi||(LA27_101>=RPARSi && LA27_101<=RBRACSi)||(LA27_101>=MINUSSi && LA27_101<=NODEAFTERSi)||LA27_101==RBRACKSi) ) {s = 25;}

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
                        if ( ((LA27_26>=PLUSSi && LA27_26<=MINUSSi)) ) {s = 89;}

                        else if ( ((LA27_26>=ANCESTOR && LA27_26<=ANCESTOR_OR_SELF)||LA27_26==ATTRIBUTE||LA27_26==CHILD||LA27_26==COMMENT||(LA27_26>=DESCENDANT && LA27_26<=DESCENDANT_OR_SELF)||(LA27_26>=DOCUMENT && LA27_26<=ELEMENT)||(LA27_26>=FOLLOWING && LA27_26<=FOLLOWING_SIBLING)||LA27_26==NODE||LA27_26==ORDERED||LA27_26==PARENT||(LA27_26>=PRECEDING && LA27_26<=PRECEDING_SIBLING)||LA27_26==PROCESSING_INSTRUCTION||(LA27_26>=SCHEMAATTRIBUTE && LA27_26<=SCHEMAELEMENT)||LA27_26==SELF||LA27_26==TEXT||LA27_26==UNORDERED||LA27_26==VALIDATE||LA27_26==StringLiteral||LA27_26==NCName||LA27_26==DOLLARSi||LA27_26==LPARSi||(LA27_26>=IntegerLiteral && LA27_26<=LPRAGSi)||(LA27_26>=DBLSLASHSi && LA27_26<=SLASHSi)||(LA27_26>=DOTDOTSi && LA27_26<=ATSi)||LA27_26==DOTSi||LA27_26==LCOMMENTSi||LA27_26==LPISi) ) {s = 25;}

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

                        else if ( (LA27_26==EXCEPT||LA27_26==INTERSECT) && (synpred1())) {s = 58;}

                        else if ( (LA27_26==UNION||LA27_26==PIPESi) && (synpred1())) {s = 59;}

                        else if ( (LA27_26==DIV||LA27_26==IDIV||LA27_26==MOD) && (synpred1())) {s = 60;}

                        else if ( (LA27_26==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_26==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_26==EQ||LA27_26==GE||LA27_26==GT||LA27_26==LE||LA27_26==LT||LA27_26==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_26==EQSi||LA27_26==NEQSi||(LA27_26>=LTOREQSi && LA27_26<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_26==IS||(LA27_26>=NODEBEFORESi && LA27_26<=NODEAFTERSi)) && (synpred1())) {s = 65;}

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

                        else if ( (LA27_26==ASCENDING||LA27_26==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_26==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_26==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_26==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_26==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_26==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_26==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_26==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_26==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_26==PARAGRAPHS||LA27_26==SENTENCES||LA27_26==WORDS) && (synpred1())) {s = 86;}

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

                        else if ( (LA27_142==EXCEPT||LA27_142==INTERSECT) && (synpred1())) {s = 279;}

                        else if ( (LA27_142==UNION||LA27_142==PIPESi) && (synpred1())) {s = 280;}

                        else if ( (LA27_142==DIV||LA27_142==IDIV||LA27_142==MOD||LA27_142==STARSi) && (synpred1())) {s = 281;}

                        else if ( ((LA27_142>=PLUSSi && LA27_142<=MINUSSi)) && (synpred1())) {s = 282;}

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

                        else if ( (LA27_142==ASCENDING||LA27_142==DESCENDING) && (synpred1())) {s = 77;}

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

                        else if ( (LA27_195==EXCEPT||LA27_195==INTERSECT) && (synpred1())) {s = 279;}

                        else if ( (LA27_195==UNION||LA27_195==PIPESi) && (synpred1())) {s = 280;}

                        else if ( (LA27_195==DIV||LA27_195==IDIV||LA27_195==MOD||LA27_195==STARSi) && (synpred1())) {s = 281;}

                        else if ( ((LA27_195>=PLUSSi && LA27_195<=MINUSSi)) && (synpred1())) {s = 282;}

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

                        else if ( (LA27_195==ASCENDING||LA27_195==DESCENDING) && (synpred1())) {s = 77;}

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

                        else if ( (LA27_169==EXCEPT||LA27_169==INTERSECT) && (synpred1())) {s = 355;}

                        else if ( (LA27_169==UNION||LA27_169==PIPESi) && (synpred1())) {s = 356;}

                        else if ( ((LA27_169>=PLUSSi && LA27_169<=MINUSSi)) && (synpred1())) {s = 358;}

                        else if ( (LA27_169==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_169==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_169==EQ||LA27_169==GE||LA27_169==GT||LA27_169==LE||LA27_169==LT||LA27_169==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_169==LTSi) ) {s = 359;}

                        else if ( (LA27_169==IS||(LA27_169>=NODEBEFORESi && LA27_169<=NODEAFTERSi)) && (synpred1())) {s = 65;}

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

                        else if ( (LA27_169==ASCENDING||LA27_169==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_169==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_169==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_169==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_169==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_169==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_169==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_169==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_169==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_169==PARAGRAPHS||LA27_169==SENTENCES||LA27_169==WORDS) && (synpred1())) {s = 86;}

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

                        else if ( ((LA27_169>=ANCESTOR && LA27_169<=ANCESTOR_OR_SELF)||LA27_169==PARENT||(LA27_169>=PRECEDING && LA27_169<=PRECEDING_SIBLING)) ) {s = 377;}

                        else if ( (LA27_169==DOTDOTSi) ) {s = 378;}

                        else if ( (LA27_169==CHILD||(LA27_169>=DESCENDANT && LA27_169<=DESCENDANT_OR_SELF)||(LA27_169>=FOLLOWING && LA27_169<=FOLLOWING_SIBLING)||LA27_169==SELF) ) {s = 379;}

                        else if ( (LA27_169==ATSi) ) {s = 380;}

                        else if ( (LA27_169==DOCUMENT_NODE) ) {s = 381;}

                        else if ( (LA27_169==SCHEMAELEMENT) ) {s = 382;}

                        else if ( (LA27_169==SCHEMAATTRIBUTE) ) {s = 383;}

                        else if ( (LA27_169==NODE) ) {s = 384;}

                        else if ( (LA27_169==DIV||LA27_169==IDIV||LA27_169==MOD) && (synpred1())) {s = 60;}

                         
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

                        else if ( (LA27_198==EXCEPT||LA27_198==INTERSECT) && (synpred1())) {s = 355;}

                        else if ( (LA27_198==UNION||LA27_198==PIPESi) && (synpred1())) {s = 356;}

                        else if ( ((LA27_198>=PLUSSi && LA27_198<=MINUSSi)) && (synpred1())) {s = 358;}

                        else if ( (LA27_198==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_198==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_198==EQ||LA27_198==GE||LA27_198==GT||LA27_198==LE||LA27_198==LT||LA27_198==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_198==LTSi) ) {s = 417;}

                        else if ( (LA27_198==IS||(LA27_198>=NODEBEFORESi && LA27_198<=NODEAFTERSi)) && (synpred1())) {s = 65;}

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

                        else if ( (LA27_198==ASCENDING||LA27_198==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_198==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_198==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_198==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_198==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_198==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_198==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_198==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_198==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_198==PARAGRAPHS||LA27_198==SENTENCES||LA27_198==WORDS) && (synpred1())) {s = 86;}

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

                        else if ( ((LA27_198>=ANCESTOR && LA27_198<=ANCESTOR_OR_SELF)||LA27_198==PARENT||(LA27_198>=PRECEDING && LA27_198<=PRECEDING_SIBLING)) ) {s = 435;}

                        else if ( (LA27_198==DOTDOTSi) ) {s = 436;}

                        else if ( (LA27_198==CHILD||(LA27_198>=DESCENDANT && LA27_198<=DESCENDANT_OR_SELF)||(LA27_198>=FOLLOWING && LA27_198<=FOLLOWING_SIBLING)||LA27_198==SELF) ) {s = 437;}

                        else if ( (LA27_198==ATSi) ) {s = 438;}

                        else if ( (LA27_198==DOCUMENT_NODE) ) {s = 439;}

                        else if ( (LA27_198==SCHEMAELEMENT) ) {s = 440;}

                        else if ( (LA27_198==SCHEMAATTRIBUTE) ) {s = 441;}

                        else if ( (LA27_198==NODE) ) {s = 442;}

                        else if ( (LA27_198==DIV||LA27_198==IDIV||LA27_198==MOD) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_198);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA27_45 = input.LA(1);

                         
                        int index27_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_45==EOF||LA27_45==AND||(LA27_45>=ASCENDING && LA27_45<=AT)||LA27_45==CASE||LA27_45==COLLATION||LA27_45==DEFAULT||LA27_45==DESCENDING||LA27_45==DIV||LA27_45==ELSE||LA27_45==EMPTY||LA27_45==EQ||(LA27_45>=EXCEPT && LA27_45<=EXTERNAL)||LA27_45==FOR||LA27_45==FTCONTAINS||LA27_45==GE||(LA27_45>=GT && LA27_45<=IDIV)||LA27_45==IN||(LA27_45>=INSTANCE && LA27_45<=IS)||LA27_45==LE||(LA27_45>=LET && LA27_45<=LEVELS)||(LA27_45>=LT && LA27_45<=MOD)||LA27_45==NE||(LA27_45>=OR && LA27_45<=ORDER)||LA27_45==PARAGRAPHS||LA27_45==RETURN||LA27_45==SATISFIES||LA27_45==SCORE||LA27_45==SENTENCES||LA27_45==STABLE||(LA27_45>=TIMES && LA27_45<=TO)||LA27_45==UNION||LA27_45==WHERE||LA27_45==WITHOUT||LA27_45==WORDS||LA27_45==SEMICOLONSi||(LA27_45>=EQSi && LA27_45<=COMMASi)||LA27_45==ASSIGNSi||(LA27_45>=RPARSi && LA27_45<=RBRACSi)||(LA27_45>=MINUSSi && LA27_45<=NODEAFTERSi)||LA27_45==RBRACKSi) ) {s = 25;}

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
                        if ( (LA27_30==EOF||LA27_30==AND||(LA27_30>=ASCENDING && LA27_30<=AT)||LA27_30==CASE||LA27_30==COLLATION||LA27_30==DEFAULT||LA27_30==DESCENDING||LA27_30==DIV||LA27_30==ELSE||LA27_30==EMPTY||LA27_30==EQ||(LA27_30>=EXCEPT && LA27_30<=EXTERNAL)||LA27_30==FOR||LA27_30==FTCONTAINS||LA27_30==GE||(LA27_30>=GT && LA27_30<=IDIV)||LA27_30==IN||(LA27_30>=INSTANCE && LA27_30<=IS)||LA27_30==LE||(LA27_30>=LET && LA27_30<=LEVELS)||(LA27_30>=LT && LA27_30<=MOD)||LA27_30==NE||(LA27_30>=OR && LA27_30<=ORDER)||LA27_30==PARAGRAPHS||LA27_30==RETURN||LA27_30==SATISFIES||LA27_30==SCORE||LA27_30==SENTENCES||LA27_30==STABLE||(LA27_30>=TIMES && LA27_30<=TO)||LA27_30==UNION||LA27_30==WHERE||LA27_30==WITHOUT||LA27_30==WORDS||LA27_30==SEMICOLONSi||(LA27_30>=EQSi && LA27_30<=COMMASi)||LA27_30==ASSIGNSi||(LA27_30>=RPARSi && LA27_30<=RBRACSi)||(LA27_30>=MINUSSi && LA27_30<=NODEAFTERSi)||LA27_30==RBRACKSi) ) {s = 25;}

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
                        if ( ((LA27_24>=PLUSSi && LA27_24<=MINUSSi)) ) {s = 46;}

                        else if ( ((LA27_24>=ANCESTOR && LA27_24<=ANCESTOR_OR_SELF)||LA27_24==ATTRIBUTE||LA27_24==CHILD||LA27_24==COMMENT||(LA27_24>=DESCENDANT && LA27_24<=DESCENDANT_OR_SELF)||(LA27_24>=DOCUMENT && LA27_24<=ELEMENT)||(LA27_24>=FOLLOWING && LA27_24<=FOLLOWING_SIBLING)||LA27_24==NODE||LA27_24==ORDERED||LA27_24==PARENT||(LA27_24>=PRECEDING && LA27_24<=PRECEDING_SIBLING)||LA27_24==PROCESSING_INSTRUCTION||(LA27_24>=SCHEMAATTRIBUTE && LA27_24<=SCHEMAELEMENT)||LA27_24==SELF||LA27_24==TEXT||LA27_24==UNORDERED||LA27_24==VALIDATE||LA27_24==StringLiteral||LA27_24==NCName||LA27_24==DOLLARSi||LA27_24==LPARSi||(LA27_24>=IntegerLiteral && LA27_24<=LPRAGSi)||(LA27_24>=DBLSLASHSi && LA27_24<=SLASHSi)||(LA27_24>=DOTDOTSi && LA27_24<=ATSi)||LA27_24==DOTSi||LA27_24==LCOMMENTSi||LA27_24==LPISi) ) {s = 25;}

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

                        else if ( (LA27_24==EXCEPT||LA27_24==INTERSECT) && (synpred1())) {s = 58;}

                        else if ( (LA27_24==UNION||LA27_24==PIPESi) && (synpred1())) {s = 59;}

                        else if ( (LA27_24==DIV||LA27_24==IDIV||LA27_24==MOD) && (synpred1())) {s = 60;}

                        else if ( (LA27_24==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_24==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_24==EQ||LA27_24==GE||LA27_24==GT||LA27_24==LE||LA27_24==LT||LA27_24==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_24==EQSi||LA27_24==NEQSi||(LA27_24>=LTOREQSi && LA27_24<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_24==IS||(LA27_24>=NODEBEFORESi && LA27_24<=NODEAFTERSi)) && (synpred1())) {s = 65;}

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

                        else if ( (LA27_24==ASCENDING||LA27_24==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_24==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_24==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_24==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_24==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_24==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_24==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_24==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_24==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_24==PARAGRAPHS||LA27_24==SENTENCES||LA27_24==WORDS) && (synpred1())) {s = 86;}

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
        "\5\6\46\uffff\1\u0092\3\uffff\1\6\1\110\1\6\3\0\1\u0092\3\0\2\u009a"+
        "\1\u0092\1\u00c1\1\u00c4\1\u009a\2\u0092\2\u0098\1\u0092\1\u00b0"+
        "\1\0\1\u00b0\1\14\4\u0098\1\0\1\u0092\2\0\1\u0092\3\0\2\u009a\1"+
        "\u0092\1\u00c1\1\u00c4\1\u009a\2\u0092\2\u0098\1\u0092\1\u00b0\1"+
        "\0\1\u00b0\1\14\4\u0098\1\0\1\6\3\0\1\u0092\3\0\2\u009a\1\u00c1"+
        "\1\u00c4\1\u009a\2\u0092\2\u0098\1\u0092\1\u00b0\1\0\1\u00b0\1\14"+
        "\4\u0098\11\uffff\1\10\25\uffff\1\6\1\uffff\2\6\10\uffff\1\6\20"+
        "\uffff\1\6\1\uffff\1\10\1\0\1\u009a\176\0\17\uffff\71\0\7\uffff"+
        "\33\0\1\uffff\2\0\1\uffff";
    static final String DFA120_maxS =
        "\1\u00c3\1\uffff\1\u00c3\11\uffff\1\u00c3\20\uffff\1\u00c3\1\uffff"+
        "\1\u00b6\1\uffff\5\u00c3\46\uffff\1\u009d\3\uffff\1\u00c3\1\u009a"+
        "\1\u00c3\3\0\1\u0092\3\0\2\u009a\1\u0092\1\u00c1\1\u00c4\2\u009a"+
        "\1\u00b0\3\u009a\1\u00b0\1\0\1\u00b0\1\u009d\4\u0098\1\0\1\u0092"+
        "\2\0\1\u0092\3\0\2\u009a\1\u0092\1\u00c1\1\u00c4\2\u009a\1\u00b0"+
        "\3\u009a\1\u00b0\1\0\1\u00b0\1\u009d\4\u0098\1\0\1\u00c3\3\0\1\u0092"+
        "\3\0\2\u009a\1\u00c1\1\u00c4\2\u009a\1\u00b0\3\u009a\1\u00b0\1\0"+
        "\1\u00b0\1\u009d\4\u0098\11\uffff\1\u00b6\25\uffff\1\u00c3\1\uffff"+
        "\2\u00c3\10\uffff\1\u00c3\20\uffff\1\u00c3\1\uffff\1\u00b6\1\0\1"+
        "\u009a\176\0\17\uffff\71\0\7\uffff\33\0\1\uffff\2\0\1\uffff";
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
            "\2\3\4\uffff\1\3\6\uffff\1\3\1\uffff\1\3\5\uffff\2\3\5\uffff"+
            "\3\3\13\uffff\2\3\42\uffff\1\3\10\uffff\1\3\3\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\1\3\5\uffff\2\3\1\uffff\1\3\12\uffff\1\3\7\uffff"+
            "\1\3\15\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\1\3\4\uffff"+
            "\1\3\4\uffff\1\3\5\uffff\3\3\3\uffff\1\1\1\2\1\uffff\2\3\2\uffff"+
            "\1\3\12\uffff\1\3\2\uffff\1\3",
            "",
            "\2\25\1\36\1\uffff\1\36\1\uffff\1\21\3\uffff\3\36\1\27\1\36"+
            "\1\23\4\uffff\1\36\2\27\1\36\3\uffff\1\36\1\17\1\31\1\20\1\36"+
            "\3\uffff\1\36\1\uffff\1\36\2\uffff\1\36\1\uffff\2\27\1\36\2"+
            "\uffff\1\36\4\uffff\1\36\1\uffff\2\36\5\uffff\3\36\3\uffff\1"+
            "\36\1\uffff\2\36\1\uffff\2\36\3\uffff\1\36\1\34\6\uffff\2\36"+
            "\1\12\2\uffff\1\36\1\25\1\uffff\2\25\1\uffff\1\24\1\uffff\1"+
            "\36\1\uffff\1\36\1\uffff\1\33\1\32\1\uffff\1\27\1\uffff\1\36"+
            "\2\uffff\1\36\5\uffff\1\22\2\uffff\3\36\1\uffff\1\36\1\13\5"+
            "\uffff\1\36\3\uffff\1\36\1\uffff\1\36\1\uffff\1\5\1\36\1\11"+
            "\2\36\1\6\2\uffff\1\7\1\36\1\uffff\1\36\1\uffff\1\35\4\36\1"+
            "\14\5\36\3\4\6\uffff\1\26\1\30\1\uffff\1\36\1\10\12\uffff\1"+
            "\15\2\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\4\uffff\1\36\6\uffff\1\36\1\uffff\1\36\5\uffff\2\36\5"+
            "\uffff\3\36\13\uffff\2\36\42\uffff\1\36\10\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\2\36\1\uffff\1\36\5\uffff\2\36\1\uffff\1\36\12"+
            "\uffff\1\36\7\uffff\1\36\1\uffff\1\36\13\uffff\1\36\1\uffff"+
            "\1\37\2\uffff\1\36\2\uffff\1\36\4\uffff\3\36\2\uffff\1\36\5"+
            "\uffff\4\36\2\uffff\2\36\1\uffff\2\36\2\uffff\1\36\12\uffff"+
            "\1\36\2\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\1\63\1\uffff\1\101\1\uffff\1\36\3\uffff\1\106\1\47\1\50"+
            "\1\36\1\103\1\36\4\uffff\1\105\2\36\1\101\3\uffff\1\55\3\36"+
            "\1\107\3\uffff\1\102\1\uffff\1\60\2\uffff\1\53\1\uffff\2\36"+
            "\1\77\2\uffff\1\57\4\uffff\1\60\1\uffff\1\60\1\55\5\uffff\1"+
            "\52\1\53\1\62\3\uffff\1\60\1\uffff\1\100\1\113\1\uffff\1\60"+
            "\1\55\3\uffff\1\60\1\36\6\uffff\1\64\1\74\1\36\2\uffff\1\112"+
            "\1\36\1\uffff\2\36\1\uffff\1\36\1\uffff\1\76\1\uffff\1\104\1"+
            "\uffff\2\36\1\uffff\1\36\1\uffff\1\112\2\uffff\1\75\5\uffff"+
            "\1\36\2\uffff\1\111\1\56\1\51\1\uffff\1\54\1\36\1\uffff\1\36"+
            "\3\uffff\1\73\3\uffff\1\110\1\uffff\1\112\1\uffff\1\36\1\72"+
            "\1\36\1\61\1\65\1\36\1\uffff\1\40\1\36\1\70\1\uffff\1\67\1\uffff"+
            "\1\45\2\41\1\54\1\61\1\44\3\61\2\62\4\36\2\uffff\1\42\1\43\1"+
            "\uffff\2\36\1\46\1\71\1\36\12\uffff\1\36\2\uffff\1\36",
            "",
            "\1\36\1\uffff\1\36\5\uffff\3\36\1\uffff\1\36\5\uffff\1\36\2"+
            "\uffff\1\36\3\uffff\1\36\3\uffff\1\36\3\uffff\1\36\4\uffff\1"+
            "\36\3\uffff\1\36\2\uffff\1\36\7\uffff\1\36\5\uffff\2\36\6\uffff"+
            "\1\36\3\uffff\1\36\13\uffff\2\36\13\uffff\1\36\1\uffff\1\36"+
            "\11\uffff\1\36\11\uffff\2\36\1\uffff\1\36\6\uffff\1\36\10\uffff"+
            "\1\36\1\115\1\uffff\1\36\2\uffff\1\114\2\36\1\uffff\1\36\1\uffff"+
            "\4\36\3\uffff\1\117\11\uffff\2\36\3\uffff\2\36\1\uffff\1\116",
            "",
            "\2\145\4\uffff\1\141\6\uffff\1\147\1\uffff\1\143\5\uffff\2\147"+
            "\5\uffff\1\137\1\151\1\140\13\uffff\2\147\42\uffff\1\154\10"+
            "\uffff\1\132\3\uffff\1\145\1\uffff\2\145\1\uffff\1\144\5\uffff"+
            "\1\153\1\152\1\uffff\1\147\12\uffff\1\142\7\uffff\1\133\1\uffff"+
            "\1\121\13\uffff\1\125\1\uffff\1\131\2\uffff\1\126\2\uffff\1"+
            "\127\4\uffff\1\155\2\120\2\uffff\1\134\5\uffff\3\124\1\156\2"+
            "\uffff\1\122\1\123\1\uffff\1\146\1\150\2\uffff\1\130\12\uffff"+
            "\1\135\2\uffff\1\136",
            "\2\u0080\4\uffff\1\174\6\uffff\1\u0082\1\uffff\1\176\5\uffff"+
            "\2\u0082\5\uffff\1\172\1\u0084\1\173\13\uffff\2\u0082\42\uffff"+
            "\1\u0087\10\uffff\1\165\3\uffff\1\u0080\1\uffff\2\u0080\1\uffff"+
            "\1\177\5\uffff\1\u0086\1\u0085\1\uffff\1\u0082\12\uffff\1\175"+
            "\7\uffff\1\166\15\uffff\1\160\1\uffff\1\164\2\uffff\1\161\2"+
            "\uffff\1\162\4\uffff\1\u0088\4\uffff\1\167\5\uffff\3\157\6\uffff"+
            "\1\u0081\1\u0083\2\uffff\1\163\12\uffff\1\170\2\uffff\1\171",
            "\2\u009b\1\36\1\uffff\1\36\1\uffff\1\u0097\3\uffff\3\36\1\u009d"+
            "\1\36\1\u0099\4\uffff\1\36\2\u009d\1\36\3\uffff\1\36\1\u0095"+
            "\1\u009f\1\u0096\1\36\3\uffff\1\36\1\uffff\1\36\2\uffff\1\36"+
            "\1\uffff\2\u009d\1\36\2\uffff\1\36\4\uffff\1\36\1\uffff\2\36"+
            "\5\uffff\3\36\3\uffff\1\36\1\uffff\2\36\1\uffff\2\36\3\uffff"+
            "\1\36\1\u00a2\6\uffff\2\36\1\u0091\2\uffff\1\36\1\u009b\1\uffff"+
            "\2\u009b\1\uffff\1\u009a\1\uffff\1\36\1\uffff\1\36\1\uffff\1"+
            "\u00a1\1\u00a0\1\uffff\1\u009d\1\uffff\1\36\2\uffff\1\36\5\uffff"+
            "\1\u0098\2\uffff\3\36\1\uffff\1\36\1\u0092\5\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\1\36\1\uffff\1\u008c\1\36\1\u0090\2\36\1\u008d"+
            "\2\uffff\1\u008e\1\36\1\uffff\1\36\1\uffff\1\u008a\4\36\1\u0089"+
            "\5\36\3\u008b\6\uffff\1\u009c\1\u009e\1\uffff\1\36\1\u008f\12"+
            "\uffff\1\u0093\2\uffff\1\u0094",
            "\2\u00b8\4\uffff\1\u00b4\6\uffff\1\u00ba\1\uffff\1\u00b6\5\uffff"+
            "\2\u00ba\5\uffff\1\u00b2\1\u00bc\1\u00b3\13\uffff\2\u00ba\42"+
            "\uffff\1\u00bf\10\uffff\1\u00ad\3\uffff\1\u00b8\1\uffff\2\u00b8"+
            "\1\uffff\1\u00b7\5\uffff\1\u00be\1\u00bd\1\uffff\1\u00ba\12"+
            "\uffff\1\u00b5\7\uffff\1\u00ae\1\uffff\1\u00a4\13\uffff\1\u00a8"+
            "\1\uffff\1\u00ac\2\uffff\1\u00a9\2\uffff\1\u00aa\4\uffff\1\u00c0"+
            "\2\u00a3\2\uffff\1\u00af\5\uffff\3\u00a7\1\u00c1\2\uffff\1\u00a5"+
            "\1\u00a6\1\uffff\1\u00b9\1\u00bb\2\uffff\1\u00ab\12\uffff\1"+
            "\u00b0\2\uffff\1\u00b1",
            "\2\u00d7\1\36\1\uffff\1\36\1\uffff\1\u00d3\3\uffff\3\36\1\u00d9"+
            "\1\36\1\u00d5\4\uffff\1\36\2\u00d9\1\36\3\uffff\1\36\1\u00d1"+
            "\1\u00db\1\u00d2\1\36\3\uffff\1\36\1\uffff\1\36\2\uffff\1\36"+
            "\1\uffff\2\u00d9\1\36\2\uffff\1\36\4\uffff\1\36\1\uffff\2\36"+
            "\5\uffff\3\36\3\uffff\1\36\1\uffff\2\36\1\uffff\2\36\3\uffff"+
            "\1\36\1\u00de\6\uffff\2\36\1\u00cc\2\uffff\1\36\1\u00d7\1\uffff"+
            "\2\u00d7\1\uffff\1\u00d6\1\uffff\1\36\1\uffff\1\36\1\uffff\1"+
            "\u00dd\1\u00dc\1\uffff\1\u00d9\1\uffff\1\36\2\uffff\1\36\5\uffff"+
            "\1\u00d4\2\uffff\3\36\1\uffff\1\36\1\u00cd\1\uffff\1\u00c3\3"+
            "\uffff\1\36\3\uffff\1\36\1\uffff\1\36\1\uffff\1\u00c7\1\36\1"+
            "\u00cb\2\36\1\u00c8\1\uffff\1\36\1\u00c9\1\36\1\uffff\1\36\1"+
            "\uffff\1\u00df\2\u00c2\2\36\1\u00ce\5\36\3\u00c6\1\u00e0\2\uffff"+
            "\1\u00c4\1\u00c5\1\uffff\1\u00d8\1\u00da\2\36\1\u00ca\12\uffff"+
            "\1\u00cf\2\uffff\1\u00d0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e1\12\uffff\1\36",
            "",
            "",
            "",
            "\2\145\4\uffff\1\141\6\uffff\1\147\1\uffff\1\143\5\uffff\2\147"+
            "\5\uffff\1\137\1\151\1\140\13\uffff\2\147\42\uffff\1\154\10"+
            "\uffff\1\132\3\uffff\1\145\1\uffff\2\145\1\uffff\1\144\5\uffff"+
            "\1\153\1\152\1\uffff\1\147\12\uffff\1\142\7\uffff\1\133\1\uffff"+
            "\1\121\13\uffff\1\125\1\uffff\1\131\2\uffff\1\126\2\uffff\1"+
            "\u00e2\4\uffff\1\155\2\120\2\uffff\1\134\5\uffff\3\124\1\156"+
            "\2\uffff\1\122\1\123\1\uffff\1\146\1\150\2\uffff\1\130\12\uffff"+
            "\1\135\2\uffff\1\136",
            "\1\u00e3\57\uffff\1\u00e3\41\uffff\1\u00e4",
            "\2\u00f6\4\uffff\1\u00f2\6\uffff\1\u00f8\1\uffff\1\u00f4\5\uffff"+
            "\2\u00f8\5\uffff\1\u00f0\1\u00fa\1\u00f1\13\uffff\2\u00f8\42"+
            "\uffff\1\u00fd\10\uffff\1\u00eb\3\uffff\1\u00f6\1\uffff\2\u00f6"+
            "\1\uffff\1\u00f5\5\uffff\1\u00fc\1\u00fb\1\uffff\1\u00f8\12"+
            "\uffff\1\u00f3\7\uffff\1\u00ec\15\uffff\1\u00e6\1\uffff\1\u00ea"+
            "\2\uffff\1\u00e7\2\uffff\1\u00e8\4\uffff\1\u00fe\4\uffff\1\u00ed"+
            "\5\uffff\3\u00e5\6\uffff\1\u00f7\1\u00f9\2\uffff\1\u00e9\12"+
            "\uffff\1\u00ee\2\uffff\1\u00ef",
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
            "\1\u0107\5\uffff\1\u0106\1\uffff\1\u0108",
            "\1\u010b\5\uffff\1\u010a\1\uffff\1\u010c\25\uffff\1\u0109",
            "\1\u010e\1\uffff\1\u010d",
            "\1\u0110\1\uffff\1\u010f",
            "\1\u0112\5\uffff\1\u0111\1\uffff\1\u0113",
            "\1\u0114",
            "\1\uffff",
            "\1\u0109",
            "\1\u0116\10\uffff\1\u0118\15\uffff\1\151\1\u0115\57\uffff\1"+
            "\154\21\uffff\1\u0117\5\uffff\1\153\1\152\14\uffff\1\u0119\27"+
            "\uffff\1\u011a\12\uffff\1\155",
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
            "\1\u0128\5\uffff\1\u0127\1\uffff\1\u0129",
            "\1\u012c\5\uffff\1\u012b\1\uffff\1\u012d\25\uffff\1\u012a",
            "\1\u012f\1\uffff\1\u012e",
            "\1\u0131\1\uffff\1\u0130",
            "\1\u0133\5\uffff\1\u0132\1\uffff\1\u0134",
            "\1\u0135",
            "\1\uffff",
            "\1\u012a",
            "\1\u0137\10\uffff\1\u0139\15\uffff\1\u0084\1\u0136\57\uffff"+
            "\1\u0087\21\uffff\1\u0138\5\uffff\1\u0086\1\u0085\14\uffff\1"+
            "\u013a\27\uffff\1\u013b\12\uffff\1\u0088",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\uffff",
            "\2\36\4\uffff\1\36\6\uffff\1\36\1\uffff\1\36\5\uffff\2\36\5"+
            "\uffff\3\36\13\uffff\2\36\42\uffff\1\36\10\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\2\36\1\uffff\1\36\5\uffff\2\36\1\uffff\1\36\12"+
            "\uffff\1\36\7\uffff\1\36\1\uffff\1\36\13\uffff\1\36\1\uffff"+
            "\1\u0140\2\uffff\1\36\2\uffff\1\36\4\uffff\3\36\2\uffff\1\36"+
            "\5\uffff\4\36\2\uffff\2\36\1\uffff\2\36\2\uffff\1\36\12\uffff"+
            "\1\36\2\uffff\1\36",
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
            "\1\u0148\5\uffff\1\u0147\1\uffff\1\u0149",
            "\1\u014c\5\uffff\1\u014b\1\uffff\1\u014d\25\uffff\1\u014a",
            "\1\u014f\1\uffff\1\u014e",
            "\1\u0151\1\uffff\1\u0150",
            "\1\u0153\5\uffff\1\u0152\1\uffff\1\u0154",
            "\1\u0155",
            "\1\uffff",
            "\1\u014a",
            "\1\u0157\10\uffff\1\u0159\15\uffff\1\u009f\1\u0156\57\uffff"+
            "\1\u00a2\21\uffff\1\u0158\5\uffff\1\u00a1\1\u00a0\14\uffff\1"+
            "\u015a\27\uffff\1\u015b\12\uffff\1\u015c",
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
            "\1\63\1\uffff\1\101\5\uffff\1\106\1\u0165\1\u0166\1\uffff\1"+
            "\103\5\uffff\1\105\2\uffff\1\101\3\uffff\1\u016b\3\uffff\1\107"+
            "\3\uffff\1\102\4\uffff\1\u0169\3\uffff\1\77\2\uffff\1\u016e"+
            "\7\uffff\1\u016b\5\uffff\1\u0168\1\u0169\6\uffff\1\100\3\uffff"+
            "\1\u016b\13\uffff\1\64\1\74\13\uffff\1\76\1\uffff\1\104\11\uffff"+
            "\1\75\11\uffff\1\u016d\1\u0167\1\uffff\1\u016a\6\uffff\1\73"+
            "\10\uffff\1\72\1\36\1\uffff\1\65\2\uffff\1\u0161\1\u0162\1\u0170"+
            "\1\uffff\1\u016f\1\uffff\1\u016b\2\u016c\1\u016a\3\uffff\1\36"+
            "\11\uffff\2\u0164\3\uffff\1\u0163\1\71\1\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\u0186\4\uffff\1\u0182\6\uffff\1\u0188\1\uffff\1\u0184\5\uffff"+
            "\2\u0188\5\uffff\1\u0180\1\u018a\1\u0181\13\uffff\2\u0188\42"+
            "\uffff\1\u018d\10\uffff\1\u017b\3\uffff\1\u0186\1\uffff\2\u0186"+
            "\1\uffff\1\u0185\5\uffff\1\u018c\1\u018b\1\uffff\1\u0188\12"+
            "\uffff\1\u0183\7\uffff\1\u017c\1\uffff\1\u0172\13\uffff\1\u0176"+
            "\1\uffff\1\u017a\2\uffff\1\u0177\2\uffff\1\u0178\4\uffff\1\u018e"+
            "\2\u0171\2\uffff\1\u017d\5\uffff\3\u0175\1\u018f\2\uffff\1\u0173"+
            "\1\u0174\1\uffff\1\u0187\1\u0189\2\uffff\1\u0179\12\uffff\1"+
            "\u017e\2\uffff\1\u017f",
            "",
            "\2\u01a1\4\uffff\1\u019d\6\uffff\1\u01a3\1\uffff\1\u019f\5\uffff"+
            "\2\u01a3\5\uffff\1\u019b\1\u01a5\1\u019c\13\uffff\2\u01a3\42"+
            "\uffff\1\u01a8\10\uffff\1\u0196\3\uffff\1\u01a1\1\uffff\2\u01a1"+
            "\1\uffff\1\u01a0\5\uffff\1\u01a7\1\u01a6\1\uffff\1\u01a3\12"+
            "\uffff\1\u019e\7\uffff\1\u0197\15\uffff\1\u0191\1\uffff\1\u0195"+
            "\2\uffff\1\u0192\2\uffff\1\u0193\4\uffff\1\u01a9\4\uffff\1\u0198"+
            "\5\uffff\3\u0190\6\uffff\1\u01a2\1\u01a4\2\uffff\1\u0194\12"+
            "\uffff\1\u0199\2\uffff\1\u019a",
            "\2\u01c3\1\63\1\uffff\1\101\1\uffff\1\u01bf\3\uffff\1\106\1"+
            "\u01aa\1\u01ab\1\u01c5\1\103\1\u01c1\4\uffff\1\105\2\u01c5\1"+
            "\101\3\uffff\1\55\1\u01bd\1\u01c7\1\u01be\1\107\3\uffff\1\102"+
            "\1\uffff\1\60\2\uffff\1\u01ae\1\uffff\2\u01c5\1\77\2\uffff\1"+
            "\57\4\uffff\1\60\1\uffff\1\60\1\55\5\uffff\1\u01ad\1\u01ae\1"+
            "\62\3\uffff\1\60\1\uffff\1\100\1\113\1\uffff\1\60\1\55\3\uffff"+
            "\1\60\1\u01ca\6\uffff\1\64\1\74\1\u01b9\2\uffff\1\112\1\u01c3"+
            "\1\uffff\2\u01c3\1\uffff\1\u01c2\1\uffff\1\76\1\uffff\1\104"+
            "\1\uffff\1\u01c9\1\u01c8\1\uffff\1\u01c5\1\uffff\1\112\2\uffff"+
            "\1\75\5\uffff\1\u01c0\2\uffff\1\111\1\56\1\u01ac\1\uffff\1\u01af"+
            "\1\u01ba\5\uffff\1\73\3\uffff\1\110\1\uffff\1\112\1\uffff\1"+
            "\u01b4\1\72\1\u01b8\1\61\1\65\1\u01b5\2\uffff\1\u01b6\1\70\1"+
            "\uffff\1\67\1\uffff\1\u01b2\2\u01b0\1\u01af\1\61\1\u01b1\3\61"+
            "\2\62\3\u01b3\6\uffff\1\u01c4\1\u01c6\1\uffff\1\71\1\u01b7\12"+
            "\uffff\1\u01bb\2\uffff\1\u01bc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\4\uffff\1\36\6\uffff\1\36\1\uffff\1\36\5\uffff\2\36\5"+
            "\uffff\3\36\13\uffff\2\36\42\uffff\1\36\10\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\2\36\1\uffff\1\36\5\uffff\2\36\1\uffff\1\36\12"+
            "\uffff\1\36\7\uffff\1\36\1\uffff\1\36\13\uffff\1\36\1\uffff"+
            "\1\u01cb\2\uffff\1\36\2\uffff\1\36\4\uffff\3\36\2\uffff\1\36"+
            "\5\uffff\4\36\2\uffff\2\36\1\uffff\2\36\2\uffff\1\36\12\uffff"+
            "\1\36\2\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\1\63\1\uffff\1\101\1\uffff\1\36\3\uffff\1\106\1\u01aa"+
            "\1\u01ab\1\36\1\103\1\36\4\uffff\1\105\2\36\1\101\3\uffff\1"+
            "\55\3\36\1\107\3\uffff\1\102\1\uffff\1\60\2\uffff\1\u01ae\1"+
            "\uffff\2\36\1\77\2\uffff\1\57\4\uffff\1\60\1\uffff\1\60\1\55"+
            "\5\uffff\1\u01ad\1\u01ae\1\62\3\uffff\1\60\1\uffff\1\100\1\113"+
            "\1\uffff\1\60\1\55\3\uffff\1\60\1\36\6\uffff\1\64\1\74\1\36"+
            "\2\uffff\1\112\1\36\1\uffff\2\36\1\uffff\1\36\1\uffff\1\76\1"+
            "\uffff\1\104\1\uffff\2\36\1\uffff\1\36\1\uffff\1\112\2\uffff"+
            "\1\75\5\uffff\1\36\2\uffff\1\111\1\56\1\u01ac\1\uffff\1\u01af"+
            "\1\36\1\uffff\1\36\3\uffff\1\73\3\uffff\1\110\1\uffff\1\112"+
            "\1\uffff\1\36\1\72\1\36\1\61\1\65\1\36\1\uffff\1\u01cc\1\36"+
            "\1\70\1\uffff\1\67\1\uffff\1\45\2\41\1\u01af\1\61\1\44\3\61"+
            "\2\62\4\36\2\uffff\1\u01cd\1\u01ce\1\uffff\2\36\1\u01cf\1\71"+
            "\1\36\12\uffff\1\36\2\uffff\1\36",
            "",
            "\1\36\1\uffff\1\36\5\uffff\3\36\1\uffff\1\36\5\uffff\1\36\2"+
            "\uffff\1\36\3\uffff\1\36\3\uffff\1\36\3\uffff\1\36\4\uffff\1"+
            "\36\3\uffff\1\36\2\uffff\1\36\7\uffff\1\36\5\uffff\2\36\6\uffff"+
            "\1\36\3\uffff\1\36\13\uffff\2\36\13\uffff\1\36\1\uffff\1\36"+
            "\11\uffff\1\36\11\uffff\2\36\1\uffff\1\36\6\uffff\1\36\10\uffff"+
            "\1\36\1\115\1\uffff\1\36\3\uffff\2\36\1\uffff\1\36\1\uffff\4"+
            "\36\3\uffff\1\117\11\uffff\2\36\3\uffff\2\36\1\uffff\1\116",
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
            return "629:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );";
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

                        else if ( (LA120_31==EOF||LA120_31==AND||LA120_31==ASCENDING||(LA120_31>=CASE && LA120_31<=CASTABLE)||LA120_31==COLLATION||LA120_31==DEFAULT||LA120_31==DESCENDING||LA120_31==DIV||LA120_31==ELSE||LA120_31==EMPTY||LA120_31==EXCEPT||LA120_31==FOR||LA120_31==FTCONTAINS||LA120_31==IDIV||(LA120_31>=INSTANCE && LA120_31<=INTERSECT)||LA120_31==LET||LA120_31==MOD||(LA120_31>=OR && LA120_31<=ORDER)||LA120_31==RETURN||LA120_31==SATISFIES||LA120_31==STABLE||(LA120_31>=TO && LA120_31<=TREAT)||LA120_31==UNION||LA120_31==WHERE||LA120_31==SEMICOLONSi||LA120_31==COMMASi||(LA120_31>=LPARSi && LA120_31<=RPARSi)||LA120_31==RBRACSi||(LA120_31>=STARSi && LA120_31<=PIPESi)||(LA120_31>=DBLSLASHSi && LA120_31<=SLASHSi)||(LA120_31>=LBRACKSi && LA120_31<=RBRACKSi)) ) {s = 30;}

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
                        if ( (LA120_225==EOF||LA120_225==AND||LA120_225==ASCENDING||(LA120_225>=CASE && LA120_225<=CASTABLE)||LA120_225==COLLATION||LA120_225==DEFAULT||LA120_225==DESCENDING||LA120_225==DIV||LA120_225==ELSE||LA120_225==EMPTY||LA120_225==EXCEPT||LA120_225==FOR||LA120_225==FTCONTAINS||LA120_225==IDIV||(LA120_225>=INSTANCE && LA120_225<=INTERSECT)||LA120_225==LET||LA120_225==MOD||(LA120_225>=OR && LA120_225<=ORDER)||LA120_225==RETURN||LA120_225==SATISFIES||LA120_225==STABLE||(LA120_225>=TO && LA120_225<=TREAT)||LA120_225==UNION||LA120_225==WHERE||LA120_225==SEMICOLONSi||LA120_225==COMMASi||(LA120_225>=LPARSi && LA120_225<=RPARSi)||LA120_225==RBRACSi||(LA120_225>=STARSi && LA120_225<=PIPESi)||(LA120_225>=DBLSLASHSi && LA120_225<=SLASHSi)||(LA120_225>=LBRACKSi && LA120_225<=RBRACKSi)) ) {s = 30;}

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

                        else if ( ((LA120_2>=ANCESTOR && LA120_2<=ANCESTOR_OR_SELF)||LA120_2==PARENT||(LA120_2>=PRECEDING && LA120_2<=PRECEDING_SIBLING)) && (synpred3())) {s = 21;}

                        else if ( (LA120_2==DOTDOTSi) && (synpred3())) {s = 22;}

                        else if ( (LA120_2==CHILD||(LA120_2>=DESCENDANT && LA120_2<=DESCENDANT_OR_SELF)||(LA120_2>=FOLLOWING && LA120_2<=FOLLOWING_SIBLING)||LA120_2==SELF) && (synpred3())) {s = 23;}

                        else if ( (LA120_2==ATSi) && (synpred3())) {s = 24;}

                        else if ( (LA120_2==DOCUMENT_NODE) && (synpred3())) {s = 25;}

                        else if ( (LA120_2==SCHEMAELEMENT) && (synpred3())) {s = 26;}

                        else if ( (LA120_2==SCHEMAATTRIBUTE) && (synpred3())) {s = 27;}

                        else if ( (LA120_2==NODE) && (synpred3())) {s = 28;}

                        else if ( (LA120_2==STARSi) ) {s = 29;}

                        else if ( (LA120_2==EOF||LA120_2==AND||LA120_2==ASCENDING||(LA120_2>=CASE && LA120_2<=CASTABLE)||LA120_2==COLLATION||LA120_2==DEFAULT||LA120_2==DESCENDING||LA120_2==DIV||LA120_2==ELSE||LA120_2==EMPTY||LA120_2==EQ||LA120_2==EXCEPT||LA120_2==FOR||LA120_2==FTCONTAINS||LA120_2==GE||(LA120_2>=GT && LA120_2<=IDIV)||(LA120_2>=INSTANCE && LA120_2<=IS)||LA120_2==LE||(LA120_2>=LET && LA120_2<=LEVELS)||(LA120_2>=LT && LA120_2<=MOD)||LA120_2==NE||(LA120_2>=OR && LA120_2<=ORDER)||LA120_2==PARAGRAPHS||LA120_2==RETURN||LA120_2==SATISFIES||LA120_2==SENTENCES||LA120_2==STABLE||(LA120_2>=TIMES && LA120_2<=TREAT)||LA120_2==UNION||LA120_2==WHERE||LA120_2==WITHOUT||LA120_2==WORDS||LA120_2==SEMICOLONSi||(LA120_2>=EQSi && LA120_2<=COMMASi)||LA120_2==RPARSi||LA120_2==RBRACSi||(LA120_2>=PLUSSi && LA120_2<=NEQSi)||(LA120_2>=LTOREQSi && LA120_2<=NODEAFTERSi)||LA120_2==RBRACKSi) ) {s = 30;}

                         
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
                        if ( (LA120_37==EOF||LA120_37==AND||LA120_37==ASCENDING||(LA120_37>=CASE && LA120_37<=CASTABLE)||LA120_37==COLLATION||LA120_37==DEFAULT||LA120_37==DESCENDING||LA120_37==DIV||LA120_37==ELSE||LA120_37==EMPTY||LA120_37==EQ||LA120_37==EXCEPT||LA120_37==FOR||LA120_37==FTCONTAINS||LA120_37==GE||(LA120_37>=GT && LA120_37<=IDIV)||(LA120_37>=INSTANCE && LA120_37<=IS)||LA120_37==LE||(LA120_37>=LET && LA120_37<=LEVELS)||(LA120_37>=LT && LA120_37<=MOD)||LA120_37==NE||(LA120_37>=OR && LA120_37<=ORDER)||LA120_37==PARAGRAPHS||LA120_37==RETURN||LA120_37==SATISFIES||LA120_37==SENTENCES||LA120_37==STABLE||(LA120_37>=TIMES && LA120_37<=TREAT)||LA120_37==UNION||LA120_37==WHERE||LA120_37==WITHOUT||LA120_37==WORDS||LA120_37==SEMICOLONSi||(LA120_37>=EQSi && LA120_37<=COMMASi)||LA120_37==COLONSi||LA120_37==RPARSi||LA120_37==RBRACSi||(LA120_37>=PIPESi && LA120_37<=NEQSi)||(LA120_37>=LTOREQSi && LA120_37<=NODEAFTERSi)||(LA120_37>=LBRACKSi && LA120_37<=RBRACKSi)) ) {s = 30;}

                        else if ( ((LA120_37>=PLUSSi && LA120_37<=MINUSSi)) ) {s = 194;}

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

                        else if ( ((LA120_37>=ANCESTOR && LA120_37<=ANCESTOR_OR_SELF)||LA120_37==PARENT||(LA120_37>=PRECEDING && LA120_37<=PRECEDING_SIBLING)) && (synpred3())) {s = 215;}

                        else if ( (LA120_37==DOTDOTSi) && (synpred3())) {s = 216;}

                        else if ( (LA120_37==CHILD||(LA120_37>=DESCENDANT && LA120_37<=DESCENDANT_OR_SELF)||(LA120_37>=FOLLOWING && LA120_37<=FOLLOWING_SIBLING)||LA120_37==SELF) && (synpred3())) {s = 217;}

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

                        else if ( ((LA120_0>=ANCESTOR && LA120_0<=ANCESTOR_OR_SELF)||LA120_0==ATTRIBUTE||LA120_0==CHILD||LA120_0==COMMENT||(LA120_0>=DESCENDANT && LA120_0<=DESCENDANT_OR_SELF)||(LA120_0>=DOCUMENT && LA120_0<=ELEMENT)||(LA120_0>=FOLLOWING && LA120_0<=FOLLOWING_SIBLING)||LA120_0==NODE||LA120_0==ORDERED||LA120_0==PARENT||(LA120_0>=PRECEDING && LA120_0<=PRECEDING_SIBLING)||LA120_0==PROCESSING_INSTRUCTION||(LA120_0>=SCHEMAATTRIBUTE && LA120_0<=SCHEMAELEMENT)||LA120_0==SELF||LA120_0==TEXT||LA120_0==UNORDERED||LA120_0==StringLiteral||LA120_0==NCName||LA120_0==DOLLARSi||LA120_0==LPARSi||LA120_0==STARSi||LA120_0==LTSi||(LA120_0>=IntegerLiteral && LA120_0<=DoubleLiteral)||(LA120_0>=DOTDOTSi && LA120_0<=ATSi)||LA120_0==DOTSi||LA120_0==LCOMMENTSi||LA120_0==LPISi) ) {s = 3;}

                         
                        input.seek(index120_0);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA120_36 = input.LA(1);

                         
                        int index120_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA120_36>=PLUSSi && LA120_36<=MINUSSi)) && (synpred3())) {s = 163;}

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

                        else if ( ((LA120_36>=ANCESTOR && LA120_36<=ANCESTOR_OR_SELF)||LA120_36==PARENT||(LA120_36>=PRECEDING && LA120_36<=PRECEDING_SIBLING)) && (synpred3())) {s = 184;}

                        else if ( (LA120_36==DOTDOTSi) && (synpred3())) {s = 185;}

                        else if ( (LA120_36==CHILD||(LA120_36>=DESCENDANT && LA120_36<=DESCENDANT_OR_SELF)||(LA120_36>=FOLLOWING && LA120_36<=FOLLOWING_SIBLING)||LA120_36==SELF) && (synpred3())) {s = 186;}

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

                        else if ( ((LA120_29>=PLUSSi && LA120_29<=MINUSSi)) ) {s = 33;}

                        else if ( ((LA120_29>=ANCESTOR && LA120_29<=ANCESTOR_OR_SELF)||LA120_29==ATTRIBUTE||LA120_29==CHILD||LA120_29==COMMENT||(LA120_29>=DESCENDANT && LA120_29<=DESCENDANT_OR_SELF)||(LA120_29>=DOCUMENT && LA120_29<=ELEMENT)||(LA120_29>=FOLLOWING && LA120_29<=FOLLOWING_SIBLING)||LA120_29==NODE||LA120_29==ORDERED||LA120_29==PARENT||(LA120_29>=PRECEDING && LA120_29<=PRECEDING_SIBLING)||LA120_29==PROCESSING_INSTRUCTION||(LA120_29>=SCHEMAATTRIBUTE && LA120_29<=SCHEMAELEMENT)||LA120_29==SELF||LA120_29==TEXT||LA120_29==UNORDERED||LA120_29==VALIDATE||LA120_29==StringLiteral||LA120_29==NCName||LA120_29==DOLLARSi||LA120_29==LPARSi||(LA120_29>=IntegerLiteral && LA120_29<=LPRAGSi)||(LA120_29>=DOTDOTSi && LA120_29<=ATSi)||LA120_29==DOTSi||LA120_29==LCOMMENTSi||LA120_29==LPISi) ) {s = 30;}

                        else if ( (LA120_29==DBLSLASHSi) ) {s = 34;}

                        else if ( (LA120_29==SLASHSi) ) {s = 35;}

                        else if ( (LA120_29==LTSi) ) {s = 36;}

                        else if ( (LA120_29==STARSi) ) {s = 37;}

                        else if ( (LA120_29==LBRACKSi) && (synpred3())) {s = 38;}

                        else if ( (LA120_29==CAST) && (synpred3())) {s = 39;}

                        else if ( (LA120_29==CASTABLE) && (synpred3())) {s = 40;}

                        else if ( (LA120_29==TREAT) && (synpred3())) {s = 41;}

                        else if ( (LA120_29==INSTANCE) && (synpred3())) {s = 42;}

                        else if ( (LA120_29==EXCEPT||LA120_29==INTERSECT) && (synpred3())) {s = 43;}

                        else if ( (LA120_29==UNION||LA120_29==PIPESi) && (synpred3())) {s = 44;}

                        else if ( (LA120_29==DIV||LA120_29==IDIV||LA120_29==MOD) && (synpred3())) {s = 45;}

                        else if ( (LA120_29==TO) && (synpred3())) {s = 46;}

                        else if ( (LA120_29==FTCONTAINS) && (synpred3())) {s = 47;}

                        else if ( (LA120_29==EQ||LA120_29==GE||LA120_29==GT||LA120_29==LE||LA120_29==LT||LA120_29==NE) && (synpred3())) {s = 48;}

                        else if ( (LA120_29==EQSi||LA120_29==NEQSi||(LA120_29>=LTOREQSi && LA120_29<=GTOREQSi)) && (synpred3())) {s = 49;}

                        else if ( (LA120_29==IS||(LA120_29>=NODEBEFORESi && LA120_29<=NODEAFTERSi)) && (synpred3())) {s = 50;}

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

                        else if ( (LA120_29==ASCENDING||LA120_29==DESCENDING) && (synpred3())) {s = 65;}

                        else if ( (LA120_29==EMPTY) && (synpred3())) {s = 66;}

                        else if ( (LA120_29==COLLATION) && (synpred3())) {s = 67;}

                        else if ( (LA120_29==SATISFIES) && (synpred3())) {s = 68;}

                        else if ( (LA120_29==DEFAULT) && (synpred3())) {s = 69;}

                        else if ( (LA120_29==CASE) && (synpred3())) {s = 70;}

                        else if ( (LA120_29==ELSE) && (synpred3())) {s = 71;}

                        else if ( (LA120_29==WITHOUT) && (synpred3())) {s = 72;}

                        else if ( (LA120_29==TIMES) && (synpred3())) {s = 73;}

                        else if ( (LA120_29==PARAGRAPHS||LA120_29==SENTENCES||LA120_29==WORDS) && (synpred3())) {s = 74;}

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

                        else if ( ((LA120_223>=PLUSSi && LA120_223<=MINUSSi)) ) {s = 33;}

                        else if ( ((LA120_223>=ANCESTOR && LA120_223<=ANCESTOR_OR_SELF)||LA120_223==ATTRIBUTE||LA120_223==CHILD||LA120_223==COMMENT||(LA120_223>=DESCENDANT && LA120_223<=DESCENDANT_OR_SELF)||(LA120_223>=DOCUMENT && LA120_223<=ELEMENT)||(LA120_223>=FOLLOWING && LA120_223<=FOLLOWING_SIBLING)||LA120_223==NODE||LA120_223==ORDERED||LA120_223==PARENT||(LA120_223>=PRECEDING && LA120_223<=PRECEDING_SIBLING)||LA120_223==PROCESSING_INSTRUCTION||(LA120_223>=SCHEMAATTRIBUTE && LA120_223<=SCHEMAELEMENT)||LA120_223==SELF||LA120_223==TEXT||LA120_223==UNORDERED||LA120_223==VALIDATE||LA120_223==StringLiteral||LA120_223==NCName||LA120_223==DOLLARSi||LA120_223==LPARSi||(LA120_223>=IntegerLiteral && LA120_223<=LPRAGSi)||(LA120_223>=DOTDOTSi && LA120_223<=ATSi)||LA120_223==DOTSi||LA120_223==LCOMMENTSi||LA120_223==LPISi) ) {s = 30;}

                        else if ( (LA120_223==DBLSLASHSi) ) {s = 461;}

                        else if ( (LA120_223==SLASHSi) ) {s = 462;}

                        else if ( (LA120_223==LTSi) ) {s = 36;}

                        else if ( (LA120_223==STARSi) ) {s = 37;}

                        else if ( (LA120_223==LBRACKSi) && (synpred3())) {s = 463;}

                        else if ( (LA120_223==CAST) && (synpred3())) {s = 426;}

                        else if ( (LA120_223==CASTABLE) && (synpred3())) {s = 427;}

                        else if ( (LA120_223==TREAT) && (synpred3())) {s = 428;}

                        else if ( (LA120_223==INSTANCE) && (synpred3())) {s = 429;}

                        else if ( (LA120_223==EXCEPT||LA120_223==INTERSECT) && (synpred3())) {s = 430;}

                        else if ( (LA120_223==UNION||LA120_223==PIPESi) && (synpred3())) {s = 431;}

                        else if ( (LA120_223==TO) && (synpred3())) {s = 46;}

                        else if ( (LA120_223==FTCONTAINS) && (synpred3())) {s = 47;}

                        else if ( (LA120_223==EQ||LA120_223==GE||LA120_223==GT||LA120_223==LE||LA120_223==LT||LA120_223==NE) && (synpred3())) {s = 48;}

                        else if ( (LA120_223==EQSi||LA120_223==NEQSi||(LA120_223>=LTOREQSi && LA120_223<=GTOREQSi)) && (synpred3())) {s = 49;}

                        else if ( (LA120_223==IS||(LA120_223>=NODEBEFORESi && LA120_223<=NODEAFTERSi)) && (synpred3())) {s = 50;}

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

                        else if ( (LA120_223==ASCENDING||LA120_223==DESCENDING) && (synpred3())) {s = 65;}

                        else if ( (LA120_223==EMPTY) && (synpred3())) {s = 66;}

                        else if ( (LA120_223==COLLATION) && (synpred3())) {s = 67;}

                        else if ( (LA120_223==SATISFIES) && (synpred3())) {s = 68;}

                        else if ( (LA120_223==DEFAULT) && (synpred3())) {s = 69;}

                        else if ( (LA120_223==CASE) && (synpred3())) {s = 70;}

                        else if ( (LA120_223==ELSE) && (synpred3())) {s = 71;}

                        else if ( (LA120_223==WITHOUT) && (synpred3())) {s = 72;}

                        else if ( (LA120_223==TIMES) && (synpred3())) {s = 73;}

                        else if ( (LA120_223==PARAGRAPHS||LA120_223==SENTENCES||LA120_223==WORDS) && (synpred3())) {s = 74;}

                        else if ( (LA120_223==LEVELS) && (synpred3())) {s = 75;}

                        else if ( (LA120_223==DIV||LA120_223==IDIV||LA120_223==MOD) && (synpred3())) {s = 45;}

                         
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

                        else if ( (LA120_197==EXCEPT||LA120_197==INTERSECT) && (synpred3())) {s = 430;}

                        else if ( (LA120_197==UNION||LA120_197==PIPESi) && (synpred3())) {s = 431;}

                        else if ( ((LA120_197>=PLUSSi && LA120_197<=MINUSSi)) && (synpred3())) {s = 432;}

                        else if ( (LA120_197==TO) && (synpred3())) {s = 46;}

                        else if ( (LA120_197==FTCONTAINS) && (synpred3())) {s = 47;}

                        else if ( (LA120_197==EQ||LA120_197==GE||LA120_197==GT||LA120_197==LE||LA120_197==LT||LA120_197==NE) && (synpred3())) {s = 48;}

                        else if ( (LA120_197==LTSi) ) {s = 433;}

                        else if ( (LA120_197==IS||(LA120_197>=NODEBEFORESi && LA120_197<=NODEAFTERSi)) && (synpred3())) {s = 50;}

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

                        else if ( (LA120_197==ASCENDING||LA120_197==DESCENDING) && (synpred3())) {s = 65;}

                        else if ( (LA120_197==EMPTY) && (synpred3())) {s = 66;}

                        else if ( (LA120_197==COLLATION) && (synpred3())) {s = 67;}

                        else if ( (LA120_197==SATISFIES) && (synpred3())) {s = 68;}

                        else if ( (LA120_197==DEFAULT) && (synpred3())) {s = 69;}

                        else if ( (LA120_197==CASE) && (synpred3())) {s = 70;}

                        else if ( (LA120_197==ELSE) && (synpred3())) {s = 71;}

                        else if ( (LA120_197==WITHOUT) && (synpred3())) {s = 72;}

                        else if ( (LA120_197==TIMES) && (synpred3())) {s = 73;}

                        else if ( (LA120_197==PARAGRAPHS||LA120_197==SENTENCES||LA120_197==WORDS) && (synpred3())) {s = 74;}

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

                        else if ( ((LA120_197>=ANCESTOR && LA120_197<=ANCESTOR_OR_SELF)||LA120_197==PARENT||(LA120_197>=PRECEDING && LA120_197<=PRECEDING_SIBLING)) ) {s = 451;}

                        else if ( (LA120_197==DOTDOTSi) ) {s = 452;}

                        else if ( (LA120_197==CHILD||(LA120_197>=DESCENDANT && LA120_197<=DESCENDANT_OR_SELF)||(LA120_197>=FOLLOWING && LA120_197<=FOLLOWING_SIBLING)||LA120_197==SELF) ) {s = 453;}

                        else if ( (LA120_197==ATSi) ) {s = 454;}

                        else if ( (LA120_197==DOCUMENT_NODE) ) {s = 455;}

                        else if ( (LA120_197==SCHEMAELEMENT) ) {s = 456;}

                        else if ( (LA120_197==SCHEMAATTRIBUTE) ) {s = 457;}

                        else if ( (LA120_197==NODE) ) {s = 458;}

                        else if ( (LA120_197==DIV||LA120_197==IDIV||LA120_197==MOD) && (synpred3())) {s = 45;}

                         
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

                        else if ( (LA120_172==EXCEPT||LA120_172==INTERSECT) && (synpred3())) {s = 361;}

                        else if ( (LA120_172==UNION||LA120_172==PIPESi) && (synpred3())) {s = 362;}

                        else if ( (LA120_172==DIV||LA120_172==IDIV||LA120_172==MOD||LA120_172==STARSi) && (synpred3())) {s = 363;}

                        else if ( ((LA120_172>=PLUSSi && LA120_172<=MINUSSi)) && (synpred3())) {s = 364;}

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

                        else if ( (LA120_172==ASCENDING||LA120_172==DESCENDING) && (synpred3())) {s = 65;}

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
 

    public static final BitSet FOLLOW_versionDecl_in_module522 = new BitSet(new long[]{0xC007101C1A2810C0L,0x0408B05A20110800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_libraryModule_in_module526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl563 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_versionDecl572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule630 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_moduleDecl671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule733 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_queryBody_in_mainModule735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_expr805 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_expr807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_setter_in_prolog876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_importStmt_in_prolog884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_prolog899 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_varDecl_in_prolog941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_functionDecl_in_prolog945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_optionDecl_in_prolog949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_prolog967 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl1000 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl1002 = new BitSet(new long[]{0x0200001000000000L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl1157 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1159 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl1185 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl1187 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl1218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl1244 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl1246 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_constructionDecl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl1310 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl1314 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl1316 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl1344 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1346 = new BitSet(new long[]{0x0000000000000000L,0x0000002000400000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl1449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport1509 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1511 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1516 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_schemaImport1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1521 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1568 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport1599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_moduleImport1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1612 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_moduleImport1615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl1658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_varDecl1664 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl1666 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl1671 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_qName1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_qName1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration1735 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl1766 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_functionDecl1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl1772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002200000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl1777 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl1792 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl1794 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_paramList1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_param_in_paramList1838 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOLLARSi_in_param1874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_param1876 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_typeDeclaration_in_param1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr1923 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl2002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_optionDecl2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl2032 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl2034 = new BitSet(new long[]{0x0000000040010000L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions2060 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_itemType_in_sequenceType2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType2142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest2584 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest2591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest2625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000022040000L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest2631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeName_in_elementTest2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest2635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest2794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000022040000L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeName_in_attributeTest2866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest3013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest3015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002050000L});
    public static final BitSet FOLLOW_set_in_piTest3017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest3055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest3057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest3124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr3415 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr3419 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr3423 = new BitSet(new long[]{0x0000000000000000L,0x0010010010000000L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr3426 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr3429 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause3463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_forClause3467 = new BitSet(new long[]{0x0000000000000A00L,0x0000400000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3469 = new BitSet(new long[]{0x0000000000000800L,0x0000400000000001L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3472 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000001L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_forClause3478 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_forClause3497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_forClause3501 = new BitSet(new long[]{0x0000000000000A00L,0x0000400000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3503 = new BitSet(new long[]{0x0000000000000800L,0x0000400000000001L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3506 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000001L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_forClause3512 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_qName_in_varName3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar3572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar3574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_positionalVar3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar3609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause3661 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_varBinding_in_letClause3663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_letClause3666 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_varBinding_in_letClause3668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_varBinding3687 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varBinding3689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_SCORE_in_varBinding3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_varBinding3702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varBinding3719 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_varBinding3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause3759 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3793 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause3795 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause3799 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause3803 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3832 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList3835 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec3870 = new BitSet(new long[]{0x0000020020100402L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier3901 = new BitSet(new long[]{0x0000020000100002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier3911 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_orderModifier3913 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier3924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr3961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3971 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3976 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3978 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr3994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3998 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr4003 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr4005 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr4009 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr4044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr4046 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr4048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr4050 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr4052 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr4068 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr4071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr4073 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr4077 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause4110 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000240000L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause4113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_caseClause4115 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_caseClause4117 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause4121 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause4123 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr4166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr4168 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_ifExpr4170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr4172 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr4174 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr4176 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr4178 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr4221 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_OR_in_orExpr4225 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_andExpr_in_orExpr4227 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr4262 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AND_in_andExpr4266 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr4268 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr4302 = new BitSet(new long[]{0x1400080000000002L,0x0000000000084220L,0x000000FE00080000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr4307 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr4311 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr4315 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr4347 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr4351 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr4353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr4391 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr4395 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_additiveExpr4432 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4466 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000000020000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr4470 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4486 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000000020000000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000002L});
    public static final BitSet FOLLOW_set_in_unionExpr4526 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000002L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4561 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr4565 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4573 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr4606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr4610 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr4612 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr4653 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr4657 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_treatExpr4659 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr4698 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr4702 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castableExpr4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_singleType_in_castableExpr4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr4748 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CAST_in_castExpr4752 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castExpr4754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_singleType_in_castExpr4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr4798 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType4846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption4924 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption4926 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection5106 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection5108 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection5112 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr5152 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_FTOR_in_ftOr5156 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr5158 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd5195 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd5199 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd5201 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot5235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot5239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_ftMildNot5241 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot5243 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot5278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions5304 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary5347 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary5371 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary5373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords5450 = new BitSet(new long[]{0x0000000000000032L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue5491 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue5493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption5612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption5621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes5666 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftTimes5668 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange5709 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LEAST_in_ftRange5755 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_MOST_in_ftRange5802 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange5852 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5854 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_ftRange5856 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection5888 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F000D010000L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection5890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma5932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_pragma5934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_PragmaContents_in_pragma5936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow6073 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow6075 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance6150 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftDistance6152 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope6192 = new BitSet(new long[]{0x0000000000000000L,0x0004000080000000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent6266 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_START_in_ftContent6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent6272 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_END_in_ftContent6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent6278 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption6709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption6737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption6743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6768 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6770 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6793 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption6797 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption6808 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption6853 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID6917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID6919 = new BitSet(new long[]{0x0008200000000802L,0x0000008000000000L});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID6922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID6924 = new BitSet(new long[]{0x0008200000000802L});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID6929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption6976 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption6982 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption7014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption7055 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption7297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption7314 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7372 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7376 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption7378 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7380 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption7396 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7439 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption7441 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7445 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7447 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList7513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList7532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList7537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral7560 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption7602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption7604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr7674 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000100L,0x0000000004000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr7676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr7679 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_validateExpr7681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr7759 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7785 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr7843 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7929 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7966 = new BitSet(new long[]{0x0000001800201000L,0x0400304000100000L,0x0000000020040000L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis8003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard8147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard8149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_wildcard8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard8221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard8223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep8266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep8329 = new BitSet(new long[]{0x0000001800201000L,0x0400304000100000L,0x0000000020040000L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis8382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep8469 = new BitSet(new long[]{0x0000001800201000L,0x0400304000100000L,0x0000000020040000L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep8472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList8546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate8606 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_predicate8608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr8650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr8653 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_extensionExpr8655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr8693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr8695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr8804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef8874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_varRef8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr8899 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E3250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr8901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall8957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall8959 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E3250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall8980 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr9032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr9034 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_orderedExpr9036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr9066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr9068 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr9070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor9188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor9275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor9304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040001000040000L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor9306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040001000000000L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor9336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor9365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3080000404000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor9394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3080000404000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor9423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor9453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList9549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList9551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0500000000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList9553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0300000004000000L});
    public static final BitSet FOLLOW_QuotAttributeContent_in_dirAttributeValue9622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0300000004000000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0300000004000000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0C00000004000000L});
    public static final BitSet FOLLOW_AposAttributeContent_in_dirAttributeValue9726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0C00000004000000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0C00000004000000L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_xmlEnclosedExpr9806 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_xmlEnclosedExpr9834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_xmlEnclosedExpr9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent9895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent9899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContent_in_dirElemContent9903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirElemContent9907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCDATASi_in_cDataSection9927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CDataContents_in_cDataSection9929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RCDATASi_in_cDataSection9931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCOMMENTSi_in_dirCommentConstructor9954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DirCommentContent_in_dirCommentConstructor9956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RCOMMENTSi_in_dirCommentConstructor9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPIConstructor9979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PiTarget_in_dirPIConstructor9981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_DirPiContents_in_dirPIConstructor9983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPISi_in_dirPIConstructor9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor10094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor10135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor10176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor10217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor10245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor10247 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor10249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor10251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor10280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor10283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor10287 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor10289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor10291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor10310 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor10312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor10315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor10393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor10396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor10401 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor10403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor10405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor10425 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor10427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor10430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor10466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor10468 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor10470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor10472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor10496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor10498 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor10500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor10502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor10534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10539 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10563 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred12105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_synpred27753 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred27755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred37778 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred37780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred48138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred48140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_synpred48142 = new BitSet(new long[]{0x0000000000000002L});

}