// Generated from GrammarA.g4 by ANTLR 4.7

    package co.edu.eafit.dis.st0270.s2017.jorxsua.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, VARID=24, BOOLEANO=25, 
		ENTERO=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "ID", "VARID", "BOOLEANO", 
		"ENTERO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'clase'", "';'", "'solicitar'", "'cuando'", "'{'", "'}'", "'<-'", 
		"'si'", "'ent'", "'sino'", "'finsi'", "'mientras'", "'hacer'", "'|'", 
		"'y'", "'<='", "'='", "'+'", "'*'", "'no'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"VARID", "BOOLEANO", "ENTERO", "WS"
	};
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


	public GrammarALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarA.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\7"+
		"\30\u0091\n\30\f\30\16\30\u0094\13\30\3\31\3\31\7\31\u0098\n\31\f\31\16"+
		"\31\u009b\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00a8\n\32\3\33\3\33\3\33\7\33\u00ad\n\33\f\33\16\33\u00b0\13\33"+
		"\5\33\u00b2\n\33\3\34\6\34\u00b5\n\34\r\34\16\34\u00b6\3\34\3\34\2\2\35"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\4"+
		"\5\2\62;C\\c|\4\2\13\f\"\"\2\u00bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\39\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tK\3\2\2\2\13R\3\2"+
		"\2\2\rT\3\2\2\2\17V\3\2\2\2\21Y\3\2\2\2\23\\\3\2\2\2\25`\3\2\2\2\27e\3"+
		"\2\2\2\31k\3\2\2\2\33t\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0081"+
		"\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u008a\3\2\2\2"+
		"-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0095\3\2\2\2\63\u00a7\3\2\2\2\65\u00b1"+
		"\3\2\2\2\67\u00b4\3\2\2\29:\7e\2\2:;\7n\2\2;<\7c\2\2<=\7u\2\2=>\7g\2\2"+
		">\4\3\2\2\2?@\7=\2\2@\6\3\2\2\2AB\7u\2\2BC\7q\2\2CD\7n\2\2DE\7k\2\2EF"+
		"\7e\2\2FG\7k\2\2GH\7v\2\2HI\7c\2\2IJ\7t\2\2J\b\3\2\2\2KL\7e\2\2LM\7w\2"+
		"\2MN\7c\2\2NO\7p\2\2OP\7f\2\2PQ\7q\2\2Q\n\3\2\2\2RS\7}\2\2S\f\3\2\2\2"+
		"TU\7\177\2\2U\16\3\2\2\2VW\7>\2\2WX\7/\2\2X\20\3\2\2\2YZ\7u\2\2Z[\7k\2"+
		"\2[\22\3\2\2\2\\]\7g\2\2]^\7p\2\2^_\7v\2\2_\24\3\2\2\2`a\7u\2\2ab\7k\2"+
		"\2bc\7p\2\2cd\7q\2\2d\26\3\2\2\2ef\7h\2\2fg\7k\2\2gh\7p\2\2hi\7u\2\2i"+
		"j\7k\2\2j\30\3\2\2\2kl\7o\2\2lm\7k\2\2mn\7g\2\2no\7p\2\2op\7v\2\2pq\7"+
		"t\2\2qr\7c\2\2rs\7u\2\2s\32\3\2\2\2tu\7j\2\2uv\7c\2\2vw\7e\2\2wx\7g\2"+
		"\2xy\7t\2\2y\34\3\2\2\2z{\7~\2\2{\36\3\2\2\2|}\7{\2\2} \3\2\2\2~\177\7"+
		">\2\2\177\u0080\7?\2\2\u0080\"\3\2\2\2\u0081\u0082\7?\2\2\u0082$\3\2\2"+
		"\2\u0083\u0084\7-\2\2\u0084&\3\2\2\2\u0085\u0086\7,\2\2\u0086(\3\2\2\2"+
		"\u0087\u0088\7p\2\2\u0088\u0089\7q\2\2\u0089*\3\2\2\2\u008a\u008b\7*\2"+
		"\2\u008b,\3\2\2\2\u008c\u008d\7+\2\2\u008d.\3\2\2\2\u008e\u0092\4C\\\2"+
		"\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\60\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0099\4c|\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\62\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\7x\2\2\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a8\7f\2\2\u00a2\u00a3\7h\2\2"+
		"\u00a3\u00a4\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a8"+
		"\7q\2\2\u00a7\u009c\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\64\3\2\2\2\u00a9"+
		"\u00b2\7\62\2\2\u00aa\u00ae\4\63;\2\u00ab\u00ad\4\62;\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2"+
		"\2\2\u00b2\66\3\2\2\2\u00b3\u00b5\t\3\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\b\34\2\2\u00b98\3\2\2\2\t\2\u0092\u0099\u00a7\u00ae\u00b1\u00b6"+
		"\3\3\34\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}