// Generated from C:/repo/paradox_util\Pdx.g4 by ANTLR 4.9.1
package com.popush.pdxtool.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PdxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WRAP_STRING=2, SPACE=3, NUMBER=4, DATE_TIME=5, FALSE=6, TRUE=7, 
		NULL=8, YES=9, NO=10, KEY_LEVEL_STRING=11, BRACHET_START=12, BRACHET_END=13, 
		EQ=14, LT=15, GT=16, LTE=17, GTE=18, Semicolon=19, Apostrophe=20, SINGLE_QUOTE=21, 
		UNDERSCORE=22, HTPHEN=23, DOT=24, AT_MARK=25, ALPHABETS=26, EUROPEAN_LANG_CHARS=27, 
		CHAR=28, EXP=29, FRAC=30, INT=31;
	public static final int
		RULE_primitive = 0, RULE_nameSeparator = 1, RULE_value = 2, RULE_key = 3, 
		RULE_root = 4, RULE_element = 5, RULE_keyValue = 6, RULE_array = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"primitive", "nameSeparator", "value", "key", "root", "element", "keyValue", 
			"array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'false'", "'true'", "'null'", "'yes'", 
			"'no'", null, "'{'", "'}'", "'='", "'<'", "'>'", "'<='", "'>='", "':'", 
			"'\u2019'", "'''", "'_'", "'-'", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WRAP_STRING", "SPACE", "NUMBER", "DATE_TIME", "FALSE", 
			"TRUE", "NULL", "YES", "NO", "KEY_LEVEL_STRING", "BRACHET_START", "BRACHET_END", 
			"EQ", "LT", "GT", "LTE", "GTE", "Semicolon", "Apostrophe", "SINGLE_QUOTE", 
			"UNDERSCORE", "HTPHEN", "DOT", "AT_MARK", "ALPHABETS", "EUROPEAN_LANG_CHARS", 
			"CHAR", "EXP", "FRAC", "INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pdx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PdxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(PdxParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(PdxParser.TRUE, 0); }
		public TerminalNode NULL() { return getToken(PdxParser.NULL, 0); }
		public TerminalNode YES() { return getToken(PdxParser.YES, 0); }
		public TerminalNode NO() { return getToken(PdxParser.NO, 0); }
		public TerminalNode NUMBER() { return getToken(PdxParser.NUMBER, 0); }
		public TerminalNode KEY_LEVEL_STRING() { return getToken(PdxParser.KEY_LEVEL_STRING, 0); }
		public TerminalNode WRAP_STRING() { return getToken(PdxParser.WRAP_STRING, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRAP_STRING) | (1L << NUMBER) | (1L << FALSE) | (1L << TRUE) | (1L << NULL) | (1L << YES) | (1L << NO) | (1L << KEY_LEVEL_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NameSeparatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PdxParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PdxParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PdxParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PdxParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(PdxParser.EQ, 0); }
		public NameSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSeparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterNameSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitNameSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitNameSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameSeparatorContext nameSeparator() throws RecognitionException {
		NameSeparatorContext _localctx = new NameSeparatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nameSeparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT) | (1L << LTE) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ValueContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				array();
				}
				break;
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PdxParser.NUMBER, 0); }
		public TerminalNode DATE_TIME() { return getToken(PdxParser.DATE_TIME, 0); }
		public TerminalNode KEY_LEVEL_STRING() { return getToken(PdxParser.KEY_LEVEL_STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << DATE_TIME) | (1L << KEY_LEVEL_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class RootContext extends ParserRuleContext {
		public ElementContext element;
		public List<ElementContext> elements = new ArrayList<ElementContext>();
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRAP_STRING) | (1L << NUMBER) | (1L << DATE_TIME) | (1L << FALSE) | (1L << TRUE) | (1L << NULL) | (1L << YES) | (1L << NO) | (1L << KEY_LEVEL_STRING) | (1L << BRACHET_START))) != 0)) {
				{
				{
				setState(26);
				((RootContext)_localctx).element = element();
				((RootContext)_localctx).elements.add(((RootContext)_localctx).element);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ElementContext extends ParserRuleContext {
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_element);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				primitive();
				}
				break;
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

	public static class KeyValueContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public NameSeparatorContext nameSeparator() {
			return getRuleContext(NameSeparatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			key();
			setState(38);
			nameSeparator();
			setState(39);
			value();
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

	public static class ArrayContext extends ParserRuleContext {
		public ElementContext element;
		public List<ElementContext> elements = new ArrayList<ElementContext>();
		public TerminalNode BRACHET_START() { return getToken(PdxParser.BRACHET_START, 0); }
		public TerminalNode BRACHET_END() { return getToken(PdxParser.BRACHET_END, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PdxListener ) ((PdxListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PdxVisitor ) return ((PdxVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(BRACHET_START);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRAP_STRING) | (1L << NUMBER) | (1L << DATE_TIME) | (1L << FALSE) | (1L << TRUE) | (1L << NULL) | (1L << YES) | (1L << NO) | (1L << KEY_LEVEL_STRING) | (1L << BRACHET_START))) != 0)) {
				{
				{
				setState(42);
				((ArrayContext)_localctx).element = element();
				((ArrayContext)_localctx).elements.add(((ArrayContext)_localctx).element);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(BRACHET_END);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\65\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\5\4\31\n\4\3\5\3\5\3\6\7\6\36\n\6\f\6\16\6!\13\6\3\7\3\7\3\7\5\7"+
		"&\n\7\3\b\3\b\3\b\3\b\3\t\3\t\7\t.\n\t\f\t\16\t\61\13\t\3\t\3\t\3\t\2"+
		"\2\n\2\4\6\b\n\f\16\20\2\5\5\2\4\4\6\6\b\r\3\2\20\24\4\2\6\7\r\r\2\61"+
		"\2\22\3\2\2\2\4\24\3\2\2\2\6\30\3\2\2\2\b\32\3\2\2\2\n\37\3\2\2\2\f%\3"+
		"\2\2\2\16\'\3\2\2\2\20+\3\2\2\2\22\23\t\2\2\2\23\3\3\2\2\2\24\25\t\3\2"+
		"\2\25\5\3\2\2\2\26\31\5\f\7\2\27\31\5\20\t\2\30\26\3\2\2\2\30\27\3\2\2"+
		"\2\31\7\3\2\2\2\32\33\t\4\2\2\33\t\3\2\2\2\34\36\5\f\7\2\35\34\3\2\2\2"+
		"\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \13\3\2\2\2!\37\3\2\2\2\"&\5\16"+
		"\b\2#&\5\20\t\2$&\5\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\r\3\2\2\2\'"+
		"(\5\b\5\2()\5\4\3\2)*\5\6\4\2*\17\3\2\2\2+/\7\16\2\2,.\5\f\7\2-,\3\2\2"+
		"\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7"+
		"\17\2\2\63\21\3\2\2\2\6\30\37%/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}