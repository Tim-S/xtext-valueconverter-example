package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEX", "RULE_BIN", "RULE_DECIMAL", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_HEX=4;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_STRING=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_BIN=5;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_values_0_0= ruleNumber ) ) ( (lv_values_1_0= ruleNumber ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_values_0_0 = null;

        AntlrDatatypeRuleToken lv_values_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_values_0_0= ruleNumber ) ) ( (lv_values_1_0= ruleNumber ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_values_0_0= ruleNumber ) ) ( (lv_values_1_0= ruleNumber ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_values_0_0= ruleNumber ) ) ( (lv_values_1_0= ruleNumber ) )* )
            // InternalMyDsl.g:79:3: ( (lv_values_0_0= ruleNumber ) ) ( (lv_values_1_0= ruleNumber ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_values_0_0= ruleNumber ) )
            // InternalMyDsl.g:80:4: (lv_values_0_0= ruleNumber )
            {
            // InternalMyDsl.g:80:4: (lv_values_0_0= ruleNumber )
            // InternalMyDsl.g:81:5: lv_values_0_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getModelAccess().getValuesNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_values_0_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_0_0,
            						"org.xtext.example.mydsl.MyDsl.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_values_1_0= ruleNumber ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_HEX && LA1_0<=RULE_DECIMAL)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_values_1_0= ruleNumber )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_values_1_0= ruleNumber )
            	    // InternalMyDsl.g:100:5: lv_values_1_0= ruleNumber
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getValuesNumberParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_values_1_0=ruleNumber();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Number");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNumber"
    // InternalMyDsl.g:121:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:123:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalMyDsl.g:124:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMyDsl.g:133:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | this_BIN_1= RULE_BIN | this_DECIMAL_2= RULE_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_BIN_1=null;
        Token this_DECIMAL_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:140:2: ( (this_HEX_0= RULE_HEX | this_BIN_1= RULE_BIN | this_DECIMAL_2= RULE_DECIMAL ) )
            // InternalMyDsl.g:141:2: (this_HEX_0= RULE_HEX | this_BIN_1= RULE_BIN | this_DECIMAL_2= RULE_DECIMAL )
            {
            // InternalMyDsl.g:141:2: (this_HEX_0= RULE_HEX | this_BIN_1= RULE_BIN | this_DECIMAL_2= RULE_DECIMAL )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_HEX:
                {
                alt2=1;
                }
                break;
            case RULE_BIN:
                {
                alt2=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:142:3: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

                    			current.merge(this_HEX_0);
                    		

                    			newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:150:3: this_BIN_1= RULE_BIN
                    {
                    this_BIN_1=(Token)match(input,RULE_BIN,FOLLOW_2); 

                    			current.merge(this_BIN_1);
                    		

                    			newLeafNode(this_BIN_1, grammarAccess.getNumberAccess().getBINTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:158:3: this_DECIMAL_2= RULE_DECIMAL
                    {
                    this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                    			current.merge(this_DECIMAL_2);
                    		

                    			newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000072L});

}