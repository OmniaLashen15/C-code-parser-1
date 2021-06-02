// Generated from C:/Users/LENOVO/Desktop/C-code-parser\C.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__17=1, T__2=2, T__3=3, T__18=4, T__19=5, T__20=6, T__21=7, T__25=8, 
		T__26=9, T__27=10, T__32=11, T__30=12, T__33=13, T__34=14, DecStructure=15, 
		Auto=16, Break=17, Case=18, Char=19, Const=20, Continue=21, Default=22, 
		Do=23, Double=24, Else=25, Enum=26, Extern=27, Float=28, For=29, Goto=30, 
		If=31, Inline=32, Int=33, Long=34, Register=35, Restrict=36, Return=37, 
		Short=38, Signed=39, Sizeof=40, Static=41, Struct=42, Switch=43, Typedef=44, 
		Union=45, Unsigned=46, Void=47, Volatile=48, While=49, GlobalOrLocal=50, 
		Alignas=51, Alignof=52, Atomic=53, Bool=54, Complex=55, Generic=56, Imaginary=57, 
		Noreturn=58, StaticAssert=59, ThreadLocal=60, LeftParen=61, RightParen=62, 
		LeftBracket=63, RightBracket=64, LeftBrace=65, RightBrace=66, Less=67, 
		LessEqual=68, Greater=69, GreaterEqual=70, LeftShift=71, RightShift=72, 
		Plus=73, PlusPlus=74, Minus=75, MinusMinus=76, Star=77, Div=78, Mod=79, 
		And=80, Or=81, AndAnd=82, OrOr=83, Caret=84, Not=85, Tilde=86, Question=87, 
		Colon=88, Semi=89, Comma=90, Assign=91, StarAssign=92, DivAssign=93, ModAssign=94, 
		PlusAssign=95, MinusAssign=96, LeftShiftAssign=97, RightShiftAssign=98, 
		AndAssign=99, XorAssign=100, OrAssign=101, Equal=102, NotEqual=103, Arrow=104, 
		Dot=105, Ellipsis=106, Identifier=107, Constant=108, DigitSequence=109, 
		StringLiteral=110, ComplexDefine=111, IncludeDirective=112, AsmBlock=113, 
		LineAfterPreprocessing=114, LineDirective=115, PragmaDirective=116, Whitespace=117, 
		Newline=118, BlockComment=119, LineComment=120;
	public static final int
		RULE_compilationUnit = 0, RULE_primaryExpression = 1, RULE_genericSelection = 2, 
		RULE_genericAssocList = 3, RULE_genericAssociation = 4, RULE_postfixExpression = 5, 
		RULE_argumentExpressionList = 6, RULE_unaryExpression = 7, RULE_unaryOperator = 8, 
		RULE_castExpression = 9, RULE_multiplicativeExpression = 10, RULE_additiveExpression = 11, 
		RULE_shiftExpression = 12, RULE_relationalExpression = 13, RULE_equalityExpression = 14, 
		RULE_andExpression = 15, RULE_exclusiveOrExpression = 16, RULE_inclusiveOrExpression = 17, 
		RULE_logicalAndExpression = 18, RULE_logicalOrExpression = 19, RULE_conditionalExpression = 20, 
		RULE_assignmentExpression = 21, RULE_assignmentOperator = 22, RULE_expression = 23, 
		RULE_constantExpression = 24, RULE_declaration = 25, RULE_declarationSpecifiers = 26, 
		RULE_declarationSpecifiers2 = 27, RULE_declarationSpecifier = 28, RULE_initDeclaratorList = 29, 
		RULE_initDeclarator = 30, RULE_storageClassSpecifier = 31, RULE_typeSpecifier = 32, 
		RULE_structOrUnionSpecifier = 33, RULE_structOrUnion = 34, RULE_structDeclarationList = 35, 
		RULE_structDeclaration = 36, RULE_specifierQualifierList = 37, RULE_structDeclaratorList = 38, 
		RULE_structDeclarator = 39, RULE_enumSpecifier = 40, RULE_enumeratorList = 41, 
		RULE_enumerator = 42, RULE_enumerationConstant = 43, RULE_atomicTypeSpecifier = 44, 
		RULE_typeQualifier = 45, RULE_functionSpecifier = 46, RULE_alignmentSpecifier = 47, 
		RULE_declarator = 48, RULE_directDeclarator = 49, RULE_gccDeclaratorExtension = 50, 
		RULE_gccAttributeSpecifier = 51, RULE_gccAttributeList = 52, RULE_gccAttribute = 53, 
		RULE_nestedParenthesesBlock = 54, RULE_pointer = 55, RULE_typeQualifierList = 56, 
		RULE_parameterTypeList = 57, RULE_parameterList = 58, RULE_parameterDeclaration = 59, 
		RULE_identifierList = 60, RULE_typeName = 61, RULE_abstractDeclarator = 62, 
		RULE_directAbstractDeclarator = 63, RULE_typedefName = 64, RULE_initializer = 65, 
		RULE_initializerList = 66, RULE_designation = 67, RULE_designatorList = 68, 
		RULE_designator = 69, RULE_staticAssertDeclaration = 70, RULE_statement = 71, 
		RULE_labeledStatement = 72, RULE_compoundStatement = 73, RULE_blockItemList = 74, 
		RULE_blockItem = 75, RULE_expressionStatement = 76, RULE_selectionStatement = 77, 
		RULE_iterationStatement = 78, RULE_forCondition = 79, RULE_forDeclaration = 80, 
		RULE_forExpression = 81, RULE_jumpStatement = 82, RULE_translationUnit = 83, 
		RULE_externalDeclaration = 84, RULE_functionDefinition = 85, RULE_declarationList = 86, 
		RULE_decstrut = 87;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "primaryExpression", "genericSelection", "genericAssocList", 
			"genericAssociation", "postfixExpression", "argumentExpressionList", 
			"unaryExpression", "unaryOperator", "castExpression", "multiplicativeExpression", 
			"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "declaration", 
			"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier", 
			"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration", 
			"specifierQualifierList", "structDeclaratorList", "structDeclarator", 
			"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
			"atomicTypeSpecifier", "typeQualifier", "functionSpecifier", "alignmentSpecifier", 
			"declarator", "directDeclarator", "gccDeclaratorExtension", "gccAttributeSpecifier", 
			"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
			"typedefName", "initializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "labeledStatement", 
			"compoundStatement", "blockItemList", "blockItem", "expressionStatement", 
			"selectionStatement", "iterationStatement", "forCondition", "forDeclaration", 
			"forExpression", "jumpStatement", "translationUnit", "externalDeclaration", 
			"functionDefinition", "declarationList", "decstrut"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__inline__'", 
			"'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", "'__asm__'", 
			"'__volatile__'", null, "'auto'", "'break'", "'case'", "'char'", "'const'", 
			"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", 
			"'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", 
			"'register'", "'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", 
			"'void'", "'volatile'", "'while'", null, "'_Alignas'", "'_Alignof'", 
			"'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
			"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
			"'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "DecStructure", "Auto", "Break", "Case", "Char", "Const", 
			"Continue", "Default", "Do", "Double", "Else", "Enum", "Extern", "Float", 
			"For", "Goto", "If", "Inline", "Int", "Long", "Register", "Restrict", 
			"Return", "Short", "Signed", "Sizeof", "Static", "Struct", "Switch", 
			"Typedef", "Union", "Unsigned", "Void", "Volatile", "While", "GlobalOrLocal", 
			"Alignas", "Alignof", "Atomic", "Bool", "Complex", "Generic", "Imaginary", 
			"Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Caret", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", 
			"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
			"Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", "Constant", 
			"DigitSequence", "StringLiteral", "ComplexDefine", "IncludeDirective", 
			"AsmBlock", "LineAfterPreprocessing", "LineDirective", "PragmaDirective", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Star - 77)) | (1L << (Caret - 77)) | (1L << (Semi - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(176);
				translationUnit();
				}
			}

			setState(179);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183);
					match(StringLiteral);
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(LeftParen);
				setState(189);
				expression();
				setState(190);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(193);
					match(T__17);
					}
				}

				setState(196);
				match(LeftParen);
				setState(197);
				compoundStatement();
				setState(198);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(T__2);
				setState(201);
				match(LeftParen);
				setState(202);
				unaryExpression();
				setState(203);
				match(Comma);
				setState(204);
				typeName();
				setState(205);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				match(T__3);
				setState(208);
				match(LeftParen);
				setState(209);
				typeName();
				setState(210);
				match(Comma);
				setState(211);
				unaryExpression();
				setState(212);
				match(RightParen);
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode Generic() { return getToken(CParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGenericSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(Generic);
			setState(217);
			match(LeftParen);
			setState(218);
			assignmentExpression();
			setState(219);
			match(Comma);
			setState(220);
			genericAssocList();
			setState(221);
			match(RightParen);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public List<GenericAssociationContext> genericAssociation() {
			return getRuleContexts(GenericAssociationContext.class);
		}
		public GenericAssociationContext genericAssociation(int i) {
			return getRuleContext(GenericAssociationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGenericAssocList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssocList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			genericAssociation();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(224);
				match(Comma);
				setState(225);
				genericAssociation();
				}
				}
				setState(230);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Default() { return getToken(CParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGenericAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericAssociation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case GlobalOrLocal:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				{
				setState(231);
				typeName();
				}
				break;
			case Default:
				{
				setState(232);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			match(Colon);
			setState(236);
			assignmentExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(CParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CParser.RightBracket, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CParser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(CParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(CParser.Dot, i);
		}
		public List<TerminalNode> Arrow() { return getTokens(CParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(CParser.Arrow, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(CParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(CParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(CParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(CParser.MinusMinus, i);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}
		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(238);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(239);
					match(T__17);
					}
				}

				setState(242);
				match(LeftParen);
				setState(243);
				typeName();
				setState(244);
				match(RightParen);
				setState(245);
				match(LeftBrace);
				setState(246);
				initializerList();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(247);
					match(Comma);
					}
				}

				setState(250);
				match(RightBrace);
				}
				break;
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (LeftBracket - 61)) | (1L << (PlusPlus - 61)) | (1L << (MinusMinus - 61)) | (1L << (Arrow - 61)) | (1L << (Dot - 61)))) != 0)) {
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(254);
					match(LeftBracket);
					setState(255);
					expression();
					setState(256);
					match(RightBracket);
					}
					break;
				case LeftParen:
					{
					setState(258);
					match(LeftParen);
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(259);
						argumentExpressionList();
						}
					}

					setState(262);
					match(RightParen);
					}
					break;
				case Arrow:
				case Dot:
					{
					setState(263);
					_la = _input.LA(1);
					if ( !(_la==Arrow || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(264);
					match(Identifier);
					}
					break;
				case PlusPlus:
				case MinusMinus:
					{
					setState(265);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(270);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			assignmentExpression();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(272);
				match(Comma);
				setState(273);
				assignmentExpression();
				}
				}
				setState(278);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode AndAnd() { return getToken(CParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public List<TerminalNode> Sizeof() { return getTokens(CParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(CParser.Sizeof, i);
		}
		public TerminalNode Alignof() { return getToken(CParser.Alignof, 0); }
		public List<TerminalNode> PlusPlus() { return getTokens(CParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(CParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(CParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(CParser.MinusMinus, i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					_la = _input.LA(1);
					if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Sizeof - 40)) | (1L << (PlusPlus - 40)) | (1L << (MinusMinus - 40)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__2:
			case T__3:
			case Generic:
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				{
				setState(285);
				postfixExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				{
				setState(286);
				unaryOperator();
				setState(287);
				castExpression();
				}
				break;
			case Sizeof:
			case Alignof:
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==Sizeof || _la==Alignof) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(290);
				match(LeftParen);
				setState(291);
				typeName();
				setState(292);
				match(RightParen);
				}
				break;
			case AndAnd:
				{
				setState(294);
				match(AndAnd);
				setState(295);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CParser.And, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (Minus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)))) != 0)) ) {
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_castExpression);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(300);
					match(T__17);
					}
				}

				setState(303);
				match(LeftParen);
				setState(304);
				typeName();
				setState(305);
				match(RightParen);
				setState(306);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(DigitSequence);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(CParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(CParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(CParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(CParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(CParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			castExpression();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Star - 77)) | (1L << (Div - 77)) | (1L << (Mod - 77)))) != 0)) {
				{
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Star - 77)) | (1L << (Div - 77)) | (1L << (Mod - 77)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(314);
				castExpression();
				}
				}
				setState(319);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(CParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(CParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(CParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(CParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			multiplicativeExpression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				multiplicativeExpression();
				}
				}
				setState(327);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LeftShift() { return getTokens(CParser.LeftShift); }
		public TerminalNode LeftShift(int i) {
			return getToken(CParser.LeftShift, i);
		}
		public List<TerminalNode> RightShift() { return getTokens(CParser.RightShift); }
		public TerminalNode RightShift(int i) {
			return getToken(CParser.RightShift, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			additiveExpression();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				additiveExpression();
				}
				}
				setState(335);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(CParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(CParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(CParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(CParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(CParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(CParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(CParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			shiftExpression();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Less - 67)) | (1L << (LessEqual - 67)) | (1L << (Greater - 67)) | (1L << (GreaterEqual - 67)))) != 0)) {
				{
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Less - 67)) | (1L << (LessEqual - 67)) | (1L << (Greater - 67)) | (1L << (GreaterEqual - 67)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				shiftExpression();
				}
				}
				setState(343);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(CParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(CParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(CParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(CParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			relationalExpression();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(345);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(346);
				relationalExpression();
				}
				}
				setState(351);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(CParser.And); }
		public TerminalNode And(int i) {
			return getToken(CParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			equalityExpression();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(353);
				match(And);
				setState(354);
				equalityExpression();
				}
				}
				setState(359);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(CParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			andExpression();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(361);
				match(Caret);
				setState(362);
				andExpression();
				}
				}
				setState(367);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(CParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(CParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			exclusiveOrExpression();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(369);
				match(Or);
				setState(370);
				exclusiveOrExpression();
				}
				}
				setState(375);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(CParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(CParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			inclusiveOrExpression();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(377);
				match(AndAnd);
				setState(378);
				inclusiveOrExpression();
				}
				}
				setState(383);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(CParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(CParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			logicalAndExpression();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(385);
				match(OrOr);
				setState(386);
				logicalAndExpression();
				}
				}
				setState(391);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			logicalOrExpression();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(393);
				match(Question);
				setState(394);
				expression();
				setState(395);
				match(Colon);
				setState(396);
				conditionalExpression();
				}
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentExpression);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				unaryExpression();
				setState(402);
				assignmentOperator();
				setState(403);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(DigitSequence);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Assign - 91)) | (1L << (StarAssign - 91)) | (1L << (DivAssign - 91)) | (1L << (ModAssign - 91)) | (1L << (PlusAssign - 91)) | (1L << (MinusAssign - 91)) | (1L << (LeftShiftAssign - 91)) | (1L << (RightShiftAssign - 91)) | (1L << (AndAssign - 91)) | (1L << (XorAssign - 91)) | (1L << (OrAssign - 91)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			assignmentExpression();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(411);
				match(Comma);
				setState(412);
				assignmentExpression();
				}
				}
				setState(417);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			conditionalExpression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaration);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__25:
			case T__26:
			case T__27:
			case T__30:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case GlobalOrLocal:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				declarationSpecifiers();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)) | (1L << (Identifier - 61)))) != 0)) {
					{
					setState(421);
					initDeclaratorList();
					}
				}

				setState(424);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				staticAssertDeclaration();
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(429);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(432); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(434);
				declarationSpecifier();
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier );
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declarationSpecifier);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				typeSpecifier(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				alignmentSpecifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			initDeclarator();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(447);
				match(Comma);
				setState(448);
				initDeclarator();
				}
				}
				setState(453);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			declarator();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(455);
				match(Assign);
				setState(456);
				initializer();
				}
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(CParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(CParser.Extern, 0); }
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(CParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(CParser.Auto, 0); }
		public TerminalNode Register() { return getToken(CParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ENUMContext extends TypeSpecifierContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public ENUMContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitENUM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FLOATContext extends TypeSpecifierContext {
		public TerminalNode Float() { return getToken(CParser.Float, 0); }
		public FLOATContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFLOAT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class COMPLEXContext extends TypeSpecifierContext {
		public TerminalNode Complex() { return getToken(CParser.Complex, 0); }
		public COMPLEXContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCOMPLEX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXTENSIONSContext extends TypeSpecifierContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public EXTENSIONSContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEXTENSIONS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ATOMICContext extends TypeSpecifierContext {
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public ATOMICContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitATOMIC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UNSIGNEDContext extends TypeSpecifierContext {
		public TerminalNode Unsigned() { return getToken(CParser.Unsigned, 0); }
		public UNSIGNEDContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitUNSIGNED(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CHARContext extends TypeSpecifierContext {
		public TerminalNode Char() { return getToken(CParser.Char, 0); }
		public CHARContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCHAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class M128Context extends TypeSpecifierContext {
		public M128Context(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitM128(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CONSTANTEXPRContext extends TypeSpecifierContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public CONSTANTEXPRContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCONSTANTEXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends TypeSpecifierContext {
		public TerminalNode Int() { return getToken(CParser.Int, 0); }
		public IntContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class M128DContext extends TypeSpecifierContext {
		public M128DContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitM128D(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SHORTContext extends TypeSpecifierContext {
		public TerminalNode Short() { return getToken(CParser.Short, 0); }
		public SHORTContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSHORT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TYPESContext extends TypeSpecifierContext {
		public TYPESContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTYPES(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIGNEDContext extends TypeSpecifierContext {
		public TerminalNode Signed() { return getToken(CParser.Signed, 0); }
		public SIGNEDContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSIGNED(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BOOLContext extends TypeSpecifierContext {
		public TerminalNode Bool() { return getToken(CParser.Bool, 0); }
		public BOOLContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitBOOL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STRUCTORUNIONContext extends TypeSpecifierContext {
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public STRUCTORUNIONContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSTRUCTORUNION(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POINTERContext extends TypeSpecifierContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public POINTERContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitPOINTER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DOUBLEContext extends TypeSpecifierContext {
		public TerminalNode Double() { return getToken(CParser.Double, 0); }
		public DOUBLEContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDOUBLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VOIDContext extends TypeSpecifierContext {
		public TerminalNode Void() { return getToken(CParser.Void, 0); }
		public VOIDContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitVOID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TYPEDEFNAMEContext extends TypeSpecifierContext {
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TYPEDEFNAMEContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTYPEDEFNAME(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LONGContext extends TypeSpecifierContext {
		public TerminalNode Long() { return getToken(CParser.Long, 0); }
		public LONGContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLONG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				{
				_localctx = new VOIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(462);
				match(Void);
				}
				break;
			case Char:
				{
				_localctx = new CHARContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(463);
				match(Char);
				}
				break;
			case Short:
				{
				_localctx = new SHORTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(464);
				match(Short);
				}
				break;
			case Int:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(465);
				match(Int);
				}
				break;
			case Long:
				{
				_localctx = new LONGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(466);
				match(Long);
				}
				break;
			case Float:
				{
				_localctx = new FLOATContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(467);
				match(Float);
				}
				break;
			case Double:
				{
				_localctx = new DOUBLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468);
				match(Double);
				}
				break;
			case Signed:
				{
				_localctx = new SIGNEDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(469);
				match(Signed);
				}
				break;
			case Unsigned:
				{
				_localctx = new UNSIGNEDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(470);
				match(Unsigned);
				}
				break;
			case Bool:
				{
				_localctx = new BOOLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(471);
				match(Bool);
				}
				break;
			case Complex:
				{
				_localctx = new COMPLEXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472);
				match(Complex);
				}
				break;
			case T__18:
				{
				_localctx = new M128Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(473);
				match(T__18);
				}
				break;
			case T__19:
				{
				_localctx = new M128DContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(474);
				match(T__19);
				}
				break;
			case T__20:
				{
				_localctx = new TYPESContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(475);
				match(T__20);
				}
				break;
			case T__17:
				{
				_localctx = new EXTENSIONSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(476);
				match(T__17);
				setState(477);
				match(LeftParen);
				setState(478);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				_localctx = new ATOMICContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				_localctx = new STRUCTORUNIONContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(481);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				_localctx = new ENUMContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				enumSpecifier();
				}
				break;
			case GlobalOrLocal:
			case Identifier:
				{
				_localctx = new TYPEDEFNAMEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(483);
				typedefName();
				}
				break;
			case T__21:
				{
				_localctx = new CONSTANTEXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(484);
				match(T__21);
				setState(485);
				match(LeftParen);
				setState(486);
				constantExpression();
				setState(487);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new POINTERContext(new TypeSpecifierContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(491);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(492);
					pointer();
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				structOrUnion();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(499);
					match(Identifier);
					}
				}

				setState(502);
				match(LeftBrace);
				setState(503);
				structDeclarationList();
				setState(504);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				structOrUnion();
				setState(507);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(CParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				structDeclaration();
				}
				}
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la==Identifier );
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structDeclaration);
		int _la;
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case GlobalOrLocal:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				specifierQualifierList();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)) | (1L << (Colon - 61)) | (1L << (Identifier - 61)))) != 0)) {
					{
					setState(519);
					structDeclaratorList();
					}
				}

				setState(522);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				staticAssertDeclaration();
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(527);
				typeSpecifier(0);
				}
				break;
			case 2:
				{
				setState(528);
				typeQualifier();
				}
				break;
			}
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(531);
				specifierQualifierList();
				}
				break;
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			structDeclarator();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(535);
				match(Comma);
				setState(536);
				structDeclarator();
				}
				}
				setState(541);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structDeclarator);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)) | (1L << (Identifier - 61)))) != 0)) {
					{
					setState(543);
					declarator();
					}
				}

				setState(546);
				match(Colon);
				setState(547);
				constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_enumSpecifier);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(Enum);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(551);
					match(Identifier);
					}
				}

				setState(554);
				match(LeftBrace);
				setState(555);
				enumeratorList();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(556);
					match(Comma);
					}
				}

				setState(559);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(Enum);
				setState(562);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			enumerator();
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(566);
					match(Comma);
					setState(567);
					enumerator();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			enumerationConstant();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(574);
				match(Assign);
				setState(575);
				constantExpression();
				}
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(Identifier);
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

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(CParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Atomic);
			setState(581);
			match(LeftParen);
			setState(582);
			typeName();
			setState(583);
			match(RightParen);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(CParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(CParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(CParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(CParser.Noreturn, 0); }
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionSpecifier);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				gccAttributeSpecifier();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(T__27);
				setState(590);
				match(LeftParen);
				setState(591);
				match(Identifier);
				setState(592);
				match(RightParen);
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alignmentSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(Alignas);
			setState(596);
			match(LeftParen);
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(597);
				typeName();
				}
				break;
			case 2:
				{
				setState(598);
				constantExpression();
				}
				break;
			}
			setState(601);
			match(RightParen);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(603);
				pointer();
				}
			}

			setState(606);
			directDeclarator(0);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(614);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(615);
				match(LeftParen);
				setState(616);
				declarator();
				setState(617);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(619);
				match(Identifier);
				setState(620);
				match(Colon);
				setState(621);
				match(DigitSequence);
				}
				break;
			case 4:
				{
				setState(622);
				match(LeftParen);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << GlobalOrLocal) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(623);
					typeSpecifier(0);
					}
				}

				setState(626);
				pointer();
				setState(627);
				directDeclarator(0);
				setState(628);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(675);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(632);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(633);
						match(LeftBracket);
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(634);
							typeQualifierList();
							}
						}

						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
							{
							setState(637);
							assignmentExpression();
							}
						}

						setState(640);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(641);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(642);
						match(LeftBracket);
						setState(643);
						match(Static);
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(644);
							typeQualifierList();
							}
						}

						setState(647);
						assignmentExpression();
						setState(648);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(650);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(651);
						match(LeftBracket);
						setState(652);
						typeQualifierList();
						setState(653);
						match(Static);
						setState(654);
						assignmentExpression();
						setState(655);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(657);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(658);
						match(LeftBracket);
						setState(660);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(659);
							typeQualifierList();
							}
						}

						setState(662);
						match(Star);
						setState(663);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(664);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(665);
						match(LeftParen);
						setState(666);
						parameterTypeList();
						setState(667);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(669);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(670);
						match(LeftParen);
						setState(672);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(671);
							identifierList();
							}
						}

						setState(674);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGccDeclaratorExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(T__32);
				setState(681);
				match(LeftParen);
				setState(683); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(682);
					match(StringLiteral);
					}
					}
					setState(685); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(687);
				match(RightParen);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				gccAttributeSpecifier();
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

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGccAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__30);
			setState(692);
			match(LeftParen);
			setState(693);
			match(LeftParen);
			setState(694);
			gccAttributeList();
			setState(695);
			match(RightParen);
			setState(696);
			match(RightParen);
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

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGccAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_gccAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__32) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << DecStructure) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(698);
				gccAttribute();
				}
			}

			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(701);
				match(Comma);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__32) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << DecStructure) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
					{
					setState(702);
					gccAttribute();
					}
				}

				}
				}
				setState(709);
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

	public static class GccAttributeContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGccAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_gccAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (RightParen - 61)) | (1L << (Comma - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(711);
				match(LeftParen);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(712);
					argumentExpressionList();
					}
				}

				setState(715);
				match(RightParen);
				}
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

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__32) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << DecStructure) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(723);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
				case T__2:
				case T__3:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__25:
				case T__26:
				case T__27:
				case T__32:
				case T__30:
				case T__33:
				case T__34:
				case DecStructure:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case GlobalOrLocal:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case IncludeDirective:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(718);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(719);
					match(LeftParen);
					setState(720);
					nestedParenthesesBlock();
					setState(721);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(727);
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

	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> Star() { return getTokens(CParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(CParser.Star, i);
		}
		public List<TerminalNode> Caret() { return getTokens(CParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CParser.Caret, i);
		}
		public List<TypeQualifierListContext> typeQualifierList() {
			return getRuleContexts(TypeQualifierListContext.class);
		}
		public TypeQualifierListContext typeQualifierList(int i) {
			return getRuleContext(TypeQualifierListContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pointer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(728);
					_la = _input.LA(1);
					if ( !(_la==Star || _la==Caret) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(729);
						typeQualifierList();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(734); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(736);
					typeQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(739); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			parameterList();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(742);
				match(Comma);
				setState(743);
				match(Ellipsis);
				}
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			parameterDeclaration();
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					match(Comma);
					setState(748);
					parameterDeclaration();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameterDeclaration);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				declarationSpecifiers();
				setState(755);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				declarationSpecifiers2();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (LeftBracket - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)))) != 0)) {
					{
					setState(758);
					abstractDeclarator();
					}
				}

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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(Identifier);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(764);
				match(Comma);
				setState(765);
				match(Identifier);
				}
				}
				setState(770);
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			specifierQualifierList();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (LeftBracket - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)))) != 0)) {
				{
				setState(772);
				abstractDeclarator();
				}
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_abstractDeclarator);
		int _la;
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(776);
					pointer();
					}
				}

				setState(779);
				directAbstractDeclarator(0);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32 || _la==T__30) {
					{
					{
					setState(780);
					gccDeclaratorExtension();
					}
					}
					setState(785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(CParser.Static, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(789);
				match(LeftParen);
				setState(790);
				abstractDeclarator();
				setState(791);
				match(RightParen);
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(792);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(797);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(798);
				match(LeftBracket);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(799);
					typeQualifierList();
					}
				}

				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(802);
					assignmentExpression();
					}
				}

				setState(805);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(806);
				match(LeftBracket);
				setState(807);
				match(Static);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(808);
					typeQualifierList();
					}
				}

				setState(811);
				assignmentExpression();
				setState(812);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(814);
				match(LeftBracket);
				setState(815);
				typeQualifierList();
				setState(816);
				match(Static);
				setState(817);
				assignmentExpression();
				setState(818);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(820);
				match(LeftBracket);
				setState(821);
				match(Star);
				setState(822);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(823);
				match(LeftParen);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(824);
					parameterTypeList();
					}
				}

				setState(827);
				match(RightParen);
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(828);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(833);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(879);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(877);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(836);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(837);
						match(LeftBracket);
						setState(839);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(838);
							typeQualifierList();
							}
						}

						setState(842);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
							{
							setState(841);
							assignmentExpression();
							}
						}

						setState(844);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(845);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(846);
						match(LeftBracket);
						setState(847);
						match(Static);
						setState(849);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(848);
							typeQualifierList();
							}
						}

						setState(851);
						assignmentExpression();
						setState(852);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(854);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(855);
						match(LeftBracket);
						setState(856);
						typeQualifierList();
						setState(857);
						match(Static);
						setState(858);
						assignmentExpression();
						setState(859);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(861);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(862);
						match(LeftBracket);
						setState(863);
						match(Star);
						setState(864);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(865);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(866);
						match(LeftParen);
						setState(868);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(867);
							parameterTypeList();
							}
						}

						setState(870);
						match(RightParen);
						setState(874);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(871);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(876);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
	 
		public TypedefNameContext() { }
		public void copyFrom(TypedefNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlobalORlocalContext extends TypedefNameContext {
		public TerminalNode GlobalOrLocal() { return getToken(CParser.GlobalOrLocal, 0); }
		public GlobalORlocalContext(TypedefNameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitGlobalORlocal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends TypedefNameContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdContext(TypedefNameContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typedefName);
		try {
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				match(Identifier);
				}
				break;
			case GlobalOrLocal:
				_localctx = new GlobalORlocalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				match(GlobalOrLocal);
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

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_initializer);
		int _la;
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__2:
			case T__3:
			case Sizeof:
			case Alignof:
			case Generic:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(LeftBrace);
				setState(888);
				initializerList();
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(889);
					match(Comma);
					}
				}

				setState(892);
				match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(896);
				designation();
				}
			}

			setState(899);
			initializer();
			setState(907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(900);
					match(Comma);
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(901);
						designation();
						}
					}

					setState(904);
					initializer();
					}
					} 
				}
				setState(909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			designatorList();
			setState(911);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(913);
				designator();
				}
				}
				setState(916); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_designator);
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				match(LeftBracket);
				setState(919);
				constantExpression();
				setState(920);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(Dot);
				setState(923);
				match(Identifier);
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

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(CParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(StaticAssert);
			setState(927);
			match(LeftParen);
			setState(928);
			constantExpression();
			setState(929);
			match(Comma);
			setState(931); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(930);
				match(StringLiteral);
				}
				}
				setState(933); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(935);
			match(RightParen);
			setState(936);
			match(Semi);
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode Volatile() { return getToken(CParser.Volatile, 0); }
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(CParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(CParser.Colon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(941);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(942);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(943);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(944);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(945);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(946);
				match(LeftParen);
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(947);
					logicalOrExpression();
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(948);
						match(Comma);
						setState(949);
						logicalOrExpression();
						}
						}
						setState(954);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(957);
					match(Colon);
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(958);
						logicalOrExpression();
						setState(963);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(959);
							match(Comma);
							setState(960);
							logicalOrExpression();
							}
							}
							setState(965);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(972);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(973);
				match(RightParen);
				setState(974);
				match(Semi);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_labeledStatement);
		try {
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				match(Identifier);
				setState(978);
				match(Colon);
				setState(979);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				match(Case);
				setState(981);
				constantExpression();
				setState(982);
				match(Colon);
				setState(983);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(985);
				match(Default);
				setState(986);
				match(Colon);
				setState(987);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(LeftBrace);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__32) | (1L << T__30) | (1L << T__33) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(991);
				blockItemList();
				}
			}

			setState(994);
			match(RightBrace);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(996);
				blockItem();
				}
				}
				setState(999); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__32) | (1L << T__30) | (1L << T__33) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0) );
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

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_blockItem);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				declaration();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(1005);
				expression();
				}
			}

			setState(1008);
			match(Semi);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_selectionStatement);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				match(If);
				setState(1011);
				match(LeftParen);
				setState(1012);
				expression();
				setState(1013);
				match(RightParen);
				setState(1014);
				statement();
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1015);
					match(Else);
					setState(1016);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(Switch);
				setState(1020);
				match(LeftParen);
				setState(1021);
				expression();
				setState(1022);
				match(RightParen);
				setState(1023);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CParser.Do, 0); }
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode For() { return getToken(CParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_iterationStatement);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(While);
				setState(1028);
				match(LeftParen);
				setState(1029);
				expression();
				setState(1030);
				match(RightParen);
				setState(1031);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(Do);
				setState(1034);
				statement();
				setState(1035);
				match(While);
				setState(1036);
				match(LeftParen);
				setState(1037);
				expression();
				setState(1038);
				match(RightParen);
				setState(1039);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041);
				match(For);
				setState(1042);
				match(LeftParen);
				setState(1043);
				forCondition();
				setState(1044);
				match(RightParen);
				setState(1045);
				statement();
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

	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(CParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1049);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1050);
					expression();
					}
				}

				}
				break;
			}
			setState(1055);
			match(Semi);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(1056);
				forExpression();
				}
			}

			setState(1059);
			match(Semi);
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(1060);
				forExpression();
				}
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

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			declarationSpecifiers();
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LeftParen - 61)) | (1L << (Star - 61)) | (1L << (Caret - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(1064);
				initDeclaratorList();
				}
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

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			assignmentExpression();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1068);
				match(Comma);
				setState(1069);
				assignmentExpression();
				}
				}
				setState(1074);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public TerminalNode Goto() { return getToken(CParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode Return() { return getToken(CParser.Return, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Continue() { return getToken(CParser.Continue, 0); }
		public TerminalNode Break() { return getToken(CParser.Break, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1075);
				match(Goto);
				setState(1076);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1077);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(1078);
				match(Return);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__2) | (1L << T__3) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Plus - 73)) | (1L << (PlusPlus - 73)) | (1L << (Minus - 73)) | (1L << (MinusMinus - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (AndAnd - 73)) | (1L << (Not - 73)) | (1L << (Tilde - 73)) | (1L << (Identifier - 73)) | (1L << (Constant - 73)) | (1L << (DigitSequence - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(1079);
					expression();
					}
				}

				}
				break;
			case 4:
				{
				setState(1082);
				match(Goto);
				setState(1083);
				unaryExpression();
				}
				break;
			}
			setState(1086);
			match(Semi);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1088);
				externalDeclaration();
				}
				}
				setState(1091); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Star - 77)) | (1L << (Caret - 77)) | (1L << (Semi - 77)) | (1L << (Identifier - 77)))) != 0) );
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_externalDeclaration);
		try {
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1095);
				match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1098);
				declarationSpecifiers();
				}
				break;
			}
			setState(1101);
			declarator();
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1102);
				declarationList();
				}
			}

			setState(1105);
			compoundStatement();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1107);
				declaration();
				}
				}
				setState(1110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << GlobalOrLocal) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier );
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

	public static class DecstrutContext extends ParserRuleContext {
		public DecstrutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decstrut; }
	 
		public DecstrutContext() { }
		public void copyFrom(DecstrutContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecStructContext extends DecstrutContext {
		public TerminalNode DecStructure() { return getToken(CParser.DecStructure, 0); }
		public DecStructContext(DecstrutContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDecStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecstrutContext decstrut() throws RecognitionException {
		DecstrutContext _localctx = new DecstrutContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_decstrut);
		try {
			_localctx = new DecStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(DecStructure);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 49:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 63:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3z\u045d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\5\2\u00b4\n\2\3\2\3\2\3\3\3\3\3\3\6"+
		"\3\u00bb\n\3\r\3\16\3\u00bc\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c5\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00d9\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u00e5\n\5\f\5"+
		"\16\5\u00e8\13\5\3\6\3\6\5\6\u00ec\n\6\3\6\3\6\3\6\3\7\3\7\5\7\u00f3\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00fb\n\7\3\7\3\7\5\7\u00ff\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0107\n\7\3\7\3\7\3\7\3\7\7\7\u010d\n\7\f\7\16\7"+
		"\u0110\13\7\3\b\3\b\3\b\7\b\u0115\n\b\f\b\16\b\u0118\13\b\3\t\7\t\u011b"+
		"\n\t\f\t\16\t\u011e\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u012b\n\t\3\n\3\n\3\13\5\13\u0130\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0139\n\13\3\f\3\f\3\f\7\f\u013e\n\f\f\f\16\f\u0141\13\f\3"+
		"\r\3\r\3\r\7\r\u0146\n\r\f\r\16\r\u0149\13\r\3\16\3\16\3\16\7\16\u014e"+
		"\n\16\f\16\16\16\u0151\13\16\3\17\3\17\3\17\7\17\u0156\n\17\f\17\16\17"+
		"\u0159\13\17\3\20\3\20\3\20\7\20\u015e\n\20\f\20\16\20\u0161\13\20\3\21"+
		"\3\21\3\21\7\21\u0166\n\21\f\21\16\21\u0169\13\21\3\22\3\22\3\22\7\22"+
		"\u016e\n\22\f\22\16\22\u0171\13\22\3\23\3\23\3\23\7\23\u0176\n\23\f\23"+
		"\16\23\u0179\13\23\3\24\3\24\3\24\7\24\u017e\n\24\f\24\16\24\u0181\13"+
		"\24\3\25\3\25\3\25\7\25\u0186\n\25\f\25\16\25\u0189\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0191\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0199\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u01a0\n\31\f\31\16\31\u01a3"+
		"\13\31\3\32\3\32\3\33\3\33\5\33\u01a9\n\33\3\33\3\33\3\33\5\33\u01ae\n"+
		"\33\3\34\6\34\u01b1\n\34\r\34\16\34\u01b2\3\35\6\35\u01b6\n\35\r\35\16"+
		"\35\u01b7\3\36\3\36\3\36\3\36\3\36\5\36\u01bf\n\36\3\37\3\37\3\37\7\37"+
		"\u01c4\n\37\f\37\16\37\u01c7\13\37\3 \3 \3 \5 \u01cc\n \3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ec\n\"\3\"\3\"\7\"\u01f0\n\""+
		"\f\"\16\"\u01f3\13\"\3#\3#\5#\u01f7\n#\3#\3#\3#\3#\3#\3#\3#\5#\u0200\n"+
		"#\3$\3$\3%\6%\u0205\n%\r%\16%\u0206\3&\3&\5&\u020b\n&\3&\3&\3&\5&\u0210"+
		"\n&\3\'\3\'\5\'\u0214\n\'\3\'\5\'\u0217\n\'\3(\3(\3(\7(\u021c\n(\f(\16"+
		"(\u021f\13(\3)\3)\5)\u0223\n)\3)\3)\5)\u0227\n)\3*\3*\5*\u022b\n*\3*\3"+
		"*\3*\5*\u0230\n*\3*\3*\3*\3*\5*\u0236\n*\3+\3+\3+\7+\u023b\n+\f+\16+\u023e"+
		"\13+\3,\3,\3,\5,\u0243\n,\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\5\60\u0254\n\60\3\61\3\61\3\61\3\61\5\61\u025a\n\61\3\61"+
		"\3\61\3\62\5\62\u025f\n\62\3\62\3\62\7\62\u0263\n\62\f\62\16\62\u0266"+
		"\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0273"+
		"\n\63\3\63\3\63\3\63\3\63\5\63\u0279\n\63\3\63\3\63\3\63\5\63\u027e\n"+
		"\63\3\63\5\63\u0281\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u0288\n\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0297"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02a3\n\63"+
		"\3\63\7\63\u02a6\n\63\f\63\16\63\u02a9\13\63\3\64\3\64\3\64\6\64\u02ae"+
		"\n\64\r\64\16\64\u02af\3\64\3\64\5\64\u02b4\n\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\5\66\u02be\n\66\3\66\3\66\5\66\u02c2\n\66\7\66\u02c4"+
		"\n\66\f\66\16\66\u02c7\13\66\3\67\3\67\3\67\5\67\u02cc\n\67\3\67\5\67"+
		"\u02cf\n\67\38\38\38\38\38\78\u02d6\n8\f8\168\u02d9\138\39\39\59\u02dd"+
		"\n9\69\u02df\n9\r9\169\u02e0\3:\6:\u02e4\n:\r:\16:\u02e5\3;\3;\3;\5;\u02eb"+
		"\n;\3<\3<\3<\7<\u02f0\n<\f<\16<\u02f3\13<\3=\3=\3=\3=\3=\5=\u02fa\n=\5"+
		"=\u02fc\n=\3>\3>\3>\7>\u0301\n>\f>\16>\u0304\13>\3?\3?\5?\u0308\n?\3@"+
		"\3@\5@\u030c\n@\3@\3@\7@\u0310\n@\f@\16@\u0313\13@\5@\u0315\n@\3A\3A\3"+
		"A\3A\3A\7A\u031c\nA\fA\16A\u031f\13A\3A\3A\5A\u0323\nA\3A\5A\u0326\nA"+
		"\3A\3A\3A\3A\5A\u032c\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A"+
		"\u033c\nA\3A\3A\7A\u0340\nA\fA\16A\u0343\13A\5A\u0345\nA\3A\3A\3A\5A\u034a"+
		"\nA\3A\5A\u034d\nA\3A\3A\3A\3A\3A\5A\u0354\nA\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0367\nA\3A\3A\7A\u036b\nA\fA\16A\u036e"+
		"\13A\7A\u0370\nA\fA\16A\u0373\13A\3B\3B\5B\u0377\nB\3C\3C\3C\3C\5C\u037d"+
		"\nC\3C\3C\5C\u0381\nC\3D\5D\u0384\nD\3D\3D\3D\5D\u0389\nD\3D\7D\u038c"+
		"\nD\fD\16D\u038f\13D\3E\3E\3E\3F\6F\u0395\nF\rF\16F\u0396\3G\3G\3G\3G"+
		"\3G\3G\5G\u039f\nG\3H\3H\3H\3H\3H\6H\u03a6\nH\rH\16H\u03a7\3H\3H\3H\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u03b9\nI\fI\16I\u03bc\13I\5I\u03be"+
		"\nI\3I\3I\3I\3I\7I\u03c4\nI\fI\16I\u03c7\13I\5I\u03c9\nI\7I\u03cb\nI\f"+
		"I\16I\u03ce\13I\3I\3I\5I\u03d2\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J"+
		"\u03df\nJ\3K\3K\5K\u03e3\nK\3K\3K\3L\6L\u03e8\nL\rL\16L\u03e9\3M\3M\5"+
		"M\u03ee\nM\3N\5N\u03f1\nN\3N\3N\3O\3O\3O\3O\3O\3O\3O\5O\u03fc\nO\3O\3"+
		"O\3O\3O\3O\3O\5O\u0404\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\5P\u041a\nP\3Q\3Q\5Q\u041e\nQ\5Q\u0420\nQ\3Q\3Q\5Q\u0424"+
		"\nQ\3Q\3Q\5Q\u0428\nQ\3R\3R\5R\u042c\nR\3S\3S\3S\7S\u0431\nS\fS\16S\u0434"+
		"\13S\3T\3T\3T\3T\3T\5T\u043b\nT\3T\3T\5T\u043f\nT\3T\3T\3U\6U\u0444\n"+
		"U\rU\16U\u0445\3V\3V\3V\5V\u044b\nV\3W\5W\u044e\nW\3W\3W\5W\u0452\nW\3"+
		"W\3W\3X\6X\u0457\nX\rX\16X\u0458\3Y\3Y\3Y\2\5Bd\u0080Z\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\2\30\3\2jk\4\2LLNN\5\2**LLNN\4\2**\66\66\7\2KKMMOO"+
		"RRWX\3\2OQ\4\2KKMM\3\2IJ\3\2EH\3\2hi\3\2]g\b\2\22\22\35\35%%++..>>\3\2"+
		"\6\b\4\2,,//\6\2\26\26&&\62\62\67\67\5\2\n\13\"\"<<\4\2?@\\\\\3\2?@\4"+
		"\2OOVV\4\2\r\r\17\17\4\2\20\20\62\62\4\2\23\23\27\27\2\u04c7\2\u00b3\3"+
		"\2\2\2\4\u00d8\3\2\2\2\6\u00da\3\2\2\2\b\u00e1\3\2\2\2\n\u00eb\3\2\2\2"+
		"\f\u00fe\3\2\2\2\16\u0111\3\2\2\2\20\u011c\3\2\2\2\22\u012c\3\2\2\2\24"+
		"\u0138\3\2\2\2\26\u013a\3\2\2\2\30\u0142\3\2\2\2\32\u014a\3\2\2\2\34\u0152"+
		"\3\2\2\2\36\u015a\3\2\2\2 \u0162\3\2\2\2\"\u016a\3\2\2\2$\u0172\3\2\2"+
		"\2&\u017a\3\2\2\2(\u0182\3\2\2\2*\u018a\3\2\2\2,\u0198\3\2\2\2.\u019a"+
		"\3\2\2\2\60\u019c\3\2\2\2\62\u01a4\3\2\2\2\64\u01ad\3\2\2\2\66\u01b0\3"+
		"\2\2\28\u01b5\3\2\2\2:\u01be\3\2\2\2<\u01c0\3\2\2\2>\u01c8\3\2\2\2@\u01cd"+
		"\3\2\2\2B\u01eb\3\2\2\2D\u01ff\3\2\2\2F\u0201\3\2\2\2H\u0204\3\2\2\2J"+
		"\u020f\3\2\2\2L\u0213\3\2\2\2N\u0218\3\2\2\2P\u0226\3\2\2\2R\u0235\3\2"+
		"\2\2T\u0237\3\2\2\2V\u023f\3\2\2\2X\u0244\3\2\2\2Z\u0246\3\2\2\2\\\u024b"+
		"\3\2\2\2^\u0253\3\2\2\2`\u0255\3\2\2\2b\u025e\3\2\2\2d\u0278\3\2\2\2f"+
		"\u02b3\3\2\2\2h\u02b5\3\2\2\2j\u02bd\3\2\2\2l\u02c8\3\2\2\2n\u02d7\3\2"+
		"\2\2p\u02de\3\2\2\2r\u02e3\3\2\2\2t\u02e7\3\2\2\2v\u02ec\3\2\2\2x\u02fb"+
		"\3\2\2\2z\u02fd\3\2\2\2|\u0305\3\2\2\2~\u0314\3\2\2\2\u0080\u0344\3\2"+
		"\2\2\u0082\u0376\3\2\2\2\u0084\u0380\3\2\2\2\u0086\u0383\3\2\2\2\u0088"+
		"\u0390\3\2\2\2\u008a\u0394\3\2\2\2\u008c\u039e\3\2\2\2\u008e\u03a0\3\2"+
		"\2\2\u0090\u03d1\3\2\2\2\u0092\u03de\3\2\2\2\u0094\u03e0\3\2\2\2\u0096"+
		"\u03e7\3\2\2\2\u0098\u03ed\3\2\2\2\u009a\u03f0\3\2\2\2\u009c\u0403\3\2"+
		"\2\2\u009e\u0419\3\2\2\2\u00a0\u041f\3\2\2\2\u00a2\u0429\3\2\2\2\u00a4"+
		"\u042d\3\2\2\2\u00a6\u043e\3\2\2\2\u00a8\u0443\3\2\2\2\u00aa\u044a\3\2"+
		"\2\2\u00ac\u044d\3\2\2\2\u00ae\u0456\3\2\2\2\u00b0\u045a\3\2\2\2\u00b2"+
		"\u00b4\5\u00a8U\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\7\2\2\3\u00b6\3\3\2\2\2\u00b7\u00d9\7m\2\2\u00b8"+
		"\u00d9\7n\2\2\u00b9\u00bb\7p\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00d9\3\2\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf\u00c0\5\60\31\2\u00c0\u00c1\7@\2\2\u00c1\u00d9\3\2\2\2\u00c2"+
		"\u00d9\5\6\4\2\u00c3\u00c5\7\3\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7\u00c8\5\u0094K\2\u00c8"+
		"\u00c9\7@\2\2\u00c9\u00d9\3\2\2\2\u00ca\u00cb\7\4\2\2\u00cb\u00cc\7?\2"+
		"\2\u00cc\u00cd\5\20\t\2\u00cd\u00ce\7\\\2\2\u00ce\u00cf\5|?\2\u00cf\u00d0"+
		"\7@\2\2\u00d0\u00d9\3\2\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\7?\2\2\u00d3"+
		"\u00d4\5|?\2\u00d4\u00d5\7\\\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7@\2"+
		"\2\u00d7\u00d9\3\2\2\2\u00d8\u00b7\3\2\2\2\u00d8\u00b8\3\2\2\2\u00d8\u00ba"+
		"\3\2\2\2\u00d8\u00be\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8\u00c4\3\2\2\2\u00d8"+
		"\u00ca\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d9\5\3\2\2\2\u00da\u00db\7:\2\2"+
		"\u00db\u00dc\7?\2\2\u00dc\u00dd\5,\27\2\u00dd\u00de\7\\\2\2\u00de\u00df"+
		"\5\b\5\2\u00df\u00e0\7@\2\2\u00e0\7\3\2\2\2\u00e1\u00e6\5\n\6\2\u00e2"+
		"\u00e3\7\\\2\2\u00e3\u00e5\5\n\6\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\t\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ec\5|?\2\u00ea\u00ec\7\30\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7Z\2\2\u00ee\u00ef\5,\27"+
		"\2\u00ef\13\3\2\2\2\u00f0\u00ff\5\4\3\2\u00f1\u00f3\7\3\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7?\2\2\u00f5"+
		"\u00f6\5|?\2\u00f6\u00f7\7@\2\2\u00f7\u00f8\7C\2\2\u00f8\u00fa\5\u0086"+
		"D\2\u00f9\u00fb\7\\\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\7D\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f0\3\2"+
		"\2\2\u00fe\u00f2\3\2\2\2\u00ff\u010e\3\2\2\2\u0100\u0101\7A\2\2\u0101"+
		"\u0102\5\60\31\2\u0102\u0103\7B\2\2\u0103\u010d\3\2\2\2\u0104\u0106\7"+
		"?\2\2\u0105\u0107\5\16\b\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010d\7@\2\2\u0109\u010a\t\2\2\2\u010a\u010d\7m\2"+
		"\2\u010b\u010d\t\3\2\2\u010c\u0100\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0109"+
		"\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\r\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0116\5,\27\2"+
		"\u0112\u0113\7\\\2\2\u0113\u0115\5,\27\2\u0114\u0112\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\17\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\t\4\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u012a\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u012b\5\f\7\2\u0120\u0121\5\22\n\2\u0121\u0122\5"+
		"\24\13\2\u0122\u012b\3\2\2\2\u0123\u0124\t\5\2\2\u0124\u0125\7?\2\2\u0125"+
		"\u0126\5|?\2\u0126\u0127\7@\2\2\u0127\u012b\3\2\2\2\u0128\u0129\7T\2\2"+
		"\u0129\u012b\7m\2\2\u012a\u011f\3\2\2\2\u012a\u0120\3\2\2\2\u012a\u0123"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\21\3\2\2\2\u012c\u012d\t\6\2\2\u012d"+
		"\23\3\2\2\2\u012e\u0130\7\3\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130\u0131\3\2\2\2\u0131\u0132\7?\2\2\u0132\u0133\5|?\2\u0133\u0134"+
		"\7@\2\2\u0134\u0135\5\24\13\2\u0135\u0139\3\2\2\2\u0136\u0139\5\20\t\2"+
		"\u0137\u0139\7o\2\2\u0138\u012f\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\25\3\2\2\2\u013a\u013f\5\24\13\2\u013b\u013c\t\7\2\2\u013c"+
		"\u013e\5\24\13\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u0140\27\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0147\5\26\f\2\u0143\u0144\t\b\2\2\u0144\u0146\5\26\f\2\u0145\u0143\3"+
		"\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\31\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014f\5\30\r\2\u014b\u014c\t\t\2"+
		"\2\u014c\u014e\5\30\r\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\33\3\2\2\2\u0151\u014f\3\2\2"+
		"\2\u0152\u0157\5\32\16\2\u0153\u0154\t\n\2\2\u0154\u0156\5\32\16\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\35\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015f\5\34\17\2\u015b"+
		"\u015c\t\13\2\2\u015c\u015e\5\34\17\2\u015d\u015b\3\2\2\2\u015e\u0161"+
		"\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\37\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0167\5\36\20\2\u0163\u0164\7R\2\2\u0164\u0166\5"+
		"\36\20\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168!\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016f\5 \21\2"+
		"\u016b\u016c\7V\2\2\u016c\u016e\5 \21\2\u016d\u016b\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170#\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0177\5\"\22\2\u0173\u0174\7S\2\2\u0174\u0176\5\""+
		"\22\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178%\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017f\5$\23\2"+
		"\u017b\u017c\7T\2\2\u017c\u017e\5$\23\2\u017d\u017b\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\'\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0187\5&\24\2\u0183\u0184\7U\2\2\u0184\u0186\5&\24"+
		"\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188)\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u0190\5(\25\2\u018b"+
		"\u018c\7Y\2\2\u018c\u018d\5\60\31\2\u018d\u018e\7Z\2\2\u018e\u018f\5*"+
		"\26\2\u018f\u0191\3\2\2\2\u0190\u018b\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"+\3\2\2\2\u0192\u0199\5*\26\2\u0193\u0194\5\20\t\2\u0194\u0195\5.\30\2"+
		"\u0195\u0196\5,\27\2\u0196\u0199\3\2\2\2\u0197\u0199\7o\2\2\u0198\u0192"+
		"\3\2\2\2\u0198\u0193\3\2\2\2\u0198\u0197\3\2\2\2\u0199-\3\2\2\2\u019a"+
		"\u019b\t\f\2\2\u019b/\3\2\2\2\u019c\u01a1\5,\27\2\u019d\u019e\7\\\2\2"+
		"\u019e\u01a0\5,\27\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\61\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a5\5*\26\2\u01a5\63\3\2\2\2\u01a6\u01a8\5\66\34\2\u01a7\u01a9\5<\37"+
		"\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab"+
		"\7[\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01ae\5\u008eH\2\u01ad\u01a6\3\2\2\2"+
		"\u01ad\u01ac\3\2\2\2\u01ae\65\3\2\2\2\u01af\u01b1\5:\36\2\u01b0\u01af"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\67\3\2\2\2\u01b4\u01b6\5:\36\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2\2"+
		"\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b89\3\2\2\2\u01b9\u01bf"+
		"\5@!\2\u01ba\u01bf\5B\"\2\u01bb\u01bf\5\\/\2\u01bc\u01bf\5^\60\2\u01bd"+
		"\u01bf\5`\61\2\u01be\u01b9\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2"+
		"\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf;\3\2\2\2\u01c0\u01c5"+
		"\5> \2\u01c1\u01c2\7\\\2\2\u01c2\u01c4\5> \2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6=\3\2\2\2"+
		"\u01c7\u01c5\3\2\2\2\u01c8\u01cb\5b\62\2\u01c9\u01ca\7]\2\2\u01ca\u01cc"+
		"\5\u0084C\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc?\3\2\2\2\u01cd"+
		"\u01ce\t\r\2\2\u01ceA\3\2\2\2\u01cf\u01d0\b\"\1\2\u01d0\u01ec\7\61\2\2"+
		"\u01d1\u01ec\7\25\2\2\u01d2\u01ec\7(\2\2\u01d3\u01ec\7#\2\2\u01d4\u01ec"+
		"\7$\2\2\u01d5\u01ec\7\36\2\2\u01d6\u01ec\7\32\2\2\u01d7\u01ec\7)\2\2\u01d8"+
		"\u01ec\7\60\2\2\u01d9\u01ec\78\2\2\u01da\u01ec\79\2\2\u01db\u01ec\7\6"+
		"\2\2\u01dc\u01ec\7\7\2\2\u01dd\u01ec\7\b\2\2\u01de\u01df\7\3\2\2\u01df"+
		"\u01e0\7?\2\2\u01e0\u01e1\t\16\2\2\u01e1\u01ec\7@\2\2\u01e2\u01ec\5Z."+
		"\2\u01e3\u01ec\5D#\2\u01e4\u01ec\5R*\2\u01e5\u01ec\5\u0082B\2\u01e6\u01e7"+
		"\7\t\2\2\u01e7\u01e8\7?\2\2\u01e8\u01e9\5\62\32\2\u01e9\u01ea\7@\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01cf\3\2\2\2\u01eb\u01d1\3\2\2\2\u01eb\u01d2\3\2"+
		"\2\2\u01eb\u01d3\3\2\2\2\u01eb\u01d4\3\2\2\2\u01eb\u01d5\3\2\2\2\u01eb"+
		"\u01d6\3\2\2\2\u01eb\u01d7\3\2\2\2\u01eb\u01d8\3\2\2\2\u01eb\u01d9\3\2"+
		"\2\2\u01eb\u01da\3\2\2\2\u01eb\u01db\3\2\2\2\u01eb\u01dc\3\2\2\2\u01eb"+
		"\u01dd\3\2\2\2\u01eb\u01de\3\2\2\2\u01eb\u01e2\3\2\2\2\u01eb\u01e3\3\2"+
		"\2\2\u01eb\u01e4\3\2\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01e6\3\2\2\2\u01ec"+
		"\u01f1\3\2\2\2\u01ed\u01ee\f\3\2\2\u01ee\u01f0\5p9\2\u01ef\u01ed\3\2\2"+
		"\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2C"+
		"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\5F$\2\u01f5\u01f7\7m\2\2\u01f6"+
		"\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7C"+
		"\2\2\u01f9\u01fa\5H%\2\u01fa\u01fb\7D\2\2\u01fb\u0200\3\2\2\2\u01fc\u01fd"+
		"\5F$\2\u01fd\u01fe\7m\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f4\3\2\2\2\u01ff"+
		"\u01fc\3\2\2\2\u0200E\3\2\2\2\u0201\u0202\t\17\2\2\u0202G\3\2\2\2\u0203"+
		"\u0205\5J&\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204\3\2\2"+
		"\2\u0206\u0207\3\2\2\2\u0207I\3\2\2\2\u0208\u020a\5L\'\2\u0209\u020b\5"+
		"N(\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\7[\2\2\u020d\u0210\3\2\2\2\u020e\u0210\5\u008eH\2\u020f\u0208\3"+
		"\2\2\2\u020f\u020e\3\2\2\2\u0210K\3\2\2\2\u0211\u0214\5B\"\2\u0212\u0214"+
		"\5\\/\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0216\3\2\2\2\u0215"+
		"\u0217\5L\'\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217M\3\2\2\2\u0218"+
		"\u021d\5P)\2\u0219\u021a\7\\\2\2\u021a\u021c\5P)\2\u021b\u0219\3\2\2\2"+
		"\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021eO\3"+
		"\2\2\2\u021f\u021d\3\2\2\2\u0220\u0227\5b\62\2\u0221\u0223\5b\62\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7Z"+
		"\2\2\u0225\u0227\5\62\32\2\u0226\u0220\3\2\2\2\u0226\u0222\3\2\2\2\u0227"+
		"Q\3\2\2\2\u0228\u022a\7\34\2\2\u0229\u022b\7m\2\2\u022a\u0229\3\2\2\2"+
		"\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7C\2\2\u022d\u022f"+
		"\5T+\2\u022e\u0230\7\\\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0232\7D\2\2\u0232\u0236\3\2\2\2\u0233\u0234\7\34"+
		"\2\2\u0234\u0236\7m\2\2\u0235\u0228\3\2\2\2\u0235\u0233\3\2\2\2\u0236"+
		"S\3\2\2\2\u0237\u023c\5V,\2\u0238\u0239\7\\\2\2\u0239\u023b\5V,\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023dU\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0242\5X-\2\u0240\u0241"+
		"\7]\2\2\u0241\u0243\5\62\32\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2"+
		"\u0243W\3\2\2\2\u0244\u0245\7m\2\2\u0245Y\3\2\2\2\u0246\u0247\7\67\2\2"+
		"\u0247\u0248\7?\2\2\u0248\u0249\5|?\2\u0249\u024a\7@\2\2\u024a[\3\2\2"+
		"\2\u024b\u024c\t\20\2\2\u024c]\3\2\2\2\u024d\u0254\t\21\2\2\u024e\u0254"+
		"\5h\65\2\u024f\u0250\7\f\2\2\u0250\u0251\7?\2\2\u0251\u0252\7m\2\2\u0252"+
		"\u0254\7@\2\2\u0253\u024d\3\2\2\2\u0253\u024e\3\2\2\2\u0253\u024f\3\2"+
		"\2\2\u0254_\3\2\2\2\u0255\u0256\7\65\2\2\u0256\u0259\7?\2\2\u0257\u025a"+
		"\5|?\2\u0258\u025a\5\62\32\2\u0259\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\7@\2\2\u025ca\3\2\2\2\u025d\u025f\5p9\2\u025e"+
		"\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0264\5d"+
		"\63\2\u0261\u0263\5f\64\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265c\3\2\2\2\u0266\u0264\3\2\2\2"+
		"\u0267\u0268\b\63\1\2\u0268\u0279\7m\2\2\u0269\u026a\7?\2\2\u026a\u026b"+
		"\5b\62\2\u026b\u026c\7@\2\2\u026c\u0279\3\2\2\2\u026d\u026e\7m\2\2\u026e"+
		"\u026f\7Z\2\2\u026f\u0279\7o\2\2\u0270\u0272\7?\2\2\u0271\u0273\5B\"\2"+
		"\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275"+
		"\5p9\2\u0275\u0276\5d\63\2\u0276\u0277\7@\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u0267\3\2\2\2\u0278\u0269\3\2\2\2\u0278\u026d\3\2\2\2\u0278\u0270\3\2"+
		"\2\2\u0279\u02a7\3\2\2\2\u027a\u027b\f\n\2\2\u027b\u027d\7A\2\2\u027c"+
		"\u027e\5r:\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2"+
		"\2\u027f\u0281\5,\27\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u02a6\7B\2\2\u0283\u0284\f\t\2\2\u0284\u0285\7A\2\2\u0285"+
		"\u0287\7+\2\2\u0286\u0288\5r:\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2"+
		"\2\u0288\u0289\3\2\2\2\u0289\u028a\5,\27\2\u028a\u028b\7B\2\2\u028b\u02a6"+
		"\3\2\2\2\u028c\u028d\f\b\2\2\u028d\u028e\7A\2\2\u028e\u028f\5r:\2\u028f"+
		"\u0290\7+\2\2\u0290\u0291\5,\27\2\u0291\u0292\7B\2\2\u0292\u02a6\3\2\2"+
		"\2\u0293\u0294\f\7\2\2\u0294\u0296\7A\2\2\u0295\u0297\5r:\2\u0296\u0295"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7O\2\2\u0299"+
		"\u02a6\7B\2\2\u029a\u029b\f\6\2\2\u029b\u029c\7?\2\2\u029c\u029d\5t;\2"+
		"\u029d\u029e\7@\2\2\u029e\u02a6\3\2\2\2\u029f\u02a0\f\5\2\2\u02a0\u02a2"+
		"\7?\2\2\u02a1\u02a3\5z>\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a6\7@\2\2\u02a5\u027a\3\2\2\2\u02a5\u0283\3\2"+
		"\2\2\u02a5\u028c\3\2\2\2\u02a5\u0293\3\2\2\2\u02a5\u029a\3\2\2\2\u02a5"+
		"\u029f\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8e\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab\7\r\2\2\u02ab\u02ad"+
		"\7?\2\2\u02ac\u02ae\7p\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b4\7@"+
		"\2\2\u02b2\u02b4\5h\65\2\u02b3\u02aa\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"g\3\2\2\2\u02b5\u02b6\7\16\2\2\u02b6\u02b7\7?\2\2\u02b7\u02b8\7?\2\2\u02b8"+
		"\u02b9\5j\66\2\u02b9\u02ba\7@\2\2\u02ba\u02bb\7@\2\2\u02bbi\3\2\2\2\u02bc"+
		"\u02be\5l\67\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c5\3\2"+
		"\2\2\u02bf\u02c1\7\\\2\2\u02c0\u02c2\5l\67\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c4\u02c7\3\2"+
		"\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6k\3\2\2\2\u02c7\u02c5"+
		"\3\2\2\2\u02c8\u02ce\n\22\2\2\u02c9\u02cb\7?\2\2\u02ca\u02cc\5\16\b\2"+
		"\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf"+
		"\7@\2\2\u02ce\u02c9\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfm\3\2\2\2\u02d0\u02d6"+
		"\n\23\2\2\u02d1\u02d2\7?\2\2\u02d2\u02d3\5n8\2\u02d3\u02d4\7@\2\2\u02d4"+
		"\u02d6\3\2\2\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6\u02d9\3\2"+
		"\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8o\3\2\2\2\u02d9\u02d7"+
		"\3\2\2\2\u02da\u02dc\t\24\2\2\u02db\u02dd\5r:\2\u02dc\u02db\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02da\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1q\3\2\2\2\u02e2\u02e4"+
		"\5\\/\2\u02e3\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6s\3\2\2\2\u02e7\u02ea\5v<\2\u02e8\u02e9\7\\\2\2\u02e9"+
		"\u02eb\7l\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02ebu\3\2\2\2\u02ec"+
		"\u02f1\5x=\2\u02ed\u02ee\7\\\2\2\u02ee\u02f0\5x=\2\u02ef\u02ed\3\2\2\2"+
		"\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2w\3"+
		"\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f5\5\66\34\2\u02f5\u02f6\5b\62\2\u02f6"+
		"\u02fc\3\2\2\2\u02f7\u02f9\58\35\2\u02f8\u02fa\5~@\2\u02f9\u02f8\3\2\2"+
		"\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f4\3\2\2\2\u02fb\u02f7"+
		"\3\2\2\2\u02fcy\3\2\2\2\u02fd\u0302\7m\2\2\u02fe\u02ff\7\\\2\2\u02ff\u0301"+
		"\7m\2\2\u0300\u02fe\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303{\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0307\5L\'\2\u0306"+
		"\u0308\5~@\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308}\3\2\2\2\u0309"+
		"\u0315\5p9\2\u030a\u030c\5p9\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2"+
		"\u030c\u030d\3\2\2\2\u030d\u0311\5\u0080A\2\u030e\u0310\5f\64\2\u030f"+
		"\u030e\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0309\3\2\2\2\u0314"+
		"\u030b\3\2\2\2\u0315\177\3\2\2\2\u0316\u0317\bA\1\2\u0317\u0318\7?\2\2"+
		"\u0318\u0319\5~@\2\u0319\u031d\7@\2\2\u031a\u031c\5f\64\2\u031b\u031a"+
		"\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u0345\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0322\7A\2\2\u0321\u0323\5r:"+
		"\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324\u0326"+
		"\5,\27\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0345\7B\2\2\u0328\u0329\7A\2\2\u0329\u032b\7+\2\2\u032a\u032c\5r:\2"+
		"\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e"+
		"\5,\27\2\u032e\u032f\7B\2\2\u032f\u0345\3\2\2\2\u0330\u0331\7A\2\2\u0331"+
		"\u0332\5r:\2\u0332\u0333\7+\2\2\u0333\u0334\5,\27\2\u0334\u0335\7B\2\2"+
		"\u0335\u0345\3\2\2\2\u0336\u0337\7A\2\2\u0337\u0338\7O\2\2\u0338\u0345"+
		"\7B\2\2\u0339\u033b\7?\2\2\u033a\u033c\5t;\2\u033b\u033a\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0341\7@\2\2\u033e\u0340\5f\64"+
		"\2\u033f\u033e\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342"+
		"\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0316\3\2\2\2\u0344"+
		"\u0320\3\2\2\2\u0344\u0328\3\2\2\2\u0344\u0330\3\2\2\2\u0344\u0336\3\2"+
		"\2\2\u0344\u0339\3\2\2\2\u0345\u0371\3\2\2\2\u0346\u0347\f\7\2\2\u0347"+
		"\u0349\7A\2\2\u0348\u034a\5r:\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2"+
		"\2\u034a\u034c\3\2\2\2\u034b\u034d\5,\27\2\u034c\u034b\3\2\2\2\u034c\u034d"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0370\7B\2\2\u034f\u0350\f\6\2\2\u0350"+
		"\u0351\7A\2\2\u0351\u0353\7+\2\2\u0352\u0354\5r:\2\u0353\u0352\3\2\2\2"+
		"\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\5,\27\2\u0356\u0357"+
		"\7B\2\2\u0357\u0370\3\2\2\2\u0358\u0359\f\5\2\2\u0359\u035a\7A\2\2\u035a"+
		"\u035b\5r:\2\u035b\u035c\7+\2\2\u035c\u035d\5,\27\2\u035d\u035e\7B\2\2"+
		"\u035e\u0370\3\2\2\2\u035f\u0360\f\4\2\2\u0360\u0361\7A\2\2\u0361\u0362"+
		"\7O\2\2\u0362\u0370\7B\2\2\u0363\u0364\f\3\2\2\u0364\u0366\7?\2\2\u0365"+
		"\u0367\5t;\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2"+
		"\2\u0368\u036c\7@\2\2\u0369\u036b\5f\64\2\u036a\u0369\3\2\2\2\u036b\u036e"+
		"\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0370\3\2\2\2\u036e"+
		"\u036c\3\2\2\2\u036f\u0346\3\2\2\2\u036f\u034f\3\2\2\2\u036f\u0358\3\2"+
		"\2\2\u036f\u035f\3\2\2\2\u036f\u0363\3\2\2\2\u0370\u0373\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0081\3\2\2\2\u0373\u0371\3\2"+
		"\2\2\u0374\u0377\7m\2\2\u0375\u0377\7\64\2\2\u0376\u0374\3\2\2\2\u0376"+
		"\u0375\3\2\2\2\u0377\u0083\3\2\2\2\u0378\u0381\5,\27\2\u0379\u037a\7C"+
		"\2\2\u037a\u037c\5\u0086D\2\u037b\u037d\7\\\2\2\u037c\u037b\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\7D\2\2\u037f\u0381\3\2"+
		"\2\2\u0380\u0378\3\2\2\2\u0380\u0379\3\2\2\2\u0381\u0085\3\2\2\2\u0382"+
		"\u0384\5\u0088E\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385\u038d\5\u0084C\2\u0386\u0388\7\\\2\2\u0387\u0389\5\u0088"+
		"E\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038c\5\u0084C\2\u038b\u0386\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0087\3\2\2\2\u038f\u038d\3\2\2\2\u0390"+
		"\u0391\5\u008aF\2\u0391\u0392\7]\2\2\u0392\u0089\3\2\2\2\u0393\u0395\5"+
		"\u008cG\2\u0394\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0394\3\2\2\2"+
		"\u0396\u0397\3\2\2\2\u0397\u008b\3\2\2\2\u0398\u0399\7A\2\2\u0399\u039a"+
		"\5\62\32\2\u039a\u039b\7B\2\2\u039b\u039f\3\2\2\2\u039c\u039d\7k\2\2\u039d"+
		"\u039f\7m\2\2\u039e\u0398\3\2\2\2\u039e\u039c\3\2\2\2\u039f\u008d\3\2"+
		"\2\2\u03a0\u03a1\7=\2\2\u03a1\u03a2\7?\2\2\u03a2\u03a3\5\62\32\2\u03a3"+
		"\u03a5\7\\\2\2\u03a4\u03a6\7p\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03a7\3\2"+
		"\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03aa\7@\2\2\u03aa\u03ab\7[\2\2\u03ab\u008f\3\2\2\2\u03ac\u03d2\5\u0092"+
		"J\2\u03ad\u03d2\5\u0094K\2\u03ae\u03d2\5\u009aN\2\u03af\u03d2\5\u009c"+
		"O\2\u03b0\u03d2\5\u009eP\2\u03b1\u03d2\5\u00a6T\2\u03b2\u03b3\t\25\2\2"+
		"\u03b3\u03b4\t\26\2\2\u03b4\u03bd\7?\2\2\u03b5\u03ba\5(\25\2\u03b6\u03b7"+
		"\7\\\2\2\u03b7\u03b9\5(\25\2\u03b8\u03b6\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2"+
		"\2\2\u03bd\u03b5\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03cc\3\2\2\2\u03bf"+
		"\u03c8\7Z\2\2\u03c0\u03c5\5(\25\2\u03c1\u03c2\7\\\2\2\u03c2\u03c4\5(\25"+
		"\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c0\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03bf\3\2\2\2\u03cb\u03ce\3\2"+
		"\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03cf\u03d0\7@\2\2\u03d0\u03d2\7[\2\2\u03d1\u03ac\3\2\2"+
		"\2\u03d1\u03ad\3\2\2\2\u03d1\u03ae\3\2\2\2\u03d1\u03af\3\2\2\2\u03d1\u03b0"+
		"\3\2\2\2\u03d1\u03b1\3\2\2\2\u03d1\u03b2\3\2\2\2\u03d2\u0091\3\2\2\2\u03d3"+
		"\u03d4\7m\2\2\u03d4\u03d5\7Z\2\2\u03d5\u03df\5\u0090I\2\u03d6\u03d7\7"+
		"\24\2\2\u03d7\u03d8\5\62\32\2\u03d8\u03d9\7Z\2\2\u03d9\u03da\5\u0090I"+
		"\2\u03da\u03df\3\2\2\2\u03db\u03dc\7\30\2\2\u03dc\u03dd\7Z\2\2\u03dd\u03df"+
		"\5\u0090I\2\u03de\u03d3\3\2\2\2\u03de\u03d6\3\2\2\2\u03de\u03db\3\2\2"+
		"\2\u03df\u0093\3\2\2\2\u03e0\u03e2\7C\2\2\u03e1\u03e3\5\u0096L\2\u03e2"+
		"\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\7D"+
		"\2\2\u03e5\u0095\3\2\2\2\u03e6\u03e8\5\u0098M\2\u03e7\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u0097\3\2"+
		"\2\2\u03eb\u03ee\5\u0090I\2\u03ec\u03ee\5\64\33\2\u03ed\u03eb\3\2\2\2"+
		"\u03ed\u03ec\3\2\2\2\u03ee\u0099\3\2\2\2\u03ef\u03f1\5\60\31\2\u03f0\u03ef"+
		"\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\7[\2\2\u03f3"+
		"\u009b\3\2\2\2\u03f4\u03f5\7!\2\2\u03f5\u03f6\7?\2\2\u03f6\u03f7\5\60"+
		"\31\2\u03f7\u03f8\7@\2\2\u03f8\u03fb\5\u0090I\2\u03f9\u03fa\7\33\2\2\u03fa"+
		"\u03fc\5\u0090I\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0404"+
		"\3\2\2\2\u03fd\u03fe\7-\2\2\u03fe\u03ff\7?\2\2\u03ff\u0400\5\60\31\2\u0400"+
		"\u0401\7@\2\2\u0401\u0402\5\u0090I\2\u0402\u0404\3\2\2\2\u0403\u03f4\3"+
		"\2\2\2\u0403\u03fd\3\2\2\2\u0404\u009d\3\2\2\2\u0405\u0406\7\63\2\2\u0406"+
		"\u0407\7?\2\2\u0407\u0408\5\60\31\2\u0408\u0409\7@\2\2\u0409\u040a\5\u0090"+
		"I\2\u040a\u041a\3\2\2\2\u040b\u040c\7\31\2\2\u040c\u040d\5\u0090I\2\u040d"+
		"\u040e\7\63\2\2\u040e\u040f\7?\2\2\u040f\u0410\5\60\31\2\u0410\u0411\7"+
		"@\2\2\u0411\u0412\7[\2\2\u0412\u041a\3\2\2\2\u0413\u0414\7\37\2\2\u0414"+
		"\u0415\7?\2\2\u0415\u0416\5\u00a0Q\2\u0416\u0417\7@\2\2\u0417\u0418\5"+
		"\u0090I\2\u0418\u041a\3\2\2\2\u0419\u0405\3\2\2\2\u0419\u040b\3\2\2\2"+
		"\u0419\u0413\3\2\2\2\u041a\u009f\3\2\2\2\u041b\u0420\5\u00a2R\2\u041c"+
		"\u041e\5\60\31\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3"+
		"\2\2\2\u041f\u041b\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u0423\7[\2\2\u0422\u0424\5\u00a4S\2\u0423\u0422\3\2\2\2\u0423\u0424\3"+
		"\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\7[\2\2\u0426\u0428\5\u00a4S\2\u0427"+
		"\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u00a1\3\2\2\2\u0429\u042b\5\66"+
		"\34\2\u042a\u042c\5<\37\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u00a3\3\2\2\2\u042d\u0432\5,\27\2\u042e\u042f\7\\\2\2\u042f\u0431\5,"+
		"\27\2\u0430\u042e\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u00a5\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\7 "+
		"\2\2\u0436\u043f\7m\2\2\u0437\u043f\t\27\2\2\u0438\u043a\7\'\2\2\u0439"+
		"\u043b\5\60\31\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043f\3"+
		"\2\2\2\u043c\u043d\7 \2\2\u043d\u043f\5\20\t\2\u043e\u0435\3\2\2\2\u043e"+
		"\u0437\3\2\2\2\u043e\u0438\3\2\2\2\u043e\u043c\3\2\2\2\u043f\u0440\3\2"+
		"\2\2\u0440\u0441\7[\2\2\u0441\u00a7\3\2\2\2\u0442\u0444\5\u00aaV\2\u0443"+
		"\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2"+
		"\2\2\u0446\u00a9\3\2\2\2\u0447\u044b\5\u00acW\2\u0448\u044b\5\64\33\2"+
		"\u0449\u044b\7[\2\2\u044a\u0447\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u0449"+
		"\3\2\2\2\u044b\u00ab\3\2\2\2\u044c\u044e\5\66\34\2\u044d\u044c\3\2\2\2"+
		"\u044d\u044e\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\5b\62\2\u0450\u0452"+
		"\5\u00aeX\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2"+
		"\2\u0453\u0454\5\u0094K\2\u0454\u00ad\3\2\2\2\u0455\u0457\5\64\33\2\u0456"+
		"\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2"+
		"\2\2\u0459\u00af\3\2\2\2\u045a\u045b\7\21\2\2\u045b\u00b1\3\2\2\2\u008c"+
		"\u00b3\u00bc\u00c4\u00d8\u00e6\u00eb\u00f2\u00fa\u00fe\u0106\u010c\u010e"+
		"\u0116\u011c\u012a\u012f\u0138\u013f\u0147\u014f\u0157\u015f\u0167\u016f"+
		"\u0177\u017f\u0187\u0190\u0198\u01a1\u01a8\u01ad\u01b2\u01b7\u01be\u01c5"+
		"\u01cb\u01eb\u01f1\u01f6\u01ff\u0206\u020a\u020f\u0213\u0216\u021d\u0222"+
		"\u0226\u022a\u022f\u0235\u023c\u0242\u0253\u0259\u025e\u0264\u0272\u0278"+
		"\u027d\u0280\u0287\u0296\u02a2\u02a5\u02a7\u02af\u02b3\u02bd\u02c1\u02c5"+
		"\u02cb\u02ce\u02d5\u02d7\u02dc\u02e0\u02e5\u02ea\u02f1\u02f9\u02fb\u0302"+
		"\u0307\u030b\u0311\u0314\u031d\u0322\u0325\u032b\u033b\u0341\u0344\u0349"+
		"\u034c\u0353\u0366\u036c\u036f\u0371\u0376\u037c\u0380\u0383\u0388\u038d"+
		"\u0396\u039e\u03a7\u03ba\u03bd\u03c5\u03c8\u03cc\u03d1\u03de\u03e2\u03e9"+
		"\u03ed\u03f0\u03fb\u0403\u0419\u041d\u041f\u0423\u0427\u042b\u0432\u043a"+
		"\u043e\u0445\u044a\u044d\u0451\u0458";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}