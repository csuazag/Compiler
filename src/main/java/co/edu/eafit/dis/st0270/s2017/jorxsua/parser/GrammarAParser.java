// Generated from GrammarA.g4 by ANTLR 4.7

    package co.edu.eafit.dis.st0270.s2017.jorxsua.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, VARID=24, BOOLEANO=25, 
		ENTERO=26, WS=27;
	public static final int
		RULE_grammanrec = 0, RULE_manrec = 1, RULE_declaraciones = 2, RULE_instrucciones = 3, 
		RULE_instruccion = 4, RULE_bloque = 5, RULE_asignacion = 6, RULE_condicional = 7, 
		RULE_condicionalp = 8, RULE_ciclo = 9, RULE_decvars = 10, RULE_expresion = 11, 
		RULE_expr1 = 12, RULE_expr2 = 13, RULE_expr3 = 14, RULE_expr4 = 15, RULE_expr5 = 16, 
		RULE_expr6 = 17;
	public static final String[] ruleNames = {
		"grammanrec", "manrec", "declaraciones", "instrucciones", "instruccion", 
		"bloque", "asignacion", "condicional", "condicionalp", "ciclo", "decvars", 
		"expresion", "expr1", "expr2", "expr3", "expr4", "expr5", "expr6"
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

	@Override
	public String getGrammarFileName() { return "GrammarA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammanrecContext extends ParserRuleContext {
		public ManrecContext manrec() {
			return getRuleContext(ManrecContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarAParser.EOF, 0); }
		public GrammanrecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammanrec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitGrammanrec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammanrecContext grammanrec() throws RecognitionException {
		GrammanrecContext _localctx = new GrammanrecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammanrec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			manrec();
			setState(37);
			match(EOF);
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

	public static class ManrecContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ManrecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manrec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitManrec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManrecContext manrec() throws RecognitionException {
		ManrecContext _localctx = new ManrecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_manrec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			declaraciones();
			setState(40);
			instrucciones();
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarAParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarAParser.ID, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(GrammarAParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(GrammarAParser.ENTERO, i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(T__0);
				setState(43);
				match(ID);
				setState(44);
				match(ENTERO);
				setState(45);
				match(T__1);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << VARID))) != 0)) {
				{
				{
				setState(50);
				instruccion();
				}
				}
				setState(55);
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

	public static class InstruccionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarAParser.ID, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruccion);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__2);
				setState(57);
				match(ID);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(58);
					match(T__3);
					setState(59);
					expresion();
					}
				}

				setState(62);
				bloque();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				bloque();
				}
				break;
			case VARID:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				asignacion();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				condicional();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				ciclo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BloqueContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public DecvarsContext decvars() {
			return getRuleContext(DecvarsContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(70);
				decvars();
				}
			}

			setState(73);
			instrucciones();
			setState(74);
			match(T__5);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VARID() { return getToken(GrammarAParser.VARID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(VARID);
			setState(77);
			match(T__6);
			setState(78);
			expresion();
			setState(79);
			match(T__1);
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

	public static class CondicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public CondicionalpContext condicionalp() {
			return getRuleContext(CondicionalpContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__7);
			setState(82);
			expresion();
			setState(83);
			match(T__8);
			setState(84);
			instruccion();
			setState(85);
			condicionalp();
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

	public static class CondicionalpContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public CondicionalpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitCondicionalp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalpContext condicionalp() throws RecognitionException {
		CondicionalpContext _localctx = new CondicionalpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionalp);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__9);
				setState(88);
				instruccion();
				setState(89);
				match(T__10);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CicloContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__11);
			setState(95);
			expresion();
			setState(96);
			match(T__12);
			setState(97);
			instruccion();
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

	public static class DecvarsContext extends ParserRuleContext {
		public List<TerminalNode> VARID() { return getTokens(GrammarAParser.VARID); }
		public TerminalNode VARID(int i) {
			return getToken(GrammarAParser.VARID, i);
		}
		public DecvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decvars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitDecvars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecvarsContext decvars() throws RecognitionException {
		DecvarsContext _localctx = new DecvarsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decvars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__13);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				match(VARID);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARID );
			setState(105);
			match(T__13);
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expr1();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(108);
				match(T__14);
				setState(109);
				expr1();
				}
				}
				setState(114);
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

	public static class Expr1Context extends ParserRuleContext {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expr2();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(116);
				match(T__15);
				setState(117);
				expr2();
				}
				}
				setState(122);
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

	public static class Expr2Context extends ParserRuleContext {
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expr3();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(124);
				match(T__16);
				setState(125);
				expr3();
				}
				}
				setState(130);
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

	public static class Expr3Context extends ParserRuleContext {
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			expr4();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(132);
				match(T__17);
				setState(133);
				expr4();
				}
				}
				setState(138);
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

	public static class Expr4Context extends ParserRuleContext {
		public List<Expr5Context> expr5() {
			return getRuleContexts(Expr5Context.class);
		}
		public Expr5Context expr5(int i) {
			return getRuleContext(Expr5Context.class,i);
		}
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitExpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			expr5();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(140);
				match(T__18);
				setState(141);
				expr5();
				}
				}
				setState(146);
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

	public static class Expr5Context extends ParserRuleContext {
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitExpr5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr5);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__19);
				setState(148);
				expr6();
				}
				break;
			case T__20:
			case VARID:
			case BOOLEANO:
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				expr6();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Expr6Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode VARID() { return getToken(GrammarAParser.VARID, 0); }
		public TerminalNode ENTERO() { return getToken(GrammarAParser.ENTERO, 0); }
		public TerminalNode BOOLEANO() { return getToken(GrammarAParser.BOOLEANO, 0); }
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarAVisitor ) return ((GrammarAVisitor<? extends T>)visitor).visitExpr6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr6Context expr6() throws RecognitionException {
		Expr6Context _localctx = new Expr6Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr6);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__20);
				setState(153);
				expresion();
				setState(154);
				match(T__21);
				}
				break;
			case VARID:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(VARID);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(ENTERO);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(BOOLEANO);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4\61\n\4\r\4\16\4"+
		"\62\3\5\7\5\66\n\5\f\5\16\59\13\5\3\6\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6F\n\6\3\7\3\7\5\7J\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\6\fh\n\f\r\f\16\fi\3\f\3\f\3\r\3\r\3\r\7\rq\n\r\f\r\16\r"+
		"t\13\r\3\16\3\16\3\16\7\16y\n\16\f\16\16\16|\13\16\3\17\3\17\3\17\7\17"+
		"\u0081\n\17\f\17\16\17\u0084\13\17\3\20\3\20\3\20\7\20\u0089\n\20\f\20"+
		"\16\20\u008c\13\20\3\21\3\21\3\21\7\21\u0091\n\21\f\21\16\21\u0094\13"+
		"\21\3\22\3\22\3\22\5\22\u0099\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00a2\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\2\2\u00a4\2&\3\2\2\2\4)\3\2\2\2\6\60\3\2\2\2\b\67\3\2\2\2\nE\3\2\2"+
		"\2\fG\3\2\2\2\16N\3\2\2\2\20S\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26e\3\2"+
		"\2\2\30m\3\2\2\2\32u\3\2\2\2\34}\3\2\2\2\36\u0085\3\2\2\2 \u008d\3\2\2"+
		"\2\"\u0098\3\2\2\2$\u00a1\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3\2\2\2)*\5"+
		"\6\4\2*+\5\b\5\2+\5\3\2\2\2,-\7\3\2\2-.\7\31\2\2./\7\34\2\2/\61\7\4\2"+
		"\2\60,\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2"+
		"\64\66\5\n\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t"+
		"\3\2\2\29\67\3\2\2\2:;\7\5\2\2;>\7\31\2\2<=\7\6\2\2=?\5\30\r\2><\3\2\2"+
		"\2>?\3\2\2\2?@\3\2\2\2@F\5\f\7\2AF\5\f\7\2BF\5\16\b\2CF\5\20\t\2DF\5\24"+
		"\13\2E:\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GI"+
		"\7\7\2\2HJ\5\26\f\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\b\5\2LM\7\b\2\2"+
		"M\r\3\2\2\2NO\7\32\2\2OP\7\t\2\2PQ\5\30\r\2QR\7\4\2\2R\17\3\2\2\2ST\7"+
		"\n\2\2TU\5\30\r\2UV\7\13\2\2VW\5\n\6\2WX\5\22\n\2X\21\3\2\2\2YZ\7\f\2"+
		"\2Z[\5\n\6\2[\\\7\r\2\2\\_\3\2\2\2]_\7\r\2\2^Y\3\2\2\2^]\3\2\2\2_\23\3"+
		"\2\2\2`a\7\16\2\2ab\5\30\r\2bc\7\17\2\2cd\5\n\6\2d\25\3\2\2\2eg\7\20\2"+
		"\2fh\7\32\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\20"+
		"\2\2l\27\3\2\2\2mr\5\32\16\2no\7\21\2\2oq\5\32\16\2pn\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2s\31\3\2\2\2tr\3\2\2\2uz\5\34\17\2vw\7\22\2\2wy"+
		"\5\34\17\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\33\3\2\2\2|z\3\2\2"+
		"\2}\u0082\5\36\20\2~\177\7\23\2\2\177\u0081\5\36\20\2\u0080~\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\35\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0085\u008a\5 \21\2\u0086\u0087\7\24\2\2\u0087"+
		"\u0089\5 \21\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\37\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0092"+
		"\5\"\22\2\u008e\u008f\7\25\2\2\u008f\u0091\5\"\22\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093!"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\26\2\2\u0096\u0099\5$\23\2"+
		"\u0097\u0099\5$\23\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099#\3"+
		"\2\2\2\u009a\u009b\7\27\2\2\u009b\u009c\5\30\r\2\u009c\u009d\7\30\2\2"+
		"\u009d\u00a2\3\2\2\2\u009e\u00a2\7\32\2\2\u009f\u00a2\7\34\2\2\u00a0\u00a2"+
		"\7\33\2\2\u00a1\u009a\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a0\3\2\2\2\u00a2%\3\2\2\2\20\62\67>EI^irz\u0082\u008a\u0092"+
		"\u0098\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}