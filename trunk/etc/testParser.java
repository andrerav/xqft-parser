// $ANTLR 3.0.1 etc/test.g 2007-10-09 15:03:31
package test;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class testParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "';'", "'<'", "'>'", "'R'"
    };
    public static final int INT=4;
    public static final int EOF=-1;

        public testParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/test.g"; }



    // $ANTLR start uttrykk
    // etc/test.g:12:1: uttrykk : duren ( ';' duren )* ;
    public final void uttrykk() throws RecognitionException {
        try {
            // etc/test.g:12:9: ( duren ( ';' duren )* )
            // etc/test.g:12:11: duren ( ';' duren )*
            {
            pushFollow(FOLLOW_duren_in_uttrykk35);
            duren();
            _fsp--;

            // etc/test.g:12:17: ( ';' duren )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==5) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // etc/test.g:12:18: ';' duren
            	    {
            	    match(input,5,FOLLOW_5_in_uttrykk38); 
            	    pushFollow(FOLLOW_duren_in_uttrykk40);
            	    duren();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end uttrykk


    // $ANTLR start duren
    // etc/test.g:13:1: duren : '<' ( sopp | hest ) '>' ;
    public final void duren() throws RecognitionException {
        try {
            // etc/test.g:13:7: ( '<' ( sopp | hest ) '>' )
            // etc/test.g:13:9: '<' ( sopp | hest ) '>'
            {
            match(input,6,FOLLOW_6_in_duren49); 
            // etc/test.g:13:13: ( sopp | hest )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==8) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("13:13: ( sopp | hest )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/test.g:13:14: sopp
                    {
                    pushFollow(FOLLOW_sopp_in_duren52);
                    sopp();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // etc/test.g:13:19: hest
                    {
                    pushFollow(FOLLOW_hest_in_duren54);
                    hest();
                    _fsp--;


                    }
                    break;

            }

            match(input,7,FOLLOW_7_in_duren57); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end duren


    // $ANTLR start sopp
    // etc/test.g:14:1: sopp : INT ;
    public final void sopp() throws RecognitionException {
        try {
            // etc/test.g:14:6: ( INT )
            // etc/test.g:14:8: INT
            {
            match(input,INT,FOLLOW_INT_in_sopp64); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end sopp


    // $ANTLR start hest
    // etc/test.g:15:1: hest : 'R' INT 'R' ;
    public final void hest() throws RecognitionException {
        try {
            // etc/test.g:15:6: ( 'R' INT 'R' )
            // etc/test.g:15:8: 'R' INT 'R'
            {
            match(input,8,FOLLOW_8_in_hest71); 
            match(input,INT,FOLLOW_INT_in_hest73); 
            match(input,8,FOLLOW_8_in_hest75); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end hest


 

    public static final BitSet FOLLOW_duren_in_uttrykk35 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5_in_uttrykk38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_duren_in_uttrykk40 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6_in_duren49 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_sopp_in_duren52 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_hest_in_duren54 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_duren57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_sopp64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_hest71 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_hest73 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_hest75 = new BitSet(new long[]{0x0000000000000002L});

}