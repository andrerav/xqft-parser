// $ANTLR 3.0.1 test/CDataSectionContents/CData.g 2007-10-15 16:13:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CDataParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "CHAR", "CharUttrykk"
    };
    public static final int INT=4;
    public static final int CharUttrykk=6;
    public static final int EOF=-1;
    public static final int CHAR=5;

        public CDataParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "test/CDataSectionContents/CData.g"; }



    // $ANTLR start uttrykk
    // test/CDataSectionContents/CData.g:10:1: uttrykk : te= CharUttrykk {...}?;
    public final void uttrykk() throws RecognitionException {
        Token te=null;

        try {
            // test/CDataSectionContents/CData.g:10:9: (te= CharUttrykk {...}?)
            // test/CDataSectionContents/CData.g:10:10: te= CharUttrykk {...}?
            {
            te=(Token)input.LT(1);
            match(input,CharUttrykk,FOLLOW_CharUttrykk_in_uttrykk70); 
            if ( !( !te.getText().contains("]]>") ) ) {
                throw new FailedPredicateException(input, "uttrykk", " !$te.getText().contains(\"]]>\") ");
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
    // $ANTLR end uttrykk


 

    public static final BitSet FOLLOW_CharUttrykk_in_uttrykk70 = new BitSet(new long[]{0x0000000000000002L});

}