// $ANTLR 3.0.1 etc/XQFT.g 2007-10-23 18:31:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PIPESi", "BIGGERTHANSi", "BIGGERTHANOREQUALSi", "LESSTHANOREQUALSi", "ASCENDING", "IDIV", "WHERE", "PHRASE", "CONTENT", "VERSION", "LEFTBRACESi", "EQUALSi", "NOTEQUALSi", "STOP", "TYPESWITCH", "ANY", "BOUNDARYSPACE", "DOLLARSi", "XQUERY", "CAST", "DISTANCE", "LEFTPRAGMA", "ORDERED", "DOCUMENTNODE", "ELSE", "LESSTHANSi", "TREAT", "UPPERCASE", "ALL", "WORD", "RIGHTPRAGMA", "INHERIT", "SLASH", "ORDERING", "RIGHTPITARGET", "EVERY", "CASTABLE", "ITEM", "FOR", "INSTANCE", "DOUBLEQUOTESi", "EXCEPT", "TO", "CONSTRUCTION", "WEIGHT", "FTOPTION", "SATISFIES", "COLONSi", "SEMICOLONSi", "SINGLEQUOTE", "UNDERSCORE", "EMPTY", "MOST", "CASE", "PROCESSING_INSTRUCTION", "IMPORT", "MINUSSi", "RIGHTSELFTERMINATOR", "DOCUMENT", "LEFTCDATA", "VALIDATE", "EMPTY_SEQUENCE", "INSENSITIVE", "NOPRESERVE", "THEN", "COMMASi", "LET", "WINDOW", "SCORE", "LANGUAGE", "OPTION", "STEMMING", "RIGHTBRACKETSi", "GREATEST", "LEVELS", "SENSITIVE", "FTNOT", "DIV", "PLUSSi", "FTAND", "AT", "SCHEMAATTRIBUTE", "ORDER", "OF", "UNION", "FROM", "COLLATION", "DOUBLERIGHTBRACES", "VARIABLE", "OR", "FTOR", "DOUBLESLASH", "LEAST", "IF", "BASEURI", "DESCENDING", "STARSi", "NAMESPACE", "AS", "LEFTXMLCOMMENT", "BY", "TEXT", "STABLE", "LEFTBRACKETSi", "UNORDERED", "RIGHTCDATA", "EXACTLY", "WITH", "LEFTPITARGET", "WITHOUT", "DIACRITICS", "EXTERNAL", "RIGHTPARENTHESISSi", "RIGHTXMLCOMMENT", "MODULE", "RETURN", "COMMENT", "DEFAULT", "OCCURS", "ENCODING", "DOUBLELEFTBRACES", "SCHEMA", "ELEMENT", "LEFTPARENTHESISSi", "COPYNAMESPACES", "WILDCARDS", "DECLARE", "AND", "PRESERVE", "NOINHERIT", "NOT", "INTERSECT", "FUNCTION", "ATSi", "TIMES", "ATTRIBUTE", "ASSIGNMENTOPERATOR", "FTCONTAINS", "RELATIONSHIP", "THESAURUS", "MOD", "RIGHTBRACESi", "NODE", "SOME", "QUESTIONMARKSi", "STRIP", "LOWERCASE", "IN", "SCHEMAELEMENT", "LEFTENDTAG", "EQ", "NE", "LT", "LE", "GT", "GE", "IS", "NODEBEFORESi", "NODEAFTERSi", "LAX", "STRICT", "CHILD", "DOUBLECOLON", "DESCENDANT", "SELF", "DESCENDANT_OR_SELF", "FOLLOWING_SIBLING", "FOLLOWING", "PARENT", "ANCESTOR", "PRECEDING_SIBLING", "PRECEDING", "ANCESTOR_OR_SELF", "DOT", "DOTDOT", "WORDS", "SENTENCES", "PARAGRAPHS", "SENTENCE", "PARAGRAPH", "SAME", "DIFFERENT", "START", "END", "ENTIRE", "BaseChar", "Ideographic", "Letter", "CombiningChar", "Digit", "Extender", "Digits", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "PredefinedEntityRef", "CharRef", "EscapeQuot", "EscapeApos", "StringLiteral", "CleanChar", "Char", "ElementContentChar", "QuotAttrContentChar", "AposAttrContentChar", "CommentCheck", "Comment", "CommentContents", "OneOrMoreChar", "NameChar", "Name", "NCName", "NCNameStartChar", "NCNameChar", "S", "ZeroOrMoreChar", "CharNotMinus"
    };
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
    public static final int CharRef=200;
    public static final int OPTION=74;
    public static final int Extender=194;
    public static final int RIGHTPARENTHESISSi=116;
    public static final int OCCURS=122;
    public static final int THESAURUS=143;
    public static final int SATISFIES=50;
    public static final int VERSION=13;
    public static final int IDIV=9;
    public static final int ASCENDING=8;
    public static final int DOUBLELEFTBRACES=124;
    public static final int AT=84;
    public static final int EMPTY_SEQUENCE=65;
    public static final int AS=102;
    public static final int PARENT=172;
    public static final int CONSTRUCTION=47;
    public static final int RIGHTCDATA=109;
    public static final int SLASH=36;
    public static final int THEN=68;
    public static final int ATSi=137;
    public static final int DOCUMENT=62;
    public static final int COLLATION=90;
    public static final int SINGLEQUOTE=53;
    public static final int ANCESTOR=173;
    public static final int CleanChar=204;
    public static final int RIGHTSELFTERMINATOR=61;
    public static final int CASTABLE=40;
    public static final int MOST=56;
    public static final int BY=104;
    public static final int NODEBEFORESi=161;
    public static final int NCNameChar=217;
    public static final int ITEM=41;
    public static final int TO=46;
    public static final int LEFTCDATA=63;
    public static final int INHERIT=35;
    public static final int ANCESTOR_OR_SELF=176;
    public static final int STEMMING=75;
    public static final int DOUBLEQUOTESi=44;
    public static final int EscapeApos=202;
    public static final int TEXT=105;
    public static final int FTNOT=80;
    public static final int MODULE=118;
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
    public static final int Name=214;
    public static final int DOCUMENTNODE=27;
    public static final int LEAST=96;
    public static final int WINDOW=71;
    public static final int LEFTBRACESi=14;
    public static final int LEVELS=78;
    public static final int TIMES=138;
    public static final int PARAGRAPHS=181;
    public static final int LET=70;
    public static final int TREAT=30;
    public static final int LE=157;
    public static final int OneOrMoreChar=212;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[184+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }



    // $ANTLR start piTarget
    // etc/XQFT.g:287:1: piTarget : n= Name {...}?;
    public final void piTarget() throws RecognitionException {
        Token n=null;

        try {
            // etc/XQFT.g:287:21: (n= Name {...}?)
            // etc/XQFT.g:287:23: n= Name {...}?
            {
            n=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_piTarget3858); if (failed) return ;
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


    // $ANTLR start qName
    // etc/XQFT.g:303:1: qName : ( NCName COLONSi )? NCName ;
    public final void qName() throws RecognitionException {
        try {
            // etc/XQFT.g:303:13: ( ( NCName COLONSi )? NCName )
            // etc/XQFT.g:303:15: ( NCName COLONSi )? NCName
            {
            // etc/XQFT.g:303:15: ( NCName COLONSi )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NCName) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==COLONSi) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:303:16: NCName COLONSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_qName3937); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName3939); if (failed) return ;

                    }
                    break;

            }

            match(input,NCName,FOLLOW_NCName_in_qName3943); if (failed) return ;

            }

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


    // $ANTLR start module
    // etc/XQFT.g:330:1: module : ( versionDecl )? ( libraryModule | mainModule ) ;
    public final void module() throws RecognitionException {
        try {
            // etc/XQFT.g:330:29: ( ( versionDecl )? ( libraryModule | mainModule ) )
            // etc/XQFT.g:330:31: ( versionDecl )? ( libraryModule | mainModule )
            {
            // etc/XQFT.g:330:31: ( versionDecl )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==XQUERY) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:330:31: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module4208);
                    versionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:330:44: ( libraryModule | mainModule )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==MODULE) ) {
                alt3=1;
            }
            else if ( (LA3_0==TYPESWITCH||LA3_0==DOLLARSi||(LA3_0>=LEFTPRAGMA && LA3_0<=DOCUMENTNODE)||LA3_0==LESSTHANSi||LA3_0==SLASH||LA3_0==EVERY||LA3_0==FOR||(LA3_0>=PROCESSING_INSTRUCTION && LA3_0<=MINUSSi)||LA3_0==DOCUMENT||LA3_0==VALIDATE||LA3_0==LET||LA3_0==PLUSSi||LA3_0==SCHEMAATTRIBUTE||LA3_0==DOUBLESLASH||LA3_0==IF||LA3_0==STARSi||LA3_0==LEFTXMLCOMMENT||LA3_0==TEXT||LA3_0==UNORDERED||LA3_0==LEFTPITARGET||LA3_0==COMMENT||(LA3_0>=ELEMENT && LA3_0<=LEFTPARENTHESISSi)||LA3_0==DECLARE||LA3_0==ATSi||LA3_0==ATTRIBUTE||(LA3_0>=NODE && LA3_0<=SOME)||LA3_0==SCHEMAELEMENT||LA3_0==CHILD||(LA3_0>=DESCENDANT && LA3_0<=DOTDOT)||(LA3_0>=IntegerLiteral && LA3_0<=DoubleLiteral)||LA3_0==StringLiteral||LA3_0==NCName) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("330:44: ( libraryModule | mainModule )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:330:45: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module4212);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:330:61: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module4216);
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
    // etc/XQFT.g:332:1: versionDecl : XQUERY VERSION StringLiteral ( ( ENCODING StringLiteral ) | ) separator ;
    public final void versionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:332:29: ( XQUERY VERSION StringLiteral ( ( ENCODING StringLiteral ) | ) separator )
            // etc/XQFT.g:332:31: XQUERY VERSION StringLiteral ( ( ENCODING StringLiteral ) | ) separator
            {
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl4241); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl4243); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl4245); if (failed) return ;
            // etc/XQFT.g:332:60: ( ( ENCODING StringLiteral ) | )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ENCODING) ) {
                alt4=1;
            }
            else if ( (LA4_0==SEMICOLONSi) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("332:60: ( ( ENCODING StringLiteral ) | )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // etc/XQFT.g:332:61: ( ENCODING StringLiteral )
                    {
                    // etc/XQFT.g:332:61: ( ENCODING StringLiteral )
                    // etc/XQFT.g:332:62: ENCODING StringLiteral
                    {
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl4249); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl4251); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:332:86: 
                    {
                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl4256);
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


    // $ANTLR start mainModule
    // etc/XQFT.g:334:1: mainModule : prolog queryBody ;
    public final void mainModule() throws RecognitionException {
        try {
            // etc/XQFT.g:334:29: ( prolog queryBody )
            // etc/XQFT.g:334:31: prolog queryBody
            {
            pushFollow(FOLLOW_prolog_in_mainModule4281);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule4283);
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


    // $ANTLR start libraryModule
    // etc/XQFT.g:336:1: libraryModule : moduleDecl prolog ;
    public final void libraryModule() throws RecognitionException {
        try {
            // etc/XQFT.g:336:29: ( moduleDecl prolog )
            // etc/XQFT.g:336:31: moduleDecl prolog
            {
            pushFollow(FOLLOW_moduleDecl_in_libraryModule4305);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule4307);
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
    // etc/XQFT.g:338:1: moduleDecl : MODULE NAMESPACE NCName EQUALSi uriLiteral separator ;
    public final void moduleDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:338:29: ( MODULE NAMESPACE NCName EQUALSi uriLiteral separator )
            // etc/XQFT.g:338:31: MODULE NAMESPACE NCName EQUALSi uriLiteral separator
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl4332); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl4334); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl4336); if (failed) return ;
            match(input,EQUALSi,FOLLOW_EQUALSi_in_moduleDecl4338); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl4340);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl4342);
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


    // $ANTLR start prolog
    // etc/XQFT.g:340:1: prolog : ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* ;
    public final void prolog() throws RecognitionException {
        try {
            // etc/XQFT.g:340:29: ( ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* )
            // etc/XQFT.g:340:31: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            {
            // etc/XQFT.g:340:31: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DECLARE) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==BOUNDARYSPACE||LA6_1==ORDERING||LA6_1==CONSTRUCTION||LA6_1==BASEURI||LA6_1==NAMESPACE||LA6_1==DEFAULT||LA6_1==COPYNAMESPACES) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==IMPORT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // etc/XQFT.g:340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator
            	    {
            	    // etc/XQFT.g:340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )
            	    int alt5=4;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case BOUNDARYSPACE:
            	        case ORDERING:
            	        case CONSTRUCTION:
            	        case BASEURI:
            	        case COPYNAMESPACES:
            	            {
            	            alt5=2;
            	            }
            	            break;
            	        case DEFAULT:
            	            {
            	            int LA5_4 = input.LA(3);

            	            if ( (LA5_4==ELEMENT||LA5_4==FUNCTION) ) {
            	                alt5=1;
            	            }
            	            else if ( (LA5_4==ORDER||LA5_4==COLLATION) ) {
            	                alt5=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 4, input);

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
            	                new NoViableAltException("340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA5_0==IMPORT) ) {
            	        alt5=4;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // etc/XQFT.g:340:33: defaultNamespaceDecl
            	            {
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog4373);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:340:56: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog4377);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:340:65: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog4381);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:340:81: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog4385);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog4388);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // etc/XQFT.g:340:105: ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DECLARE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator
            	    {
            	    // etc/XQFT.g:340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl )
            	    int alt7=4;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
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
            	        case FTOPTION:
            	            {
            	            alt7=4;
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
            	                new NoViableAltException("340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // etc/XQFT.g:340:107: varDecl
            	            {
            	            pushFollow(FOLLOW_varDecl_in_prolog4394);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:340:117: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog4398);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:340:132: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog4402);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:340:145: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog4406);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog4409);
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


    // $ANTLR start setter
    // etc/XQFT.g:342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );
    public final void setter() throws RecognitionException {
        try {
            // etc/XQFT.g:342:29: ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl )
            int alt9=7;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DECLARE) ) {
                switch ( input.LA(2) ) {
                case BASEURI:
                    {
                    alt9=3;
                    }
                    break;
                case BOUNDARYSPACE:
                    {
                    alt9=1;
                    }
                    break;
                case ORDERING:
                    {
                    alt9=5;
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
                            new NoViableAltException("342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case CONSTRUCTION:
                    {
                    alt9=4;
                    }
                    break;
                case COPYNAMESPACES:
                    {
                    alt9=7;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:342:31: boundarySpaceDecl
                    {
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter4440);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:342:51: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter4444);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:342:74: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter4448);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:342:88: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter4452);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:342:107: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter4456);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:342:126: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter4460);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:342:143: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter4464);
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


    // $ANTLR start importStmt
    // etc/XQFT.g:345:1: importStmt : ( schemaImport | moduleImport );
    public final void importStmt() throws RecognitionException {
        try {
            // etc/XQFT.g:345:29: ( schemaImport | moduleImport )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IMPORT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==SCHEMA) ) {
                    alt10=1;
                }
                else if ( (LA10_1==MODULE) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("345:1: importStmt : ( schemaImport | moduleImport );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("345:1: importStmt : ( schemaImport | moduleImport );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:345:31: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt4491);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:345:46: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt4495);
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


    // $ANTLR start separator
    // etc/XQFT.g:347:1: separator : SEMICOLONSi ;
    public final void separator() throws RecognitionException {
        try {
            // etc/XQFT.g:347:29: ( SEMICOLONSi )
            // etc/XQFT.g:347:31: SEMICOLONSi
            {
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator4521); if (failed) return ;

            }

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


    // $ANTLR start namespaceDecl
    // etc/XQFT.g:349:1: namespaceDecl : DECLARE NAMESPACE NCName EQUALSi uriLiteral ;
    public final void namespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:349:29: ( DECLARE NAMESPACE NCName EQUALSi uriLiteral )
            // etc/XQFT.g:349:31: DECLARE NAMESPACE NCName EQUALSi uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl4543); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl4545); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl4547); if (failed) return ;
            match(input,EQUALSi,FOLLOW_EQUALSi_in_namespaceDecl4549); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl4551);
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


    // $ANTLR start boundarySpaceDecl
    // etc/XQFT.g:351:1: boundarySpaceDecl : DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final void boundarySpaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:351:29: ( DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:351:31: DECLARE BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl4569); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl4571); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl4573);    throw mse;
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


    // $ANTLR start defaultNamespaceDecl
    // etc/XQFT.g:353:1: defaultNamespaceDecl : DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final void defaultNamespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:353:29: ( DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:353:31: DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl4594); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl4596); if (failed) return ;
            if ( input.LA(1)==ELEMENT||input.LA(1)==FUNCTION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl4598);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl4606); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl4608);
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


    // $ANTLR start optionDecl
    // etc/XQFT.g:355:1: optionDecl : DECLARE OPTION qName StringLiteral ;
    public final void optionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:355:29: ( DECLARE OPTION qName StringLiteral )
            // etc/XQFT.g:355:31: DECLARE OPTION qName StringLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl4633); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl4635); if (failed) return ;
            pushFollow(FOLLOW_qName_in_optionDecl4637);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl4639); if (failed) return ;

            }

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
    // etc/XQFT.g:357:1: ftOptionDecl : DECLARE FTOPTION ftMatchOptions ;
    public final void ftOptionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:357:29: ( DECLARE FTOPTION ftMatchOptions )
            // etc/XQFT.g:357:31: DECLARE FTOPTION ftMatchOptions
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl4662); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl4664); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl4666);
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


    // $ANTLR start orderingModeDecl
    // etc/XQFT.g:359:1: orderingModeDecl : DECLARE ORDERING ( ORDERED | UNORDERED ) ;
    public final void orderingModeDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:359:29: ( DECLARE ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:359:31: DECLARE ORDERING ( ORDERED | UNORDERED )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl4685); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl4687); if (failed) return ;
            if ( input.LA(1)==ORDERED||input.LA(1)==UNORDERED ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl4689);    throw mse;
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
    // etc/XQFT.g:361:1: emptyOrderDecl : DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) ;
    public final void emptyOrderDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:361:29: ( DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:361:31: DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl4716); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl4718); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl4720); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl4722); if (failed) return ;
            if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl4724);    throw mse;
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
    // etc/XQFT.g:363:1: copyNamespacesDecl : DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode ;
    public final void copyNamespacesDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:363:29: ( DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:363:31: DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl4747); if (failed) return ;
            match(input,COPYNAMESPACES,FOLLOW_COPYNAMESPACES_in_copyNamespacesDecl4749); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl4751);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl4753); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl4755);
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
    // etc/XQFT.g:365:1: preserveMode : ( PRESERVE | NOPRESERVE );
    public final void preserveMode() throws RecognitionException {
        try {
            // etc/XQFT.g:365:29: ( PRESERVE | NOPRESERVE )
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
    // etc/XQFT.g:367:1: inheritMode : ( INHERIT | NOINHERIT );
    public final void inheritMode() throws RecognitionException {
        try {
            // etc/XQFT.g:367:29: ( INHERIT | NOINHERIT )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end inheritMode


    // $ANTLR start defaultCollationDecl
    // etc/XQFT.g:369:1: defaultCollationDecl : DECLARE DEFAULT COLLATION uriLiteral ;
    public final void defaultCollationDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:369:29: ( DECLARE DEFAULT COLLATION uriLiteral )
            // etc/XQFT.g:369:31: DECLARE DEFAULT COLLATION uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl4825); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl4827); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl4829); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl4831);
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
    // etc/XQFT.g:371:1: baseURIDecl : DECLARE BASEURI uriLiteral ;
    public final void baseURIDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:371:29: ( DECLARE BASEURI uriLiteral )
            // etc/XQFT.g:371:31: DECLARE BASEURI uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl4855); if (failed) return ;
            match(input,BASEURI,FOLLOW_BASEURI_in_baseURIDecl4857); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl4859);
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


    // $ANTLR start schemaImport
    // etc/XQFT.g:373:1: schemaImport : IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void schemaImport() throws RecognitionException {
        try {
            // etc/XQFT.g:373:29: ( IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:373:31: IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport4882); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport4884); if (failed) return ;
            // etc/XQFT.g:373:45: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NAMESPACE||LA11_0==DEFAULT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:373:45: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport4886);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport4889);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:373:70: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:373:71: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_schemaImport4892); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport4894);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:373:85: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:373:86: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport4897); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport4899);
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
    // etc/XQFT.g:375:1: schemaPrefix : ( ( NAMESPACE NCName EQUALSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final void schemaPrefix() throws RecognitionException {
        try {
            // etc/XQFT.g:375:29: ( ( NAMESPACE NCName EQUALSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
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
                    new NoViableAltException("375:1: schemaPrefix : ( ( NAMESPACE NCName EQUALSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:375:31: ( NAMESPACE NCName EQUALSi )
                    {
                    // etc/XQFT.g:375:31: ( NAMESPACE NCName EQUALSi )
                    // etc/XQFT.g:375:32: NAMESPACE NCName EQUALSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix4927); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix4929); if (failed) return ;
                    match(input,EQUALSi,FOLLOW_EQUALSi_in_schemaPrefix4931); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:375:60: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:375:60: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:375:61: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix4937); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix4939); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix4941); if (failed) return ;

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
    // etc/XQFT.g:377:1: moduleImport : IMPORT MODULE ( NAMESPACE NCName EQUALSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void moduleImport() throws RecognitionException {
        try {
            // etc/XQFT.g:377:29: ( IMPORT MODULE ( NAMESPACE NCName EQUALSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:377:31: IMPORT MODULE ( NAMESPACE NCName EQUALSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport4965); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport4967); if (failed) return ;
            // etc/XQFT.g:377:45: ( NAMESPACE NCName EQUALSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:377:46: NAMESPACE NCName EQUALSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport4970); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport4972); if (failed) return ;
                    match(input,EQUALSi,FOLLOW_EQUALSi_in_moduleImport4974); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport4978);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:377:84: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:377:85: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_moduleImport4981); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport4983);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:377:99: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:377:100: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport4986); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport4988);
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
    // etc/XQFT.g:379:1: varDecl : DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL ) ;
    public final void varDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:379:29: ( DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:379:31: DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl5020); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl5022); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl5024); if (failed) return ;
            pushFollow(FOLLOW_qName_in_varDecl5026);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:379:63: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:379:63: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl5028);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:379:80: ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASSIGNMENTOPERATOR) ) {
                alt19=1;
            }
            else if ( (LA19_0==EXTERNAL) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("379:80: ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:379:81: ( ASSIGNMENTOPERATOR exprSingle )
                    {
                    // etc/XQFT.g:379:81: ( ASSIGNMENTOPERATOR exprSingle )
                    // etc/XQFT.g:379:82: ASSIGNMENTOPERATOR exprSingle
                    {
                    match(input,ASSIGNMENTOPERATOR,FOLLOW_ASSIGNMENTOPERATOR_in_varDecl5033); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl5035);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:379:115: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl5040); if (failed) return ;

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


    // $ANTLR start constructionDecl
    // etc/XQFT.g:381:1: constructionDecl : DECLARE CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final void constructionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:381:29: ( DECLARE CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:381:31: DECLARE CONSTRUCTION ( STRIP | PRESERVE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl5060); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl5062); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl5064);    throw mse;
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


    // $ANTLR start functionDecl
    // etc/XQFT.g:383:1: functionDecl : DECLARE FUNCTION qName LEFTPARENTHESISSi ( paramList )? RIGHTPARENTHESISSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) ;
    public final void functionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:383:29: ( DECLARE FUNCTION qName LEFTPARENTHESISSi ( paramList )? RIGHTPARENTHESISSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) )
            // etc/XQFT.g:383:31: DECLARE FUNCTION qName LEFTPARENTHESISSi ( paramList )? RIGHTPARENTHESISSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl5093); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl5095); if (failed) return ;
            pushFollow(FOLLOW_qName_in_functionDecl5097);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_functionDecl5099); if (failed) return ;
            // etc/XQFT.g:383:72: ( paramList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DOLLARSi) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:383:72: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl5101);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_functionDecl5104); if (failed) return ;
            // etc/XQFT.g:383:102: ( AS sequenceType )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==AS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:383:103: AS sequenceType
                    {
                    match(input,AS,FOLLOW_AS_in_functionDecl5107); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl5109);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:383:121: ( enclosedExpr | EXTERNAL )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LEFTBRACESi) ) {
                alt22=1;
            }
            else if ( (LA22_0==EXTERNAL) ) {
                alt22=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("383:121: ( enclosedExpr | EXTERNAL )", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:383:122: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl5114);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:383:137: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl5118); if (failed) return ;

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
    // etc/XQFT.g:385:1: paramList : param ( COMMASi param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // etc/XQFT.g:385:29: ( param ( COMMASi param )* )
            // etc/XQFT.g:385:31: param ( COMMASi param )*
            {
            pushFollow(FOLLOW_param_in_paramList5145);
            param();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:385:37: ( COMMASi param )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMASi) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // etc/XQFT.g:385:38: COMMASi param
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList5148); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList5150);
            	    param();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // etc/XQFT.g:387:1: param : DOLLARSi qName ( typeDeclaration )? ;
    public final void param() throws RecognitionException {
        try {
            // etc/XQFT.g:387:29: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:387:31: DOLLARSi qName ( typeDeclaration )?
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param5182); if (failed) return ;
            pushFollow(FOLLOW_qName_in_param5184);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:387:46: ( typeDeclaration )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // etc/XQFT.g:387:46: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param5186);
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
    // etc/XQFT.g:389:1: enclosedExpr : LEFTBRACESi expr RIGHTBRACESi ;
    public final void enclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:389:29: ( LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:389:31: LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_enclosedExpr5210); if (failed) return ;
            pushFollow(FOLLOW_expr_in_enclosedExpr5212);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_enclosedExpr5214); if (failed) return ;

            }

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


    // $ANTLR start queryBody
    // etc/XQFT.g:391:1: queryBody : expr ;
    public final void queryBody() throws RecognitionException {
        try {
            // etc/XQFT.g:391:29: ( expr )
            // etc/XQFT.g:391:31: expr
            {
            pushFollow(FOLLOW_expr_in_queryBody5240);
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
    // etc/XQFT.g:393:1: expr : exprSingle ( COMMASi exprSingle )* ;
    public final void expr() throws RecognitionException {
        try {
            // etc/XQFT.g:393:29: ( exprSingle ( COMMASi exprSingle )* )
            // etc/XQFT.g:393:31: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr5271);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:393:42: ( COMMASi exprSingle )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMASi) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // etc/XQFT.g:393:43: COMMASi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr5274); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr5276);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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


    // $ANTLR start exprSingle
    // etc/XQFT.g:395:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );
    public final void exprSingle() throws RecognitionException {
        try {
            // etc/XQFT.g:395:29: ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr )
            int alt26=5;
            switch ( input.LA(1) ) {
            case FOR:
            case LET:
                {
                alt26=1;
                }
                break;
            case EVERY:
            case SOME:
                {
                alt26=2;
                }
                break;
            case TYPESWITCH:
                {
                alt26=3;
                }
                break;
            case IF:
                {
                alt26=4;
                }
                break;
            case DOLLARSi:
            case LEFTPRAGMA:
            case ORDERED:
            case DOCUMENTNODE:
            case LESSTHANSi:
            case SLASH:
            case PROCESSING_INSTRUCTION:
            case MINUSSi:
            case DOCUMENT:
            case VALIDATE:
            case PLUSSi:
            case SCHEMAATTRIBUTE:
            case DOUBLESLASH:
            case STARSi:
            case LEFTXMLCOMMENT:
            case TEXT:
            case UNORDERED:
            case LEFTPITARGET:
            case COMMENT:
            case ELEMENT:
            case LEFTPARENTHESISSi:
            case ATSi:
            case ATTRIBUTE:
            case NODE:
            case SCHEMAELEMENT:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOT:
            case DOTDOT:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
            case NCName:
                {
                alt26=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("395:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // etc/XQFT.g:395:31: fLWORExpr
                    {
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle5303);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:396:35: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle5339);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:397:35: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle5375);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:398:35: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle5411);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:399:35: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle5447);
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
    // etc/XQFT.g:401:1: fLWORExpr : ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle ;
    public final void fLWORExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:401:29: ( ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle )
            // etc/XQFT.g:401:31: ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:401:31: ( forClause | letClause )+
            int cnt27=0;
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==FOR) ) {
                    alt27=1;
                }
                else if ( (LA27_0==LET) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // etc/XQFT.g:401:32: forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr5474);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:401:44: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr5478);
            	    letClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // etc/XQFT.g:401:56: ( whereClause )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==WHERE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:401:56: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr5482);
                    whereClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:401:69: ( orderByClause )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ORDER||LA29_0==STABLE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:401:69: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr5485);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr5488); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr5490);
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
    // etc/XQFT.g:403:1: forClause : FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* ;
    public final void forClause() throws RecognitionException {
        try {
            // etc/XQFT.g:403:29: ( FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* )
            // etc/XQFT.g:403:31: FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            {
            match(input,FOR,FOLLOW_FOR_in_forClause5516); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause5518); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause5520);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:403:52: ( typeDeclaration )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==AS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // etc/XQFT.g:403:52: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClause5522);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:403:69: ( positionalVar )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==AT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // etc/XQFT.g:403:69: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClause5525);
                    positionalVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:403:84: ( ftScoreVar )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SCORE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // etc/XQFT.g:403:84: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClause5528);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause5531); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause5533);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:403:110: ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMASi) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // etc/XQFT.g:403:111: COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause5536); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause5538); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause5540);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:403:136: ( typeDeclaration )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==AS) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // etc/XQFT.g:403:136: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause5542);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:403:153: ( positionalVar )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==AT) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // etc/XQFT.g:403:153: positionalVar
            	            {
            	            pushFollow(FOLLOW_positionalVar_in_forClause5545);
            	            positionalVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:403:168: ( ftScoreVar )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==SCORE) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // etc/XQFT.g:403:168: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause5548);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause5551); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause5553);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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


    // $ANTLR start positionalVar
    // etc/XQFT.g:405:1: positionalVar : AT DOLLARSi varName ;
    public final void positionalVar() throws RecognitionException {
        try {
            // etc/XQFT.g:405:29: ( AT DOLLARSi varName )
            // etc/XQFT.g:405:31: AT DOLLARSi varName
            {
            match(input,AT,FOLLOW_AT_in_positionalVar5577); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar5579); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar5581);
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
    // etc/XQFT.g:407:1: ftScoreVar : SCORE DOLLARSi varName ;
    public final void ftScoreVar() throws RecognitionException {
        try {
            // etc/XQFT.g:407:29: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:407:31: SCORE DOLLARSi varName
            {
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar5606); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar5608); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar5610);
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
    // etc/XQFT.g:409:1: letClause : ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) ) ASSIGNMENTOPERATOR exprSingle ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:409:29: ( ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) ) ASSIGNMENTOPERATOR exprSingle ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )* )
            // etc/XQFT.g:409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) ) ASSIGNMENTOPERATOR exprSingle ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )*
            {
            // etc/XQFT.g:409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LET) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==DOLLARSi) ) {
                    alt38=1;
                }
                else if ( (LA38_1==SCORE) ) {
                    alt38=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) )", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // etc/XQFT.g:409:32: ( LET DOLLARSi varName ( typeDeclaration )? )
                    {
                    // etc/XQFT.g:409:32: ( LET DOLLARSi varName ( typeDeclaration )? )
                    // etc/XQFT.g:409:33: LET DOLLARSi varName ( typeDeclaration )?
                    {
                    match(input,LET,FOLLOW_LET_in_letClause5638); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause5640); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause5642);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:409:54: ( typeDeclaration )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==AS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // etc/XQFT.g:409:54: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_letClause5644);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:409:74: ( LET SCORE DOLLARSi varName )
                    {
                    // etc/XQFT.g:409:74: ( LET SCORE DOLLARSi varName )
                    // etc/XQFT.g:409:75: LET SCORE DOLLARSi varName
                    {
                    match(input,LET,FOLLOW_LET_in_letClause5651); if (failed) return ;
                    match(input,SCORE,FOLLOW_SCORE_in_letClause5653); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause5655); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause5657);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,ASSIGNMENTOPERATOR,FOLLOW_ASSIGNMENTOPERATOR_in_letClause5661); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_letClause5663);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:409:134: ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMASi) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // etc/XQFT.g:409:135: COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause5666); if (failed) return ;
            	    // etc/XQFT.g:409:143: ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==DOLLARSi) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==SCORE) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("409:143: ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar )", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // etc/XQFT.g:409:144: ( DOLLARSi varName ( typeDeclaration )? )
            	            {
            	            // etc/XQFT.g:409:144: ( DOLLARSi varName ( typeDeclaration )? )
            	            // etc/XQFT.g:409:145: DOLLARSi varName ( typeDeclaration )?
            	            {
            	            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause5670); if (failed) return ;
            	            pushFollow(FOLLOW_varName_in_letClause5672);
            	            varName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:409:162: ( typeDeclaration )?
            	            int alt39=2;
            	            int LA39_0 = input.LA(1);

            	            if ( (LA39_0==AS) ) {
            	                alt39=1;
            	            }
            	            switch (alt39) {
            	                case 1 :
            	                    // etc/XQFT.g:409:162: typeDeclaration
            	                    {
            	                    pushFollow(FOLLOW_typeDeclaration_in_letClause5674);
            	                    typeDeclaration();
            	                    _fsp--;
            	                    if (failed) return ;

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:409:182: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_letClause5680);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,ASSIGNMENTOPERATOR,FOLLOW_ASSIGNMENTOPERATOR_in_letClause5683); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_letClause5685);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // etc/XQFT.g:411:1: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:411:29: ( WHERE exprSingle )
            // etc/XQFT.g:411:31: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause5711); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause5713);
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
    // etc/XQFT.g:413:1: orderByClause : ( ( ORDER BY ) | ( STABLE ORDER BY ) ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:413:29: ( ( ( ORDER BY ) | ( STABLE ORDER BY ) ) orderSpecList )
            // etc/XQFT.g:413:31: ( ( ORDER BY ) | ( STABLE ORDER BY ) ) orderSpecList
            {
            // etc/XQFT.g:413:31: ( ( ORDER BY ) | ( STABLE ORDER BY ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER) ) {
                alt42=1;
            }
            else if ( (LA42_0==STABLE) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("413:31: ( ( ORDER BY ) | ( STABLE ORDER BY ) )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:413:32: ( ORDER BY )
                    {
                    // etc/XQFT.g:413:32: ( ORDER BY )
                    // etc/XQFT.g:413:33: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause5737); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause5739); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:413:45: ( STABLE ORDER BY )
                    {
                    // etc/XQFT.g:413:45: ( STABLE ORDER BY )
                    // etc/XQFT.g:413:46: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause5745); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause5747); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause5749); if (failed) return ;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause5753);
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
    // etc/XQFT.g:415:1: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:415:29: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:415:31: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList5775);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:415:41: ( COMMASi orderSpec )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMASi) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // etc/XQFT.g:415:42: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList5778); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList5780);
            	    orderSpec();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // etc/XQFT.g:417:1: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:417:29: ( exprSingle orderModifier )
            // etc/XQFT.g:417:31: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec5808);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec5810);
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
    // etc/XQFT.g:419:1: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:419:29: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:419:31: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:419:31: ( ASCENDING | DESCENDING )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ASCENDING||LA44_0==DESCENDING) ) {
                alt44=1;
            }
            switch (alt44) {
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier5832);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:419:57: ( EMPTY ( GREATEST | LEAST ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==EMPTY) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:419:58: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier5842); if (failed) return ;
                    if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier5844);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:419:85: ( COLLATION uriLiteral )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COLLATION) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // etc/XQFT.g:419:86: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier5855); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier5857);
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
    // etc/XQFT.g:421:1: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:421:29: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:421:31: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( input.LA(1)==EVERY||input.LA(1)==SOME ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr5880);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr5888); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr5890);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:421:63: ( typeDeclaration )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==AS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // etc/XQFT.g:421:63: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr5892);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr5895); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr5897);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:421:94: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMASi) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // etc/XQFT.g:421:95: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr5900); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr5902); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr5904);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:421:120: ( typeDeclaration )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==AS) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // etc/XQFT.g:421:120: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr5906);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr5909); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr5911);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr5915); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr5917);
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
    // etc/XQFT.g:423:1: typeswitchExpr : TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:423:29: ( TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:423:31: TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr5938); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_typeswitchExpr5940); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr5942);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_typeswitchExpr5944); if (failed) return ;
            // etc/XQFT.g:423:84: ( caseClause )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==CASE) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // etc/XQFT.g:423:84: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr5946);
            	    caseClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr5949); if (failed) return ;
            // etc/XQFT.g:423:104: ( DOLLARSi varName )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==DOLLARSi) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // etc/XQFT.g:423:105: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr5952); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr5954);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr5958); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr5960);
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
    // etc/XQFT.g:425:1: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:425:29: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:425:31: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause5985); if (failed) return ;
            // etc/XQFT.g:425:36: ( DOLLARSi varName AS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==DOLLARSi) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // etc/XQFT.g:425:37: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause5988); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause5990);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause5992); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause5996);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause5998); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause6000);
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
    // etc/XQFT.g:427:1: ifExpr : IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:427:29: ( IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:427:31: IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr6029); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ifExpr6031); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr6033);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ifExpr6035); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr6037); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr6039);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr6041); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr6043);
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
    // etc/XQFT.g:429:1: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:429:29: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:429:31: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr6072);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:429:39: ( OR andExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==OR) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // etc/XQFT.g:429:41: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr6076); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr6078);
            	    andExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // etc/XQFT.g:431:1: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:431:29: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:431:31: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr6109);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:431:46: ( AND comparisonExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AND) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // etc/XQFT.g:431:48: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr6113); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr6115);
            	    comparisonExpr();
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
    // $ANTLR end andExpr


    // $ANTLR start comparisonExpr
    // etc/XQFT.g:433:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:433:29: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:433:31: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr6139);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:433:46: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=BIGGERTHANSi && LA56_0<=LESSTHANOREQUALSi)||(LA56_0>=EQUALSi && LA56_0<=NOTEQUALSi)||LA56_0==LESSTHANSi||(LA56_0>=EQ && LA56_0<=NODEAFTERSi)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // etc/XQFT.g:433:48: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:433:48: ( valueComp | generalComp | nodeComp )
                    int alt55=3;
                    switch ( input.LA(1) ) {
                    case EQ:
                    case NE:
                    case LT:
                    case LE:
                    case GT:
                    case GE:
                        {
                        alt55=1;
                        }
                        break;
                    case BIGGERTHANSi:
                    case BIGGERTHANOREQUALSi:
                    case LESSTHANOREQUALSi:
                    case EQUALSi:
                    case NOTEQUALSi:
                    case LESSTHANSi:
                        {
                        alt55=2;
                        }
                        break;
                    case IS:
                    case NODEBEFORESi:
                    case NODEAFTERSi:
                        {
                        alt55=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("433:48: ( valueComp | generalComp | nodeComp )", 55, 0, input);

                        throw nvae;
                    }

                    switch (alt55) {
                        case 1 :
                            // etc/XQFT.g:433:49: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr6144);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:433:61: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr6148);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:433:75: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr6152);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr6155);
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
    // etc/XQFT.g:435:1: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:435:29: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:435:31: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr6179);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:435:41: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==FTCONTAINS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:435:43: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr6183); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr6185);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:435:66: ( ftIgnoreOption )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==WITHOUT) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // etc/XQFT.g:435:66: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr6187);
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
    // etc/XQFT.g:437:1: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:437:29: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:437:31: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr6217);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:437:44: ( TO additiveExpr )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==TO) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // etc/XQFT.g:437:46: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr6221); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr6223);
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
    // etc/XQFT.g:439:1: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:439:29: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:439:31: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr6249);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:439:50: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==MINUSSi||LA60_0==PLUSSi) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // etc/XQFT.g:439:52: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( input.LA(1)==MINUSSi||input.LA(1)==PLUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr6253);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr6261);
            	    multiplicativeExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // etc/XQFT.g:441:1: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:441:29: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:441:31: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr6281);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:441:41: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==IDIV||LA61_0==DIV||LA61_0==STARSi||LA61_0==MOD) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // etc/XQFT.g:441:43: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==IDIV||input.LA(1)==DIV||input.LA(1)==STARSi||input.LA(1)==MOD ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr6285);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr6301);
            	    unionExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // etc/XQFT.g:443:1: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:443:29: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:443:31: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr6330);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:443:51: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==PIPESi||LA62_0==UNION) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // etc/XQFT.g:443:53: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( input.LA(1)==PIPESi||input.LA(1)==UNION ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr6334);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr6342);
            	    intersectExceptExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // etc/XQFT.g:445:1: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:445:29: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:445:31: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr6361);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:445:46: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==EXCEPT||LA63_0==INTERSECT) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // etc/XQFT.g:445:48: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( input.LA(1)==EXCEPT||input.LA(1)==INTERSECT ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr6365);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr6373);
            	    instanceofExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // etc/XQFT.g:447:1: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:447:29: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:447:31: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr6397);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:447:41: ( INSTANCE OF sequenceType )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==INSTANCE) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // etc/XQFT.g:447:43: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr6401); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr6403); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr6405);
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
    // etc/XQFT.g:449:1: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:449:29: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:449:31: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr6434);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:449:44: ( TREAT AS sequenceType )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==TREAT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // etc/XQFT.g:449:46: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr6438); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr6440); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr6442);
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
    // etc/XQFT.g:451:1: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:451:29: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:451:31: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr6468);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:451:40: ( CASTABLE AS singleType )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==CASTABLE) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // etc/XQFT.g:451:42: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr6472); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr6474); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr6476);
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
    // etc/XQFT.g:453:1: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:453:29: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:453:31: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr6506);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:453:41: ( CAST AS singleType )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==CAST) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // etc/XQFT.g:453:43: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr6510); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr6512); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr6514);
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
    // etc/XQFT.g:455:1: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:455:29: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:455:31: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:455:31: ( MINUSSi | PLUSSi )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==MINUSSi||LA68_0==PLUSSi) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // etc/XQFT.g:
            	    {
            	    if ( input.LA(1)==MINUSSi||input.LA(1)==PLUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr6543);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr6552);
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


    // $ANTLR start valueExpr
    // etc/XQFT.g:457:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:457:29: ( validateExpr | pathExpr | extensionExpr )
            int alt69=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                alt69=1;
                }
                break;
            case DOLLARSi:
            case ORDERED:
            case DOCUMENTNODE:
            case LESSTHANSi:
            case SLASH:
            case PROCESSING_INSTRUCTION:
            case DOCUMENT:
            case SCHEMAATTRIBUTE:
            case DOUBLESLASH:
            case STARSi:
            case LEFTXMLCOMMENT:
            case TEXT:
            case UNORDERED:
            case LEFTPITARGET:
            case COMMENT:
            case ELEMENT:
            case LEFTPARENTHESISSi:
            case ATSi:
            case ATTRIBUTE:
            case NODE:
            case SCHEMAELEMENT:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOT:
            case DOTDOT:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
            case NCName:
                {
                alt69=2;
                }
                break;
            case LEFTPRAGMA:
                {
                alt69=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("457:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:457:31: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr6578);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:457:46: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr6582);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:457:57: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr6586);
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


    // $ANTLR start generalComp
    // etc/XQFT.g:459:1: generalComp : ( EQUALSi | NOTEQUALSi | LESSTHANSi | LESSTHANOREQUALSi | BIGGERTHANSi | BIGGERTHANOREQUALSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:459:29: ( EQUALSi | NOTEQUALSi | LESSTHANSi | LESSTHANOREQUALSi | BIGGERTHANSi | BIGGERTHANOREQUALSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=BIGGERTHANSi && input.LA(1)<=LESSTHANOREQUALSi)||(input.LA(1)>=EQUALSi && input.LA(1)<=NOTEQUALSi)||input.LA(1)==LESSTHANSi ) {
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


    // $ANTLR start valueComp
    // etc/XQFT.g:461:1: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:461:29: ( EQ | NE | LT | LE | GT | GE )
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


    // $ANTLR start nodeComp
    // etc/XQFT.g:463:1: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:463:29: ( IS | NODEBEFORESi | NODEAFTERSi )
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


    // $ANTLR start validateExpr
    // etc/XQFT.g:465:1: validateExpr : VALIDATE ( validationMode )? LEFTBRACESi expr RIGHTBRACESi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:465:29: ( VALIDATE ( validationMode )? LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:465:31: VALIDATE ( validationMode )? LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr6734); if (failed) return ;
            // etc/XQFT.g:465:40: ( validationMode )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=LAX && LA70_0<=STRICT)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // etc/XQFT.g:465:40: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr6736);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_validateExpr6739); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr6741);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_validateExpr6743); if (failed) return ;

            }

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
    // etc/XQFT.g:467:1: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:467:29: ( LAX | STRICT )
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


    // $ANTLR start extensionExpr
    // etc/XQFT.g:469:1: extensionExpr : ( pragma )+ LEFTBRACESi ( expr )? RIGHTBRACESi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:469:29: ( ( pragma )+ LEFTBRACESi ( expr )? RIGHTBRACESi )
            // etc/XQFT.g:469:31: ( pragma )+ LEFTBRACESi ( expr )? RIGHTBRACESi
            {
            // etc/XQFT.g:469:31: ( pragma )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==LEFTPRAGMA) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // etc/XQFT.g:469:31: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr6790);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_extensionExpr6793); if (failed) return ;
            // etc/XQFT.g:469:51: ( expr )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==TYPESWITCH||LA72_0==DOLLARSi||(LA72_0>=LEFTPRAGMA && LA72_0<=DOCUMENTNODE)||LA72_0==LESSTHANSi||LA72_0==SLASH||LA72_0==EVERY||LA72_0==FOR||LA72_0==PROCESSING_INSTRUCTION||LA72_0==MINUSSi||LA72_0==DOCUMENT||LA72_0==VALIDATE||LA72_0==LET||LA72_0==PLUSSi||LA72_0==SCHEMAATTRIBUTE||LA72_0==DOUBLESLASH||LA72_0==IF||LA72_0==STARSi||LA72_0==LEFTXMLCOMMENT||LA72_0==TEXT||LA72_0==UNORDERED||LA72_0==LEFTPITARGET||LA72_0==COMMENT||(LA72_0>=ELEMENT && LA72_0<=LEFTPARENTHESISSi)||LA72_0==ATSi||LA72_0==ATTRIBUTE||(LA72_0>=NODE && LA72_0<=SOME)||LA72_0==SCHEMAELEMENT||LA72_0==CHILD||(LA72_0>=DESCENDANT && LA72_0<=DOTDOT)||(LA72_0>=IntegerLiteral && LA72_0<=DoubleLiteral)||LA72_0==StringLiteral||LA72_0==NCName) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // etc/XQFT.g:469:51: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr6795);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_extensionExpr6798); if (failed) return ;

            }

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


    // $ANTLR start pragma
    // etc/XQFT.g:471:1: pragma : LEFTPRAGMA ( S )? qName ( S pragmaContents )? RIGHTPRAGMA ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:471:29: ( LEFTPRAGMA ( S )? qName ( S pragmaContents )? RIGHTPRAGMA )
            // etc/XQFT.g:471:31: LEFTPRAGMA ( S )? qName ( S pragmaContents )? RIGHTPRAGMA
            {
            match(input,LEFTPRAGMA,FOLLOW_LEFTPRAGMA_in_pragma6827); if (failed) return ;
            // etc/XQFT.g:471:42: ( S )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==S) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // etc/XQFT.g:471:42: S
                    {
                    match(input,S,FOLLOW_S_in_pragma6829); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_qName_in_pragma6832);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:471:51: ( S pragmaContents )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==S) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // etc/XQFT.g:471:52: S pragmaContents
                    {
                    match(input,S,FOLLOW_S_in_pragma6835); if (failed) return ;
                    pushFollow(FOLLOW_pragmaContents_in_pragma6837);
                    pragmaContents();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPRAGMA,FOLLOW_RIGHTPRAGMA_in_pragma6841); if (failed) return ;

            }

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
    // etc/XQFT.g:476:1: pragmaContents : m= ZeroOrMoreChar {...}?;
    public final void pragmaContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:476:23: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:476:25: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_pragmaContents6863); if (failed) return ;
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


    // $ANTLR start pathExpr
    // etc/XQFT.g:479:1: pathExpr : ( ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr | ( SLASH relativePathExpr )=> SLASH relativePathExpr | SLASH | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:479:29: ( ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr | ( SLASH relativePathExpr )=> SLASH relativePathExpr | SLASH | relativePathExpr )
            int alt75=4;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // etc/XQFT.g:479:31: ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr
                    {
                    match(input,DOUBLESLASH,FOLLOW_DOUBLESLASH_in_pathExpr6902); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6904);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:480:11: ( SLASH relativePathExpr )=> SLASH relativePathExpr
                    {
                    match(input,SLASH,FOLLOW_SLASH_in_pathExpr6925); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6927);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:481:11: SLASH
                    {
                    match(input,SLASH,FOLLOW_SLASH_in_pathExpr6939); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:482:11: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6951);
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
    // etc/XQFT.g:484:1: relativePathExpr : stepExpr ( ( SLASH | DOUBLESLASH ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:484:29: ( stepExpr ( ( SLASH | DOUBLESLASH ) stepExpr )* )
            // etc/XQFT.g:484:31: stepExpr ( ( SLASH | DOUBLESLASH ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr6970);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:484:40: ( ( SLASH | DOUBLESLASH ) stepExpr )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==SLASH||LA76_0==DOUBLESLASH) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // etc/XQFT.g:484:41: ( SLASH | DOUBLESLASH ) stepExpr
            	    {
            	    if ( input.LA(1)==SLASH||input.LA(1)==DOUBLESLASH ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr6973);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr6981);
            	    stepExpr();
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
    // $ANTLR end relativePathExpr


    // $ANTLR start stepExpr
    // etc/XQFT.g:486:1: stepExpr : ( filterExpr | axisStep );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:486:29: ( filterExpr | axisStep )
            int alt77=2;
            switch ( input.LA(1) ) {
            case DOLLARSi:
            case ORDERED:
            case LESSTHANSi:
            case DOCUMENT:
            case LEFTXMLCOMMENT:
            case UNORDERED:
            case LEFTPITARGET:
            case LEFTPARENTHESISSi:
            case DOT:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
                {
                alt77=1;
                }
                break;
            case NCName:
                {
                switch ( input.LA(2) ) {
                case COLONSi:
                    {
                    int LA77_9 = input.LA(3);

                    if ( (LA77_9==STARSi) ) {
                        alt77=2;
                    }
                    else if ( (LA77_9==NCName) ) {
                        int LA77_10 = input.LA(4);

                        if ( (LA77_10==LEFTPARENTHESISSi) ) {
                            alt77=1;
                        }
                        else if ( (LA77_10==EOF||(LA77_10>=PIPESi && LA77_10<=WHERE)||(LA77_10>=EQUALSi && LA77_10<=NOTEQUALSi)||LA77_10==CAST||(LA77_10>=ELSE && LA77_10<=TREAT)||LA77_10==SLASH||LA77_10==CASTABLE||(LA77_10>=FOR && LA77_10<=INSTANCE)||(LA77_10>=EXCEPT && LA77_10<=TO)||LA77_10==SATISFIES||LA77_10==SEMICOLONSi||LA77_10==EMPTY||LA77_10==CASE||LA77_10==MINUSSi||(LA77_10>=COMMASi && LA77_10<=LET)||LA77_10==RIGHTBRACKETSi||LA77_10==LEVELS||(LA77_10>=DIV && LA77_10<=PLUSSi)||LA77_10==ORDER||LA77_10==UNION||LA77_10==COLLATION||LA77_10==OR||LA77_10==DOUBLESLASH||(LA77_10>=DESCENDING && LA77_10<=STARSi)||(LA77_10>=STABLE && LA77_10<=LEFTBRACKETSi)||LA77_10==WITHOUT||LA77_10==RIGHTPARENTHESISSi||LA77_10==RETURN||LA77_10==DEFAULT||LA77_10==AND||LA77_10==INTERSECT||LA77_10==TIMES||LA77_10==FTCONTAINS||(LA77_10>=MOD && LA77_10<=RIGHTBRACESi)||(LA77_10>=EQ && LA77_10<=NODEAFTERSi)||(LA77_10>=WORDS && LA77_10<=PARAGRAPHS)) ) {
                            alt77=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case LEFTPARENTHESISSi:
                    {
                    alt77=1;
                    }
                    break;
                case EOF:
                case PIPESi:
                case BIGGERTHANSi:
                case BIGGERTHANOREQUALSi:
                case LESSTHANOREQUALSi:
                case ASCENDING:
                case IDIV:
                case WHERE:
                case EQUALSi:
                case NOTEQUALSi:
                case CAST:
                case ELSE:
                case LESSTHANSi:
                case TREAT:
                case SLASH:
                case CASTABLE:
                case FOR:
                case INSTANCE:
                case EXCEPT:
                case TO:
                case SATISFIES:
                case SEMICOLONSi:
                case EMPTY:
                case CASE:
                case MINUSSi:
                case COMMASi:
                case LET:
                case RIGHTBRACKETSi:
                case LEVELS:
                case DIV:
                case PLUSSi:
                case ORDER:
                case UNION:
                case COLLATION:
                case OR:
                case DOUBLESLASH:
                case DESCENDING:
                case STARSi:
                case STABLE:
                case LEFTBRACKETSi:
                case WITHOUT:
                case RIGHTPARENTHESISSi:
                case RETURN:
                case DEFAULT:
                case AND:
                case INTERSECT:
                case TIMES:
                case FTCONTAINS:
                case MOD:
                case RIGHTBRACESi:
                case EQ:
                case NE:
                case LT:
                case LE:
                case GT:
                case GE:
                case IS:
                case NODEBEFORESi:
                case NODEAFTERSi:
                case WORDS:
                case SENTENCES:
                case PARAGRAPHS:
                    {
                    alt77=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 2, input);

                    throw nvae;
                }

                }
                break;
            case ELEMENT:
                {
                int LA77_3 = input.LA(2);

                if ( (LA77_3==LEFTPARENTHESISSi) ) {
                    alt77=2;
                }
                else if ( (LA77_3==LEFTBRACESi||LA77_3==NCName) ) {
                    alt77=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 3, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA77_4 = input.LA(2);

                if ( (LA77_4==LEFTPARENTHESISSi||LA77_4==DOUBLECOLON) ) {
                    alt77=2;
                }
                else if ( (LA77_4==LEFTBRACESi||LA77_4==NCName) ) {
                    alt77=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 4, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA77_5 = input.LA(2);

                if ( (LA77_5==LEFTBRACESi) ) {
                    alt77=1;
                }
                else if ( (LA77_5==LEFTPARENTHESISSi) ) {
                    alt77=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 5, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA77_6 = input.LA(2);

                if ( (LA77_6==LEFTBRACESi) ) {
                    alt77=1;
                }
                else if ( (LA77_6==LEFTPARENTHESISSi) ) {
                    alt77=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 6, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA77_7 = input.LA(2);

                if ( (LA77_7==LEFTPARENTHESISSi) ) {
                    alt77=2;
                }
                else if ( (LA77_7==LEFTBRACESi||LA77_7==NCName) ) {
                    alt77=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 7, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENTNODE:
            case SCHEMAATTRIBUTE:
            case STARSi:
            case ATSi:
            case NODE:
            case SCHEMAELEMENT:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOTDOT:
                {
                alt77=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:486:31: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7010);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:486:44: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7014);
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
    // etc/XQFT.g:488:1: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:488:29: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:488:31: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:488:31: ( reverseStep | forwardStep )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=PARENT && LA78_0<=ANCESTOR_OR_SELF)||LA78_0==DOTDOT) ) {
                alt78=1;
            }
            else if ( (LA78_0==DOCUMENTNODE||LA78_0==PROCESSING_INSTRUCTION||LA78_0==SCHEMAATTRIBUTE||LA78_0==STARSi||LA78_0==TEXT||LA78_0==COMMENT||LA78_0==ELEMENT||LA78_0==ATSi||LA78_0==ATTRIBUTE||LA78_0==NODE||LA78_0==SCHEMAELEMENT||LA78_0==CHILD||(LA78_0>=DESCENDANT && LA78_0<=FOLLOWING)||LA78_0==NCName) ) {
                alt78=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("488:31: ( reverseStep | forwardStep )", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:488:32: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7042);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:488:46: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7046);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7049);
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


    // $ANTLR start forwardStep
    // etc/XQFT.g:490:1: forwardStep : ( ( forwardAxis nodeTest ) | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:490:29: ( ( forwardAxis nodeTest ) | abbrevForwardStep )
            int alt79=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==DOUBLECOLON) ) {
                    alt79=1;
                }
                else if ( (LA79_1==LEFTPARENTHESISSi) ) {
                    alt79=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("490:1: forwardStep : ( ( forwardAxis nodeTest ) | abbrevForwardStep );", 79, 1, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENTNODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case STARSi:
            case TEXT:
            case COMMENT:
            case ELEMENT:
            case ATSi:
            case NODE:
            case SCHEMAELEMENT:
            case NCName:
                {
                alt79=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
                {
                alt79=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("490:1: forwardStep : ( ( forwardAxis nodeTest ) | abbrevForwardStep );", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // etc/XQFT.g:490:31: ( forwardAxis nodeTest )
                    {
                    // etc/XQFT.g:490:31: ( forwardAxis nodeTest )
                    // etc/XQFT.g:490:32: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep7074);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep7076);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:490:56: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep7081);
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
    // etc/XQFT.g:493:1: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DOUBLECOLON ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:493:29: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DOUBLECOLON )
            // etc/XQFT.g:493:31: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DOUBLECOLON
            {
            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==CHILD||(input.LA(1)>=DESCENDANT && input.LA(1)<=FOLLOWING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis7106);    throw mse;
            }

            match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_forwardAxis7154); if (failed) return ;

            }

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
    // etc/XQFT.g:506:1: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:506:29: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:506:31: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:506:31: ( ATSi )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==ATSi) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:506:31: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep7175); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep7178);
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


    // $ANTLR start reverseStep
    // etc/XQFT.g:508:1: reverseStep : ( ( reverseAxis nodeTest ) | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:508:29: ( ( reverseAxis nodeTest ) | abbrevReverseStep )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=PARENT && LA81_0<=ANCESTOR_OR_SELF)) ) {
                alt81=1;
            }
            else if ( (LA81_0==DOTDOT) ) {
                alt81=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("508:1: reverseStep : ( ( reverseAxis nodeTest ) | abbrevReverseStep );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // etc/XQFT.g:508:31: ( reverseAxis nodeTest )
                    {
                    // etc/XQFT.g:508:31: ( reverseAxis nodeTest )
                    // etc/XQFT.g:508:32: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7203);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7205);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:508:56: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7210);
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
    // etc/XQFT.g:510:1: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DOUBLECOLON ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:510:29: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DOUBLECOLON )
            // etc/XQFT.g:510:31: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DOUBLECOLON
            {
            if ( (input.LA(1)>=PARENT && input.LA(1)<=ANCESTOR_OR_SELF) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis7234);    throw mse;
            }

            match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_reverseAxis7272); if (failed) return ;

            }

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


    // $ANTLR start abbrevReverseStep
    // etc/XQFT.g:521:1: abbrevReverseStep : DOTDOT ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:521:29: ( DOTDOT )
            // etc/XQFT.g:521:31: DOTDOT
            {
            match(input,DOTDOT,FOLLOW_DOTDOT_in_abbrevReverseStep7292); if (failed) return ;

            }

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


    // $ANTLR start nodeTest
    // etc/XQFT.g:523:1: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:523:29: ( kindTest | nameTest )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==DOCUMENTNODE||LA82_0==PROCESSING_INSTRUCTION||LA82_0==SCHEMAATTRIBUTE||LA82_0==TEXT||LA82_0==COMMENT||LA82_0==ELEMENT||LA82_0==ATTRIBUTE||LA82_0==NODE||LA82_0==SCHEMAELEMENT) ) {
                alt82=1;
            }
            else if ( (LA82_0==STARSi||LA82_0==NCName) ) {
                alt82=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("523:1: nodeTest : ( kindTest | nameTest );", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:523:31: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest7319);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:523:42: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest7323);
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
    // etc/XQFT.g:525:1: nameTest : ( qName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:525:29: ( qName | wildcard )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==NCName) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==COLONSi) ) {
                    int LA83_3 = input.LA(3);

                    if ( (LA83_3==STARSi) ) {
                        alt83=2;
                    }
                    else if ( (LA83_3==NCName) ) {
                        alt83=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("525:1: nameTest : ( qName | wildcard );", 83, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA83_1==EOF||(LA83_1>=PIPESi && LA83_1<=WHERE)||(LA83_1>=EQUALSi && LA83_1<=NOTEQUALSi)||LA83_1==CAST||(LA83_1>=ELSE && LA83_1<=TREAT)||LA83_1==SLASH||LA83_1==CASTABLE||(LA83_1>=FOR && LA83_1<=INSTANCE)||(LA83_1>=EXCEPT && LA83_1<=TO)||LA83_1==SATISFIES||LA83_1==SEMICOLONSi||LA83_1==EMPTY||LA83_1==CASE||LA83_1==MINUSSi||(LA83_1>=COMMASi && LA83_1<=LET)||LA83_1==RIGHTBRACKETSi||LA83_1==LEVELS||(LA83_1>=DIV && LA83_1<=PLUSSi)||LA83_1==ORDER||LA83_1==UNION||LA83_1==COLLATION||LA83_1==OR||LA83_1==DOUBLESLASH||(LA83_1>=DESCENDING && LA83_1<=STARSi)||(LA83_1>=STABLE && LA83_1<=LEFTBRACKETSi)||LA83_1==WITHOUT||LA83_1==RIGHTPARENTHESISSi||LA83_1==RETURN||LA83_1==DEFAULT||LA83_1==AND||LA83_1==INTERSECT||LA83_1==TIMES||LA83_1==FTCONTAINS||(LA83_1>=MOD && LA83_1<=RIGHTBRACESi)||(LA83_1>=EQ && LA83_1<=NODEAFTERSi)||(LA83_1>=WORDS && LA83_1<=PARAGRAPHS)) ) {
                    alt83=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("525:1: nameTest : ( qName | wildcard );", 83, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA83_0==STARSi) ) {
                alt83=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("525:1: nameTest : ( qName | wildcard );", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // etc/XQFT.g:525:31: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest7350);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:525:39: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest7354);
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
    // etc/XQFT.g:529:1: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:529:29: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) )
            int alt84=3;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==STARSi) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==COLONSi) && (synpred3())) {
                    alt84=1;
                }
                else if ( (LA84_1==EOF||(LA84_1>=PIPESi && LA84_1<=WHERE)||(LA84_1>=EQUALSi && LA84_1<=NOTEQUALSi)||LA84_1==CAST||(LA84_1>=ELSE && LA84_1<=TREAT)||LA84_1==SLASH||LA84_1==CASTABLE||(LA84_1>=FOR && LA84_1<=INSTANCE)||(LA84_1>=EXCEPT && LA84_1<=TO)||LA84_1==SATISFIES||LA84_1==SEMICOLONSi||LA84_1==EMPTY||LA84_1==CASE||LA84_1==MINUSSi||(LA84_1>=COMMASi && LA84_1<=LET)||LA84_1==RIGHTBRACKETSi||LA84_1==LEVELS||(LA84_1>=DIV && LA84_1<=PLUSSi)||LA84_1==ORDER||LA84_1==UNION||LA84_1==COLLATION||LA84_1==OR||LA84_1==DOUBLESLASH||(LA84_1>=DESCENDING && LA84_1<=STARSi)||(LA84_1>=STABLE && LA84_1<=LEFTBRACKETSi)||LA84_1==WITHOUT||LA84_1==RIGHTPARENTHESISSi||LA84_1==RETURN||LA84_1==DEFAULT||LA84_1==AND||LA84_1==INTERSECT||LA84_1==TIMES||LA84_1==FTCONTAINS||(LA84_1>=MOD && LA84_1<=RIGHTBRACESi)||(LA84_1>=EQ && LA84_1<=NODEAFTERSi)||(LA84_1>=WORDS && LA84_1<=PARAGRAPHS)) ) {
                    alt84=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("529:1: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) );", 84, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA84_0==NCName) ) {
                alt84=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("529:1: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) );", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // etc/XQFT.g:529:31: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7394); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7396); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard7398); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:530:10: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7409); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:531:35: ( NCName COLONSi STARSi )
                    {
                    // etc/XQFT.g:531:35: ( NCName COLONSi STARSi )
                    // etc/XQFT.g:531:36: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard7446); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7448); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7450); if (failed) return ;

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
    // $ANTLR end wildcard


    // $ANTLR start filterExpr
    // etc/XQFT.g:534:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:534:29: ( primaryExpr predicateList )
            // etc/XQFT.g:534:31: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr7479);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr7481);
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


    // $ANTLR start predicateList
    // etc/XQFT.g:536:1: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:536:29: ( ( predicate )* )
            // etc/XQFT.g:536:31: ( predicate )*
            {
            // etc/XQFT.g:536:31: ( predicate )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==LEFTBRACKETSi) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // etc/XQFT.g:536:31: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList7503);
            	    predicate();
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
    // $ANTLR end predicateList


    // $ANTLR start predicate
    // etc/XQFT.g:538:1: predicate : LEFTBRACKETSi expr RIGHTBRACKETSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:538:29: ( LEFTBRACKETSi expr RIGHTBRACKETSi )
            // etc/XQFT.g:538:31: LEFTBRACKETSi expr RIGHTBRACKETSi
            {
            match(input,LEFTBRACKETSi,FOLLOW_LEFTBRACKETSi_in_predicate7530); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate7532);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACKETSi,FOLLOW_RIGHTBRACKETSi_in_predicate7534); if (failed) return ;

            }

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


    // $ANTLR start primaryExpr
    // etc/XQFT.g:540:1: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:540:29: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
            int alt86=8;
            switch ( input.LA(1) ) {
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
                {
                alt86=1;
                }
                break;
            case DOLLARSi:
                {
                alt86=2;
                }
                break;
            case LEFTPARENTHESISSi:
                {
                alt86=3;
                }
                break;
            case DOT:
                {
                alt86=4;
                }
                break;
            case NCName:
                {
                alt86=5;
                }
                break;
            case ORDERED:
                {
                alt86=6;
                }
                break;
            case UNORDERED:
                {
                alt86=7;
                }
                break;
            case LESSTHANSi:
            case PROCESSING_INSTRUCTION:
            case DOCUMENT:
            case LEFTXMLCOMMENT:
            case TEXT:
            case LEFTPITARGET:
            case COMMENT:
            case ELEMENT:
            case ATTRIBUTE:
                {
                alt86=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("540:1: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:540:31: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr7558);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:540:41: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr7562);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:540:50: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr7566);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:540:70: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr7570);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:540:88: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr7574);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:540:103: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr7578);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:540:117: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr7582);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:540:133: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr7586);
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


    // $ANTLR start literal
    // etc/XQFT.g:542:1: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:542:29: ( numericLiteral | StringLiteral )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=IntegerLiteral && LA87_0<=DoubleLiteral)) ) {
                alt87=1;
            }
            else if ( (LA87_0==StringLiteral) ) {
                alt87=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("542:1: literal : ( numericLiteral | StringLiteral );", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // etc/XQFT.g:542:31: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal7614);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:542:48: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal7618); if (failed) return ;

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
    // etc/XQFT.g:544:1: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:544:29: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
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


    // $ANTLR start varRef
    // etc/XQFT.g:546:1: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:546:29: ( DOLLARSi varName )
            // etc/XQFT.g:546:31: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef7676); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef7678);
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


    // $ANTLR start varName
    // etc/XQFT.g:548:1: varName : qName ;
    public final void varName() throws RecognitionException {
        try {
            // etc/XQFT.g:548:29: ( qName )
            // etc/XQFT.g:548:31: qName
            {
            pushFollow(FOLLOW_qName_in_varName7706);
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


    // $ANTLR start parenthesizedExpr
    // etc/XQFT.g:550:1: parenthesizedExpr : LEFTPARENTHESISSi ( expr )? RIGHTPARENTHESISSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:550:29: ( LEFTPARENTHESISSi ( expr )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:550:31: LEFTPARENTHESISSi ( expr )? RIGHTPARENTHESISSi
            {
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_parenthesizedExpr7724); if (failed) return ;
            // etc/XQFT.g:550:49: ( expr )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==TYPESWITCH||LA88_0==DOLLARSi||(LA88_0>=LEFTPRAGMA && LA88_0<=DOCUMENTNODE)||LA88_0==LESSTHANSi||LA88_0==SLASH||LA88_0==EVERY||LA88_0==FOR||LA88_0==PROCESSING_INSTRUCTION||LA88_0==MINUSSi||LA88_0==DOCUMENT||LA88_0==VALIDATE||LA88_0==LET||LA88_0==PLUSSi||LA88_0==SCHEMAATTRIBUTE||LA88_0==DOUBLESLASH||LA88_0==IF||LA88_0==STARSi||LA88_0==LEFTXMLCOMMENT||LA88_0==TEXT||LA88_0==UNORDERED||LA88_0==LEFTPITARGET||LA88_0==COMMENT||(LA88_0>=ELEMENT && LA88_0<=LEFTPARENTHESISSi)||LA88_0==ATSi||LA88_0==ATTRIBUTE||(LA88_0>=NODE && LA88_0<=SOME)||LA88_0==SCHEMAELEMENT||LA88_0==CHILD||(LA88_0>=DESCENDANT && LA88_0<=DOTDOT)||(LA88_0>=IntegerLiteral && LA88_0<=DoubleLiteral)||LA88_0==StringLiteral||LA88_0==NCName) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // etc/XQFT.g:550:49: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr7726);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_parenthesizedExpr7729); if (failed) return ;

            }

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
    // etc/XQFT.g:552:1: contextItemExpr : DOT ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:552:29: ( DOT )
            // etc/XQFT.g:552:31: DOT
            {
            match(input,DOT,FOLLOW_DOT_in_contextItemExpr7749); if (failed) return ;

            }

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


    // $ANTLR start orderedExpr
    // etc/XQFT.g:554:1: orderedExpr : ORDERED LEFTBRACESi expr RIGHTBRACESi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:554:29: ( ORDERED LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:554:31: ORDERED LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr7773); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_orderedExpr7775); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr7777);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_orderedExpr7779); if (failed) return ;

            }

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
    // etc/XQFT.g:556:1: unorderedExpr : UNORDERED LEFTBRACESi expr RIGHTBRACESi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:556:29: ( UNORDERED LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:556:31: UNORDERED LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr7801); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_unorderedExpr7803); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr7805);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_unorderedExpr7807); if (failed) return ;

            }

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


    // $ANTLR start functionCall
    // etc/XQFT.g:558:1: functionCall : qName LEFTPARENTHESISSi ( exprSingle ( COMMASi exprSingle )* )? RIGHTPARENTHESISSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:558:29: ( qName LEFTPARENTHESISSi ( exprSingle ( COMMASi exprSingle )* )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:558:31: qName LEFTPARENTHESISSi ( exprSingle ( COMMASi exprSingle )* )? RIGHTPARENTHESISSi
            {
            pushFollow(FOLLOW_qName_in_functionCall7830);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_functionCall7832); if (failed) return ;
            // etc/XQFT.g:558:55: ( exprSingle ( COMMASi exprSingle )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==TYPESWITCH||LA90_0==DOLLARSi||(LA90_0>=LEFTPRAGMA && LA90_0<=DOCUMENTNODE)||LA90_0==LESSTHANSi||LA90_0==SLASH||LA90_0==EVERY||LA90_0==FOR||LA90_0==PROCESSING_INSTRUCTION||LA90_0==MINUSSi||LA90_0==DOCUMENT||LA90_0==VALIDATE||LA90_0==LET||LA90_0==PLUSSi||LA90_0==SCHEMAATTRIBUTE||LA90_0==DOUBLESLASH||LA90_0==IF||LA90_0==STARSi||LA90_0==LEFTXMLCOMMENT||LA90_0==TEXT||LA90_0==UNORDERED||LA90_0==LEFTPITARGET||LA90_0==COMMENT||(LA90_0>=ELEMENT && LA90_0<=LEFTPARENTHESISSi)||LA90_0==ATSi||LA90_0==ATTRIBUTE||(LA90_0>=NODE && LA90_0<=SOME)||LA90_0==SCHEMAELEMENT||LA90_0==CHILD||(LA90_0>=DESCENDANT && LA90_0<=DOTDOT)||(LA90_0>=IntegerLiteral && LA90_0<=DoubleLiteral)||LA90_0==StringLiteral||LA90_0==NCName) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // etc/XQFT.g:558:56: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall7835);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:558:67: ( COMMASi exprSingle )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==COMMASi) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // etc/XQFT.g:558:68: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall7838); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall7840);
                    	    exprSingle();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_functionCall7846); if (failed) return ;

            }

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


    // $ANTLR start constructor
    // etc/XQFT.g:561:1: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:561:29: ( directConstructor | computedConstructor )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LESSTHANSi||LA91_0==LEFTXMLCOMMENT||LA91_0==LEFTPITARGET) ) {
                alt91=1;
            }
            else if ( (LA91_0==PROCESSING_INSTRUCTION||LA91_0==DOCUMENT||LA91_0==TEXT||LA91_0==COMMENT||LA91_0==ELEMENT||LA91_0==ATTRIBUTE) ) {
                alt91=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("561:1: constructor : ( directConstructor | computedConstructor );", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:561:31: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor7954);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:562:35: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor7990);
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
    // etc/XQFT.g:564:1: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:564:29: ( dirElemConstructor | dirCommentConstructor | dirPIConstructor )
            int alt92=3;
            switch ( input.LA(1) ) {
            case LESSTHANSi:
                {
                alt92=1;
                }
                break;
            case LEFTXMLCOMMENT:
                {
                alt92=2;
                }
                break;
            case LEFTPITARGET:
                {
                alt92=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("564:1: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:564:31: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor8008);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:565:35: dirCommentConstructor
                    {
                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor8044);
                    dirCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:566:35: dirPIConstructor
                    {
                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor8080);
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
    // etc/XQFT.g:568:1: dirElemConstructor : LESSTHANSi qName dirAttributeList ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi ) ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:568:29: ( LESSTHANSi qName dirAttributeList ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi ) ) )
            // etc/XQFT.g:568:31: LESSTHANSi qName dirAttributeList ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi ) )
            {
            match(input,LESSTHANSi,FOLLOW_LESSTHANSi_in_dirElemConstructor8097); if (failed) return ;
            pushFollow(FOLLOW_qName_in_dirElemConstructor8099);
            qName();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor8101);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:568:65: ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RIGHTSELFTERMINATOR) ) {
                alt95=1;
            }
            else if ( (LA95_0==BIGGERTHANSi) ) {
                alt95=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("568:65: ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi ) )", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // etc/XQFT.g:568:66: RIGHTSELFTERMINATOR
                    {
                    match(input,RIGHTSELFTERMINATOR,FOLLOW_RIGHTSELFTERMINATOR_in_dirElemConstructor8104); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:568:88: ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi )
                    {
                    // etc/XQFT.g:568:88: ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi )
                    // etc/XQFT.g:568:89: BIGGERTHANSi ( dirElemContent )* LEFTENDTAG qName ( S )? BIGGERTHANSi
                    {
                    match(input,BIGGERTHANSi,FOLLOW_BIGGERTHANSi_in_dirElemConstructor8109); if (failed) return ;
                    // etc/XQFT.g:568:102: ( dirElemContent )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==LEFTBRACESi||LA93_0==LESSTHANSi||LA93_0==LEFTCDATA||LA93_0==DOUBLERIGHTBRACES||LA93_0==LEFTXMLCOMMENT||LA93_0==LEFTPITARGET||LA93_0==DOUBLELEFTBRACES||(LA93_0>=PredefinedEntityRef && LA93_0<=CharRef)||LA93_0==ElementContentChar) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // etc/XQFT.g:568:102: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor8111);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    match(input,LEFTENDTAG,FOLLOW_LEFTENDTAG_in_dirElemConstructor8114); if (failed) return ;
                    pushFollow(FOLLOW_qName_in_dirElemConstructor8116);
                    qName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:568:135: ( S )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==S) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // etc/XQFT.g:568:135: S
                            {
                            match(input,S,FOLLOW_S_in_dirElemConstructor8118); if (failed) return ;

                            }
                            break;

                    }

                    match(input,BIGGERTHANSi,FOLLOW_BIGGERTHANSi_in_dirElemConstructor8121); if (failed) return ;

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
    // etc/XQFT.g:570:1: dirAttributeList : ( S ( qName ( S )? EQUALSi ( S )? dirAttributeValue )? )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:570:29: ( ( S ( qName ( S )? EQUALSi ( S )? dirAttributeValue )? )* )
            // etc/XQFT.g:570:31: ( S ( qName ( S )? EQUALSi ( S )? dirAttributeValue )? )*
            {
            // etc/XQFT.g:570:31: ( S ( qName ( S )? EQUALSi ( S )? dirAttributeValue )? )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==S) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // etc/XQFT.g:570:32: S ( qName ( S )? EQUALSi ( S )? dirAttributeValue )?
            	    {
            	    match(input,S,FOLLOW_S_in_dirAttributeList8145); if (failed) return ;
            	    // etc/XQFT.g:570:34: ( qName ( S )? EQUALSi ( S )? dirAttributeValue )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==NCName) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // etc/XQFT.g:570:35: qName ( S )? EQUALSi ( S )? dirAttributeValue
            	            {
            	            pushFollow(FOLLOW_qName_in_dirAttributeList8148);
            	            qName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:570:41: ( S )?
            	            int alt96=2;
            	            int LA96_0 = input.LA(1);

            	            if ( (LA96_0==S) ) {
            	                alt96=1;
            	            }
            	            switch (alt96) {
            	                case 1 :
            	                    // etc/XQFT.g:570:41: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList8150); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            match(input,EQUALSi,FOLLOW_EQUALSi_in_dirAttributeList8153); if (failed) return ;
            	            // etc/XQFT.g:570:52: ( S )?
            	            int alt97=2;
            	            int LA97_0 = input.LA(1);

            	            if ( (LA97_0==S) ) {
            	                alt97=1;
            	            }
            	            switch (alt97) {
            	                case 1 :
            	                    // etc/XQFT.g:570:52: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList8155); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList8158);
            	            dirAttributeValue();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
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
    // etc/XQFT.g:572:1: dirAttributeValue : ( ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE ) );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:572:29: ( ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==DOUBLEQUOTESi) ) {
                alt102=1;
            }
            else if ( (LA102_0==SINGLEQUOTE) ) {
                alt102=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("572:1: dirAttributeValue : ( ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE ) );", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:572:31: ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi )
                    {
                    // etc/XQFT.g:572:31: ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi )
                    // etc/XQFT.g:572:32: DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi
                    {
                    match(input,DOUBLEQUOTESi,FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8183); if (failed) return ;
                    // etc/XQFT.g:572:46: ( EscapeQuot | quotAttrValueContent )*
                    loop100:
                    do {
                        int alt100=3;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==EscapeQuot) ) {
                            alt100=1;
                        }
                        else if ( (LA100_0==LEFTBRACESi||LA100_0==DOUBLERIGHTBRACES||LA100_0==DOUBLELEFTBRACES||(LA100_0>=PredefinedEntityRef && LA100_0<=CharRef)||LA100_0==QuotAttrContentChar) ) {
                            alt100=2;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // etc/XQFT.g:572:47: EscapeQuot
                    	    {
                    	    match(input,EscapeQuot,FOLLOW_EscapeQuot_in_dirAttributeValue8186); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:572:60: quotAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_quotAttrValueContent_in_dirAttributeValue8190);
                    	    quotAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    match(input,DOUBLEQUOTESi,FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8194); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:573:35: ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE )
                    {
                    // etc/XQFT.g:573:35: ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE )
                    // etc/XQFT.g:573:36: SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE
                    {
                    match(input,SINGLEQUOTE,FOLLOW_SINGLEQUOTE_in_dirAttributeValue8232); if (failed) return ;
                    // etc/XQFT.g:573:48: ( EscapeApos | aposAttrValueContent )*
                    loop101:
                    do {
                        int alt101=3;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==EscapeApos) ) {
                            alt101=1;
                        }
                        else if ( (LA101_0==LEFTBRACESi||LA101_0==DOUBLERIGHTBRACES||LA101_0==DOUBLELEFTBRACES||(LA101_0>=PredefinedEntityRef && LA101_0<=CharRef)||LA101_0==AposAttrContentChar) ) {
                            alt101=2;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // etc/XQFT.g:573:49: EscapeApos
                    	    {
                    	    match(input,EscapeApos,FOLLOW_EscapeApos_in_dirAttributeValue8235); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:573:62: aposAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_aposAttrValueContent_in_dirAttributeValue8239);
                    	    aposAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    match(input,SINGLEQUOTE,FOLLOW_SINGLEQUOTE_in_dirAttributeValue8243); if (failed) return ;

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


    // $ANTLR start quotAttrValueContent
    // etc/XQFT.g:575:1: quotAttrValueContent : ( QuotAttrContentChar | commonContent );
    public final void quotAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:575:26: ( QuotAttrContentChar | commonContent )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==QuotAttrContentChar) ) {
                alt103=1;
            }
            else if ( (LA103_0==LEFTBRACESi||LA103_0==DOUBLERIGHTBRACES||LA103_0==DOUBLELEFTBRACES||(LA103_0>=PredefinedEntityRef && LA103_0<=CharRef)) ) {
                alt103=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("575:1: quotAttrValueContent : ( QuotAttrContentChar | commonContent );", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:575:28: QuotAttrContentChar
                    {
                    match(input,QuotAttrContentChar,FOLLOW_QuotAttrContentChar_in_quotAttrValueContent8258); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:576:35: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_quotAttrValueContent8294);
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


    // $ANTLR start aposAttrValueContent
    // etc/XQFT.g:578:1: aposAttrValueContent : ( AposAttrContentChar | commonContent );
    public final void aposAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:578:29: ( AposAttrContentChar | commonContent )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==AposAttrContentChar) ) {
                alt104=1;
            }
            else if ( (LA104_0==LEFTBRACESi||LA104_0==DOUBLERIGHTBRACES||LA104_0==DOUBLELEFTBRACES||(LA104_0>=PredefinedEntityRef && LA104_0<=CharRef)) ) {
                alt104=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("578:1: aposAttrValueContent : ( AposAttrContentChar | commonContent );", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // etc/XQFT.g:578:31: AposAttrContentChar
                    {
                    match(input,AposAttrContentChar,FOLLOW_AposAttrContentChar_in_aposAttrValueContent8309); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:579:35: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_aposAttrValueContent8345);
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
    // etc/XQFT.g:581:1: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:581:29: ( directConstructor | cDataSection | commonContent | ElementContentChar )
            int alt105=4;
            switch ( input.LA(1) ) {
            case LESSTHANSi:
            case LEFTXMLCOMMENT:
            case LEFTPITARGET:
                {
                alt105=1;
                }
                break;
            case LEFTCDATA:
                {
                alt105=2;
                }
                break;
            case LEFTBRACESi:
            case DOUBLERIGHTBRACES:
            case DOUBLELEFTBRACES:
            case PredefinedEntityRef:
            case CharRef:
                {
                alt105=3;
                }
                break;
            case ElementContentChar:
                {
                alt105=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("581:1: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // etc/XQFT.g:581:31: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent8366);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:582:35: cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent8402);
                    cDataSection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:583:35: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_dirElemContent8438);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:584:35: ElementContentChar
                    {
                    match(input,ElementContentChar,FOLLOW_ElementContentChar_in_dirElemContent8474); if (failed) return ;

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


    // $ANTLR start commonContent
    // etc/XQFT.g:586:1: commonContent : ( PredefinedEntityRef | CharRef | DOUBLELEFTBRACES | DOUBLERIGHTBRACES | enclosedExpr );
    public final void commonContent() throws RecognitionException {
        try {
            // etc/XQFT.g:586:29: ( PredefinedEntityRef | CharRef | DOUBLELEFTBRACES | DOUBLERIGHTBRACES | enclosedExpr )
            int alt106=5;
            switch ( input.LA(1) ) {
            case PredefinedEntityRef:
                {
                alt106=1;
                }
                break;
            case CharRef:
                {
                alt106=2;
                }
                break;
            case DOUBLELEFTBRACES:
                {
                alt106=3;
                }
                break;
            case DOUBLERIGHTBRACES:
                {
                alt106=4;
                }
                break;
            case LEFTBRACESi:
                {
                alt106=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("586:1: commonContent : ( PredefinedEntityRef | CharRef | DOUBLELEFTBRACES | DOUBLERIGHTBRACES | enclosedExpr );", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // etc/XQFT.g:586:31: PredefinedEntityRef
                    {
                    match(input,PredefinedEntityRef,FOLLOW_PredefinedEntityRef_in_commonContent8496); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:586:53: CharRef
                    {
                    match(input,CharRef,FOLLOW_CharRef_in_commonContent8500); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:586:63: DOUBLELEFTBRACES
                    {
                    match(input,DOUBLELEFTBRACES,FOLLOW_DOUBLELEFTBRACES_in_commonContent8504); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:586:82: DOUBLERIGHTBRACES
                    {
                    match(input,DOUBLERIGHTBRACES,FOLLOW_DOUBLERIGHTBRACES_in_commonContent8508); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:586:102: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_commonContent8512);
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


    // $ANTLR start dirCommentConstructor
    // etc/XQFT.g:588:1: dirCommentConstructor : LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT ;
    public final void dirCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:588:29: ( LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT )
            // etc/XQFT.g:588:31: LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT
            {
            match(input,LEFTXMLCOMMENT,FOLLOW_LEFTXMLCOMMENT_in_dirCommentConstructor8526); if (failed) return ;
            pushFollow(FOLLOW_dirCommentContents_in_dirCommentConstructor8528);
            dirCommentContents();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTXMLCOMMENT,FOLLOW_RIGHTXMLCOMMENT_in_dirCommentConstructor8530); if (failed) return ;

            }

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


    // $ANTLR start dirCommentContents
    // etc/XQFT.g:594:1: dirCommentContents : ( CharNotMinus | ( MINUSSi CharNotMinus ) )* ;
    public final void dirCommentContents() throws RecognitionException {
        try {
            // etc/XQFT.g:594:32: ( ( CharNotMinus | ( MINUSSi CharNotMinus ) )* )
            // etc/XQFT.g:594:34: ( CharNotMinus | ( MINUSSi CharNotMinus ) )*
            {
            // etc/XQFT.g:594:34: ( CharNotMinus | ( MINUSSi CharNotMinus ) )*
            loop107:
            do {
                int alt107=3;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==CharNotMinus) ) {
                    alt107=1;
                }
                else if ( (LA107_0==MINUSSi) ) {
                    alt107=2;
                }


                switch (alt107) {
            	case 1 :
            	    // etc/XQFT.g:594:35: CharNotMinus
            	    {
            	    match(input,CharNotMinus,FOLLOW_CharNotMinus_in_dirCommentContents8557); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:594:50: ( MINUSSi CharNotMinus )
            	    {
            	    // etc/XQFT.g:594:50: ( MINUSSi CharNotMinus )
            	    // etc/XQFT.g:594:51: MINUSSi CharNotMinus
            	    {
            	    match(input,MINUSSi,FOLLOW_MINUSSi_in_dirCommentContents8562); if (failed) return ;
            	    match(input,CharNotMinus,FOLLOW_CharNotMinus_in_dirCommentContents8564); if (failed) return ;

            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
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
    // $ANTLR end dirCommentContents


    // $ANTLR start dirPIConstructor
    // etc/XQFT.g:597:1: dirPIConstructor : LEFTPITARGET piTarget ( S dirPIContents )? RIGHTPITARGET ;
    public final void dirPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:597:29: ( LEFTPITARGET piTarget ( S dirPIContents )? RIGHTPITARGET )
            // etc/XQFT.g:597:31: LEFTPITARGET piTarget ( S dirPIContents )? RIGHTPITARGET
            {
            match(input,LEFTPITARGET,FOLLOW_LEFTPITARGET_in_dirPIConstructor8590); if (failed) return ;
            pushFollow(FOLLOW_piTarget_in_dirPIConstructor8592);
            piTarget();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:597:53: ( S dirPIContents )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==S) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // etc/XQFT.g:597:54: S dirPIContents
                    {
                    match(input,S,FOLLOW_S_in_dirPIConstructor8595); if (failed) return ;
                    pushFollow(FOLLOW_dirPIContents_in_dirPIConstructor8597);
                    dirPIContents();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPITARGET,FOLLOW_RIGHTPITARGET_in_dirPIConstructor8601); if (failed) return ;

            }

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


    // $ANTLR start dirPIContents
    // etc/XQFT.g:603:1: dirPIContents : m= ZeroOrMoreChar {...}?;
    public final void dirPIContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:603:29: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:603:31: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_dirPIContents8631); if (failed) return ;
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


    // $ANTLR start cDataSection
    // etc/XQFT.g:606:1: cDataSection : LEFTCDATA cDataSectionContents RIGHTCDATA ;
    public final void cDataSection() throws RecognitionException {
        try {
            // etc/XQFT.g:606:29: ( LEFTCDATA cDataSectionContents RIGHTCDATA )
            // etc/XQFT.g:606:31: LEFTCDATA cDataSectionContents RIGHTCDATA
            {
            match(input,LEFTCDATA,FOLLOW_LEFTCDATA_in_cDataSection8658); if (failed) return ;
            pushFollow(FOLLOW_cDataSectionContents_in_cDataSection8660);
            cDataSectionContents();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTCDATA,FOLLOW_RIGHTCDATA_in_cDataSection8662); if (failed) return ;

            }

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


    // $ANTLR start cDataSectionContents
    // etc/XQFT.g:613:1: cDataSectionContents : m= ZeroOrMoreChar {...}?;
    public final void cDataSectionContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:613:29: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:613:31: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_cDataSectionContents8686); if (failed) return ;
            if ( !( !m.getText().contains("]]>") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "cDataSectionContents", " !$m.getText().contains(\"]]>\") ");
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
    // $ANTLR end cDataSectionContents


    // $ANTLR start computedConstructor
    // etc/XQFT.g:616:1: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:616:29: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt109=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt109=1;
                }
                break;
            case ELEMENT:
                {
                alt109=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt109=3;
                }
                break;
            case TEXT:
                {
                alt109=4;
                }
                break;
            case COMMENT:
                {
                alt109=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt109=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("616:1: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // etc/XQFT.g:616:31: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor8706);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:617:35: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor8742);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:618:35: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor8778);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:619:35: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor8814);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:620:35: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor8850);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:621:35: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor8886);
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
    // etc/XQFT.g:623:1: compDocConstructor : DOCUMENT LEFTBRACESi expr RIGHTBRACESi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:623:29: ( DOCUMENT LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:623:31: DOCUMENT LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor8903); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compDocConstructor8905); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor8907);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compDocConstructor8909); if (failed) return ;

            }

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
    // etc/XQFT.g:625:1: compElemConstructor : ELEMENT ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( contentExpr )? RIGHTBRACESi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:625:29: ( ELEMENT ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( contentExpr )? RIGHTBRACESi )
            // etc/XQFT.g:625:31: ELEMENT ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( contentExpr )? RIGHTBRACESi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor8925); if (failed) return ;
            // etc/XQFT.g:625:39: ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==NCName) ) {
                alt110=1;
            }
            else if ( (LA110_0==LEFTBRACESi) ) {
                alt110=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("625:39: ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) )", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:625:40: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor8928);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:625:48: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:625:48: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:625:49: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compElemConstructor8933); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor8935);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compElemConstructor8937); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compElemConstructor8941); if (failed) return ;
            // etc/XQFT.g:625:93: ( contentExpr )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==TYPESWITCH||LA111_0==DOLLARSi||(LA111_0>=LEFTPRAGMA && LA111_0<=DOCUMENTNODE)||LA111_0==LESSTHANSi||LA111_0==SLASH||LA111_0==EVERY||LA111_0==FOR||LA111_0==PROCESSING_INSTRUCTION||LA111_0==MINUSSi||LA111_0==DOCUMENT||LA111_0==VALIDATE||LA111_0==LET||LA111_0==PLUSSi||LA111_0==SCHEMAATTRIBUTE||LA111_0==DOUBLESLASH||LA111_0==IF||LA111_0==STARSi||LA111_0==LEFTXMLCOMMENT||LA111_0==TEXT||LA111_0==UNORDERED||LA111_0==LEFTPITARGET||LA111_0==COMMENT||(LA111_0>=ELEMENT && LA111_0<=LEFTPARENTHESISSi)||LA111_0==ATSi||LA111_0==ATTRIBUTE||(LA111_0>=NODE && LA111_0<=SOME)||LA111_0==SCHEMAELEMENT||LA111_0==CHILD||(LA111_0>=DESCENDANT && LA111_0<=DOTDOT)||(LA111_0>=IntegerLiteral && LA111_0<=DoubleLiteral)||LA111_0==StringLiteral||LA111_0==NCName) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:625:93: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor8943);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compElemConstructor8946); if (failed) return ;

            }

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
    // etc/XQFT.g:627:1: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:627:29: ( expr )
            // etc/XQFT.g:627:31: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr8970);
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
    // etc/XQFT.g:629:1: compAttrConstructor : ATTRIBUTE ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:629:29: ( ATTRIBUTE ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi )
            // etc/XQFT.g:629:31: ATTRIBUTE ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor8986); if (failed) return ;
            // etc/XQFT.g:629:41: ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==NCName) ) {
                alt112=1;
            }
            else if ( (LA112_0==LEFTBRACESi) ) {
                alt112=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("629:41: ( qName | ( LEFTBRACESi expr RIGHTBRACESi ) )", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:629:42: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor8989);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:629:50: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:629:50: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:629:51: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compAttrConstructor8994); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor8996);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compAttrConstructor8998); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compAttrConstructor9002); if (failed) return ;
            // etc/XQFT.g:629:95: ( expr )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==TYPESWITCH||LA113_0==DOLLARSi||(LA113_0>=LEFTPRAGMA && LA113_0<=DOCUMENTNODE)||LA113_0==LESSTHANSi||LA113_0==SLASH||LA113_0==EVERY||LA113_0==FOR||LA113_0==PROCESSING_INSTRUCTION||LA113_0==MINUSSi||LA113_0==DOCUMENT||LA113_0==VALIDATE||LA113_0==LET||LA113_0==PLUSSi||LA113_0==SCHEMAATTRIBUTE||LA113_0==DOUBLESLASH||LA113_0==IF||LA113_0==STARSi||LA113_0==LEFTXMLCOMMENT||LA113_0==TEXT||LA113_0==UNORDERED||LA113_0==LEFTPITARGET||LA113_0==COMMENT||(LA113_0>=ELEMENT && LA113_0<=LEFTPARENTHESISSi)||LA113_0==ATSi||LA113_0==ATTRIBUTE||(LA113_0>=NODE && LA113_0<=SOME)||LA113_0==SCHEMAELEMENT||LA113_0==CHILD||(LA113_0>=DESCENDANT && LA113_0<=DOTDOT)||(LA113_0>=IntegerLiteral && LA113_0<=DoubleLiteral)||LA113_0==StringLiteral||LA113_0==NCName) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // etc/XQFT.g:629:95: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9004);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compAttrConstructor9007); if (failed) return ;

            }

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
    // etc/XQFT.g:631:1: compTextConstructor : TEXT LEFTBRACESi expr RIGHTBRACESi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:631:29: ( TEXT LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:631:31: TEXT LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor9023); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compTextConstructor9025); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor9027);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compTextConstructor9029); if (failed) return ;

            }

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
    // etc/XQFT.g:633:1: compCommentConstructor : COMMENT LEFTBRACESi expr RIGHTBRACESi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:633:29: ( COMMENT LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:633:31: COMMENT LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor9042); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compCommentConstructor9044); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor9046);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compCommentConstructor9048); if (failed) return ;

            }

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
    // etc/XQFT.g:635:1: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:635:29: ( PROCESSING_INSTRUCTION ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi )
            // etc/XQFT.g:635:31: PROCESSING_INSTRUCTION ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9066); if (failed) return ;
            // etc/XQFT.g:635:54: ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==NCName) ) {
                alt114=1;
            }
            else if ( (LA114_0==LEFTBRACESi) ) {
                alt114=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("635:54: ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) )", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // etc/XQFT.g:635:55: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor9069); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:635:64: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:635:64: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:635:65: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compPIConstructor9074); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor9076);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compPIConstructor9078); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compPIConstructor9082); if (failed) return ;
            // etc/XQFT.g:635:109: ( expr )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==TYPESWITCH||LA115_0==DOLLARSi||(LA115_0>=LEFTPRAGMA && LA115_0<=DOCUMENTNODE)||LA115_0==LESSTHANSi||LA115_0==SLASH||LA115_0==EVERY||LA115_0==FOR||LA115_0==PROCESSING_INSTRUCTION||LA115_0==MINUSSi||LA115_0==DOCUMENT||LA115_0==VALIDATE||LA115_0==LET||LA115_0==PLUSSi||LA115_0==SCHEMAATTRIBUTE||LA115_0==DOUBLESLASH||LA115_0==IF||LA115_0==STARSi||LA115_0==LEFTXMLCOMMENT||LA115_0==TEXT||LA115_0==UNORDERED||LA115_0==LEFTPITARGET||LA115_0==COMMENT||(LA115_0>=ELEMENT && LA115_0<=LEFTPARENTHESISSi)||LA115_0==ATSi||LA115_0==ATTRIBUTE||(LA115_0>=NODE && LA115_0<=SOME)||LA115_0==SCHEMAELEMENT||LA115_0==CHILD||(LA115_0>=DESCENDANT && LA115_0<=DOTDOT)||(LA115_0>=IntegerLiteral && LA115_0<=DoubleLiteral)||LA115_0==StringLiteral||LA115_0==NCName) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:635:109: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor9084);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compPIConstructor9087); if (failed) return ;

            }

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


    // $ANTLR start singleType
    // etc/XQFT.g:637:1: singleType : atomicType ( QUESTIONMARKSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:637:29: ( atomicType ( QUESTIONMARKSi )? )
            // etc/XQFT.g:637:31: atomicType ( QUESTIONMARKSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType9112);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:637:42: ( QUESTIONMARKSi )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==QUESTIONMARKSi) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // etc/XQFT.g:637:42: QUESTIONMARKSi
                    {
                    match(input,QUESTIONMARKSi,FOLLOW_QUESTIONMARKSi_in_singleType9114); if (failed) return ;

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


    // $ANTLR start typeDeclaration
    // etc/XQFT.g:639:1: typeDeclaration : AS sequenceType ;
    public final void typeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:639:29: ( AS sequenceType )
            // etc/XQFT.g:639:31: AS sequenceType
            {
            match(input,AS,FOLLOW_AS_in_typeDeclaration9135); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration9137);
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


    // $ANTLR start sequenceType
    // etc/XQFT.g:645:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi ) );
    public final void sequenceType() throws RecognitionException {
        try {
            // etc/XQFT.g:645:29: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi ) )
            int alt117=3;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // etc/XQFT.g:645:31: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType9171);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType9173);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:646:10: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType9184);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:647:9: ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:647:9: ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    // etc/XQFT.g:647:10: EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType9195); if (failed) return ;
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_sequenceType9197); if (failed) return ;
                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_sequenceType9199); if (failed) return ;

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
    // $ANTLR end sequenceType


    // $ANTLR start occurrenceIndicator
    // etc/XQFT.g:649:1: occurrenceIndicator : ( QUESTIONMARKSi | STARSi | PLUSSi );
    public final void occurrenceIndicator() throws RecognitionException {
        try {
            // etc/XQFT.g:649:29: ( QUESTIONMARKSi | STARSi | PLUSSi )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==PLUSSi||input.LA(1)==STARSi||input.LA(1)==QUESTIONMARKSi ) {
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


    // $ANTLR start itemType
    // etc/XQFT.g:652:1: itemType : ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType ) ;
    public final void itemType() throws RecognitionException {
        try {
            // etc/XQFT.g:652:29: ( ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType ) )
            // etc/XQFT.g:652:31: ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType )
            {
            // etc/XQFT.g:652:31: ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType )
            int alt118=3;
            switch ( input.LA(1) ) {
            case DOCUMENTNODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case TEXT:
            case COMMENT:
            case ELEMENT:
            case ATTRIBUTE:
            case NODE:
            case SCHEMAELEMENT:
                {
                alt118=1;
                }
                break;
            case ITEM:
                {
                alt118=2;
                }
                break;
            case NCName:
                {
                alt118=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("652:31: ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType )", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // etc/XQFT.g:652:32: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType9255);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:652:43: ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:652:43: ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    // etc/XQFT.g:652:44: ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi
                    {
                    match(input,ITEM,FOLLOW_ITEM_in_itemType9260); if (failed) return ;
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_itemType9262); if (failed) return ;
                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_itemType9264); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:652:89: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType9269);
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


    // $ANTLR start atomicType
    // etc/XQFT.g:654:1: atomicType : qName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:654:29: ( qName )
            // etc/XQFT.g:654:31: qName
            {
            pushFollow(FOLLOW_qName_in_atomicType9295);
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


    // $ANTLR start kindTest
    // etc/XQFT.g:656:1: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final void kindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:656:29: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
            int alt119=9;
            switch ( input.LA(1) ) {
            case DOCUMENTNODE:
                {
                alt119=1;
                }
                break;
            case ELEMENT:
                {
                alt119=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt119=3;
                }
                break;
            case SCHEMAELEMENT:
                {
                alt119=4;
                }
                break;
            case SCHEMAATTRIBUTE:
                {
                alt119=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt119=6;
                }
                break;
            case COMMENT:
                {
                alt119=7;
                }
                break;
            case TEXT:
                {
                alt119=8;
                }
                break;
            case NODE:
                {
                alt119=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("656:1: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:656:31: documentTest
                    {
                    pushFollow(FOLLOW_documentTest_in_kindTest9322);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:657:35: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest9358);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:658:35: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest9394);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:659:35: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest9430);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:660:35: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest9466);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:661:35: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest9502);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:662:35: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest9538);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:663:35: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest9574);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:664:35: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest9610);
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


    // $ANTLR start anyKindTest
    // etc/XQFT.g:666:1: anyKindTest : NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi ;
    public final void anyKindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:666:29: ( NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi )
            // etc/XQFT.g:666:31: NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi
            {
            match(input,NODE,FOLLOW_NODE_in_anyKindTest9634); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_anyKindTest9636); if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_anyKindTest9638); if (failed) return ;

            }

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


    // $ANTLR start documentTest
    // etc/XQFT.g:668:1: documentTest : DOCUMENTNODE LEFTPARENTHESISSi ( elementTest | schemaElementTest )? RIGHTPARENTHESISSi ;
    public final void documentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:668:29: ( DOCUMENTNODE LEFTPARENTHESISSi ( elementTest | schemaElementTest )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:668:31: DOCUMENTNODE LEFTPARENTHESISSi ( elementTest | schemaElementTest )? RIGHTPARENTHESISSi
            {
            match(input,DOCUMENTNODE,FOLLOW_DOCUMENTNODE_in_documentTest9661); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_documentTest9663); if (failed) return ;
            // etc/XQFT.g:668:62: ( elementTest | schemaElementTest )?
            int alt120=3;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==ELEMENT) ) {
                alt120=1;
            }
            else if ( (LA120_0==SCHEMAELEMENT) ) {
                alt120=2;
            }
            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:668:63: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest9666);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:668:77: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest9670);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_documentTest9674); if (failed) return ;

            }

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


    // $ANTLR start textTest
    // etc/XQFT.g:670:1: textTest : TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi ;
    public final void textTest() throws RecognitionException {
        try {
            // etc/XQFT.g:670:29: ( TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi )
            // etc/XQFT.g:670:31: TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_textTest9701); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_textTest9703); if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_textTest9705); if (failed) return ;

            }

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


    // $ANTLR start commentTest
    // etc/XQFT.g:672:1: commentTest : COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi ;
    public final void commentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:672:29: ( COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi )
            // etc/XQFT.g:672:31: COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest9729); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_commentTest9731); if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_commentTest9733); if (failed) return ;

            }

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


    // $ANTLR start piTest
    // etc/XQFT.g:674:1: piTest : PROCESSING_INSTRUCTION LEFTPARENTHESISSi ( NCName | StringLiteral )? RIGHTPARENTHESISSi ;
    public final void piTest() throws RecognitionException {
        try {
            // etc/XQFT.g:674:29: ( PROCESSING_INSTRUCTION LEFTPARENTHESISSi ( NCName | StringLiteral )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:674:31: PROCESSING_INSTRUCTION LEFTPARENTHESISSi ( NCName | StringLiteral )? RIGHTPARENTHESISSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest9762); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_piTest9764); if (failed) return ;
            // etc/XQFT.g:674:72: ( NCName | StringLiteral )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==StringLiteral||LA121_0==NCName) ) {
                alt121=1;
            }
            switch (alt121) {
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest9766);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_piTest9775); if (failed) return ;

            }

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


    // $ANTLR start attributeTest
    // etc/XQFT.g:676:1: attributeTest : ATTRIBUTE LEFTPARENTHESISSi ( attribNameOrWildcard ( COMMASi typeName )? )? RIGHTPARENTHESISSi ;
    public final void attributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:676:29: ( ATTRIBUTE LEFTPARENTHESISSi ( attribNameOrWildcard ( COMMASi typeName )? )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:676:31: ATTRIBUTE LEFTPARENTHESISSi ( attribNameOrWildcard ( COMMASi typeName )? )? RIGHTPARENTHESISSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest9797); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_attributeTest9799); if (failed) return ;
            // etc/XQFT.g:676:59: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==STARSi||LA123_0==NCName) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:676:60: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest9802);
                    attribNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:676:81: ( COMMASi typeName )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==COMMASi) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // etc/XQFT.g:676:82: COMMASi typeName
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest9805); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest9807);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_attributeTest9813); if (failed) return ;

            }

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
    // etc/XQFT.g:678:1: attribNameOrWildcard : ( attributeName | STARSi );
    public final void attribNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:678:29: ( attributeName | STARSi )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==NCName) ) {
                alt124=1;
            }
            else if ( (LA124_0==STARSi) ) {
                alt124=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("678:1: attribNameOrWildcard : ( attributeName | STARSi );", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:678:31: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard9828);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:678:47: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard9832); if (failed) return ;

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


    // $ANTLR start schemaAttributeTest
    // etc/XQFT.g:680:1: schemaAttributeTest : SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi ;
    public final void schemaAttributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:680:29: ( SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi )
            // etc/XQFT.g:680:31: SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi
            {
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest9848); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_schemaAttributeTest9850); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest9852);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_schemaAttributeTest9854); if (failed) return ;

            }

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
    // etc/XQFT.g:682:1: attributeDeclaration : attributeName ;
    public final void attributeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:682:29: ( attributeName )
            // etc/XQFT.g:682:31: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration9869);
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


    // $ANTLR start elementTest
    // etc/XQFT.g:684:1: elementTest : ELEMENT LEFTPARENTHESISSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )? RIGHTPARENTHESISSi ;
    public final void elementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:684:29: ( ELEMENT LEFTPARENTHESISSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:684:31: ELEMENT LEFTPARENTHESISSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )? RIGHTPARENTHESISSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest9893); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_elementTest9895); if (failed) return ;
            // etc/XQFT.g:684:57: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==STARSi||LA127_0==NCName) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:684:58: elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest9898);
                    elementNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:684:80: ( COMMASi typeName ( QUESTIONMARKSi )? )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==COMMASi) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // etc/XQFT.g:684:81: COMMASi typeName ( QUESTIONMARKSi )?
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest9901); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest9903);
                            typeName();
                            _fsp--;
                            if (failed) return ;
                            // etc/XQFT.g:684:98: ( QUESTIONMARKSi )?
                            int alt125=2;
                            int LA125_0 = input.LA(1);

                            if ( (LA125_0==QUESTIONMARKSi) ) {
                                alt125=1;
                            }
                            switch (alt125) {
                                case 1 :
                                    // etc/XQFT.g:684:98: QUESTIONMARKSi
                                    {
                                    match(input,QUESTIONMARKSi,FOLLOW_QUESTIONMARKSi_in_elementTest9905); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_elementTest9912); if (failed) return ;

            }

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
    // etc/XQFT.g:686:1: elementNameOrWildcard : ( elementName | STARSi );
    public final void elementNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:686:29: ( elementName | STARSi )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==NCName) ) {
                alt128=1;
            }
            else if ( (LA128_0==STARSi) ) {
                alt128=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("686:1: elementNameOrWildcard : ( elementName | STARSi );", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // etc/XQFT.g:686:31: elementName
                    {
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard9926);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:686:45: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard9930); if (failed) return ;

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


    // $ANTLR start schemaElementTest
    // etc/XQFT.g:688:1: schemaElementTest : SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi ;
    public final void schemaElementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:688:29: ( SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi )
            // etc/XQFT.g:688:31: SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi
            {
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest9948); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_schemaElementTest9950); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest9952);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_schemaElementTest9954); if (failed) return ;

            }

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
    // etc/XQFT.g:690:1: elementDeclaration : elementName ;
    public final void elementDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:690:29: ( elementName )
            // etc/XQFT.g:690:31: elementName
            {
            pushFollow(FOLLOW_elementName_in_elementDeclaration9971);
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


    // $ANTLR start attributeName
    // etc/XQFT.g:692:1: attributeName : qName ;
    public final void attributeName() throws RecognitionException {
        try {
            // etc/XQFT.g:692:29: ( qName )
            // etc/XQFT.g:692:31: qName
            {
            pushFollow(FOLLOW_qName_in_attributeName9993);
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


    // $ANTLR start elementName
    // etc/XQFT.g:694:1: elementName : qName ;
    public final void elementName() throws RecognitionException {
        try {
            // etc/XQFT.g:694:29: ( qName )
            // etc/XQFT.g:694:31: qName
            {
            pushFollow(FOLLOW_qName_in_elementName10017);
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
    // etc/XQFT.g:696:1: typeName : qName ;
    public final void typeName() throws RecognitionException {
        try {
            // etc/XQFT.g:696:29: ( qName )
            // etc/XQFT.g:696:31: qName
            {
            pushFollow(FOLLOW_qName_in_typeName10044);
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


    // $ANTLR start uriLiteral
    // etc/XQFT.g:698:1: uriLiteral : StringLiteral ;
    public final void uriLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:698:29: ( StringLiteral )
            // etc/XQFT.g:698:31: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral10069); if (failed) return ;

            }

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


    // $ANTLR start ftSelection
    // etc/XQFT.g:700:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:700:29: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:700:31: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection10093);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:700:36: ( ftPosFilter )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==DISTANCE||LA129_0==ORDERED||LA129_0==WINDOW||LA129_0==AT||(LA129_0>=SAME && LA129_0<=DIFFERENT)||LA129_0==ENTIRE) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // etc/XQFT.g:700:36: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection10095);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            // etc/XQFT.g:700:49: ( WEIGHT rangeExpr )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==WEIGHT) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // etc/XQFT.g:700:50: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection10099); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection10101);
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
    // etc/XQFT.g:702:1: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:702:29: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:702:31: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr10134);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:702:37: ( FTOR ftAnd )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==FTOR) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // etc/XQFT.g:702:39: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr10138); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr10140);
            	    ftAnd();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop131;
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
    // etc/XQFT.g:704:1: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:704:29: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:704:31: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd10173);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:704:41: ( FTAND ftMildNot )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==FTAND) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // etc/XQFT.g:704:43: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd10177); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd10179);
            	    ftMildNot();
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
    // $ANTLR end ftAnd


    // $ANTLR start ftMildNot
    // etc/XQFT.g:706:1: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:706:29: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:706:31: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot10208);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:706:42: ( NOT IN ftUnaryNot )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==NOT) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // etc/XQFT.g:706:44: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot10212); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot10214); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot10216);
            	    ftUnaryNot();
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
    // $ANTLR end ftMildNot


    // $ANTLR start ftUnaryNot
    // etc/XQFT.g:708:1: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:708:29: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:708:31: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:708:31: ( FTNOT )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==FTNOT) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:708:32: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot10245); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot10249);
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
    // etc/XQFT.g:710:1: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:710:29: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:710:31: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions10264);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:710:41: ( ftMatchOptions )?
            int alt135=2;
            switch ( input.LA(1) ) {
                case UPPERCASE:
                case LANGUAGE:
                case OPTION:
                case WITH:
                case DIACRITICS:
                case LOWERCASE:
                    {
                    alt135=1;
                    }
                    break;
                case WITHOUT:
                    {
                    int LA135_2 = input.LA(2);

                    if ( (LA135_2==STOP||LA135_2==STEMMING||LA135_2==WILDCARDS||LA135_2==THESAURUS) ) {
                        alt135=1;
                    }
                    }
                    break;
                case CASE:
                    {
                    int LA135_3 = input.LA(2);

                    if ( (LA135_3==INSENSITIVE||LA135_3==SENSITIVE) ) {
                        alt135=1;
                    }
                    }
                    break;
            }

            switch (alt135) {
                case 1 :
                    // etc/XQFT.g:710:41: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions10266);
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
    // etc/XQFT.g:712:1: ftPrimary : ( ( ftWords ( ftTimes )? ) | ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi ) | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:712:29: ( ( ftWords ( ftTimes )? ) | ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi ) | ftExtensionSelection )
            int alt137=3;
            switch ( input.LA(1) ) {
            case LEFTBRACESi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
                {
                alt137=1;
                }
                break;
            case LEFTPARENTHESISSi:
                {
                alt137=2;
                }
                break;
            case LEFTPRAGMA:
                {
                alt137=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("712:1: ftPrimary : ( ( ftWords ( ftTimes )? ) | ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi ) | ftExtensionSelection );", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:712:31: ( ftWords ( ftTimes )? )
                    {
                    // etc/XQFT.g:712:31: ( ftWords ( ftTimes )? )
                    // etc/XQFT.g:712:32: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary10294);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:712:40: ( ftTimes )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==OCCURS) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // etc/XQFT.g:712:40: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary10296);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:712:52: ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:712:52: ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi )
                    // etc/XQFT.g:712:53: LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi
                    {
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ftPrimary10303); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary10305);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ftPrimary10307); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:712:105: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary10312);
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
    // etc/XQFT.g:714:1: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:714:29: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:714:31: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords10340);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:714:44: ( ftAnyallOption )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==PHRASE||LA138_0==ANY||LA138_0==ALL) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // etc/XQFT.g:714:44: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords10342);
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
    // etc/XQFT.g:716:1: ftWordsValue : ( literal | ( LEFTBRACESi expr RIGHTBRACESi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:716:29: ( literal | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( ((LA139_0>=IntegerLiteral && LA139_0<=DoubleLiteral)||LA139_0==StringLiteral) ) {
                alt139=1;
            }
            else if ( (LA139_0==LEFTBRACESi) ) {
                alt139=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("716:1: ftWordsValue : ( literal | ( LEFTBRACESi expr RIGHTBRACESi ) );", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // etc/XQFT.g:716:31: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue10366);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:716:41: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:716:41: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:716:42: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_ftWordsValue10371); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue10373);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_ftWordsValue10375); if (failed) return ;

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


    // $ANTLR start ftExtensionSelection
    // etc/XQFT.g:718:1: ftExtensionSelection : ( pragma )+ LEFTBRACESi ( ftSelection )? RIGHTBRACESi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:718:29: ( ( pragma )+ LEFTBRACESi ( ftSelection )? RIGHTBRACESi )
            // etc/XQFT.g:718:31: ( pragma )+ LEFTBRACESi ( ftSelection )? RIGHTBRACESi
            {
            // etc/XQFT.g:718:31: ( pragma )+
            int cnt140=0;
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==LEFTPRAGMA) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // etc/XQFT.g:718:31: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection10391);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt140 >= 1 ) break loop140;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(140, input);
                        throw eee;
                }
                cnt140++;
            } while (true);

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_ftExtensionSelection10394); if (failed) return ;
            // etc/XQFT.g:718:51: ( ftSelection )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==LEFTBRACESi||LA141_0==LEFTPRAGMA||LA141_0==FTNOT||LA141_0==LEFTPARENTHESISSi||(LA141_0>=IntegerLiteral && LA141_0<=DoubleLiteral)||LA141_0==StringLiteral) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // etc/XQFT.g:718:51: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection10396);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_ftExtensionSelection10399); if (failed) return ;

            }

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


    // $ANTLR start ftAnyallOption
    // etc/XQFT.g:720:1: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:720:29: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
            int alt144=3;
            switch ( input.LA(1) ) {
            case ANY:
                {
                alt144=1;
                }
                break;
            case ALL:
                {
                alt144=2;
                }
                break;
            case PHRASE:
                {
                alt144=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("720:1: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 144, 0, input);

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:720:31: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:720:31: ( ANY ( WORD )? )
                    // etc/XQFT.g:720:32: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption10421); if (failed) return ;
                    // etc/XQFT.g:720:36: ( WORD )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==WORD) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // etc/XQFT.g:720:36: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption10423); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:720:45: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:720:45: ( ALL ( WORDS )? )
                    // etc/XQFT.g:720:46: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption10430); if (failed) return ;
                    // etc/XQFT.g:720:50: ( WORDS )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==WORDS) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // etc/XQFT.g:720:50: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption10432); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:720:60: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption10438); if (failed) return ;

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
    // etc/XQFT.g:722:1: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:722:29: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:722:31: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes10466); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes10468);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes10470); if (failed) return ;

            }

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
    // etc/XQFT.g:725:1: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:725:29: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
            int alt145=4;
            switch ( input.LA(1) ) {
            case EXACTLY:
                {
                alt145=1;
                }
                break;
            case AT:
                {
                int LA145_2 = input.LA(2);

                if ( (LA145_2==MOST) ) {
                    alt145=3;
                }
                else if ( (LA145_2==LEAST) ) {
                    alt145=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("725:1: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 145, 2, input);

                    throw nvae;
                }
                }
                break;
            case FROM:
                {
                alt145=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("725:1: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // etc/XQFT.g:725:31: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:725:31: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:725:32: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange10500); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10502);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:726:35: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:726:35: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:726:36: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange10540); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange10542); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10544);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:727:35: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:727:35: ( AT MOST additiveExpr )
                    // etc/XQFT.g:727:36: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange10582); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange10584); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10586);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:728:35: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:728:35: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:728:36: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange10624); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10626);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange10628); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10630);
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


    // $ANTLR start ftPosFilter
    // etc/XQFT.g:730:1: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:730:29: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
            int alt146=5;
            switch ( input.LA(1) ) {
            case ORDERED:
                {
                alt146=1;
                }
                break;
            case WINDOW:
                {
                alt146=2;
                }
                break;
            case DISTANCE:
                {
                alt146=3;
                }
                break;
            case SAME:
            case DIFFERENT:
                {
                alt146=4;
                }
                break;
            case AT:
            case ENTIRE:
                {
                alt146=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("730:1: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 146, 0, input);

                throw nvae;
            }

            switch (alt146) {
                case 1 :
                    // etc/XQFT.g:730:31: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter10655);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:730:41: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter10659);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:730:52: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter10663);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:730:65: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter10667);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:730:75: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter10671);
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
    // etc/XQFT.g:732:1: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:732:29: ( ORDERED )
            // etc/XQFT.g:732:31: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder10699); if (failed) return ;

            }

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
    // etc/XQFT.g:734:1: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:734:29: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:734:31: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow10726); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow10728);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow10730);
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


    // $ANTLR start ftDistance
    // etc/XQFT.g:736:1: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:736:29: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:736:31: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance10755); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance10757);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance10759);
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


    // $ANTLR start ftUnit
    // etc/XQFT.g:738:1: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:738:29: ( WORDS | SENTENCES | PARAGRAPHS )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=WORDS && input.LA(1)<=PARAGRAPHS) ) {
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


    // $ANTLR start ftScope
    // etc/XQFT.g:740:1: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:740:29: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:740:31: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( (input.LA(1)>=SAME && input.LA(1)<=DIFFERENT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope10824);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope10832);
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
    // etc/XQFT.g:742:1: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:742:29: ( SENTENCE | PARAGRAPH )
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
    // etc/XQFT.g:744:1: ftContent : ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:744:29: ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) )
            int alt147=3;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==AT) ) {
                int LA147_1 = input.LA(2);

                if ( (LA147_1==START) ) {
                    alt147=1;
                }
                else if ( (LA147_1==END) ) {
                    alt147=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("744:1: ftContent : ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) );", 147, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA147_0==ENTIRE) ) {
                alt147=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("744:1: ftContent : ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) );", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // etc/XQFT.g:744:31: ( AT START )
                    {
                    // etc/XQFT.g:744:31: ( AT START )
                    // etc/XQFT.g:744:32: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent10889); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent10891); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:744:44: ( AT END )
                    {
                    // etc/XQFT.g:744:44: ( AT END )
                    // etc/XQFT.g:744:45: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent10897); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent10899); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:744:55: ( ENTIRE CONTENT )
                    {
                    // etc/XQFT.g:744:55: ( ENTIRE CONTENT )
                    // etc/XQFT.g:744:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent10905); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent10907); if (failed) return ;

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
    // $ANTLR end ftContent


    // $ANTLR start ftMatchOptions
    // etc/XQFT.g:746:1: ftMatchOptions : ( ftMatchOption )+ ;
    public final void ftMatchOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:746:29: ( ( ftMatchOption )+ )
            // etc/XQFT.g:746:31: ( ftMatchOption )+
            {
            // etc/XQFT.g:746:31: ( ftMatchOption )+
            int cnt148=0;
            loop148:
            do {
                int alt148=2;
                switch ( input.LA(1) ) {
                case WITHOUT:
                    {
                    int LA148_2 = input.LA(2);

                    if ( (LA148_2==STOP||LA148_2==STEMMING||LA148_2==WILDCARDS||LA148_2==THESAURUS) ) {
                        alt148=1;
                    }


                    }
                    break;
                case CASE:
                    {
                    int LA148_3 = input.LA(2);

                    if ( (LA148_3==INSENSITIVE||LA148_3==SENSITIVE) ) {
                        alt148=1;
                    }


                    }
                    break;
                case UPPERCASE:
                case LANGUAGE:
                case OPTION:
                case WITH:
                case DIACRITICS:
                case LOWERCASE:
                    {
                    alt148=1;
                    }
                    break;

                }

                switch (alt148) {
            	case 1 :
            	    // etc/XQFT.g:746:31: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions10929);
            	    ftMatchOption();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt148 >= 1 ) break loop148;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(148, input);
                        throw eee;
                }
                cnt148++;
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


    // $ANTLR start ftMatchOption
    // etc/XQFT.g:748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:748:29: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
            int alt149=8;
            switch ( input.LA(1) ) {
            case LANGUAGE:
                {
                alt149=1;
                }
                break;
            case WITH:
                {
                switch ( input.LA(2) ) {
                case STOP:
                case DEFAULT:
                    {
                    alt149=7;
                    }
                    break;
                case THESAURUS:
                    {
                    alt149=3;
                    }
                    break;
                case STEMMING:
                    {
                    alt149=4;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt149=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 149, 2, input);

                    throw nvae;
                }

                }
                break;
            case WITHOUT:
                {
                switch ( input.LA(2) ) {
                case STOP:
                    {
                    alt149=7;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt149=2;
                    }
                    break;
                case THESAURUS:
                    {
                    alt149=3;
                    }
                    break;
                case STEMMING:
                    {
                    alt149=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 149, 3, input);

                    throw nvae;
                }

                }
                break;
            case UPPERCASE:
            case CASE:
            case LOWERCASE:
                {
                alt149=5;
                }
                break;
            case DIACRITICS:
                {
                alt149=6;
                }
                break;
            case OPTION:
                {
                alt149=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:748:31: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption10958);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:749:35: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption10994);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:750:35: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption11030);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:751:35: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption11066);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:752:35: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption11102);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:753:35: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption11138);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:754:35: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption11174);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:755:35: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption11210);
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


    // $ANTLR start ftCaseOption
    // etc/XQFT.g:757:1: ftCaseOption : ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:757:29: ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE )
            int alt150=4;
            switch ( input.LA(1) ) {
            case CASE:
                {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==INSENSITIVE) ) {
                    alt150=1;
                }
                else if ( (LA150_1==SENSITIVE) ) {
                    alt150=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("757:1: ftCaseOption : ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE );", 150, 1, input);

                    throw nvae;
                }
                }
                break;
            case LOWERCASE:
                {
                alt150=3;
                }
                break;
            case UPPERCASE:
                {
                alt150=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("757:1: ftCaseOption : ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE );", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:757:31: ( CASE INSENSITIVE )
                    {
                    // etc/XQFT.g:757:31: ( CASE INSENSITIVE )
                    // etc/XQFT.g:757:32: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption11234); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption11236); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:758:35: ( CASE SENSITIVE )
                    {
                    // etc/XQFT.g:758:35: ( CASE SENSITIVE )
                    // etc/XQFT.g:758:36: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption11274); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption11276); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:759:35: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption11313); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:760:35: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption11349); if (failed) return ;

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
    // etc/XQFT.g:762:1: ftDiacriticsOption : ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:762:29: ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==DIACRITICS) ) {
                int LA151_1 = input.LA(2);

                if ( (LA151_1==SENSITIVE) ) {
                    alt151=2;
                }
                else if ( (LA151_1==INSENSITIVE) ) {
                    alt151=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("762:1: ftDiacriticsOption : ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) );", 151, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("762:1: ftDiacriticsOption : ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) );", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:762:31: ( DIACRITICS INSENSITIVE )
                    {
                    // etc/XQFT.g:762:31: ( DIACRITICS INSENSITIVE )
                    // etc/XQFT.g:762:32: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption11367); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption11369); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:763:35: ( DIACRITICS SENSITIVE )
                    {
                    // etc/XQFT.g:763:35: ( DIACRITICS SENSITIVE )
                    // etc/XQFT.g:763:36: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption11407); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption11409); if (failed) return ;

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
    // $ANTLR end ftDiacriticsOption


    // $ANTLR start ftStemOption
    // etc/XQFT.g:765:1: ftStemOption : ( ( WITH STEMMING ) | ( WITHOUT STEMMING ) );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:765:29: ( ( WITH STEMMING ) | ( WITHOUT STEMMING ) )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==WITH) ) {
                alt152=1;
            }
            else if ( (LA152_0==WITHOUT) ) {
                alt152=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("765:1: ftStemOption : ( ( WITH STEMMING ) | ( WITHOUT STEMMING ) );", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // etc/XQFT.g:765:31: ( WITH STEMMING )
                    {
                    // etc/XQFT.g:765:31: ( WITH STEMMING )
                    // etc/XQFT.g:765:32: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption11434); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption11436); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:765:49: ( WITHOUT STEMMING )
                    {
                    // etc/XQFT.g:765:49: ( WITHOUT STEMMING )
                    // etc/XQFT.g:765:50: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption11442); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption11444); if (failed) return ;

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
    // $ANTLR end ftStemOption


    // $ANTLR start ftThesaurusOption
    // etc/XQFT.g:767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:767:27: ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) )
            int alt156=3;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==WITH) ) {
                int LA156_1 = input.LA(2);

                if ( (LA156_1==THESAURUS) ) {
                    int LA156_3 = input.LA(3);

                    if ( (LA156_3==LEFTPARENTHESISSi) ) {
                        alt156=2;
                    }
                    else if ( (LA156_3==AT||LA156_3==DEFAULT) ) {
                        alt156=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );", 156, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );", 156, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA156_0==WITHOUT) ) {
                alt156=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // etc/XQFT.g:767:29: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) )
                    {
                    // etc/XQFT.g:767:29: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) )
                    // etc/XQFT.g:767:30: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption11462); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption11464); if (failed) return ;
                    // etc/XQFT.g:767:45: ( ftThesaurusID | DEFAULT )
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==AT) ) {
                        alt153=1;
                    }
                    else if ( (LA153_0==DEFAULT) ) {
                        alt153=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("767:45: ( ftThesaurusID | DEFAULT )", 153, 0, input);

                        throw nvae;
                    }
                    switch (alt153) {
                        case 1 :
                            // etc/XQFT.g:767:46: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption11467);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:767:62: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption11471); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:768:35: ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:768:35: ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi )
                    // etc/XQFT.g:768:36: WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption11510); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption11512); if (failed) return ;
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ftThesaurusOption11514); if (failed) return ;
                    // etc/XQFT.g:768:69: ( ftThesaurusID | DEFAULT )
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==AT) ) {
                        alt154=1;
                    }
                    else if ( (LA154_0==DEFAULT) ) {
                        alt154=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("768:69: ( ftThesaurusID | DEFAULT )", 154, 0, input);

                        throw nvae;
                    }
                    switch (alt154) {
                        case 1 :
                            // etc/XQFT.g:768:70: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption11517);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:768:86: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption11521); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:768:95: ( COMMASi ftThesaurusID )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==COMMASi) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // etc/XQFT.g:768:96: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption11525); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption11527);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ftThesaurusOption11531); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:769:35: ( WITHOUT THESAURUS )
                    {
                    // etc/XQFT.g:769:35: ( WITHOUT THESAURUS )
                    // etc/XQFT.g:769:36: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption11569); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption11571); if (failed) return ;

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
    // $ANTLR end ftThesaurusOption


    // $ANTLR start ftThesaurusID
    // etc/XQFT.g:771:1: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:771:29: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:771:31: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID11594); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID11596);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:771:45: ( RELATIONSHIP StringLiteral )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==RELATIONSHIP) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // etc/XQFT.g:771:46: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID11599); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID11601); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:771:75: ( ftRange LEVELS )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==FROM||LA158_0==EXACTLY) ) {
                alt158=1;
            }
            else if ( (LA158_0==AT) ) {
                int LA158_2 = input.LA(2);

                if ( (LA158_2==MOST||LA158_2==LEAST) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // etc/XQFT.g:771:76: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID11606);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID11608); if (failed) return ;

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


    // $ANTLR start ftStopwordOption
    // etc/XQFT.g:773:1: ftStopwordOption : ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:773:29: ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) )
            int alt161=3;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==WITH) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==STOP) ) {
                    alt161=1;
                }
                else if ( (LA161_1==DEFAULT) ) {
                    alt161=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("773:1: ftStopwordOption : ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) );", 161, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA161_0==WITHOUT) ) {
                alt161=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("773:1: ftStopwordOption : ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) );", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // etc/XQFT.g:773:31: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* )
                    {
                    // etc/XQFT.g:773:31: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* )
                    // etc/XQFT.g:773:32: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption11630); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption11632); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption11634); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption11636);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:773:60: ( ftInclExclStringLiteral )*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==EXCEPT||LA159_0==UNION) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // etc/XQFT.g:773:60: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11638);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop159;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:774:35: ( WITHOUT STOP WORDS )
                    {
                    // etc/XQFT.g:774:35: ( WITHOUT STOP WORDS )
                    // etc/XQFT.g:774:36: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption11677); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption11679); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption11681); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:775:35: ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
                    {
                    // etc/XQFT.g:775:35: ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
                    // etc/XQFT.g:775:36: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption11719); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption11721); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption11723); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption11725); if (failed) return ;
                    // etc/XQFT.g:775:60: ( ftInclExclStringLiteral )*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==EXCEPT||LA160_0==UNION) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // etc/XQFT.g:775:60: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11727);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);


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
    // $ANTLR end ftStopwordOption


    // $ANTLR start ftRefOrList
    // etc/XQFT.g:777:1: ftRefOrList : ( ( AT uriLiteral ) | ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi ) );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:777:29: ( ( AT uriLiteral ) | ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi ) )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==AT) ) {
                alt163=1;
            }
            else if ( (LA163_0==LEFTPARENTHESISSi) ) {
                alt163=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("777:1: ftRefOrList : ( ( AT uriLiteral ) | ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi ) );", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // etc/XQFT.g:777:31: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:777:31: ( AT uriLiteral )
                    // etc/XQFT.g:777:32: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList11754); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList11756);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:778:35: ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:778:35: ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi )
                    // etc/XQFT.g:778:36: LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi
                    {
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ftRefOrList11794); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList11796); if (failed) return ;
                    // etc/XQFT.g:778:68: ( COMMASi StringLiteral )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==COMMASi) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // etc/XQFT.g:778:69: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList11799); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList11801); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);

                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ftRefOrList11805); if (failed) return ;

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
    // $ANTLR end ftRefOrList


    // $ANTLR start ftInclExclStringLiteral
    // etc/XQFT.g:780:1: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:780:29: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:780:31: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral11818);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral11826);
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


    // $ANTLR start ftLanguageOption
    // etc/XQFT.g:781:1: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:781:29: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:781:31: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption11844); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption11846); if (failed) return ;

            }

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
    // etc/XQFT.g:782:1: ftWildCardOption : ( ( WITH WILDCARDS ) | ( WITHOUT WILDCARDS ) );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:782:29: ( ( WITH WILDCARDS ) | ( WITHOUT WILDCARDS ) )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==WITH) ) {
                alt164=1;
            }
            else if ( (LA164_0==WITHOUT) ) {
                alt164=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("782:1: ftWildCardOption : ( ( WITH WILDCARDS ) | ( WITHOUT WILDCARDS ) );", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // etc/XQFT.g:782:31: ( WITH WILDCARDS )
                    {
                    // etc/XQFT.g:782:31: ( WITH WILDCARDS )
                    // etc/XQFT.g:782:32: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption11865); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption11867); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:782:50: ( WITHOUT WILDCARDS )
                    {
                    // etc/XQFT.g:782:50: ( WITHOUT WILDCARDS )
                    // etc/XQFT.g:782:51: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption11873); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption11875); if (failed) return ;

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
    // $ANTLR end ftWildCardOption


    // $ANTLR start ftExtensionOption
    // etc/XQFT.g:783:1: ftExtensionOption : OPTION qName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:783:29: ( OPTION qName StringLiteral )
            // etc/XQFT.g:783:31: OPTION qName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption11893); if (failed) return ;
            pushFollow(FOLLOW_qName_in_ftExtensionOption11895);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption11897); if (failed) return ;

            }

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


    // $ANTLR start ftIgnoreOption
    // etc/XQFT.g:784:1: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:784:29: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:784:31: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption11917); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption11919); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption11921);
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

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:479:31: ( DOUBLESLASH relativePathExpr )
        // etc/XQFT.g:479:32: DOUBLESLASH relativePathExpr
        {
        match(input,DOUBLESLASH,FOLLOW_DOUBLESLASH_in_synpred16896); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred16898);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:480:11: ( SLASH relativePathExpr )
        // etc/XQFT.g:480:12: SLASH relativePathExpr
        {
        match(input,SLASH,FOLLOW_SLASH_in_synpred26918); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred26920);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:529:31: ( STARSi COLONSi NCName )
        // etc/XQFT.g:529:32: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred37385); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred37387); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred37389); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:645:31: ( itemType occurrenceIndicator )
        // etc/XQFT.g:645:32: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred49164);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred49166);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

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


    protected DFA75 dfa75 = new DFA75(this);
    protected DFA117 dfa117 = new DFA117(this);
    static final String DFA75_eotS =
        "\u01a3\uffff";
    static final String DFA75_eofS =
        "\2\uffff\1\36\32\uffff\1\65\1\uffff\1\36\11\uffff\1\36\37\uffff"+
        "\1\36\43\uffff\1\65\1\uffff\1\65\u0133\uffff";
    static final String DFA75_minS =
        "\1\25\1\uffff\1\4\11\uffff\1\25\20\uffff\1\4\1\uffff\1\4\2\uffff"+
        "\1\25\6\uffff\1\4\1\25\3\uffff\1\25\32\uffff\1\4\2\uffff\1\144\3"+
        "\uffff\2\0\1\u00d7\3\0\2\16\1\u00d7\1\74\1\u00d6\6\16\1\u00a6\1"+
        "\0\1\u00a6\1\33\4\177\1\0\3\25\1\4\1\uffff\1\4\31\uffff\1\16\1\25"+
        "\3\0\1\u00d7\3\0\2\16\1\u00d7\1\74\1\u00d6\6\16\1\u00a6\1\0\1\u00a6"+
        "\1\33\4\177\1\0\1\u00d7\1\25\1\0\36\uffff\167\0\2\uffff\1\0\6\uffff"+
        "\1\0\1\uffff\132\0";
    static final String DFA75_maxS =
        "\1\u00d7\1\uffff\1\u00d7\11\uffff\1\u00d7\20\uffff\1\u00d7\1\uffff"+
        "\1\u00da\2\uffff\1\u00d7\6\uffff\2\u00d7\3\uffff\1\u00d7\32\uffff"+
        "\1\u00d7\2\uffff\1\u00d7\3\uffff\2\0\1\u00d7\3\0\2\16\1\u00d7\1"+
        "\u00dc\1\u00d6\1\16\2\u00d7\2\177\1\u00d7\1\u00a6\1\0\1\u00a6\1"+
        "\u00d7\4\177\1\0\4\u00d7\1\uffff\1\u00d7\31\uffff\1\u00a4\1\u00d7"+
        "\3\0\1\u00d7\3\0\2\16\1\u00d7\1\u00dc\1\u00d6\1\16\2\u00d7\2\177"+
        "\1\u00d7\1\u00a6\1\0\1\u00a6\1\u00d7\4\177\1\0\1\u00da\1\u00d7\1"+
        "\0\36\uffff\167\0\2\uffff\1\0\6\uffff\1\0\1\uffff\132\0";
    static final String DFA75_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\10\2\1\uffff\20\2\1\uffff\1\3\1\uffff\2"+
        "\2\1\uffff\6\2\2\uffff\3\2\1\uffff\32\2\1\uffff\2\2\1\uffff\3\2"+
        "\36\uffff\1\2\1\uffff\31\2\40\uffff\36\2\167\uffff\2\2\1\uffff\6"+
        "\2\1\uffff\1\2\132\uffff";
    static final String DFA75_specialS =
        "\1\15\1\uffff\1\14\32\uffff\1\11\1\uffff\1\17\11\uffff\1\21\4\uffff"+
        "\1\6\41\uffff\1\16\1\12\1\uffff\1\25\1\10\1\1\14\uffff\1\7\6\uffff"+
        "\1\23\3\uffff\1\24\1\uffff\1\13\33\uffff\1\3\1\4\1\26\1\uffff\1"+
        "\20\1\22\1\0\14\uffff\1\2\6\uffff\1\5\u00fd\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\3\4\uffff\2\3\1\uffff\1\3\6\uffff\1\2\25\uffff\1\3\3\uffff"+
            "\1\3\26\uffff\1\3\11\uffff\1\1\4\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\5\uffff\2\3\11\uffff"+
            "\1\3\1\uffff\1\3\6\uffff\1\3\5\uffff\1\3\14\uffff\1\3\1\uffff"+
            "\14\3\21\uffff\3\3\4\uffff\1\3\13\uffff\1\3",
            "",
            "\7\36\4\uffff\2\36\4\uffff\1\6\1\uffff\1\36\2\uffff\1\12\1\31"+
            "\1\36\1\14\1\36\11\uffff\1\36\1\uffff\2\36\1\uffff\2\36\3\uffff"+
            "\1\36\1\uffff\1\36\2\uffff\1\36\1\uffff\1\36\1\24\1\uffff\1"+
            "\36\1\uffff\1\17\6\uffff\2\36\5\uffff\1\36\1\uffff\1\36\2\uffff"+
            "\2\36\2\uffff\1\33\1\36\1\uffff\1\36\1\uffff\1\36\2\uffff\1"+
            "\36\5\uffff\1\36\1\35\2\uffff\1\15\1\uffff\1\22\1\36\1\uffff"+
            "\1\13\3\uffff\1\16\1\36\2\uffff\1\36\2\uffff\1\36\1\23\1\36"+
            "\4\uffff\1\20\1\7\3\uffff\1\36\3\uffff\1\36\1\uffff\1\30\1\36"+
            "\1\21\1\uffff\1\36\2\uffff\2\36\1\34\5\uffff\1\32\1\uffff\11"+
            "\36\2\uffff\1\27\1\uffff\5\27\5\25\1\10\1\26\3\36\16\uffff\3"+
            "\4\4\uffff\1\5\13\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\3\uffff\3\36\1\uffff\1\36\6\uffff\1\36\25\uffff\1\36\1"+
            "\uffff\1\36\1\uffff\1\36\1\uffff\1\36\21\uffff\1\36\2\uffff"+
            "\1\36\11\uffff\1\36\4\uffff\1\36\2\uffff\1\36\1\uffff\1\36\2"+
            "\uffff\1\36\3\uffff\1\36\7\uffff\1\36\5\uffff\2\36\11\uffff"+
            "\1\36\1\uffff\1\36\6\uffff\1\36\5\uffff\1\36\14\uffff\1\36\1"+
            "\uffff\14\36\21\uffff\3\36\4\uffff\1\36\13\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\3\112\1\76\1\113\1\70\4\uffff\2\112\4\uffff\1\36\1\uffff"+
            "\1\43\1\uffff\3\36\1\104\1\56\1\45\5\uffff\1\111\3\uffff\1\44"+
            "\1\uffff\1\74\1\46\1\uffff\1\47\1\53\3\uffff\1\101\1\40\1\62"+
            "\2\uffff\1\77\1\uffff\1\103\1\36\1\uffff\1\52\1\uffff\1\36\1"+
            "\uffff\1\36\4\uffff\1\63\1\75\5\uffff\1\67\1\uffff\1\110\2\uffff"+
            "\1\113\1\52\2\uffff\1\36\1\71\1\uffff\1\50\1\uffff\1\100\2\uffff"+
            "\1\61\1\uffff\1\42\3\uffff\1\76\1\51\2\uffff\1\36\1\uffff\1"+
            "\36\1\72\1\41\1\36\3\uffff\1\36\1\105\2\uffff\1\66\2\uffff\1"+
            "\73\1\36\1\102\4\uffff\2\36\3\uffff\1\60\3\uffff\1\47\1\uffff"+
            "\1\36\1\106\1\36\1\uffff\1\54\2\uffff\1\113\1\64\1\36\5\uffff"+
            "\1\36\1\uffff\6\55\3\57\2\uffff\1\36\1\uffff\14\36\3\107\16"+
            "\uffff\3\36\4\uffff\1\36\13\uffff\1\36",
            "",
            "\1\36\1\117\2\uffff\3\36\14\uffff\1\36\4\uffff\1\36\1\uffff"+
            "\1\36\5\uffff\1\36\3\uffff\1\36\1\uffff\2\36\1\uffff\2\36\3"+
            "\uffff\1\36\1\114\1\36\2\uffff\1\36\1\uffff\1\36\2\uffff\1\36"+
            "\1\116\7\uffff\2\36\5\uffff\1\36\4\uffff\2\36\3\uffff\1\36\1"+
            "\uffff\1\36\1\uffff\1\36\2\uffff\1\36\1\uffff\1\36\3\uffff\2"+
            "\36\5\uffff\2\36\10\uffff\1\36\2\uffff\1\36\1\uffff\1\36\5\uffff"+
            "\1\36\3\uffff\1\36\3\uffff\1\36\5\uffff\1\36\2\uffff\2\36\110"+
            "\uffff\1\115",
            "",
            "",
            "\1\122\4\uffff\1\126\1\145\1\uffff\1\130\34\uffff\1\140\3\uffff"+
            "\1\133\26\uffff\1\147\16\uffff\1\151\2\uffff\1\131\1\uffff\1"+
            "\136\2\uffff\1\127\3\uffff\1\132\7\uffff\1\137\5\uffff\1\134"+
            "\1\123\11\uffff\1\144\1\uffff\1\135\6\uffff\1\150\5\uffff\1"+
            "\146\14\uffff\1\143\1\uffff\5\143\5\141\1\124\1\142\21\uffff"+
            "\3\120\4\uffff\1\121\13\uffff\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "\7\36\4\uffff\2\36\4\uffff\1\162\1\uffff\1\36\1\uffff\1\u0088"+
            "\1\166\1\u0084\1\36\1\154\1\36\5\uffff\1\157\3\uffff\1\36\1"+
            "\uffff\2\36\1\uffff\2\36\3\uffff\3\36\2\uffff\1\36\1\uffff\1"+
            "\36\1\177\1\uffff\1\153\1\uffff\1\172\1\uffff\1\156\4\uffff"+
            "\2\36\5\uffff\1\36\1\uffff\1\36\2\uffff\1\36\1\153\2\uffff\1"+
            "\u0086\1\36\1\uffff\1\36\1\uffff\1\36\2\uffff\1\36\1\uffff\1"+
            "\152\3\uffff\1\36\1\155\2\uffff\1\170\1\uffff\1\175\2\36\1\167"+
            "\3\uffff\1\171\1\36\2\uffff\1\36\2\uffff\1\36\1\176\1\36\4\uffff"+
            "\1\173\1\163\3\uffff\1\36\3\uffff\1\36\1\uffff\1\u0083\1\36"+
            "\1\174\1\uffff\1\36\2\uffff\2\36\1\u0087\5\uffff\1\u0085\1\uffff"+
            "\11\36\2\uffff\1\u0082\1\uffff\5\u0082\5\u0080\1\164\1\u0081"+
            "\3\36\16\uffff\3\160\4\uffff\1\161\13\uffff\1\165",
            "\1\u008e\3\uffff\1\u00a6\1\u0092\1\u00a1\1\uffff\1\u0094\6\uffff"+
            "\1\u008b\25\uffff\1\u009c\1\uffff\1\u00a7\1\uffff\1\u0097\1"+
            "\uffff\1\u0089\21\uffff\1\u00a7\2\uffff\1\u00a3\11\uffff\1\u008a"+
            "\4\uffff\1\u00a5\2\uffff\1\u0095\1\uffff\1\u009a\2\uffff\1\u0093"+
            "\3\uffff\1\u0096\7\uffff\1\u009b\5\uffff\1\u0098\1\u008f\11"+
            "\uffff\1\u00a0\1\uffff\1\u0099\6\uffff\1\u00a4\5\uffff\1\u00a2"+
            "\14\uffff\1\u009f\1\uffff\5\u009f\5\u009d\1\u0090\1\u009e\21"+
            "\uffff\3\u008c\4\uffff\1\u008d\13\uffff\1\u0091",
            "",
            "",
            "",
            "\1\u00af\3\uffff\1\u00c6\1\u00b2\1\u00c1\1\uffff\1\u00b4\6\uffff"+
            "\1\u00ac\25\uffff\1\u00bc\1\uffff\1\u00a9\1\uffff\1\u00b7\1"+
            "\uffff\1\u00aa\21\uffff\1\u00a9\2\uffff\1\u00c3\11\uffff\1\u00ab"+
            "\4\uffff\1\u00c5\2\uffff\1\u00b5\1\uffff\1\u00ba\2\uffff\1\u00b3"+
            "\3\uffff\1\u00b6\7\uffff\1\u00bb\5\uffff\1\u00b8\1\u00b0\11"+
            "\uffff\1\u00c0\1\uffff\1\u00b9\6\uffff\1\u00c4\5\uffff\1\u00c2"+
            "\14\uffff\1\u00bf\1\uffff\5\u00bf\5\u00bd\1\u00b1\1\u00be\21"+
            "\uffff\3\u00ad\4\uffff\1\u00ae\13\uffff\1\u00a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\7\36\4\uffff\2\36\4\uffff\1\u00cb\1\uffff\1\36\2\uffff\1\u00cf"+
            "\1\u00dd\1\36\1\u00c7\1\36\11\uffff\1\36\1\uffff\2\36\1\uffff"+
            "\2\36\3\uffff\1\36\1\uffff\1\36\2\uffff\1\36\1\uffff\1\36\1"+
            "\u00d8\1\uffff\1\36\1\uffff\1\u00d3\6\uffff\2\36\5\uffff\1\36"+
            "\1\uffff\1\36\2\uffff\2\36\2\uffff\1\u00df\1\36\1\uffff\1\36"+
            "\1\uffff\1\36\2\uffff\1\36\5\uffff\1\36\1\u00c8\2\uffff\1\u00d1"+
            "\1\uffff\1\u00d6\1\36\1\uffff\1\u00d0\3\uffff\1\u00d2\1\36\2"+
            "\uffff\1\36\2\uffff\1\36\1\u00d7\1\36\4\uffff\1\u00d4\1\u00cc"+
            "\3\uffff\1\36\3\uffff\1\36\1\uffff\1\u00dc\1\36\1\u00d5\1\uffff"+
            "\1\36\2\uffff\2\36\1\u00e0\5\uffff\1\u00de\1\uffff\11\36\2\uffff"+
            "\1\u00db\1\uffff\5\u00db\5\u00d9\1\u00cd\1\u00da\3\36\16\uffff"+
            "\3\u00c9\4\uffff\1\u00ca\13\uffff\1\u00ce",
            "",
            "",
            "\1\36\162\uffff\1\u00e1",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e7\70\uffff\1\u00e8\146\uffff\1\u00e6",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00ed\160\uffff\1\u00eb\127\uffff\1\u00ec",
            "\1\u00f1\160\uffff\1\u00ef\46\uffff\1\u00ee\60\uffff\1\u00f0",
            "\1\u00f3\160\uffff\1\u00f2",
            "\1\u00f5\160\uffff\1\u00f4",
            "\1\u00f8\160\uffff\1\u00f6\127\uffff\1\u00f7",
            "\1\u00f9",
            "\1\uffff",
            "\1\u00ee",
            "\1\145\36\uffff\1\u00fc\32\uffff\1\147\16\uffff\1\151\4\uffff"+
            "\1\u00fe\16\uffff\1\u00fd\5\uffff\1\u00fa\14\uffff\1\u00fb\6"+
            "\uffff\1\150\5\uffff\1\146\76\uffff\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\uffff",
            "\1\u0106\4\uffff\1\u010a\1\u0119\1\uffff\1\u010c\34\uffff\1"+
            "\u0114\3\uffff\1\u010f\26\uffff\1\u011b\16\uffff\1\u011d\2\uffff"+
            "\1\u010d\1\uffff\1\u0112\2\uffff\1\u010b\3\uffff\1\u010e\7\uffff"+
            "\1\u0113\5\uffff\1\u0110\1\u0107\11\uffff\1\u0118\1\uffff\1"+
            "\u0111\6\uffff\1\u011c\5\uffff\1\u011a\14\uffff\1\u0117\1\uffff"+
            "\5\u0117\5\u0115\1\u0108\1\u0116\21\uffff\3\u0104\4\uffff\1"+
            "\u0105\13\uffff\1\u0109",
            "\1\u0123\3\uffff\1\u013b\1\u0127\1\u0136\1\uffff\1\u0129\6\uffff"+
            "\1\u0120\25\uffff\1\u0131\1\uffff\1\u013c\1\uffff\1\u012c\1"+
            "\uffff\1\u011e\21\uffff\1\u013c\2\uffff\1\u0138\11\uffff\1\u011f"+
            "\4\uffff\1\u013a\2\uffff\1\u012a\1\uffff\1\u012f\2\uffff\1\u0128"+
            "\3\uffff\1\u012b\7\uffff\1\u0130\5\uffff\1\u012d\1\u0124\11"+
            "\uffff\1\u0135\1\uffff\1\u012e\6\uffff\1\u0139\5\uffff\1\u0137"+
            "\14\uffff\1\u0134\1\uffff\5\u0134\5\u0132\1\u0125\1\u0133\21"+
            "\uffff\3\u0121\4\uffff\1\u0122\13\uffff\1\u0126",
            "\1\36\3\uffff\3\36\1\uffff\1\36\6\uffff\1\36\25\uffff\1\36\1"+
            "\uffff\1\36\1\uffff\1\36\1\uffff\1\36\21\uffff\1\36\2\uffff"+
            "\1\36\11\uffff\1\36\4\uffff\1\36\2\uffff\1\36\1\uffff\1\36\2"+
            "\uffff\1\36\3\uffff\1\36\7\uffff\1\36\5\uffff\2\36\11\uffff"+
            "\1\36\1\uffff\1\36\6\uffff\1\36\5\uffff\1\36\14\uffff\1\36\1"+
            "\uffff\14\36\21\uffff\3\36\4\uffff\1\36\13\uffff\1\u013d",
            "\1\u0146\3\112\1\76\1\113\1\70\4\uffff\2\112\4\uffff\1\36\1"+
            "\uffff\1\u0141\1\uffff\3\36\1\104\1\56\1\u0143\5\uffff\1\u0147"+
            "\3\uffff\1\u0142\1\uffff\1\74\1\u0144\1\uffff\1\u0145\1\53\3"+
            "\uffff\1\101\1\u013e\1\62\2\uffff\1\77\1\uffff\1\103\1\36\1"+
            "\uffff\1\52\1\uffff\1\36\1\uffff\1\36\4\uffff\1\63\1\75\5\uffff"+
            "\1\67\1\uffff\1\110\2\uffff\1\113\1\52\2\uffff\1\36\1\71\1\uffff"+
            "\1\u0146\1\uffff\1\100\2\uffff\1\61\1\uffff\1\u0140\3\uffff"+
            "\1\76\1\51\2\uffff\1\36\1\uffff\1\36\1\72\1\u013f\1\36\3\uffff"+
            "\1\36\1\105\2\uffff\1\66\2\uffff\1\73\1\36\1\102\4\uffff\2\36"+
            "\3\uffff\1\60\3\uffff\1\u0145\1\uffff\1\36\1\106\1\36\1\uffff"+
            "\1\54\2\uffff\1\113\1\64\1\36\5\uffff\1\36\1\uffff\6\55\3\57"+
            "\2\uffff\1\36\1\uffff\14\36\3\107\16\uffff\3\36\4\uffff\1\36"+
            "\13\uffff\1\36",
            "",
            "\1\u0146\3\112\1\76\1\113\1\70\4\uffff\2\112\4\uffff\1\u014d"+
            "\1\uffff\1\u0141\2\uffff\1\u0151\1\u015f\1\104\1\u0149\1\u0143"+
            "\11\uffff\1\u0142\1\uffff\1\74\1\u0144\1\uffff\1\u0145\1\53"+
            "\3\uffff\1\101\1\uffff\1\62\2\uffff\1\77\1\uffff\1\103\1\u015a"+
            "\1\uffff\1\u0148\1\uffff\1\u0155\6\uffff\1\63\1\75\5\uffff\1"+
            "\67\1\uffff\1\110\2\uffff\1\113\1\u0148\2\uffff\1\u0161\1\71"+
            "\1\uffff\1\u0146\1\uffff\1\100\2\uffff\1\61\5\uffff\1\76\1\u014a"+
            "\2\uffff\1\u0153\1\uffff\1\u0158\1\72\1\uffff\1\u0152\3\uffff"+
            "\1\u0154\1\105\2\uffff\1\66\2\uffff\1\73\1\u0159\1\102\4\uffff"+
            "\1\u0156\1\u014e\3\uffff\1\60\3\uffff\1\u0145\1\uffff\1\u015e"+
            "\1\106\1\u0157\1\uffff\1\54\2\uffff\1\113\1\64\1\u0162\5\uffff"+
            "\1\u0160\1\uffff\6\55\3\57\2\uffff\1\u015d\1\uffff\5\u015d\5"+
            "\u015b\1\u014f\1\u015c\3\107\16\uffff\3\u014b\4\uffff\1\u014c"+
            "\13\uffff\1\u0150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0164\u0094\uffff\2\u0163",
            "\1\u0167\4\uffff\1\u016b\1\u017a\1\uffff\1\u016d\34\uffff\1"+
            "\u0175\3\uffff\1\u0170\26\uffff\1\u017c\16\uffff\1\u017e\2\uffff"+
            "\1\u016e\1\uffff\1\u0173\2\uffff\1\u016c\3\uffff\1\u016f\7\uffff"+
            "\1\u0174\5\uffff\1\u0171\1\u0168\11\uffff\1\u0179\1\uffff\1"+
            "\u0172\6\uffff\1\u017d\5\uffff\1\u017b\14\uffff\1\u0178\1\uffff"+
            "\5\u0178\5\u0176\1\u0169\1\u0177\21\uffff\3\u0165\4\uffff\1"+
            "\u0166\13\uffff\1\u016a",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u017f",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0184\70\uffff\1\u0185\146\uffff\1\u0183",
            "\1\u0186",
            "\1\u0187",
            "\1\u018a\160\uffff\1\u0188\127\uffff\1\u0189",
            "\1\u018e\160\uffff\1\u018b\46\uffff\1\u018c\60\uffff\1\u018d",
            "\1\u0190\160\uffff\1\u018f",
            "\1\u0192\160\uffff\1\u0191",
            "\1\u0195\160\uffff\1\u0193\127\uffff\1\u0194",
            "\1\u0196",
            "\1\uffff",
            "\1\u018c",
            "\1\u00a1\36\uffff\1\u0199\32\uffff\1\u00a3\16\uffff\1\u00a5"+
            "\4\uffff\1\u019b\16\uffff\1\u019a\5\uffff\1\u0197\14\uffff\1"+
            "\u0198\6\uffff\1\u00a4\5\uffff\1\u00a2\76\uffff\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\uffff",
            "\1\u01a2\2\uffff\1\u01a1",
            "\1\u008e\3\uffff\1\u00a6\1\u0092\1\u00a1\1\uffff\1\u0094\6\uffff"+
            "\1\u008b\25\uffff\1\u009c\1\uffff\1\u00a7\1\uffff\1\u0097\1"+
            "\uffff\1\u0089\21\uffff\1\u00a7\2\uffff\1\u00a3\11\uffff\1\u008a"+
            "\4\uffff\1\u00a5\2\uffff\1\u0095\1\uffff\1\u009a\2\uffff\1\u0093"+
            "\3\uffff\1\u0096\7\uffff\1\u009b\5\uffff\1\u0098\1\u008f\11"+
            "\uffff\1\u00a0\1\uffff\1\u0099\6\uffff\1\u00a4\5\uffff\1\u00a2"+
            "\14\uffff\1\u009f\1\uffff\5\u009f\5\u009d\1\u0090\1\u009e\21"+
            "\uffff\3\u008c\4\uffff\1\u008d\13\uffff\1\u0091",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "479:1: pathExpr : ( ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr | ( SLASH relativePathExpr )=> SLASH relativePathExpr | SLASH | relativePathExpr );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_145 = input.LA(1);

                         
                        int index75_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_145);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_85 = input.LA(1);

                         
                        int index75_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 198;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_85);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_158 = input.LA(1);

                         
                        int index75_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_158);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA75_139 = input.LA(1);

                         
                        int index75_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_139);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA75_140 = input.LA(1);

                         
                        int index75_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_140);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA75_165 = input.LA(1);

                         
                        int index75_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_165);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA75_46 = input.LA(1);

                         
                        int index75_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_46==NCName) ) {s = 168;}

                        else if ( (LA75_46==MINUSSi||LA75_46==PLUSSi) && (synpred2())) {s = 169;}

                        else if ( (LA75_46==VALIDATE) && (synpred2())) {s = 170;}

                        else if ( (LA75_46==DOUBLESLASH) && (synpred2())) {s = 171;}

                        else if ( (LA75_46==SLASH) && (synpred2())) {s = 172;}

                        else if ( ((LA75_46>=IntegerLiteral && LA75_46<=DoubleLiteral)) && (synpred2())) {s = 173;}

                        else if ( (LA75_46==StringLiteral) && (synpred2())) {s = 174;}

                        else if ( (LA75_46==DOLLARSi) && (synpred2())) {s = 175;}

                        else if ( (LA75_46==LEFTPARENTHESISSi) && (synpred2())) {s = 176;}

                        else if ( (LA75_46==DOT) && (synpred2())) {s = 177;}

                        else if ( (LA75_46==ORDERED) && (synpred2())) {s = 178;}

                        else if ( (LA75_46==UNORDERED) && (synpred2())) {s = 179;}

                        else if ( (LA75_46==LESSTHANSi) && (synpred2())) {s = 180;}

                        else if ( (LA75_46==LEFTXMLCOMMENT) && (synpred2())) {s = 181;}

                        else if ( (LA75_46==LEFTPITARGET) && (synpred2())) {s = 182;}

                        else if ( (LA75_46==DOCUMENT) && (synpred2())) {s = 183;}

                        else if ( (LA75_46==ELEMENT) && (synpred2())) {s = 184;}

                        else if ( (LA75_46==ATTRIBUTE) && (synpred2())) {s = 185;}

                        else if ( (LA75_46==TEXT) && (synpred2())) {s = 186;}

                        else if ( (LA75_46==COMMENT) && (synpred2())) {s = 187;}

                        else if ( (LA75_46==PROCESSING_INSTRUCTION) && (synpred2())) {s = 188;}

                        else if ( ((LA75_46>=PARENT && LA75_46<=ANCESTOR_OR_SELF)) && (synpred2())) {s = 189;}

                        else if ( (LA75_46==DOTDOT) && (synpred2())) {s = 190;}

                        else if ( (LA75_46==CHILD||(LA75_46>=DESCENDANT && LA75_46<=FOLLOWING)) && (synpred2())) {s = 191;}

                        else if ( (LA75_46==ATSi) && (synpred2())) {s = 192;}

                        else if ( (LA75_46==DOCUMENTNODE) && (synpred2())) {s = 193;}

                        else if ( (LA75_46==SCHEMAELEMENT) && (synpred2())) {s = 194;}

                        else if ( (LA75_46==SCHEMAATTRIBUTE) && (synpred2())) {s = 195;}

                        else if ( (LA75_46==NODE) && (synpred2())) {s = 196;}

                        else if ( (LA75_46==STARSi) && (synpred2())) {s = 197;}

                        else if ( (LA75_46==LEFTPRAGMA) && (synpred2())) {s = 198;}

                         
                        input.seek(index75_46);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA75_98 = input.LA(1);

                         
                        int index75_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 198;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_98);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA75_84 = input.LA(1);

                         
                        int index75_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 198;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_84);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA75_29 = input.LA(1);

                         
                        int index75_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_29==COLONSi) && (synpred2())) {s = 32;}

                        else if ( (LA75_29==LEFTBRACKETSi) && (synpred2())) {s = 33;}

                        else if ( (LA75_29==DOUBLESLASH) ) {s = 34;}

                        else if ( (LA75_29==CAST) && (synpred2())) {s = 35;}

                        else if ( (LA75_29==CASTABLE) && (synpred2())) {s = 36;}

                        else if ( (LA75_29==TREAT) && (synpred2())) {s = 37;}

                        else if ( (LA75_29==INSTANCE) && (synpred2())) {s = 38;}

                        else if ( (LA75_29==EXCEPT||LA75_29==INTERSECT) && (synpred2())) {s = 39;}

                        else if ( (LA75_29==PIPESi||LA75_29==UNION) && (synpred2())) {s = 40;}

                        else if ( (LA75_29==STARSi) ) {s = 41;}

                        else if ( (LA75_29==MINUSSi||LA75_29==PLUSSi) ) {s = 42;}

                        else if ( (LA75_29==TO) && (synpred2())) {s = 43;}

                        else if ( (LA75_29==FTCONTAINS) && (synpred2())) {s = 44;}

                        else if ( ((LA75_29>=EQ && LA75_29<=GE)) && (synpred2())) {s = 45;}

                        else if ( (LA75_29==LESSTHANSi) ) {s = 46;}

                        else if ( ((LA75_29>=IS && LA75_29<=NODEAFTERSi)) && (synpred2())) {s = 47;}

                        else if ( (LA75_29==AND) && (synpred2())) {s = 48;}

                        else if ( (LA75_29==OR) && (synpred2())) {s = 49;}

                        else if ( (LA75_29==SEMICOLONSi) && (synpred2())) {s = 50;}

                        else if ( (LA75_29==COMMASi) && (synpred2())) {s = 51;}

                        else if ( (LA75_29==RIGHTBRACESi) && (synpred2())) {s = 52;}

                        else if ( (LA75_29==EOF) && (synpred2())) {s = 53;}

                        else if ( (LA75_29==RIGHTPARENTHESISSi) && (synpred2())) {s = 54;}

                        else if ( (LA75_29==RIGHTBRACKETSi) && (synpred2())) {s = 55;}

                        else if ( (LA75_29==WHERE) && (synpred2())) {s = 56;}

                        else if ( (LA75_29==ORDER) && (synpred2())) {s = 57;}

                        else if ( (LA75_29==STABLE) && (synpred2())) {s = 58;}

                        else if ( (LA75_29==RETURN) && (synpred2())) {s = 59;}

                        else if ( (LA75_29==FOR) && (synpred2())) {s = 60;}

                        else if ( (LA75_29==LET) && (synpred2())) {s = 61;}

                        else if ( (LA75_29==ASCENDING||LA75_29==DESCENDING) && (synpred2())) {s = 62;}

                        else if ( (LA75_29==EMPTY) && (synpred2())) {s = 63;}

                        else if ( (LA75_29==COLLATION) && (synpred2())) {s = 64;}

                        else if ( (LA75_29==SATISFIES) && (synpred2())) {s = 65;}

                        else if ( (LA75_29==DEFAULT) && (synpred2())) {s = 66;}

                        else if ( (LA75_29==CASE) && (synpred2())) {s = 67;}

                        else if ( (LA75_29==ELSE) && (synpred2())) {s = 68;}

                        else if ( (LA75_29==WITHOUT) && (synpred2())) {s = 69;}

                        else if ( (LA75_29==TIMES) && (synpred2())) {s = 70;}

                        else if ( ((LA75_29>=WORDS && LA75_29<=PARAGRAPHS)) && (synpred2())) {s = 71;}

                        else if ( (LA75_29==LEVELS) && (synpred2())) {s = 72;}

                        else if ( (LA75_29==DOLLARSi||(LA75_29>=LEFTPRAGMA && LA75_29<=DOCUMENTNODE)||LA75_29==PROCESSING_INSTRUCTION||LA75_29==DOCUMENT||LA75_29==VALIDATE||LA75_29==SCHEMAATTRIBUTE||LA75_29==LEFTXMLCOMMENT||LA75_29==TEXT||LA75_29==UNORDERED||LA75_29==LEFTPITARGET||LA75_29==COMMENT||(LA75_29>=ELEMENT && LA75_29<=LEFTPARENTHESISSi)||LA75_29==ATSi||LA75_29==ATTRIBUTE||LA75_29==NODE||LA75_29==SCHEMAELEMENT||LA75_29==CHILD||(LA75_29>=DESCENDANT && LA75_29<=DOTDOT)||(LA75_29>=IntegerLiteral && LA75_29<=DoubleLiteral)||LA75_29==StringLiteral||LA75_29==NCName) ) {s = 30;}

                        else if ( (LA75_29==SLASH) ) {s = 73;}

                        else if ( ((LA75_29>=BIGGERTHANSi && LA75_29<=LESSTHANOREQUALSi)||(LA75_29>=EQUALSi && LA75_29<=NOTEQUALSi)) && (synpred2())) {s = 74;}

                        else if ( (LA75_29==IDIV||LA75_29==DIV||LA75_29==MOD) && (synpred2())) {s = 75;}

                         
                        input.seek(index75_29);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA75_81 = input.LA(1);

                         
                        int index75_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 198;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_81);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA75_111 = input.LA(1);

                         
                        int index75_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_111==CAST) && (synpred2())) {s = 321;}

                        else if ( (LA75_111==CASTABLE) && (synpred2())) {s = 322;}

                        else if ( (LA75_111==TREAT) && (synpred2())) {s = 323;}

                        else if ( (LA75_111==INSTANCE) && (synpred2())) {s = 324;}

                        else if ( (LA75_111==EXCEPT||LA75_111==INTERSECT) && (synpred2())) {s = 325;}

                        else if ( (LA75_111==PIPESi||LA75_111==UNION) && (synpred2())) {s = 326;}

                        else if ( (LA75_111==MINUSSi||LA75_111==PLUSSi) && (synpred2())) {s = 328;}

                        else if ( (LA75_111==TO) && (synpred2())) {s = 43;}

                        else if ( (LA75_111==FTCONTAINS) && (synpred2())) {s = 44;}

                        else if ( ((LA75_111>=EQ && LA75_111<=GE)) && (synpred2())) {s = 45;}

                        else if ( (LA75_111==LESSTHANSi) ) {s = 329;}

                        else if ( ((LA75_111>=IS && LA75_111<=NODEAFTERSi)) && (synpred2())) {s = 47;}

                        else if ( (LA75_111==AND) && (synpred2())) {s = 48;}

                        else if ( (LA75_111==OR) && (synpred2())) {s = 49;}

                        else if ( (LA75_111==SEMICOLONSi) && (synpred2())) {s = 50;}

                        else if ( (LA75_111==COMMASi) && (synpred2())) {s = 51;}

                        else if ( (LA75_111==RIGHTBRACESi) && (synpred2())) {s = 52;}

                        else if ( (LA75_111==EOF) && (synpred2())) {s = 53;}

                        else if ( (LA75_111==RIGHTPARENTHESISSi) && (synpred2())) {s = 54;}

                        else if ( (LA75_111==RIGHTBRACKETSi) && (synpred2())) {s = 55;}

                        else if ( (LA75_111==WHERE) && (synpred2())) {s = 56;}

                        else if ( (LA75_111==ORDER) && (synpred2())) {s = 57;}

                        else if ( (LA75_111==STABLE) && (synpred2())) {s = 58;}

                        else if ( (LA75_111==RETURN) && (synpred2())) {s = 59;}

                        else if ( (LA75_111==FOR) && (synpred2())) {s = 60;}

                        else if ( (LA75_111==LET) && (synpred2())) {s = 61;}

                        else if ( (LA75_111==ASCENDING||LA75_111==DESCENDING) && (synpred2())) {s = 62;}

                        else if ( (LA75_111==EMPTY) && (synpred2())) {s = 63;}

                        else if ( (LA75_111==COLLATION) && (synpred2())) {s = 64;}

                        else if ( (LA75_111==SATISFIES) && (synpred2())) {s = 65;}

                        else if ( (LA75_111==DEFAULT) && (synpred2())) {s = 66;}

                        else if ( (LA75_111==CASE) && (synpred2())) {s = 67;}

                        else if ( (LA75_111==ELSE) && (synpred2())) {s = 68;}

                        else if ( (LA75_111==WITHOUT) && (synpred2())) {s = 69;}

                        else if ( (LA75_111==TIMES) && (synpred2())) {s = 70;}

                        else if ( ((LA75_111>=WORDS && LA75_111<=PARAGRAPHS)) && (synpred2())) {s = 71;}

                        else if ( (LA75_111==LEVELS) && (synpred2())) {s = 72;}

                        else if ( (LA75_111==STARSi) ) {s = 330;}

                        else if ( ((LA75_111>=IntegerLiteral && LA75_111<=DoubleLiteral)) ) {s = 331;}

                        else if ( (LA75_111==StringLiteral) ) {s = 332;}

                        else if ( (LA75_111==DOLLARSi) ) {s = 333;}

                        else if ( (LA75_111==LEFTPARENTHESISSi) ) {s = 334;}

                        else if ( (LA75_111==DOT) ) {s = 335;}

                        else if ( (LA75_111==NCName) ) {s = 336;}

                        else if ( (LA75_111==ORDERED) ) {s = 337;}

                        else if ( (LA75_111==UNORDERED) ) {s = 338;}

                        else if ( ((LA75_111>=BIGGERTHANSi && LA75_111<=LESSTHANOREQUALSi)||(LA75_111>=EQUALSi && LA75_111<=NOTEQUALSi)) && (synpred2())) {s = 74;}

                        else if ( (LA75_111==LEFTXMLCOMMENT) ) {s = 339;}

                        else if ( (LA75_111==LEFTPITARGET) ) {s = 340;}

                        else if ( (LA75_111==DOCUMENT) ) {s = 341;}

                        else if ( (LA75_111==ELEMENT) ) {s = 342;}

                        else if ( (LA75_111==ATTRIBUTE) ) {s = 343;}

                        else if ( (LA75_111==TEXT) ) {s = 344;}

                        else if ( (LA75_111==COMMENT) ) {s = 345;}

                        else if ( (LA75_111==PROCESSING_INSTRUCTION) ) {s = 346;}

                        else if ( ((LA75_111>=PARENT && LA75_111<=ANCESTOR_OR_SELF)) ) {s = 347;}

                        else if ( (LA75_111==DOTDOT) ) {s = 348;}

                        else if ( (LA75_111==CHILD||(LA75_111>=DESCENDANT && LA75_111<=FOLLOWING)) ) {s = 349;}

                        else if ( (LA75_111==ATSi) ) {s = 350;}

                        else if ( (LA75_111==DOCUMENTNODE) ) {s = 351;}

                        else if ( (LA75_111==SCHEMAELEMENT) ) {s = 352;}

                        else if ( (LA75_111==SCHEMAATTRIBUTE) ) {s = 353;}

                        else if ( (LA75_111==NODE) ) {s = 354;}

                        else if ( (LA75_111==IDIV||LA75_111==DIV||LA75_111==MOD) && (synpred2())) {s = 75;}

                         
                        input.seek(index75_111);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA75_2>=IntegerLiteral && LA75_2<=DoubleLiteral)) && (synpred2())) {s = 4;}

                        else if ( (LA75_2==StringLiteral) && (synpred2())) {s = 5;}

                        else if ( (LA75_2==DOLLARSi) && (synpred2())) {s = 6;}

                        else if ( (LA75_2==LEFTPARENTHESISSi) && (synpred2())) {s = 7;}

                        else if ( (LA75_2==DOT) && (synpred2())) {s = 8;}

                        else if ( (LA75_2==NCName) && (synpred2())) {s = 9;}

                        else if ( (LA75_2==ORDERED) && (synpred2())) {s = 10;}

                        else if ( (LA75_2==UNORDERED) && (synpred2())) {s = 11;}

                        else if ( (LA75_2==LESSTHANSi) ) {s = 12;}

                        else if ( (LA75_2==LEFTXMLCOMMENT) && (synpred2())) {s = 13;}

                        else if ( (LA75_2==LEFTPITARGET) && (synpred2())) {s = 14;}

                        else if ( (LA75_2==DOCUMENT) && (synpred2())) {s = 15;}

                        else if ( (LA75_2==ELEMENT) && (synpred2())) {s = 16;}

                        else if ( (LA75_2==ATTRIBUTE) && (synpred2())) {s = 17;}

                        else if ( (LA75_2==TEXT) && (synpred2())) {s = 18;}

                        else if ( (LA75_2==COMMENT) && (synpred2())) {s = 19;}

                        else if ( (LA75_2==PROCESSING_INSTRUCTION) && (synpred2())) {s = 20;}

                        else if ( ((LA75_2>=PARENT && LA75_2<=ANCESTOR_OR_SELF)) && (synpred2())) {s = 21;}

                        else if ( (LA75_2==DOTDOT) && (synpred2())) {s = 22;}

                        else if ( (LA75_2==CHILD||(LA75_2>=DESCENDANT && LA75_2<=FOLLOWING)) && (synpred2())) {s = 23;}

                        else if ( (LA75_2==ATSi) && (synpred2())) {s = 24;}

                        else if ( (LA75_2==DOCUMENTNODE) && (synpred2())) {s = 25;}

                        else if ( (LA75_2==SCHEMAELEMENT) && (synpred2())) {s = 26;}

                        else if ( (LA75_2==SCHEMAATTRIBUTE) && (synpred2())) {s = 27;}

                        else if ( (LA75_2==NODE) && (synpred2())) {s = 28;}

                        else if ( (LA75_2==STARSi) ) {s = 29;}

                        else if ( (LA75_2==EOF||(LA75_2>=PIPESi && LA75_2<=WHERE)||(LA75_2>=EQUALSi && LA75_2<=NOTEQUALSi)||LA75_2==CAST||LA75_2==ELSE||LA75_2==TREAT||LA75_2==CASTABLE||(LA75_2>=FOR && LA75_2<=INSTANCE)||(LA75_2>=EXCEPT && LA75_2<=TO)||LA75_2==SATISFIES||LA75_2==SEMICOLONSi||LA75_2==EMPTY||LA75_2==CASE||LA75_2==MINUSSi||(LA75_2>=COMMASi && LA75_2<=LET)||LA75_2==RIGHTBRACKETSi||LA75_2==LEVELS||(LA75_2>=DIV && LA75_2<=PLUSSi)||LA75_2==ORDER||LA75_2==UNION||LA75_2==COLLATION||LA75_2==OR||LA75_2==DESCENDING||LA75_2==STABLE||LA75_2==WITHOUT||LA75_2==RIGHTPARENTHESISSi||LA75_2==RETURN||LA75_2==DEFAULT||LA75_2==AND||LA75_2==INTERSECT||LA75_2==TIMES||LA75_2==FTCONTAINS||(LA75_2>=MOD && LA75_2<=RIGHTBRACESi)||(LA75_2>=EQ && LA75_2<=NODEAFTERSi)||(LA75_2>=WORDS && LA75_2<=PARAGRAPHS)) ) {s = 30;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA75_0 = input.LA(1);

                         
                        int index75_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_0==DOUBLESLASH) && (synpred1())) {s = 1;}

                        else if ( (LA75_0==SLASH) ) {s = 2;}

                        else if ( (LA75_0==DOLLARSi||(LA75_0>=ORDERED && LA75_0<=DOCUMENTNODE)||LA75_0==LESSTHANSi||LA75_0==PROCESSING_INSTRUCTION||LA75_0==DOCUMENT||LA75_0==SCHEMAATTRIBUTE||LA75_0==STARSi||LA75_0==LEFTXMLCOMMENT||LA75_0==TEXT||LA75_0==UNORDERED||LA75_0==LEFTPITARGET||LA75_0==COMMENT||(LA75_0>=ELEMENT && LA75_0<=LEFTPARENTHESISSi)||LA75_0==ATSi||LA75_0==ATTRIBUTE||LA75_0==NODE||LA75_0==SCHEMAELEMENT||LA75_0==CHILD||(LA75_0>=DESCENDANT && LA75_0<=DOTDOT)||(LA75_0>=IntegerLiteral && LA75_0<=DoubleLiteral)||LA75_0==StringLiteral||LA75_0==NCName) ) {s = 3;}

                         
                        input.seek(index75_0);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA75_80 = input.LA(1);

                         
                        int index75_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 198;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_80);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA75_31 = input.LA(1);

                         
                        int index75_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_31==COLONSi) ) {s = 76;}

                        else if ( (LA75_31==S) && (synpred2())) {s = 77;}

                        else if ( (LA75_31==RIGHTSELFTERMINATOR) && (synpred2())) {s = 78;}

                        else if ( (LA75_31==BIGGERTHANSi) && (synpred2())) {s = 79;}

                        else if ( (LA75_31==EOF||LA75_31==PIPESi||(LA75_31>=ASCENDING && LA75_31<=WHERE)||LA75_31==CAST||LA75_31==ELSE||LA75_31==TREAT||LA75_31==SLASH||LA75_31==CASTABLE||(LA75_31>=FOR && LA75_31<=INSTANCE)||(LA75_31>=EXCEPT && LA75_31<=TO)||LA75_31==SATISFIES||LA75_31==SEMICOLONSi||LA75_31==EMPTY||LA75_31==CASE||LA75_31==MINUSSi||(LA75_31>=COMMASi && LA75_31<=LET)||LA75_31==RIGHTBRACKETSi||(LA75_31>=DIV && LA75_31<=PLUSSi)||LA75_31==ORDER||LA75_31==UNION||LA75_31==COLLATION||LA75_31==OR||LA75_31==DOUBLESLASH||(LA75_31>=DESCENDING && LA75_31<=STARSi)||(LA75_31>=STABLE && LA75_31<=LEFTBRACKETSi)||LA75_31==RIGHTPARENTHESISSi||LA75_31==RETURN||LA75_31==DEFAULT||LA75_31==LEFTPARENTHESISSi||LA75_31==AND||LA75_31==INTERSECT||LA75_31==FTCONTAINS||(LA75_31>=MOD && LA75_31<=RIGHTBRACESi)) ) {s = 30;}

                         
                        input.seek(index75_31);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA75_143 = input.LA(1);

                         
                        int index75_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_143);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA75_41 = input.LA(1);

                         
                        int index75_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_41==EOF||(LA75_41>=PIPESi && LA75_41<=WHERE)||(LA75_41>=EQUALSi && LA75_41<=NOTEQUALSi)||LA75_41==CAST||LA75_41==ELSE||LA75_41==TREAT||LA75_41==CASTABLE||(LA75_41>=FOR && LA75_41<=INSTANCE)||(LA75_41>=EXCEPT && LA75_41<=TO)||(LA75_41>=SATISFIES && LA75_41<=SEMICOLONSi)||LA75_41==EMPTY||LA75_41==CASE||(LA75_41>=COMMASi && LA75_41<=LET)||LA75_41==RIGHTBRACKETSi||LA75_41==LEVELS||LA75_41==DIV||LA75_41==ORDER||LA75_41==UNION||LA75_41==COLLATION||LA75_41==OR||LA75_41==DESCENDING||(LA75_41>=STABLE && LA75_41<=LEFTBRACKETSi)||LA75_41==WITHOUT||LA75_41==RIGHTPARENTHESISSi||LA75_41==RETURN||LA75_41==DEFAULT||LA75_41==AND||LA75_41==INTERSECT||LA75_41==TIMES||LA75_41==FTCONTAINS||(LA75_41>=MOD && LA75_41<=RIGHTBRACESi)||(LA75_41>=EQ && LA75_41<=NODEAFTERSi)||(LA75_41>=WORDS && LA75_41<=PARAGRAPHS)) ) {s = 30;}

                        else if ( (LA75_41==DOUBLESLASH) ) {s = 106;}

                        else if ( (LA75_41==MINUSSi||LA75_41==PLUSSi) ) {s = 107;}

                        else if ( (LA75_41==LESSTHANSi) ) {s = 108;}

                        else if ( (LA75_41==STARSi) ) {s = 109;}

                        else if ( (LA75_41==VALIDATE) && (synpred2())) {s = 110;}

                        else if ( (LA75_41==SLASH) ) {s = 111;}

                        else if ( ((LA75_41>=IntegerLiteral && LA75_41<=DoubleLiteral)) && (synpred2())) {s = 112;}

                        else if ( (LA75_41==StringLiteral) && (synpred2())) {s = 113;}

                        else if ( (LA75_41==DOLLARSi) && (synpred2())) {s = 114;}

                        else if ( (LA75_41==LEFTPARENTHESISSi) && (synpred2())) {s = 115;}

                        else if ( (LA75_41==DOT) && (synpred2())) {s = 116;}

                        else if ( (LA75_41==NCName) && (synpred2())) {s = 117;}

                        else if ( (LA75_41==ORDERED) && (synpred2())) {s = 118;}

                        else if ( (LA75_41==UNORDERED) && (synpred2())) {s = 119;}

                        else if ( (LA75_41==LEFTXMLCOMMENT) && (synpred2())) {s = 120;}

                        else if ( (LA75_41==LEFTPITARGET) && (synpred2())) {s = 121;}

                        else if ( (LA75_41==DOCUMENT) && (synpred2())) {s = 122;}

                        else if ( (LA75_41==ELEMENT) && (synpred2())) {s = 123;}

                        else if ( (LA75_41==ATTRIBUTE) && (synpred2())) {s = 124;}

                        else if ( (LA75_41==TEXT) && (synpred2())) {s = 125;}

                        else if ( (LA75_41==COMMENT) && (synpred2())) {s = 126;}

                        else if ( (LA75_41==PROCESSING_INSTRUCTION) && (synpred2())) {s = 127;}

                        else if ( ((LA75_41>=PARENT && LA75_41<=ANCESTOR_OR_SELF)) && (synpred2())) {s = 128;}

                        else if ( (LA75_41==DOTDOT) && (synpred2())) {s = 129;}

                        else if ( (LA75_41==CHILD||(LA75_41>=DESCENDANT && LA75_41<=FOLLOWING)) && (synpred2())) {s = 130;}

                        else if ( (LA75_41==ATSi) && (synpred2())) {s = 131;}

                        else if ( (LA75_41==DOCUMENTNODE) && (synpred2())) {s = 132;}

                        else if ( (LA75_41==SCHEMAELEMENT) && (synpred2())) {s = 133;}

                        else if ( (LA75_41==SCHEMAATTRIBUTE) && (synpred2())) {s = 134;}

                        else if ( (LA75_41==NODE) && (synpred2())) {s = 135;}

                        else if ( (LA75_41==LEFTPRAGMA) && (synpred2())) {s = 136;}

                         
                        input.seek(index75_41);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA75_144 = input.LA(1);

                         
                        int index75_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_144);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA75_105 = input.LA(1);

                         
                        int index75_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 198;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_105);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA75_109 = input.LA(1);

                         
                        int index75_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_109==COLONSi) && (synpred2())) {s = 318;}

                        else if ( (LA75_109==LEFTBRACKETSi) && (synpred2())) {s = 319;}

                        else if ( (LA75_109==DOUBLESLASH) ) {s = 320;}

                        else if ( (LA75_109==CAST) && (synpred2())) {s = 321;}

                        else if ( (LA75_109==CASTABLE) && (synpred2())) {s = 322;}

                        else if ( (LA75_109==TREAT) && (synpred2())) {s = 323;}

                        else if ( (LA75_109==INSTANCE) && (synpred2())) {s = 324;}

                        else if ( (LA75_109==EXCEPT||LA75_109==INTERSECT) && (synpred2())) {s = 325;}

                        else if ( (LA75_109==PIPESi||LA75_109==UNION) && (synpred2())) {s = 326;}

                        else if ( (LA75_109==MINUSSi||LA75_109==PLUSSi) ) {s = 42;}

                        else if ( (LA75_109==TO) && (synpred2())) {s = 43;}

                        else if ( (LA75_109==FTCONTAINS) && (synpred2())) {s = 44;}

                        else if ( ((LA75_109>=EQ && LA75_109<=GE)) && (synpred2())) {s = 45;}

                        else if ( (LA75_109==LESSTHANSi) ) {s = 46;}

                        else if ( ((LA75_109>=IS && LA75_109<=NODEAFTERSi)) && (synpred2())) {s = 47;}

                        else if ( (LA75_109==AND) && (synpred2())) {s = 48;}

                        else if ( (LA75_109==OR) && (synpred2())) {s = 49;}

                        else if ( (LA75_109==SEMICOLONSi) && (synpred2())) {s = 50;}

                        else if ( (LA75_109==COMMASi) && (synpred2())) {s = 51;}

                        else if ( (LA75_109==RIGHTBRACESi) && (synpred2())) {s = 52;}

                        else if ( (LA75_109==EOF) && (synpred2())) {s = 53;}

                        else if ( (LA75_109==RIGHTPARENTHESISSi) && (synpred2())) {s = 54;}

                        else if ( (LA75_109==RIGHTBRACKETSi) && (synpred2())) {s = 55;}

                        else if ( (LA75_109==WHERE) && (synpred2())) {s = 56;}

                        else if ( (LA75_109==ORDER) && (synpred2())) {s = 57;}

                        else if ( (LA75_109==STABLE) && (synpred2())) {s = 58;}

                        else if ( (LA75_109==RETURN) && (synpred2())) {s = 59;}

                        else if ( (LA75_109==FOR) && (synpred2())) {s = 60;}

                        else if ( (LA75_109==LET) && (synpred2())) {s = 61;}

                        else if ( (LA75_109==ASCENDING||LA75_109==DESCENDING) && (synpred2())) {s = 62;}

                        else if ( (LA75_109==EMPTY) && (synpred2())) {s = 63;}

                        else if ( (LA75_109==COLLATION) && (synpred2())) {s = 64;}

                        else if ( (LA75_109==SATISFIES) && (synpred2())) {s = 65;}

                        else if ( (LA75_109==DEFAULT) && (synpred2())) {s = 66;}

                        else if ( (LA75_109==CASE) && (synpred2())) {s = 67;}

                        else if ( (LA75_109==ELSE) && (synpred2())) {s = 68;}

                        else if ( (LA75_109==WITHOUT) && (synpred2())) {s = 69;}

                        else if ( (LA75_109==TIMES) && (synpred2())) {s = 70;}

                        else if ( ((LA75_109>=WORDS && LA75_109<=PARAGRAPHS)) && (synpred2())) {s = 71;}

                        else if ( (LA75_109==LEVELS) && (synpred2())) {s = 72;}

                        else if ( (LA75_109==STARSi) ) {s = 41;}

                        else if ( (LA75_109==DOLLARSi||(LA75_109>=LEFTPRAGMA && LA75_109<=DOCUMENTNODE)||LA75_109==PROCESSING_INSTRUCTION||LA75_109==DOCUMENT||LA75_109==VALIDATE||LA75_109==SCHEMAATTRIBUTE||LA75_109==LEFTXMLCOMMENT||LA75_109==TEXT||LA75_109==UNORDERED||LA75_109==LEFTPITARGET||LA75_109==COMMENT||(LA75_109>=ELEMENT && LA75_109<=LEFTPARENTHESISSi)||LA75_109==ATSi||LA75_109==ATTRIBUTE||LA75_109==NODE||LA75_109==SCHEMAELEMENT||LA75_109==CHILD||(LA75_109>=DESCENDANT && LA75_109<=DOTDOT)||(LA75_109>=IntegerLiteral && LA75_109<=DoubleLiteral)||LA75_109==StringLiteral||LA75_109==NCName) ) {s = 30;}

                        else if ( (LA75_109==SLASH) ) {s = 327;}

                        else if ( ((LA75_109>=BIGGERTHANSi && LA75_109<=LESSTHANOREQUALSi)||(LA75_109>=EQUALSi && LA75_109<=NOTEQUALSi)) && (synpred2())) {s = 74;}

                        else if ( (LA75_109==IDIV||LA75_109==DIV||LA75_109==MOD) && (synpred2())) {s = 75;}

                         
                        input.seek(index75_109);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA75_83 = input.LA(1);

                         
                        int index75_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 198;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_83);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA75_141 = input.LA(1);

                         
                        int index75_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 328;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index75_141);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA117_eotS =
        "\u01c5\uffff";
    static final String DFA117_eofS =
        "\13\uffff\1\31\14\uffff\1\101\1\uffff\1\101\3\uffff\1\31\2\uffff"+
        "\1\31\2\uffff\1\31\3\uffff\6\31\2\uffff\1\31\50\uffff\1\31\11\uffff"+
        "\1\31\1\uffff\1\31\37\uffff\1\101\41\uffff\1\101\1\uffff\1\101\32"+
        "\uffff\3\101\u00fe\uffff";
    static final String DFA117_minS =
        "\1\33\12\177\1\4\1\uffff\1\164\2\144\2\u00d7\5\164\1\u00d7\1\4\1"+
        "\uffff\1\4\1\uffff\2\177\1\4\1\63\1\105\1\4\1\63\1\105\1\4\2\63"+
        "\1\164\6\4\2\25\1\4\50\uffff\1\4\1\0\1\25\1\144\6\u00d7\1\4\1\u00d7"+
        "\1\4\1\16\1\25\3\0\1\u00d7\3\0\2\16\1\u00d7\1\74\1\u00d6\6\16\1"+
        "\u00a6\1\0\1\u00a6\1\33\4\177\1\0\1\u00d7\1\25\1\4\36\uffff\3\25"+
        "\1\4\1\uffff\1\4\31\uffff\1\25\3\4\1\63\1\105\1\164\1\63\1\105\1"+
        "\63\1\105\1\63\2\164\1\16\101\0\21\uffff\72\0\1\uffff\2\0\10\uffff"+
        "\32\0\1\uffff\101\0";
    static final String DFA117_maxS =
        "\1\u00d7\12\177\1\u00b5\1\uffff\1\u0098\5\u00d7\4\164\2\u00d7\1"+
        "\uffff\1\u00d7\1\uffff\2\177\1\u00b5\2\164\1\u00b5\2\164\1\u00b5"+
        "\3\164\6\u00b5\3\u00d7\50\uffff\1\u00d7\1\0\10\u00d7\1\u00b5\1\u00d7"+
        "\1\u00b5\1\u00a4\1\u00d7\3\0\1\u00d7\3\0\2\16\1\u00d7\1\u00dc\1"+
        "\u00d6\1\16\2\u00d7\2\177\1\u00d7\1\u00a6\1\0\1\u00a6\1\u00d7\4"+
        "\177\1\0\1\u00da\1\u00d7\1\u00da\36\uffff\4\u00d7\1\uffff\1\u00d7"+
        "\31\uffff\3\u00d7\1\u00da\5\164\1\u0094\4\164\1\16\101\0\21\uffff"+
        "\72\0\1\uffff\2\0\10\uffff\32\0\1\uffff\101\0";
    static final String DFA117_acceptS =
        "\14\uffff\1\3\14\uffff\1\2\1\uffff\1\1\25\uffff\50\1\55\uffff\36"+
        "\1\4\uffff\1\1\1\uffff\31\1\120\uffff\21\1\72\uffff\1\1\2\uffff"+
        "\10\1\32\uffff\1\1\101\uffff";
    static final String DFA117_specialS =
        "\13\uffff\1\0\14\uffff\1\20\1\uffff\1\4\3\uffff\1\26\2\uffff\1\1"+
        "\2\uffff\1\12\3\uffff\1\10\1\7\1\27\1\25\1\21\1\11\1\uffff\1\5\1"+
        "\14\50\uffff\1\30\1\37\1\6\7\uffff\1\2\1\uffff\1\13\2\uffff\1\3"+
        "\1\17\1\33\1\uffff\1\15\1\16\1\22\14\uffff\1\40\6\uffff\1\34\2\uffff"+
        "\1\23\41\uffff\1\35\1\uffff\1\31\32\uffff\1\32\1\36\1\24\u00fe\uffff}>";
    static final String[] DFA117_transitionS = {
            "\1\1\15\uffff\1\12\20\uffff\1\6\6\uffff\1\14\23\uffff\1\5\23"+
            "\uffff\1\10\16\uffff\1\7\5\uffff\1\2\14\uffff\1\3\6\uffff\1"+
            "\11\5\uffff\1\4\76\uffff\1\13",
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
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\27\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff\1"+
            "\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1\31"+
            "\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "",
            "\1\36\11\uffff\1\34\31\uffff\1\35",
            "\1\40\17\uffff\1\41\142\uffff\1\37",
            "\1\43\17\uffff\1\44\142\uffff\1\42",
            "\1\45",
            "\1\46",
            "\1\50\126\uffff\1\47\13\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\65\3\72\1\111\1\66\1\104\3\uffff\1\61\2\72\4\uffff\1\31\3"+
            "\uffff\3\31\1\117\1\57\6\uffff\1\31\5\uffff\1\107\1\124\1\uffff"+
            "\1\64\1\67\3\uffff\1\114\1\uffff\1\76\2\uffff\1\112\1\uffff"+
            "\1\116\1\31\1\uffff\1\56\1\uffff\1\31\1\uffff\1\31\4\uffff\1"+
            "\77\1\110\1\uffff\1\127\3\uffff\1\103\1\uffff\1\123\2\uffff"+
            "\1\66\1\56\1\uffff\1\126\1\31\1\105\1\uffff\1\65\1\uffff\1\113"+
            "\2\uffff\1\75\1\uffff\1\31\3\uffff\1\111\1\60\2\uffff\1\31\1"+
            "\uffff\1\31\1\106\1\uffff\1\31\3\uffff\1\31\1\120\1\uffff\1"+
            "\62\1\102\2\uffff\1\63\1\31\1\115\4\uffff\2\31\3\uffff\1\74"+
            "\3\uffff\1\64\1\uffff\1\31\1\121\1\31\1\125\1\70\2\uffff\1\66"+
            "\1\100\1\31\4\uffff\1\130\1\31\1\uffff\6\71\3\73\2\uffff\1\31"+
            "\1\uffff\14\31\3\122\16\uffff\3\31\4\uffff\1\31\13\uffff\1\31",
            "",
            "\1\65\3\72\1\111\1\66\1\104\3\uffff\1\61\2\72\4\uffff\1\31\3"+
            "\uffff\3\31\1\117\1\133\6\uffff\1\31\5\uffff\1\107\1\124\1\uffff"+
            "\1\64\1\67\3\uffff\1\114\1\uffff\1\76\2\uffff\1\112\1\uffff"+
            "\1\116\1\31\1\uffff\1\132\1\uffff\1\31\1\uffff\1\31\4\uffff"+
            "\1\77\1\110\1\uffff\1\127\3\uffff\1\103\1\uffff\1\123\2\uffff"+
            "\1\66\1\132\1\uffff\1\126\1\31\1\105\1\uffff\1\65\1\uffff\1"+
            "\113\2\uffff\1\75\1\uffff\1\31\3\uffff\1\111\1\131\2\uffff\1"+
            "\31\1\uffff\1\31\1\106\1\uffff\1\31\3\uffff\1\31\1\120\1\uffff"+
            "\1\62\1\102\2\uffff\1\63\1\31\1\115\4\uffff\2\31\3\uffff\1\74"+
            "\3\uffff\1\64\1\uffff\1\31\1\121\1\31\1\125\1\70\2\uffff\1\66"+
            "\1\100\1\31\4\uffff\1\130\1\31\1\uffff\6\71\3\73\2\uffff\1\31"+
            "\1\uffff\14\31\3\122\16\uffff\3\31\4\uffff\1\31\13\uffff\1\31",
            "",
            "\1\134",
            "\1\135",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\1\136\21\uffff\1\137\56\uffff\1\41",
            "\1\137\56\uffff\1\41",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\1\140\21\uffff\1\141\56\uffff\1\44",
            "\1\141\56\uffff\1\44",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\1\142\100\uffff\1\143",
            "\1\144\100\uffff\1\145",
            "\1\50",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\1\153\3\uffff\1\u0083\1\157\1\176\1\uffff\1\161\6\uffff\1\150"+
            "\25\uffff\1\171\1\uffff\1\u0084\1\uffff\1\164\1\uffff\1\146"+
            "\21\uffff\1\u0084\2\uffff\1\u0080\11\uffff\1\147\4\uffff\1\u0082"+
            "\2\uffff\1\162\1\uffff\1\167\2\uffff\1\160\3\uffff\1\163\7\uffff"+
            "\1\170\5\uffff\1\165\1\154\11\uffff\1\175\1\uffff\1\166\6\uffff"+
            "\1\u0081\5\uffff\1\177\14\uffff\1\174\1\uffff\5\174\5\172\1"+
            "\155\1\173\21\uffff\3\151\4\uffff\1\152\13\uffff\1\156",
            "\1\u008c\3\uffff\1\u00a3\1\u008f\1\u009e\1\uffff\1\u0091\6\uffff"+
            "\1\u0089\25\uffff\1\u0099\1\uffff\1\u0086\1\uffff\1\u0094\1"+
            "\uffff\1\u0087\21\uffff\1\u0086\2\uffff\1\u00a0\11\uffff\1\u0088"+
            "\4\uffff\1\u00a2\2\uffff\1\u0092\1\uffff\1\u0097\2\uffff\1\u0090"+
            "\3\uffff\1\u0093\7\uffff\1\u0098\5\uffff\1\u0095\1\u008d\11"+
            "\uffff\1\u009d\1\uffff\1\u0096\6\uffff\1\u00a1\5\uffff\1\u009f"+
            "\14\uffff\1\u009c\1\uffff\5\u009c\5\u009a\1\u008e\1\u009b\21"+
            "\uffff\3\u008a\4\uffff\1\u008b\13\uffff\1\u0085",
            "\7\31\4\uffff\2\31\4\uffff\1\u00ac\1\uffff\1\31\1\uffff\1\u00c2"+
            "\1\u00b0\1\u00be\1\31\1\u00a6\1\31\5\uffff\1\u00a9\3\uffff\1"+
            "\31\1\uffff\2\31\1\uffff\2\31\3\uffff\3\31\2\uffff\1\31\1\uffff"+
            "\1\31\1\u00b9\1\uffff\1\u00a5\1\uffff\1\u00b4\1\uffff\1\u00a8"+
            "\4\uffff\2\31\5\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\u00a5"+
            "\2\uffff\1\u00c0\1\31\1\uffff\1\31\1\uffff\1\31\2\uffff\1\31"+
            "\1\uffff\1\u00a4\3\uffff\1\31\1\u00a7\2\uffff\1\u00b2\1\uffff"+
            "\1\u00b7\2\31\1\u00b1\3\uffff\1\u00b3\1\31\2\uffff\1\31\2\uffff"+
            "\1\31\1\u00b8\1\31\4\uffff\1\u00b5\1\u00ad\3\uffff\1\31\3\uffff"+
            "\1\31\1\uffff\1\u00bd\1\31\1\u00b6\1\uffff\1\31\2\uffff\2\31"+
            "\1\u00c1\5\uffff\1\u00bf\1\uffff\11\31\2\uffff\1\u00bc\1\uffff"+
            "\5\u00bc\5\u00ba\1\u00ae\1\u00bb\3\31\16\uffff\3\u00aa\4\uffff"+
            "\1\u00ab\13\uffff\1\u00af",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\7\31\4\uffff\2\31\4\uffff\1\u00ac\1\uffff\1\31\1\uffff\1\u00c2"+
            "\1\u00b0\1\u00be\1\31\1\u00a6\1\31\5\uffff\1\u00c4\3\uffff\1"+
            "\31\1\uffff\2\31\1\uffff\2\31\3\uffff\3\31\2\uffff\1\31\1\uffff"+
            "\1\31\1\u00b9\1\uffff\1\u00a5\1\uffff\1\u00b4\1\uffff\1\u00a8"+
            "\4\uffff\2\31\5\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\u00a5"+
            "\2\uffff\1\u00c0\1\31\1\uffff\1\31\1\uffff\1\31\2\uffff\1\31"+
            "\1\uffff\1\u00c3\3\uffff\1\31\1\u00c5\2\uffff\1\u00b2\1\uffff"+
            "\1\u00b7\2\31\1\u00b1\3\uffff\1\u00b3\1\31\2\uffff\1\31\2\uffff"+
            "\1\31\1\u00b8\1\31\4\uffff\1\u00b5\1\u00ad\3\uffff\1\31\3\uffff"+
            "\1\31\1\uffff\1\u00bd\1\31\1\u00b6\1\uffff\1\31\2\uffff\2\31"+
            "\1\u00c1\5\uffff\1\u00bf\1\uffff\11\31\2\uffff\1\u00bc\1\uffff"+
            "\5\u00bc\5\u00ba\1\u00ae\1\u00bb\3\31\16\uffff\3\u00aa\4\uffff"+
            "\1\u00ab\13\uffff\1\u00af",
            "\1\uffff",
            "\1\u008c\3\uffff\1\u00a3\1\u008f\1\u009e\1\uffff\1\u0091\6\uffff"+
            "\1\u0089\25\uffff\1\u0099\1\uffff\1\u0086\1\uffff\1\u0094\1"+
            "\uffff\1\u0087\21\uffff\1\u0086\2\uffff\1\u00a0\11\uffff\1\u0088"+
            "\4\uffff\1\u00a2\2\uffff\1\u0092\1\uffff\1\u0097\2\uffff\1\u0090"+
            "\3\uffff\1\u0093\7\uffff\1\u0098\5\uffff\1\u0095\1\u008d\11"+
            "\uffff\1\u009d\1\uffff\1\u0096\6\uffff\1\u00a1\5\uffff\1\u009f"+
            "\14\uffff\1\u009c\1\uffff\5\u009c\5\u009a\1\u008e\1\u009b\21"+
            "\uffff\3\u008a\4\uffff\1\u008b\13\uffff\1\u00c6",
            "\1\u00c8\17\uffff\1\u00c9\142\uffff\1\u00c7",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\1\u00d0",
            "\7\31\3\uffff\3\31\13\uffff\2\31\14\uffff\2\31\1\uffff\2\31"+
            "\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2\uffff"+
            "\1\31\10\uffff\2\31\1\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\32\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff"+
            "\1\31\2\uffff\1\31\5\uffff\1\31\1\30\5\uffff\1\31\6\uffff\1"+
            "\31\1\uffff\2\31\2\uffff\1\31\1\uffff\1\31\11\uffff\1\31\3\uffff"+
            "\1\31\2\uffff\1\31\1\uffff\2\31\2\uffff\2\31\2\uffff\1\33\2"+
            "\uffff\1\31\2\uffff\11\31\20\uffff\3\31",
            "\1\u00d2\u0094\uffff\2\u00d1",
            "\1\u00d5\4\uffff\1\u00d9\1\u00e8\1\uffff\1\u00db\34\uffff\1"+
            "\u00e3\3\uffff\1\u00de\26\uffff\1\u00ea\16\uffff\1\u00ec\2\uffff"+
            "\1\u00dc\1\uffff\1\u00e1\2\uffff\1\u00da\3\uffff\1\u00dd\7\uffff"+
            "\1\u00e2\5\uffff\1\u00df\1\u00d6\11\uffff\1\u00e7\1\uffff\1"+
            "\u00e0\6\uffff\1\u00eb\5\uffff\1\u00e9\14\uffff\1\u00e6\1\uffff"+
            "\5\u00e6\5\u00e4\1\u00d7\1\u00e5\21\uffff\3\u00d3\4\uffff\1"+
            "\u00d4\13\uffff\1\u00d8",
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
            "\1\u00f2\70\uffff\1\u00f3\146\uffff\1\u00f1",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f8\160\uffff\1\u00f6\127\uffff\1\u00f7",
            "\1\u00fc\160\uffff\1\u00f9\46\uffff\1\u00fa\60\uffff\1\u00fb",
            "\1\u00fe\160\uffff\1\u00fd",
            "\1\u0100\160\uffff\1\u00ff",
            "\1\u0103\160\uffff\1\u0101\127\uffff\1\u0102",
            "\1\u0104",
            "\1\uffff",
            "\1\u00fa",
            "\1\176\36\uffff\1\u0107\32\uffff\1\u0080\16\uffff\1\u0082\4"+
            "\uffff\1\u0109\16\uffff\1\u0108\5\uffff\1\u0105\14\uffff\1\u0106"+
            "\6\uffff\1\u0081\5\uffff\1\177\76\uffff\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\uffff",
            "\1\u0110\2\uffff\1\u010f",
            "\1\153\3\uffff\1\u0083\1\157\1\176\1\uffff\1\161\6\uffff\1\150"+
            "\25\uffff\1\171\1\uffff\1\u0084\1\uffff\1\164\1\uffff\1\146"+
            "\21\uffff\1\u0084\2\uffff\1\u0080\11\uffff\1\147\4\uffff\1\u0082"+
            "\2\uffff\1\162\1\uffff\1\167\2\uffff\1\160\3\uffff\1\163\7\uffff"+
            "\1\170\5\uffff\1\165\1\u0111\11\uffff\1\175\1\uffff\1\166\6"+
            "\uffff\1\u0081\5\uffff\1\177\14\uffff\1\174\1\uffff\5\174\5"+
            "\172\1\155\1\173\21\uffff\3\151\4\uffff\1\152\13\uffff\1\156",
            "\1\u011b\1\31\2\uffff\1\111\1\u011c\1\104\14\uffff\1\u0116\4"+
            "\uffff\1\117\1\uffff\1\u0118\5\uffff\1\u0115\3\uffff\1\u0117"+
            "\1\uffff\1\107\1\u0119\1\uffff\1\u011a\1\u011e\3\uffff\1\114"+
            "\1\u0112\1\76\2\uffff\1\112\1\uffff\1\116\2\uffff\1\u011d\1"+
            "\31\7\uffff\1\u0120\1\110\5\uffff\1\103\4\uffff\1\u011c\1\u011d"+
            "\3\uffff\1\105\1\uffff\1\u011b\1\uffff\1\113\2\uffff\1\75\1"+
            "\uffff\1\u0115\3\uffff\1\111\1\u011c\5\uffff\1\106\1\u0114\10"+
            "\uffff\1\u0122\2\uffff\1\u0123\1\uffff\1\115\5\uffff\1\u0113"+
            "\3\uffff\1\74\3\uffff\1\u011a\5\uffff\1\u011f\2\uffff\1\u011c"+
            "\1\u0121\110\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0126\4\uffff\1\u012a\1\u0139\1\uffff\1\u012c\34\uffff\1"+
            "\u0134\3\uffff\1\u012f\26\uffff\1\u013b\16\uffff\1\u013d\2\uffff"+
            "\1\u012d\1\uffff\1\u0132\2\uffff\1\u012b\3\uffff\1\u012e\7\uffff"+
            "\1\u0133\5\uffff\1\u0130\1\u0127\11\uffff\1\u0138\1\uffff\1"+
            "\u0131\6\uffff\1\u013c\5\uffff\1\u013a\14\uffff\1\u0137\1\uffff"+
            "\5\u0137\5\u0135\1\u0128\1\u0136\21\uffff\3\u0124\4\uffff\1"+
            "\u0125\13\uffff\1\u0129",
            "\1\u0143\3\uffff\1\u015b\1\u0147\1\u0156\1\uffff\1\u0149\6\uffff"+
            "\1\u0140\25\uffff\1\u0151\1\uffff\1\u015c\1\uffff\1\u014c\1"+
            "\uffff\1\u013e\21\uffff\1\u015c\2\uffff\1\u0158\11\uffff\1\u013f"+
            "\4\uffff\1\u015a\2\uffff\1\u014a\1\uffff\1\u014f\2\uffff\1\u0148"+
            "\3\uffff\1\u014b\7\uffff\1\u0150\5\uffff\1\u014d\1\u0144\11"+
            "\uffff\1\u0155\1\uffff\1\u014e\6\uffff\1\u0159\5\uffff\1\u0157"+
            "\14\uffff\1\u0154\1\uffff\5\u0154\5\u0152\1\u0145\1\u0153\21"+
            "\uffff\3\u0141\4\uffff\1\u0142\13\uffff\1\u0146",
            "\1\31\3\uffff\3\31\1\uffff\1\31\6\uffff\1\31\25\uffff\1\31\1"+
            "\uffff\1\31\1\uffff\1\31\1\uffff\1\31\21\uffff\1\31\2\uffff"+
            "\1\31\11\uffff\1\31\4\uffff\1\31\2\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\7\uffff\1\31\5\uffff\2\31\11\uffff"+
            "\1\31\1\uffff\1\31\6\uffff\1\31\5\uffff\1\31\14\uffff\1\31\1"+
            "\uffff\14\31\21\uffff\3\31\4\uffff\1\31\13\uffff\1\u015d",
            "\1\u0167\3\72\1\111\1\66\1\104\4\uffff\2\72\4\uffff\1\31\1\uffff"+
            "\1\u0162\1\uffff\3\31\1\117\1\57\1\u0164\5\uffff\1\u0160\3\uffff"+
            "\1\u0163\1\uffff\1\107\1\u0165\1\uffff\1\u0166\1\67\3\uffff"+
            "\1\114\1\u015e\1\76\2\uffff\1\112\1\uffff\1\116\1\31\1\uffff"+
            "\1\56\1\uffff\1\31\1\uffff\1\31\4\uffff\1\u0120\1\110\5\uffff"+
            "\1\103\1\uffff\1\123\2\uffff\1\66\1\56\2\uffff\1\31\1\105\1"+
            "\uffff\1\u0167\1\uffff\1\113\2\uffff\1\75\1\uffff\1\u015f\3"+
            "\uffff\1\111\1\60\2\uffff\1\31\1\uffff\1\31\1\106\1\u0161\1"+
            "\31\3\uffff\1\31\1\120\2\uffff\1\u0168\2\uffff\1\u0123\1\31"+
            "\1\115\4\uffff\2\31\3\uffff\1\74\3\uffff\1\u0166\1\uffff\1\31"+
            "\1\121\1\31\1\uffff\1\70\2\uffff\1\66\1\100\1\31\5\uffff\1\31"+
            "\1\uffff\6\71\3\73\2\uffff\1\31\1\uffff\14\31\3\122\16\uffff"+
            "\3\31\4\uffff\1\31\13\uffff\1\31",
            "",
            "\1\u0167\3\72\1\111\1\66\1\104\4\uffff\2\72\4\uffff\1\u016b"+
            "\1\uffff\1\u0162\2\uffff\1\u016f\1\u017e\1\117\1\u0171\1\u0164"+
            "\11\uffff\1\u0163\1\uffff\1\107\1\u0165\1\uffff\1\u0166\1\67"+
            "\3\uffff\1\114\1\uffff\1\76\2\uffff\1\112\1\uffff\1\116\1\u0179"+
            "\1\uffff\1\u0183\1\uffff\1\u0174\6\uffff\1\u0120\1\110\5\uffff"+
            "\1\103\1\uffff\1\123\2\uffff\1\66\1\u0183\2\uffff\1\u0180\1"+
            "\105\1\uffff\1\u0167\1\uffff\1\113\2\uffff\1\75\5\uffff\1\111"+
            "\1\u0182\2\uffff\1\u0172\1\uffff\1\u0177\1\106\1\uffff\1\u0170"+
            "\3\uffff\1\u0173\1\120\2\uffff\1\u0168\2\uffff\1\u0123\1\u0178"+
            "\1\115\4\uffff\1\u0175\1\u016c\3\uffff\1\74\3\uffff\1\u0166"+
            "\1\uffff\1\u017d\1\121\1\u0176\1\uffff\1\70\2\uffff\1\66\1\100"+
            "\1\u0181\5\uffff\1\u017f\1\uffff\6\71\3\73\2\uffff\1\u017c\1"+
            "\uffff\5\u017c\5\u017a\1\u016d\1\u017b\3\122\16\uffff\3\u0169"+
            "\4\uffff\1\u016a\13\uffff\1\u016e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0186\4\uffff\1\u018a\1\u0199\1\uffff\1\u018c\34\uffff\1"+
            "\u0194\3\uffff\1\u018f\26\uffff\1\u019b\16\uffff\1\u019d\2\uffff"+
            "\1\u018d\1\uffff\1\u0192\2\uffff\1\u018b\3\uffff\1\u018e\7\uffff"+
            "\1\u0193\5\uffff\1\u0190\1\u0187\11\uffff\1\u0198\1\uffff\1"+
            "\u0191\6\uffff\1\u019c\5\uffff\1\u019a\14\uffff\1\u0197\1\uffff"+
            "\5\u0197\5\u0195\1\u0188\1\u0196\21\uffff\3\u0184\4\uffff\1"+
            "\u0185\13\uffff\1\u0189",
            "\1\u0167\3\72\1\111\1\66\1\104\4\uffff\2\72\4\uffff\1\u01a0"+
            "\1\uffff\1\u0162\2\uffff\1\u01a4\1\u01b3\1\117\1\u01a6\1\u0164"+
            "\11\uffff\1\u0163\1\uffff\1\107\1\u0165\1\uffff\1\u0166\1\67"+
            "\3\uffff\1\114\1\uffff\1\76\2\uffff\1\112\1\uffff\1\116\1\u01ae"+
            "\1\uffff\1\u0183\1\uffff\1\u01a9\6\uffff\1\u0120\1\110\5\uffff"+
            "\1\103\1\uffff\1\123\2\uffff\1\66\1\u0183\2\uffff\1\u01b5\1"+
            "\105\1\uffff\1\u0167\1\uffff\1\113\2\uffff\1\75\5\uffff\1\111"+
            "\1\u01b7\2\uffff\1\u01a7\1\uffff\1\u01ac\1\106\1\uffff\1\u01a5"+
            "\3\uffff\1\u01a8\1\120\2\uffff\1\u0168\2\uffff\1\u0123\1\u01ad"+
            "\1\115\4\uffff\1\u01aa\1\u01a1\3\uffff\1\74\3\uffff\1\u0166"+
            "\1\uffff\1\u01b2\1\121\1\u01ab\1\uffff\1\70\2\uffff\1\66\1\100"+
            "\1\u01b6\5\uffff\1\u01b4\1\uffff\6\71\3\73\2\uffff\1\u01b1\1"+
            "\uffff\5\u01b1\5\u01af\1\u01a2\1\u01b0\3\122\16\uffff\3\u019e"+
            "\4\uffff\1\u019f\13\uffff\1\u01a3",
            "\1\u0167\3\72\1\111\1\66\1\104\4\uffff\2\72\4\uffff\1\31\1\uffff"+
            "\1\u0162\1\uffff\3\31\1\117\1\u01bb\1\u0164\5\uffff\1\u01ba"+
            "\3\uffff\1\u0163\1\uffff\1\107\1\u0165\1\uffff\1\u0166\1\67"+
            "\3\uffff\1\114\1\u015e\1\76\2\uffff\1\112\1\uffff\1\116\1\31"+
            "\1\uffff\1\u01b8\1\uffff\1\31\1\uffff\1\31\4\uffff\1\u0120\1"+
            "\110\5\uffff\1\103\1\uffff\1\123\2\uffff\1\66\1\u01b8\2\uffff"+
            "\1\31\1\105\1\uffff\1\u0167\1\uffff\1\113\2\uffff\1\75\1\uffff"+
            "\1\u01b9\3\uffff\1\111\1\u01bc\2\uffff\1\31\1\uffff\1\31\1\106"+
            "\1\u0161\1\31\3\uffff\1\31\1\120\2\uffff\1\u0168\2\uffff\1\u0123"+
            "\1\31\1\115\4\uffff\2\31\3\uffff\1\74\3\uffff\1\u0166\1\uffff"+
            "\1\31\1\121\1\31\1\uffff\1\70\2\uffff\1\66\1\100\1\31\5\uffff"+
            "\1\31\1\uffff\6\71\3\73\2\uffff\1\31\1\uffff\14\31\3\122\16"+
            "\uffff\3\31\4\uffff\1\31\13\uffff\1\31",
            "\1\u011b\1\31\2\uffff\1\111\1\u011c\1\104\14\uffff\1\u0116\4"+
            "\uffff\1\117\1\uffff\1\u0118\5\uffff\1\u0115\3\uffff\1\u0117"+
            "\1\uffff\1\107\1\u0119\1\uffff\1\u011a\1\u011e\3\uffff\1\114"+
            "\1\u01bd\1\76\2\uffff\1\112\1\uffff\1\116\2\uffff\1\u011d\1"+
            "\31\7\uffff\1\u0120\1\110\5\uffff\1\103\4\uffff\1\u011c\1\u011d"+
            "\3\uffff\1\105\1\uffff\1\u011b\1\uffff\1\113\2\uffff\1\75\1"+
            "\uffff\1\u0115\3\uffff\1\111\1\u011c\5\uffff\1\106\1\u0114\10"+
            "\uffff\1\u0122\2\uffff\1\u0123\1\uffff\1\115\5\uffff\1\u0113"+
            "\3\uffff\1\74\3\uffff\1\u011a\5\uffff\1\u011f\2\uffff\1\u011c"+
            "\1\u0121\110\uffff\1\31",
            "\1\u01be\21\uffff\1\u01bf\56\uffff\1\u00c9",
            "\1\u01bf\56\uffff\1\u00c9",
            "\1\36",
            "\1\u01c0\100\uffff\1\u01c1",
            "\1\137\56\uffff\1\41",
            "\1\u01c2\100\uffff\1\41\37\uffff\1\u01c3",
            "\1\141\56\uffff\1\44",
            "\1\u01c4\100\uffff\1\44",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA117_eot = DFA.unpackEncodedString(DFA117_eotS);
    static final short[] DFA117_eof = DFA.unpackEncodedString(DFA117_eofS);
    static final char[] DFA117_min = DFA.unpackEncodedStringToUnsignedChars(DFA117_minS);
    static final char[] DFA117_max = DFA.unpackEncodedStringToUnsignedChars(DFA117_maxS);
    static final short[] DFA117_accept = DFA.unpackEncodedString(DFA117_acceptS);
    static final short[] DFA117_special = DFA.unpackEncodedString(DFA117_specialS);
    static final short[][] DFA117_transition;

    static {
        int numStates = DFA117_transitionS.length;
        DFA117_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA117_transition[i] = DFA.unpackEncodedString(DFA117_transitionS[i]);
        }
    }

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = DFA117_eot;
            this.eof = DFA117_eof;
            this.min = DFA117_min;
            this.max = DFA117_max;
            this.accept = DFA117_accept;
            this.special = DFA117_special;
            this.transition = DFA117_transition;
        }
        public String getDescription() {
            return "645:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_11 = input.LA(1);

                         
                        int index117_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_11==COLONSi) ) {s = 23;}

                        else if ( (LA117_11==STARSi) ) {s = 24;}

                        else if ( (LA117_11==EOF||(LA117_11>=PIPESi && LA117_11<=WHERE)||(LA117_11>=LEFTBRACESi && LA117_11<=NOTEQUALSi)||(LA117_11>=ELSE && LA117_11<=LESSTHANSi)||(LA117_11>=FOR && LA117_11<=INSTANCE)||(LA117_11>=EXCEPT && LA117_11<=TO)||LA117_11==SATISFIES||LA117_11==SEMICOLONSi||LA117_11==EMPTY||LA117_11==CASE||LA117_11==MINUSSi||(LA117_11>=COMMASi && LA117_11<=LET)||LA117_11==SCORE||LA117_11==RIGHTBRACKETSi||LA117_11==LEVELS||LA117_11==DIV||LA117_11==AT||LA117_11==ORDER||LA117_11==UNION||LA117_11==COLLATION||LA117_11==OR||LA117_11==DESCENDING||LA117_11==STABLE||LA117_11==WITHOUT||(LA117_11>=EXTERNAL && LA117_11<=RIGHTPARENTHESISSi)||LA117_11==RETURN||LA117_11==DEFAULT||LA117_11==AND||LA117_11==INTERSECT||LA117_11==TIMES||(LA117_11>=ASSIGNMENTOPERATOR && LA117_11<=FTCONTAINS)||(LA117_11>=MOD && LA117_11<=RIGHTBRACESi)||LA117_11==IN||(LA117_11>=EQ && LA117_11<=NODEAFTERSi)||(LA117_11>=WORDS && LA117_11<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_11==PLUSSi) ) {s = 26;}

                        else if ( (LA117_11==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_33 = input.LA(1);

                         
                        int index117_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_33==EOF||(LA117_33>=PIPESi && LA117_33<=WHERE)||(LA117_33>=LEFTBRACESi && LA117_33<=NOTEQUALSi)||(LA117_33>=ELSE && LA117_33<=LESSTHANSi)||(LA117_33>=FOR && LA117_33<=INSTANCE)||(LA117_33>=EXCEPT && LA117_33<=TO)||LA117_33==SATISFIES||LA117_33==SEMICOLONSi||LA117_33==EMPTY||LA117_33==CASE||LA117_33==MINUSSi||(LA117_33>=COMMASi && LA117_33<=LET)||LA117_33==SCORE||LA117_33==RIGHTBRACKETSi||LA117_33==LEVELS||LA117_33==DIV||LA117_33==AT||LA117_33==ORDER||LA117_33==UNION||LA117_33==COLLATION||LA117_33==OR||LA117_33==DESCENDING||LA117_33==STABLE||LA117_33==WITHOUT||(LA117_33>=EXTERNAL && LA117_33<=RIGHTPARENTHESISSi)||LA117_33==RETURN||LA117_33==DEFAULT||LA117_33==AND||LA117_33==INTERSECT||LA117_33==TIMES||(LA117_33>=ASSIGNMENTOPERATOR && LA117_33<=FTCONTAINS)||(LA117_33>=MOD && LA117_33<=RIGHTBRACESi)||LA117_33==IN||(LA117_33>=EQ && LA117_33<=NODEAFTERSi)||(LA117_33>=WORDS && LA117_33<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_33==STARSi) ) {s = 24;}

                        else if ( (LA117_33==PLUSSi) ) {s = 26;}

                        else if ( (LA117_33==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA117_99 = input.LA(1);

                         
                        int index117_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_99==EOF||(LA117_99>=PIPESi && LA117_99<=WHERE)||(LA117_99>=LEFTBRACESi && LA117_99<=NOTEQUALSi)||(LA117_99>=ELSE && LA117_99<=LESSTHANSi)||(LA117_99>=FOR && LA117_99<=INSTANCE)||(LA117_99>=EXCEPT && LA117_99<=TO)||LA117_99==SATISFIES||LA117_99==SEMICOLONSi||LA117_99==EMPTY||LA117_99==CASE||LA117_99==MINUSSi||(LA117_99>=COMMASi && LA117_99<=LET)||LA117_99==SCORE||LA117_99==RIGHTBRACKETSi||LA117_99==LEVELS||LA117_99==DIV||LA117_99==AT||LA117_99==ORDER||LA117_99==UNION||LA117_99==COLLATION||LA117_99==OR||LA117_99==DESCENDING||LA117_99==STABLE||LA117_99==WITHOUT||(LA117_99>=EXTERNAL && LA117_99<=RIGHTPARENTHESISSi)||LA117_99==RETURN||LA117_99==DEFAULT||LA117_99==AND||LA117_99==INTERSECT||LA117_99==TIMES||(LA117_99>=ASSIGNMENTOPERATOR && LA117_99<=FTCONTAINS)||(LA117_99>=MOD && LA117_99<=RIGHTBRACESi)||LA117_99==IN||(LA117_99>=EQ && LA117_99<=NODEAFTERSi)||(LA117_99>=WORDS && LA117_99<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_99==STARSi) ) {s = 24;}

                        else if ( (LA117_99==PLUSSi) ) {s = 26;}

                        else if ( (LA117_99==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_99);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA117_104 = input.LA(1);

                         
                        int index117_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_104);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA117_26 = input.LA(1);

                         
                        int index117_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_26==LEFTBRACESi) && (synpred4())) {s = 49;}

                        else if ( (LA117_26==EXTERNAL) && (synpred4())) {s = 50;}

                        else if ( (LA117_26==RETURN) && (synpred4())) {s = 51;}

                        else if ( (LA117_26==EXCEPT||LA117_26==INTERSECT) && (synpred4())) {s = 52;}

                        else if ( (LA117_26==PIPESi||LA117_26==UNION) && (synpred4())) {s = 53;}

                        else if ( (LA117_26==STARSi) ) {s = 89;}

                        else if ( (LA117_26==MINUSSi||LA117_26==PLUSSi) ) {s = 90;}

                        else if ( (LA117_26==TO) && (synpred4())) {s = 55;}

                        else if ( (LA117_26==FTCONTAINS) && (synpred4())) {s = 56;}

                        else if ( ((LA117_26>=EQ && LA117_26<=GE)) && (synpred4())) {s = 57;}

                        else if ( (LA117_26==LESSTHANSi) ) {s = 91;}

                        else if ( ((LA117_26>=IS && LA117_26<=NODEAFTERSi)) && (synpred4())) {s = 59;}

                        else if ( (LA117_26==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_26==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_26==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_26==COMMASi) && (synpred4())) {s = 63;}

                        else if ( (LA117_26==RIGHTBRACESi) && (synpred4())) {s = 64;}

                        else if ( (LA117_26==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_26==RIGHTPARENTHESISSi) && (synpred4())) {s = 66;}

                        else if ( (LA117_26==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_26==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_26==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_26==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_26==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_26==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_26==ASCENDING||LA117_26==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_26==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_26==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_26==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_26==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_26==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_26==ELSE) && (synpred4())) {s = 79;}

                        else if ( (LA117_26==WITHOUT) && (synpred4())) {s = 80;}

                        else if ( (LA117_26==TIMES) && (synpred4())) {s = 81;}

                        else if ( ((LA117_26>=WORDS && LA117_26<=PARAGRAPHS)) && (synpred4())) {s = 82;}

                        else if ( (LA117_26==LEVELS) && (synpred4())) {s = 83;}

                        else if ( (LA117_26==INSTANCE) && (synpred4())) {s = 84;}

                        else if ( (LA117_26==ASSIGNMENTOPERATOR) && (synpred4())) {s = 85;}

                        else if ( (LA117_26==AT) && (synpred4())) {s = 86;}

                        else if ( (LA117_26==SCORE) && (synpred4())) {s = 87;}

                        else if ( (LA117_26==IN) && (synpred4())) {s = 88;}

                        else if ( (LA117_26==DOLLARSi||(LA117_26>=LEFTPRAGMA && LA117_26<=DOCUMENTNODE)||LA117_26==SLASH||LA117_26==PROCESSING_INSTRUCTION||LA117_26==DOCUMENT||LA117_26==VALIDATE||LA117_26==SCHEMAATTRIBUTE||LA117_26==DOUBLESLASH||LA117_26==LEFTXMLCOMMENT||LA117_26==TEXT||LA117_26==UNORDERED||LA117_26==LEFTPITARGET||LA117_26==COMMENT||(LA117_26>=ELEMENT && LA117_26<=LEFTPARENTHESISSi)||LA117_26==ATSi||LA117_26==ATTRIBUTE||LA117_26==NODE||LA117_26==SCHEMAELEMENT||LA117_26==CHILD||(LA117_26>=DESCENDANT && LA117_26<=DOTDOT)||(LA117_26>=IntegerLiteral && LA117_26<=DoubleLiteral)||LA117_26==StringLiteral||LA117_26==NCName) ) {s = 25;}

                        else if ( ((LA117_26>=BIGGERTHANSi && LA117_26<=LESSTHANOREQUALSi)||(LA117_26>=EQUALSi && LA117_26<=NOTEQUALSi)) && (synpred4())) {s = 58;}

                        else if ( (LA117_26==IDIV||LA117_26==DIV||LA117_26==MOD) && (synpred4())) {s = 54;}

                         
                        input.seek(index117_26);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA117_47 = input.LA(1);

                         
                        int index117_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_47==NCName) ) {s = 133;}

                        else if ( (LA117_47==MINUSSi||LA117_47==PLUSSi) && (synpred4())) {s = 134;}

                        else if ( (LA117_47==VALIDATE) && (synpred4())) {s = 135;}

                        else if ( (LA117_47==DOUBLESLASH) && (synpred4())) {s = 136;}

                        else if ( (LA117_47==SLASH) && (synpred4())) {s = 137;}

                        else if ( ((LA117_47>=IntegerLiteral && LA117_47<=DoubleLiteral)) && (synpred4())) {s = 138;}

                        else if ( (LA117_47==StringLiteral) && (synpred4())) {s = 139;}

                        else if ( (LA117_47==DOLLARSi) && (synpred4())) {s = 140;}

                        else if ( (LA117_47==LEFTPARENTHESISSi) && (synpred4())) {s = 141;}

                        else if ( (LA117_47==DOT) && (synpred4())) {s = 142;}

                        else if ( (LA117_47==ORDERED) && (synpred4())) {s = 143;}

                        else if ( (LA117_47==UNORDERED) && (synpred4())) {s = 144;}

                        else if ( (LA117_47==LESSTHANSi) && (synpred4())) {s = 145;}

                        else if ( (LA117_47==LEFTXMLCOMMENT) && (synpred4())) {s = 146;}

                        else if ( (LA117_47==LEFTPITARGET) && (synpred4())) {s = 147;}

                        else if ( (LA117_47==DOCUMENT) && (synpred4())) {s = 148;}

                        else if ( (LA117_47==ELEMENT) && (synpred4())) {s = 149;}

                        else if ( (LA117_47==ATTRIBUTE) && (synpred4())) {s = 150;}

                        else if ( (LA117_47==TEXT) && (synpred4())) {s = 151;}

                        else if ( (LA117_47==COMMENT) && (synpred4())) {s = 152;}

                        else if ( (LA117_47==PROCESSING_INSTRUCTION) && (synpred4())) {s = 153;}

                        else if ( ((LA117_47>=PARENT && LA117_47<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 154;}

                        else if ( (LA117_47==DOTDOT) && (synpred4())) {s = 155;}

                        else if ( (LA117_47==CHILD||(LA117_47>=DESCENDANT && LA117_47<=FOLLOWING)) && (synpred4())) {s = 156;}

                        else if ( (LA117_47==ATSi) && (synpred4())) {s = 157;}

                        else if ( (LA117_47==DOCUMENTNODE) && (synpred4())) {s = 158;}

                        else if ( (LA117_47==SCHEMAELEMENT) && (synpred4())) {s = 159;}

                        else if ( (LA117_47==SCHEMAATTRIBUTE) && (synpred4())) {s = 160;}

                        else if ( (LA117_47==NODE) && (synpred4())) {s = 161;}

                        else if ( (LA117_47==STARSi) && (synpred4())) {s = 162;}

                        else if ( (LA117_47==LEFTPRAGMA) && (synpred4())) {s = 163;}

                         
                        input.seek(index117_47);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA117_91 = input.LA(1);

                         
                        int index117_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_91==MINUSSi||LA117_91==PLUSSi) && (synpred4())) {s = 134;}

                        else if ( (LA117_91==VALIDATE) && (synpred4())) {s = 135;}

                        else if ( (LA117_91==DOUBLESLASH) && (synpred4())) {s = 136;}

                        else if ( (LA117_91==SLASH) && (synpred4())) {s = 137;}

                        else if ( ((LA117_91>=IntegerLiteral && LA117_91<=DoubleLiteral)) && (synpred4())) {s = 138;}

                        else if ( (LA117_91==StringLiteral) && (synpred4())) {s = 139;}

                        else if ( (LA117_91==DOLLARSi) && (synpred4())) {s = 140;}

                        else if ( (LA117_91==LEFTPARENTHESISSi) && (synpred4())) {s = 141;}

                        else if ( (LA117_91==DOT) && (synpred4())) {s = 142;}

                        else if ( (LA117_91==NCName) ) {s = 198;}

                        else if ( (LA117_91==ORDERED) && (synpred4())) {s = 143;}

                        else if ( (LA117_91==UNORDERED) && (synpred4())) {s = 144;}

                        else if ( (LA117_91==LESSTHANSi) && (synpred4())) {s = 145;}

                        else if ( (LA117_91==LEFTXMLCOMMENT) && (synpred4())) {s = 146;}

                        else if ( (LA117_91==LEFTPITARGET) && (synpred4())) {s = 147;}

                        else if ( (LA117_91==DOCUMENT) && (synpred4())) {s = 148;}

                        else if ( (LA117_91==ELEMENT) && (synpred4())) {s = 149;}

                        else if ( (LA117_91==ATTRIBUTE) && (synpred4())) {s = 150;}

                        else if ( (LA117_91==TEXT) && (synpred4())) {s = 151;}

                        else if ( (LA117_91==COMMENT) && (synpred4())) {s = 152;}

                        else if ( (LA117_91==PROCESSING_INSTRUCTION) && (synpred4())) {s = 153;}

                        else if ( ((LA117_91>=PARENT && LA117_91<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 154;}

                        else if ( (LA117_91==DOTDOT) && (synpred4())) {s = 155;}

                        else if ( (LA117_91==CHILD||(LA117_91>=DESCENDANT && LA117_91<=FOLLOWING)) && (synpred4())) {s = 156;}

                        else if ( (LA117_91==ATSi) && (synpred4())) {s = 157;}

                        else if ( (LA117_91==DOCUMENTNODE) && (synpred4())) {s = 158;}

                        else if ( (LA117_91==SCHEMAELEMENT) && (synpred4())) {s = 159;}

                        else if ( (LA117_91==SCHEMAATTRIBUTE) && (synpred4())) {s = 160;}

                        else if ( (LA117_91==NODE) && (synpred4())) {s = 161;}

                        else if ( (LA117_91==STARSi) && (synpred4())) {s = 162;}

                        else if ( (LA117_91==LEFTPRAGMA) && (synpred4())) {s = 163;}

                         
                        input.seek(index117_91);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA117_41 = input.LA(1);

                         
                        int index117_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_41==STARSi) ) {s = 24;}

                        else if ( (LA117_41==EOF||(LA117_41>=PIPESi && LA117_41<=WHERE)||(LA117_41>=LEFTBRACESi && LA117_41<=NOTEQUALSi)||(LA117_41>=ELSE && LA117_41<=LESSTHANSi)||(LA117_41>=FOR && LA117_41<=INSTANCE)||(LA117_41>=EXCEPT && LA117_41<=TO)||LA117_41==SATISFIES||LA117_41==SEMICOLONSi||LA117_41==EMPTY||LA117_41==CASE||LA117_41==MINUSSi||(LA117_41>=COMMASi && LA117_41<=LET)||LA117_41==SCORE||LA117_41==RIGHTBRACKETSi||LA117_41==LEVELS||LA117_41==DIV||LA117_41==AT||LA117_41==ORDER||LA117_41==UNION||LA117_41==COLLATION||LA117_41==OR||LA117_41==DESCENDING||LA117_41==STABLE||LA117_41==WITHOUT||(LA117_41>=EXTERNAL && LA117_41<=RIGHTPARENTHESISSi)||LA117_41==RETURN||LA117_41==DEFAULT||LA117_41==AND||LA117_41==INTERSECT||LA117_41==TIMES||(LA117_41>=ASSIGNMENTOPERATOR && LA117_41<=FTCONTAINS)||(LA117_41>=MOD && LA117_41<=RIGHTBRACESi)||LA117_41==IN||(LA117_41>=EQ && LA117_41<=NODEAFTERSi)||(LA117_41>=WORDS && LA117_41<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_41==PLUSSi) ) {s = 26;}

                        else if ( (LA117_41==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_41);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA117_40 = input.LA(1);

                         
                        int index117_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_40==STARSi) ) {s = 24;}

                        else if ( (LA117_40==EOF||(LA117_40>=PIPESi && LA117_40<=WHERE)||(LA117_40>=LEFTBRACESi && LA117_40<=NOTEQUALSi)||(LA117_40>=ELSE && LA117_40<=LESSTHANSi)||(LA117_40>=FOR && LA117_40<=INSTANCE)||(LA117_40>=EXCEPT && LA117_40<=TO)||LA117_40==SATISFIES||LA117_40==SEMICOLONSi||LA117_40==EMPTY||LA117_40==CASE||LA117_40==MINUSSi||(LA117_40>=COMMASi && LA117_40<=LET)||LA117_40==SCORE||LA117_40==RIGHTBRACKETSi||LA117_40==LEVELS||LA117_40==DIV||LA117_40==AT||LA117_40==ORDER||LA117_40==UNION||LA117_40==COLLATION||LA117_40==OR||LA117_40==DESCENDING||LA117_40==STABLE||LA117_40==WITHOUT||(LA117_40>=EXTERNAL && LA117_40<=RIGHTPARENTHESISSi)||LA117_40==RETURN||LA117_40==DEFAULT||LA117_40==AND||LA117_40==INTERSECT||LA117_40==TIMES||(LA117_40>=ASSIGNMENTOPERATOR && LA117_40<=FTCONTAINS)||(LA117_40>=MOD && LA117_40<=RIGHTBRACESi)||LA117_40==IN||(LA117_40>=EQ && LA117_40<=NODEAFTERSi)||(LA117_40>=WORDS && LA117_40<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_40==PLUSSi) ) {s = 26;}

                        else if ( (LA117_40==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_40);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA117_45 = input.LA(1);

                         
                        int index117_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_45==STARSi) ) {s = 24;}

                        else if ( (LA117_45==EOF||(LA117_45>=PIPESi && LA117_45<=WHERE)||(LA117_45>=LEFTBRACESi && LA117_45<=NOTEQUALSi)||(LA117_45>=ELSE && LA117_45<=LESSTHANSi)||(LA117_45>=FOR && LA117_45<=INSTANCE)||(LA117_45>=EXCEPT && LA117_45<=TO)||LA117_45==SATISFIES||LA117_45==SEMICOLONSi||LA117_45==EMPTY||LA117_45==CASE||LA117_45==MINUSSi||(LA117_45>=COMMASi && LA117_45<=LET)||LA117_45==SCORE||LA117_45==RIGHTBRACKETSi||LA117_45==LEVELS||LA117_45==DIV||LA117_45==AT||LA117_45==ORDER||LA117_45==UNION||LA117_45==COLLATION||LA117_45==OR||LA117_45==DESCENDING||LA117_45==STABLE||LA117_45==WITHOUT||(LA117_45>=EXTERNAL && LA117_45<=RIGHTPARENTHESISSi)||LA117_45==RETURN||LA117_45==DEFAULT||LA117_45==AND||LA117_45==INTERSECT||LA117_45==TIMES||(LA117_45>=ASSIGNMENTOPERATOR && LA117_45<=FTCONTAINS)||(LA117_45>=MOD && LA117_45<=RIGHTBRACESi)||LA117_45==IN||(LA117_45>=EQ && LA117_45<=NODEAFTERSi)||(LA117_45>=WORDS && LA117_45<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_45==PLUSSi) ) {s = 26;}

                        else if ( (LA117_45==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_45);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA117_36 = input.LA(1);

                         
                        int index117_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_36==EOF||(LA117_36>=PIPESi && LA117_36<=WHERE)||(LA117_36>=LEFTBRACESi && LA117_36<=NOTEQUALSi)||(LA117_36>=ELSE && LA117_36<=LESSTHANSi)||(LA117_36>=FOR && LA117_36<=INSTANCE)||(LA117_36>=EXCEPT && LA117_36<=TO)||LA117_36==SATISFIES||LA117_36==SEMICOLONSi||LA117_36==EMPTY||LA117_36==CASE||LA117_36==MINUSSi||(LA117_36>=COMMASi && LA117_36<=LET)||LA117_36==SCORE||LA117_36==RIGHTBRACKETSi||LA117_36==LEVELS||LA117_36==DIV||LA117_36==AT||LA117_36==ORDER||LA117_36==UNION||LA117_36==COLLATION||LA117_36==OR||LA117_36==DESCENDING||LA117_36==STABLE||LA117_36==WITHOUT||(LA117_36>=EXTERNAL && LA117_36<=RIGHTPARENTHESISSi)||LA117_36==RETURN||LA117_36==DEFAULT||LA117_36==AND||LA117_36==INTERSECT||LA117_36==TIMES||(LA117_36>=ASSIGNMENTOPERATOR && LA117_36<=FTCONTAINS)||(LA117_36>=MOD && LA117_36<=RIGHTBRACESi)||LA117_36==IN||(LA117_36>=EQ && LA117_36<=NODEAFTERSi)||(LA117_36>=WORDS && LA117_36<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_36==STARSi) ) {s = 24;}

                        else if ( (LA117_36==PLUSSi) ) {s = 26;}

                        else if ( (LA117_36==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_36);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA117_101 = input.LA(1);

                         
                        int index117_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_101==STARSi) ) {s = 24;}

                        else if ( (LA117_101==EOF||(LA117_101>=PIPESi && LA117_101<=WHERE)||(LA117_101>=LEFTBRACESi && LA117_101<=NOTEQUALSi)||(LA117_101>=ELSE && LA117_101<=LESSTHANSi)||(LA117_101>=FOR && LA117_101<=INSTANCE)||(LA117_101>=EXCEPT && LA117_101<=TO)||LA117_101==SATISFIES||LA117_101==SEMICOLONSi||LA117_101==EMPTY||LA117_101==CASE||LA117_101==MINUSSi||(LA117_101>=COMMASi && LA117_101<=LET)||LA117_101==SCORE||LA117_101==RIGHTBRACKETSi||LA117_101==LEVELS||LA117_101==DIV||LA117_101==AT||LA117_101==ORDER||LA117_101==UNION||LA117_101==COLLATION||LA117_101==OR||LA117_101==DESCENDING||LA117_101==STABLE||LA117_101==WITHOUT||(LA117_101>=EXTERNAL && LA117_101<=RIGHTPARENTHESISSi)||LA117_101==RETURN||LA117_101==DEFAULT||LA117_101==AND||LA117_101==INTERSECT||LA117_101==TIMES||(LA117_101>=ASSIGNMENTOPERATOR && LA117_101<=FTCONTAINS)||(LA117_101>=MOD && LA117_101<=RIGHTBRACESi)||LA117_101==IN||(LA117_101>=EQ && LA117_101<=NODEAFTERSi)||(LA117_101>=WORDS && LA117_101<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_101==PLUSSi) ) {s = 26;}

                        else if ( (LA117_101==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_101);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA117_48 = input.LA(1);

                         
                        int index117_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_48==EOF||(LA117_48>=PIPESi && LA117_48<=WHERE)||(LA117_48>=EQUALSi && LA117_48<=NOTEQUALSi)||LA117_48==CAST||LA117_48==ELSE||LA117_48==TREAT||LA117_48==CASTABLE||(LA117_48>=FOR && LA117_48<=INSTANCE)||(LA117_48>=EXCEPT && LA117_48<=TO)||(LA117_48>=SATISFIES && LA117_48<=SEMICOLONSi)||LA117_48==EMPTY||LA117_48==CASE||(LA117_48>=COMMASi && LA117_48<=LET)||LA117_48==RIGHTBRACKETSi||LA117_48==LEVELS||LA117_48==DIV||LA117_48==ORDER||LA117_48==UNION||LA117_48==COLLATION||LA117_48==OR||LA117_48==DESCENDING||(LA117_48>=STABLE && LA117_48<=LEFTBRACKETSi)||LA117_48==WITHOUT||LA117_48==RIGHTPARENTHESISSi||LA117_48==RETURN||LA117_48==DEFAULT||LA117_48==AND||LA117_48==INTERSECT||LA117_48==TIMES||LA117_48==FTCONTAINS||(LA117_48>=MOD && LA117_48<=RIGHTBRACESi)||(LA117_48>=EQ && LA117_48<=NODEAFTERSi)||(LA117_48>=WORDS && LA117_48<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_48==DOUBLESLASH) ) {s = 164;}

                        else if ( (LA117_48==MINUSSi||LA117_48==PLUSSi) ) {s = 165;}

                        else if ( (LA117_48==LESSTHANSi) ) {s = 166;}

                        else if ( (LA117_48==STARSi) ) {s = 167;}

                        else if ( (LA117_48==VALIDATE) && (synpred4())) {s = 168;}

                        else if ( (LA117_48==SLASH) ) {s = 169;}

                        else if ( ((LA117_48>=IntegerLiteral && LA117_48<=DoubleLiteral)) && (synpred4())) {s = 170;}

                        else if ( (LA117_48==StringLiteral) && (synpred4())) {s = 171;}

                        else if ( (LA117_48==DOLLARSi) && (synpred4())) {s = 172;}

                        else if ( (LA117_48==LEFTPARENTHESISSi) && (synpred4())) {s = 173;}

                        else if ( (LA117_48==DOT) && (synpred4())) {s = 174;}

                        else if ( (LA117_48==NCName) && (synpred4())) {s = 175;}

                        else if ( (LA117_48==ORDERED) && (synpred4())) {s = 176;}

                        else if ( (LA117_48==UNORDERED) && (synpred4())) {s = 177;}

                        else if ( (LA117_48==LEFTXMLCOMMENT) && (synpred4())) {s = 178;}

                        else if ( (LA117_48==LEFTPITARGET) && (synpred4())) {s = 179;}

                        else if ( (LA117_48==DOCUMENT) && (synpred4())) {s = 180;}

                        else if ( (LA117_48==ELEMENT) && (synpred4())) {s = 181;}

                        else if ( (LA117_48==ATTRIBUTE) && (synpred4())) {s = 182;}

                        else if ( (LA117_48==TEXT) && (synpred4())) {s = 183;}

                        else if ( (LA117_48==COMMENT) && (synpred4())) {s = 184;}

                        else if ( (LA117_48==PROCESSING_INSTRUCTION) && (synpred4())) {s = 185;}

                        else if ( ((LA117_48>=PARENT && LA117_48<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 186;}

                        else if ( (LA117_48==DOTDOT) && (synpred4())) {s = 187;}

                        else if ( (LA117_48==CHILD||(LA117_48>=DESCENDANT && LA117_48<=FOLLOWING)) && (synpred4())) {s = 188;}

                        else if ( (LA117_48==ATSi) && (synpred4())) {s = 189;}

                        else if ( (LA117_48==DOCUMENTNODE) && (synpred4())) {s = 190;}

                        else if ( (LA117_48==SCHEMAELEMENT) && (synpred4())) {s = 191;}

                        else if ( (LA117_48==SCHEMAATTRIBUTE) && (synpred4())) {s = 192;}

                        else if ( (LA117_48==NODE) && (synpred4())) {s = 193;}

                        else if ( (LA117_48==LEFTPRAGMA) && (synpred4())) {s = 194;}

                         
                        input.seek(index117_48);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA117_108 = input.LA(1);

                         
                        int index117_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_108);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA117_109 = input.LA(1);

                         
                        int index117_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_109);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA117_105 = input.LA(1);

                         
                        int index117_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_105);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA117_24 = input.LA(1);

                         
                        int index117_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_24==MINUSSi||LA117_24==PLUSSi) ) {s = 46;}

                        else if ( (LA117_24==DOLLARSi||(LA117_24>=LEFTPRAGMA && LA117_24<=DOCUMENTNODE)||LA117_24==SLASH||LA117_24==PROCESSING_INSTRUCTION||LA117_24==DOCUMENT||LA117_24==VALIDATE||LA117_24==SCHEMAATTRIBUTE||LA117_24==DOUBLESLASH||LA117_24==LEFTXMLCOMMENT||LA117_24==TEXT||LA117_24==UNORDERED||LA117_24==LEFTPITARGET||LA117_24==COMMENT||(LA117_24>=ELEMENT && LA117_24<=LEFTPARENTHESISSi)||LA117_24==ATSi||LA117_24==ATTRIBUTE||LA117_24==NODE||LA117_24==SCHEMAELEMENT||LA117_24==CHILD||(LA117_24>=DESCENDANT && LA117_24<=DOTDOT)||(LA117_24>=IntegerLiteral && LA117_24<=DoubleLiteral)||LA117_24==StringLiteral||LA117_24==NCName) ) {s = 25;}

                        else if ( (LA117_24==LESSTHANSi) ) {s = 47;}

                        else if ( (LA117_24==STARSi) ) {s = 48;}

                        else if ( (LA117_24==LEFTBRACESi) && (synpred4())) {s = 49;}

                        else if ( (LA117_24==EXTERNAL) && (synpred4())) {s = 50;}

                        else if ( (LA117_24==RETURN) && (synpred4())) {s = 51;}

                        else if ( (LA117_24==EXCEPT||LA117_24==INTERSECT) && (synpred4())) {s = 52;}

                        else if ( (LA117_24==PIPESi||LA117_24==UNION) && (synpred4())) {s = 53;}

                        else if ( (LA117_24==IDIV||LA117_24==DIV||LA117_24==MOD) && (synpred4())) {s = 54;}

                        else if ( (LA117_24==TO) && (synpred4())) {s = 55;}

                        else if ( (LA117_24==FTCONTAINS) && (synpred4())) {s = 56;}

                        else if ( ((LA117_24>=EQ && LA117_24<=GE)) && (synpred4())) {s = 57;}

                        else if ( ((LA117_24>=BIGGERTHANSi && LA117_24<=LESSTHANOREQUALSi)||(LA117_24>=EQUALSi && LA117_24<=NOTEQUALSi)) && (synpred4())) {s = 58;}

                        else if ( ((LA117_24>=IS && LA117_24<=NODEAFTERSi)) && (synpred4())) {s = 59;}

                        else if ( (LA117_24==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_24==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_24==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_24==COMMASi) && (synpred4())) {s = 63;}

                        else if ( (LA117_24==RIGHTBRACESi) && (synpred4())) {s = 64;}

                        else if ( (LA117_24==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_24==RIGHTPARENTHESISSi) && (synpred4())) {s = 66;}

                        else if ( (LA117_24==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_24==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_24==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_24==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_24==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_24==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_24==ASCENDING||LA117_24==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_24==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_24==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_24==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_24==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_24==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_24==ELSE) && (synpred4())) {s = 79;}

                        else if ( (LA117_24==WITHOUT) && (synpred4())) {s = 80;}

                        else if ( (LA117_24==TIMES) && (synpred4())) {s = 81;}

                        else if ( ((LA117_24>=WORDS && LA117_24<=PARAGRAPHS)) && (synpred4())) {s = 82;}

                        else if ( (LA117_24==LEVELS) && (synpred4())) {s = 83;}

                        else if ( (LA117_24==INSTANCE) && (synpred4())) {s = 84;}

                        else if ( (LA117_24==ASSIGNMENTOPERATOR) && (synpred4())) {s = 85;}

                        else if ( (LA117_24==AT) && (synpred4())) {s = 86;}

                        else if ( (LA117_24==SCORE) && (synpred4())) {s = 87;}

                        else if ( (LA117_24==IN) && (synpred4())) {s = 88;}

                         
                        input.seek(index117_24);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA117_44 = input.LA(1);

                         
                        int index117_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_44==STARSi) ) {s = 24;}

                        else if ( (LA117_44==EOF||(LA117_44>=PIPESi && LA117_44<=WHERE)||(LA117_44>=LEFTBRACESi && LA117_44<=NOTEQUALSi)||(LA117_44>=ELSE && LA117_44<=LESSTHANSi)||(LA117_44>=FOR && LA117_44<=INSTANCE)||(LA117_44>=EXCEPT && LA117_44<=TO)||LA117_44==SATISFIES||LA117_44==SEMICOLONSi||LA117_44==EMPTY||LA117_44==CASE||LA117_44==MINUSSi||(LA117_44>=COMMASi && LA117_44<=LET)||LA117_44==SCORE||LA117_44==RIGHTBRACKETSi||LA117_44==LEVELS||LA117_44==DIV||LA117_44==AT||LA117_44==ORDER||LA117_44==UNION||LA117_44==COLLATION||LA117_44==OR||LA117_44==DESCENDING||LA117_44==STABLE||LA117_44==WITHOUT||(LA117_44>=EXTERNAL && LA117_44<=RIGHTPARENTHESISSi)||LA117_44==RETURN||LA117_44==DEFAULT||LA117_44==AND||LA117_44==INTERSECT||LA117_44==TIMES||(LA117_44>=ASSIGNMENTOPERATOR && LA117_44<=FTCONTAINS)||(LA117_44>=MOD && LA117_44<=RIGHTBRACESi)||LA117_44==IN||(LA117_44>=EQ && LA117_44<=NODEAFTERSi)||(LA117_44>=WORDS && LA117_44<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_44==PLUSSi) ) {s = 26;}

                        else if ( (LA117_44==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_44);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA117_110 = input.LA(1);

                         
                        int index117_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_110);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA117_133 = input.LA(1);

                         
                        int index117_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_133==COLONSi) ) {s = 274;}

                        else if ( (LA117_133==LEFTPARENTHESISSi) && (synpred4())) {s = 275;}

                        else if ( (LA117_133==BIGGERTHANSi||LA117_133==RIGHTSELFTERMINATOR||LA117_133==S) ) {s = 25;}

                        else if ( (LA117_133==LEFTBRACKETSi) && (synpred4())) {s = 276;}

                        else if ( (LA117_133==SLASH||LA117_133==DOUBLESLASH) && (synpred4())) {s = 277;}

                        else if ( (LA117_133==CAST) && (synpred4())) {s = 278;}

                        else if ( (LA117_133==CASTABLE) && (synpred4())) {s = 279;}

                        else if ( (LA117_133==TREAT) && (synpred4())) {s = 280;}

                        else if ( (LA117_133==INSTANCE) && (synpred4())) {s = 281;}

                        else if ( (LA117_133==EXCEPT||LA117_133==INTERSECT) && (synpred4())) {s = 282;}

                        else if ( (LA117_133==PIPESi||LA117_133==UNION) && (synpred4())) {s = 283;}

                        else if ( (LA117_133==IDIV||LA117_133==DIV||LA117_133==STARSi||LA117_133==MOD) && (synpred4())) {s = 284;}

                        else if ( (LA117_133==MINUSSi||LA117_133==PLUSSi) && (synpred4())) {s = 285;}

                        else if ( (LA117_133==TO) && (synpred4())) {s = 286;}

                        else if ( (LA117_133==FTCONTAINS) && (synpred4())) {s = 287;}

                        else if ( (LA117_133==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_133==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_133==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_133==COMMASi) && (synpred4())) {s = 288;}

                        else if ( (LA117_133==RIGHTBRACESi) && (synpred4())) {s = 289;}

                        else if ( (LA117_133==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_133==RIGHTPARENTHESISSi) && (synpred4())) {s = 290;}

                        else if ( (LA117_133==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_133==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_133==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_133==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_133==RETURN) && (synpred4())) {s = 291;}

                        else if ( (LA117_133==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_133==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_133==ASCENDING||LA117_133==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_133==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_133==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_133==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_133==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_133==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_133==ELSE) && (synpred4())) {s = 79;}

                         
                        input.seek(index117_133);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA117_198 = input.LA(1);

                         
                        int index117_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_198==COLONSi) ) {s = 445;}

                        else if ( (LA117_198==LEFTPARENTHESISSi) && (synpred4())) {s = 275;}

                        else if ( (LA117_198==LEFTBRACKETSi) && (synpred4())) {s = 276;}

                        else if ( (LA117_198==SLASH||LA117_198==DOUBLESLASH) && (synpred4())) {s = 277;}

                        else if ( (LA117_198==CAST) && (synpred4())) {s = 278;}

                        else if ( (LA117_198==CASTABLE) && (synpred4())) {s = 279;}

                        else if ( (LA117_198==TREAT) && (synpred4())) {s = 280;}

                        else if ( (LA117_198==INSTANCE) && (synpred4())) {s = 281;}

                        else if ( (LA117_198==EXCEPT||LA117_198==INTERSECT) && (synpred4())) {s = 282;}

                        else if ( (LA117_198==PIPESi||LA117_198==UNION) && (synpred4())) {s = 283;}

                        else if ( (LA117_198==IDIV||LA117_198==DIV||LA117_198==STARSi||LA117_198==MOD) && (synpred4())) {s = 284;}

                        else if ( (LA117_198==MINUSSi||LA117_198==PLUSSi) && (synpred4())) {s = 285;}

                        else if ( (LA117_198==TO) && (synpred4())) {s = 286;}

                        else if ( (LA117_198==FTCONTAINS) && (synpred4())) {s = 287;}

                        else if ( (LA117_198==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_198==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_198==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_198==COMMASi) && (synpred4())) {s = 288;}

                        else if ( (LA117_198==RIGHTBRACESi) && (synpred4())) {s = 289;}

                        else if ( (LA117_198==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_198==RIGHTPARENTHESISSi) && (synpred4())) {s = 290;}

                        else if ( (LA117_198==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_198==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_198==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_198==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_198==RETURN) && (synpred4())) {s = 291;}

                        else if ( (LA117_198==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_198==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_198==ASCENDING||LA117_198==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_198==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_198==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_198==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_198==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_198==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_198==ELSE) && (synpred4())) {s = 79;}

                        else if ( (LA117_198==BIGGERTHANSi||LA117_198==RIGHTSELFTERMINATOR||LA117_198==S) ) {s = 25;}

                         
                        input.seek(index117_198);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA117_43 = input.LA(1);

                         
                        int index117_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_43==STARSi) ) {s = 24;}

                        else if ( (LA117_43==EOF||(LA117_43>=PIPESi && LA117_43<=WHERE)||(LA117_43>=LEFTBRACESi && LA117_43<=NOTEQUALSi)||(LA117_43>=ELSE && LA117_43<=LESSTHANSi)||(LA117_43>=FOR && LA117_43<=INSTANCE)||(LA117_43>=EXCEPT && LA117_43<=TO)||LA117_43==SATISFIES||LA117_43==SEMICOLONSi||LA117_43==EMPTY||LA117_43==CASE||LA117_43==MINUSSi||(LA117_43>=COMMASi && LA117_43<=LET)||LA117_43==SCORE||LA117_43==RIGHTBRACKETSi||LA117_43==LEVELS||LA117_43==DIV||LA117_43==AT||LA117_43==ORDER||LA117_43==UNION||LA117_43==COLLATION||LA117_43==OR||LA117_43==DESCENDING||LA117_43==STABLE||LA117_43==WITHOUT||(LA117_43>=EXTERNAL && LA117_43<=RIGHTPARENTHESISSi)||LA117_43==RETURN||LA117_43==DEFAULT||LA117_43==AND||LA117_43==INTERSECT||LA117_43==TIMES||(LA117_43>=ASSIGNMENTOPERATOR && LA117_43<=FTCONTAINS)||(LA117_43>=MOD && LA117_43<=RIGHTBRACESi)||LA117_43==IN||(LA117_43>=EQ && LA117_43<=NODEAFTERSi)||(LA117_43>=WORDS && LA117_43<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_43==PLUSSi) ) {s = 26;}

                        else if ( (LA117_43==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_43);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA117_30 = input.LA(1);

                         
                        int index117_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_30==STARSi) ) {s = 24;}

                        else if ( (LA117_30==EOF||(LA117_30>=PIPESi && LA117_30<=WHERE)||(LA117_30>=LEFTBRACESi && LA117_30<=NOTEQUALSi)||(LA117_30>=ELSE && LA117_30<=LESSTHANSi)||(LA117_30>=FOR && LA117_30<=INSTANCE)||(LA117_30>=EXCEPT && LA117_30<=TO)||LA117_30==SATISFIES||LA117_30==SEMICOLONSi||LA117_30==EMPTY||LA117_30==CASE||LA117_30==MINUSSi||(LA117_30>=COMMASi && LA117_30<=LET)||LA117_30==SCORE||LA117_30==RIGHTBRACKETSi||LA117_30==LEVELS||LA117_30==DIV||LA117_30==AT||LA117_30==ORDER||LA117_30==UNION||LA117_30==COLLATION||LA117_30==OR||LA117_30==DESCENDING||LA117_30==STABLE||LA117_30==WITHOUT||(LA117_30>=EXTERNAL && LA117_30<=RIGHTPARENTHESISSi)||LA117_30==RETURN||LA117_30==DEFAULT||LA117_30==AND||LA117_30==INTERSECT||LA117_30==TIMES||(LA117_30>=ASSIGNMENTOPERATOR && LA117_30<=FTCONTAINS)||(LA117_30>=MOD && LA117_30<=RIGHTBRACESi)||LA117_30==IN||(LA117_30>=EQ && LA117_30<=NODEAFTERSi)||(LA117_30>=WORDS && LA117_30<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_30==PLUSSi) ) {s = 26;}

                        else if ( (LA117_30==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_30);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA117_42 = input.LA(1);

                         
                        int index117_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_42==EOF||(LA117_42>=PIPESi && LA117_42<=WHERE)||(LA117_42>=LEFTBRACESi && LA117_42<=NOTEQUALSi)||(LA117_42>=ELSE && LA117_42<=LESSTHANSi)||(LA117_42>=FOR && LA117_42<=INSTANCE)||(LA117_42>=EXCEPT && LA117_42<=TO)||LA117_42==SATISFIES||LA117_42==SEMICOLONSi||LA117_42==EMPTY||LA117_42==CASE||LA117_42==MINUSSi||(LA117_42>=COMMASi && LA117_42<=LET)||LA117_42==SCORE||LA117_42==RIGHTBRACKETSi||LA117_42==LEVELS||LA117_42==DIV||LA117_42==AT||LA117_42==ORDER||LA117_42==UNION||LA117_42==COLLATION||LA117_42==OR||LA117_42==DESCENDING||LA117_42==STABLE||LA117_42==WITHOUT||(LA117_42>=EXTERNAL && LA117_42<=RIGHTPARENTHESISSi)||LA117_42==RETURN||LA117_42==DEFAULT||LA117_42==AND||LA117_42==INTERSECT||LA117_42==TIMES||(LA117_42>=ASSIGNMENTOPERATOR && LA117_42<=FTCONTAINS)||(LA117_42>=MOD && LA117_42<=RIGHTBRACESi)||LA117_42==IN||(LA117_42>=EQ && LA117_42<=NODEAFTERSi)||(LA117_42>=WORDS && LA117_42<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_42==STARSi) ) {s = 24;}

                        else if ( (LA117_42==PLUSSi) ) {s = 26;}

                        else if ( (LA117_42==QUESTIONMARKSi) && (synpred4())) {s = 27;}

                         
                        input.seek(index117_42);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA117_89 = input.LA(1);

                         
                        int index117_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_89==EOF||(LA117_89>=PIPESi && LA117_89<=WHERE)||(LA117_89>=EQUALSi && LA117_89<=NOTEQUALSi)||LA117_89==CAST||LA117_89==ELSE||LA117_89==TREAT||LA117_89==CASTABLE||(LA117_89>=FOR && LA117_89<=INSTANCE)||(LA117_89>=EXCEPT && LA117_89<=TO)||(LA117_89>=SATISFIES && LA117_89<=SEMICOLONSi)||LA117_89==EMPTY||LA117_89==CASE||(LA117_89>=COMMASi && LA117_89<=LET)||LA117_89==RIGHTBRACKETSi||LA117_89==LEVELS||LA117_89==DIV||LA117_89==ORDER||LA117_89==UNION||LA117_89==COLLATION||LA117_89==OR||LA117_89==DESCENDING||(LA117_89>=STABLE && LA117_89<=LEFTBRACKETSi)||LA117_89==WITHOUT||LA117_89==RIGHTPARENTHESISSi||LA117_89==RETURN||LA117_89==DEFAULT||LA117_89==AND||LA117_89==INTERSECT||LA117_89==TIMES||LA117_89==FTCONTAINS||(LA117_89>=MOD && LA117_89<=RIGHTBRACESi)||(LA117_89>=EQ && LA117_89<=NODEAFTERSi)||(LA117_89>=WORDS && LA117_89<=PARAGRAPHS)) ) {s = 25;}

                        else if ( (LA117_89==MINUSSi||LA117_89==PLUSSi) ) {s = 165;}

                        else if ( (LA117_89==VALIDATE) && (synpred4())) {s = 168;}

                        else if ( (LA117_89==DOUBLESLASH) ) {s = 195;}

                        else if ( (LA117_89==SLASH) ) {s = 196;}

                        else if ( ((LA117_89>=IntegerLiteral && LA117_89<=DoubleLiteral)) && (synpred4())) {s = 170;}

                        else if ( (LA117_89==StringLiteral) && (synpred4())) {s = 171;}

                        else if ( (LA117_89==DOLLARSi) && (synpred4())) {s = 172;}

                        else if ( (LA117_89==LEFTPARENTHESISSi) && (synpred4())) {s = 173;}

                        else if ( (LA117_89==DOT) && (synpred4())) {s = 174;}

                        else if ( (LA117_89==NCName) && (synpred4())) {s = 175;}

                        else if ( (LA117_89==ORDERED) && (synpred4())) {s = 176;}

                        else if ( (LA117_89==UNORDERED) && (synpred4())) {s = 177;}

                        else if ( (LA117_89==LESSTHANSi) ) {s = 166;}

                        else if ( (LA117_89==LEFTXMLCOMMENT) && (synpred4())) {s = 178;}

                        else if ( (LA117_89==LEFTPITARGET) && (synpred4())) {s = 179;}

                        else if ( (LA117_89==DOCUMENT) && (synpred4())) {s = 180;}

                        else if ( (LA117_89==ELEMENT) && (synpred4())) {s = 181;}

                        else if ( (LA117_89==ATTRIBUTE) && (synpred4())) {s = 182;}

                        else if ( (LA117_89==TEXT) && (synpred4())) {s = 183;}

                        else if ( (LA117_89==COMMENT) && (synpred4())) {s = 184;}

                        else if ( (LA117_89==PROCESSING_INSTRUCTION) && (synpred4())) {s = 185;}

                        else if ( ((LA117_89>=PARENT && LA117_89<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 186;}

                        else if ( (LA117_89==DOTDOT) && (synpred4())) {s = 187;}

                        else if ( (LA117_89==CHILD||(LA117_89>=DESCENDANT && LA117_89<=FOLLOWING)) && (synpred4())) {s = 188;}

                        else if ( (LA117_89==ATSi) && (synpred4())) {s = 189;}

                        else if ( (LA117_89==DOCUMENTNODE) && (synpred4())) {s = 190;}

                        else if ( (LA117_89==SCHEMAELEMENT) && (synpred4())) {s = 191;}

                        else if ( (LA117_89==SCHEMAATTRIBUTE) && (synpred4())) {s = 192;}

                        else if ( (LA117_89==NODE) && (synpred4())) {s = 193;}

                        else if ( (LA117_89==STARSi) ) {s = 197;}

                        else if ( (LA117_89==LEFTPRAGMA) && (synpred4())) {s = 194;}

                         
                        input.seek(index117_89);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA117_169 = input.LA(1);

                         
                        int index117_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA117_169>=IntegerLiteral && LA117_169<=DoubleLiteral)) ) {s = 361;}

                        else if ( (LA117_169==StringLiteral) ) {s = 362;}

                        else if ( (LA117_169==DOLLARSi) ) {s = 363;}

                        else if ( (LA117_169==LEFTPARENTHESISSi) ) {s = 364;}

                        else if ( (LA117_169==DOT) ) {s = 365;}

                        else if ( (LA117_169==NCName) ) {s = 366;}

                        else if ( (LA117_169==ORDERED) ) {s = 367;}

                        else if ( (LA117_169==UNORDERED) ) {s = 368;}

                        else if ( (LA117_169==LESSTHANSi) ) {s = 369;}

                        else if ( (LA117_169==LEFTXMLCOMMENT) ) {s = 370;}

                        else if ( (LA117_169==LEFTPITARGET) ) {s = 371;}

                        else if ( (LA117_169==DOCUMENT) ) {s = 372;}

                        else if ( (LA117_169==ELEMENT) ) {s = 373;}

                        else if ( (LA117_169==ATTRIBUTE) ) {s = 374;}

                        else if ( (LA117_169==TEXT) ) {s = 375;}

                        else if ( (LA117_169==COMMENT) ) {s = 376;}

                        else if ( (LA117_169==PROCESSING_INSTRUCTION) ) {s = 377;}

                        else if ( ((LA117_169>=PARENT && LA117_169<=ANCESTOR_OR_SELF)) ) {s = 378;}

                        else if ( (LA117_169==DOTDOT) ) {s = 379;}

                        else if ( (LA117_169==CHILD||(LA117_169>=DESCENDANT && LA117_169<=FOLLOWING)) ) {s = 380;}

                        else if ( (LA117_169==ATSi) ) {s = 381;}

                        else if ( (LA117_169==DOCUMENTNODE) ) {s = 382;}

                        else if ( (LA117_169==SCHEMAELEMENT) ) {s = 383;}

                        else if ( (LA117_169==SCHEMAATTRIBUTE) ) {s = 384;}

                        else if ( (LA117_169==NODE) ) {s = 385;}

                        else if ( (LA117_169==STARSi) ) {s = 386;}

                        else if ( (LA117_169==CAST) && (synpred4())) {s = 354;}

                        else if ( (LA117_169==CASTABLE) && (synpred4())) {s = 355;}

                        else if ( (LA117_169==TREAT) && (synpred4())) {s = 356;}

                        else if ( (LA117_169==INSTANCE) && (synpred4())) {s = 357;}

                        else if ( (LA117_169==EXCEPT||LA117_169==INTERSECT) && (synpred4())) {s = 358;}

                        else if ( (LA117_169==PIPESi||LA117_169==UNION) && (synpred4())) {s = 359;}

                        else if ( (LA117_169==MINUSSi||LA117_169==PLUSSi) && (synpred4())) {s = 387;}

                        else if ( (LA117_169==TO) && (synpred4())) {s = 55;}

                        else if ( (LA117_169==FTCONTAINS) && (synpred4())) {s = 56;}

                        else if ( ((LA117_169>=EQ && LA117_169<=GE)) && (synpred4())) {s = 57;}

                        else if ( ((LA117_169>=BIGGERTHANSi && LA117_169<=LESSTHANOREQUALSi)||(LA117_169>=EQUALSi && LA117_169<=NOTEQUALSi)) && (synpred4())) {s = 58;}

                        else if ( ((LA117_169>=IS && LA117_169<=NODEAFTERSi)) && (synpred4())) {s = 59;}

                        else if ( (LA117_169==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_169==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_169==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_169==COMMASi) && (synpred4())) {s = 288;}

                        else if ( (LA117_169==RIGHTBRACESi) && (synpred4())) {s = 64;}

                        else if ( (LA117_169==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_169==RIGHTPARENTHESISSi) && (synpred4())) {s = 360;}

                        else if ( (LA117_169==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_169==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_169==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_169==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_169==RETURN) && (synpred4())) {s = 291;}

                        else if ( (LA117_169==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_169==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_169==ASCENDING||LA117_169==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_169==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_169==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_169==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_169==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_169==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_169==ELSE) && (synpred4())) {s = 79;}

                        else if ( (LA117_169==WITHOUT) && (synpred4())) {s = 80;}

                        else if ( (LA117_169==TIMES) && (synpred4())) {s = 81;}

                        else if ( ((LA117_169>=WORDS && LA117_169<=PARAGRAPHS)) && (synpred4())) {s = 82;}

                        else if ( (LA117_169==LEVELS) && (synpred4())) {s = 83;}

                        else if ( (LA117_169==IDIV||LA117_169==DIV||LA117_169==MOD) && (synpred4())) {s = 54;}

                         
                        input.seek(index117_169);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA117_196 = input.LA(1);

                         
                        int index117_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA117_196>=IntegerLiteral && LA117_196<=DoubleLiteral)) ) {s = 414;}

                        else if ( (LA117_196==StringLiteral) ) {s = 415;}

                        else if ( (LA117_196==DOLLARSi) ) {s = 416;}

                        else if ( (LA117_196==LEFTPARENTHESISSi) ) {s = 417;}

                        else if ( (LA117_196==DOT) ) {s = 418;}

                        else if ( (LA117_196==NCName) ) {s = 419;}

                        else if ( (LA117_196==ORDERED) ) {s = 420;}

                        else if ( (LA117_196==UNORDERED) ) {s = 421;}

                        else if ( (LA117_196==LESSTHANSi) ) {s = 422;}

                        else if ( (LA117_196==LEFTXMLCOMMENT) ) {s = 423;}

                        else if ( (LA117_196==LEFTPITARGET) ) {s = 424;}

                        else if ( (LA117_196==DOCUMENT) ) {s = 425;}

                        else if ( (LA117_196==ELEMENT) ) {s = 426;}

                        else if ( (LA117_196==ATTRIBUTE) ) {s = 427;}

                        else if ( (LA117_196==TEXT) ) {s = 428;}

                        else if ( (LA117_196==COMMENT) ) {s = 429;}

                        else if ( (LA117_196==PROCESSING_INSTRUCTION) ) {s = 430;}

                        else if ( ((LA117_196>=PARENT && LA117_196<=ANCESTOR_OR_SELF)) ) {s = 431;}

                        else if ( (LA117_196==DOTDOT) ) {s = 432;}

                        else if ( (LA117_196==CHILD||(LA117_196>=DESCENDANT && LA117_196<=FOLLOWING)) ) {s = 433;}

                        else if ( (LA117_196==ATSi) ) {s = 434;}

                        else if ( (LA117_196==DOCUMENTNODE) ) {s = 435;}

                        else if ( (LA117_196==SCHEMAELEMENT) ) {s = 436;}

                        else if ( (LA117_196==SCHEMAATTRIBUTE) ) {s = 437;}

                        else if ( (LA117_196==NODE) ) {s = 438;}

                        else if ( (LA117_196==STARSi) ) {s = 439;}

                        else if ( (LA117_196==CAST) && (synpred4())) {s = 354;}

                        else if ( (LA117_196==CASTABLE) && (synpred4())) {s = 355;}

                        else if ( (LA117_196==TREAT) && (synpred4())) {s = 356;}

                        else if ( (LA117_196==INSTANCE) && (synpred4())) {s = 357;}

                        else if ( (LA117_196==EXCEPT||LA117_196==INTERSECT) && (synpred4())) {s = 358;}

                        else if ( (LA117_196==PIPESi||LA117_196==UNION) && (synpred4())) {s = 359;}

                        else if ( (LA117_196==MINUSSi||LA117_196==PLUSSi) && (synpred4())) {s = 387;}

                        else if ( (LA117_196==TO) && (synpred4())) {s = 55;}

                        else if ( (LA117_196==FTCONTAINS) && (synpred4())) {s = 56;}

                        else if ( ((LA117_196>=EQ && LA117_196<=GE)) && (synpred4())) {s = 57;}

                        else if ( ((LA117_196>=BIGGERTHANSi && LA117_196<=LESSTHANOREQUALSi)||(LA117_196>=EQUALSi && LA117_196<=NOTEQUALSi)) && (synpred4())) {s = 58;}

                        else if ( ((LA117_196>=IS && LA117_196<=NODEAFTERSi)) && (synpred4())) {s = 59;}

                        else if ( (LA117_196==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_196==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_196==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_196==COMMASi) && (synpred4())) {s = 288;}

                        else if ( (LA117_196==RIGHTBRACESi) && (synpred4())) {s = 64;}

                        else if ( (LA117_196==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_196==RIGHTPARENTHESISSi) && (synpred4())) {s = 360;}

                        else if ( (LA117_196==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_196==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_196==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_196==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_196==RETURN) && (synpred4())) {s = 291;}

                        else if ( (LA117_196==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_196==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_196==ASCENDING||LA117_196==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_196==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_196==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_196==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_196==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_196==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_196==ELSE) && (synpred4())) {s = 79;}

                        else if ( (LA117_196==WITHOUT) && (synpred4())) {s = 80;}

                        else if ( (LA117_196==TIMES) && (synpred4())) {s = 81;}

                        else if ( ((LA117_196>=WORDS && LA117_196<=PARAGRAPHS)) && (synpred4())) {s = 82;}

                        else if ( (LA117_196==LEVELS) && (synpred4())) {s = 83;}

                        else if ( (LA117_196==IDIV||LA117_196==DIV||LA117_196==MOD) && (synpred4())) {s = 54;}

                         
                        input.seek(index117_196);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA117_106 = input.LA(1);

                         
                        int index117_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_106);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA117_130 = input.LA(1);

                         
                        int index117_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_130);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA117_167 = input.LA(1);

                         
                        int index117_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_167==COLONSi) && (synpred4())) {s = 350;}

                        else if ( (LA117_167==MINUSSi||LA117_167==PLUSSi) ) {s = 46;}

                        else if ( (LA117_167==DOLLARSi||(LA117_167>=LEFTPRAGMA && LA117_167<=DOCUMENTNODE)||LA117_167==PROCESSING_INSTRUCTION||LA117_167==DOCUMENT||LA117_167==VALIDATE||LA117_167==SCHEMAATTRIBUTE||LA117_167==LEFTXMLCOMMENT||LA117_167==TEXT||LA117_167==UNORDERED||LA117_167==LEFTPITARGET||LA117_167==COMMENT||(LA117_167>=ELEMENT && LA117_167<=LEFTPARENTHESISSi)||LA117_167==ATSi||LA117_167==ATTRIBUTE||LA117_167==NODE||LA117_167==SCHEMAELEMENT||LA117_167==CHILD||(LA117_167>=DESCENDANT && LA117_167<=DOTDOT)||(LA117_167>=IntegerLiteral && LA117_167<=DoubleLiteral)||LA117_167==StringLiteral||LA117_167==NCName) ) {s = 25;}

                        else if ( (LA117_167==DOUBLESLASH) ) {s = 351;}

                        else if ( (LA117_167==SLASH) ) {s = 352;}

                        else if ( (LA117_167==LESSTHANSi) ) {s = 47;}

                        else if ( (LA117_167==STARSi) ) {s = 48;}

                        else if ( (LA117_167==LEFTBRACKETSi) && (synpred4())) {s = 353;}

                        else if ( (LA117_167==CAST) && (synpred4())) {s = 354;}

                        else if ( (LA117_167==CASTABLE) && (synpred4())) {s = 355;}

                        else if ( (LA117_167==TREAT) && (synpred4())) {s = 356;}

                        else if ( (LA117_167==INSTANCE) && (synpred4())) {s = 357;}

                        else if ( (LA117_167==EXCEPT||LA117_167==INTERSECT) && (synpred4())) {s = 358;}

                        else if ( (LA117_167==PIPESi||LA117_167==UNION) && (synpred4())) {s = 359;}

                        else if ( (LA117_167==TO) && (synpred4())) {s = 55;}

                        else if ( (LA117_167==FTCONTAINS) && (synpred4())) {s = 56;}

                        else if ( ((LA117_167>=EQ && LA117_167<=GE)) && (synpred4())) {s = 57;}

                        else if ( ((LA117_167>=BIGGERTHANSi && LA117_167<=LESSTHANOREQUALSi)||(LA117_167>=EQUALSi && LA117_167<=NOTEQUALSi)) && (synpred4())) {s = 58;}

                        else if ( ((LA117_167>=IS && LA117_167<=NODEAFTERSi)) && (synpred4())) {s = 59;}

                        else if ( (LA117_167==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_167==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_167==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_167==COMMASi) && (synpred4())) {s = 288;}

                        else if ( (LA117_167==RIGHTBRACESi) && (synpred4())) {s = 64;}

                        else if ( (LA117_167==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_167==RIGHTPARENTHESISSi) && (synpred4())) {s = 360;}

                        else if ( (LA117_167==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_167==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_167==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_167==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_167==RETURN) && (synpred4())) {s = 291;}

                        else if ( (LA117_167==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_167==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_167==ASCENDING||LA117_167==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_167==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_167==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_167==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_167==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_167==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_167==ELSE) && (synpred4())) {s = 79;}

                        else if ( (LA117_167==WITHOUT) && (synpred4())) {s = 80;}

                        else if ( (LA117_167==TIMES) && (synpred4())) {s = 81;}

                        else if ( ((LA117_167>=WORDS && LA117_167<=PARAGRAPHS)) && (synpred4())) {s = 82;}

                        else if ( (LA117_167==LEVELS) && (synpred4())) {s = 83;}

                        else if ( (LA117_167==IDIV||LA117_167==DIV||LA117_167==MOD) && (synpred4())) {s = 54;}

                         
                        input.seek(index117_167);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA117_197 = input.LA(1);

                         
                        int index117_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_197==COLONSi) && (synpred4())) {s = 350;}

                        else if ( (LA117_197==MINUSSi||LA117_197==PLUSSi) ) {s = 440;}

                        else if ( (LA117_197==DOLLARSi||(LA117_197>=LEFTPRAGMA && LA117_197<=DOCUMENTNODE)||LA117_197==PROCESSING_INSTRUCTION||LA117_197==DOCUMENT||LA117_197==VALIDATE||LA117_197==SCHEMAATTRIBUTE||LA117_197==LEFTXMLCOMMENT||LA117_197==TEXT||LA117_197==UNORDERED||LA117_197==LEFTPITARGET||LA117_197==COMMENT||(LA117_197>=ELEMENT && LA117_197<=LEFTPARENTHESISSi)||LA117_197==ATSi||LA117_197==ATTRIBUTE||LA117_197==NODE||LA117_197==SCHEMAELEMENT||LA117_197==CHILD||(LA117_197>=DESCENDANT && LA117_197<=DOTDOT)||(LA117_197>=IntegerLiteral && LA117_197<=DoubleLiteral)||LA117_197==StringLiteral||LA117_197==NCName) ) {s = 25;}

                        else if ( (LA117_197==DOUBLESLASH) ) {s = 441;}

                        else if ( (LA117_197==SLASH) ) {s = 442;}

                        else if ( (LA117_197==LESSTHANSi) ) {s = 443;}

                        else if ( (LA117_197==STARSi) ) {s = 444;}

                        else if ( (LA117_197==LEFTBRACKETSi) && (synpred4())) {s = 353;}

                        else if ( (LA117_197==CAST) && (synpred4())) {s = 354;}

                        else if ( (LA117_197==CASTABLE) && (synpred4())) {s = 355;}

                        else if ( (LA117_197==TREAT) && (synpred4())) {s = 356;}

                        else if ( (LA117_197==INSTANCE) && (synpred4())) {s = 357;}

                        else if ( (LA117_197==EXCEPT||LA117_197==INTERSECT) && (synpred4())) {s = 358;}

                        else if ( (LA117_197==PIPESi||LA117_197==UNION) && (synpred4())) {s = 359;}

                        else if ( (LA117_197==TO) && (synpred4())) {s = 55;}

                        else if ( (LA117_197==FTCONTAINS) && (synpred4())) {s = 56;}

                        else if ( ((LA117_197>=EQ && LA117_197<=GE)) && (synpred4())) {s = 57;}

                        else if ( ((LA117_197>=BIGGERTHANSi && LA117_197<=LESSTHANOREQUALSi)||(LA117_197>=EQUALSi && LA117_197<=NOTEQUALSi)) && (synpred4())) {s = 58;}

                        else if ( ((LA117_197>=IS && LA117_197<=NODEAFTERSi)) && (synpred4())) {s = 59;}

                        else if ( (LA117_197==AND) && (synpred4())) {s = 60;}

                        else if ( (LA117_197==OR) && (synpred4())) {s = 61;}

                        else if ( (LA117_197==SEMICOLONSi) && (synpred4())) {s = 62;}

                        else if ( (LA117_197==COMMASi) && (synpred4())) {s = 288;}

                        else if ( (LA117_197==RIGHTBRACESi) && (synpred4())) {s = 64;}

                        else if ( (LA117_197==EOF) && (synpred4())) {s = 65;}

                        else if ( (LA117_197==RIGHTPARENTHESISSi) && (synpred4())) {s = 360;}

                        else if ( (LA117_197==RIGHTBRACKETSi) && (synpred4())) {s = 67;}

                        else if ( (LA117_197==WHERE) && (synpred4())) {s = 68;}

                        else if ( (LA117_197==ORDER) && (synpred4())) {s = 69;}

                        else if ( (LA117_197==STABLE) && (synpred4())) {s = 70;}

                        else if ( (LA117_197==RETURN) && (synpred4())) {s = 291;}

                        else if ( (LA117_197==FOR) && (synpred4())) {s = 71;}

                        else if ( (LA117_197==LET) && (synpred4())) {s = 72;}

                        else if ( (LA117_197==ASCENDING||LA117_197==DESCENDING) && (synpred4())) {s = 73;}

                        else if ( (LA117_197==EMPTY) && (synpred4())) {s = 74;}

                        else if ( (LA117_197==COLLATION) && (synpred4())) {s = 75;}

                        else if ( (LA117_197==SATISFIES) && (synpred4())) {s = 76;}

                        else if ( (LA117_197==DEFAULT) && (synpred4())) {s = 77;}

                        else if ( (LA117_197==CASE) && (synpred4())) {s = 78;}

                        else if ( (LA117_197==ELSE) && (synpred4())) {s = 79;}

                        else if ( (LA117_197==WITHOUT) && (synpred4())) {s = 80;}

                        else if ( (LA117_197==TIMES) && (synpred4())) {s = 81;}

                        else if ( ((LA117_197>=WORDS && LA117_197<=PARAGRAPHS)) && (synpred4())) {s = 82;}

                        else if ( (LA117_197==LEVELS) && (synpred4())) {s = 83;}

                        else if ( (LA117_197==IDIV||LA117_197==DIV||LA117_197==MOD) && (synpred4())) {s = 54;}

                         
                        input.seek(index117_197);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA117_90 = input.LA(1);

                         
                        int index117_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_90);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA117_123 = input.LA(1);

                         
                        int index117_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index117_123);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 117, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_Name_in_piTarget3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName3937 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLONSi_in_qName3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_qName3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_versionDecl_in_module4208 = new BitSet(new long[]{0x5C0004902E240000L,0xC141129280240041L,0x0007FFA0010C0A04L,0x0000000000800870L});
    public static final BitSet FOLLOW_libraryModule_in_module4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl4241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl4243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl4245 = new BitSet(new long[]{0x0010000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl4249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl4251 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_versionDecl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule4281 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_queryBody_in_mainModule4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule4305 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_prolog_in_libraryModule4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl4332 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl4334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl4336 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_moduleDecl4338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl4340 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_moduleDecl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog4373 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_setter_in_prolog4377 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog4381 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_importStmt_in_prolog4385 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_prolog4388 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varDecl_in_prolog4394 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_functionDecl_in_prolog4398 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_optionDecl_in_prolog4402 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog4406 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_prolog4409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl4543 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl4545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl4547 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_namespaceDecl4549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl4569 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl4571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200010L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl4594 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl4596 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl4598 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl4606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl4633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl4635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_optionDecl4637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl4662 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl4664 = new BitSet(new long[]{0x0200000080000000L,0x0006800000000600L,0x0000000000400000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl4685 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl4687 = new BitSet(new long[]{0x0000000004000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl4716 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl4718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl4720 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl4722 = new BitSet(new long[]{0x0000000000000000L,0x0000000100002000L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl4747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COPYNAMESPACES_in_copyNamespacesDecl4749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl4751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl4753 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl4825 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl4827 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl4829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl4855 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_BASEURI_in_baseURIDecl4857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport4882 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport4884 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport4886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport4889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_AT_in_schemaImport4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport4894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport4897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport4899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix4927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix4929 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_schemaPrefix4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix4937 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix4939 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport4965 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport4967 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport4970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_moduleImport4972 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_moduleImport4974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport4978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_AT_in_moduleImport4981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport4983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport4986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport4988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl5020 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl5022 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl5024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_varDecl5026 = new BitSet(new long[]{0x0000000000000000L,0x0008004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl5028 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGNMENTOPERATOR_in_varDecl5033 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl5060 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl5062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200010L});
    public static final BitSet FOLLOW_set_in_constructionDecl5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl5093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl5095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_functionDecl5097 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_functionDecl5099 = new BitSet(new long[]{0x0000000000200000L,0x0010000000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl5101 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_functionDecl5104 = new BitSet(new long[]{0x0000000000004000L,0x0008004000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl5107 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl5109 = new BitSet(new long[]{0x0000000000004000L,0x0008000000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList5145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_paramList5148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_param_in_paramList5150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOLLARSi_in_param5182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_param5184 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_param5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_enclosedExpr5210 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr5212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_enclosedExpr5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr5271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_expr5274 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_expr5276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr5474 = new BitSet(new long[]{0x0000040000000400L,0x0080040000400040L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr5478 = new BitSet(new long[]{0x0000040000000400L,0x0080040000400040L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr5482 = new BitSet(new long[]{0x0000000000000000L,0x0080040000400000L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr5485 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr5488 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause5516 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause5518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_forClause5520 = new BitSet(new long[]{0x0000000000000000L,0x0000004000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_positionalVar_in_forClause5525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000800000L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause5528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_forClause5531 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_forClause5533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_forClause5536 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause5538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_forClause5540 = new BitSet(new long[]{0x0000000000000000L,0x0000004000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause5542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_positionalVar_in_forClause5545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000800000L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause5548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_forClause5551 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_forClause5553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_AT_in_positionalVar5577 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar5579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_positionalVar5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar5606 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar5608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause5638 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause5640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_letClause5642 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause5644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LET_in_letClause5651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SCORE_in_letClause5653 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause5655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_letClause5657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGNMENTOPERATOR_in_letClause5661 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_letClause5663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_letClause5666 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause5670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_letClause5672 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause5674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ftScoreVar_in_letClause5680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGNMENTOPERATOR_in_letClause5683 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_letClause5685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_WHERE_in_whereClause5711 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause5737 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_BY_in_orderByClause5739 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause5745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause5747 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_BY_in_orderByClause5749 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList5775 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList5778 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList5780 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec5808 = new BitSet(new long[]{0x0080000000000102L,0x0000000804000000L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier5832 = new BitSet(new long[]{0x0080000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier5842 = new BitSet(new long[]{0x0000000000000000L,0x0000000100002000L});
    public static final BitSet FOLLOW_set_in_orderModifier5844 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier5855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr5880 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr5888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr5890 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr5892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr5895 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr5897 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr5900 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr5902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr5904 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr5906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr5909 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr5911 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr5915 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr5938 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_typeswitchExpr5940 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr5942 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_typeswitchExpr5944 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr5946 = new BitSet(new long[]{0x0200000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr5949 = new BitSet(new long[]{0x0000000000200000L,0x0080000000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr5952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr5954 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr5958 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause5985 = new BitSet(new long[]{0x0400020008200000L,0x4100020000200002L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause5988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_caseClause5990 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_caseClause5992 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause5996 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause5998 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr6029 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ifExpr6031 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_ifExpr6033 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ifExpr6035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_THEN_in_ifExpr6037 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr6039 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr6041 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr6072 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_OR_in_orExpr6076 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_andExpr_in_orExpr6078 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr6109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andExpr6113 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr6115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr6139 = new BitSet(new long[]{0x00000000200180E2L,0x0000000000000000L,0x00000007FC000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr6144 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr6148 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr6152 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr6179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr6183 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr6185 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr6217 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TO_in_rangeExpr6221 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr6249 = new BitSet(new long[]{0x1000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_in_additiveExpr6253 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr6261 = new BitSet(new long[]{0x1000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr6281 = new BitSet(new long[]{0x0000000000000202L,0x0000001000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr6285 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr6301 = new BitSet(new long[]{0x0000000000000202L,0x0000001000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr6330 = new BitSet(new long[]{0x0000000000000012L,0x0000000001000000L});
    public static final BitSet FOLLOW_set_in_unionExpr6334 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr6342 = new BitSet(new long[]{0x0000000000000012L,0x0000000001000000L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr6361 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr6365 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr6373 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr6397 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr6401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr6403 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr6434 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr6438 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_treatExpr6440 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr6468 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr6472 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_castableExpr6474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_singleType_in_castableExpr6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr6506 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_CAST_in_castExpr6510 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_castExpr6512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_singleType_in_castExpr6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr6543 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr6734 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr6736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_validateExpr6739 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_validateExpr6741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_validateExpr6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr6790 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_extensionExpr6793 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_extensionExpr6795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_extensionExpr6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPRAGMA_in_pragma6827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_S_in_pragma6829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_pragma6832 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_S_in_pragma6835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_pragmaContents_in_pragma6837 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RIGHTPRAGMA_in_pragma6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_pragmaContents6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESLASH_in_pathExpr6902 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_pathExpr6925 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_pathExpr6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr6970 = new BitSet(new long[]{0x0000001000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr6973 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr6981 = new BitSet(new long[]{0x0000001000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7042 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7046 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep7074 = new BitSet(new long[]{0x0400000008000000L,0x4100021000200000L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis7106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_forwardAxis7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep7175 = new BitSet(new long[]{0x0400000008000000L,0x4100021000200000L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep7178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7203 = new BitSet(new long[]{0x0400000008000000L,0x4100021000200000L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis7234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_reverseAxis7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOT_in_abbrevReverseStep7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7394 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_wildcard7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard7446 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7448 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr7479 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList7503 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_LEFTBRACKETSi_in_predicate7530 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_predicate7532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHTBRACKETSi_in_predicate7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef7676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_varName_in_varRef7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_varName7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_parenthesizedExpr7724 = new BitSet(new long[]{0x540004902E240000L,0xC111129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr7726 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_parenthesizedExpr7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_contextItemExpr7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr7773 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_orderedExpr7775 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_orderedExpr7777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_orderedExpr7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr7801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_unorderedExpr7803 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr7805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_unorderedExpr7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall7830 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_functionCall7832 = new BitSet(new long[]{0x540004902E240000L,0xC111129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall7835 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall7838 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall7840 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_functionCall7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHANSi_in_dirElemConstructor8097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8099 = new BitSet(new long[]{0x2000000000000020L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor8101 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RIGHTSELFTERMINATOR_in_dirElemConstructor8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIGGERTHANSi_in_dirElemConstructor8109 = new BitSet(new long[]{0x8000000020004000L,0x1001008008000000L,0x0000000002000000L,0x0000000000004180L});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor8111 = new BitSet(new long[]{0x8000000020004000L,0x1001008008000000L,0x0000000002000000L,0x0000000000004180L});
    public static final BitSet FOLLOW_LEFTENDTAG_in_dirElemConstructor8114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8116 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_S_in_dirElemConstructor8118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BIGGERTHANSi_in_dirElemConstructor8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004800000L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList8148 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8150 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_dirAttributeList8153 = new BitSet(new long[]{0x0020100000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8155 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList8158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8183 = new BitSet(new long[]{0x0000100000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000008380L});
    public static final BitSet FOLLOW_EscapeQuot_in_dirAttributeValue8186 = new BitSet(new long[]{0x0000100000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000008380L});
    public static final BitSet FOLLOW_quotAttrValueContent_in_dirAttributeValue8190 = new BitSet(new long[]{0x0000100000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000008380L});
    public static final BitSet FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLEQUOTE_in_dirAttributeValue8232 = new BitSet(new long[]{0x0020000000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000010580L});
    public static final BitSet FOLLOW_EscapeApos_in_dirAttributeValue8235 = new BitSet(new long[]{0x0020000000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000010580L});
    public static final BitSet FOLLOW_aposAttrValueContent_in_dirAttributeValue8239 = new BitSet(new long[]{0x0020000000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000010580L});
    public static final BitSet FOLLOW_SINGLEQUOTE_in_dirAttributeValue8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotAttrContentChar_in_quotAttrValueContent8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_quotAttrValueContent8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AposAttrContentChar_in_aposAttrValueContent8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_aposAttrValueContent8345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent8366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_dirElemContent8438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContentChar_in_dirElemContent8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PredefinedEntityRef_in_commonContent8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharRef_in_commonContent8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELEFTBRACES_in_commonContent8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLERIGHTBRACES_in_commonContent8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enclosedExpr_in_commonContent8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTXMLCOMMENT_in_dirCommentConstructor8526 = new BitSet(new long[]{0x1000000000000000L,0x0020000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_dirCommentContents_in_dirCommentConstructor8528 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RIGHTXMLCOMMENT_in_dirCommentConstructor8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharNotMinus_in_dirCommentContents8557 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_MINUSSi_in_dirCommentContents8562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_CharNotMinus_in_dirCommentContents8564 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_LEFTPITARGET_in_dirPIConstructor8590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_piTarget_in_dirPIConstructor8592 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_S_in_dirPIConstructor8595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_dirPIContents_in_dirPIConstructor8597 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHTPITARGET_in_dirPIConstructor8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_dirPIContents8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTCDATA_in_cDataSection8658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_cDataSectionContents_in_cDataSection8660 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RIGHTCDATA_in_cDataSection8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_cDataSectionContents8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor8850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor8886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor8903 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compDocConstructor8905 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor8907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compDocConstructor8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor8925 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor8928 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compElemConstructor8933 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor8935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compElemConstructor8937 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compElemConstructor8941 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor8943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compElemConstructor8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr8970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor8986 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor8989 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compAttrConstructor8994 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor8996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compAttrConstructor8998 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compAttrConstructor9002 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compAttrConstructor9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor9023 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compTextConstructor9025 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor9027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compTextConstructor9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor9042 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compCommentConstructor9044 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor9046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compCommentConstructor9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9066 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor9069 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compPIConstructor9074 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor9076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compPIConstructor9078 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compPIConstructor9082 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor9084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compPIConstructor9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType9112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_QUESTIONMARKSi_in_singleType9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration9135 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000000800000L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType9171 = new BitSet(new long[]{0x0000000000000000L,0x0000001000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType9195 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_sequenceType9197 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_sequenceType9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType9255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType9260 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_itemType9262 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_itemType9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest9466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest9538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest9634 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_anyKindTest9636 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_anyKindTest9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENTNODE_in_documentTest9661 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_documentTest9663 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest9666 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest9670 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_documentTest9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest9701 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_textTest9703 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_textTest9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest9729 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_commentTest9731 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_commentTest9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest9762 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_piTest9764 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000000L,0x0000000000800800L});
    public static final BitSet FOLLOW_set_in_piTest9766 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_piTest9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest9797 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_attributeTest9799 = new BitSet(new long[]{0x0000000000000000L,0x0010001000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest9802 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest9805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeName_in_attributeTest9807 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_attributeTest9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard9832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest9848 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_schemaAttributeTest9850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest9852 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_schemaAttributeTest9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration9869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest9893 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_elementTest9895 = new BitSet(new long[]{0x0000000000000000L,0x0010001000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest9898 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest9901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeName_in_elementTest9903 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_QUESTIONMARKSi_in_elementTest9905 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_elementTest9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard9930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest9948 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_schemaElementTest9950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest9952 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_schemaElementTest9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName9993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName10017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName10044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection10093 = new BitSet(new long[]{0x0001000005000002L,0x0000000000100080L,0x1300000000000000L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection10095 = new BitSet(new long[]{0x0001000005000002L,0x0000000000100080L,0x1300000000000000L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection10099 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection10101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr10134 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_FTOR_in_ftOr10138 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr10140 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd10173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd10177 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd10179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot10208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot10212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_ftMildNot10214 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot10216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot10245 = new BitSet(new long[]{0x0000000002004000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions10264 = new BitSet(new long[]{0x0200000080000002L,0x0006800000000600L,0x0000000000400000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary10294 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary10296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ftPrimary10303 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary10305 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ftPrimary10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary10312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords10340 = new BitSet(new long[]{0x0000000100080802L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue10366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_ftWordsValue10371 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue10373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_ftWordsValue10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection10391 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_ftExtensionSelection10394 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000020000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection10396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_ftExtensionSelection10399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption10421 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption10423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption10430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption10432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption10438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes10466 = new BitSet(new long[]{0x0000000000000000L,0x0000400002100000L});
    public static final BitSet FOLLOW_ftRange_in_ftTimes10468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes10470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange10500 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange10540 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LEAST_in_ftRange10542 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange10582 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_MOST_in_ftRange10584 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange10624 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10626 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_TO_in_ftRange10628 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter10659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter10667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter10671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder10699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow10726 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow10728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow10730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance10755 = new BitSet(new long[]{0x0000000000000000L,0x0000400002100000L});
    public static final BitSet FOLLOW_ftRange_in_ftDistance10757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope10824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope10832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent10889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_START_in_ftContent10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent10897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_END_in_ftContent10899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent10905 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent10907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions10929 = new BitSet(new long[]{0x0200000080000002L,0x0006800000000600L,0x0000000000400000L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption10994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption11066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption11138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption11174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption11234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption11236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption11274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption11313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption11367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption11369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption11407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption11434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption11442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption11462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption11464 = new BitSet(new long[]{0x0000000000000000L,0x0200000000100000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption11510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption11512 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ftThesaurusOption11514 = new BitSet(new long[]{0x0000000000000000L,0x0200000000100000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption11517 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption11521 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption11525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption11527 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ftThesaurusOption11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption11569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption11571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID11594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID11596 = new BitSet(new long[]{0x0000000000000002L,0x0000400002100000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID11599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID11601 = new BitSet(new long[]{0x0000000000000002L,0x0000400002100000L});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID11606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID11608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption11630 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption11632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption11634 = new BitSet(new long[]{0x0000000000000000L,0x8000000000100000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption11636 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11638 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption11677 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption11679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption11719 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption11721 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption11723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption11725 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11727 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList11754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList11756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ftRefOrList11794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList11796 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList11799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList11801 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ftRefOrList11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral11818 = new BitSet(new long[]{0x0000000000000000L,0x8000000000100000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption11844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption11865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption11873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption11893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption11895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption11897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption11917 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption11919 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESLASH_in_synpred16896 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred16898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_synpred26918 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000000800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred26920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred37385 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred37387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_synpred37389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred49164 = new BitSet(new long[]{0x0000000000000000L,0x0000001000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred49166 = new BitSet(new long[]{0x0000000000000002L});

}