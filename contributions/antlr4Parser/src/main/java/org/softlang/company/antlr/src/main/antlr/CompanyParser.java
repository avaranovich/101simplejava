// Generated from src/main/antlr/Company.g4 by ANTLR 4.2.2

package org.softlang.company.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompanyParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, STRING=9, 
		FLOAT=10, WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'company'", "'employee'", "'salary'", "'manager'", "'department'", 
		"'{'", "'address'", "'}'", "STRING", "FLOAT", "WS"
	};
	public static final int
		RULE_company = 0, RULE_department = 1, RULE_employee = 2;
	public static final String[] ruleNames = {
		"company", "department", "employee"
	};

	@Override
	public String getGrammarFileName() { return "Company.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public double total = 0;


	public CompanyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompanyContext extends ParserRuleContext {
		public List<DepartmentContext> department() {
			return getRuleContexts(DepartmentContext.class);
		}
		public DepartmentContext department(int i) {
			return getRuleContext(DepartmentContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CompanyParser.EOF, 0); }
		public TerminalNode STRING() { return getToken(CompanyParser.STRING, 0); }
		public CompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_company; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompanyListener ) ((CompanyListener)listener).enterCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompanyListener ) ((CompanyListener)listener).exitCompany(this);
		}
	}

	public final CompanyContext company() throws RecognitionException {
		CompanyContext _localctx = new CompanyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_company);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); match(1);
			setState(7); match(STRING);
			setState(8); match(6);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(9); department();
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15); match(8);
			setState(16); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DepartmentContext extends ParserRuleContext {
		public List<EmployeeContext> employee() {
			return getRuleContexts(EmployeeContext.class);
		}
		public List<DepartmentContext> department() {
			return getRuleContexts(DepartmentContext.class);
		}
		public EmployeeContext employee(int i) {
			return getRuleContext(EmployeeContext.class,i);
		}
		public DepartmentContext department(int i) {
			return getRuleContext(DepartmentContext.class,i);
		}
		public TerminalNode STRING() { return getToken(CompanyParser.STRING, 0); }
		public DepartmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_department; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompanyListener ) ((CompanyListener)listener).enterDepartment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompanyListener ) ((CompanyListener)listener).exitDepartment(this);
		}
	}

	public final DepartmentContext department() throws RecognitionException {
		DepartmentContext _localctx = new DepartmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_department);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(5);
			setState(19); match(STRING);
			setState(20); match(6);
			setState(21); match(4);
			setState(22); employee();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(23); match(2);
				setState(24); employee();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(30); department();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36); match(8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmployeeContext extends ParserRuleContext {
		public Token FLOAT;
		public TerminalNode STRING(int i) {
			return getToken(CompanyParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CompanyParser.STRING); }
		public TerminalNode FLOAT() { return getToken(CompanyParser.FLOAT, 0); }
		public EmployeeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_employee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompanyListener ) ((CompanyListener)listener).enterEmployee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompanyListener ) ((CompanyListener)listener).exitEmployee(this);
		}
	}

	public final EmployeeContext employee() throws RecognitionException {
		EmployeeContext _localctx = new EmployeeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_employee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(STRING);
			setState(39); match(6);
			setState(40); match(7);
			setState(41); match(STRING);
			setState(42); match(3);
			setState(43); ((EmployeeContext)_localctx).FLOAT = match(FLOAT);
			 total += Double.parseDouble((((EmployeeContext)_localctx).FLOAT!=null?((EmployeeContext)_localctx).FLOAT.getText():null)); 
			setState(45); match(8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\7\3\"\n\3\f"+
		"\3\16\3%\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2\2\5\2"+
		"\4\6\2\2\61\2\b\3\2\2\2\4\24\3\2\2\2\6(\3\2\2\2\b\t\7\3\2\2\t\n\7\13\2"+
		"\2\n\16\7\b\2\2\13\r\5\4\3\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16"+
		"\17\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\n\2\2\22\23\7\2\2\3\23"+
		"\3\3\2\2\2\24\25\7\7\2\2\25\26\7\13\2\2\26\27\7\b\2\2\27\30\7\6\2\2\30"+
		"\35\5\6\4\2\31\32\7\4\2\2\32\34\5\6\4\2\33\31\3\2\2\2\34\37\3\2\2\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\4\3\2! \3\2\2"+
		"\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\n\2\2\'\5\3"+
		"\2\2\2()\7\13\2\2)*\7\b\2\2*+\7\t\2\2+,\7\13\2\2,-\7\5\2\2-.\7\f\2\2."+
		"/\b\4\1\2/\60\7\n\2\2\60\7\3\2\2\2\5\16\35#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}