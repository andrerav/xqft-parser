// $ANTLR 3.0.1 test/TestLexing/FuckAss.g 2007-11-08 17:28:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FuckAssParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "HORSE", "CleanChar", "Char", "Kommentar", "Kom", "Word", "WS"
    };
    public static final int Word=9;
    public static final int Kommentar=7;
    public static final int CleanChar=5;
    public static final int WS=10;
    public static final int EOF=-1;
    public static final int HORSE=4;
    public static final int Char=6;
    public static final int Kom=8;

        public FuckAssParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "test/TestLexing/FuckAss.g"; }


    public FuckAssLexer fulexer;



    // $ANTLR start expr
    // test/TestLexing/FuckAss.g:29:1: expr : ( en | to | tre )* ;
    public final void expr() throws RecognitionException {
        try {
            // test/TestLexing/FuckAss.g:29:7: ( ( en | to | tre )* )
            // test/TestLexing/FuckAss.g:29:9: ( en | to | tre )*
            {
            // test/TestLexing/FuckAss.g:29:9: ( en | to | tre )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case Word:
                    {
                    alt1=1;
                    }
                    break;
                case Kom:
                    {
                    alt1=2;
                    }
                    break;
                case HORSE:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // test/TestLexing/FuckAss.g:29:10: en
            	    {
            	    pushFollow(FOLLOW_en_in_expr139);
            	    en();
            	    _fsp--;


            	    }
            	    break;
            	case 2 :
            	    // test/TestLexing/FuckAss.g:29:14: to
            	    {
            	    pushFollow(FOLLOW_to_in_expr142);
            	    to();
            	    _fsp--;


            	    }
            	    break;
            	case 3 :
            	    // test/TestLexing/FuckAss.g:29:19: tre
            	    {
            	    pushFollow(FOLLOW_tre_in_expr146);
            	    tre();
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
    // $ANTLR end expr


    // $ANTLR start en
    // test/TestLexing/FuckAss.g:30:1: en : Word ;
    public final void en() throws RecognitionException {
        try {
            // test/TestLexing/FuckAss.g:30:5: ( Word )
            // test/TestLexing/FuckAss.g:30:7: Word
            {
            match(input,Word,FOLLOW_Word_in_en156); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end en


    // $ANTLR start to
    // test/TestLexing/FuckAss.g:31:1: to : Kom ;
    public final void to() throws RecognitionException {
        try {
            // test/TestLexing/FuckAss.g:31:5: ( Kom )
            // test/TestLexing/FuckAss.g:31:7: Kom
            {
            match(input,Kom,FOLLOW_Kom_in_to164); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end to


    // $ANTLR start tre
    // test/TestLexing/FuckAss.g:32:1: tre : HORSE ;
    public final void tre() throws RecognitionException {
        try {
            // test/TestLexing/FuckAss.g:32:6: ( HORSE )
            // test/TestLexing/FuckAss.g:32:8: HORSE
            {
            match(input,HORSE,FOLLOW_HORSE_in_tre172); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end tre


 

    public static final BitSet FOLLOW_en_in_expr139 = new BitSet(new long[]{0x0000000000000312L});
    public static final BitSet FOLLOW_to_in_expr142 = new BitSet(new long[]{0x0000000000000312L});
    public static final BitSet FOLLOW_tre_in_expr146 = new BitSet(new long[]{0x0000000000000312L});
    public static final BitSet FOLLOW_Word_in_en156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Kom_in_to164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HORSE_in_tre172 = new BitSet(new long[]{0x0000000000000002L});

}