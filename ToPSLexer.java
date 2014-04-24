// Generated from ../../../ToPS.g by ANTLR 4.2

package tops.parser;
import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToPSLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		LINE_COMMENT=10, WS=11, ID=12, INT=13, FLOAT=14, STRING=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "')'", "','", "'['", "'('", "':'", "'='", "';'", "'|'", "LINE_COMMENT", 
		"WS", "ID", "INT", "FLOAT", "STRING"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"LINE_COMMENT", "WS", "ID", "INT", "FLOAT", "STRING", "EXPONENT", "HEX_DIGIT", 
		"ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC"
	};


	private ProbabilisticModelParameters parameters = new ProbabilisticModelParameters();
	private ProbabilisticModelParameterValue current_parameter;
	private ArrayList<String> strlst;
	private ArrayList<Double> dbllst;
	private HashMap<String,Double> dblmap;
	public ProbabilisticModelParameters getParameters() {
	  return parameters;
	}


	public ToPSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ToPS.g"; }

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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13@\n\13\f\13\16\13"+
		"C\13\13\3\13\3\13\3\f\6\fH\n\f\r\f\16\fI\3\f\3\f\3\r\3\r\7\rP\n\r\f\r"+
		"\16\rS\13\r\3\16\6\16V\n\16\r\16\16\16W\3\17\6\17[\n\17\r\17\16\17\\\3"+
		"\17\3\17\7\17a\n\17\f\17\16\17d\13\17\3\17\5\17g\n\17\3\17\3\17\6\17k"+
		"\n\17\r\17\16\17l\3\17\5\17p\n\17\3\17\6\17s\n\17\r\17\16\17t\3\17\5\17"+
		"x\n\17\3\20\3\20\3\20\7\20}\n\20\f\20\16\20\u0080\13\20\3\20\3\20\3\21"+
		"\3\21\5\21\u0086\n\21\3\21\6\21\u0089\n\21\r\21\16\21\u008a\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u0093\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u009e\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3A\2\26"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\2#\2%\2\'\2)\2\3\2\n\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\"+
		"aac|\4\2$$^^\4\2GGgg\4\2--//\5\2\62;CHch\n\2$$))^^ddhhppttvv\u00b4\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2"+
		"\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219"+
		"\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27G\3\2\2\2\31M\3\2\2\2\33U\3\2\2\2\35"+
		"w\3\2\2\2\37y\3\2\2\2!\u0083\3\2\2\2#\u008c\3\2\2\2%\u0092\3\2\2\2\'\u009d"+
		"\3\2\2\2)\u009f\3\2\2\2+,\7_\2\2,\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2/\60\7"+
		".\2\2\60\b\3\2\2\2\61\62\7]\2\2\62\n\3\2\2\2\63\64\7*\2\2\64\f\3\2\2\2"+
		"\65\66\7<\2\2\66\16\3\2\2\2\678\7?\2\28\20\3\2\2\29:\7=\2\2:\22\3\2\2"+
		"\2;<\7~\2\2<\24\3\2\2\2=A\7%\2\2>@\13\2\2\2?>\3\2\2\2@C\3\2\2\2AB\3\2"+
		"\2\2A?\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\f\2\2E\26\3\2\2\2FH\t\2\2\2GF\3"+
		"\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\f\2\2L\30\3\2\2\2M"+
		"Q\t\3\2\2NP\t\4\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\32\3\2\2"+
		"\2SQ\3\2\2\2TV\4\62;\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\34\3\2"+
		"\2\2Y[\4\62;\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b"+
		"\7\60\2\2_a\4\62;\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2eg\5!\21\2fe\3\2\2\2fg\3\2\2\2gx\3\2\2\2hj\7\60\2\2ik\4\62;"+
		"\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5!\21\2on\3\2\2"+
		"\2op\3\2\2\2px\3\2\2\2qs\4\62;\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2uv\3\2\2\2vx\5!\21\2wZ\3\2\2\2wh\3\2\2\2wr\3\2\2\2x\36\3\2\2\2y~\7$"+
		"\2\2z}\5%\23\2{}\n\5\2\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7$\2\2\u0082"+
		" \3\2\2\2\u0083\u0085\t\6\2\2\u0084\u0086\t\7\2\2\u0085\u0084\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\4\62;\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\"\3\2\2\2\u008c\u008d\t\b\2\2\u008d$\3\2\2\2\u008e\u008f\7^\2\2\u008f"+
		"\u0093\t\t\2\2\u0090\u0093\5)\25\2\u0091\u0093\5\'\24\2\u0092\u008e\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093&\3\2\2\2\u0094\u0095"+
		"\7^\2\2\u0095\u0096\4\62\65\2\u0096\u0097\4\629\2\u0097\u009e\4\629\2"+
		"\u0098\u0099\7^\2\2\u0099\u009a\4\629\2\u009a\u009e\4\629\2\u009b\u009c"+
		"\7^\2\2\u009c\u009e\4\629\2\u009d\u0094\3\2\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e(\3\2\2\2\u009f\u00a0\7^\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a2\5#\22\2\u00a2\u00a3\5#\22\2\u00a3\u00a4\5#\22\2\u00a4\u00a5\5#"+
		"\22\2\u00a5*\3\2\2\2\24\2AIQW\\bflotw|~\u0085\u008a\u0092\u009d\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}