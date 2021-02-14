// Generated from C:/repo/paradox_util\Pdx.g4 by ANTLR 4.9.1
package com.popush.pdxtool.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PdxLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "WRAP_STRING", "SPACE", "NUMBER", "DATE_TIME", "FALSE", "TRUE", 
			"NULL", "YES", "NO", "KEY_LEVEL_STRING", "BRACHET_START", "BRACHET_END", 
			"EQ", "LT", "GT", "LTE", "GTE", "Semicolon", "Apostrophe", "SINGLE_QUOTE", 
			"UNDERSCORE", "HTPHEN", "DOT", "AT_MARK", "ALPHABETS", "EUROPEAN_LANG_CHARS", 
			"CHAR", "EXP", "FRAC", "INT"
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


	public PdxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pdx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\2\5\2L\n\2\3\2\3\2\3\3\3\3\7\3"+
		"R\n\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\5\5\5a\n"+
		"\5\3\5\3\5\5\5e\n\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0091\n\f\r\f\16"+
		"\f\u0092\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\5\35\u00ba\n\35\3\36"+
		"\3\36\5\36\u00be\n\36\3\36\6\36\u00c1\n\36\r\36\16\36\u00c2\3\37\3\37"+
		"\6\37\u00c7\n\37\r\37\16\37\u00c8\3 \3 \3 \7 \u00ce\n \f \16 \u00d1\13"+
		" \5 \u00d3\n \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!\3\2\r\4\2\f\f\17\17\4\3\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\4\2C\\c|\7\2\u00c2\u0101\u0154\u0155\u0162\u0163\u017a\u017a\u017f"+
		"\u0180\5\2\2!$$^^\7\2ddhhppttvv\4\2GGgg\4\2--//\3\2\62;\3\2\63;\2\u00ea"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5O\3\2\2\2\7[\3\2\2\2\t`\3\2\2"+
		"\2\13i\3\2\2\2\ro\3\2\2\2\17u\3\2\2\2\21z\3\2\2\2\23\177\3\2\2\2\25\u0083"+
		"\3\2\2\2\27\u0090\3\2\2\2\31\u0094\3\2\2\2\33\u0096\3\2\2\2\35\u0098\3"+
		"\2\2\2\37\u009a\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a1\3\2\2\2\'"+
		"\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2"+
		"\2\2\61\u00ae\3\2\2\2\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2"+
		"\29\u00b9\3\2\2\2;\u00bb\3\2\2\2=\u00c4\3\2\2\2?\u00d2\3\2\2\2AE\7%\2"+
		"\2BD\n\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2"+
		"\2HI\7\17\2\2IL\7\f\2\2JL\t\3\2\2KH\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MN\b\2"+
		"\2\2N\4\3\2\2\2OS\7$\2\2PR\59\35\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2TV\3\2\2\2US\3\2\2\2VW\7$\2\2W\6\3\2\2\2X\\\t\4\2\2YZ\7\17\2\2Z\\"+
		"\7\f\2\2[X\3\2\2\2[Y\3\2\2\2\\]\3\2\2\2]^\b\4\2\2^\b\3\2\2\2_a\7/\2\2"+
		"`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\5? \2ce\5=\37\2dc\3\2\2\2de\3\2\2\2e"+
		"g\3\2\2\2fh\5;\36\2gf\3\2\2\2gh\3\2\2\2h\n\3\2\2\2ij\5? \2jk\5\61\31\2"+
		"kl\5? \2lm\5\61\31\2mn\5? \2n\f\3\2\2\2op\7h\2\2pq\7c\2\2qr\7n\2\2rs\7"+
		"u\2\2st\7g\2\2t\16\3\2\2\2uv\7v\2\2vw\7t\2\2wx\7w\2\2xy\7g\2\2y\20\3\2"+
		"\2\2z{\7p\2\2{|\7w\2\2|}\7n\2\2}~\7n\2\2~\22\3\2\2\2\177\u0080\7{\2\2"+
		"\u0080\u0081\7g\2\2\u0081\u0082\7u\2\2\u0082\24\3\2\2\2\u0083\u0084\7"+
		"p\2\2\u0084\u0085\7q\2\2\u0085\26\3\2\2\2\u0086\u0091\5\61\31\2\u0087"+
		"\u0091\5\63\32\2\u0088\u0091\5\65\33\2\u0089\u0091\5\67\34\2\u008a\u0091"+
		"\5? \2\u008b\u0091\5\'\24\2\u008c\u0091\5/\30\2\u008d\u0091\5-\27\2\u008e"+
		"\u0091\5)\25\2\u008f\u0091\5+\26\2\u0090\u0086\3\2\2\2\u0090\u0087\3\2"+
		"\2\2\u0090\u0088\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\30\3\2\2\2\u0094\u0095\7}\2\2\u0095\32\3\2\2\2\u0096"+
		"\u0097\7\177\2\2\u0097\34\3\2\2\2\u0098\u0099\7?\2\2\u0099\36\3\2\2\2"+
		"\u009a\u009b\7>\2\2\u009b \3\2\2\2\u009c\u009d\7@\2\2\u009d\"\3\2\2\2"+
		"\u009e\u009f\7>\2\2\u009f\u00a0\7?\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7@\2"+
		"\2\u00a2\u00a3\7?\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5(\3\2\2\2"+
		"\u00a6\u00a7\7\u201b\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7)\2\2\u00a9,\3\2"+
		"\2\2\u00aa\u00ab\7a\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\60\3\2"+
		"\2\2\u00ae\u00af\7\60\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7B\2\2\u00b1\64"+
		"\3\2\2\2\u00b2\u00b3\t\5\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\t\6\2\2\u00b5"+
		"8\3\2\2\2\u00b6\u00ba\n\7\2\2\u00b7\u00b8\7^\2\2\u00b8\u00ba\t\b\2\2\u00b9"+
		"\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba:\3\2\2\2\u00bb\u00bd\t\t\2\2"+
		"\u00bc\u00be\t\n\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00c1\t\13\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3<\3\2\2\2\u00c4\u00c6\5"+
		"\61\31\2\u00c5\u00c7\t\13\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9>\3\2\2\2\u00ca\u00d3\7"+
		"\62\2\2\u00cb\u00cf\t\f\2\2\u00cc\u00ce\t\13\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3"+
		"@\3\2\2\2\22\2EKS[`dg\u0090\u0092\u00b9\u00bd\u00c2\u00c8\u00cf\u00d2"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}