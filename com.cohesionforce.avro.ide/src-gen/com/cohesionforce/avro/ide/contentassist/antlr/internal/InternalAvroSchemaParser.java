package com.cohesionforce.avro.ide.contentassist.antlr.internal;

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
import com.cohesionforce.avro.services.AvroSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAvroSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "'null'", "'boolean'", "'int'", "'long'", "'float'", "'double'", "'bytes'", "'string'", "'['", "']'", "','", "'\"'", "'{'", "'type'", "':'", "'}'", "'record'", "'fields'", "'namespace'", "'enum'", "'symbols'", "'array'", "'items'", "'map'", "'fixed'", "'size'", "'.'"
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

    	public void setGrammarAccess(AvroSchemaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAvroSchema"
    // InternalAvroSchema.g:53:1: entryRuleAvroSchema : ruleAvroSchema EOF ;
    public final void entryRuleAvroSchema() throws RecognitionException {
        try {
            // InternalAvroSchema.g:54:1: ( ruleAvroSchema EOF )
            // InternalAvroSchema.g:55:1: ruleAvroSchema EOF
            {
             before(grammarAccess.getAvroSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleAvroSchema();

            state._fsp--;

             after(grammarAccess.getAvroSchemaRule()); 
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
    // $ANTLR end "entryRuleAvroSchema"


    // $ANTLR start "ruleAvroSchema"
    // InternalAvroSchema.g:62:1: ruleAvroSchema : ( ( rule__AvroSchema__TypesAssignment ) ) ;
    public final void ruleAvroSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:66:2: ( ( ( rule__AvroSchema__TypesAssignment ) ) )
            // InternalAvroSchema.g:67:2: ( ( rule__AvroSchema__TypesAssignment ) )
            {
            // InternalAvroSchema.g:67:2: ( ( rule__AvroSchema__TypesAssignment ) )
            // InternalAvroSchema.g:68:3: ( rule__AvroSchema__TypesAssignment )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAssignment()); 
            // InternalAvroSchema.g:69:3: ( rule__AvroSchema__TypesAssignment )
            // InternalAvroSchema.g:69:4: rule__AvroSchema__TypesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AvroSchema__TypesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAvroSchemaAccess().getTypesAssignment()); 

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
    // $ANTLR end "ruleAvroSchema"


    // $ANTLR start "entryRuleUnionType"
    // InternalAvroSchema.g:78:1: entryRuleUnionType : ruleUnionType EOF ;
    public final void entryRuleUnionType() throws RecognitionException {
        try {
            // InternalAvroSchema.g:79:1: ( ruleUnionType EOF )
            // InternalAvroSchema.g:80:1: ruleUnionType EOF
            {
             before(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getUnionTypeRule()); 
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
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // InternalAvroSchema.g:87:1: ruleUnionType : ( ( rule__UnionType__Group__0 ) ) ;
    public final void ruleUnionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:91:2: ( ( ( rule__UnionType__Group__0 ) ) )
            // InternalAvroSchema.g:92:2: ( ( rule__UnionType__Group__0 ) )
            {
            // InternalAvroSchema.g:92:2: ( ( rule__UnionType__Group__0 ) )
            // InternalAvroSchema.g:93:3: ( rule__UnionType__Group__0 )
            {
             before(grammarAccess.getUnionTypeAccess().getGroup()); 
            // InternalAvroSchema.g:94:3: ( rule__UnionType__Group__0 )
            // InternalAvroSchema.g:94:4: rule__UnionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleUnionMember"
    // InternalAvroSchema.g:103:1: entryRuleUnionMember : ruleUnionMember EOF ;
    public final void entryRuleUnionMember() throws RecognitionException {
        try {
            // InternalAvroSchema.g:104:1: ( ruleUnionMember EOF )
            // InternalAvroSchema.g:105:1: ruleUnionMember EOF
            {
             before(grammarAccess.getUnionMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionMemberRule()); 
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
    // $ANTLR end "entryRuleUnionMember"


    // $ANTLR start "ruleUnionMember"
    // InternalAvroSchema.g:112:1: ruleUnionMember : ( ( rule__UnionMember__Alternatives ) ) ;
    public final void ruleUnionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:116:2: ( ( ( rule__UnionMember__Alternatives ) ) )
            // InternalAvroSchema.g:117:2: ( ( rule__UnionMember__Alternatives ) )
            {
            // InternalAvroSchema.g:117:2: ( ( rule__UnionMember__Alternatives ) )
            // InternalAvroSchema.g:118:3: ( rule__UnionMember__Alternatives )
            {
             before(grammarAccess.getUnionMemberAccess().getAlternatives()); 
            // InternalAvroSchema.g:119:3: ( rule__UnionMember__Alternatives )
            // InternalAvroSchema.g:119:4: rule__UnionMember__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnionMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnionMemberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnionMember"


    // $ANTLR start "entryRuleJsonType"
    // InternalAvroSchema.g:128:1: entryRuleJsonType : ruleJsonType EOF ;
    public final void entryRuleJsonType() throws RecognitionException {
        try {
            // InternalAvroSchema.g:129:1: ( ruleJsonType EOF )
            // InternalAvroSchema.g:130:1: ruleJsonType EOF
            {
             before(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonType();

            state._fsp--;

             after(grammarAccess.getJsonTypeRule()); 
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
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // InternalAvroSchema.g:137:1: ruleJsonType : ( ( rule__JsonType__Group__0 ) ) ;
    public final void ruleJsonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:141:2: ( ( ( rule__JsonType__Group__0 ) ) )
            // InternalAvroSchema.g:142:2: ( ( rule__JsonType__Group__0 ) )
            {
            // InternalAvroSchema.g:142:2: ( ( rule__JsonType__Group__0 ) )
            // InternalAvroSchema.g:143:3: ( rule__JsonType__Group__0 )
            {
             before(grammarAccess.getJsonTypeAccess().getGroup()); 
            // InternalAvroSchema.g:144:3: ( rule__JsonType__Group__0 )
            // InternalAvroSchema.g:144:4: rule__JsonType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleRecordType"
    // InternalAvroSchema.g:153:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // InternalAvroSchema.g:154:1: ( ruleRecordType EOF )
            // InternalAvroSchema.g:155:1: ruleRecordType EOF
            {
             before(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getRecordTypeRule()); 
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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalAvroSchema.g:162:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:166:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // InternalAvroSchema.g:167:2: ( ( rule__RecordType__Group__0 ) )
            {
            // InternalAvroSchema.g:167:2: ( ( rule__RecordType__Group__0 ) )
            // InternalAvroSchema.g:168:3: ( rule__RecordType__Group__0 )
            {
             before(grammarAccess.getRecordTypeAccess().getGroup()); 
            // InternalAvroSchema.g:169:3: ( rule__RecordType__Group__0 )
            // InternalAvroSchema.g:169:4: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleFieldList"
    // InternalAvroSchema.g:178:1: entryRuleFieldList : ruleFieldList EOF ;
    public final void entryRuleFieldList() throws RecognitionException {
        try {
            // InternalAvroSchema.g:179:1: ( ruleFieldList EOF )
            // InternalAvroSchema.g:180:1: ruleFieldList EOF
            {
             before(grammarAccess.getFieldListRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldList();

            state._fsp--;

             after(grammarAccess.getFieldListRule()); 
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
    // $ANTLR end "entryRuleFieldList"


    // $ANTLR start "ruleFieldList"
    // InternalAvroSchema.g:187:1: ruleFieldList : ( ( rule__FieldList__Group__0 ) ) ;
    public final void ruleFieldList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:191:2: ( ( ( rule__FieldList__Group__0 ) ) )
            // InternalAvroSchema.g:192:2: ( ( rule__FieldList__Group__0 ) )
            {
            // InternalAvroSchema.g:192:2: ( ( rule__FieldList__Group__0 ) )
            // InternalAvroSchema.g:193:3: ( rule__FieldList__Group__0 )
            {
             before(grammarAccess.getFieldListAccess().getGroup()); 
            // InternalAvroSchema.g:194:3: ( rule__FieldList__Group__0 )
            // InternalAvroSchema.g:194:4: rule__FieldList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldListAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldList"


    // $ANTLR start "entryRuleField"
    // InternalAvroSchema.g:203:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalAvroSchema.g:204:1: ( ruleField EOF )
            // InternalAvroSchema.g:205:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAvroSchema.g:212:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:216:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalAvroSchema.g:217:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalAvroSchema.g:217:2: ( ( rule__Field__Group__0 ) )
            // InternalAvroSchema.g:218:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalAvroSchema.g:219:3: ( rule__Field__Group__0 )
            // InternalAvroSchema.g:219:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnumType"
    // InternalAvroSchema.g:228:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // InternalAvroSchema.g:229:1: ( ruleEnumType EOF )
            // InternalAvroSchema.g:230:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // InternalAvroSchema.g:237:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:241:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // InternalAvroSchema.g:242:2: ( ( rule__EnumType__Group__0 ) )
            {
            // InternalAvroSchema.g:242:2: ( ( rule__EnumType__Group__0 ) )
            // InternalAvroSchema.g:243:3: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // InternalAvroSchema.g:244:3: ( rule__EnumType__Group__0 )
            // InternalAvroSchema.g:244:4: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleArrayType"
    // InternalAvroSchema.g:253:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalAvroSchema.g:254:1: ( ruleArrayType EOF )
            // InternalAvroSchema.g:255:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalAvroSchema.g:262:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:266:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalAvroSchema.g:267:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalAvroSchema.g:267:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalAvroSchema.g:268:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalAvroSchema.g:269:3: ( rule__ArrayType__Group__0 )
            // InternalAvroSchema.g:269:4: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleMapType"
    // InternalAvroSchema.g:278:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // InternalAvroSchema.g:279:1: ( ruleMapType EOF )
            // InternalAvroSchema.g:280:1: ruleMapType EOF
            {
             before(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getMapTypeRule()); 
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
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalAvroSchema.g:287:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:291:2: ( ( ( rule__MapType__Group__0 ) ) )
            // InternalAvroSchema.g:292:2: ( ( rule__MapType__Group__0 ) )
            {
            // InternalAvroSchema.g:292:2: ( ( rule__MapType__Group__0 ) )
            // InternalAvroSchema.g:293:3: ( rule__MapType__Group__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup()); 
            // InternalAvroSchema.g:294:3: ( rule__MapType__Group__0 )
            // InternalAvroSchema.g:294:4: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleFixedType"
    // InternalAvroSchema.g:303:1: entryRuleFixedType : ruleFixedType EOF ;
    public final void entryRuleFixedType() throws RecognitionException {
        try {
            // InternalAvroSchema.g:304:1: ( ruleFixedType EOF )
            // InternalAvroSchema.g:305:1: ruleFixedType EOF
            {
             before(grammarAccess.getFixedTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFixedType();

            state._fsp--;

             after(grammarAccess.getFixedTypeRule()); 
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
    // $ANTLR end "entryRuleFixedType"


    // $ANTLR start "ruleFixedType"
    // InternalAvroSchema.g:312:1: ruleFixedType : ( ( rule__FixedType__Group__0 ) ) ;
    public final void ruleFixedType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:316:2: ( ( ( rule__FixedType__Group__0 ) ) )
            // InternalAvroSchema.g:317:2: ( ( rule__FixedType__Group__0 ) )
            {
            // InternalAvroSchema.g:317:2: ( ( rule__FixedType__Group__0 ) )
            // InternalAvroSchema.g:318:3: ( rule__FixedType__Group__0 )
            {
             before(grammarAccess.getFixedTypeAccess().getGroup()); 
            // InternalAvroSchema.g:319:3: ( rule__FixedType__Group__0 )
            // InternalAvroSchema.g:319:4: rule__FixedType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FixedType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleFixedType"


    // $ANTLR start "entryRulePrimitive"
    // InternalAvroSchema.g:328:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalAvroSchema.g:329:1: ( rulePrimitive EOF )
            // InternalAvroSchema.g:330:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalAvroSchema.g:337:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:341:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // InternalAvroSchema.g:342:2: ( ( rule__Primitive__Group__0 ) )
            {
            // InternalAvroSchema.g:342:2: ( ( rule__Primitive__Group__0 ) )
            // InternalAvroSchema.g:343:3: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // InternalAvroSchema.g:344:3: ( rule__Primitive__Group__0 )
            // InternalAvroSchema.g:344:4: rule__Primitive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNamespace"
    // InternalAvroSchema.g:353:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalAvroSchema.g:354:1: ( ruleNamespace EOF )
            // InternalAvroSchema.g:355:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalAvroSchema.g:362:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:366:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalAvroSchema.g:367:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalAvroSchema.g:367:2: ( ( rule__Namespace__Group__0 ) )
            // InternalAvroSchema.g:368:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalAvroSchema.g:369:3: ( rule__Namespace__Group__0 )
            // InternalAvroSchema.g:369:4: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "rule__AvroSchema__TypesAlternatives_0"
    // InternalAvroSchema.g:377:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );
    public final void rule__AvroSchema__TypesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:381:1: ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAvroSchema.g:382:2: ( ruleJsonType )
                    {
                    // InternalAvroSchema.g:382:2: ( ruleJsonType )
                    // InternalAvroSchema.g:383:3: ruleJsonType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesJsonTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:388:2: ( ruleRecordType )
                    {
                    // InternalAvroSchema.g:388:2: ( ruleRecordType )
                    // InternalAvroSchema.g:389:3: ruleRecordType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesRecordTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:394:2: ( ruleUnionType )
                    {
                    // InternalAvroSchema.g:394:2: ( ruleUnionType )
                    // InternalAvroSchema.g:395:3: ruleUnionType
                    {
                     before(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUnionType();

                    state._fsp--;

                     after(grammarAccess.getAvroSchemaAccess().getTypesUnionTypeParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__AvroSchema__TypesAlternatives_0"


    // $ANTLR start "rule__UnionMember__Alternatives"
    // InternalAvroSchema.g:404:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) );
    public final void rule__UnionMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:408:1: ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAvroSchema.g:409:2: ( ruleRecordType )
                    {
                    // InternalAvroSchema.g:409:2: ( ruleRecordType )
                    // InternalAvroSchema.g:410:3: ruleRecordType
                    {
                     before(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getRecordTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:415:2: ( ruleArrayType )
                    {
                    // InternalAvroSchema.g:415:2: ( ruleArrayType )
                    // InternalAvroSchema.g:416:3: ruleArrayType
                    {
                     before(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:421:2: ( rulePrimitive )
                    {
                    // InternalAvroSchema.g:421:2: ( rulePrimitive )
                    // InternalAvroSchema.g:422:3: rulePrimitive
                    {
                     before(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitive();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getPrimitiveParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:427:2: ( ruleMapType )
                    {
                    // InternalAvroSchema.g:427:2: ( ruleMapType )
                    // InternalAvroSchema.g:428:3: ruleMapType
                    {
                     before(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMapType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getMapTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:433:2: ( ruleEnumType )
                    {
                    // InternalAvroSchema.g:433:2: ( ruleEnumType )
                    // InternalAvroSchema.g:434:3: ruleEnumType
                    {
                     before(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getEnumTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAvroSchema.g:439:2: ( ruleFixedType )
                    {
                    // InternalAvroSchema.g:439:2: ( ruleFixedType )
                    // InternalAvroSchema.g:440:3: ruleFixedType
                    {
                     before(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleFixedType();

                    state._fsp--;

                     after(grammarAccess.getUnionMemberAccess().getFixedTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAvroSchema.g:445:2: ( ( rule__UnionMember__Group_6__0 ) )
                    {
                    // InternalAvroSchema.g:445:2: ( ( rule__UnionMember__Group_6__0 ) )
                    // InternalAvroSchema.g:446:3: ( rule__UnionMember__Group_6__0 )
                    {
                     before(grammarAccess.getUnionMemberAccess().getGroup_6()); 
                    // InternalAvroSchema.g:447:3: ( rule__UnionMember__Group_6__0 )
                    // InternalAvroSchema.g:447:4: rule__UnionMember__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnionMember__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnionMemberAccess().getGroup_6()); 

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
    // $ANTLR end "rule__UnionMember__Alternatives"


    // $ANTLR start "rule__Field__NameAlternatives_6_0"
    // InternalAvroSchema.g:455:1: rule__Field__NameAlternatives_6_0 : ( ( 'name' ) | ( RULE_ID ) );
    public final void rule__Field__NameAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:459:1: ( ( 'name' ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAvroSchema.g:460:2: ( 'name' )
                    {
                    // InternalAvroSchema.g:460:2: ( 'name' )
                    // InternalAvroSchema.g:461:3: 'name'
                    {
                     before(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getFieldAccess().getNameNameKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:466:2: ( RULE_ID )
                    {
                    // InternalAvroSchema.g:466:2: ( RULE_ID )
                    // InternalAvroSchema.g:467:3: RULE_ID
                    {
                     before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_6_0_1()); 

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
    // $ANTLR end "rule__Field__NameAlternatives_6_0"


    // $ANTLR start "rule__Field__Alternatives_13"
    // InternalAvroSchema.g:476:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );
    public final void rule__Field__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:480:1: ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAvroSchema.g:481:2: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    {
                    // InternalAvroSchema.g:481:2: ( ( rule__Field__PrimitiveAssignment_13_0 ) )
                    // InternalAvroSchema.g:482:3: ( rule__Field__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 
                    // InternalAvroSchema.g:483:3: ( rule__Field__PrimitiveAssignment_13_0 )
                    // InternalAvroSchema.g:483:4: rule__Field__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:487:2: ( ( rule__Field__RecordAssignment_13_1 ) )
                    {
                    // InternalAvroSchema.g:487:2: ( ( rule__Field__RecordAssignment_13_1 ) )
                    // InternalAvroSchema.g:488:3: ( rule__Field__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 
                    // InternalAvroSchema.g:489:3: ( rule__Field__RecordAssignment_13_1 )
                    // InternalAvroSchema.g:489:4: rule__Field__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:493:2: ( ( rule__Field__Group_13_2__0 ) )
                    {
                    // InternalAvroSchema.g:493:2: ( ( rule__Field__Group_13_2__0 ) )
                    // InternalAvroSchema.g:494:3: ( rule__Field__Group_13_2__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_13_2()); 
                    // InternalAvroSchema.g:495:3: ( rule__Field__Group_13_2__0 )
                    // InternalAvroSchema.g:495:4: rule__Field__Group_13_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:499:2: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    {
                    // InternalAvroSchema.g:499:2: ( ( rule__Field__EtypeAssignment_13_3 ) )
                    // InternalAvroSchema.g:500:3: ( rule__Field__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 
                    // InternalAvroSchema.g:501:3: ( rule__Field__EtypeAssignment_13_3 )
                    // InternalAvroSchema.g:501:4: rule__Field__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:505:2: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    {
                    // InternalAvroSchema.g:505:2: ( ( rule__Field__ArrayAssignment_13_4 ) )
                    // InternalAvroSchema.g:506:3: ( rule__Field__ArrayAssignment_13_4 )
                    {
                     before(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 
                    // InternalAvroSchema.g:507:3: ( rule__Field__ArrayAssignment_13_4 )
                    // InternalAvroSchema.g:507:4: rule__Field__ArrayAssignment_13_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__ArrayAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getArrayAssignment_13_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAvroSchema.g:511:2: ( ( rule__Field__MapAssignment_13_5 ) )
                    {
                    // InternalAvroSchema.g:511:2: ( ( rule__Field__MapAssignment_13_5 ) )
                    // InternalAvroSchema.g:512:3: ( rule__Field__MapAssignment_13_5 )
                    {
                     before(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 
                    // InternalAvroSchema.g:513:3: ( rule__Field__MapAssignment_13_5 )
                    // InternalAvroSchema.g:513:4: rule__Field__MapAssignment_13_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__MapAssignment_13_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getMapAssignment_13_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAvroSchema.g:517:2: ( ( rule__Field__FixedAssignment_13_6 ) )
                    {
                    // InternalAvroSchema.g:517:2: ( ( rule__Field__FixedAssignment_13_6 ) )
                    // InternalAvroSchema.g:518:3: ( rule__Field__FixedAssignment_13_6 )
                    {
                     before(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 
                    // InternalAvroSchema.g:519:3: ( rule__Field__FixedAssignment_13_6 )
                    // InternalAvroSchema.g:519:4: rule__Field__FixedAssignment_13_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__FixedAssignment_13_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getFixedAssignment_13_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAvroSchema.g:523:2: ( ( rule__Field__UnionAssignment_13_7 ) )
                    {
                    // InternalAvroSchema.g:523:2: ( ( rule__Field__UnionAssignment_13_7 ) )
                    // InternalAvroSchema.g:524:3: ( rule__Field__UnionAssignment_13_7 )
                    {
                     before(grammarAccess.getFieldAccess().getUnionAssignment_13_7()); 
                    // InternalAvroSchema.g:525:3: ( rule__Field__UnionAssignment_13_7 )
                    // InternalAvroSchema.g:525:4: rule__Field__UnionAssignment_13_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__UnionAssignment_13_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getUnionAssignment_13_7()); 

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
    // $ANTLR end "rule__Field__Alternatives_13"


    // $ANTLR start "rule__ArrayType__Alternatives_13"
    // InternalAvroSchema.g:533:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );
    public final void rule__ArrayType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:537:1: ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalAvroSchema.g:538:2: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    {
                    // InternalAvroSchema.g:538:2: ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) )
                    // InternalAvroSchema.g:539:3: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 
                    // InternalAvroSchema.g:540:3: ( rule__ArrayType__PrimitiveAssignment_13_0 )
                    // InternalAvroSchema.g:540:4: rule__ArrayType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:544:2: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    {
                    // InternalAvroSchema.g:544:2: ( ( rule__ArrayType__RecordAssignment_13_1 ) )
                    // InternalAvroSchema.g:545:3: ( rule__ArrayType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 
                    // InternalAvroSchema.g:546:3: ( rule__ArrayType__RecordAssignment_13_1 )
                    // InternalAvroSchema.g:546:4: rule__ArrayType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:550:2: ( ( rule__ArrayType__Group_13_2__0 ) )
                    {
                    // InternalAvroSchema.g:550:2: ( ( rule__ArrayType__Group_13_2__0 ) )
                    // InternalAvroSchema.g:551:3: ( rule__ArrayType__Group_13_2__0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 
                    // InternalAvroSchema.g:552:3: ( rule__ArrayType__Group_13_2__0 )
                    // InternalAvroSchema.g:552:4: rule__ArrayType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:556:2: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    {
                    // InternalAvroSchema.g:556:2: ( ( rule__ArrayType__EtypeAssignment_13_3 ) )
                    // InternalAvroSchema.g:557:3: ( rule__ArrayType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 
                    // InternalAvroSchema.g:558:3: ( rule__ArrayType__EtypeAssignment_13_3 )
                    // InternalAvroSchema.g:558:4: rule__ArrayType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getEtypeAssignment_13_3()); 

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
    // $ANTLR end "rule__ArrayType__Alternatives_13"


    // $ANTLR start "rule__MapType__Alternatives_13"
    // InternalAvroSchema.g:566:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );
    public final void rule__MapType__Alternatives_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:570:1: ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalAvroSchema.g:571:2: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    {
                    // InternalAvroSchema.g:571:2: ( ( rule__MapType__PrimitiveAssignment_13_0 ) )
                    // InternalAvroSchema.g:572:3: ( rule__MapType__PrimitiveAssignment_13_0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 
                    // InternalAvroSchema.g:573:3: ( rule__MapType__PrimitiveAssignment_13_0 )
                    // InternalAvroSchema.g:573:4: rule__MapType__PrimitiveAssignment_13_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapType__PrimitiveAssignment_13_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getPrimitiveAssignment_13_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:577:2: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    {
                    // InternalAvroSchema.g:577:2: ( ( rule__MapType__RecordAssignment_13_1 ) )
                    // InternalAvroSchema.g:578:3: ( rule__MapType__RecordAssignment_13_1 )
                    {
                     before(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 
                    // InternalAvroSchema.g:579:3: ( rule__MapType__RecordAssignment_13_1 )
                    // InternalAvroSchema.g:579:4: rule__MapType__RecordAssignment_13_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapType__RecordAssignment_13_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getRecordAssignment_13_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:583:2: ( ( rule__MapType__Group_13_2__0 ) )
                    {
                    // InternalAvroSchema.g:583:2: ( ( rule__MapType__Group_13_2__0 ) )
                    // InternalAvroSchema.g:584:3: ( rule__MapType__Group_13_2__0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getGroup_13_2()); 
                    // InternalAvroSchema.g:585:3: ( rule__MapType__Group_13_2__0 )
                    // InternalAvroSchema.g:585:4: rule__MapType__Group_13_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapType__Group_13_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getGroup_13_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:589:2: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    {
                    // InternalAvroSchema.g:589:2: ( ( rule__MapType__EtypeAssignment_13_3 ) )
                    // InternalAvroSchema.g:590:3: ( rule__MapType__EtypeAssignment_13_3 )
                    {
                     before(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 
                    // InternalAvroSchema.g:591:3: ( rule__MapType__EtypeAssignment_13_3 )
                    // InternalAvroSchema.g:591:4: rule__MapType__EtypeAssignment_13_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapType__EtypeAssignment_13_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getEtypeAssignment_13_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:595:2: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    {
                    // InternalAvroSchema.g:595:2: ( ( rule__MapType__AtypeAssignment_13_4 ) )
                    // InternalAvroSchema.g:596:3: ( rule__MapType__AtypeAssignment_13_4 )
                    {
                     before(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 
                    // InternalAvroSchema.g:597:3: ( rule__MapType__AtypeAssignment_13_4 )
                    // InternalAvroSchema.g:597:4: rule__MapType__AtypeAssignment_13_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MapType__AtypeAssignment_13_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getAtypeAssignment_13_4()); 

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
    // $ANTLR end "rule__MapType__Alternatives_13"


    // $ANTLR start "rule__Primitive__TypeAlternatives_1_0"
    // InternalAvroSchema.g:605:1: rule__Primitive__TypeAlternatives_1_0 : ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) );
    public final void rule__Primitive__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:609:1: ( ( 'null' ) | ( 'boolean' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) | ( 'bytes' ) | ( 'string' ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAvroSchema.g:610:2: ( 'null' )
                    {
                    // InternalAvroSchema.g:610:2: ( 'null' )
                    // InternalAvroSchema.g:611:3: 'null'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeNullKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAvroSchema.g:616:2: ( 'boolean' )
                    {
                    // InternalAvroSchema.g:616:2: ( 'boolean' )
                    // InternalAvroSchema.g:617:3: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBooleanKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAvroSchema.g:622:2: ( 'int' )
                    {
                    // InternalAvroSchema.g:622:2: ( 'int' )
                    // InternalAvroSchema.g:623:3: 'int'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeIntKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAvroSchema.g:628:2: ( 'long' )
                    {
                    // InternalAvroSchema.g:628:2: ( 'long' )
                    // InternalAvroSchema.g:629:3: 'long'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeLongKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAvroSchema.g:634:2: ( 'float' )
                    {
                    // InternalAvroSchema.g:634:2: ( 'float' )
                    // InternalAvroSchema.g:635:3: 'float'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeFloatKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAvroSchema.g:640:2: ( 'double' )
                    {
                    // InternalAvroSchema.g:640:2: ( 'double' )
                    // InternalAvroSchema.g:641:3: 'double'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeDoubleKeyword_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAvroSchema.g:646:2: ( 'bytes' )
                    {
                    // InternalAvroSchema.g:646:2: ( 'bytes' )
                    // InternalAvroSchema.g:647:3: 'bytes'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeBytesKeyword_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAvroSchema.g:652:2: ( 'string' )
                    {
                    // InternalAvroSchema.g:652:2: ( 'string' )
                    // InternalAvroSchema.g:653:3: 'string'
                    {
                     before(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveAccess().getTypeStringKeyword_1_0_7()); 

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
    // $ANTLR end "rule__Primitive__TypeAlternatives_1_0"


    // $ANTLR start "rule__UnionType__Group__0"
    // InternalAvroSchema.g:662:1: rule__UnionType__Group__0 : rule__UnionType__Group__0__Impl rule__UnionType__Group__1 ;
    public final void rule__UnionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:666:1: ( rule__UnionType__Group__0__Impl rule__UnionType__Group__1 )
            // InternalAvroSchema.g:667:2: rule__UnionType__Group__0__Impl rule__UnionType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UnionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionType__Group__1();

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
    // $ANTLR end "rule__UnionType__Group__0"


    // $ANTLR start "rule__UnionType__Group__0__Impl"
    // InternalAvroSchema.g:674:1: rule__UnionType__Group__0__Impl : ( '[' ) ;
    public final void rule__UnionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:678:1: ( ( '[' ) )
            // InternalAvroSchema.g:679:1: ( '[' )
            {
            // InternalAvroSchema.g:679:1: ( '[' )
            // InternalAvroSchema.g:680:2: '['
            {
             before(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnionTypeAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__UnionType__Group__0__Impl"


    // $ANTLR start "rule__UnionType__Group__1"
    // InternalAvroSchema.g:689:1: rule__UnionType__Group__1 : rule__UnionType__Group__1__Impl rule__UnionType__Group__2 ;
    public final void rule__UnionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:693:1: ( rule__UnionType__Group__1__Impl rule__UnionType__Group__2 )
            // InternalAvroSchema.g:694:2: rule__UnionType__Group__1__Impl rule__UnionType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UnionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionType__Group__2();

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
    // $ANTLR end "rule__UnionType__Group__1"


    // $ANTLR start "rule__UnionType__Group__1__Impl"
    // InternalAvroSchema.g:701:1: rule__UnionType__Group__1__Impl : ( ( rule__UnionType__TypesAssignment_1 ) ) ;
    public final void rule__UnionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:705:1: ( ( ( rule__UnionType__TypesAssignment_1 ) ) )
            // InternalAvroSchema.g:706:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            {
            // InternalAvroSchema.g:706:1: ( ( rule__UnionType__TypesAssignment_1 ) )
            // InternalAvroSchema.g:707:2: ( rule__UnionType__TypesAssignment_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 
            // InternalAvroSchema.g:708:2: ( rule__UnionType__TypesAssignment_1 )
            // InternalAvroSchema.g:708:3: rule__UnionType__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_1()); 

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
    // $ANTLR end "rule__UnionType__Group__1__Impl"


    // $ANTLR start "rule__UnionType__Group__2"
    // InternalAvroSchema.g:716:1: rule__UnionType__Group__2 : rule__UnionType__Group__2__Impl rule__UnionType__Group__3 ;
    public final void rule__UnionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:720:1: ( rule__UnionType__Group__2__Impl rule__UnionType__Group__3 )
            // InternalAvroSchema.g:721:2: rule__UnionType__Group__2__Impl rule__UnionType__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UnionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionType__Group__3();

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
    // $ANTLR end "rule__UnionType__Group__2"


    // $ANTLR start "rule__UnionType__Group__2__Impl"
    // InternalAvroSchema.g:728:1: rule__UnionType__Group__2__Impl : ( ( rule__UnionType__Group_2__0 )* ) ;
    public final void rule__UnionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:732:1: ( ( ( rule__UnionType__Group_2__0 )* ) )
            // InternalAvroSchema.g:733:1: ( ( rule__UnionType__Group_2__0 )* )
            {
            // InternalAvroSchema.g:733:1: ( ( rule__UnionType__Group_2__0 )* )
            // InternalAvroSchema.g:734:2: ( rule__UnionType__Group_2__0 )*
            {
             before(grammarAccess.getUnionTypeAccess().getGroup_2()); 
            // InternalAvroSchema.g:735:2: ( rule__UnionType__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAvroSchema.g:735:3: rule__UnionType__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__UnionType__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUnionTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__UnionType__Group__2__Impl"


    // $ANTLR start "rule__UnionType__Group__3"
    // InternalAvroSchema.g:743:1: rule__UnionType__Group__3 : rule__UnionType__Group__3__Impl ;
    public final void rule__UnionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:747:1: ( rule__UnionType__Group__3__Impl )
            // InternalAvroSchema.g:748:2: rule__UnionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__Group__3__Impl();

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
    // $ANTLR end "rule__UnionType__Group__3"


    // $ANTLR start "rule__UnionType__Group__3__Impl"
    // InternalAvroSchema.g:754:1: rule__UnionType__Group__3__Impl : ( ']' ) ;
    public final void rule__UnionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:758:1: ( ( ']' ) )
            // InternalAvroSchema.g:759:1: ( ']' )
            {
            // InternalAvroSchema.g:759:1: ( ']' )
            // InternalAvroSchema.g:760:2: ']'
            {
             before(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUnionTypeAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__UnionType__Group__3__Impl"


    // $ANTLR start "rule__UnionType__Group_2__0"
    // InternalAvroSchema.g:770:1: rule__UnionType__Group_2__0 : rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 ;
    public final void rule__UnionType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:774:1: ( rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1 )
            // InternalAvroSchema.g:775:2: rule__UnionType__Group_2__0__Impl rule__UnionType__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__UnionType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionType__Group_2__1();

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
    // $ANTLR end "rule__UnionType__Group_2__0"


    // $ANTLR start "rule__UnionType__Group_2__0__Impl"
    // InternalAvroSchema.g:782:1: rule__UnionType__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UnionType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:786:1: ( ( ',' ) )
            // InternalAvroSchema.g:787:1: ( ',' )
            {
            // InternalAvroSchema.g:787:1: ( ',' )
            // InternalAvroSchema.g:788:2: ','
            {
             before(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUnionTypeAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__UnionType__Group_2__0__Impl"


    // $ANTLR start "rule__UnionType__Group_2__1"
    // InternalAvroSchema.g:797:1: rule__UnionType__Group_2__1 : rule__UnionType__Group_2__1__Impl ;
    public final void rule__UnionType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:801:1: ( rule__UnionType__Group_2__1__Impl )
            // InternalAvroSchema.g:802:2: rule__UnionType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__Group_2__1__Impl();

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
    // $ANTLR end "rule__UnionType__Group_2__1"


    // $ANTLR start "rule__UnionType__Group_2__1__Impl"
    // InternalAvroSchema.g:808:1: rule__UnionType__Group_2__1__Impl : ( ( rule__UnionType__TypesAssignment_2_1 ) ) ;
    public final void rule__UnionType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:812:1: ( ( ( rule__UnionType__TypesAssignment_2_1 ) ) )
            // InternalAvroSchema.g:813:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            {
            // InternalAvroSchema.g:813:1: ( ( rule__UnionType__TypesAssignment_2_1 ) )
            // InternalAvroSchema.g:814:2: ( rule__UnionType__TypesAssignment_2_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 
            // InternalAvroSchema.g:815:2: ( rule__UnionType__TypesAssignment_2_1 )
            // InternalAvroSchema.g:815:3: rule__UnionType__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_2_1()); 

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
    // $ANTLR end "rule__UnionType__Group_2__1__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__0"
    // InternalAvroSchema.g:824:1: rule__UnionMember__Group_6__0 : rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1 ;
    public final void rule__UnionMember__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:828:1: ( rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1 )
            // InternalAvroSchema.g:829:2: rule__UnionMember__Group_6__0__Impl rule__UnionMember__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__UnionMember__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionMember__Group_6__1();

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
    // $ANTLR end "rule__UnionMember__Group_6__0"


    // $ANTLR start "rule__UnionMember__Group_6__0__Impl"
    // InternalAvroSchema.g:836:1: rule__UnionMember__Group_6__0__Impl : ( '\"' ) ;
    public final void rule__UnionMember__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:840:1: ( ( '\"' ) )
            // InternalAvroSchema.g:841:1: ( '\"' )
            {
            // InternalAvroSchema.g:841:1: ( '\"' )
            // InternalAvroSchema.g:842:2: '\"'
            {
             before(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_0()); 

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
    // $ANTLR end "rule__UnionMember__Group_6__0__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__1"
    // InternalAvroSchema.g:851:1: rule__UnionMember__Group_6__1 : rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2 ;
    public final void rule__UnionMember__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:855:1: ( rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2 )
            // InternalAvroSchema.g:856:2: rule__UnionMember__Group_6__1__Impl rule__UnionMember__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__UnionMember__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionMember__Group_6__2();

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
    // $ANTLR end "rule__UnionMember__Group_6__1"


    // $ANTLR start "rule__UnionMember__Group_6__1__Impl"
    // InternalAvroSchema.g:863:1: rule__UnionMember__Group_6__1__Impl : ( ( rule__UnionMember__RecordRefAssignment_6_1 ) ) ;
    public final void rule__UnionMember__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:867:1: ( ( ( rule__UnionMember__RecordRefAssignment_6_1 ) ) )
            // InternalAvroSchema.g:868:1: ( ( rule__UnionMember__RecordRefAssignment_6_1 ) )
            {
            // InternalAvroSchema.g:868:1: ( ( rule__UnionMember__RecordRefAssignment_6_1 ) )
            // InternalAvroSchema.g:869:2: ( rule__UnionMember__RecordRefAssignment_6_1 )
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefAssignment_6_1()); 
            // InternalAvroSchema.g:870:2: ( rule__UnionMember__RecordRefAssignment_6_1 )
            // InternalAvroSchema.g:870:3: rule__UnionMember__RecordRefAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionMember__RecordRefAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionMemberAccess().getRecordRefAssignment_6_1()); 

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
    // $ANTLR end "rule__UnionMember__Group_6__1__Impl"


    // $ANTLR start "rule__UnionMember__Group_6__2"
    // InternalAvroSchema.g:878:1: rule__UnionMember__Group_6__2 : rule__UnionMember__Group_6__2__Impl ;
    public final void rule__UnionMember__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:882:1: ( rule__UnionMember__Group_6__2__Impl )
            // InternalAvroSchema.g:883:2: rule__UnionMember__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionMember__Group_6__2__Impl();

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
    // $ANTLR end "rule__UnionMember__Group_6__2"


    // $ANTLR start "rule__UnionMember__Group_6__2__Impl"
    // InternalAvroSchema.g:889:1: rule__UnionMember__Group_6__2__Impl : ( '\"' ) ;
    public final void rule__UnionMember__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:893:1: ( ( '\"' ) )
            // InternalAvroSchema.g:894:1: ( '\"' )
            {
            // InternalAvroSchema.g:894:1: ( '\"' )
            // InternalAvroSchema.g:895:2: '\"'
            {
             before(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUnionMemberAccess().getQuotationMarkKeyword_6_2()); 

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
    // $ANTLR end "rule__UnionMember__Group_6__2__Impl"


    // $ANTLR start "rule__JsonType__Group__0"
    // InternalAvroSchema.g:905:1: rule__JsonType__Group__0 : rule__JsonType__Group__0__Impl rule__JsonType__Group__1 ;
    public final void rule__JsonType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:909:1: ( rule__JsonType__Group__0__Impl rule__JsonType__Group__1 )
            // InternalAvroSchema.g:910:2: rule__JsonType__Group__0__Impl rule__JsonType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__JsonType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__1();

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
    // $ANTLR end "rule__JsonType__Group__0"


    // $ANTLR start "rule__JsonType__Group__0__Impl"
    // InternalAvroSchema.g:917:1: rule__JsonType__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:921:1: ( ( '{' ) )
            // InternalAvroSchema.g:922:1: ( '{' )
            {
            // InternalAvroSchema.g:922:1: ( '{' )
            // InternalAvroSchema.g:923:2: '{'
            {
             before(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__JsonType__Group__0__Impl"


    // $ANTLR start "rule__JsonType__Group__1"
    // InternalAvroSchema.g:932:1: rule__JsonType__Group__1 : rule__JsonType__Group__1__Impl rule__JsonType__Group__2 ;
    public final void rule__JsonType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:936:1: ( rule__JsonType__Group__1__Impl rule__JsonType__Group__2 )
            // InternalAvroSchema.g:937:2: rule__JsonType__Group__1__Impl rule__JsonType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__JsonType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__2();

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
    // $ANTLR end "rule__JsonType__Group__1"


    // $ANTLR start "rule__JsonType__Group__1__Impl"
    // InternalAvroSchema.g:944:1: rule__JsonType__Group__1__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:948:1: ( ( '\"' ) )
            // InternalAvroSchema.g:949:1: ( '\"' )
            {
            // InternalAvroSchema.g:949:1: ( '\"' )
            // InternalAvroSchema.g:950:2: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__JsonType__Group__1__Impl"


    // $ANTLR start "rule__JsonType__Group__2"
    // InternalAvroSchema.g:959:1: rule__JsonType__Group__2 : rule__JsonType__Group__2__Impl rule__JsonType__Group__3 ;
    public final void rule__JsonType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:963:1: ( rule__JsonType__Group__2__Impl rule__JsonType__Group__3 )
            // InternalAvroSchema.g:964:2: rule__JsonType__Group__2__Impl rule__JsonType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__JsonType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__3();

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
    // $ANTLR end "rule__JsonType__Group__2"


    // $ANTLR start "rule__JsonType__Group__2__Impl"
    // InternalAvroSchema.g:971:1: rule__JsonType__Group__2__Impl : ( 'type' ) ;
    public final void rule__JsonType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:975:1: ( ( 'type' ) )
            // InternalAvroSchema.g:976:1: ( 'type' )
            {
            // InternalAvroSchema.g:976:1: ( 'type' )
            // InternalAvroSchema.g:977:2: 'type'
            {
             before(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__JsonType__Group__2__Impl"


    // $ANTLR start "rule__JsonType__Group__3"
    // InternalAvroSchema.g:986:1: rule__JsonType__Group__3 : rule__JsonType__Group__3__Impl rule__JsonType__Group__4 ;
    public final void rule__JsonType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:990:1: ( rule__JsonType__Group__3__Impl rule__JsonType__Group__4 )
            // InternalAvroSchema.g:991:2: rule__JsonType__Group__3__Impl rule__JsonType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__JsonType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__4();

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
    // $ANTLR end "rule__JsonType__Group__3"


    // $ANTLR start "rule__JsonType__Group__3__Impl"
    // InternalAvroSchema.g:998:1: rule__JsonType__Group__3__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1002:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1003:1: ( '\"' )
            {
            // InternalAvroSchema.g:1003:1: ( '\"' )
            // InternalAvroSchema.g:1004:2: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_3()); 

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
    // $ANTLR end "rule__JsonType__Group__3__Impl"


    // $ANTLR start "rule__JsonType__Group__4"
    // InternalAvroSchema.g:1013:1: rule__JsonType__Group__4 : rule__JsonType__Group__4__Impl rule__JsonType__Group__5 ;
    public final void rule__JsonType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1017:1: ( rule__JsonType__Group__4__Impl rule__JsonType__Group__5 )
            // InternalAvroSchema.g:1018:2: rule__JsonType__Group__4__Impl rule__JsonType__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__JsonType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__5();

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
    // $ANTLR end "rule__JsonType__Group__4"


    // $ANTLR start "rule__JsonType__Group__4__Impl"
    // InternalAvroSchema.g:1025:1: rule__JsonType__Group__4__Impl : ( ':' ) ;
    public final void rule__JsonType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1029:1: ( ( ':' ) )
            // InternalAvroSchema.g:1030:1: ( ':' )
            {
            // InternalAvroSchema.g:1030:1: ( ':' )
            // InternalAvroSchema.g:1031:2: ':'
            {
             before(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__JsonType__Group__4__Impl"


    // $ANTLR start "rule__JsonType__Group__5"
    // InternalAvroSchema.g:1040:1: rule__JsonType__Group__5 : rule__JsonType__Group__5__Impl rule__JsonType__Group__6 ;
    public final void rule__JsonType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1044:1: ( rule__JsonType__Group__5__Impl rule__JsonType__Group__6 )
            // InternalAvroSchema.g:1045:2: rule__JsonType__Group__5__Impl rule__JsonType__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__JsonType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__6();

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
    // $ANTLR end "rule__JsonType__Group__5"


    // $ANTLR start "rule__JsonType__Group__5__Impl"
    // InternalAvroSchema.g:1052:1: rule__JsonType__Group__5__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1056:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1057:1: ( '\"' )
            {
            // InternalAvroSchema.g:1057:1: ( '\"' )
            // InternalAvroSchema.g:1058:2: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_5()); 

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
    // $ANTLR end "rule__JsonType__Group__5__Impl"


    // $ANTLR start "rule__JsonType__Group__6"
    // InternalAvroSchema.g:1067:1: rule__JsonType__Group__6 : rule__JsonType__Group__6__Impl rule__JsonType__Group__7 ;
    public final void rule__JsonType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1071:1: ( rule__JsonType__Group__6__Impl rule__JsonType__Group__7 )
            // InternalAvroSchema.g:1072:2: rule__JsonType__Group__6__Impl rule__JsonType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__JsonType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__7();

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
    // $ANTLR end "rule__JsonType__Group__6"


    // $ANTLR start "rule__JsonType__Group__6__Impl"
    // InternalAvroSchema.g:1079:1: rule__JsonType__Group__6__Impl : ( ( rule__JsonType__TypeAssignment_6 ) ) ;
    public final void rule__JsonType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1083:1: ( ( ( rule__JsonType__TypeAssignment_6 ) ) )
            // InternalAvroSchema.g:1084:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            {
            // InternalAvroSchema.g:1084:1: ( ( rule__JsonType__TypeAssignment_6 ) )
            // InternalAvroSchema.g:1085:2: ( rule__JsonType__TypeAssignment_6 )
            {
             before(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 
            // InternalAvroSchema.g:1086:2: ( rule__JsonType__TypeAssignment_6 )
            // InternalAvroSchema.g:1086:3: rule__JsonType__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getJsonTypeAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__JsonType__Group__6__Impl"


    // $ANTLR start "rule__JsonType__Group__7"
    // InternalAvroSchema.g:1094:1: rule__JsonType__Group__7 : rule__JsonType__Group__7__Impl rule__JsonType__Group__8 ;
    public final void rule__JsonType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1098:1: ( rule__JsonType__Group__7__Impl rule__JsonType__Group__8 )
            // InternalAvroSchema.g:1099:2: rule__JsonType__Group__7__Impl rule__JsonType__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__JsonType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonType__Group__8();

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
    // $ANTLR end "rule__JsonType__Group__7"


    // $ANTLR start "rule__JsonType__Group__7__Impl"
    // InternalAvroSchema.g:1106:1: rule__JsonType__Group__7__Impl : ( '\"' ) ;
    public final void rule__JsonType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1110:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1111:1: ( '\"' )
            {
            // InternalAvroSchema.g:1111:1: ( '\"' )
            // InternalAvroSchema.g:1112:2: '\"'
            {
             before(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getQuotationMarkKeyword_7()); 

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
    // $ANTLR end "rule__JsonType__Group__7__Impl"


    // $ANTLR start "rule__JsonType__Group__8"
    // InternalAvroSchema.g:1121:1: rule__JsonType__Group__8 : rule__JsonType__Group__8__Impl ;
    public final void rule__JsonType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1125:1: ( rule__JsonType__Group__8__Impl )
            // InternalAvroSchema.g:1126:2: rule__JsonType__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonType__Group__8__Impl();

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
    // $ANTLR end "rule__JsonType__Group__8"


    // $ANTLR start "rule__JsonType__Group__8__Impl"
    // InternalAvroSchema.g:1132:1: rule__JsonType__Group__8__Impl : ( '}' ) ;
    public final void rule__JsonType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1136:1: ( ( '}' ) )
            // InternalAvroSchema.g:1137:1: ( '}' )
            {
            // InternalAvroSchema.g:1137:1: ( '}' )
            // InternalAvroSchema.g:1138:2: '}'
            {
             before(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getJsonTypeAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__JsonType__Group__8__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // InternalAvroSchema.g:1148:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1152:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalAvroSchema.g:1153:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__1();

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
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // InternalAvroSchema.g:1160:1: rule__RecordType__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1164:1: ( ( '{' ) )
            // InternalAvroSchema.g:1165:1: ( '{' )
            {
            // InternalAvroSchema.g:1165:1: ( '{' )
            // InternalAvroSchema.g:1166:2: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // InternalAvroSchema.g:1175:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1179:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalAvroSchema.g:1180:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__2();

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
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // InternalAvroSchema.g:1187:1: rule__RecordType__Group__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1191:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1192:1: ( '\"' )
            {
            // InternalAvroSchema.g:1192:1: ( '\"' )
            // InternalAvroSchema.g:1193:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // InternalAvroSchema.g:1202:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1206:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalAvroSchema.g:1207:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__3();

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
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // InternalAvroSchema.g:1214:1: rule__RecordType__Group__2__Impl : ( 'type' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1218:1: ( ( 'type' ) )
            // InternalAvroSchema.g:1219:1: ( 'type' )
            {
            // InternalAvroSchema.g:1219:1: ( 'type' )
            // InternalAvroSchema.g:1220:2: 'type'
            {
             before(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // InternalAvroSchema.g:1229:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1233:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalAvroSchema.g:1234:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__4();

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
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // InternalAvroSchema.g:1241:1: rule__RecordType__Group__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1245:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1246:1: ( '\"' )
            {
            // InternalAvroSchema.g:1246:1: ( '\"' )
            // InternalAvroSchema.g:1247:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_3()); 

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
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // InternalAvroSchema.g:1256:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1260:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // InternalAvroSchema.g:1261:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__5();

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
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // InternalAvroSchema.g:1268:1: rule__RecordType__Group__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1272:1: ( ( ':' ) )
            // InternalAvroSchema.g:1273:1: ( ':' )
            {
            // InternalAvroSchema.g:1273:1: ( ':' )
            // InternalAvroSchema.g:1274:2: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group__5"
    // InternalAvroSchema.g:1283:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1287:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // InternalAvroSchema.g:1288:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__RecordType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__6();

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
    // $ANTLR end "rule__RecordType__Group__5"


    // $ANTLR start "rule__RecordType__Group__5__Impl"
    // InternalAvroSchema.g:1295:1: rule__RecordType__Group__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1299:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1300:1: ( '\"' )
            {
            // InternalAvroSchema.g:1300:1: ( '\"' )
            // InternalAvroSchema.g:1301:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_5()); 

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
    // $ANTLR end "rule__RecordType__Group__5__Impl"


    // $ANTLR start "rule__RecordType__Group__6"
    // InternalAvroSchema.g:1310:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1314:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // InternalAvroSchema.g:1315:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__7();

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
    // $ANTLR end "rule__RecordType__Group__6"


    // $ANTLR start "rule__RecordType__Group__6__Impl"
    // InternalAvroSchema.g:1322:1: rule__RecordType__Group__6__Impl : ( 'record' ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1326:1: ( ( 'record' ) )
            // InternalAvroSchema.g:1327:1: ( 'record' )
            {
            // InternalAvroSchema.g:1327:1: ( 'record' )
            // InternalAvroSchema.g:1328:2: 'record'
            {
             before(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRecordKeyword_6()); 

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
    // $ANTLR end "rule__RecordType__Group__6__Impl"


    // $ANTLR start "rule__RecordType__Group__7"
    // InternalAvroSchema.g:1337:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl rule__RecordType__Group__8 ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1341:1: ( rule__RecordType__Group__7__Impl rule__RecordType__Group__8 )
            // InternalAvroSchema.g:1342:2: rule__RecordType__Group__7__Impl rule__RecordType__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__RecordType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__8();

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
    // $ANTLR end "rule__RecordType__Group__7"


    // $ANTLR start "rule__RecordType__Group__7__Impl"
    // InternalAvroSchema.g:1349:1: rule__RecordType__Group__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1353:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1354:1: ( '\"' )
            {
            // InternalAvroSchema.g:1354:1: ( '\"' )
            // InternalAvroSchema.g:1355:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_7()); 

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
    // $ANTLR end "rule__RecordType__Group__7__Impl"


    // $ANTLR start "rule__RecordType__Group__8"
    // InternalAvroSchema.g:1364:1: rule__RecordType__Group__8 : rule__RecordType__Group__8__Impl rule__RecordType__Group__9 ;
    public final void rule__RecordType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1368:1: ( rule__RecordType__Group__8__Impl rule__RecordType__Group__9 )
            // InternalAvroSchema.g:1369:2: rule__RecordType__Group__8__Impl rule__RecordType__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__9();

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
    // $ANTLR end "rule__RecordType__Group__8"


    // $ANTLR start "rule__RecordType__Group__8__Impl"
    // InternalAvroSchema.g:1376:1: rule__RecordType__Group__8__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1380:1: ( ( ',' ) )
            // InternalAvroSchema.g:1381:1: ( ',' )
            {
            // InternalAvroSchema.g:1381:1: ( ',' )
            // InternalAvroSchema.g:1382:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__RecordType__Group__8__Impl"


    // $ANTLR start "rule__RecordType__Group__9"
    // InternalAvroSchema.g:1391:1: rule__RecordType__Group__9 : rule__RecordType__Group__9__Impl rule__RecordType__Group__10 ;
    public final void rule__RecordType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1395:1: ( rule__RecordType__Group__9__Impl rule__RecordType__Group__10 )
            // InternalAvroSchema.g:1396:2: rule__RecordType__Group__9__Impl rule__RecordType__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__RecordType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__10();

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
    // $ANTLR end "rule__RecordType__Group__9"


    // $ANTLR start "rule__RecordType__Group__9__Impl"
    // InternalAvroSchema.g:1403:1: rule__RecordType__Group__9__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1407:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1408:1: ( '\"' )
            {
            // InternalAvroSchema.g:1408:1: ( '\"' )
            // InternalAvroSchema.g:1409:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_9()); 

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
    // $ANTLR end "rule__RecordType__Group__9__Impl"


    // $ANTLR start "rule__RecordType__Group__10"
    // InternalAvroSchema.g:1418:1: rule__RecordType__Group__10 : rule__RecordType__Group__10__Impl rule__RecordType__Group__11 ;
    public final void rule__RecordType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1422:1: ( rule__RecordType__Group__10__Impl rule__RecordType__Group__11 )
            // InternalAvroSchema.g:1423:2: rule__RecordType__Group__10__Impl rule__RecordType__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__11();

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
    // $ANTLR end "rule__RecordType__Group__10"


    // $ANTLR start "rule__RecordType__Group__10__Impl"
    // InternalAvroSchema.g:1430:1: rule__RecordType__Group__10__Impl : ( 'name' ) ;
    public final void rule__RecordType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1434:1: ( ( 'name' ) )
            // InternalAvroSchema.g:1435:1: ( 'name' )
            {
            // InternalAvroSchema.g:1435:1: ( 'name' )
            // InternalAvroSchema.g:1436:2: 'name'
            {
             before(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getNameKeyword_10()); 

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
    // $ANTLR end "rule__RecordType__Group__10__Impl"


    // $ANTLR start "rule__RecordType__Group__11"
    // InternalAvroSchema.g:1445:1: rule__RecordType__Group__11 : rule__RecordType__Group__11__Impl rule__RecordType__Group__12 ;
    public final void rule__RecordType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1449:1: ( rule__RecordType__Group__11__Impl rule__RecordType__Group__12 )
            // InternalAvroSchema.g:1450:2: rule__RecordType__Group__11__Impl rule__RecordType__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__RecordType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__12();

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
    // $ANTLR end "rule__RecordType__Group__11"


    // $ANTLR start "rule__RecordType__Group__11__Impl"
    // InternalAvroSchema.g:1457:1: rule__RecordType__Group__11__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1461:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1462:1: ( '\"' )
            {
            // InternalAvroSchema.g:1462:1: ( '\"' )
            // InternalAvroSchema.g:1463:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_11()); 

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
    // $ANTLR end "rule__RecordType__Group__11__Impl"


    // $ANTLR start "rule__RecordType__Group__12"
    // InternalAvroSchema.g:1472:1: rule__RecordType__Group__12 : rule__RecordType__Group__12__Impl rule__RecordType__Group__13 ;
    public final void rule__RecordType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1476:1: ( rule__RecordType__Group__12__Impl rule__RecordType__Group__13 )
            // InternalAvroSchema.g:1477:2: rule__RecordType__Group__12__Impl rule__RecordType__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__13();

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
    // $ANTLR end "rule__RecordType__Group__12"


    // $ANTLR start "rule__RecordType__Group__12__Impl"
    // InternalAvroSchema.g:1484:1: rule__RecordType__Group__12__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1488:1: ( ( ':' ) )
            // InternalAvroSchema.g:1489:1: ( ':' )
            {
            // InternalAvroSchema.g:1489:1: ( ':' )
            // InternalAvroSchema.g:1490:2: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_12()); 

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
    // $ANTLR end "rule__RecordType__Group__12__Impl"


    // $ANTLR start "rule__RecordType__Group__13"
    // InternalAvroSchema.g:1499:1: rule__RecordType__Group__13 : rule__RecordType__Group__13__Impl rule__RecordType__Group__14 ;
    public final void rule__RecordType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1503:1: ( rule__RecordType__Group__13__Impl rule__RecordType__Group__14 )
            // InternalAvroSchema.g:1504:2: rule__RecordType__Group__13__Impl rule__RecordType__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__RecordType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__14();

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
    // $ANTLR end "rule__RecordType__Group__13"


    // $ANTLR start "rule__RecordType__Group__13__Impl"
    // InternalAvroSchema.g:1511:1: rule__RecordType__Group__13__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1515:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1516:1: ( '\"' )
            {
            // InternalAvroSchema.g:1516:1: ( '\"' )
            // InternalAvroSchema.g:1517:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_13()); 

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
    // $ANTLR end "rule__RecordType__Group__13__Impl"


    // $ANTLR start "rule__RecordType__Group__14"
    // InternalAvroSchema.g:1526:1: rule__RecordType__Group__14 : rule__RecordType__Group__14__Impl rule__RecordType__Group__15 ;
    public final void rule__RecordType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1530:1: ( rule__RecordType__Group__14__Impl rule__RecordType__Group__15 )
            // InternalAvroSchema.g:1531:2: rule__RecordType__Group__14__Impl rule__RecordType__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__15();

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
    // $ANTLR end "rule__RecordType__Group__14"


    // $ANTLR start "rule__RecordType__Group__14__Impl"
    // InternalAvroSchema.g:1538:1: rule__RecordType__Group__14__Impl : ( ( rule__RecordType__NameAssignment_14 ) ) ;
    public final void rule__RecordType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1542:1: ( ( ( rule__RecordType__NameAssignment_14 ) ) )
            // InternalAvroSchema.g:1543:1: ( ( rule__RecordType__NameAssignment_14 ) )
            {
            // InternalAvroSchema.g:1543:1: ( ( rule__RecordType__NameAssignment_14 ) )
            // InternalAvroSchema.g:1544:2: ( rule__RecordType__NameAssignment_14 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 
            // InternalAvroSchema.g:1545:2: ( rule__RecordType__NameAssignment_14 )
            // InternalAvroSchema.g:1545:3: rule__RecordType__NameAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__NameAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNameAssignment_14()); 

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
    // $ANTLR end "rule__RecordType__Group__14__Impl"


    // $ANTLR start "rule__RecordType__Group__15"
    // InternalAvroSchema.g:1553:1: rule__RecordType__Group__15 : rule__RecordType__Group__15__Impl rule__RecordType__Group__16 ;
    public final void rule__RecordType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1557:1: ( rule__RecordType__Group__15__Impl rule__RecordType__Group__16 )
            // InternalAvroSchema.g:1558:2: rule__RecordType__Group__15__Impl rule__RecordType__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__RecordType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__16();

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
    // $ANTLR end "rule__RecordType__Group__15"


    // $ANTLR start "rule__RecordType__Group__15__Impl"
    // InternalAvroSchema.g:1565:1: rule__RecordType__Group__15__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1569:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1570:1: ( '\"' )
            {
            // InternalAvroSchema.g:1570:1: ( '\"' )
            // InternalAvroSchema.g:1571:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_15()); 

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
    // $ANTLR end "rule__RecordType__Group__15__Impl"


    // $ANTLR start "rule__RecordType__Group__16"
    // InternalAvroSchema.g:1580:1: rule__RecordType__Group__16 : rule__RecordType__Group__16__Impl rule__RecordType__Group__17 ;
    public final void rule__RecordType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1584:1: ( rule__RecordType__Group__16__Impl rule__RecordType__Group__17 )
            // InternalAvroSchema.g:1585:2: rule__RecordType__Group__16__Impl rule__RecordType__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__RecordType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__17();

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
    // $ANTLR end "rule__RecordType__Group__16"


    // $ANTLR start "rule__RecordType__Group__16__Impl"
    // InternalAvroSchema.g:1592:1: rule__RecordType__Group__16__Impl : ( ( rule__RecordType__Group_16__0 )? ) ;
    public final void rule__RecordType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1596:1: ( ( ( rule__RecordType__Group_16__0 )? ) )
            // InternalAvroSchema.g:1597:1: ( ( rule__RecordType__Group_16__0 )? )
            {
            // InternalAvroSchema.g:1597:1: ( ( rule__RecordType__Group_16__0 )? )
            // InternalAvroSchema.g:1598:2: ( rule__RecordType__Group_16__0 )?
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_16()); 
            // InternalAvroSchema.g:1599:2: ( rule__RecordType__Group_16__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==22) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==29) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalAvroSchema.g:1599:3: rule__RecordType__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordType__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordTypeAccess().getGroup_16()); 

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
    // $ANTLR end "rule__RecordType__Group__16__Impl"


    // $ANTLR start "rule__RecordType__Group__17"
    // InternalAvroSchema.g:1607:1: rule__RecordType__Group__17 : rule__RecordType__Group__17__Impl rule__RecordType__Group__18 ;
    public final void rule__RecordType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1611:1: ( rule__RecordType__Group__17__Impl rule__RecordType__Group__18 )
            // InternalAvroSchema.g:1612:2: rule__RecordType__Group__17__Impl rule__RecordType__Group__18
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__18();

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
    // $ANTLR end "rule__RecordType__Group__17"


    // $ANTLR start "rule__RecordType__Group__17__Impl"
    // InternalAvroSchema.g:1619:1: rule__RecordType__Group__17__Impl : ( ',' ) ;
    public final void rule__RecordType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1623:1: ( ( ',' ) )
            // InternalAvroSchema.g:1624:1: ( ',' )
            {
            // InternalAvroSchema.g:1624:1: ( ',' )
            // InternalAvroSchema.g:1625:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_17()); 

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
    // $ANTLR end "rule__RecordType__Group__17__Impl"


    // $ANTLR start "rule__RecordType__Group__18"
    // InternalAvroSchema.g:1634:1: rule__RecordType__Group__18 : rule__RecordType__Group__18__Impl rule__RecordType__Group__19 ;
    public final void rule__RecordType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1638:1: ( rule__RecordType__Group__18__Impl rule__RecordType__Group__19 )
            // InternalAvroSchema.g:1639:2: rule__RecordType__Group__18__Impl rule__RecordType__Group__19
            {
            pushFollow(FOLLOW_14);
            rule__RecordType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__19();

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
    // $ANTLR end "rule__RecordType__Group__18"


    // $ANTLR start "rule__RecordType__Group__18__Impl"
    // InternalAvroSchema.g:1646:1: rule__RecordType__Group__18__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1650:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1651:1: ( '\"' )
            {
            // InternalAvroSchema.g:1651:1: ( '\"' )
            // InternalAvroSchema.g:1652:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_18()); 

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
    // $ANTLR end "rule__RecordType__Group__18__Impl"


    // $ANTLR start "rule__RecordType__Group__19"
    // InternalAvroSchema.g:1661:1: rule__RecordType__Group__19 : rule__RecordType__Group__19__Impl rule__RecordType__Group__20 ;
    public final void rule__RecordType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1665:1: ( rule__RecordType__Group__19__Impl rule__RecordType__Group__20 )
            // InternalAvroSchema.g:1666:2: rule__RecordType__Group__19__Impl rule__RecordType__Group__20
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__20();

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
    // $ANTLR end "rule__RecordType__Group__19"


    // $ANTLR start "rule__RecordType__Group__19__Impl"
    // InternalAvroSchema.g:1673:1: rule__RecordType__Group__19__Impl : ( 'fields' ) ;
    public final void rule__RecordType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1677:1: ( ( 'fields' ) )
            // InternalAvroSchema.g:1678:1: ( 'fields' )
            {
            // InternalAvroSchema.g:1678:1: ( 'fields' )
            // InternalAvroSchema.g:1679:2: 'fields'
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getFieldsKeyword_19()); 

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
    // $ANTLR end "rule__RecordType__Group__19__Impl"


    // $ANTLR start "rule__RecordType__Group__20"
    // InternalAvroSchema.g:1688:1: rule__RecordType__Group__20 : rule__RecordType__Group__20__Impl rule__RecordType__Group__21 ;
    public final void rule__RecordType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1692:1: ( rule__RecordType__Group__20__Impl rule__RecordType__Group__21 )
            // InternalAvroSchema.g:1693:2: rule__RecordType__Group__20__Impl rule__RecordType__Group__21
            {
            pushFollow(FOLLOW_9);
            rule__RecordType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__21();

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
    // $ANTLR end "rule__RecordType__Group__20"


    // $ANTLR start "rule__RecordType__Group__20__Impl"
    // InternalAvroSchema.g:1700:1: rule__RecordType__Group__20__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1704:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1705:1: ( '\"' )
            {
            // InternalAvroSchema.g:1705:1: ( '\"' )
            // InternalAvroSchema.g:1706:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_20()); 

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
    // $ANTLR end "rule__RecordType__Group__20__Impl"


    // $ANTLR start "rule__RecordType__Group__21"
    // InternalAvroSchema.g:1715:1: rule__RecordType__Group__21 : rule__RecordType__Group__21__Impl rule__RecordType__Group__22 ;
    public final void rule__RecordType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1719:1: ( rule__RecordType__Group__21__Impl rule__RecordType__Group__22 )
            // InternalAvroSchema.g:1720:2: rule__RecordType__Group__21__Impl rule__RecordType__Group__22
            {
            pushFollow(FOLLOW_15);
            rule__RecordType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__22();

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
    // $ANTLR end "rule__RecordType__Group__21"


    // $ANTLR start "rule__RecordType__Group__21__Impl"
    // InternalAvroSchema.g:1727:1: rule__RecordType__Group__21__Impl : ( ':' ) ;
    public final void rule__RecordType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1731:1: ( ( ':' ) )
            // InternalAvroSchema.g:1732:1: ( ':' )
            {
            // InternalAvroSchema.g:1732:1: ( ':' )
            // InternalAvroSchema.g:1733:2: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_21()); 

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
    // $ANTLR end "rule__RecordType__Group__21__Impl"


    // $ANTLR start "rule__RecordType__Group__22"
    // InternalAvroSchema.g:1742:1: rule__RecordType__Group__22 : rule__RecordType__Group__22__Impl rule__RecordType__Group__23 ;
    public final void rule__RecordType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1746:1: ( rule__RecordType__Group__22__Impl rule__RecordType__Group__23 )
            // InternalAvroSchema.g:1747:2: rule__RecordType__Group__22__Impl rule__RecordType__Group__23
            {
            pushFollow(FOLLOW_16);
            rule__RecordType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__23();

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
    // $ANTLR end "rule__RecordType__Group__22"


    // $ANTLR start "rule__RecordType__Group__22__Impl"
    // InternalAvroSchema.g:1754:1: rule__RecordType__Group__22__Impl : ( '[' ) ;
    public final void rule__RecordType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1758:1: ( ( '[' ) )
            // InternalAvroSchema.g:1759:1: ( '[' )
            {
            // InternalAvroSchema.g:1759:1: ( '[' )
            // InternalAvroSchema.g:1760:2: '['
            {
             before(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getLeftSquareBracketKeyword_22()); 

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
    // $ANTLR end "rule__RecordType__Group__22__Impl"


    // $ANTLR start "rule__RecordType__Group__23"
    // InternalAvroSchema.g:1769:1: rule__RecordType__Group__23 : rule__RecordType__Group__23__Impl rule__RecordType__Group__24 ;
    public final void rule__RecordType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1773:1: ( rule__RecordType__Group__23__Impl rule__RecordType__Group__24 )
            // InternalAvroSchema.g:1774:2: rule__RecordType__Group__23__Impl rule__RecordType__Group__24
            {
            pushFollow(FOLLOW_17);
            rule__RecordType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__24();

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
    // $ANTLR end "rule__RecordType__Group__23"


    // $ANTLR start "rule__RecordType__Group__23__Impl"
    // InternalAvroSchema.g:1781:1: rule__RecordType__Group__23__Impl : ( ( rule__RecordType__FieldListAssignment_23 ) ) ;
    public final void rule__RecordType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1785:1: ( ( ( rule__RecordType__FieldListAssignment_23 ) ) )
            // InternalAvroSchema.g:1786:1: ( ( rule__RecordType__FieldListAssignment_23 ) )
            {
            // InternalAvroSchema.g:1786:1: ( ( rule__RecordType__FieldListAssignment_23 ) )
            // InternalAvroSchema.g:1787:2: ( rule__RecordType__FieldListAssignment_23 )
            {
             before(grammarAccess.getRecordTypeAccess().getFieldListAssignment_23()); 
            // InternalAvroSchema.g:1788:2: ( rule__RecordType__FieldListAssignment_23 )
            // InternalAvroSchema.g:1788:3: rule__RecordType__FieldListAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__FieldListAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getFieldListAssignment_23()); 

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
    // $ANTLR end "rule__RecordType__Group__23__Impl"


    // $ANTLR start "rule__RecordType__Group__24"
    // InternalAvroSchema.g:1796:1: rule__RecordType__Group__24 : rule__RecordType__Group__24__Impl rule__RecordType__Group__25 ;
    public final void rule__RecordType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1800:1: ( rule__RecordType__Group__24__Impl rule__RecordType__Group__25 )
            // InternalAvroSchema.g:1801:2: rule__RecordType__Group__24__Impl rule__RecordType__Group__25
            {
            pushFollow(FOLLOW_10);
            rule__RecordType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__25();

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
    // $ANTLR end "rule__RecordType__Group__24"


    // $ANTLR start "rule__RecordType__Group__24__Impl"
    // InternalAvroSchema.g:1808:1: rule__RecordType__Group__24__Impl : ( ']' ) ;
    public final void rule__RecordType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1812:1: ( ( ']' ) )
            // InternalAvroSchema.g:1813:1: ( ']' )
            {
            // InternalAvroSchema.g:1813:1: ( ']' )
            // InternalAvroSchema.g:1814:2: ']'
            {
             before(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_24()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRightSquareBracketKeyword_24()); 

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
    // $ANTLR end "rule__RecordType__Group__24__Impl"


    // $ANTLR start "rule__RecordType__Group__25"
    // InternalAvroSchema.g:1823:1: rule__RecordType__Group__25 : rule__RecordType__Group__25__Impl ;
    public final void rule__RecordType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1827:1: ( rule__RecordType__Group__25__Impl )
            // InternalAvroSchema.g:1828:2: rule__RecordType__Group__25__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__25__Impl();

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
    // $ANTLR end "rule__RecordType__Group__25"


    // $ANTLR start "rule__RecordType__Group__25__Impl"
    // InternalAvroSchema.g:1834:1: rule__RecordType__Group__25__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1838:1: ( ( '}' ) )
            // InternalAvroSchema.g:1839:1: ( '}' )
            {
            // InternalAvroSchema.g:1839:1: ( '}' )
            // InternalAvroSchema.g:1840:2: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_25()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_25()); 

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
    // $ANTLR end "rule__RecordType__Group__25__Impl"


    // $ANTLR start "rule__RecordType__Group_16__0"
    // InternalAvroSchema.g:1850:1: rule__RecordType__Group_16__0 : rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 ;
    public final void rule__RecordType__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1854:1: ( rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1 )
            // InternalAvroSchema.g:1855:2: rule__RecordType__Group_16__0__Impl rule__RecordType__Group_16__1
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__1();

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
    // $ANTLR end "rule__RecordType__Group_16__0"


    // $ANTLR start "rule__RecordType__Group_16__0__Impl"
    // InternalAvroSchema.g:1862:1: rule__RecordType__Group_16__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1866:1: ( ( ',' ) )
            // InternalAvroSchema.g:1867:1: ( ',' )
            {
            // InternalAvroSchema.g:1867:1: ( ',' )
            // InternalAvroSchema.g:1868:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_16_0()); 

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
    // $ANTLR end "rule__RecordType__Group_16__0__Impl"


    // $ANTLR start "rule__RecordType__Group_16__1"
    // InternalAvroSchema.g:1877:1: rule__RecordType__Group_16__1 : rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 ;
    public final void rule__RecordType__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1881:1: ( rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2 )
            // InternalAvroSchema.g:1882:2: rule__RecordType__Group_16__1__Impl rule__RecordType__Group_16__2
            {
            pushFollow(FOLLOW_18);
            rule__RecordType__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__2();

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
    // $ANTLR end "rule__RecordType__Group_16__1"


    // $ANTLR start "rule__RecordType__Group_16__1__Impl"
    // InternalAvroSchema.g:1889:1: rule__RecordType__Group_16__1__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1893:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1894:1: ( '\"' )
            {
            // InternalAvroSchema.g:1894:1: ( '\"' )
            // InternalAvroSchema.g:1895:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_1()); 

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
    // $ANTLR end "rule__RecordType__Group_16__1__Impl"


    // $ANTLR start "rule__RecordType__Group_16__2"
    // InternalAvroSchema.g:1904:1: rule__RecordType__Group_16__2 : rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 ;
    public final void rule__RecordType__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1908:1: ( rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3 )
            // InternalAvroSchema.g:1909:2: rule__RecordType__Group_16__2__Impl rule__RecordType__Group_16__3
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__3();

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
    // $ANTLR end "rule__RecordType__Group_16__2"


    // $ANTLR start "rule__RecordType__Group_16__2__Impl"
    // InternalAvroSchema.g:1916:1: rule__RecordType__Group_16__2__Impl : ( 'namespace' ) ;
    public final void rule__RecordType__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1920:1: ( ( 'namespace' ) )
            // InternalAvroSchema.g:1921:1: ( 'namespace' )
            {
            // InternalAvroSchema.g:1921:1: ( 'namespace' )
            // InternalAvroSchema.g:1922:2: 'namespace'
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getNamespaceKeyword_16_2()); 

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
    // $ANTLR end "rule__RecordType__Group_16__2__Impl"


    // $ANTLR start "rule__RecordType__Group_16__3"
    // InternalAvroSchema.g:1931:1: rule__RecordType__Group_16__3 : rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 ;
    public final void rule__RecordType__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1935:1: ( rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4 )
            // InternalAvroSchema.g:1936:2: rule__RecordType__Group_16__3__Impl rule__RecordType__Group_16__4
            {
            pushFollow(FOLLOW_9);
            rule__RecordType__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__4();

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
    // $ANTLR end "rule__RecordType__Group_16__3"


    // $ANTLR start "rule__RecordType__Group_16__3__Impl"
    // InternalAvroSchema.g:1943:1: rule__RecordType__Group_16__3__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1947:1: ( ( '\"' ) )
            // InternalAvroSchema.g:1948:1: ( '\"' )
            {
            // InternalAvroSchema.g:1948:1: ( '\"' )
            // InternalAvroSchema.g:1949:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_3()); 

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
    // $ANTLR end "rule__RecordType__Group_16__3__Impl"


    // $ANTLR start "rule__RecordType__Group_16__4"
    // InternalAvroSchema.g:1958:1: rule__RecordType__Group_16__4 : rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 ;
    public final void rule__RecordType__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1962:1: ( rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5 )
            // InternalAvroSchema.g:1963:2: rule__RecordType__Group_16__4__Impl rule__RecordType__Group_16__5
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group_16__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__5();

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
    // $ANTLR end "rule__RecordType__Group_16__4"


    // $ANTLR start "rule__RecordType__Group_16__4__Impl"
    // InternalAvroSchema.g:1970:1: rule__RecordType__Group_16__4__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1974:1: ( ( ':' ) )
            // InternalAvroSchema.g:1975:1: ( ':' )
            {
            // InternalAvroSchema.g:1975:1: ( ':' )
            // InternalAvroSchema.g:1976:2: ':'
            {
             before(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getColonKeyword_16_4()); 

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
    // $ANTLR end "rule__RecordType__Group_16__4__Impl"


    // $ANTLR start "rule__RecordType__Group_16__5"
    // InternalAvroSchema.g:1985:1: rule__RecordType__Group_16__5 : rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 ;
    public final void rule__RecordType__Group_16__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:1989:1: ( rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6 )
            // InternalAvroSchema.g:1990:2: rule__RecordType__Group_16__5__Impl rule__RecordType__Group_16__6
            {
            pushFollow(FOLLOW_6);
            rule__RecordType__Group_16__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__6();

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
    // $ANTLR end "rule__RecordType__Group_16__5"


    // $ANTLR start "rule__RecordType__Group_16__5__Impl"
    // InternalAvroSchema.g:1997:1: rule__RecordType__Group_16__5__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2001:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2002:1: ( '\"' )
            {
            // InternalAvroSchema.g:2002:1: ( '\"' )
            // InternalAvroSchema.g:2003:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_5()); 

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
    // $ANTLR end "rule__RecordType__Group_16__5__Impl"


    // $ANTLR start "rule__RecordType__Group_16__6"
    // InternalAvroSchema.g:2012:1: rule__RecordType__Group_16__6 : rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 ;
    public final void rule__RecordType__Group_16__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2016:1: ( rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7 )
            // InternalAvroSchema.g:2017:2: rule__RecordType__Group_16__6__Impl rule__RecordType__Group_16__7
            {
            pushFollow(FOLLOW_7);
            rule__RecordType__Group_16__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__7();

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
    // $ANTLR end "rule__RecordType__Group_16__6"


    // $ANTLR start "rule__RecordType__Group_16__6__Impl"
    // InternalAvroSchema.g:2024:1: rule__RecordType__Group_16__6__Impl : ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) ;
    public final void rule__RecordType__Group_16__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2028:1: ( ( ( rule__RecordType__NamespaceAssignment_16_6 ) ) )
            // InternalAvroSchema.g:2029:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            {
            // InternalAvroSchema.g:2029:1: ( ( rule__RecordType__NamespaceAssignment_16_6 ) )
            // InternalAvroSchema.g:2030:2: ( rule__RecordType__NamespaceAssignment_16_6 )
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 
            // InternalAvroSchema.g:2031:2: ( rule__RecordType__NamespaceAssignment_16_6 )
            // InternalAvroSchema.g:2031:3: rule__RecordType__NamespaceAssignment_16_6
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__NamespaceAssignment_16_6();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNamespaceAssignment_16_6()); 

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
    // $ANTLR end "rule__RecordType__Group_16__6__Impl"


    // $ANTLR start "rule__RecordType__Group_16__7"
    // InternalAvroSchema.g:2039:1: rule__RecordType__Group_16__7 : rule__RecordType__Group_16__7__Impl ;
    public final void rule__RecordType__Group_16__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2043:1: ( rule__RecordType__Group_16__7__Impl )
            // InternalAvroSchema.g:2044:2: rule__RecordType__Group_16__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group_16__7__Impl();

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
    // $ANTLR end "rule__RecordType__Group_16__7"


    // $ANTLR start "rule__RecordType__Group_16__7__Impl"
    // InternalAvroSchema.g:2050:1: rule__RecordType__Group_16__7__Impl : ( '\"' ) ;
    public final void rule__RecordType__Group_16__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2054:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2055:1: ( '\"' )
            {
            // InternalAvroSchema.g:2055:1: ( '\"' )
            // InternalAvroSchema.g:2056:2: '\"'
            {
             before(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getQuotationMarkKeyword_16_7()); 

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
    // $ANTLR end "rule__RecordType__Group_16__7__Impl"


    // $ANTLR start "rule__FieldList__Group__0"
    // InternalAvroSchema.g:2066:1: rule__FieldList__Group__0 : rule__FieldList__Group__0__Impl rule__FieldList__Group__1 ;
    public final void rule__FieldList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2070:1: ( rule__FieldList__Group__0__Impl rule__FieldList__Group__1 )
            // InternalAvroSchema.g:2071:2: rule__FieldList__Group__0__Impl rule__FieldList__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FieldList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldList__Group__1();

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
    // $ANTLR end "rule__FieldList__Group__0"


    // $ANTLR start "rule__FieldList__Group__0__Impl"
    // InternalAvroSchema.g:2078:1: rule__FieldList__Group__0__Impl : ( ( rule__FieldList__FieldsAssignment_0 ) ) ;
    public final void rule__FieldList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2082:1: ( ( ( rule__FieldList__FieldsAssignment_0 ) ) )
            // InternalAvroSchema.g:2083:1: ( ( rule__FieldList__FieldsAssignment_0 ) )
            {
            // InternalAvroSchema.g:2083:1: ( ( rule__FieldList__FieldsAssignment_0 ) )
            // InternalAvroSchema.g:2084:2: ( rule__FieldList__FieldsAssignment_0 )
            {
             before(grammarAccess.getFieldListAccess().getFieldsAssignment_0()); 
            // InternalAvroSchema.g:2085:2: ( rule__FieldList__FieldsAssignment_0 )
            // InternalAvroSchema.g:2085:3: rule__FieldList__FieldsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldList__FieldsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldListAccess().getFieldsAssignment_0()); 

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
    // $ANTLR end "rule__FieldList__Group__0__Impl"


    // $ANTLR start "rule__FieldList__Group__1"
    // InternalAvroSchema.g:2093:1: rule__FieldList__Group__1 : rule__FieldList__Group__1__Impl ;
    public final void rule__FieldList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2097:1: ( rule__FieldList__Group__1__Impl )
            // InternalAvroSchema.g:2098:2: rule__FieldList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldList__Group__1__Impl();

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
    // $ANTLR end "rule__FieldList__Group__1"


    // $ANTLR start "rule__FieldList__Group__1__Impl"
    // InternalAvroSchema.g:2104:1: rule__FieldList__Group__1__Impl : ( ( rule__FieldList__Group_1__0 )* ) ;
    public final void rule__FieldList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2108:1: ( ( ( rule__FieldList__Group_1__0 )* ) )
            // InternalAvroSchema.g:2109:1: ( ( rule__FieldList__Group_1__0 )* )
            {
            // InternalAvroSchema.g:2109:1: ( ( rule__FieldList__Group_1__0 )* )
            // InternalAvroSchema.g:2110:2: ( rule__FieldList__Group_1__0 )*
            {
             before(grammarAccess.getFieldListAccess().getGroup_1()); 
            // InternalAvroSchema.g:2111:2: ( rule__FieldList__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAvroSchema.g:2111:3: rule__FieldList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__FieldList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFieldListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FieldList__Group__1__Impl"


    // $ANTLR start "rule__FieldList__Group_1__0"
    // InternalAvroSchema.g:2120:1: rule__FieldList__Group_1__0 : rule__FieldList__Group_1__0__Impl rule__FieldList__Group_1__1 ;
    public final void rule__FieldList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2124:1: ( rule__FieldList__Group_1__0__Impl rule__FieldList__Group_1__1 )
            // InternalAvroSchema.g:2125:2: rule__FieldList__Group_1__0__Impl rule__FieldList__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__FieldList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldList__Group_1__1();

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
    // $ANTLR end "rule__FieldList__Group_1__0"


    // $ANTLR start "rule__FieldList__Group_1__0__Impl"
    // InternalAvroSchema.g:2132:1: rule__FieldList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FieldList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2136:1: ( ( ',' ) )
            // InternalAvroSchema.g:2137:1: ( ',' )
            {
            // InternalAvroSchema.g:2137:1: ( ',' )
            // InternalAvroSchema.g:2138:2: ','
            {
             before(grammarAccess.getFieldListAccess().getCommaKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldListAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__FieldList__Group_1__0__Impl"


    // $ANTLR start "rule__FieldList__Group_1__1"
    // InternalAvroSchema.g:2147:1: rule__FieldList__Group_1__1 : rule__FieldList__Group_1__1__Impl ;
    public final void rule__FieldList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2151:1: ( rule__FieldList__Group_1__1__Impl )
            // InternalAvroSchema.g:2152:2: rule__FieldList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldList__Group_1__1__Impl();

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
    // $ANTLR end "rule__FieldList__Group_1__1"


    // $ANTLR start "rule__FieldList__Group_1__1__Impl"
    // InternalAvroSchema.g:2158:1: rule__FieldList__Group_1__1__Impl : ( ( rule__FieldList__FieldsAssignment_1_1 ) ) ;
    public final void rule__FieldList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2162:1: ( ( ( rule__FieldList__FieldsAssignment_1_1 ) ) )
            // InternalAvroSchema.g:2163:1: ( ( rule__FieldList__FieldsAssignment_1_1 ) )
            {
            // InternalAvroSchema.g:2163:1: ( ( rule__FieldList__FieldsAssignment_1_1 ) )
            // InternalAvroSchema.g:2164:2: ( rule__FieldList__FieldsAssignment_1_1 )
            {
             before(grammarAccess.getFieldListAccess().getFieldsAssignment_1_1()); 
            // InternalAvroSchema.g:2165:2: ( rule__FieldList__FieldsAssignment_1_1 )
            // InternalAvroSchema.g:2165:3: rule__FieldList__FieldsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldList__FieldsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldListAccess().getFieldsAssignment_1_1()); 

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
    // $ANTLR end "rule__FieldList__Group_1__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalAvroSchema.g:2174:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2178:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalAvroSchema.g:2179:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalAvroSchema.g:2186:1: rule__Field__Group__0__Impl : ( '{' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2190:1: ( ( '{' ) )
            // InternalAvroSchema.g:2191:1: ( '{' )
            {
            // InternalAvroSchema.g:2191:1: ( '{' )
            // InternalAvroSchema.g:2192:2: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalAvroSchema.g:2201:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2205:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalAvroSchema.g:2206:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalAvroSchema.g:2213:1: rule__Field__Group__1__Impl : ( '\"' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2217:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2218:1: ( '\"' )
            {
            // InternalAvroSchema.g:2218:1: ( '\"' )
            // InternalAvroSchema.g:2219:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalAvroSchema.g:2228:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2232:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalAvroSchema.g:2233:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalAvroSchema.g:2240:1: rule__Field__Group__2__Impl : ( 'name' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2244:1: ( ( 'name' ) )
            // InternalAvroSchema.g:2245:1: ( 'name' )
            {
            // InternalAvroSchema.g:2245:1: ( 'name' )
            // InternalAvroSchema.g:2246:2: 'name'
            {
             before(grammarAccess.getFieldAccess().getNameKeyword_2()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameKeyword_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalAvroSchema.g:2255:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2259:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalAvroSchema.g:2260:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalAvroSchema.g:2267:1: rule__Field__Group__3__Impl : ( '\"' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2271:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2272:1: ( '\"' )
            {
            // InternalAvroSchema.g:2272:1: ( '\"' )
            // InternalAvroSchema.g:2273:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalAvroSchema.g:2282:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2286:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalAvroSchema.g:2287:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalAvroSchema.g:2294:1: rule__Field__Group__4__Impl : ( ':' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2298:1: ( ( ':' ) )
            // InternalAvroSchema.g:2299:1: ( ':' )
            {
            // InternalAvroSchema.g:2299:1: ( ':' )
            // InternalAvroSchema.g:2300:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // InternalAvroSchema.g:2309:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2313:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // InternalAvroSchema.g:2314:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__6();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalAvroSchema.g:2321:1: rule__Field__Group__5__Impl : ( '\"' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2325:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2326:1: ( '\"' )
            {
            // InternalAvroSchema.g:2326:1: ( '\"' )
            // InternalAvroSchema.g:2327:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_5()); 

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
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__6"
    // InternalAvroSchema.g:2336:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2340:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // InternalAvroSchema.g:2341:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__7();

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
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // InternalAvroSchema.g:2348:1: rule__Field__Group__6__Impl : ( ( rule__Field__NameAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2352:1: ( ( ( rule__Field__NameAssignment_6 ) ) )
            // InternalAvroSchema.g:2353:1: ( ( rule__Field__NameAssignment_6 ) )
            {
            // InternalAvroSchema.g:2353:1: ( ( rule__Field__NameAssignment_6 ) )
            // InternalAvroSchema.g:2354:2: ( rule__Field__NameAssignment_6 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_6()); 
            // InternalAvroSchema.g:2355:2: ( rule__Field__NameAssignment_6 )
            // InternalAvroSchema.g:2355:3: rule__Field__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_6()); 

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
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__7"
    // InternalAvroSchema.g:2363:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2367:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // InternalAvroSchema.g:2368:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Field__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__8();

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
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // InternalAvroSchema.g:2375:1: rule__Field__Group__7__Impl : ( '\"' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2379:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2380:1: ( '\"' )
            {
            // InternalAvroSchema.g:2380:1: ( '\"' )
            // InternalAvroSchema.g:2381:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_7()); 

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
    // $ANTLR end "rule__Field__Group__7__Impl"


    // $ANTLR start "rule__Field__Group__8"
    // InternalAvroSchema.g:2390:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2394:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // InternalAvroSchema.g:2395:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__9();

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
    // $ANTLR end "rule__Field__Group__8"


    // $ANTLR start "rule__Field__Group__8__Impl"
    // InternalAvroSchema.g:2402:1: rule__Field__Group__8__Impl : ( ',' ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2406:1: ( ( ',' ) )
            // InternalAvroSchema.g:2407:1: ( ',' )
            {
            // InternalAvroSchema.g:2407:1: ( ',' )
            // InternalAvroSchema.g:2408:2: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Field__Group__8__Impl"


    // $ANTLR start "rule__Field__Group__9"
    // InternalAvroSchema.g:2417:1: rule__Field__Group__9 : rule__Field__Group__9__Impl rule__Field__Group__10 ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2421:1: ( rule__Field__Group__9__Impl rule__Field__Group__10 )
            // InternalAvroSchema.g:2422:2: rule__Field__Group__9__Impl rule__Field__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Field__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__10();

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
    // $ANTLR end "rule__Field__Group__9"


    // $ANTLR start "rule__Field__Group__9__Impl"
    // InternalAvroSchema.g:2429:1: rule__Field__Group__9__Impl : ( '\"' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2433:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2434:1: ( '\"' )
            {
            // InternalAvroSchema.g:2434:1: ( '\"' )
            // InternalAvroSchema.g:2435:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_9()); 

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
    // $ANTLR end "rule__Field__Group__9__Impl"


    // $ANTLR start "rule__Field__Group__10"
    // InternalAvroSchema.g:2444:1: rule__Field__Group__10 : rule__Field__Group__10__Impl rule__Field__Group__11 ;
    public final void rule__Field__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2448:1: ( rule__Field__Group__10__Impl rule__Field__Group__11 )
            // InternalAvroSchema.g:2449:2: rule__Field__Group__10__Impl rule__Field__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__11();

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
    // $ANTLR end "rule__Field__Group__10"


    // $ANTLR start "rule__Field__Group__10__Impl"
    // InternalAvroSchema.g:2456:1: rule__Field__Group__10__Impl : ( 'type' ) ;
    public final void rule__Field__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2460:1: ( ( 'type' ) )
            // InternalAvroSchema.g:2461:1: ( 'type' )
            {
            // InternalAvroSchema.g:2461:1: ( 'type' )
            // InternalAvroSchema.g:2462:2: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getTypeKeyword_10()); 

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
    // $ANTLR end "rule__Field__Group__10__Impl"


    // $ANTLR start "rule__Field__Group__11"
    // InternalAvroSchema.g:2471:1: rule__Field__Group__11 : rule__Field__Group__11__Impl rule__Field__Group__12 ;
    public final void rule__Field__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2475:1: ( rule__Field__Group__11__Impl rule__Field__Group__12 )
            // InternalAvroSchema.g:2476:2: rule__Field__Group__11__Impl rule__Field__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Field__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__12();

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
    // $ANTLR end "rule__Field__Group__11"


    // $ANTLR start "rule__Field__Group__11__Impl"
    // InternalAvroSchema.g:2483:1: rule__Field__Group__11__Impl : ( '\"' ) ;
    public final void rule__Field__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2487:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2488:1: ( '\"' )
            {
            // InternalAvroSchema.g:2488:1: ( '\"' )
            // InternalAvroSchema.g:2489:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_11()); 

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
    // $ANTLR end "rule__Field__Group__11__Impl"


    // $ANTLR start "rule__Field__Group__12"
    // InternalAvroSchema.g:2498:1: rule__Field__Group__12 : rule__Field__Group__12__Impl rule__Field__Group__13 ;
    public final void rule__Field__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2502:1: ( rule__Field__Group__12__Impl rule__Field__Group__13 )
            // InternalAvroSchema.g:2503:2: rule__Field__Group__12__Impl rule__Field__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Field__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__13();

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
    // $ANTLR end "rule__Field__Group__12"


    // $ANTLR start "rule__Field__Group__12__Impl"
    // InternalAvroSchema.g:2510:1: rule__Field__Group__12__Impl : ( ':' ) ;
    public final void rule__Field__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2514:1: ( ( ':' ) )
            // InternalAvroSchema.g:2515:1: ( ':' )
            {
            // InternalAvroSchema.g:2515:1: ( ':' )
            // InternalAvroSchema.g:2516:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_12()); 

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
    // $ANTLR end "rule__Field__Group__12__Impl"


    // $ANTLR start "rule__Field__Group__13"
    // InternalAvroSchema.g:2525:1: rule__Field__Group__13 : rule__Field__Group__13__Impl rule__Field__Group__14 ;
    public final void rule__Field__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2529:1: ( rule__Field__Group__13__Impl rule__Field__Group__14 )
            // InternalAvroSchema.g:2530:2: rule__Field__Group__13__Impl rule__Field__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Field__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__14();

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
    // $ANTLR end "rule__Field__Group__13"


    // $ANTLR start "rule__Field__Group__13__Impl"
    // InternalAvroSchema.g:2537:1: rule__Field__Group__13__Impl : ( ( rule__Field__Alternatives_13 ) ) ;
    public final void rule__Field__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2541:1: ( ( ( rule__Field__Alternatives_13 ) ) )
            // InternalAvroSchema.g:2542:1: ( ( rule__Field__Alternatives_13 ) )
            {
            // InternalAvroSchema.g:2542:1: ( ( rule__Field__Alternatives_13 ) )
            // InternalAvroSchema.g:2543:2: ( rule__Field__Alternatives_13 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_13()); 
            // InternalAvroSchema.g:2544:2: ( rule__Field__Alternatives_13 )
            // InternalAvroSchema.g:2544:3: rule__Field__Alternatives_13
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_13()); 

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
    // $ANTLR end "rule__Field__Group__13__Impl"


    // $ANTLR start "rule__Field__Group__14"
    // InternalAvroSchema.g:2552:1: rule__Field__Group__14 : rule__Field__Group__14__Impl ;
    public final void rule__Field__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2556:1: ( rule__Field__Group__14__Impl )
            // InternalAvroSchema.g:2557:2: rule__Field__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__14__Impl();

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
    // $ANTLR end "rule__Field__Group__14"


    // $ANTLR start "rule__Field__Group__14__Impl"
    // InternalAvroSchema.g:2563:1: rule__Field__Group__14__Impl : ( '}' ) ;
    public final void rule__Field__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2567:1: ( ( '}' ) )
            // InternalAvroSchema.g:2568:1: ( '}' )
            {
            // InternalAvroSchema.g:2568:1: ( '}' )
            // InternalAvroSchema.g:2569:2: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Field__Group__14__Impl"


    // $ANTLR start "rule__Field__Group_13_2__0"
    // InternalAvroSchema.g:2579:1: rule__Field__Group_13_2__0 : rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 ;
    public final void rule__Field__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2583:1: ( rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1 )
            // InternalAvroSchema.g:2584:2: rule__Field__Group_13_2__0__Impl rule__Field__Group_13_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Field__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_13_2__1();

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
    // $ANTLR end "rule__Field__Group_13_2__0"


    // $ANTLR start "rule__Field__Group_13_2__0__Impl"
    // InternalAvroSchema.g:2591:1: rule__Field__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2595:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2596:1: ( '\"' )
            {
            // InternalAvroSchema.g:2596:1: ( '\"' )
            // InternalAvroSchema.g:2597:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_0()); 

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
    // $ANTLR end "rule__Field__Group_13_2__0__Impl"


    // $ANTLR start "rule__Field__Group_13_2__1"
    // InternalAvroSchema.g:2606:1: rule__Field__Group_13_2__1 : rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 ;
    public final void rule__Field__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2610:1: ( rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2 )
            // InternalAvroSchema.g:2611:2: rule__Field__Group_13_2__1__Impl rule__Field__Group_13_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_13_2__2();

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
    // $ANTLR end "rule__Field__Group_13_2__1"


    // $ANTLR start "rule__Field__Group_13_2__1__Impl"
    // InternalAvroSchema.g:2618:1: rule__Field__Group_13_2__1__Impl : ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__Field__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2622:1: ( ( ( rule__Field__RecordRefAssignment_13_2_1 ) ) )
            // InternalAvroSchema.g:2623:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            {
            // InternalAvroSchema.g:2623:1: ( ( rule__Field__RecordRefAssignment_13_2_1 ) )
            // InternalAvroSchema.g:2624:2: ( rule__Field__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 
            // InternalAvroSchema.g:2625:2: ( rule__Field__RecordRefAssignment_13_2_1 )
            // InternalAvroSchema.g:2625:3: rule__Field__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getRecordRefAssignment_13_2_1()); 

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
    // $ANTLR end "rule__Field__Group_13_2__1__Impl"


    // $ANTLR start "rule__Field__Group_13_2__2"
    // InternalAvroSchema.g:2633:1: rule__Field__Group_13_2__2 : rule__Field__Group_13_2__2__Impl ;
    public final void rule__Field__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2637:1: ( rule__Field__Group_13_2__2__Impl )
            // InternalAvroSchema.g:2638:2: rule__Field__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_13_2__2__Impl();

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
    // $ANTLR end "rule__Field__Group_13_2__2"


    // $ANTLR start "rule__Field__Group_13_2__2__Impl"
    // InternalAvroSchema.g:2644:1: rule__Field__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__Field__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2648:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2649:1: ( '\"' )
            {
            // InternalAvroSchema.g:2649:1: ( '\"' )
            // InternalAvroSchema.g:2650:2: '\"'
            {
             before(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getQuotationMarkKeyword_13_2_2()); 

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
    // $ANTLR end "rule__Field__Group_13_2__2__Impl"


    // $ANTLR start "rule__EnumType__Group__0"
    // InternalAvroSchema.g:2660:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2664:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // InternalAvroSchema.g:2665:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__1();

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
    // $ANTLR end "rule__EnumType__Group__0"


    // $ANTLR start "rule__EnumType__Group__0__Impl"
    // InternalAvroSchema.g:2672:1: rule__EnumType__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2676:1: ( ( '{' ) )
            // InternalAvroSchema.g:2677:1: ( '{' )
            {
            // InternalAvroSchema.g:2677:1: ( '{' )
            // InternalAvroSchema.g:2678:2: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__EnumType__Group__0__Impl"


    // $ANTLR start "rule__EnumType__Group__1"
    // InternalAvroSchema.g:2687:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2691:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // InternalAvroSchema.g:2692:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__2();

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
    // $ANTLR end "rule__EnumType__Group__1"


    // $ANTLR start "rule__EnumType__Group__1__Impl"
    // InternalAvroSchema.g:2699:1: rule__EnumType__Group__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2703:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2704:1: ( '\"' )
            {
            // InternalAvroSchema.g:2704:1: ( '\"' )
            // InternalAvroSchema.g:2705:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__EnumType__Group__1__Impl"


    // $ANTLR start "rule__EnumType__Group__2"
    // InternalAvroSchema.g:2714:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2718:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // InternalAvroSchema.g:2719:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__3();

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
    // $ANTLR end "rule__EnumType__Group__2"


    // $ANTLR start "rule__EnumType__Group__2__Impl"
    // InternalAvroSchema.g:2726:1: rule__EnumType__Group__2__Impl : ( 'type' ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2730:1: ( ( 'type' ) )
            // InternalAvroSchema.g:2731:1: ( 'type' )
            {
            // InternalAvroSchema.g:2731:1: ( 'type' )
            // InternalAvroSchema.g:2732:2: 'type'
            {
             before(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__EnumType__Group__2__Impl"


    // $ANTLR start "rule__EnumType__Group__3"
    // InternalAvroSchema.g:2741:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2745:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // InternalAvroSchema.g:2746:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__4();

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
    // $ANTLR end "rule__EnumType__Group__3"


    // $ANTLR start "rule__EnumType__Group__3__Impl"
    // InternalAvroSchema.g:2753:1: rule__EnumType__Group__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2757:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2758:1: ( '\"' )
            {
            // InternalAvroSchema.g:2758:1: ( '\"' )
            // InternalAvroSchema.g:2759:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_3()); 

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
    // $ANTLR end "rule__EnumType__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__4"
    // InternalAvroSchema.g:2768:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2772:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // InternalAvroSchema.g:2773:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__5();

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
    // $ANTLR end "rule__EnumType__Group__4"


    // $ANTLR start "rule__EnumType__Group__4__Impl"
    // InternalAvroSchema.g:2780:1: rule__EnumType__Group__4__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2784:1: ( ( ':' ) )
            // InternalAvroSchema.g:2785:1: ( ':' )
            {
            // InternalAvroSchema.g:2785:1: ( ':' )
            // InternalAvroSchema.g:2786:2: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__EnumType__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__5"
    // InternalAvroSchema.g:2795:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2799:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // InternalAvroSchema.g:2800:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__6();

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
    // $ANTLR end "rule__EnumType__Group__5"


    // $ANTLR start "rule__EnumType__Group__5__Impl"
    // InternalAvroSchema.g:2807:1: rule__EnumType__Group__5__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2811:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2812:1: ( '\"' )
            {
            // InternalAvroSchema.g:2812:1: ( '\"' )
            // InternalAvroSchema.g:2813:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_5()); 

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
    // $ANTLR end "rule__EnumType__Group__5__Impl"


    // $ANTLR start "rule__EnumType__Group__6"
    // InternalAvroSchema.g:2822:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl rule__EnumType__Group__7 ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2826:1: ( rule__EnumType__Group__6__Impl rule__EnumType__Group__7 )
            // InternalAvroSchema.g:2827:2: rule__EnumType__Group__6__Impl rule__EnumType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__7();

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
    // $ANTLR end "rule__EnumType__Group__6"


    // $ANTLR start "rule__EnumType__Group__6__Impl"
    // InternalAvroSchema.g:2834:1: rule__EnumType__Group__6__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2838:1: ( ( 'enum' ) )
            // InternalAvroSchema.g:2839:1: ( 'enum' )
            {
            // InternalAvroSchema.g:2839:1: ( 'enum' )
            // InternalAvroSchema.g:2840:2: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getEnumKeyword_6()); 

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
    // $ANTLR end "rule__EnumType__Group__6__Impl"


    // $ANTLR start "rule__EnumType__Group__7"
    // InternalAvroSchema.g:2849:1: rule__EnumType__Group__7 : rule__EnumType__Group__7__Impl rule__EnumType__Group__8 ;
    public final void rule__EnumType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2853:1: ( rule__EnumType__Group__7__Impl rule__EnumType__Group__8 )
            // InternalAvroSchema.g:2854:2: rule__EnumType__Group__7__Impl rule__EnumType__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__EnumType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__8();

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
    // $ANTLR end "rule__EnumType__Group__7"


    // $ANTLR start "rule__EnumType__Group__7__Impl"
    // InternalAvroSchema.g:2861:1: rule__EnumType__Group__7__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2865:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2866:1: ( '\"' )
            {
            // InternalAvroSchema.g:2866:1: ( '\"' )
            // InternalAvroSchema.g:2867:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_7()); 

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
    // $ANTLR end "rule__EnumType__Group__7__Impl"


    // $ANTLR start "rule__EnumType__Group__8"
    // InternalAvroSchema.g:2876:1: rule__EnumType__Group__8 : rule__EnumType__Group__8__Impl rule__EnumType__Group__9 ;
    public final void rule__EnumType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2880:1: ( rule__EnumType__Group__8__Impl rule__EnumType__Group__9 )
            // InternalAvroSchema.g:2881:2: rule__EnumType__Group__8__Impl rule__EnumType__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__9();

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
    // $ANTLR end "rule__EnumType__Group__8"


    // $ANTLR start "rule__EnumType__Group__8__Impl"
    // InternalAvroSchema.g:2888:1: rule__EnumType__Group__8__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2892:1: ( ( ',' ) )
            // InternalAvroSchema.g:2893:1: ( ',' )
            {
            // InternalAvroSchema.g:2893:1: ( ',' )
            // InternalAvroSchema.g:2894:2: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__EnumType__Group__8__Impl"


    // $ANTLR start "rule__EnumType__Group__9"
    // InternalAvroSchema.g:2903:1: rule__EnumType__Group__9 : rule__EnumType__Group__9__Impl rule__EnumType__Group__10 ;
    public final void rule__EnumType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2907:1: ( rule__EnumType__Group__9__Impl rule__EnumType__Group__10 )
            // InternalAvroSchema.g:2908:2: rule__EnumType__Group__9__Impl rule__EnumType__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__EnumType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__10();

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
    // $ANTLR end "rule__EnumType__Group__9"


    // $ANTLR start "rule__EnumType__Group__9__Impl"
    // InternalAvroSchema.g:2915:1: rule__EnumType__Group__9__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2919:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2920:1: ( '\"' )
            {
            // InternalAvroSchema.g:2920:1: ( '\"' )
            // InternalAvroSchema.g:2921:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_9()); 

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
    // $ANTLR end "rule__EnumType__Group__9__Impl"


    // $ANTLR start "rule__EnumType__Group__10"
    // InternalAvroSchema.g:2930:1: rule__EnumType__Group__10 : rule__EnumType__Group__10__Impl rule__EnumType__Group__11 ;
    public final void rule__EnumType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2934:1: ( rule__EnumType__Group__10__Impl rule__EnumType__Group__11 )
            // InternalAvroSchema.g:2935:2: rule__EnumType__Group__10__Impl rule__EnumType__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__11();

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
    // $ANTLR end "rule__EnumType__Group__10"


    // $ANTLR start "rule__EnumType__Group__10__Impl"
    // InternalAvroSchema.g:2942:1: rule__EnumType__Group__10__Impl : ( 'name' ) ;
    public final void rule__EnumType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2946:1: ( ( 'name' ) )
            // InternalAvroSchema.g:2947:1: ( 'name' )
            {
            // InternalAvroSchema.g:2947:1: ( 'name' )
            // InternalAvroSchema.g:2948:2: 'name'
            {
             before(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getNameKeyword_10()); 

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
    // $ANTLR end "rule__EnumType__Group__10__Impl"


    // $ANTLR start "rule__EnumType__Group__11"
    // InternalAvroSchema.g:2957:1: rule__EnumType__Group__11 : rule__EnumType__Group__11__Impl rule__EnumType__Group__12 ;
    public final void rule__EnumType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2961:1: ( rule__EnumType__Group__11__Impl rule__EnumType__Group__12 )
            // InternalAvroSchema.g:2962:2: rule__EnumType__Group__11__Impl rule__EnumType__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__EnumType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__12();

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
    // $ANTLR end "rule__EnumType__Group__11"


    // $ANTLR start "rule__EnumType__Group__11__Impl"
    // InternalAvroSchema.g:2969:1: rule__EnumType__Group__11__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2973:1: ( ( '\"' ) )
            // InternalAvroSchema.g:2974:1: ( '\"' )
            {
            // InternalAvroSchema.g:2974:1: ( '\"' )
            // InternalAvroSchema.g:2975:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_11()); 

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
    // $ANTLR end "rule__EnumType__Group__11__Impl"


    // $ANTLR start "rule__EnumType__Group__12"
    // InternalAvroSchema.g:2984:1: rule__EnumType__Group__12 : rule__EnumType__Group__12__Impl rule__EnumType__Group__13 ;
    public final void rule__EnumType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:2988:1: ( rule__EnumType__Group__12__Impl rule__EnumType__Group__13 )
            // InternalAvroSchema.g:2989:2: rule__EnumType__Group__12__Impl rule__EnumType__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__13();

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
    // $ANTLR end "rule__EnumType__Group__12"


    // $ANTLR start "rule__EnumType__Group__12__Impl"
    // InternalAvroSchema.g:2996:1: rule__EnumType__Group__12__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3000:1: ( ( ':' ) )
            // InternalAvroSchema.g:3001:1: ( ':' )
            {
            // InternalAvroSchema.g:3001:1: ( ':' )
            // InternalAvroSchema.g:3002:2: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_12()); 

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
    // $ANTLR end "rule__EnumType__Group__12__Impl"


    // $ANTLR start "rule__EnumType__Group__13"
    // InternalAvroSchema.g:3011:1: rule__EnumType__Group__13 : rule__EnumType__Group__13__Impl rule__EnumType__Group__14 ;
    public final void rule__EnumType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3015:1: ( rule__EnumType__Group__13__Impl rule__EnumType__Group__14 )
            // InternalAvroSchema.g:3016:2: rule__EnumType__Group__13__Impl rule__EnumType__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__EnumType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__14();

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
    // $ANTLR end "rule__EnumType__Group__13"


    // $ANTLR start "rule__EnumType__Group__13__Impl"
    // InternalAvroSchema.g:3023:1: rule__EnumType__Group__13__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3027:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3028:1: ( '\"' )
            {
            // InternalAvroSchema.g:3028:1: ( '\"' )
            // InternalAvroSchema.g:3029:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_13()); 

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
    // $ANTLR end "rule__EnumType__Group__13__Impl"


    // $ANTLR start "rule__EnumType__Group__14"
    // InternalAvroSchema.g:3038:1: rule__EnumType__Group__14 : rule__EnumType__Group__14__Impl rule__EnumType__Group__15 ;
    public final void rule__EnumType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3042:1: ( rule__EnumType__Group__14__Impl rule__EnumType__Group__15 )
            // InternalAvroSchema.g:3043:2: rule__EnumType__Group__14__Impl rule__EnumType__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__15();

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
    // $ANTLR end "rule__EnumType__Group__14"


    // $ANTLR start "rule__EnumType__Group__14__Impl"
    // InternalAvroSchema.g:3050:1: rule__EnumType__Group__14__Impl : ( ( rule__EnumType__NameAssignment_14 ) ) ;
    public final void rule__EnumType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3054:1: ( ( ( rule__EnumType__NameAssignment_14 ) ) )
            // InternalAvroSchema.g:3055:1: ( ( rule__EnumType__NameAssignment_14 ) )
            {
            // InternalAvroSchema.g:3055:1: ( ( rule__EnumType__NameAssignment_14 ) )
            // InternalAvroSchema.g:3056:2: ( rule__EnumType__NameAssignment_14 )
            {
             before(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 
            // InternalAvroSchema.g:3057:2: ( rule__EnumType__NameAssignment_14 )
            // InternalAvroSchema.g:3057:3: rule__EnumType__NameAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__NameAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getNameAssignment_14()); 

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
    // $ANTLR end "rule__EnumType__Group__14__Impl"


    // $ANTLR start "rule__EnumType__Group__15"
    // InternalAvroSchema.g:3065:1: rule__EnumType__Group__15 : rule__EnumType__Group__15__Impl rule__EnumType__Group__16 ;
    public final void rule__EnumType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3069:1: ( rule__EnumType__Group__15__Impl rule__EnumType__Group__16 )
            // InternalAvroSchema.g:3070:2: rule__EnumType__Group__15__Impl rule__EnumType__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__EnumType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__16();

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
    // $ANTLR end "rule__EnumType__Group__15"


    // $ANTLR start "rule__EnumType__Group__15__Impl"
    // InternalAvroSchema.g:3077:1: rule__EnumType__Group__15__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3081:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3082:1: ( '\"' )
            {
            // InternalAvroSchema.g:3082:1: ( '\"' )
            // InternalAvroSchema.g:3083:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_15()); 

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
    // $ANTLR end "rule__EnumType__Group__15__Impl"


    // $ANTLR start "rule__EnumType__Group__16"
    // InternalAvroSchema.g:3092:1: rule__EnumType__Group__16 : rule__EnumType__Group__16__Impl rule__EnumType__Group__17 ;
    public final void rule__EnumType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3096:1: ( rule__EnumType__Group__16__Impl rule__EnumType__Group__17 )
            // InternalAvroSchema.g:3097:2: rule__EnumType__Group__16__Impl rule__EnumType__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__17();

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
    // $ANTLR end "rule__EnumType__Group__16"


    // $ANTLR start "rule__EnumType__Group__16__Impl"
    // InternalAvroSchema.g:3104:1: rule__EnumType__Group__16__Impl : ( ',' ) ;
    public final void rule__EnumType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3108:1: ( ( ',' ) )
            // InternalAvroSchema.g:3109:1: ( ',' )
            {
            // InternalAvroSchema.g:3109:1: ( ',' )
            // InternalAvroSchema.g:3110:2: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_16()); 

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
    // $ANTLR end "rule__EnumType__Group__16__Impl"


    // $ANTLR start "rule__EnumType__Group__17"
    // InternalAvroSchema.g:3119:1: rule__EnumType__Group__17 : rule__EnumType__Group__17__Impl rule__EnumType__Group__18 ;
    public final void rule__EnumType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3123:1: ( rule__EnumType__Group__17__Impl rule__EnumType__Group__18 )
            // InternalAvroSchema.g:3124:2: rule__EnumType__Group__17__Impl rule__EnumType__Group__18
            {
            pushFollow(FOLLOW_22);
            rule__EnumType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__18();

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
    // $ANTLR end "rule__EnumType__Group__17"


    // $ANTLR start "rule__EnumType__Group__17__Impl"
    // InternalAvroSchema.g:3131:1: rule__EnumType__Group__17__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3135:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3136:1: ( '\"' )
            {
            // InternalAvroSchema.g:3136:1: ( '\"' )
            // InternalAvroSchema.g:3137:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_17()); 

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
    // $ANTLR end "rule__EnumType__Group__17__Impl"


    // $ANTLR start "rule__EnumType__Group__18"
    // InternalAvroSchema.g:3146:1: rule__EnumType__Group__18 : rule__EnumType__Group__18__Impl rule__EnumType__Group__19 ;
    public final void rule__EnumType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3150:1: ( rule__EnumType__Group__18__Impl rule__EnumType__Group__19 )
            // InternalAvroSchema.g:3151:2: rule__EnumType__Group__18__Impl rule__EnumType__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__19();

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
    // $ANTLR end "rule__EnumType__Group__18"


    // $ANTLR start "rule__EnumType__Group__18__Impl"
    // InternalAvroSchema.g:3158:1: rule__EnumType__Group__18__Impl : ( 'symbols' ) ;
    public final void rule__EnumType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3162:1: ( ( 'symbols' ) )
            // InternalAvroSchema.g:3163:1: ( 'symbols' )
            {
            // InternalAvroSchema.g:3163:1: ( 'symbols' )
            // InternalAvroSchema.g:3164:2: 'symbols'
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsKeyword_18()); 

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
    // $ANTLR end "rule__EnumType__Group__18__Impl"


    // $ANTLR start "rule__EnumType__Group__19"
    // InternalAvroSchema.g:3173:1: rule__EnumType__Group__19 : rule__EnumType__Group__19__Impl rule__EnumType__Group__20 ;
    public final void rule__EnumType__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3177:1: ( rule__EnumType__Group__19__Impl rule__EnumType__Group__20 )
            // InternalAvroSchema.g:3178:2: rule__EnumType__Group__19__Impl rule__EnumType__Group__20
            {
            pushFollow(FOLLOW_9);
            rule__EnumType__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__20();

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
    // $ANTLR end "rule__EnumType__Group__19"


    // $ANTLR start "rule__EnumType__Group__19__Impl"
    // InternalAvroSchema.g:3185:1: rule__EnumType__Group__19__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3189:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3190:1: ( '\"' )
            {
            // InternalAvroSchema.g:3190:1: ( '\"' )
            // InternalAvroSchema.g:3191:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_19()); 

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
    // $ANTLR end "rule__EnumType__Group__19__Impl"


    // $ANTLR start "rule__EnumType__Group__20"
    // InternalAvroSchema.g:3200:1: rule__EnumType__Group__20 : rule__EnumType__Group__20__Impl rule__EnumType__Group__21 ;
    public final void rule__EnumType__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3204:1: ( rule__EnumType__Group__20__Impl rule__EnumType__Group__21 )
            // InternalAvroSchema.g:3205:2: rule__EnumType__Group__20__Impl rule__EnumType__Group__21
            {
            pushFollow(FOLLOW_15);
            rule__EnumType__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__21();

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
    // $ANTLR end "rule__EnumType__Group__20"


    // $ANTLR start "rule__EnumType__Group__20__Impl"
    // InternalAvroSchema.g:3212:1: rule__EnumType__Group__20__Impl : ( ':' ) ;
    public final void rule__EnumType__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3216:1: ( ( ':' ) )
            // InternalAvroSchema.g:3217:1: ( ':' )
            {
            // InternalAvroSchema.g:3217:1: ( ':' )
            // InternalAvroSchema.g:3218:2: ':'
            {
             before(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getColonKeyword_20()); 

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
    // $ANTLR end "rule__EnumType__Group__20__Impl"


    // $ANTLR start "rule__EnumType__Group__21"
    // InternalAvroSchema.g:3227:1: rule__EnumType__Group__21 : rule__EnumType__Group__21__Impl rule__EnumType__Group__22 ;
    public final void rule__EnumType__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3231:1: ( rule__EnumType__Group__21__Impl rule__EnumType__Group__22 )
            // InternalAvroSchema.g:3232:2: rule__EnumType__Group__21__Impl rule__EnumType__Group__22
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__22();

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
    // $ANTLR end "rule__EnumType__Group__21"


    // $ANTLR start "rule__EnumType__Group__21__Impl"
    // InternalAvroSchema.g:3239:1: rule__EnumType__Group__21__Impl : ( '[' ) ;
    public final void rule__EnumType__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3243:1: ( ( '[' ) )
            // InternalAvroSchema.g:3244:1: ( '[' )
            {
            // InternalAvroSchema.g:3244:1: ( '[' )
            // InternalAvroSchema.g:3245:2: '['
            {
             before(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getLeftSquareBracketKeyword_21()); 

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
    // $ANTLR end "rule__EnumType__Group__21__Impl"


    // $ANTLR start "rule__EnumType__Group__22"
    // InternalAvroSchema.g:3254:1: rule__EnumType__Group__22 : rule__EnumType__Group__22__Impl rule__EnumType__Group__23 ;
    public final void rule__EnumType__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3258:1: ( rule__EnumType__Group__22__Impl rule__EnumType__Group__23 )
            // InternalAvroSchema.g:3259:2: rule__EnumType__Group__22__Impl rule__EnumType__Group__23
            {
            pushFollow(FOLLOW_4);
            rule__EnumType__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__23();

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
    // $ANTLR end "rule__EnumType__Group__22"


    // $ANTLR start "rule__EnumType__Group__22__Impl"
    // InternalAvroSchema.g:3266:1: rule__EnumType__Group__22__Impl : ( ( rule__EnumType__Group_22__0 ) ) ;
    public final void rule__EnumType__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3270:1: ( ( ( rule__EnumType__Group_22__0 ) ) )
            // InternalAvroSchema.g:3271:1: ( ( rule__EnumType__Group_22__0 ) )
            {
            // InternalAvroSchema.g:3271:1: ( ( rule__EnumType__Group_22__0 ) )
            // InternalAvroSchema.g:3272:2: ( rule__EnumType__Group_22__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_22()); 
            // InternalAvroSchema.g:3273:2: ( rule__EnumType__Group_22__0 )
            // InternalAvroSchema.g:3273:3: rule__EnumType__Group_22__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__Group_22__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup_22()); 

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
    // $ANTLR end "rule__EnumType__Group__22__Impl"


    // $ANTLR start "rule__EnumType__Group__23"
    // InternalAvroSchema.g:3281:1: rule__EnumType__Group__23 : rule__EnumType__Group__23__Impl rule__EnumType__Group__24 ;
    public final void rule__EnumType__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3285:1: ( rule__EnumType__Group__23__Impl rule__EnumType__Group__24 )
            // InternalAvroSchema.g:3286:2: rule__EnumType__Group__23__Impl rule__EnumType__Group__24
            {
            pushFollow(FOLLOW_4);
            rule__EnumType__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__24();

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
    // $ANTLR end "rule__EnumType__Group__23"


    // $ANTLR start "rule__EnumType__Group__23__Impl"
    // InternalAvroSchema.g:3293:1: rule__EnumType__Group__23__Impl : ( ( rule__EnumType__Group_23__0 )* ) ;
    public final void rule__EnumType__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3297:1: ( ( ( rule__EnumType__Group_23__0 )* ) )
            // InternalAvroSchema.g:3298:1: ( ( rule__EnumType__Group_23__0 )* )
            {
            // InternalAvroSchema.g:3298:1: ( ( rule__EnumType__Group_23__0 )* )
            // InternalAvroSchema.g:3299:2: ( rule__EnumType__Group_23__0 )*
            {
             before(grammarAccess.getEnumTypeAccess().getGroup_23()); 
            // InternalAvroSchema.g:3300:2: ( rule__EnumType__Group_23__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAvroSchema.g:3300:3: rule__EnumType__Group_23__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__EnumType__Group_23__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEnumTypeAccess().getGroup_23()); 

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
    // $ANTLR end "rule__EnumType__Group__23__Impl"


    // $ANTLR start "rule__EnumType__Group__24"
    // InternalAvroSchema.g:3308:1: rule__EnumType__Group__24 : rule__EnumType__Group__24__Impl rule__EnumType__Group__25 ;
    public final void rule__EnumType__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3312:1: ( rule__EnumType__Group__24__Impl rule__EnumType__Group__25 )
            // InternalAvroSchema.g:3313:2: rule__EnumType__Group__24__Impl rule__EnumType__Group__25
            {
            pushFollow(FOLLOW_10);
            rule__EnumType__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__25();

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
    // $ANTLR end "rule__EnumType__Group__24"


    // $ANTLR start "rule__EnumType__Group__24__Impl"
    // InternalAvroSchema.g:3320:1: rule__EnumType__Group__24__Impl : ( ']' ) ;
    public final void rule__EnumType__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3324:1: ( ( ']' ) )
            // InternalAvroSchema.g:3325:1: ( ']' )
            {
            // InternalAvroSchema.g:3325:1: ( ']' )
            // InternalAvroSchema.g:3326:2: ']'
            {
             before(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getRightSquareBracketKeyword_24()); 

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
    // $ANTLR end "rule__EnumType__Group__24__Impl"


    // $ANTLR start "rule__EnumType__Group__25"
    // InternalAvroSchema.g:3335:1: rule__EnumType__Group__25 : rule__EnumType__Group__25__Impl ;
    public final void rule__EnumType__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3339:1: ( rule__EnumType__Group__25__Impl )
            // InternalAvroSchema.g:3340:2: rule__EnumType__Group__25__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__Group__25__Impl();

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
    // $ANTLR end "rule__EnumType__Group__25"


    // $ANTLR start "rule__EnumType__Group__25__Impl"
    // InternalAvroSchema.g:3346:1: rule__EnumType__Group__25__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3350:1: ( ( '}' ) )
            // InternalAvroSchema.g:3351:1: ( '}' )
            {
            // InternalAvroSchema.g:3351:1: ( '}' )
            // InternalAvroSchema.g:3352:2: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_25()); 

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
    // $ANTLR end "rule__EnumType__Group__25__Impl"


    // $ANTLR start "rule__EnumType__Group_22__0"
    // InternalAvroSchema.g:3362:1: rule__EnumType__Group_22__0 : rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 ;
    public final void rule__EnumType__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3366:1: ( rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1 )
            // InternalAvroSchema.g:3367:2: rule__EnumType__Group_22__0__Impl rule__EnumType__Group_22__1
            {
            pushFollow(FOLLOW_6);
            rule__EnumType__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group_22__1();

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
    // $ANTLR end "rule__EnumType__Group_22__0"


    // $ANTLR start "rule__EnumType__Group_22__0__Impl"
    // InternalAvroSchema.g:3374:1: rule__EnumType__Group_22__0__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3378:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3379:1: ( '\"' )
            {
            // InternalAvroSchema.g:3379:1: ( '\"' )
            // InternalAvroSchema.g:3380:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_0()); 

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
    // $ANTLR end "rule__EnumType__Group_22__0__Impl"


    // $ANTLR start "rule__EnumType__Group_22__1"
    // InternalAvroSchema.g:3389:1: rule__EnumType__Group_22__1 : rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 ;
    public final void rule__EnumType__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3393:1: ( rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2 )
            // InternalAvroSchema.g:3394:2: rule__EnumType__Group_22__1__Impl rule__EnumType__Group_22__2
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group_22__2();

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
    // $ANTLR end "rule__EnumType__Group_22__1"


    // $ANTLR start "rule__EnumType__Group_22__1__Impl"
    // InternalAvroSchema.g:3401:1: rule__EnumType__Group_22__1__Impl : ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) ;
    public final void rule__EnumType__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3405:1: ( ( ( rule__EnumType__SymbolsAssignment_22_1 ) ) )
            // InternalAvroSchema.g:3406:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            {
            // InternalAvroSchema.g:3406:1: ( ( rule__EnumType__SymbolsAssignment_22_1 ) )
            // InternalAvroSchema.g:3407:2: ( rule__EnumType__SymbolsAssignment_22_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 
            // InternalAvroSchema.g:3408:2: ( rule__EnumType__SymbolsAssignment_22_1 )
            // InternalAvroSchema.g:3408:3: rule__EnumType__SymbolsAssignment_22_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__SymbolsAssignment_22_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_22_1()); 

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
    // $ANTLR end "rule__EnumType__Group_22__1__Impl"


    // $ANTLR start "rule__EnumType__Group_22__2"
    // InternalAvroSchema.g:3416:1: rule__EnumType__Group_22__2 : rule__EnumType__Group_22__2__Impl ;
    public final void rule__EnumType__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3420:1: ( rule__EnumType__Group_22__2__Impl )
            // InternalAvroSchema.g:3421:2: rule__EnumType__Group_22__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__Group_22__2__Impl();

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
    // $ANTLR end "rule__EnumType__Group_22__2"


    // $ANTLR start "rule__EnumType__Group_22__2__Impl"
    // InternalAvroSchema.g:3427:1: rule__EnumType__Group_22__2__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3431:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3432:1: ( '\"' )
            {
            // InternalAvroSchema.g:3432:1: ( '\"' )
            // InternalAvroSchema.g:3433:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_22_2()); 

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
    // $ANTLR end "rule__EnumType__Group_22__2__Impl"


    // $ANTLR start "rule__EnumType__Group_23__0"
    // InternalAvroSchema.g:3443:1: rule__EnumType__Group_23__0 : rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 ;
    public final void rule__EnumType__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3447:1: ( rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1 )
            // InternalAvroSchema.g:3448:2: rule__EnumType__Group_23__0__Impl rule__EnumType__Group_23__1
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group_23__1();

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
    // $ANTLR end "rule__EnumType__Group_23__0"


    // $ANTLR start "rule__EnumType__Group_23__0__Impl"
    // InternalAvroSchema.g:3455:1: rule__EnumType__Group_23__0__Impl : ( ',' ) ;
    public final void rule__EnumType__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3459:1: ( ( ',' ) )
            // InternalAvroSchema.g:3460:1: ( ',' )
            {
            // InternalAvroSchema.g:3460:1: ( ',' )
            // InternalAvroSchema.g:3461:2: ','
            {
             before(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getCommaKeyword_23_0()); 

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
    // $ANTLR end "rule__EnumType__Group_23__0__Impl"


    // $ANTLR start "rule__EnumType__Group_23__1"
    // InternalAvroSchema.g:3470:1: rule__EnumType__Group_23__1 : rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 ;
    public final void rule__EnumType__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3474:1: ( rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2 )
            // InternalAvroSchema.g:3475:2: rule__EnumType__Group_23__1__Impl rule__EnumType__Group_23__2
            {
            pushFollow(FOLLOW_6);
            rule__EnumType__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group_23__2();

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
    // $ANTLR end "rule__EnumType__Group_23__1"


    // $ANTLR start "rule__EnumType__Group_23__1__Impl"
    // InternalAvroSchema.g:3482:1: rule__EnumType__Group_23__1__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3486:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3487:1: ( '\"' )
            {
            // InternalAvroSchema.g:3487:1: ( '\"' )
            // InternalAvroSchema.g:3488:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_1()); 

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
    // $ANTLR end "rule__EnumType__Group_23__1__Impl"


    // $ANTLR start "rule__EnumType__Group_23__2"
    // InternalAvroSchema.g:3497:1: rule__EnumType__Group_23__2 : rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 ;
    public final void rule__EnumType__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3501:1: ( rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3 )
            // InternalAvroSchema.g:3502:2: rule__EnumType__Group_23__2__Impl rule__EnumType__Group_23__3
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group_23__3();

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
    // $ANTLR end "rule__EnumType__Group_23__2"


    // $ANTLR start "rule__EnumType__Group_23__2__Impl"
    // InternalAvroSchema.g:3509:1: rule__EnumType__Group_23__2__Impl : ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) ;
    public final void rule__EnumType__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3513:1: ( ( ( rule__EnumType__SymbolsAssignment_23_2 ) ) )
            // InternalAvroSchema.g:3514:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            {
            // InternalAvroSchema.g:3514:1: ( ( rule__EnumType__SymbolsAssignment_23_2 ) )
            // InternalAvroSchema.g:3515:2: ( rule__EnumType__SymbolsAssignment_23_2 )
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 
            // InternalAvroSchema.g:3516:2: ( rule__EnumType__SymbolsAssignment_23_2 )
            // InternalAvroSchema.g:3516:3: rule__EnumType__SymbolsAssignment_23_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__SymbolsAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getSymbolsAssignment_23_2()); 

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
    // $ANTLR end "rule__EnumType__Group_23__2__Impl"


    // $ANTLR start "rule__EnumType__Group_23__3"
    // InternalAvroSchema.g:3524:1: rule__EnumType__Group_23__3 : rule__EnumType__Group_23__3__Impl ;
    public final void rule__EnumType__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3528:1: ( rule__EnumType__Group_23__3__Impl )
            // InternalAvroSchema.g:3529:2: rule__EnumType__Group_23__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__Group_23__3__Impl();

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
    // $ANTLR end "rule__EnumType__Group_23__3"


    // $ANTLR start "rule__EnumType__Group_23__3__Impl"
    // InternalAvroSchema.g:3535:1: rule__EnumType__Group_23__3__Impl : ( '\"' ) ;
    public final void rule__EnumType__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3539:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3540:1: ( '\"' )
            {
            // InternalAvroSchema.g:3540:1: ( '\"' )
            // InternalAvroSchema.g:3541:2: '\"'
            {
             before(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getQuotationMarkKeyword_23_3()); 

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
    // $ANTLR end "rule__EnumType__Group_23__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // InternalAvroSchema.g:3551:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3555:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalAvroSchema.g:3556:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__1();

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
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // InternalAvroSchema.g:3563:1: rule__ArrayType__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3567:1: ( ( '{' ) )
            // InternalAvroSchema.g:3568:1: ( '{' )
            {
            // InternalAvroSchema.g:3568:1: ( '{' )
            // InternalAvroSchema.g:3569:2: '{'
            {
             before(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // InternalAvroSchema.g:3578:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3582:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalAvroSchema.g:3583:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__2();

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
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // InternalAvroSchema.g:3590:1: rule__ArrayType__Group__1__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3594:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3595:1: ( '\"' )
            {
            // InternalAvroSchema.g:3595:1: ( '\"' )
            // InternalAvroSchema.g:3596:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // InternalAvroSchema.g:3605:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3609:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalAvroSchema.g:3610:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__3();

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
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // InternalAvroSchema.g:3617:1: rule__ArrayType__Group__2__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3621:1: ( ( 'type' ) )
            // InternalAvroSchema.g:3622:1: ( 'type' )
            {
            // InternalAvroSchema.g:3622:1: ( 'type' )
            // InternalAvroSchema.g:3623:2: 'type'
            {
             before(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // InternalAvroSchema.g:3632:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3636:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // InternalAvroSchema.g:3637:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__4();

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
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // InternalAvroSchema.g:3644:1: rule__ArrayType__Group__3__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3648:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3649:1: ( '\"' )
            {
            // InternalAvroSchema.g:3649:1: ( '\"' )
            // InternalAvroSchema.g:3650:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_3()); 

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
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__4"
    // InternalAvroSchema.g:3659:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3663:1: ( rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 )
            // InternalAvroSchema.g:3664:2: rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__5();

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
    // $ANTLR end "rule__ArrayType__Group__4"


    // $ANTLR start "rule__ArrayType__Group__4__Impl"
    // InternalAvroSchema.g:3671:1: rule__ArrayType__Group__4__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3675:1: ( ( ':' ) )
            // InternalAvroSchema.g:3676:1: ( ':' )
            {
            // InternalAvroSchema.g:3676:1: ( ':' )
            // InternalAvroSchema.g:3677:2: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__ArrayType__Group__4__Impl"


    // $ANTLR start "rule__ArrayType__Group__5"
    // InternalAvroSchema.g:3686:1: rule__ArrayType__Group__5 : rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 ;
    public final void rule__ArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3690:1: ( rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6 )
            // InternalAvroSchema.g:3691:2: rule__ArrayType__Group__5__Impl rule__ArrayType__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__ArrayType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__6();

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
    // $ANTLR end "rule__ArrayType__Group__5"


    // $ANTLR start "rule__ArrayType__Group__5__Impl"
    // InternalAvroSchema.g:3698:1: rule__ArrayType__Group__5__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3702:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3703:1: ( '\"' )
            {
            // InternalAvroSchema.g:3703:1: ( '\"' )
            // InternalAvroSchema.g:3704:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_5()); 

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
    // $ANTLR end "rule__ArrayType__Group__5__Impl"


    // $ANTLR start "rule__ArrayType__Group__6"
    // InternalAvroSchema.g:3713:1: rule__ArrayType__Group__6 : rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 ;
    public final void rule__ArrayType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3717:1: ( rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7 )
            // InternalAvroSchema.g:3718:2: rule__ArrayType__Group__6__Impl rule__ArrayType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__7();

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
    // $ANTLR end "rule__ArrayType__Group__6"


    // $ANTLR start "rule__ArrayType__Group__6__Impl"
    // InternalAvroSchema.g:3725:1: rule__ArrayType__Group__6__Impl : ( 'array' ) ;
    public final void rule__ArrayType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3729:1: ( ( 'array' ) )
            // InternalAvroSchema.g:3730:1: ( 'array' )
            {
            // InternalAvroSchema.g:3730:1: ( 'array' )
            // InternalAvroSchema.g:3731:2: 'array'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getArrayKeyword_6()); 

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
    // $ANTLR end "rule__ArrayType__Group__6__Impl"


    // $ANTLR start "rule__ArrayType__Group__7"
    // InternalAvroSchema.g:3740:1: rule__ArrayType__Group__7 : rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 ;
    public final void rule__ArrayType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3744:1: ( rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8 )
            // InternalAvroSchema.g:3745:2: rule__ArrayType__Group__7__Impl rule__ArrayType__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__ArrayType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__8();

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
    // $ANTLR end "rule__ArrayType__Group__7"


    // $ANTLR start "rule__ArrayType__Group__7__Impl"
    // InternalAvroSchema.g:3752:1: rule__ArrayType__Group__7__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3756:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3757:1: ( '\"' )
            {
            // InternalAvroSchema.g:3757:1: ( '\"' )
            // InternalAvroSchema.g:3758:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_7()); 

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
    // $ANTLR end "rule__ArrayType__Group__7__Impl"


    // $ANTLR start "rule__ArrayType__Group__8"
    // InternalAvroSchema.g:3767:1: rule__ArrayType__Group__8 : rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 ;
    public final void rule__ArrayType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3771:1: ( rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9 )
            // InternalAvroSchema.g:3772:2: rule__ArrayType__Group__8__Impl rule__ArrayType__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__9();

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
    // $ANTLR end "rule__ArrayType__Group__8"


    // $ANTLR start "rule__ArrayType__Group__8__Impl"
    // InternalAvroSchema.g:3779:1: rule__ArrayType__Group__8__Impl : ( ',' ) ;
    public final void rule__ArrayType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3783:1: ( ( ',' ) )
            // InternalAvroSchema.g:3784:1: ( ',' )
            {
            // InternalAvroSchema.g:3784:1: ( ',' )
            // InternalAvroSchema.g:3785:2: ','
            {
             before(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__ArrayType__Group__8__Impl"


    // $ANTLR start "rule__ArrayType__Group__9"
    // InternalAvroSchema.g:3794:1: rule__ArrayType__Group__9 : rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 ;
    public final void rule__ArrayType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3798:1: ( rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10 )
            // InternalAvroSchema.g:3799:2: rule__ArrayType__Group__9__Impl rule__ArrayType__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__ArrayType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__10();

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
    // $ANTLR end "rule__ArrayType__Group__9"


    // $ANTLR start "rule__ArrayType__Group__9__Impl"
    // InternalAvroSchema.g:3806:1: rule__ArrayType__Group__9__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3810:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3811:1: ( '\"' )
            {
            // InternalAvroSchema.g:3811:1: ( '\"' )
            // InternalAvroSchema.g:3812:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_9()); 

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
    // $ANTLR end "rule__ArrayType__Group__9__Impl"


    // $ANTLR start "rule__ArrayType__Group__10"
    // InternalAvroSchema.g:3821:1: rule__ArrayType__Group__10 : rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 ;
    public final void rule__ArrayType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3825:1: ( rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11 )
            // InternalAvroSchema.g:3826:2: rule__ArrayType__Group__10__Impl rule__ArrayType__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__11();

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
    // $ANTLR end "rule__ArrayType__Group__10"


    // $ANTLR start "rule__ArrayType__Group__10__Impl"
    // InternalAvroSchema.g:3833:1: rule__ArrayType__Group__10__Impl : ( 'items' ) ;
    public final void rule__ArrayType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3837:1: ( ( 'items' ) )
            // InternalAvroSchema.g:3838:1: ( 'items' )
            {
            // InternalAvroSchema.g:3838:1: ( 'items' )
            // InternalAvroSchema.g:3839:2: 'items'
            {
             before(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getItemsKeyword_10()); 

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
    // $ANTLR end "rule__ArrayType__Group__10__Impl"


    // $ANTLR start "rule__ArrayType__Group__11"
    // InternalAvroSchema.g:3848:1: rule__ArrayType__Group__11 : rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 ;
    public final void rule__ArrayType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3852:1: ( rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12 )
            // InternalAvroSchema.g:3853:2: rule__ArrayType__Group__11__Impl rule__ArrayType__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__ArrayType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__12();

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
    // $ANTLR end "rule__ArrayType__Group__11"


    // $ANTLR start "rule__ArrayType__Group__11__Impl"
    // InternalAvroSchema.g:3860:1: rule__ArrayType__Group__11__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3864:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3865:1: ( '\"' )
            {
            // InternalAvroSchema.g:3865:1: ( '\"' )
            // InternalAvroSchema.g:3866:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_11()); 

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
    // $ANTLR end "rule__ArrayType__Group__11__Impl"


    // $ANTLR start "rule__ArrayType__Group__12"
    // InternalAvroSchema.g:3875:1: rule__ArrayType__Group__12 : rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 ;
    public final void rule__ArrayType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3879:1: ( rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13 )
            // InternalAvroSchema.g:3880:2: rule__ArrayType__Group__12__Impl rule__ArrayType__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__ArrayType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__13();

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
    // $ANTLR end "rule__ArrayType__Group__12"


    // $ANTLR start "rule__ArrayType__Group__12__Impl"
    // InternalAvroSchema.g:3887:1: rule__ArrayType__Group__12__Impl : ( ':' ) ;
    public final void rule__ArrayType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3891:1: ( ( ':' ) )
            // InternalAvroSchema.g:3892:1: ( ':' )
            {
            // InternalAvroSchema.g:3892:1: ( ':' )
            // InternalAvroSchema.g:3893:2: ':'
            {
             before(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getColonKeyword_12()); 

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
    // $ANTLR end "rule__ArrayType__Group__12__Impl"


    // $ANTLR start "rule__ArrayType__Group__13"
    // InternalAvroSchema.g:3902:1: rule__ArrayType__Group__13 : rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 ;
    public final void rule__ArrayType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3906:1: ( rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14 )
            // InternalAvroSchema.g:3907:2: rule__ArrayType__Group__13__Impl rule__ArrayType__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__ArrayType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__14();

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
    // $ANTLR end "rule__ArrayType__Group__13"


    // $ANTLR start "rule__ArrayType__Group__13__Impl"
    // InternalAvroSchema.g:3914:1: rule__ArrayType__Group__13__Impl : ( ( rule__ArrayType__Alternatives_13 ) ) ;
    public final void rule__ArrayType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3918:1: ( ( ( rule__ArrayType__Alternatives_13 ) ) )
            // InternalAvroSchema.g:3919:1: ( ( rule__ArrayType__Alternatives_13 ) )
            {
            // InternalAvroSchema.g:3919:1: ( ( rule__ArrayType__Alternatives_13 ) )
            // InternalAvroSchema.g:3920:2: ( rule__ArrayType__Alternatives_13 )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 
            // InternalAvroSchema.g:3921:2: ( rule__ArrayType__Alternatives_13 )
            // InternalAvroSchema.g:3921:3: rule__ArrayType__Alternatives_13
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives_13()); 

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
    // $ANTLR end "rule__ArrayType__Group__13__Impl"


    // $ANTLR start "rule__ArrayType__Group__14"
    // InternalAvroSchema.g:3929:1: rule__ArrayType__Group__14 : rule__ArrayType__Group__14__Impl ;
    public final void rule__ArrayType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3933:1: ( rule__ArrayType__Group__14__Impl )
            // InternalAvroSchema.g:3934:2: rule__ArrayType__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__14__Impl();

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
    // $ANTLR end "rule__ArrayType__Group__14"


    // $ANTLR start "rule__ArrayType__Group__14__Impl"
    // InternalAvroSchema.g:3940:1: rule__ArrayType__Group__14__Impl : ( '}' ) ;
    public final void rule__ArrayType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3944:1: ( ( '}' ) )
            // InternalAvroSchema.g:3945:1: ( '}' )
            {
            // InternalAvroSchema.g:3945:1: ( '}' )
            // InternalAvroSchema.g:3946:2: '}'
            {
             before(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__ArrayType__Group__14__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__0"
    // InternalAvroSchema.g:3956:1: rule__ArrayType__Group_13_2__0 : rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 ;
    public final void rule__ArrayType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3960:1: ( rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1 )
            // InternalAvroSchema.g:3961:2: rule__ArrayType__Group_13_2__0__Impl rule__ArrayType__Group_13_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ArrayType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_13_2__1();

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
    // $ANTLR end "rule__ArrayType__Group_13_2__0"


    // $ANTLR start "rule__ArrayType__Group_13_2__0__Impl"
    // InternalAvroSchema.g:3968:1: rule__ArrayType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3972:1: ( ( '\"' ) )
            // InternalAvroSchema.g:3973:1: ( '\"' )
            {
            // InternalAvroSchema.g:3973:1: ( '\"' )
            // InternalAvroSchema.g:3974:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_0()); 

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
    // $ANTLR end "rule__ArrayType__Group_13_2__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__1"
    // InternalAvroSchema.g:3983:1: rule__ArrayType__Group_13_2__1 : rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 ;
    public final void rule__ArrayType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3987:1: ( rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2 )
            // InternalAvroSchema.g:3988:2: rule__ArrayType__Group_13_2__1__Impl rule__ArrayType__Group_13_2__2
            {
            pushFollow(FOLLOW_7);
            rule__ArrayType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_13_2__2();

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
    // $ANTLR end "rule__ArrayType__Group_13_2__1"


    // $ANTLR start "rule__ArrayType__Group_13_2__1__Impl"
    // InternalAvroSchema.g:3995:1: rule__ArrayType__Group_13_2__1__Impl : ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__ArrayType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:3999:1: ( ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) ) )
            // InternalAvroSchema.g:4000:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            {
            // InternalAvroSchema.g:4000:1: ( ( rule__ArrayType__RecordRefAssignment_13_2_1 ) )
            // InternalAvroSchema.g:4001:2: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 
            // InternalAvroSchema.g:4002:2: ( rule__ArrayType__RecordRefAssignment_13_2_1 )
            // InternalAvroSchema.g:4002:3: rule__ArrayType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getRecordRefAssignment_13_2_1()); 

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
    // $ANTLR end "rule__ArrayType__Group_13_2__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_13_2__2"
    // InternalAvroSchema.g:4010:1: rule__ArrayType__Group_13_2__2 : rule__ArrayType__Group_13_2__2__Impl ;
    public final void rule__ArrayType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4014:1: ( rule__ArrayType__Group_13_2__2__Impl )
            // InternalAvroSchema.g:4015:2: rule__ArrayType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_13_2__2__Impl();

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
    // $ANTLR end "rule__ArrayType__Group_13_2__2"


    // $ANTLR start "rule__ArrayType__Group_13_2__2__Impl"
    // InternalAvroSchema.g:4021:1: rule__ArrayType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__ArrayType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4025:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4026:1: ( '\"' )
            {
            // InternalAvroSchema.g:4026:1: ( '\"' )
            // InternalAvroSchema.g:4027:2: '\"'
            {
             before(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getQuotationMarkKeyword_13_2_2()); 

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
    // $ANTLR end "rule__ArrayType__Group_13_2__2__Impl"


    // $ANTLR start "rule__MapType__Group__0"
    // InternalAvroSchema.g:4037:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4041:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // InternalAvroSchema.g:4042:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__1();

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
    // $ANTLR end "rule__MapType__Group__0"


    // $ANTLR start "rule__MapType__Group__0__Impl"
    // InternalAvroSchema.g:4049:1: rule__MapType__Group__0__Impl : ( '{' ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4053:1: ( ( '{' ) )
            // InternalAvroSchema.g:4054:1: ( '{' )
            {
            // InternalAvroSchema.g:4054:1: ( '{' )
            // InternalAvroSchema.g:4055:2: '{'
            {
             before(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__MapType__Group__0__Impl"


    // $ANTLR start "rule__MapType__Group__1"
    // InternalAvroSchema.g:4064:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4068:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // InternalAvroSchema.g:4069:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__2();

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
    // $ANTLR end "rule__MapType__Group__1"


    // $ANTLR start "rule__MapType__Group__1__Impl"
    // InternalAvroSchema.g:4076:1: rule__MapType__Group__1__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4080:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4081:1: ( '\"' )
            {
            // InternalAvroSchema.g:4081:1: ( '\"' )
            // InternalAvroSchema.g:4082:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__MapType__Group__1__Impl"


    // $ANTLR start "rule__MapType__Group__2"
    // InternalAvroSchema.g:4091:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl rule__MapType__Group__3 ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4095:1: ( rule__MapType__Group__2__Impl rule__MapType__Group__3 )
            // InternalAvroSchema.g:4096:2: rule__MapType__Group__2__Impl rule__MapType__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__3();

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
    // $ANTLR end "rule__MapType__Group__2"


    // $ANTLR start "rule__MapType__Group__2__Impl"
    // InternalAvroSchema.g:4103:1: rule__MapType__Group__2__Impl : ( 'type' ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4107:1: ( ( 'type' ) )
            // InternalAvroSchema.g:4108:1: ( 'type' )
            {
            // InternalAvroSchema.g:4108:1: ( 'type' )
            // InternalAvroSchema.g:4109:2: 'type'
            {
             before(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__MapType__Group__2__Impl"


    // $ANTLR start "rule__MapType__Group__3"
    // InternalAvroSchema.g:4118:1: rule__MapType__Group__3 : rule__MapType__Group__3__Impl rule__MapType__Group__4 ;
    public final void rule__MapType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4122:1: ( rule__MapType__Group__3__Impl rule__MapType__Group__4 )
            // InternalAvroSchema.g:4123:2: rule__MapType__Group__3__Impl rule__MapType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MapType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__4();

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
    // $ANTLR end "rule__MapType__Group__3"


    // $ANTLR start "rule__MapType__Group__3__Impl"
    // InternalAvroSchema.g:4130:1: rule__MapType__Group__3__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4134:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4135:1: ( '\"' )
            {
            // InternalAvroSchema.g:4135:1: ( '\"' )
            // InternalAvroSchema.g:4136:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_3()); 

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
    // $ANTLR end "rule__MapType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__4"
    // InternalAvroSchema.g:4145:1: rule__MapType__Group__4 : rule__MapType__Group__4__Impl rule__MapType__Group__5 ;
    public final void rule__MapType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4149:1: ( rule__MapType__Group__4__Impl rule__MapType__Group__5 )
            // InternalAvroSchema.g:4150:2: rule__MapType__Group__4__Impl rule__MapType__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__5();

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
    // $ANTLR end "rule__MapType__Group__4"


    // $ANTLR start "rule__MapType__Group__4__Impl"
    // InternalAvroSchema.g:4157:1: rule__MapType__Group__4__Impl : ( ':' ) ;
    public final void rule__MapType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4161:1: ( ( ':' ) )
            // InternalAvroSchema.g:4162:1: ( ':' )
            {
            // InternalAvroSchema.g:4162:1: ( ':' )
            // InternalAvroSchema.g:4163:2: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__MapType__Group__4__Impl"


    // $ANTLR start "rule__MapType__Group__5"
    // InternalAvroSchema.g:4172:1: rule__MapType__Group__5 : rule__MapType__Group__5__Impl rule__MapType__Group__6 ;
    public final void rule__MapType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4176:1: ( rule__MapType__Group__5__Impl rule__MapType__Group__6 )
            // InternalAvroSchema.g:4177:2: rule__MapType__Group__5__Impl rule__MapType__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__MapType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__6();

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
    // $ANTLR end "rule__MapType__Group__5"


    // $ANTLR start "rule__MapType__Group__5__Impl"
    // InternalAvroSchema.g:4184:1: rule__MapType__Group__5__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4188:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4189:1: ( '\"' )
            {
            // InternalAvroSchema.g:4189:1: ( '\"' )
            // InternalAvroSchema.g:4190:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_5()); 

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
    // $ANTLR end "rule__MapType__Group__5__Impl"


    // $ANTLR start "rule__MapType__Group__6"
    // InternalAvroSchema.g:4199:1: rule__MapType__Group__6 : rule__MapType__Group__6__Impl rule__MapType__Group__7 ;
    public final void rule__MapType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4203:1: ( rule__MapType__Group__6__Impl rule__MapType__Group__7 )
            // InternalAvroSchema.g:4204:2: rule__MapType__Group__6__Impl rule__MapType__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__7();

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
    // $ANTLR end "rule__MapType__Group__6"


    // $ANTLR start "rule__MapType__Group__6__Impl"
    // InternalAvroSchema.g:4211:1: rule__MapType__Group__6__Impl : ( 'map' ) ;
    public final void rule__MapType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4215:1: ( ( 'map' ) )
            // InternalAvroSchema.g:4216:1: ( 'map' )
            {
            // InternalAvroSchema.g:4216:1: ( 'map' )
            // InternalAvroSchema.g:4217:2: 'map'
            {
             before(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getMapKeyword_6()); 

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
    // $ANTLR end "rule__MapType__Group__6__Impl"


    // $ANTLR start "rule__MapType__Group__7"
    // InternalAvroSchema.g:4226:1: rule__MapType__Group__7 : rule__MapType__Group__7__Impl rule__MapType__Group__8 ;
    public final void rule__MapType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4230:1: ( rule__MapType__Group__7__Impl rule__MapType__Group__8 )
            // InternalAvroSchema.g:4231:2: rule__MapType__Group__7__Impl rule__MapType__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__MapType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__8();

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
    // $ANTLR end "rule__MapType__Group__7"


    // $ANTLR start "rule__MapType__Group__7__Impl"
    // InternalAvroSchema.g:4238:1: rule__MapType__Group__7__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4242:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4243:1: ( '\"' )
            {
            // InternalAvroSchema.g:4243:1: ( '\"' )
            // InternalAvroSchema.g:4244:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_7()); 

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
    // $ANTLR end "rule__MapType__Group__7__Impl"


    // $ANTLR start "rule__MapType__Group__8"
    // InternalAvroSchema.g:4253:1: rule__MapType__Group__8 : rule__MapType__Group__8__Impl rule__MapType__Group__9 ;
    public final void rule__MapType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4257:1: ( rule__MapType__Group__8__Impl rule__MapType__Group__9 )
            // InternalAvroSchema.g:4258:2: rule__MapType__Group__8__Impl rule__MapType__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__9();

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
    // $ANTLR end "rule__MapType__Group__8"


    // $ANTLR start "rule__MapType__Group__8__Impl"
    // InternalAvroSchema.g:4265:1: rule__MapType__Group__8__Impl : ( ',' ) ;
    public final void rule__MapType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4269:1: ( ( ',' ) )
            // InternalAvroSchema.g:4270:1: ( ',' )
            {
            // InternalAvroSchema.g:4270:1: ( ',' )
            // InternalAvroSchema.g:4271:2: ','
            {
             before(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__MapType__Group__8__Impl"


    // $ANTLR start "rule__MapType__Group__9"
    // InternalAvroSchema.g:4280:1: rule__MapType__Group__9 : rule__MapType__Group__9__Impl rule__MapType__Group__10 ;
    public final void rule__MapType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4284:1: ( rule__MapType__Group__9__Impl rule__MapType__Group__10 )
            // InternalAvroSchema.g:4285:2: rule__MapType__Group__9__Impl rule__MapType__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__MapType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__10();

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
    // $ANTLR end "rule__MapType__Group__9"


    // $ANTLR start "rule__MapType__Group__9__Impl"
    // InternalAvroSchema.g:4292:1: rule__MapType__Group__9__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4296:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4297:1: ( '\"' )
            {
            // InternalAvroSchema.g:4297:1: ( '\"' )
            // InternalAvroSchema.g:4298:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_9()); 

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
    // $ANTLR end "rule__MapType__Group__9__Impl"


    // $ANTLR start "rule__MapType__Group__10"
    // InternalAvroSchema.g:4307:1: rule__MapType__Group__10 : rule__MapType__Group__10__Impl rule__MapType__Group__11 ;
    public final void rule__MapType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4311:1: ( rule__MapType__Group__10__Impl rule__MapType__Group__11 )
            // InternalAvroSchema.g:4312:2: rule__MapType__Group__10__Impl rule__MapType__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__11();

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
    // $ANTLR end "rule__MapType__Group__10"


    // $ANTLR start "rule__MapType__Group__10__Impl"
    // InternalAvroSchema.g:4319:1: rule__MapType__Group__10__Impl : ( 'items' ) ;
    public final void rule__MapType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4323:1: ( ( 'items' ) )
            // InternalAvroSchema.g:4324:1: ( 'items' )
            {
            // InternalAvroSchema.g:4324:1: ( 'items' )
            // InternalAvroSchema.g:4325:2: 'items'
            {
             before(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getItemsKeyword_10()); 

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
    // $ANTLR end "rule__MapType__Group__10__Impl"


    // $ANTLR start "rule__MapType__Group__11"
    // InternalAvroSchema.g:4334:1: rule__MapType__Group__11 : rule__MapType__Group__11__Impl rule__MapType__Group__12 ;
    public final void rule__MapType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4338:1: ( rule__MapType__Group__11__Impl rule__MapType__Group__12 )
            // InternalAvroSchema.g:4339:2: rule__MapType__Group__11__Impl rule__MapType__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__MapType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__12();

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
    // $ANTLR end "rule__MapType__Group__11"


    // $ANTLR start "rule__MapType__Group__11__Impl"
    // InternalAvroSchema.g:4346:1: rule__MapType__Group__11__Impl : ( '\"' ) ;
    public final void rule__MapType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4350:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4351:1: ( '\"' )
            {
            // InternalAvroSchema.g:4351:1: ( '\"' )
            // InternalAvroSchema.g:4352:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_11()); 

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
    // $ANTLR end "rule__MapType__Group__11__Impl"


    // $ANTLR start "rule__MapType__Group__12"
    // InternalAvroSchema.g:4361:1: rule__MapType__Group__12 : rule__MapType__Group__12__Impl rule__MapType__Group__13 ;
    public final void rule__MapType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4365:1: ( rule__MapType__Group__12__Impl rule__MapType__Group__13 )
            // InternalAvroSchema.g:4366:2: rule__MapType__Group__12__Impl rule__MapType__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__MapType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__13();

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
    // $ANTLR end "rule__MapType__Group__12"


    // $ANTLR start "rule__MapType__Group__12__Impl"
    // InternalAvroSchema.g:4373:1: rule__MapType__Group__12__Impl : ( ':' ) ;
    public final void rule__MapType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4377:1: ( ( ':' ) )
            // InternalAvroSchema.g:4378:1: ( ':' )
            {
            // InternalAvroSchema.g:4378:1: ( ':' )
            // InternalAvroSchema.g:4379:2: ':'
            {
             before(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getColonKeyword_12()); 

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
    // $ANTLR end "rule__MapType__Group__12__Impl"


    // $ANTLR start "rule__MapType__Group__13"
    // InternalAvroSchema.g:4388:1: rule__MapType__Group__13 : rule__MapType__Group__13__Impl rule__MapType__Group__14 ;
    public final void rule__MapType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4392:1: ( rule__MapType__Group__13__Impl rule__MapType__Group__14 )
            // InternalAvroSchema.g:4393:2: rule__MapType__Group__13__Impl rule__MapType__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__MapType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__14();

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
    // $ANTLR end "rule__MapType__Group__13"


    // $ANTLR start "rule__MapType__Group__13__Impl"
    // InternalAvroSchema.g:4400:1: rule__MapType__Group__13__Impl : ( ( rule__MapType__Alternatives_13 ) ) ;
    public final void rule__MapType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4404:1: ( ( ( rule__MapType__Alternatives_13 ) ) )
            // InternalAvroSchema.g:4405:1: ( ( rule__MapType__Alternatives_13 ) )
            {
            // InternalAvroSchema.g:4405:1: ( ( rule__MapType__Alternatives_13 ) )
            // InternalAvroSchema.g:4406:2: ( rule__MapType__Alternatives_13 )
            {
             before(grammarAccess.getMapTypeAccess().getAlternatives_13()); 
            // InternalAvroSchema.g:4407:2: ( rule__MapType__Alternatives_13 )
            // InternalAvroSchema.g:4407:3: rule__MapType__Alternatives_13
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Alternatives_13();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getAlternatives_13()); 

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
    // $ANTLR end "rule__MapType__Group__13__Impl"


    // $ANTLR start "rule__MapType__Group__14"
    // InternalAvroSchema.g:4415:1: rule__MapType__Group__14 : rule__MapType__Group__14__Impl ;
    public final void rule__MapType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4419:1: ( rule__MapType__Group__14__Impl )
            // InternalAvroSchema.g:4420:2: rule__MapType__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group__14__Impl();

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
    // $ANTLR end "rule__MapType__Group__14"


    // $ANTLR start "rule__MapType__Group__14__Impl"
    // InternalAvroSchema.g:4426:1: rule__MapType__Group__14__Impl : ( '}' ) ;
    public final void rule__MapType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4430:1: ( ( '}' ) )
            // InternalAvroSchema.g:4431:1: ( '}' )
            {
            // InternalAvroSchema.g:4431:1: ( '}' )
            // InternalAvroSchema.g:4432:2: '}'
            {
             before(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__MapType__Group__14__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__0"
    // InternalAvroSchema.g:4442:1: rule__MapType__Group_13_2__0 : rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 ;
    public final void rule__MapType__Group_13_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4446:1: ( rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1 )
            // InternalAvroSchema.g:4447:2: rule__MapType__Group_13_2__0__Impl rule__MapType__Group_13_2__1
            {
            pushFollow(FOLLOW_6);
            rule__MapType__Group_13_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group_13_2__1();

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
    // $ANTLR end "rule__MapType__Group_13_2__0"


    // $ANTLR start "rule__MapType__Group_13_2__0__Impl"
    // InternalAvroSchema.g:4454:1: rule__MapType__Group_13_2__0__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4458:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4459:1: ( '\"' )
            {
            // InternalAvroSchema.g:4459:1: ( '\"' )
            // InternalAvroSchema.g:4460:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_0()); 

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
    // $ANTLR end "rule__MapType__Group_13_2__0__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__1"
    // InternalAvroSchema.g:4469:1: rule__MapType__Group_13_2__1 : rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 ;
    public final void rule__MapType__Group_13_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4473:1: ( rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2 )
            // InternalAvroSchema.g:4474:2: rule__MapType__Group_13_2__1__Impl rule__MapType__Group_13_2__2
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group_13_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group_13_2__2();

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
    // $ANTLR end "rule__MapType__Group_13_2__1"


    // $ANTLR start "rule__MapType__Group_13_2__1__Impl"
    // InternalAvroSchema.g:4481:1: rule__MapType__Group_13_2__1__Impl : ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) ;
    public final void rule__MapType__Group_13_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4485:1: ( ( ( rule__MapType__RecordRefAssignment_13_2_1 ) ) )
            // InternalAvroSchema.g:4486:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            {
            // InternalAvroSchema.g:4486:1: ( ( rule__MapType__RecordRefAssignment_13_2_1 ) )
            // InternalAvroSchema.g:4487:2: ( rule__MapType__RecordRefAssignment_13_2_1 )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 
            // InternalAvroSchema.g:4488:2: ( rule__MapType__RecordRefAssignment_13_2_1 )
            // InternalAvroSchema.g:4488:3: rule__MapType__RecordRefAssignment_13_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MapType__RecordRefAssignment_13_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getRecordRefAssignment_13_2_1()); 

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
    // $ANTLR end "rule__MapType__Group_13_2__1__Impl"


    // $ANTLR start "rule__MapType__Group_13_2__2"
    // InternalAvroSchema.g:4496:1: rule__MapType__Group_13_2__2 : rule__MapType__Group_13_2__2__Impl ;
    public final void rule__MapType__Group_13_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4500:1: ( rule__MapType__Group_13_2__2__Impl )
            // InternalAvroSchema.g:4501:2: rule__MapType__Group_13_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group_13_2__2__Impl();

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
    // $ANTLR end "rule__MapType__Group_13_2__2"


    // $ANTLR start "rule__MapType__Group_13_2__2__Impl"
    // InternalAvroSchema.g:4507:1: rule__MapType__Group_13_2__2__Impl : ( '\"' ) ;
    public final void rule__MapType__Group_13_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4511:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4512:1: ( '\"' )
            {
            // InternalAvroSchema.g:4512:1: ( '\"' )
            // InternalAvroSchema.g:4513:2: '\"'
            {
             before(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getQuotationMarkKeyword_13_2_2()); 

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
    // $ANTLR end "rule__MapType__Group_13_2__2__Impl"


    // $ANTLR start "rule__FixedType__Group__0"
    // InternalAvroSchema.g:4523:1: rule__FixedType__Group__0 : rule__FixedType__Group__0__Impl rule__FixedType__Group__1 ;
    public final void rule__FixedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4527:1: ( rule__FixedType__Group__0__Impl rule__FixedType__Group__1 )
            // InternalAvroSchema.g:4528:2: rule__FixedType__Group__0__Impl rule__FixedType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__FixedType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__1();

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
    // $ANTLR end "rule__FixedType__Group__0"


    // $ANTLR start "rule__FixedType__Group__0__Impl"
    // InternalAvroSchema.g:4535:1: rule__FixedType__Group__0__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4539:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4540:1: ( '\"' )
            {
            // InternalAvroSchema.g:4540:1: ( '\"' )
            // InternalAvroSchema.g:4541:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_0()); 

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
    // $ANTLR end "rule__FixedType__Group__0__Impl"


    // $ANTLR start "rule__FixedType__Group__1"
    // InternalAvroSchema.g:4550:1: rule__FixedType__Group__1 : rule__FixedType__Group__1__Impl rule__FixedType__Group__2 ;
    public final void rule__FixedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4554:1: ( rule__FixedType__Group__1__Impl rule__FixedType__Group__2 )
            // InternalAvroSchema.g:4555:2: rule__FixedType__Group__1__Impl rule__FixedType__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__2();

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
    // $ANTLR end "rule__FixedType__Group__1"


    // $ANTLR start "rule__FixedType__Group__1__Impl"
    // InternalAvroSchema.g:4562:1: rule__FixedType__Group__1__Impl : ( 'fixed' ) ;
    public final void rule__FixedType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4566:1: ( ( 'fixed' ) )
            // InternalAvroSchema.g:4567:1: ( 'fixed' )
            {
            // InternalAvroSchema.g:4567:1: ( 'fixed' )
            // InternalAvroSchema.g:4568:2: 'fixed'
            {
             before(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getFixedKeyword_1()); 

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
    // $ANTLR end "rule__FixedType__Group__1__Impl"


    // $ANTLR start "rule__FixedType__Group__2"
    // InternalAvroSchema.g:4577:1: rule__FixedType__Group__2 : rule__FixedType__Group__2__Impl rule__FixedType__Group__3 ;
    public final void rule__FixedType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4581:1: ( rule__FixedType__Group__2__Impl rule__FixedType__Group__3 )
            // InternalAvroSchema.g:4582:2: rule__FixedType__Group__2__Impl rule__FixedType__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__FixedType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__3();

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
    // $ANTLR end "rule__FixedType__Group__2"


    // $ANTLR start "rule__FixedType__Group__2__Impl"
    // InternalAvroSchema.g:4589:1: rule__FixedType__Group__2__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4593:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4594:1: ( '\"' )
            {
            // InternalAvroSchema.g:4594:1: ( '\"' )
            // InternalAvroSchema.g:4595:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_2()); 

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
    // $ANTLR end "rule__FixedType__Group__2__Impl"


    // $ANTLR start "rule__FixedType__Group__3"
    // InternalAvroSchema.g:4604:1: rule__FixedType__Group__3 : rule__FixedType__Group__3__Impl rule__FixedType__Group__4 ;
    public final void rule__FixedType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4608:1: ( rule__FixedType__Group__3__Impl rule__FixedType__Group__4 )
            // InternalAvroSchema.g:4609:2: rule__FixedType__Group__3__Impl rule__FixedType__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__4();

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
    // $ANTLR end "rule__FixedType__Group__3"


    // $ANTLR start "rule__FixedType__Group__3__Impl"
    // InternalAvroSchema.g:4616:1: rule__FixedType__Group__3__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4620:1: ( ( ',' ) )
            // InternalAvroSchema.g:4621:1: ( ',' )
            {
            // InternalAvroSchema.g:4621:1: ( ',' )
            // InternalAvroSchema.g:4622:2: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__FixedType__Group__3__Impl"


    // $ANTLR start "rule__FixedType__Group__4"
    // InternalAvroSchema.g:4631:1: rule__FixedType__Group__4 : rule__FixedType__Group__4__Impl rule__FixedType__Group__5 ;
    public final void rule__FixedType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4635:1: ( rule__FixedType__Group__4__Impl rule__FixedType__Group__5 )
            // InternalAvroSchema.g:4636:2: rule__FixedType__Group__4__Impl rule__FixedType__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__FixedType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__5();

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
    // $ANTLR end "rule__FixedType__Group__4"


    // $ANTLR start "rule__FixedType__Group__4__Impl"
    // InternalAvroSchema.g:4643:1: rule__FixedType__Group__4__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4647:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4648:1: ( '\"' )
            {
            // InternalAvroSchema.g:4648:1: ( '\"' )
            // InternalAvroSchema.g:4649:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_4()); 

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
    // $ANTLR end "rule__FixedType__Group__4__Impl"


    // $ANTLR start "rule__FixedType__Group__5"
    // InternalAvroSchema.g:4658:1: rule__FixedType__Group__5 : rule__FixedType__Group__5__Impl rule__FixedType__Group__6 ;
    public final void rule__FixedType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4662:1: ( rule__FixedType__Group__5__Impl rule__FixedType__Group__6 )
            // InternalAvroSchema.g:4663:2: rule__FixedType__Group__5__Impl rule__FixedType__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__6();

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
    // $ANTLR end "rule__FixedType__Group__5"


    // $ANTLR start "rule__FixedType__Group__5__Impl"
    // InternalAvroSchema.g:4670:1: rule__FixedType__Group__5__Impl : ( 'name' ) ;
    public final void rule__FixedType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4674:1: ( ( 'name' ) )
            // InternalAvroSchema.g:4675:1: ( 'name' )
            {
            // InternalAvroSchema.g:4675:1: ( 'name' )
            // InternalAvroSchema.g:4676:2: 'name'
            {
             before(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getNameKeyword_5()); 

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
    // $ANTLR end "rule__FixedType__Group__5__Impl"


    // $ANTLR start "rule__FixedType__Group__6"
    // InternalAvroSchema.g:4685:1: rule__FixedType__Group__6 : rule__FixedType__Group__6__Impl rule__FixedType__Group__7 ;
    public final void rule__FixedType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4689:1: ( rule__FixedType__Group__6__Impl rule__FixedType__Group__7 )
            // InternalAvroSchema.g:4690:2: rule__FixedType__Group__6__Impl rule__FixedType__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__FixedType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__7();

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
    // $ANTLR end "rule__FixedType__Group__6"


    // $ANTLR start "rule__FixedType__Group__6__Impl"
    // InternalAvroSchema.g:4697:1: rule__FixedType__Group__6__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4701:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4702:1: ( '\"' )
            {
            // InternalAvroSchema.g:4702:1: ( '\"' )
            // InternalAvroSchema.g:4703:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_6()); 

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
    // $ANTLR end "rule__FixedType__Group__6__Impl"


    // $ANTLR start "rule__FixedType__Group__7"
    // InternalAvroSchema.g:4712:1: rule__FixedType__Group__7 : rule__FixedType__Group__7__Impl rule__FixedType__Group__8 ;
    public final void rule__FixedType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4716:1: ( rule__FixedType__Group__7__Impl rule__FixedType__Group__8 )
            // InternalAvroSchema.g:4717:2: rule__FixedType__Group__7__Impl rule__FixedType__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__8();

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
    // $ANTLR end "rule__FixedType__Group__7"


    // $ANTLR start "rule__FixedType__Group__7__Impl"
    // InternalAvroSchema.g:4724:1: rule__FixedType__Group__7__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4728:1: ( ( ':' ) )
            // InternalAvroSchema.g:4729:1: ( ':' )
            {
            // InternalAvroSchema.g:4729:1: ( ':' )
            // InternalAvroSchema.g:4730:2: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__FixedType__Group__7__Impl"


    // $ANTLR start "rule__FixedType__Group__8"
    // InternalAvroSchema.g:4739:1: rule__FixedType__Group__8 : rule__FixedType__Group__8__Impl rule__FixedType__Group__9 ;
    public final void rule__FixedType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4743:1: ( rule__FixedType__Group__8__Impl rule__FixedType__Group__9 )
            // InternalAvroSchema.g:4744:2: rule__FixedType__Group__8__Impl rule__FixedType__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__FixedType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__9();

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
    // $ANTLR end "rule__FixedType__Group__8"


    // $ANTLR start "rule__FixedType__Group__8__Impl"
    // InternalAvroSchema.g:4751:1: rule__FixedType__Group__8__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4755:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4756:1: ( '\"' )
            {
            // InternalAvroSchema.g:4756:1: ( '\"' )
            // InternalAvroSchema.g:4757:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_8()); 

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
    // $ANTLR end "rule__FixedType__Group__8__Impl"


    // $ANTLR start "rule__FixedType__Group__9"
    // InternalAvroSchema.g:4766:1: rule__FixedType__Group__9 : rule__FixedType__Group__9__Impl rule__FixedType__Group__10 ;
    public final void rule__FixedType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4770:1: ( rule__FixedType__Group__9__Impl rule__FixedType__Group__10 )
            // InternalAvroSchema.g:4771:2: rule__FixedType__Group__9__Impl rule__FixedType__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__10();

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
    // $ANTLR end "rule__FixedType__Group__9"


    // $ANTLR start "rule__FixedType__Group__9__Impl"
    // InternalAvroSchema.g:4778:1: rule__FixedType__Group__9__Impl : ( ( rule__FixedType__NameAssignment_9 ) ) ;
    public final void rule__FixedType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4782:1: ( ( ( rule__FixedType__NameAssignment_9 ) ) )
            // InternalAvroSchema.g:4783:1: ( ( rule__FixedType__NameAssignment_9 ) )
            {
            // InternalAvroSchema.g:4783:1: ( ( rule__FixedType__NameAssignment_9 ) )
            // InternalAvroSchema.g:4784:2: ( rule__FixedType__NameAssignment_9 )
            {
             before(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 
            // InternalAvroSchema.g:4785:2: ( rule__FixedType__NameAssignment_9 )
            // InternalAvroSchema.g:4785:3: rule__FixedType__NameAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FixedType__NameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getNameAssignment_9()); 

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
    // $ANTLR end "rule__FixedType__Group__9__Impl"


    // $ANTLR start "rule__FixedType__Group__10"
    // InternalAvroSchema.g:4793:1: rule__FixedType__Group__10 : rule__FixedType__Group__10__Impl rule__FixedType__Group__11 ;
    public final void rule__FixedType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4797:1: ( rule__FixedType__Group__10__Impl rule__FixedType__Group__11 )
            // InternalAvroSchema.g:4798:2: rule__FixedType__Group__10__Impl rule__FixedType__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__FixedType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__11();

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
    // $ANTLR end "rule__FixedType__Group__10"


    // $ANTLR start "rule__FixedType__Group__10__Impl"
    // InternalAvroSchema.g:4805:1: rule__FixedType__Group__10__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4809:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4810:1: ( '\"' )
            {
            // InternalAvroSchema.g:4810:1: ( '\"' )
            // InternalAvroSchema.g:4811:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_10()); 

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
    // $ANTLR end "rule__FixedType__Group__10__Impl"


    // $ANTLR start "rule__FixedType__Group__11"
    // InternalAvroSchema.g:4820:1: rule__FixedType__Group__11 : rule__FixedType__Group__11__Impl rule__FixedType__Group__12 ;
    public final void rule__FixedType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4824:1: ( rule__FixedType__Group__11__Impl rule__FixedType__Group__12 )
            // InternalAvroSchema.g:4825:2: rule__FixedType__Group__11__Impl rule__FixedType__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__12();

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
    // $ANTLR end "rule__FixedType__Group__11"


    // $ANTLR start "rule__FixedType__Group__11__Impl"
    // InternalAvroSchema.g:4832:1: rule__FixedType__Group__11__Impl : ( ',' ) ;
    public final void rule__FixedType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4836:1: ( ( ',' ) )
            // InternalAvroSchema.g:4837:1: ( ',' )
            {
            // InternalAvroSchema.g:4837:1: ( ',' )
            // InternalAvroSchema.g:4838:2: ','
            {
             before(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getCommaKeyword_11()); 

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
    // $ANTLR end "rule__FixedType__Group__11__Impl"


    // $ANTLR start "rule__FixedType__Group__12"
    // InternalAvroSchema.g:4847:1: rule__FixedType__Group__12 : rule__FixedType__Group__12__Impl rule__FixedType__Group__13 ;
    public final void rule__FixedType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4851:1: ( rule__FixedType__Group__12__Impl rule__FixedType__Group__13 )
            // InternalAvroSchema.g:4852:2: rule__FixedType__Group__12__Impl rule__FixedType__Group__13
            {
            pushFollow(FOLLOW_27);
            rule__FixedType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__13();

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
    // $ANTLR end "rule__FixedType__Group__12"


    // $ANTLR start "rule__FixedType__Group__12__Impl"
    // InternalAvroSchema.g:4859:1: rule__FixedType__Group__12__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4863:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4864:1: ( '\"' )
            {
            // InternalAvroSchema.g:4864:1: ( '\"' )
            // InternalAvroSchema.g:4865:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_12()); 

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
    // $ANTLR end "rule__FixedType__Group__12__Impl"


    // $ANTLR start "rule__FixedType__Group__13"
    // InternalAvroSchema.g:4874:1: rule__FixedType__Group__13 : rule__FixedType__Group__13__Impl rule__FixedType__Group__14 ;
    public final void rule__FixedType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4878:1: ( rule__FixedType__Group__13__Impl rule__FixedType__Group__14 )
            // InternalAvroSchema.g:4879:2: rule__FixedType__Group__13__Impl rule__FixedType__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__14();

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
    // $ANTLR end "rule__FixedType__Group__13"


    // $ANTLR start "rule__FixedType__Group__13__Impl"
    // InternalAvroSchema.g:4886:1: rule__FixedType__Group__13__Impl : ( 'size' ) ;
    public final void rule__FixedType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4890:1: ( ( 'size' ) )
            // InternalAvroSchema.g:4891:1: ( 'size' )
            {
            // InternalAvroSchema.g:4891:1: ( 'size' )
            // InternalAvroSchema.g:4892:2: 'size'
            {
             before(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getSizeKeyword_13()); 

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
    // $ANTLR end "rule__FixedType__Group__13__Impl"


    // $ANTLR start "rule__FixedType__Group__14"
    // InternalAvroSchema.g:4901:1: rule__FixedType__Group__14 : rule__FixedType__Group__14__Impl rule__FixedType__Group__15 ;
    public final void rule__FixedType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4905:1: ( rule__FixedType__Group__14__Impl rule__FixedType__Group__15 )
            // InternalAvroSchema.g:4906:2: rule__FixedType__Group__14__Impl rule__FixedType__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__FixedType__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__15();

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
    // $ANTLR end "rule__FixedType__Group__14"


    // $ANTLR start "rule__FixedType__Group__14__Impl"
    // InternalAvroSchema.g:4913:1: rule__FixedType__Group__14__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4917:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4918:1: ( '\"' )
            {
            // InternalAvroSchema.g:4918:1: ( '\"' )
            // InternalAvroSchema.g:4919:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_14()); 

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
    // $ANTLR end "rule__FixedType__Group__14__Impl"


    // $ANTLR start "rule__FixedType__Group__15"
    // InternalAvroSchema.g:4928:1: rule__FixedType__Group__15 : rule__FixedType__Group__15__Impl rule__FixedType__Group__16 ;
    public final void rule__FixedType__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4932:1: ( rule__FixedType__Group__15__Impl rule__FixedType__Group__16 )
            // InternalAvroSchema.g:4933:2: rule__FixedType__Group__15__Impl rule__FixedType__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__16();

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
    // $ANTLR end "rule__FixedType__Group__15"


    // $ANTLR start "rule__FixedType__Group__15__Impl"
    // InternalAvroSchema.g:4940:1: rule__FixedType__Group__15__Impl : ( ':' ) ;
    public final void rule__FixedType__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4944:1: ( ( ':' ) )
            // InternalAvroSchema.g:4945:1: ( ':' )
            {
            // InternalAvroSchema.g:4945:1: ( ':' )
            // InternalAvroSchema.g:4946:2: ':'
            {
             before(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getColonKeyword_15()); 

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
    // $ANTLR end "rule__FixedType__Group__15__Impl"


    // $ANTLR start "rule__FixedType__Group__16"
    // InternalAvroSchema.g:4955:1: rule__FixedType__Group__16 : rule__FixedType__Group__16__Impl rule__FixedType__Group__17 ;
    public final void rule__FixedType__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4959:1: ( rule__FixedType__Group__16__Impl rule__FixedType__Group__17 )
            // InternalAvroSchema.g:4960:2: rule__FixedType__Group__16__Impl rule__FixedType__Group__17
            {
            pushFollow(FOLLOW_28);
            rule__FixedType__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__17();

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
    // $ANTLR end "rule__FixedType__Group__16"


    // $ANTLR start "rule__FixedType__Group__16__Impl"
    // InternalAvroSchema.g:4967:1: rule__FixedType__Group__16__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4971:1: ( ( '\"' ) )
            // InternalAvroSchema.g:4972:1: ( '\"' )
            {
            // InternalAvroSchema.g:4972:1: ( '\"' )
            // InternalAvroSchema.g:4973:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_16()); 

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
    // $ANTLR end "rule__FixedType__Group__16__Impl"


    // $ANTLR start "rule__FixedType__Group__17"
    // InternalAvroSchema.g:4982:1: rule__FixedType__Group__17 : rule__FixedType__Group__17__Impl rule__FixedType__Group__18 ;
    public final void rule__FixedType__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4986:1: ( rule__FixedType__Group__17__Impl rule__FixedType__Group__18 )
            // InternalAvroSchema.g:4987:2: rule__FixedType__Group__17__Impl rule__FixedType__Group__18
            {
            pushFollow(FOLLOW_7);
            rule__FixedType__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FixedType__Group__18();

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
    // $ANTLR end "rule__FixedType__Group__17"


    // $ANTLR start "rule__FixedType__Group__17__Impl"
    // InternalAvroSchema.g:4994:1: rule__FixedType__Group__17__Impl : ( ( rule__FixedType__SizeAssignment_17 ) ) ;
    public final void rule__FixedType__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:4998:1: ( ( ( rule__FixedType__SizeAssignment_17 ) ) )
            // InternalAvroSchema.g:4999:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            {
            // InternalAvroSchema.g:4999:1: ( ( rule__FixedType__SizeAssignment_17 ) )
            // InternalAvroSchema.g:5000:2: ( rule__FixedType__SizeAssignment_17 )
            {
             before(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 
            // InternalAvroSchema.g:5001:2: ( rule__FixedType__SizeAssignment_17 )
            // InternalAvroSchema.g:5001:3: rule__FixedType__SizeAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__FixedType__SizeAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getFixedTypeAccess().getSizeAssignment_17()); 

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
    // $ANTLR end "rule__FixedType__Group__17__Impl"


    // $ANTLR start "rule__FixedType__Group__18"
    // InternalAvroSchema.g:5009:1: rule__FixedType__Group__18 : rule__FixedType__Group__18__Impl ;
    public final void rule__FixedType__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5013:1: ( rule__FixedType__Group__18__Impl )
            // InternalAvroSchema.g:5014:2: rule__FixedType__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FixedType__Group__18__Impl();

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
    // $ANTLR end "rule__FixedType__Group__18"


    // $ANTLR start "rule__FixedType__Group__18__Impl"
    // InternalAvroSchema.g:5020:1: rule__FixedType__Group__18__Impl : ( '\"' ) ;
    public final void rule__FixedType__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5024:1: ( ( '\"' ) )
            // InternalAvroSchema.g:5025:1: ( '\"' )
            {
            // InternalAvroSchema.g:5025:1: ( '\"' )
            // InternalAvroSchema.g:5026:2: '\"'
            {
             before(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getQuotationMarkKeyword_18()); 

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
    // $ANTLR end "rule__FixedType__Group__18__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // InternalAvroSchema.g:5036:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5040:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // InternalAvroSchema.g:5041:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group__1();

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
    // $ANTLR end "rule__Primitive__Group__0"


    // $ANTLR start "rule__Primitive__Group__0__Impl"
    // InternalAvroSchema.g:5048:1: rule__Primitive__Group__0__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5052:1: ( ( '\"' ) )
            // InternalAvroSchema.g:5053:1: ( '\"' )
            {
            // InternalAvroSchema.g:5053:1: ( '\"' )
            // InternalAvroSchema.g:5054:2: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_0()); 

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
    // $ANTLR end "rule__Primitive__Group__0__Impl"


    // $ANTLR start "rule__Primitive__Group__1"
    // InternalAvroSchema.g:5063:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5067:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // InternalAvroSchema.g:5068:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group__2();

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
    // $ANTLR end "rule__Primitive__Group__1"


    // $ANTLR start "rule__Primitive__Group__1__Impl"
    // InternalAvroSchema.g:5075:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__TypeAssignment_1 ) ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5079:1: ( ( ( rule__Primitive__TypeAssignment_1 ) ) )
            // InternalAvroSchema.g:5080:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            {
            // InternalAvroSchema.g:5080:1: ( ( rule__Primitive__TypeAssignment_1 ) )
            // InternalAvroSchema.g:5081:2: ( rule__Primitive__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 
            // InternalAvroSchema.g:5082:2: ( rule__Primitive__TypeAssignment_1 )
            // InternalAvroSchema.g:5082:3: rule__Primitive__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Primitive__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__2"
    // InternalAvroSchema.g:5090:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5094:1: ( rule__Primitive__Group__2__Impl )
            // InternalAvroSchema.g:5095:2: rule__Primitive__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group__2__Impl();

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
    // $ANTLR end "rule__Primitive__Group__2"


    // $ANTLR start "rule__Primitive__Group__2__Impl"
    // InternalAvroSchema.g:5101:1: rule__Primitive__Group__2__Impl : ( '\"' ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5105:1: ( ( '\"' ) )
            // InternalAvroSchema.g:5106:1: ( '\"' )
            {
            // InternalAvroSchema.g:5106:1: ( '\"' )
            // InternalAvroSchema.g:5107:2: '\"'
            {
             before(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getQuotationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Primitive__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalAvroSchema.g:5117:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5121:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalAvroSchema.g:5122:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1();

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
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // InternalAvroSchema.g:5129:1: rule__Namespace__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5133:1: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5134:1: ( RULE_ID )
            {
            // InternalAvroSchema.g:5134:1: ( RULE_ID )
            // InternalAvroSchema.g:5135:2: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // InternalAvroSchema.g:5144:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5148:1: ( rule__Namespace__Group__1__Impl )
            // InternalAvroSchema.g:5149:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1__Impl();

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
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // InternalAvroSchema.g:5155:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__Group_1__0 )* ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5159:1: ( ( ( rule__Namespace__Group_1__0 )* ) )
            // InternalAvroSchema.g:5160:1: ( ( rule__Namespace__Group_1__0 )* )
            {
            // InternalAvroSchema.g:5160:1: ( ( rule__Namespace__Group_1__0 )* )
            // InternalAvroSchema.g:5161:2: ( rule__Namespace__Group_1__0 )*
            {
             before(grammarAccess.getNamespaceAccess().getGroup_1()); 
            // InternalAvroSchema.g:5162:2: ( rule__Namespace__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAvroSchema.g:5162:3: rule__Namespace__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Namespace__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group_1__0"
    // InternalAvroSchema.g:5171:1: rule__Namespace__Group_1__0 : rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 ;
    public final void rule__Namespace__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5175:1: ( rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1 )
            // InternalAvroSchema.g:5176:2: rule__Namespace__Group_1__0__Impl rule__Namespace__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Namespace__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group_1__1();

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
    // $ANTLR end "rule__Namespace__Group_1__0"


    // $ANTLR start "rule__Namespace__Group_1__0__Impl"
    // InternalAvroSchema.g:5183:1: rule__Namespace__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Namespace__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5187:1: ( ( '.' ) )
            // InternalAvroSchema.g:5188:1: ( '.' )
            {
            // InternalAvroSchema.g:5188:1: ( '.' )
            // InternalAvroSchema.g:5189:2: '.'
            {
             before(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Namespace__Group_1__0__Impl"


    // $ANTLR start "rule__Namespace__Group_1__1"
    // InternalAvroSchema.g:5198:1: rule__Namespace__Group_1__1 : rule__Namespace__Group_1__1__Impl ;
    public final void rule__Namespace__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5202:1: ( rule__Namespace__Group_1__1__Impl )
            // InternalAvroSchema.g:5203:2: rule__Namespace__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group_1__1__Impl();

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
    // $ANTLR end "rule__Namespace__Group_1__1"


    // $ANTLR start "rule__Namespace__Group_1__1__Impl"
    // InternalAvroSchema.g:5209:1: rule__Namespace__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5213:1: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5214:1: ( RULE_ID )
            {
            // InternalAvroSchema.g:5214:1: ( RULE_ID )
            // InternalAvroSchema.g:5215:2: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Namespace__Group_1__1__Impl"


    // $ANTLR start "rule__AvroSchema__TypesAssignment"
    // InternalAvroSchema.g:5225:1: rule__AvroSchema__TypesAssignment : ( ( rule__AvroSchema__TypesAlternatives_0 ) ) ;
    public final void rule__AvroSchema__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5229:1: ( ( ( rule__AvroSchema__TypesAlternatives_0 ) ) )
            // InternalAvroSchema.g:5230:2: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            {
            // InternalAvroSchema.g:5230:2: ( ( rule__AvroSchema__TypesAlternatives_0 ) )
            // InternalAvroSchema.g:5231:3: ( rule__AvroSchema__TypesAlternatives_0 )
            {
             before(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 
            // InternalAvroSchema.g:5232:3: ( rule__AvroSchema__TypesAlternatives_0 )
            // InternalAvroSchema.g:5232:4: rule__AvroSchema__TypesAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AvroSchema__TypesAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAvroSchemaAccess().getTypesAlternatives_0()); 

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
    // $ANTLR end "rule__AvroSchema__TypesAssignment"


    // $ANTLR start "rule__UnionType__TypesAssignment_1"
    // InternalAvroSchema.g:5240:1: rule__UnionType__TypesAssignment_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5244:1: ( ( ruleUnionMember ) )
            // InternalAvroSchema.g:5245:2: ( ruleUnionMember )
            {
            // InternalAvroSchema.g:5245:2: ( ruleUnionMember )
            // InternalAvroSchema.g:5246:3: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnionType__TypesAssignment_1"


    // $ANTLR start "rule__UnionType__TypesAssignment_2_1"
    // InternalAvroSchema.g:5255:1: rule__UnionType__TypesAssignment_2_1 : ( ruleUnionMember ) ;
    public final void rule__UnionType__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5259:1: ( ( ruleUnionMember ) )
            // InternalAvroSchema.g:5260:2: ( ruleUnionMember )
            {
            // InternalAvroSchema.g:5260:2: ( ruleUnionMember )
            // InternalAvroSchema.g:5261:3: ruleUnionMember
            {
             before(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionMember();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesUnionMemberParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__UnionType__TypesAssignment_2_1"


    // $ANTLR start "rule__UnionMember__RecordRefAssignment_6_1"
    // InternalAvroSchema.g:5270:1: rule__UnionMember__RecordRefAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__UnionMember__RecordRefAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5274:1: ( ( ( RULE_ID ) ) )
            // InternalAvroSchema.g:5275:2: ( ( RULE_ID ) )
            {
            // InternalAvroSchema.g:5275:2: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5276:3: ( RULE_ID )
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefRecordCrossReference_6_1_0()); 
            // InternalAvroSchema.g:5277:3: ( RULE_ID )
            // InternalAvroSchema.g:5278:4: RULE_ID
            {
             before(grammarAccess.getUnionMemberAccess().getRecordRefRecordIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUnionMemberAccess().getRecordRefRecordIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getUnionMemberAccess().getRecordRefRecordCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__UnionMember__RecordRefAssignment_6_1"


    // $ANTLR start "rule__JsonType__TypeAssignment_6"
    // InternalAvroSchema.g:5289:1: rule__JsonType__TypeAssignment_6 : ( rulePrimitive ) ;
    public final void rule__JsonType__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5293:1: ( ( rulePrimitive ) )
            // InternalAvroSchema.g:5294:2: ( rulePrimitive )
            {
            // InternalAvroSchema.g:5294:2: ( rulePrimitive )
            // InternalAvroSchema.g:5295:3: rulePrimitive
            {
             before(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getJsonTypeAccess().getTypePrimitiveParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__JsonType__TypeAssignment_6"


    // $ANTLR start "rule__RecordType__NameAssignment_14"
    // InternalAvroSchema.g:5304:1: rule__RecordType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5308:1: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5309:2: ( RULE_ID )
            {
            // InternalAvroSchema.g:5309:2: ( RULE_ID )
            // InternalAvroSchema.g:5310:3: RULE_ID
            {
             before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__RecordType__NameAssignment_14"


    // $ANTLR start "rule__RecordType__NamespaceAssignment_16_6"
    // InternalAvroSchema.g:5319:1: rule__RecordType__NamespaceAssignment_16_6 : ( ruleNamespace ) ;
    public final void rule__RecordType__NamespaceAssignment_16_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5323:1: ( ( ruleNamespace ) )
            // InternalAvroSchema.g:5324:2: ( ruleNamespace )
            {
            // InternalAvroSchema.g:5324:2: ( ruleNamespace )
            // InternalAvroSchema.g:5325:3: ruleNamespace
            {
             before(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getNamespaceNamespaceParserRuleCall_16_6_0()); 

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
    // $ANTLR end "rule__RecordType__NamespaceAssignment_16_6"


    // $ANTLR start "rule__RecordType__FieldListAssignment_23"
    // InternalAvroSchema.g:5334:1: rule__RecordType__FieldListAssignment_23 : ( ruleFieldList ) ;
    public final void rule__RecordType__FieldListAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5338:1: ( ( ruleFieldList ) )
            // InternalAvroSchema.g:5339:2: ( ruleFieldList )
            {
            // InternalAvroSchema.g:5339:2: ( ruleFieldList )
            // InternalAvroSchema.g:5340:3: ruleFieldList
            {
             before(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_23_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldList();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getFieldListFieldListParserRuleCall_23_0()); 

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
    // $ANTLR end "rule__RecordType__FieldListAssignment_23"


    // $ANTLR start "rule__FieldList__FieldsAssignment_0"
    // InternalAvroSchema.g:5349:1: rule__FieldList__FieldsAssignment_0 : ( ruleField ) ;
    public final void rule__FieldList__FieldsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5353:1: ( ( ruleField ) )
            // InternalAvroSchema.g:5354:2: ( ruleField )
            {
            // InternalAvroSchema.g:5354:2: ( ruleField )
            // InternalAvroSchema.g:5355:3: ruleField
            {
             before(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FieldList__FieldsAssignment_0"


    // $ANTLR start "rule__FieldList__FieldsAssignment_1_1"
    // InternalAvroSchema.g:5364:1: rule__FieldList__FieldsAssignment_1_1 : ( ruleField ) ;
    public final void rule__FieldList__FieldsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5368:1: ( ( ruleField ) )
            // InternalAvroSchema.g:5369:2: ( ruleField )
            {
            // InternalAvroSchema.g:5369:2: ( ruleField )
            // InternalAvroSchema.g:5370:3: ruleField
            {
             before(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldListAccess().getFieldsFieldParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FieldList__FieldsAssignment_1_1"


    // $ANTLR start "rule__Field__NameAssignment_6"
    // InternalAvroSchema.g:5379:1: rule__Field__NameAssignment_6 : ( ( rule__Field__NameAlternatives_6_0 ) ) ;
    public final void rule__Field__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5383:1: ( ( ( rule__Field__NameAlternatives_6_0 ) ) )
            // InternalAvroSchema.g:5384:2: ( ( rule__Field__NameAlternatives_6_0 ) )
            {
            // InternalAvroSchema.g:5384:2: ( ( rule__Field__NameAlternatives_6_0 ) )
            // InternalAvroSchema.g:5385:3: ( rule__Field__NameAlternatives_6_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 
            // InternalAvroSchema.g:5386:3: ( rule__Field__NameAlternatives_6_0 )
            // InternalAvroSchema.g:5386:4: rule__Field__NameAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAlternatives_6_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_6"


    // $ANTLR start "rule__Field__PrimitiveAssignment_13_0"
    // InternalAvroSchema.g:5394:1: rule__Field__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__Field__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5398:1: ( ( rulePrimitive ) )
            // InternalAvroSchema.g:5399:2: ( rulePrimitive )
            {
            // InternalAvroSchema.g:5399:2: ( rulePrimitive )
            // InternalAvroSchema.g:5400:3: rulePrimitive
            {
             before(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

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
    // $ANTLR end "rule__Field__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__Field__RecordAssignment_13_1"
    // InternalAvroSchema.g:5409:1: rule__Field__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__Field__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5413:1: ( ( ruleRecordType ) )
            // InternalAvroSchema.g:5414:2: ( ruleRecordType )
            {
            // InternalAvroSchema.g:5414:2: ( ruleRecordType )
            // InternalAvroSchema.g:5415:3: ruleRecordType
            {
             before(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Field__RecordAssignment_13_1"


    // $ANTLR start "rule__Field__RecordRefAssignment_13_2_1"
    // InternalAvroSchema.g:5424:1: rule__Field__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5428:1: ( ( ( RULE_ID ) ) )
            // InternalAvroSchema.g:5429:2: ( ( RULE_ID ) )
            {
            // InternalAvroSchema.g:5429:2: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5430:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
            // InternalAvroSchema.g:5431:3: ( RULE_ID )
            // InternalAvroSchema.g:5432:4: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getRecordRefRecordCrossReference_13_2_1_0()); 

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
    // $ANTLR end "rule__Field__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__Field__EtypeAssignment_13_3"
    // InternalAvroSchema.g:5443:1: rule__Field__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__Field__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5447:1: ( ( ruleEnumType ) )
            // InternalAvroSchema.g:5448:2: ( ruleEnumType )
            {
            // InternalAvroSchema.g:5448:2: ( ruleEnumType )
            // InternalAvroSchema.g:5449:3: ruleEnumType
            {
             before(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

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
    // $ANTLR end "rule__Field__EtypeAssignment_13_3"


    // $ANTLR start "rule__Field__ArrayAssignment_13_4"
    // InternalAvroSchema.g:5458:1: rule__Field__ArrayAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__Field__ArrayAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5462:1: ( ( ruleArrayType ) )
            // InternalAvroSchema.g:5463:2: ( ruleArrayType )
            {
            // InternalAvroSchema.g:5463:2: ( ruleArrayType )
            // InternalAvroSchema.g:5464:3: ruleArrayType
            {
             before(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getArrayArrayTypeParserRuleCall_13_4_0()); 

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
    // $ANTLR end "rule__Field__ArrayAssignment_13_4"


    // $ANTLR start "rule__Field__MapAssignment_13_5"
    // InternalAvroSchema.g:5473:1: rule__Field__MapAssignment_13_5 : ( ruleMapType ) ;
    public final void rule__Field__MapAssignment_13_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5477:1: ( ( ruleMapType ) )
            // InternalAvroSchema.g:5478:2: ( ruleMapType )
            {
            // InternalAvroSchema.g:5478:2: ( ruleMapType )
            // InternalAvroSchema.g:5479:3: ruleMapType
            {
             before(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getMapMapTypeParserRuleCall_13_5_0()); 

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
    // $ANTLR end "rule__Field__MapAssignment_13_5"


    // $ANTLR start "rule__Field__FixedAssignment_13_6"
    // InternalAvroSchema.g:5488:1: rule__Field__FixedAssignment_13_6 : ( ruleFixedType ) ;
    public final void rule__Field__FixedAssignment_13_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5492:1: ( ( ruleFixedType ) )
            // InternalAvroSchema.g:5493:2: ( ruleFixedType )
            {
            // InternalAvroSchema.g:5493:2: ( ruleFixedType )
            // InternalAvroSchema.g:5494:3: ruleFixedType
            {
             before(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFixedType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getFixedFixedTypeParserRuleCall_13_6_0()); 

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
    // $ANTLR end "rule__Field__FixedAssignment_13_6"


    // $ANTLR start "rule__Field__UnionAssignment_13_7"
    // InternalAvroSchema.g:5503:1: rule__Field__UnionAssignment_13_7 : ( ruleUnionType ) ;
    public final void rule__Field__UnionAssignment_13_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5507:1: ( ( ruleUnionType ) )
            // InternalAvroSchema.g:5508:2: ( ruleUnionType )
            {
            // InternalAvroSchema.g:5508:2: ( ruleUnionType )
            // InternalAvroSchema.g:5509:3: ruleUnionType
            {
             before(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getUnionUnionTypeParserRuleCall_13_7_0()); 

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
    // $ANTLR end "rule__Field__UnionAssignment_13_7"


    // $ANTLR start "rule__EnumType__NameAssignment_14"
    // InternalAvroSchema.g:5518:1: rule__EnumType__NameAssignment_14 : ( RULE_ID ) ;
    public final void rule__EnumType__NameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5522:1: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5523:2: ( RULE_ID )
            {
            // InternalAvroSchema.g:5523:2: ( RULE_ID )
            // InternalAvroSchema.g:5524:3: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__EnumType__NameAssignment_14"


    // $ANTLR start "rule__EnumType__SymbolsAssignment_22_1"
    // InternalAvroSchema.g:5533:1: rule__EnumType__SymbolsAssignment_22_1 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5537:1: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5538:2: ( RULE_ID )
            {
            // InternalAvroSchema.g:5538:2: ( RULE_ID )
            // InternalAvroSchema.g:5539:3: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_22_1_0()); 

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
    // $ANTLR end "rule__EnumType__SymbolsAssignment_22_1"


    // $ANTLR start "rule__EnumType__SymbolsAssignment_23_2"
    // InternalAvroSchema.g:5548:1: rule__EnumType__SymbolsAssignment_23_2 : ( RULE_ID ) ;
    public final void rule__EnumType__SymbolsAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5552:1: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5553:2: ( RULE_ID )
            {
            // InternalAvroSchema.g:5553:2: ( RULE_ID )
            // InternalAvroSchema.g:5554:3: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getSymbolsIDTerminalRuleCall_23_2_0()); 

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
    // $ANTLR end "rule__EnumType__SymbolsAssignment_23_2"


    // $ANTLR start "rule__ArrayType__PrimitiveAssignment_13_0"
    // InternalAvroSchema.g:5563:1: rule__ArrayType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__ArrayType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5567:1: ( ( rulePrimitive ) )
            // InternalAvroSchema.g:5568:2: ( rulePrimitive )
            {
            // InternalAvroSchema.g:5568:2: ( rulePrimitive )
            // InternalAvroSchema.g:5569:3: rulePrimitive
            {
             before(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

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
    // $ANTLR end "rule__ArrayType__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__ArrayType__RecordAssignment_13_1"
    // InternalAvroSchema.g:5578:1: rule__ArrayType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__ArrayType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5582:1: ( ( ruleRecordType ) )
            // InternalAvroSchema.g:5583:2: ( ruleRecordType )
            {
            // InternalAvroSchema.g:5583:2: ( ruleRecordType )
            // InternalAvroSchema.g:5584:3: ruleRecordType
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__ArrayType__RecordAssignment_13_1"


    // $ANTLR start "rule__ArrayType__RecordRefAssignment_13_2_1"
    // InternalAvroSchema.g:5593:1: rule__ArrayType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArrayType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5597:1: ( ( ( RULE_ID ) ) )
            // InternalAvroSchema.g:5598:2: ( ( RULE_ID ) )
            {
            // InternalAvroSchema.g:5598:2: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5599:3: ( RULE_ID )
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
            // InternalAvroSchema.g:5600:3: ( RULE_ID )
            // InternalAvroSchema.g:5601:4: RULE_ID
            {
             before(grammarAccess.getArrayTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getArrayTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 

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
    // $ANTLR end "rule__ArrayType__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__ArrayType__EtypeAssignment_13_3"
    // InternalAvroSchema.g:5612:1: rule__ArrayType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__ArrayType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5616:1: ( ( ruleEnumType ) )
            // InternalAvroSchema.g:5617:2: ( ruleEnumType )
            {
            // InternalAvroSchema.g:5617:2: ( ruleEnumType )
            // InternalAvroSchema.g:5618:3: ruleEnumType
            {
             before(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

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
    // $ANTLR end "rule__ArrayType__EtypeAssignment_13_3"


    // $ANTLR start "rule__MapType__PrimitiveAssignment_13_0"
    // InternalAvroSchema.g:5627:1: rule__MapType__PrimitiveAssignment_13_0 : ( rulePrimitive ) ;
    public final void rule__MapType__PrimitiveAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5631:1: ( ( rulePrimitive ) )
            // InternalAvroSchema.g:5632:2: ( rulePrimitive )
            {
            // InternalAvroSchema.g:5632:2: ( rulePrimitive )
            // InternalAvroSchema.g:5633:3: rulePrimitive
            {
             before(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getPrimitivePrimitiveParserRuleCall_13_0_0()); 

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
    // $ANTLR end "rule__MapType__PrimitiveAssignment_13_0"


    // $ANTLR start "rule__MapType__RecordAssignment_13_1"
    // InternalAvroSchema.g:5642:1: rule__MapType__RecordAssignment_13_1 : ( ruleRecordType ) ;
    public final void rule__MapType__RecordAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5646:1: ( ( ruleRecordType ) )
            // InternalAvroSchema.g:5647:2: ( ruleRecordType )
            {
            // InternalAvroSchema.g:5647:2: ( ruleRecordType )
            // InternalAvroSchema.g:5648:3: ruleRecordType
            {
             before(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getRecordRecordTypeParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__MapType__RecordAssignment_13_1"


    // $ANTLR start "rule__MapType__RecordRefAssignment_13_2_1"
    // InternalAvroSchema.g:5657:1: rule__MapType__RecordRefAssignment_13_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MapType__RecordRefAssignment_13_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5661:1: ( ( ( RULE_ID ) ) )
            // InternalAvroSchema.g:5662:2: ( ( RULE_ID ) )
            {
            // InternalAvroSchema.g:5662:2: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5663:3: ( RULE_ID )
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 
            // InternalAvroSchema.g:5664:3: ( RULE_ID )
            // InternalAvroSchema.g:5665:4: RULE_ID
            {
             before(grammarAccess.getMapTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getRecordRefRecordIDTerminalRuleCall_13_2_1_0_1()); 

            }

             after(grammarAccess.getMapTypeAccess().getRecordRefRecordCrossReference_13_2_1_0()); 

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
    // $ANTLR end "rule__MapType__RecordRefAssignment_13_2_1"


    // $ANTLR start "rule__MapType__EtypeAssignment_13_3"
    // InternalAvroSchema.g:5676:1: rule__MapType__EtypeAssignment_13_3 : ( ruleEnumType ) ;
    public final void rule__MapType__EtypeAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5680:1: ( ( ruleEnumType ) )
            // InternalAvroSchema.g:5681:2: ( ruleEnumType )
            {
            // InternalAvroSchema.g:5681:2: ( ruleEnumType )
            // InternalAvroSchema.g:5682:3: ruleEnumType
            {
             before(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getEtypeEnumTypeParserRuleCall_13_3_0()); 

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
    // $ANTLR end "rule__MapType__EtypeAssignment_13_3"


    // $ANTLR start "rule__MapType__AtypeAssignment_13_4"
    // InternalAvroSchema.g:5691:1: rule__MapType__AtypeAssignment_13_4 : ( ruleArrayType ) ;
    public final void rule__MapType__AtypeAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5695:1: ( ( ruleArrayType ) )
            // InternalAvroSchema.g:5696:2: ( ruleArrayType )
            {
            // InternalAvroSchema.g:5696:2: ( ruleArrayType )
            // InternalAvroSchema.g:5697:3: ruleArrayType
            {
             before(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getAtypeArrayTypeParserRuleCall_13_4_0()); 

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
    // $ANTLR end "rule__MapType__AtypeAssignment_13_4"


    // $ANTLR start "rule__FixedType__NameAssignment_9"
    // InternalAvroSchema.g:5706:1: rule__FixedType__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__FixedType__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5710:1: ( ( RULE_ID ) )
            // InternalAvroSchema.g:5711:2: ( RULE_ID )
            {
            // InternalAvroSchema.g:5711:2: ( RULE_ID )
            // InternalAvroSchema.g:5712:3: RULE_ID
            {
             before(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getNameIDTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__FixedType__NameAssignment_9"


    // $ANTLR start "rule__FixedType__SizeAssignment_17"
    // InternalAvroSchema.g:5721:1: rule__FixedType__SizeAssignment_17 : ( RULE_INT ) ;
    public final void rule__FixedType__SizeAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5725:1: ( ( RULE_INT ) )
            // InternalAvroSchema.g:5726:2: ( RULE_INT )
            {
            // InternalAvroSchema.g:5726:2: ( RULE_INT )
            // InternalAvroSchema.g:5727:3: RULE_INT
            {
             before(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFixedTypeAccess().getSizeINTTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__FixedType__SizeAssignment_17"


    // $ANTLR start "rule__Primitive__TypeAssignment_1"
    // InternalAvroSchema.g:5736:1: rule__Primitive__TypeAssignment_1 : ( ( rule__Primitive__TypeAlternatives_1_0 ) ) ;
    public final void rule__Primitive__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAvroSchema.g:5740:1: ( ( ( rule__Primitive__TypeAlternatives_1_0 ) ) )
            // InternalAvroSchema.g:5741:2: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            {
            // InternalAvroSchema.g:5741:2: ( ( rule__Primitive__TypeAlternatives_1_0 ) )
            // InternalAvroSchema.g:5742:3: ( rule__Primitive__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 
            // InternalAvroSchema.g:5743:3: ( rule__Primitive__TypeAlternatives_1_0 )
            // InternalAvroSchema.g:5743:4: rule__Primitive__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAlternatives_1_0()); 

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
    // $ANTLR end "rule__Primitive__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\23\1\26\1\uffff\1\30\1\26\1\31\2\26\2\uffff";
    static final String dfa_3s = "\1\27\1\26\1\uffff\1\30\1\26\1\31\1\26\1\33\2\uffff";
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
            return "377:1: rule__AvroSchema__TypesAlternatives_0 : ( ( ruleJsonType ) | ( ruleRecordType ) | ( ruleUnionType ) );";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\2\26\1\4\1\30\3\uffff\1\26\1\31\1\26\1\33\4\uffff";
    static final String dfa_9s = "\1\27\1\26\1\43\1\30\3\uffff\1\26\1\31\1\26\1\42\4\uffff";
    static final String dfa_10s = "\4\uffff\1\6\1\3\1\7\4\uffff\1\1\1\4\1\5\1\2";
    static final String dfa_11s = "\17\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1",
            "\1\3",
            "\1\6\6\uffff\10\5\20\uffff\1\4",
            "\1\7",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\2\uffff\1\15\1\uffff\1\16\1\uffff\1\14",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "404:1: rule__UnionMember__Alternatives : ( ( ruleRecordType ) | ( ruleArrayType ) | ( rulePrimitive ) | ( ruleMapType ) | ( ruleEnumType ) | ( ruleFixedType ) | ( ( rule__UnionMember__Group_6__0 ) ) );";
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\1\23\1\4\1\26\4\uffff\1\30\1\26\1\31\1\26\1\33\4\uffff";
    static final String dfa_15s = "\1\27\1\43\1\26\4\uffff\1\30\1\26\1\31\1\26\1\42\4\uffff";
    static final String dfa_16s = "\3\uffff\1\10\1\1\1\7\1\3\5\uffff\1\2\1\6\1\5\1\4";
    static final String dfa_17s = "\20\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\2\uffff\1\1\1\2",
            "\1\6\6\uffff\10\4\20\uffff\1\5",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\2\uffff\1\17\1\uffff\1\16\1\uffff\1\15",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "476:1: rule__Field__Alternatives_13 : ( ( ( rule__Field__PrimitiveAssignment_13_0 ) ) | ( ( rule__Field__RecordAssignment_13_1 ) ) | ( ( rule__Field__Group_13_2__0 ) ) | ( ( rule__Field__EtypeAssignment_13_3 ) ) | ( ( rule__Field__ArrayAssignment_13_4 ) ) | ( ( rule__Field__MapAssignment_13_5 ) ) | ( ( rule__Field__FixedAssignment_13_6 ) ) | ( ( rule__Field__UnionAssignment_13_7 ) ) );";
        }
    }
    static final String dfa_19s = "\14\uffff";
    static final String dfa_20s = "\1\26\1\4\1\26\2\uffff\1\30\1\26\1\31\1\26\1\33\2\uffff";
    static final String dfa_21s = "\1\27\1\22\1\26\2\uffff\1\30\1\26\1\31\1\26\1\36\2\uffff";
    static final String dfa_22s = "\3\uffff\1\1\1\3\5\uffff\1\2\1\4";
    static final String dfa_23s = "\14\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\1\2",
            "\1\4\6\uffff\10\3",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\2\uffff\1\13",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "533:1: rule__ArrayType__Alternatives_13 : ( ( ( rule__ArrayType__PrimitiveAssignment_13_0 ) ) | ( ( rule__ArrayType__RecordAssignment_13_1 ) ) | ( ( rule__ArrayType__Group_13_2__0 ) ) | ( ( rule__ArrayType__EtypeAssignment_13_3 ) ) );";
        }
    }
    static final String dfa_25s = "\15\uffff";
    static final String dfa_26s = "\1\26\1\4\1\26\2\uffff\1\30\1\26\1\31\1\26\1\33\3\uffff";
    static final String dfa_27s = "\1\27\1\22\1\26\2\uffff\1\30\1\26\1\31\1\26\1\40\3\uffff";
    static final String dfa_28s = "\3\uffff\1\3\1\1\5\uffff\1\5\1\4\1\2";
    static final String dfa_29s = "\15\uffff}>";
    static final String[] dfa_30s = {
            "\1\1\1\2",
            "\1\3\6\uffff\10\4",
            "\1\5",
            "",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\14\2\uffff\1\13\1\uffff\1\12",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "566:1: rule__MapType__Alternatives_13 : ( ( ( rule__MapType__PrimitiveAssignment_13_0 ) ) | ( ( rule__MapType__RecordAssignment_13_1 ) ) | ( ( rule__MapType__Group_13_2__0 ) ) | ( ( rule__MapType__EtypeAssignment_13_3 ) ) | ( ( rule__MapType__AtypeAssignment_13_4 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C80000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});

}