// $ANTLR 3.5 /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g 2013-08-19 19:30:04

package tops.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ToPSLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int ESC_SEQ=4;
	public static final int EXPONENT=5;
	public static final int FLOAT=6;
	public static final int HEX_DIGIT=7;
	public static final int ID=8;
	public static final int INT=9;
	public static final int LINE_COMMENT=10;
	public static final int OCTAL_ESC=11;
	public static final int STRING=12;
	public static final int UNICODE_ESC=13;
	public static final int WS=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ToPSLexer() {} 
	public ToPSLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ToPSLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:6:7: ( '(' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:6:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:7:7: ( ')' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:7:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:8:7: ( ',' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:8:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:9:7: ( ':' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:9:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:10:7: ( ';' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:10:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:11:7: ( '=' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:11:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:12:7: ( '[' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:12:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:13:7: ( ']' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:13:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:14:7: ( '|' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:14:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:85:14: ( '#' ( . )* '\\n' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:85:16: '#' ( . )* '\\n'
			{
			match('#'); 
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:85:20: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\n') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:85:20: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:86:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:86:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			{
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:86:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:89:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:89:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:89:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:92:5: ( ( '0' .. '9' )+ )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:92:7: ( '0' .. '9' )+
			{
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:92:7: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:96:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt11=3;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:96:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:96:9: ( '0' .. '9' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match('.'); 
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:96:25: ( '0' .. '9' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:96:37: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:96:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:97:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:97:13: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:97:25: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:97:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:98:9: ( '0' .. '9' )+ EXPONENT
					{
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:98:9: ( '0' .. '9' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:102:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:102:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:102:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\\') ) {
					alt12=1;
				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:102:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:102:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:107:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:107:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:107:22: ( '+' | '-' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='+'||LA13_0=='-') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:107:33: ( '0' .. '9' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:110:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:114:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt15=1;
					}
					break;
				case 'u':
					{
					alt15=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt15=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:114:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:115:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:116:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:121:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='\\') ) {
				int LA16_1 = input.LA(2);
				if ( ((LA16_1 >= '0' && LA16_1 <= '3')) ) {
					int LA16_2 = input.LA(3);
					if ( ((LA16_2 >= '0' && LA16_2 <= '7')) ) {
						int LA16_4 = input.LA(4);
						if ( ((LA16_4 >= '0' && LA16_4 <= '7')) ) {
							alt16=1;
						}

						else {
							alt16=2;
						}

					}

					else {
						alt16=3;
					}

				}
				else if ( ((LA16_1 >= '4' && LA16_1 <= '7')) ) {
					int LA16_3 = input.LA(3);
					if ( ((LA16_3 >= '0' && LA16_3 <= '7')) ) {
						alt16=2;
					}

					else {
						alt16=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:121:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:122:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:123:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:128:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:128:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | LINE_COMMENT | WS | ID | INT | FLOAT | STRING )
		int alt17=15;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:46: T__21
				{
				mT__21(); 

				}
				break;
			case 8 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:52: T__22
				{
				mT__22(); 

				}
				break;
			case 9 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:58: T__23
				{
				mT__23(); 

				}
				break;
			case 10 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:64: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 11 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:77: WS
				{
				mWS(); 

				}
				break;
			case 12 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:80: ID
				{
				mID(); 

				}
				break;
			case 13 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:83: INT
				{
				mINT(); 

				}
				break;
			case 14 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:87: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 15 :
				// /Users/yoshiaki/NetBeansProjects/ToPS_Parser/ToPS.g:1:93: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA11_eotS =
		"\5\uffff";
	static final String DFA11_eofS =
		"\5\uffff";
	static final String DFA11_minS =
		"\2\56\3\uffff";
	static final String DFA11_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA11_specialS =
		"\5\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "95:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA17_eotS =
		"\15\uffff\1\20\3\uffff";
	static final String DFA17_eofS =
		"\21\uffff";
	static final String DFA17_minS =
		"\1\11\14\uffff\1\56\3\uffff";
	static final String DFA17_maxS =
		"\1\174\14\uffff\1\145\3\uffff";
	static final String DFA17_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff"+
		"\1\16\1\17\1\15";
	static final String DFA17_specialS =
		"\21\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\1\uffff\1\17\1\12\4\uffff\1\1\1\2\2"+
			"\uffff\1\3\1\uffff\1\16\1\uffff\12\15\1\4\1\5\1\uffff\1\6\3\uffff\32"+
			"\14\1\7\1\uffff\1\10\1\uffff\1\14\1\uffff\32\14\1\uffff\1\11",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\16\1\uffff\12\15\13\uffff\1\16\37\uffff\1\16",
			"",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | LINE_COMMENT | WS | ID | INT | FLOAT | STRING );";
		}
	}

}
