/*
 * generated by Xtext 2.19.0
 */
package com.cohesionforce.avro.parser.antlr;

import com.cohesionforce.avro.parser.antlr.internal.InternalAvroSchemaParser;
import com.cohesionforce.avro.services.AvroSchemaGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AvroSchemaParser extends AbstractAntlrParser {

	@Inject
	private AvroSchemaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAvroSchemaParser createParser(XtextTokenStream stream) {
		return new InternalAvroSchemaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "AvroSchema";
	}

	public AvroSchemaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AvroSchemaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
