package com.cohesionforce.avro.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.cohesionforce.avro.services.AvroSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAvroSchemaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "','", "']'", "'\"'", "'{'", "'type'", "':'", "'}'", "'record'", "'name'", "'namespace'", "'fields'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'.'"
    };
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAvroSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAvroSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAvroSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAvroSchema.g"; }



     	private AvroSchemaGrammarAccess grammarAccess;

        public InternalAvroSchemaParser(TokenStream input, AvroSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AvroSchema";
       	}

       	@Override
       	protected AvroSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAvroSchema"
    // InternalAvroSchema.g:64:1: entryRuleAvroSchema returns [EObject current=null] : iv_ruleAvroSchema= ruleAvroSchema EOF ;
    public final EObject entryRuleAvroSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvroSchema = null;


        try {
            // InternalAvroSchema.g:64:51: (iv_ruleAvroSchema= ruleAvroSchema EOF )
            // InternalAvroSchema.g:65:2: iv_ruleAvroSchema= ruleAvroSchema EOF
            {
             newCompositeNode(grammarAccess.getAvroSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvroSchema=ruleAvroSchema();

            state._fsp--;

             current =iv_ruleAvroSchema; 
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
    // $ANTLR end "entryRuleAvroSchema"


    // $ANTLR start "ruleAvroSchema"
    // InternalAvroSchema.g:71:1: ruleAvroSchema returns [EObject current=null] : ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) ) ;
    public final EObject ruleAvroSchema() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_1 = null;

        EObject lv_types_0_2 = null;

        EObject lv_types_0_3 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:77:2: ( ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) ) )
            // InternalAvroSchema.g:78:2: ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) )
            {
            // InternalAvroSchema.g:78:2: ( ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) ) )
            // InternalAvroSchema.g:79:3: ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) )
            {
            // InternalAvroSchema.g:79:3: ( (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType ) )
            // InternalAvroSchema.g:80:4: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )
            {
            // InternalAvroSchema.g:80:4: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAvroSchema.g:81:5: lv_types_0_1= ruleJsonType
                    {

                    					newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_0_1=ruleJsonType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_0_1,
                    						"com.cohesionforce.avro.AvroSchema.JsonType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:97:5: lv_types_0_2= ruleRecordType
                    {

                    					newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_0_2=ruleRecordType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_0_2,
                    						"com.cohesionforce.avro.AvroSchema.RecordType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:113:5: lv_types_0_3= ruleUnionType
                    {

                    					newCompositeNode(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_types_0_3=ruleUnionType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAvroSchemaRule());
                    					}
                    					add(
                    						current,
                    						"types",
                    						lv_types_0_3,
                    						"com.cohesionforce.avro.AvroSchema.UnionType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAvroSchema"


    // $ANTLR start "entryRuleUnionType"
    // InternalAvroSchema.g:134:1: entryRuleUnionType returns [EObject current=null] : iv_ruleUnionType= ruleUnionType EOF ;
    public final EObject entryRuleUnionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionType = null;


        try {
            // InternalAvroSchema.g:134:50: (iv_ruleUnionType= ruleUnionType EOF )
            // InternalAvroSchema.g:135:2: iv_ruleUnionType= ruleUnionType EOF
            {
             newCompositeNode(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionType=ruleUnionType();

            state._fsp--;

             current =iv_ruleUnionType; 
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
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // InternalAvroSchema.g:141:1: ruleUnionType returns [EObject current=null] : (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleUnionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:147:2: ( (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' ) )
            // InternalAvroSchema.g:148:2: (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' )
            {
            // InternalAvroSchema.g:148:2: (otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']' )
            // InternalAvroSchema.g:149:3: otherlv_0= '[' ( (lv_types_1_0= ruleUnionMember ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,10,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAvroSchema.g:153:3: ( (lv_types_1_0= ruleUnionMember ) )
            // InternalAvroSchema.g:154:4: (lv_types_1_0= ruleUnionMember )
            {
            // InternalAvroSchema.g:154:4: (lv_types_1_0= ruleUnionMember )
            // InternalAvroSchema.g:155:5: lv_types_1_0= ruleUnionMember
            {

            					newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_types_1_0=ruleUnionMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_1_0,
            						"com.cohesionforce.avro.AvroSchema.UnionMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAvroSchema.g:172:3: (otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAvroSchema.g:173:4: otherlv_2= ',' ( (lv_types_3_0= ruleUnionMember ) )
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAvroSchema.g:177:4: ( (lv_types_3_0= ruleUnionMember ) )
            	    // InternalAvroSchema.g:178:5: (lv_types_3_0= ruleUnionMember )
            	    {
            	    // InternalAvroSchema.g:178:5: (lv_types_3_0= ruleUnionMember )
            	    // InternalAvroSchema.g:179:6: lv_types_3_0= ruleUnionMember
            	    {

            	    						newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_types_3_0=ruleUnionMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_3_0,
            	    							"com.cohesionforce.avro.AvroSchema.UnionMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleUnionMember"
    // InternalAvroSchema.g:205:1: entryRuleUnionMember returns [EObject current=null] : iv_ruleUnionMember= ruleUnionMember EOF ;
    public final EObject entryRuleUnionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionMember = null;


        try {
            // InternalAvroSchema.g:205:52: (iv_ruleUnionMember= ruleUnionMember EOF )
            // InternalAvroSchema.g:206:2: iv_ruleUnionMember= ruleUnionMember EOF
            {
             newCompositeNode(grammarAccess.getUnionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionMember=ruleUnionMember();

            state._fsp--;

             current =iv_ruleUnionMember; 
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
    // $ANTLR end "entryRuleUnionMember"


    // $ANTLR start "ruleUnionMember"
    // InternalAvroSchema.g:212:1: ruleUnionMember returns [EObject current=null] : (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) ) ;
    public final EObject ruleUnionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject this_RecordType_0 = null;

        EObject this_ArrayType_1 = null;

        EObject this_Primitive_2 = null;

        EObject this_MapType_3 = null;

        EObject this_EnumType_4 = null;

        EObject this_FixedType_5 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:218:2: ( (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) ) )
            // InternalAvroSchema.g:219:2: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) )
            {
            // InternalAvroSchema.g:219:2: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAvroSchema.g:220:3: this_RecordType_0= ruleRecordType
                    {

                    			newCompositeNode(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecordType_0=ruleRecordType();

                    state._fsp--;


                    			current = this_RecordType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:229:3: this_ArrayType_1= ruleArrayType
                    {

                    			newCompositeNode(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayType_1=ruleArrayType();

                    state._fsp--;


                    			current = this_ArrayType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:238:3: this_Primitive_2= rulePrimitive
                    {

                    			newCompositeNode(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primitive_2=rulePrimitive();

                    state._fsp--;


                    			current = this_Primitive_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:247:3: this_MapType_3= ruleMapType
                    {

                    			newCompositeNode(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapType_3=ruleMapType();

                    state._fsp--;


                    			current = this_MapType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:256:3: this_EnumType_4= ruleEnumType
                    {

                    			newCompositeNode(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumType_4=ruleEnumType();

                    state._fsp--;


                    			current = this_EnumType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAvroSchema.g:265:3: this_FixedType_5= ruleFixedType
                    {

                    			newCompositeNode(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FixedType_5=ruleFixedType();

                    state._fsp--;


                    			current = this_FixedType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAvroSchema.g:274:3: (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' )
                    {
                    // InternalAvroSchema.g:274:3: (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' )
                    // InternalAvroSchema.g:275:4: otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0());
                    			
                    // InternalAvroSchema.g:279:4: ( (otherlv_7= RULE_ID ) )
                    // InternalAvroSchema.g:280:5: (otherlv_7= RULE_ID )
                    {
                    // InternalAvroSchema.g:280:5: (otherlv_7= RULE_ID )
                    // InternalAvroSchema.g:281:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnionMemberRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_7, grammarAccess.getUnionMemberAccess().getRecordRefRecordCrossReference_6_1_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2());
                    			

                    }


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
        }
        return current;
    }
    // $ANTLR end "ruleUnionMember"


    // $ANTLR start "entryRuleJsonType"
    // InternalAvroSchema.g:301:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // InternalAvroSchema.g:301:49: (iv_ruleJsonType= ruleJsonType EOF )
            // InternalAvroSchema.g:302:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
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
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // InternalAvroSchema.g:308:1: ruleJsonType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:314:2: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' ) )
            // InternalAvroSchema.g:315:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' )
            {
            // InternalAvroSchema.g:315:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}' )
            // InternalAvroSchema.g:316:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( (lv_type_6_0= rulePrimitive ) ) otherlv_7= '\"' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonTypeAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getJsonTypeAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5());
            		
            // InternalAvroSchema.g:340:3: ( (lv_type_6_0= rulePrimitive ) )
            // InternalAvroSchema.g:341:4: (lv_type_6_0= rulePrimitive )
            {
            // InternalAvroSchema.g:341:4: (lv_type_6_0= rulePrimitive )
            // InternalAvroSchema.g:342:5: lv_type_6_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_6_0=rulePrimitive();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"com.cohesionforce.avro.AvroSchema.Primitive");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleRecordType"
    // InternalAvroSchema.g:371:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalAvroSchema.g:371:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalAvroSchema.g:372:2: iv_ruleRecordType= ruleRecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;

             current =iv_ruleRecordType; 
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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalAvroSchema.g:378:1: ruleRecordType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_namespace_22_0 = null;

        EObject lv_fieldList_30_0 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:384:2: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' ) )
            // InternalAvroSchema.g:385:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' )
            {
            // InternalAvroSchema.g:385:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}' )
            // InternalAvroSchema.g:386:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'record' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )? otherlv_24= ',' otherlv_25= '\"' otherlv_26= 'fields' otherlv_27= '\"' otherlv_28= ':' otherlv_29= '[' ( (lv_fieldList_30_0= ruleFieldList ) ) otherlv_31= ']' otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getRecordKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getRecordTypeAccess().getNameKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getRecordTypeAccess().getColonKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13());
            		
            // InternalAvroSchema.g:442:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalAvroSchema.g:443:4: (lv_name_14_0= RULE_ID )
            {
            // InternalAvroSchema.g:443:4: (lv_name_14_0= RULE_ID )
            // InternalAvroSchema.g:444:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_14_0, grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecordTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_14_0,
            						"com.cohesionforce.avro.AvroSchema.ID");
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15());
            		
            // InternalAvroSchema.g:464:3: (otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==20) ) {
                        alt4=1;
                    }
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalAvroSchema.g:465:4: otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'namespace' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '\"' ( (lv_namespace_22_0= ruleNamespace ) ) otherlv_23= '\"'
                    {
                    otherlv_16=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0());
                    			
                    otherlv_17=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1());
                    			
                    otherlv_18=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2());
                    			
                    otherlv_19=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3());
                    			
                    otherlv_20=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getRecordTypeAccess().getColonKeyword_16_4());
                    			
                    otherlv_21=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5());
                    			
                    // InternalAvroSchema.g:489:4: ( (lv_namespace_22_0= ruleNamespace ) )
                    // InternalAvroSchema.g:490:5: (lv_namespace_22_0= ruleNamespace )
                    {
                    // InternalAvroSchema.g:490:5: (lv_namespace_22_0= ruleNamespace )
                    // InternalAvroSchema.g:491:6: lv_namespace_22_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_namespace_22_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecordTypeRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_22_0,
                    							"com.cohesionforce.avro.AvroSchema.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getRecordTypeAccess().getCommaKeyword_17());
            		
            otherlv_25=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_25, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18());
            		
            otherlv_26=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_26, grammarAccess.getRecordTypeAccess().getFieldsKeyword_19());
            		
            otherlv_27=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_27, grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20());
            		
            otherlv_28=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_28, grammarAccess.getRecordTypeAccess().getColonKeyword_21());
            		
            otherlv_29=(Token)match(input,10,FOLLOW_16); 

            			newLeafNode(otherlv_29, grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22());
            		
            // InternalAvroSchema.g:537:3: ( (lv_fieldList_30_0= ruleFieldList ) )
            // InternalAvroSchema.g:538:4: (lv_fieldList_30_0= ruleFieldList )
            {
            // InternalAvroSchema.g:538:4: (lv_fieldList_30_0= ruleFieldList )
            // InternalAvroSchema.g:539:5: lv_fieldList_30_0= ruleFieldList
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_17);
            lv_fieldList_30_0=ruleFieldList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					set(
            						current,
            						"fieldList",
            						lv_fieldList_30_0,
            						"com.cohesionforce.avro.AvroSchema.FieldList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_31, grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_24());
            		
            otherlv_32=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_25());
            		

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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleFieldList"
    // InternalAvroSchema.g:568:1: entryRuleFieldList returns [EObject current=null] : iv_ruleFieldList= ruleFieldList EOF ;
    public final EObject entryRuleFieldList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldList = null;


        try {
            // InternalAvroSchema.g:568:50: (iv_ruleFieldList= ruleFieldList EOF )
            // InternalAvroSchema.g:569:2: iv_ruleFieldList= ruleFieldList EOF
            {
             newCompositeNode(grammarAccess.getFieldListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldList=ruleFieldList();

            state._fsp--;

             current =iv_ruleFieldList; 
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
    // $ANTLR end "entryRuleFieldList"


    // $ANTLR start "ruleFieldList"
    // InternalAvroSchema.g:575:1: ruleFieldList returns [EObject current=null] : ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* ) ;
    public final EObject ruleFieldList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:581:2: ( ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* ) )
            // InternalAvroSchema.g:582:2: ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* )
            {
            // InternalAvroSchema.g:582:2: ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* )
            // InternalAvroSchema.g:583:3: ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )*
            {
            // InternalAvroSchema.g:583:3: ( (lv_fields_0_0= ruleField ) )
            // InternalAvroSchema.g:584:4: (lv_fields_0_0= ruleField )
            {
            // InternalAvroSchema.g:584:4: (lv_fields_0_0= ruleField )
            // InternalAvroSchema.g:585:5: lv_fields_0_0= ruleField
            {

            					newCompositeNode(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_fields_0_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldListRule());
            					}
            					add(
            						current,
            						"fields",
            						lv_fields_0_0,
            						"com.cohesionforce.avro.AvroSchema.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAvroSchema.g:602:3: (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAvroSchema.g:603:4: otherlv_1= ',' ( (lv_fields_2_0= ruleField ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_16); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFieldListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAvroSchema.g:607:4: ( (lv_fields_2_0= ruleField ) )
            	    // InternalAvroSchema.g:608:5: (lv_fields_2_0= ruleField )
            	    {
            	    // InternalAvroSchema.g:608:5: (lv_fields_2_0= ruleField )
            	    // InternalAvroSchema.g:609:6: lv_fields_2_0= ruleField
            	    {

            	    						newCompositeNode(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_fields_2_0=ruleField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFieldListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fields",
            	    							lv_fields_2_0,
            	    							"com.cohesionforce.avro.AvroSchema.Field");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleFieldList"


    // $ANTLR start "entryRuleField"
    // InternalAvroSchema.g:631:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAvroSchema.g:631:46: (iv_ruleField= ruleField EOF )
            // InternalAvroSchema.g:632:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAvroSchema.g:638:1: ruleField returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_1=null;
        Token lv_name_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_23=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;

        EObject lv_array_19_0 = null;

        EObject lv_map_20_0 = null;

        EObject lv_fixed_21_0 = null;

        EObject lv_union_22_0 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:644:2: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' ) )
            // InternalAvroSchema.g:645:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' )
            {
            // InternalAvroSchema.g:645:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}' )
            // InternalAvroSchema.g:646:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'name' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) ) otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'type' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getQuotationMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getQuotationMarkKeyword_5());
            		
            // InternalAvroSchema.g:670:3: ( ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) ) )
            // InternalAvroSchema.g:671:4: ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) )
            {
            // InternalAvroSchema.g:671:4: ( (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID ) )
            // InternalAvroSchema.g:672:5: (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID )
            {
            // InternalAvroSchema.g:672:5: (lv_name_6_1= 'name' | lv_name_6_2= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAvroSchema.g:673:6: lv_name_6_1= 'name'
                    {
                    lv_name_6_1=(Token)match(input,19,FOLLOW_6); 

                    						newLeafNode(lv_name_6_1, grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_6_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:684:6: lv_name_6_2= RULE_ID
                    {
                    lv_name_6_2=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_6_2, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_2,
                    							"com.cohesionforce.avro.AvroSchema.ID");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getQuotationMarkKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getQuotationMarkKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getTypeKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getQuotationMarkKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getColonKeyword_12());
            		
            // InternalAvroSchema.g:725:3: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) )
            int alt7=8;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalAvroSchema.g:726:4: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // InternalAvroSchema.g:726:4: ( (lv_primitive_13_0= rulePrimitive ) )
                    // InternalAvroSchema.g:727:5: (lv_primitive_13_0= rulePrimitive )
                    {
                    // InternalAvroSchema.g:727:5: (lv_primitive_13_0= rulePrimitive )
                    // InternalAvroSchema.g:728:6: lv_primitive_13_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"primitive",
                    							lv_primitive_13_0,
                    							"com.cohesionforce.avro.AvroSchema.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:746:4: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // InternalAvroSchema.g:746:4: ( (lv_record_14_0= ruleRecordType ) )
                    // InternalAvroSchema.g:747:5: (lv_record_14_0= ruleRecordType )
                    {
                    // InternalAvroSchema.g:747:5: (lv_record_14_0= ruleRecordType )
                    // InternalAvroSchema.g:748:6: lv_record_14_0= ruleRecordType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"record",
                    							lv_record_14_0,
                    							"com.cohesionforce.avro.AvroSchema.RecordType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:766:4: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // InternalAvroSchema.g:766:4: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // InternalAvroSchema.g:767:5: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_5); 

                    					newLeafNode(otherlv_15, grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0());
                    				
                    // InternalAvroSchema.g:771:5: ( (otherlv_16= RULE_ID ) )
                    // InternalAvroSchema.g:772:6: (otherlv_16= RULE_ID )
                    {
                    // InternalAvroSchema.g:772:6: (otherlv_16= RULE_ID )
                    // InternalAvroSchema.g:773:7: otherlv_16= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFieldRule());
                    							}
                    						
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_6); 

                    							newLeafNode(otherlv_16, grammarAccess.getFieldAccess().getRecordRefRecordCrossReference_13_2_1_0());
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_9); 

                    					newLeafNode(otherlv_17, grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:790:4: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // InternalAvroSchema.g:790:4: ( (lv_etype_18_0= ruleEnumType ) )
                    // InternalAvroSchema.g:791:5: (lv_etype_18_0= ruleEnumType )
                    {
                    // InternalAvroSchema.g:791:5: (lv_etype_18_0= ruleEnumType )
                    // InternalAvroSchema.g:792:6: lv_etype_18_0= ruleEnumType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"etype",
                    							lv_etype_18_0,
                    							"com.cohesionforce.avro.AvroSchema.EnumType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:810:4: ( (lv_array_19_0= ruleArrayType ) )
                    {
                    // InternalAvroSchema.g:810:4: ( (lv_array_19_0= ruleArrayType ) )
                    // InternalAvroSchema.g:811:5: (lv_array_19_0= ruleArrayType )
                    {
                    // InternalAvroSchema.g:811:5: (lv_array_19_0= ruleArrayType )
                    // InternalAvroSchema.g:812:6: lv_array_19_0= ruleArrayType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_array_19_0=ruleArrayType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"array",
                    							lv_array_19_0,
                    							"com.cohesionforce.avro.AvroSchema.ArrayType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAvroSchema.g:830:4: ( (lv_map_20_0= ruleMapType ) )
                    {
                    // InternalAvroSchema.g:830:4: ( (lv_map_20_0= ruleMapType ) )
                    // InternalAvroSchema.g:831:5: (lv_map_20_0= ruleMapType )
                    {
                    // InternalAvroSchema.g:831:5: (lv_map_20_0= ruleMapType )
                    // InternalAvroSchema.g:832:6: lv_map_20_0= ruleMapType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_map_20_0=ruleMapType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"map",
                    							lv_map_20_0,
                    							"com.cohesionforce.avro.AvroSchema.MapType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAvroSchema.g:850:4: ( (lv_fixed_21_0= ruleFixedType ) )
                    {
                    // InternalAvroSchema.g:850:4: ( (lv_fixed_21_0= ruleFixedType ) )
                    // InternalAvroSchema.g:851:5: (lv_fixed_21_0= ruleFixedType )
                    {
                    // InternalAvroSchema.g:851:5: (lv_fixed_21_0= ruleFixedType )
                    // InternalAvroSchema.g:852:6: lv_fixed_21_0= ruleFixedType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_fixed_21_0=ruleFixedType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"fixed",
                    							lv_fixed_21_0,
                    							"com.cohesionforce.avro.AvroSchema.FixedType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAvroSchema.g:870:4: ( (lv_union_22_0= ruleUnionType ) )
                    {
                    // InternalAvroSchema.g:870:4: ( (lv_union_22_0= ruleUnionType ) )
                    // InternalAvroSchema.g:871:5: (lv_union_22_0= ruleUnionType )
                    {
                    // InternalAvroSchema.g:871:5: (lv_union_22_0= ruleUnionType )
                    // InternalAvroSchema.g:872:6: lv_union_22_0= ruleUnionType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_union_22_0=ruleUnionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"union",
                    							lv_union_22_0,
                    							"com.cohesionforce.avro.AvroSchema.UnionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnumType"
    // InternalAvroSchema.g:898:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // InternalAvroSchema.g:898:49: (iv_ruleEnumType= ruleEnumType EOF )
            // InternalAvroSchema.g:899:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // InternalAvroSchema.g:905:1: ruleEnumType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_symbols_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_symbols_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;


        	enterRule();

        try {
            // InternalAvroSchema.g:911:2: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' ) )
            // InternalAvroSchema.g:912:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' )
            {
            // InternalAvroSchema.g:912:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}' )
            // InternalAvroSchema.g:913:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'enum' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'name' otherlv_11= '\"' otherlv_12= ':' otherlv_13= '\"' ( (lv_name_14_0= RULE_ID ) ) otherlv_15= '\"' otherlv_16= ',' otherlv_17= '\"' otherlv_18= 'symbols' otherlv_19= '\"' otherlv_20= ':' otherlv_21= '[' (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' ) (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )* otherlv_29= ']' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumTypeAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumTypeAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumTypeAccess().getEnumKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumTypeAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getEnumTypeAccess().getNameKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getEnumTypeAccess().getColonKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13());
            		
            // InternalAvroSchema.g:969:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalAvroSchema.g:970:4: (lv_name_14_0= RULE_ID )
            {
            // InternalAvroSchema.g:970:4: (lv_name_14_0= RULE_ID )
            // InternalAvroSchema.g:971:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_14_0, grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_14_0,
            						"com.cohesionforce.avro.AvroSchema.ID");
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15());
            		
            otherlv_16=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_16, grammarAccess.getEnumTypeAccess().getCommaKeyword_16());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_17, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17());
            		
            otherlv_18=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18());
            		
            otherlv_19=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_19, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19());
            		
            otherlv_20=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_20, grammarAccess.getEnumTypeAccess().getColonKeyword_20());
            		
            otherlv_21=(Token)match(input,10,FOLLOW_6); 

            			newLeafNode(otherlv_21, grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21());
            		
            // InternalAvroSchema.g:1015:3: (otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"' )
            // InternalAvroSchema.g:1016:4: otherlv_22= '\"' ( (lv_symbols_23_0= RULE_ID ) ) otherlv_24= '\"'
            {
            otherlv_22=(Token)match(input,13,FOLLOW_5); 

            				newLeafNode(otherlv_22, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0());
            			
            // InternalAvroSchema.g:1020:4: ( (lv_symbols_23_0= RULE_ID ) )
            // InternalAvroSchema.g:1021:5: (lv_symbols_23_0= RULE_ID )
            {
            // InternalAvroSchema.g:1021:5: (lv_symbols_23_0= RULE_ID )
            // InternalAvroSchema.g:1022:6: lv_symbols_23_0= RULE_ID
            {
            lv_symbols_23_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            						newLeafNode(lv_symbols_23_0, grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEnumTypeRule());
            						}
            						addWithLastConsumed(
            							current,
            							"symbols",
            							lv_symbols_23_0,
            							"com.cohesionforce.avro.AvroSchema.ID");
            					

            }


            }

            otherlv_24=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_24, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2());
            			

            }

            // InternalAvroSchema.g:1043:3: (otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAvroSchema.g:1044:4: otherlv_25= ',' otherlv_26= '\"' ( (lv_symbols_27_0= RULE_ID ) ) otherlv_28= '\"'
            	    {
            	    otherlv_25=(Token)match(input,11,FOLLOW_6); 

            	    				newLeafNode(otherlv_25, grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0());
            	    			
            	    otherlv_26=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_26, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1());
            	    			
            	    // InternalAvroSchema.g:1052:4: ( (lv_symbols_27_0= RULE_ID ) )
            	    // InternalAvroSchema.g:1053:5: (lv_symbols_27_0= RULE_ID )
            	    {
            	    // InternalAvroSchema.g:1053:5: (lv_symbols_27_0= RULE_ID )
            	    // InternalAvroSchema.g:1054:6: lv_symbols_27_0= RULE_ID
            	    {
            	    lv_symbols_27_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(lv_symbols_27_0, grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEnumTypeRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"symbols",
            	    							lv_symbols_27_0,
            	    							"com.cohesionforce.avro.AvroSchema.ID");
            	    					

            	    }


            	    }

            	    otherlv_28=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_28, grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_29=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_29, grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24());
            		
            otherlv_30=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25());
            		

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleArrayType"
    // InternalAvroSchema.g:1087:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalAvroSchema.g:1087:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalAvroSchema.g:1088:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalAvroSchema.g:1094:1: ruleArrayType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:1100:2: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' ) )
            // InternalAvroSchema.g:1101:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' )
            {
            // InternalAvroSchema.g:1101:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}' )
            // InternalAvroSchema.g:1102:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'array' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getArrayTypeAccess().getArrayKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getArrayTypeAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getArrayTypeAccess().getItemsKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getArrayTypeAccess().getColonKeyword_12());
            		
            // InternalAvroSchema.g:1154:3: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAvroSchema.g:1155:4: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // InternalAvroSchema.g:1155:4: ( (lv_primitive_13_0= rulePrimitive ) )
                    // InternalAvroSchema.g:1156:5: (lv_primitive_13_0= rulePrimitive )
                    {
                    // InternalAvroSchema.g:1156:5: (lv_primitive_13_0= rulePrimitive )
                    // InternalAvroSchema.g:1157:6: lv_primitive_13_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"primitive",
                    							lv_primitive_13_0,
                    							"com.cohesionforce.avro.AvroSchema.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:1175:4: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // InternalAvroSchema.g:1175:4: ( (lv_record_14_0= ruleRecordType ) )
                    // InternalAvroSchema.g:1176:5: (lv_record_14_0= ruleRecordType )
                    {
                    // InternalAvroSchema.g:1176:5: (lv_record_14_0= ruleRecordType )
                    // InternalAvroSchema.g:1177:6: lv_record_14_0= ruleRecordType
                    {

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"record",
                    							lv_record_14_0,
                    							"com.cohesionforce.avro.AvroSchema.RecordType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:1195:4: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // InternalAvroSchema.g:1195:4: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // InternalAvroSchema.g:1196:5: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_5); 

                    					newLeafNode(otherlv_15, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0());
                    				
                    // InternalAvroSchema.g:1200:5: ( (otherlv_16= RULE_ID ) )
                    // InternalAvroSchema.g:1201:6: (otherlv_16= RULE_ID )
                    {
                    // InternalAvroSchema.g:1201:6: (otherlv_16= RULE_ID )
                    // InternalAvroSchema.g:1202:7: otherlv_16= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getArrayTypeRule());
                    							}
                    						
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_6); 

                    							newLeafNode(otherlv_16, grammarAccess.getArrayTypeAccess().getRecordRefRecordCrossReference_13_2_1_0());
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_9); 

                    					newLeafNode(otherlv_17, grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:1219:4: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // InternalAvroSchema.g:1219:4: ( (lv_etype_18_0= ruleEnumType ) )
                    // InternalAvroSchema.g:1220:5: (lv_etype_18_0= ruleEnumType )
                    {
                    // InternalAvroSchema.g:1220:5: (lv_etype_18_0= ruleEnumType )
                    // InternalAvroSchema.g:1221:6: lv_etype_18_0= ruleEnumType
                    {

                    						newCompositeNode(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"etype",
                    							lv_etype_18_0,
                    							"com.cohesionforce.avro.AvroSchema.EnumType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleMapType"
    // InternalAvroSchema.g:1247:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalAvroSchema.g:1247:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalAvroSchema.g:1248:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
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
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalAvroSchema.g:1254:1: ruleMapType returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_primitive_13_0 = null;

        EObject lv_record_14_0 = null;

        EObject lv_etype_18_0 = null;

        EObject lv_atype_19_0 = null;



        	enterRule();

        try {
            // InternalAvroSchema.g:1260:2: ( (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' ) )
            // InternalAvroSchema.g:1261:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' )
            {
            // InternalAvroSchema.g:1261:2: (otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}' )
            // InternalAvroSchema.g:1262:3: otherlv_0= '{' otherlv_1= '\"' otherlv_2= 'type' otherlv_3= '\"' otherlv_4= ':' otherlv_5= '\"' otherlv_6= 'map' otherlv_7= '\"' otherlv_8= ',' otherlv_9= '\"' otherlv_10= 'items' otherlv_11= '\"' otherlv_12= ':' ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMapTypeAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getMapTypeAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getMapTypeAccess().getMapKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getMapTypeAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getMapTypeAccess().getItemsKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getMapTypeAccess().getColonKeyword_12());
            		
            // InternalAvroSchema.g:1314:3: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) )
            int alt10=5;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalAvroSchema.g:1315:4: ( (lv_primitive_13_0= rulePrimitive ) )
                    {
                    // InternalAvroSchema.g:1315:4: ( (lv_primitive_13_0= rulePrimitive ) )
                    // InternalAvroSchema.g:1316:5: (lv_primitive_13_0= rulePrimitive )
                    {
                    // InternalAvroSchema.g:1316:5: (lv_primitive_13_0= rulePrimitive )
                    // InternalAvroSchema.g:1317:6: lv_primitive_13_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_primitive_13_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    						}
                    						set(
                    							current,
                    							"primitive",
                    							lv_primitive_13_0,
                    							"com.cohesionforce.avro.AvroSchema.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:1335:4: ( (lv_record_14_0= ruleRecordType ) )
                    {
                    // InternalAvroSchema.g:1335:4: ( (lv_record_14_0= ruleRecordType ) )
                    // InternalAvroSchema.g:1336:5: (lv_record_14_0= ruleRecordType )
                    {
                    // InternalAvroSchema.g:1336:5: (lv_record_14_0= ruleRecordType )
                    // InternalAvroSchema.g:1337:6: lv_record_14_0= ruleRecordType
                    {

                    						newCompositeNode(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_record_14_0=ruleRecordType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    						}
                    						set(
                    							current,
                    							"record",
                    							lv_record_14_0,
                    							"com.cohesionforce.avro.AvroSchema.RecordType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:1355:4: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    {
                    // InternalAvroSchema.g:1355:4: (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' )
                    // InternalAvroSchema.g:1356:5: otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_5); 

                    					newLeafNode(otherlv_15, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0());
                    				
                    // InternalAvroSchema.g:1360:5: ( (otherlv_16= RULE_ID ) )
                    // InternalAvroSchema.g:1361:6: (otherlv_16= RULE_ID )
                    {
                    // InternalAvroSchema.g:1361:6: (otherlv_16= RULE_ID )
                    // InternalAvroSchema.g:1362:7: otherlv_16= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMapTypeRule());
                    							}
                    						
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_6); 

                    							newLeafNode(otherlv_16, grammarAccess.getMapTypeAccess().getRecordRefRecordCrossReference_13_2_1_0());
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_9); 

                    					newLeafNode(otherlv_17, grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:1379:4: ( (lv_etype_18_0= ruleEnumType ) )
                    {
                    // InternalAvroSchema.g:1379:4: ( (lv_etype_18_0= ruleEnumType ) )
                    // InternalAvroSchema.g:1380:5: (lv_etype_18_0= ruleEnumType )
                    {
                    // InternalAvroSchema.g:1380:5: (lv_etype_18_0= ruleEnumType )
                    // InternalAvroSchema.g:1381:6: lv_etype_18_0= ruleEnumType
                    {

                    						newCompositeNode(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_etype_18_0=ruleEnumType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    						}
                    						set(
                    							current,
                    							"etype",
                    							lv_etype_18_0,
                    							"com.cohesionforce.avro.AvroSchema.EnumType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:1399:4: ( (lv_atype_19_0= ruleArrayType ) )
                    {
                    // InternalAvroSchema.g:1399:4: ( (lv_atype_19_0= ruleArrayType ) )
                    // InternalAvroSchema.g:1400:5: (lv_atype_19_0= ruleArrayType )
                    {
                    // InternalAvroSchema.g:1400:5: (lv_atype_19_0= ruleArrayType )
                    // InternalAvroSchema.g:1401:6: lv_atype_19_0= ruleArrayType
                    {

                    						newCompositeNode(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_atype_19_0=ruleArrayType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    						}
                    						set(
                    							current,
                    							"atype",
                    							lv_atype_19_0,
                    							"com.cohesionforce.avro.AvroSchema.ArrayType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleFixedType"
    // InternalAvroSchema.g:1427:1: entryRuleFixedType returns [EObject current=null] : iv_ruleFixedType= ruleFixedType EOF ;
    public final EObject entryRuleFixedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixedType = null;


        try {
            // InternalAvroSchema.g:1427:50: (iv_ruleFixedType= ruleFixedType EOF )
            // InternalAvroSchema.g:1428:2: iv_ruleFixedType= ruleFixedType EOF
            {
             newCompositeNode(grammarAccess.getFixedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFixedType=ruleFixedType();

            state._fsp--;

             current =iv_ruleFixedType; 
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
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // InternalAvroSchema.g:1434:1: ruleFixedType returns [EObject current=null] : (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' ) ;
    public final EObject ruleFixedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_size_17_0=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalAvroSchema.g:1440:2: ( (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' ) )
            // InternalAvroSchema.g:1441:2: (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' )
            {
            // InternalAvroSchema.g:1441:2: (otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"' )
            // InternalAvroSchema.g:1442:3: otherlv_0= '\"' otherlv_1= 'fixed' otherlv_2= '\"' otherlv_3= ',' otherlv_4= '\"' otherlv_5= 'name' otherlv_6= '\"' otherlv_7= ':' otherlv_8= '\"' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '\"' otherlv_11= ',' otherlv_12= '\"' otherlv_13= 'size' otherlv_14= '\"' otherlv_15= ':' otherlv_16= '\"' ( (lv_size_17_0= RULE_INT ) ) otherlv_18= '\"'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFixedTypeAccess().getFixedKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getFixedTypeAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFixedTypeAccess().getNameKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getFixedTypeAccess().getColonKeyword_7());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8());
            		
            // InternalAvroSchema.g:1478:3: ( (lv_name_9_0= RULE_ID ) )
            // InternalAvroSchema.g:1479:4: (lv_name_9_0= RULE_ID )
            {
            // InternalAvroSchema.g:1479:4: (lv_name_9_0= RULE_ID )
            // InternalAvroSchema.g:1480:5: lv_name_9_0= RULE_ID
            {
            lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_9_0, grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFixedTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"com.cohesionforce.avro.AvroSchema.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10());
            		
            otherlv_11=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getFixedTypeAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_12, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12());
            		
            otherlv_13=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getFixedTypeAccess().getSizeKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_14, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getFixedTypeAccess().getColonKeyword_15());
            		
            otherlv_16=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_16, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16());
            		
            // InternalAvroSchema.g:1524:3: ( (lv_size_17_0= RULE_INT ) )
            // InternalAvroSchema.g:1525:4: (lv_size_17_0= RULE_INT )
            {
            // InternalAvroSchema.g:1525:4: (lv_size_17_0= RULE_INT )
            // InternalAvroSchema.g:1526:5: lv_size_17_0= RULE_INT
            {
            lv_size_17_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_size_17_0, grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFixedTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"size",
            						lv_size_17_0,
            						"com.cohesionforce.avro.AvroSchema.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18());
            		

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
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRulePrimitive"
    // InternalAvroSchema.g:1550:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalAvroSchema.g:1550:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalAvroSchema.g:1551:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalAvroSchema.g:1557:1: rulePrimitive returns [EObject current=null] : (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        Token lv_type_1_4=null;
        Token lv_type_1_5=null;
        Token lv_type_1_6=null;
        Token lv_type_1_7=null;
        Token lv_type_1_8=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAvroSchema.g:1563:2: ( (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' ) )
            // InternalAvroSchema.g:1564:2: (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' )
            {
            // InternalAvroSchema.g:1564:2: (otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"' )
            // InternalAvroSchema.g:1565:3: otherlv_0= '\"' ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) ) otherlv_2= '\"'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0());
            		
            // InternalAvroSchema.g:1569:3: ( ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) ) )
            // InternalAvroSchema.g:1570:4: ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) )
            {
            // InternalAvroSchema.g:1570:4: ( (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' ) )
            // InternalAvroSchema.g:1571:5: (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' )
            {
            // InternalAvroSchema.g:1571:5: (lv_type_1_1= 'null' | lv_type_1_2= 'boolean' | lv_type_1_3= 'int' | lv_type_1_4= 'long' | lv_type_1_5= 'float' | lv_type_1_6= 'double' | lv_type_1_7= 'bytes' | lv_type_1_8= 'string' )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            case 34:
                {
                alt11=6;
                }
                break;
            case 35:
                {
                alt11=7;
                }
                break;
            case 36:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAvroSchema.g:1572:6: lv_type_1_1= 'null'
                    {
                    lv_type_1_1=(Token)match(input,29,FOLLOW_6); 

                    						newLeafNode(lv_type_1_1, grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:1583:6: lv_type_1_2= 'boolean'
                    {
                    lv_type_1_2=(Token)match(input,30,FOLLOW_6); 

                    						newLeafNode(lv_type_1_2, grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:1594:6: lv_type_1_3= 'int'
                    {
                    lv_type_1_3=(Token)match(input,31,FOLLOW_6); 

                    						newLeafNode(lv_type_1_3, grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:1605:6: lv_type_1_4= 'long'
                    {
                    lv_type_1_4=(Token)match(input,32,FOLLOW_6); 

                    						newLeafNode(lv_type_1_4, grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:1616:6: lv_type_1_5= 'float'
                    {
                    lv_type_1_5=(Token)match(input,33,FOLLOW_6); 

                    						newLeafNode(lv_type_1_5, grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalAvroSchema.g:1627:6: lv_type_1_6= 'double'
                    {
                    lv_type_1_6=(Token)match(input,34,FOLLOW_6); 

                    						newLeafNode(lv_type_1_6, grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalAvroSchema.g:1638:6: lv_type_1_7= 'bytes'
                    {
                    lv_type_1_7=(Token)match(input,35,FOLLOW_6); 

                    						newLeafNode(lv_type_1_7, grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalAvroSchema.g:1649:6: lv_type_1_8= 'string'
                    {
                    lv_type_1_8=(Token)match(input,36,FOLLOW_6); 

                    						newLeafNode(lv_type_1_8, grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_8, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2());
            		

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNamespace"
    // InternalAvroSchema.g:1670:1: entryRuleNamespace returns [String current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final String entryRuleNamespace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespace = null;


        try {
            // InternalAvroSchema.g:1670:49: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalAvroSchema.g:1671:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace.getText(); 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalAvroSchema.g:1677:1: ruleNamespace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNamespace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAvroSchema.g:1683:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAvroSchema.g:1684:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAvroSchema.g:1684:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAvroSchema.g:1685:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0());
            		
            // InternalAvroSchema.g:1692:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAvroSchema.g:1693:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleNamespace"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\12\1\15\1\uffff\1\17\1\15\1\20\2\15\2\uffff";
    static final String dfa_3s = "\1\16\1\15\1\uffff\1\17\1\15\1\20\1\15\1\22\2\uffff";
    static final String dfa_4s = "\2\uffff\1\3\5\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\3\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\4\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "80:4: (lv_types_0_1= ruleJsonType | lv_types_0_2= ruleRecordType | lv_types_0_3= ruleUnionType )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\2\15\1\4\1\17\3\uffff\1\15\1\20\1\15\1\22\4\uffff";
    static final String dfa_9s = "\1\16\1\15\1\44\1\17\3\uffff\1\15\1\20\1\15\1\32\4\uffff";
    static final String dfa_10s = "\4\uffff\1\3\1\6\1\7\4\uffff\1\4\1\5\1\2\1\1";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1",
            "\1\3",
            "\1\6\26\uffff\1\5\1\uffff\10\4",
            "\1\7",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\16\3\uffff\1\14\1\uffff\1\15\1\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "219:2: (this_RecordType_0= ruleRecordType | this_ArrayType_1= ruleArrayType | this_Primitive_2= rulePrimitive | this_MapType_3= ruleMapType | this_EnumType_4= ruleEnumType | this_FixedType_5= ruleFixedType | (otherlv_6= '\"' ( (otherlv_7= RULE_ID ) ) otherlv_8= '\"' ) )";
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\1\12\1\4\1\15\4\uffff\1\17\1\15\1\20\1\15\1\22\4\uffff";
    static final String dfa_15s = "\1\16\1\44\1\15\4\uffff\1\17\1\15\1\20\1\15\1\32\4\uffff";
    static final String dfa_16s = "\3\uffff\1\10\1\3\1\1\1\7\5\uffff\1\4\1\6\1\5\1\2";
    static final String dfa_17s = "\20\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\2\uffff\1\1\1\2",
            "\1\4\26\uffff\1\6\1\uffff\10\5",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\17\3\uffff\1\14\1\uffff\1\16\1\uffff\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "725:3: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_array_19_0= ruleArrayType ) ) | ( (lv_map_20_0= ruleMapType ) ) | ( (lv_fixed_21_0= ruleFixedType ) ) | ( (lv_union_22_0= ruleUnionType ) ) )";
        }
    }
    static final String dfa_19s = "\14\uffff";
    static final String dfa_20s = "\1\15\1\4\1\15\2\uffff\1\17\1\15\1\20\1\15\1\22\2\uffff";
    static final String dfa_21s = "\1\16\1\44\1\15\2\uffff\1\17\1\15\1\20\1\15\1\26\2\uffff";
    static final String dfa_22s = "\3\uffff\1\3\1\1\5\uffff\1\2\1\4";
    static final String dfa_23s = "\14\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\1\2",
            "\1\3\30\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\3\uffff\1\13",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1154:3: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) )";
        }
    }
    static final String dfa_25s = "\15\uffff";
    static final String dfa_26s = "\1\15\1\4\1\15\2\uffff\1\17\1\15\1\20\1\15\1\22\3\uffff";
    static final String dfa_27s = "\1\16\1\44\1\15\2\uffff\1\17\1\15\1\20\1\15\1\30\3\uffff";
    static final String dfa_28s = "\3\uffff\1\3\1\1\5\uffff\1\4\1\5\1\2";
    static final String dfa_29s = "\15\uffff}>";
    static final String[] dfa_30s = {
            "\1\1\1\2",
            "\1\3\30\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\14\3\uffff\1\12\1\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1314:3: ( ( (lv_primitive_13_0= rulePrimitive ) ) | ( (lv_record_14_0= ruleRecordType ) ) | (otherlv_15= '\"' ( (otherlv_16= RULE_ID ) ) otherlv_17= '\"' ) | ( (lv_etype_18_0= ruleEnumType ) ) | ( (lv_atype_19_0= ruleArrayType ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001FE0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000002L});

}