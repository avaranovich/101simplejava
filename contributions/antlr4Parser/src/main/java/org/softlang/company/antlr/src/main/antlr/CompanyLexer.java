// Generated from src/main/antlr/Company.g4 by ANTLR 4.2.2

package org.softlang.company.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompanyLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, STRING=9, 
		FLOAT=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'company'", "'employee'", "'salary'", "'manager'", "'department'", "'{'", 
		"'address'", "'}'", "STRING", "FLOAT", "WS"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STRING", 
		"FLOAT", "WS"
	};



	public double total = 0;



	public CompanyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Company.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rr\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7\nS\n\n\f\n\16\nV\13\n\3\n\3\n\3\13\6"+
		"\13[\n\13\r\13\16\13\\\3\13\3\13\6\13a\n\13\r\13\16\13b\5\13e\n\13\3\f"+
		"\3\f\5\fi\n\f\3\f\3\f\6\fm\n\f\r\f\16\fn\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\3\3\2$$y\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5!\3\2\2"+
		"\2\7*\3\2\2\2\t\61\3\2\2\2\139\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21N\3\2"+
		"\2\2\23P\3\2\2\2\25Z\3\2\2\2\27l\3\2\2\2\31\32\7e\2\2\32\33\7q\2\2\33"+
		"\34\7o\2\2\34\35\7r\2\2\35\36\7c\2\2\36\37\7p\2\2\37 \7{\2\2 \4\3\2\2"+
		"\2!\"\7g\2\2\"#\7o\2\2#$\7r\2\2$%\7n\2\2%&\7q\2\2&\'\7{\2\2\'(\7g\2\2"+
		"()\7g\2\2)\6\3\2\2\2*+\7u\2\2+,\7c\2\2,-\7n\2\2-.\7c\2\2./\7t\2\2/\60"+
		"\7{\2\2\60\b\3\2\2\2\61\62\7o\2\2\62\63\7c\2\2\63\64\7p\2\2\64\65\7c\2"+
		"\2\65\66\7i\2\2\66\67\7g\2\2\678\7t\2\28\n\3\2\2\29:\7f\2\2:;\7g\2\2;"+
		"<\7r\2\2<=\7c\2\2=>\7t\2\2>?\7v\2\2?@\7o\2\2@A\7g\2\2AB\7p\2\2BC\7v\2"+
		"\2C\f\3\2\2\2DE\7}\2\2E\16\3\2\2\2FG\7c\2\2GH\7f\2\2HI\7f\2\2IJ\7t\2\2"+
		"JK\7g\2\2KL\7u\2\2LM\7u\2\2M\20\3\2\2\2NO\7\177\2\2O\22\3\2\2\2PT\7$\2"+
		"\2QS\n\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2"+
		"\2WX\7$\2\2X\24\3\2\2\2Y[\4\62;\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]d\3\2\2\2^`\7\60\2\2_a\4\62;\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc"+
		"\3\2\2\2ce\3\2\2\2d^\3\2\2\2de\3\2\2\2e\26\3\2\2\2fm\7\"\2\2gi\7\17\2"+
		"\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jm\7\f\2\2km\7\13\2\2lf\3\2\2\2lh\3\2"+
		"\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\f\2\2q\30\3"+
		"\2\2\2\n\2T\\bdhln\3\3\f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}