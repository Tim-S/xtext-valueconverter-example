package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNumber"
    // InternalMyDsl.g:78:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:82:1: ( ruleNumber EOF )
            // InternalMyDsl.g:83:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMyDsl.g:93:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:98:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalMyDsl.g:99:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalMyDsl.g:99:2: ( ( rule__Number__Alternatives ) )
            // InternalMyDsl.g:100:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalMyDsl.g:101:3: ( rule__Number__Alternatives )
            // InternalMyDsl.g:101:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalMyDsl.g:110:1: rule__Number__Alternatives : ( ( RULE_HEX ) | ( RULE_BIN ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:114:1: ( ( RULE_HEX ) | ( RULE_BIN ) | ( RULE_DECIMAL ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_HEX:
                {
                alt1=1;
                }
                break;
            case RULE_BIN:
                {
                alt1=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:115:2: ( RULE_HEX )
                    {
                    // InternalMyDsl.g:115:2: ( RULE_HEX )
                    // InternalMyDsl.g:116:3: RULE_HEX
                    {
                     before(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                    match(input,RULE_HEX,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:121:2: ( RULE_BIN )
                    {
                    // InternalMyDsl.g:121:2: ( RULE_BIN )
                    // InternalMyDsl.g:122:3: RULE_BIN
                    {
                     before(grammarAccess.getNumberAccess().getBINTerminalRuleCall_1()); 
                    match(input,RULE_BIN,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getBINTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:127:2: ( RULE_DECIMAL )
                    {
                    // InternalMyDsl.g:127:2: ( RULE_DECIMAL )
                    // InternalMyDsl.g:128:3: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_2()); 
                    match(input,RULE_DECIMAL,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:137:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:142:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:149:1: rule__Model__Group__0__Impl : ( ( rule__Model__ValuesAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:153:1: ( ( ( rule__Model__ValuesAssignment_0 ) ) )
            // InternalMyDsl.g:154:1: ( ( rule__Model__ValuesAssignment_0 ) )
            {
            // InternalMyDsl.g:154:1: ( ( rule__Model__ValuesAssignment_0 ) )
            // InternalMyDsl.g:155:2: ( rule__Model__ValuesAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getValuesAssignment_0()); 
            // InternalMyDsl.g:156:2: ( rule__Model__ValuesAssignment_0 )
            // InternalMyDsl.g:156:3: rule__Model__ValuesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ValuesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getValuesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:164:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:169:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:175:1: rule__Model__Group__1__Impl : ( ( rule__Model__ValuesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:179:1: ( ( ( rule__Model__ValuesAssignment_1 )* ) )
            // InternalMyDsl.g:180:1: ( ( rule__Model__ValuesAssignment_1 )* )
            {
            // InternalMyDsl.g:180:1: ( ( rule__Model__ValuesAssignment_1 )* )
            // InternalMyDsl.g:181:2: ( rule__Model__ValuesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getValuesAssignment_1()); 
            // InternalMyDsl.g:182:2: ( rule__Model__ValuesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_HEX && LA2_0<=RULE_DECIMAL)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:182:3: rule__Model__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__ValuesAssignment_0"
    // InternalMyDsl.g:191:1: rule__Model__ValuesAssignment_0 : ( ruleNumber ) ;
    public final void rule__Model__ValuesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:195:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:196:2: ( ruleNumber )
            {
            // InternalMyDsl.g:196:2: ( ruleNumber )
            // InternalMyDsl.g:197:3: ruleNumber
            {
             before(grammarAccess.getModelAccess().getValuesNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getModelAccess().getValuesNumberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ValuesAssignment_0"


    // $ANTLR start "rule__Model__ValuesAssignment_1"
    // InternalMyDsl.g:206:1: rule__Model__ValuesAssignment_1 : ( ruleNumber ) ;
    public final void rule__Model__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:211:2: ( ruleNumber )
            {
            // InternalMyDsl.g:211:2: ( ruleNumber )
            // InternalMyDsl.g:212:3: ruleNumber
            {
             before(grammarAccess.getModelAccess().getValuesNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getModelAccess().getValuesNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ValuesAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000072L});

}