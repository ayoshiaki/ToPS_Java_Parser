// Generated from ../../../ToPS.g by ANTLR 4.2

package tops.parser;
import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToPSParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		LINE_COMMENT=10, WS=11, ID=12, INT=13, FLOAT=14, STRING=15;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "')'", "','", "'['", "'('", "':'", "'='", "';'", "'|'", 
		"LINE_COMMENT", "WS", "ID", "INT", "FLOAT", "STRING"
	};
	public static final int
		RULE_model = 0, RULE_properties = 1, RULE_property = 2, RULE_value = 3, 
		RULE_list_double = 4, RULE_list_double_elements = 5, RULE_list_double_element = 6, 
		RULE_list_str = 7, RULE_list_str_elements = 8, RULE_list_str_element = 9, 
		RULE_probability_map = 10, RULE_probabilities_list = 11, RULE_probability = 12, 
		RULE_conditional_probability_map = 13, RULE_conditional_probabilities_list = 14, 
		RULE_conditional_probability = 15, RULE_condition = 16, RULE_probability_number = 17, 
		RULE_sub_model = 18;
	public static final String[] ruleNames = {
		"model", "properties", "property", "value", "list_double", "list_double_elements", 
		"list_double_element", "list_str", "list_str_elements", "list_str_element", 
		"probability_map", "probabilities_list", "probability", "conditional_probability_map", 
		"conditional_probabilities_list", "conditional_probability", "condition", 
		"probability_number", "sub_model"
	};

	@Override
	public String getGrammarFileName() { return "ToPS.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private ProbabilisticModelParameters parameters = new ProbabilisticModelParameters();
	private ProbabilisticModelParameterValue current_parameter;
	private ArrayList<String> strlst;
	private ArrayList<Double> dbllst;
	private HashMap<String,Double> dblmap;
	public ProbabilisticModelParameters getParameters() {
	  return parameters;
	}

	public ToPSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); properties();
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

	public static class PropertiesContext extends ParserRuleContext {
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40); property();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class PropertyContext extends ParserRuleContext {
		public Token ID;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(ToPSParser.ID, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); ((PropertyContext)_localctx).ID = match(ID);
			setState(46); match(7);
			setState(47); value();
			parameters.add((((PropertyContext)_localctx).ID!=null?((PropertyContext)_localctx).ID.getText():null), current_parameter);
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
		public Token STRING;
		public Token INT;
		public Token FLOAT;
		public List_strContext list_str() {
			return getRuleContext(List_strContext.class,0);
		}
		public Conditional_probability_mapContext conditional_probability_map() {
			return getRuleContext(Conditional_probability_mapContext.class,0);
		}
		public Sub_modelContext sub_model() {
			return getRuleContext(Sub_modelContext.class,0);
		}
		public List_doubleContext list_double() {
			return getRuleContext(List_doubleContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(ToPSParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ToPSParser.INT, 0); }
		public TerminalNode ID() { return getToken(ToPSParser.ID, 0); }
		public Probability_mapContext probability_map() {
			return getRuleContext(Probability_mapContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ToPSParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); ((ValueContext)_localctx).STRING = match(STRING);
				current_parameter = (new StringParameterValue((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null))).removeQuotes(); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); ((ValueContext)_localctx).INT = match(INT);
				current_parameter = new IntParameterValue(Integer.parseInt((((ValueContext)_localctx).INT!=null?((ValueContext)_localctx).INT.getText():null)));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); ((ValueContext)_localctx).FLOAT = match(FLOAT);
				current_parameter = new DoubleParameterValue(Double.parseDouble((((ValueContext)_localctx).FLOAT!=null?((ValueContext)_localctx).FLOAT.getText():null)));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); list_str();
				current_parameter = (new StringVectorParameterValue(strlst)).removeQuotes();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); list_double();
				 current_parameter = new DoubleVectorParameterValue(dbllst);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62); probability_map();
				current_parameter = (new DoubleMapParameterValue(dblmap)).removeQuotes();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65); conditional_probability_map();
				current_parameter = (new DoubleMapParameterValue(dblmap)).removeQuotes();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68); sub_model();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69); match(ID);
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

	public static class List_doubleContext extends ParserRuleContext {
		public List_double_elementsContext list_double_elements() {
			return getRuleContext(List_double_elementsContext.class,0);
		}
		public List_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterList_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitList_double(this);
		}
	}

	public final List_doubleContext list_double() throws RecognitionException {
		List_doubleContext _localctx = new List_doubleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(5);
			setState(73); list_double_elements();
			setState(74); match(2);
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

	public static class List_double_elementsContext extends ParserRuleContext {
		public Token FLOAT;
		public List<List_double_elementContext> list_double_element() {
			return getRuleContexts(List_double_elementContext.class);
		}
		public TerminalNode FLOAT() { return getToken(ToPSParser.FLOAT, 0); }
		public List_double_elementContext list_double_element(int i) {
			return getRuleContext(List_double_elementContext.class,i);
		}
		public List_double_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_double_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterList_double_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitList_double_elements(this);
		}
	}

	public final List_double_elementsContext list_double_elements() throws RecognitionException {
		List_double_elementsContext _localctx = new List_double_elementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_double_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); ((List_double_elementsContext)_localctx).FLOAT = match(FLOAT);
			dbllst = new ArrayList<Double>(); dbllst.add(Double.parseDouble((((List_double_elementsContext)_localctx).FLOAT!=null?((List_double_elementsContext)_localctx).FLOAT.getText():null))); 
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(78); match(3);
				setState(79); list_double_element();
				}
				}
				setState(84);
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

	public static class List_double_elementContext extends ParserRuleContext {
		public Token FLOAT;
		public TerminalNode FLOAT() { return getToken(ToPSParser.FLOAT, 0); }
		public List_double_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_double_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterList_double_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitList_double_element(this);
		}
	}

	public final List_double_elementContext list_double_element() throws RecognitionException {
		List_double_elementContext _localctx = new List_double_elementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_double_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); ((List_double_elementContext)_localctx).FLOAT = match(FLOAT);
			dbllst.add(Double.parseDouble((((List_double_elementContext)_localctx).FLOAT!=null?((List_double_elementContext)_localctx).FLOAT.getText():null)));
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

	public static class List_strContext extends ParserRuleContext {
		public List_str_elementsContext list_str_elements() {
			return getRuleContext(List_str_elementsContext.class,0);
		}
		public List_strContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterList_str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitList_str(this);
		}
	}

	public final List_strContext list_str() throws RecognitionException {
		List_strContext _localctx = new List_strContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(5);
			setState(89); list_str_elements();
			setState(90); match(2);
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

	public static class List_str_elementsContext extends ParserRuleContext {
		public Token STRING;
		public List_str_elementContext list_str_element(int i) {
			return getRuleContext(List_str_elementContext.class,i);
		}
		public List<List_str_elementContext> list_str_element() {
			return getRuleContexts(List_str_elementContext.class);
		}
		public TerminalNode STRING() { return getToken(ToPSParser.STRING, 0); }
		public List_str_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_str_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterList_str_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitList_str_elements(this);
		}
	}

	public final List_str_elementsContext list_str_elements() throws RecognitionException {
		List_str_elementsContext _localctx = new List_str_elementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list_str_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); ((List_str_elementsContext)_localctx).STRING = match(STRING);
			strlst = new ArrayList<String>(); strlst.add((((List_str_elementsContext)_localctx).STRING!=null?((List_str_elementsContext)_localctx).STRING.getText():null));
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(94); match(3);
				setState(95); list_str_element();
				}
				}
				setState(100);
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

	public static class List_str_elementContext extends ParserRuleContext {
		public Token STRING;
		public TerminalNode STRING() { return getToken(ToPSParser.STRING, 0); }
		public List_str_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_str_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterList_str_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitList_str_element(this);
		}
	}

	public final List_str_elementContext list_str_element() throws RecognitionException {
		List_str_elementContext _localctx = new List_str_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list_str_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); ((List_str_elementContext)_localctx).STRING = match(STRING);
			strlst.add((((List_str_elementContext)_localctx).STRING!=null?((List_str_elementContext)_localctx).STRING.getText():null));
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

	public static class Probability_mapContext extends ParserRuleContext {
		public Probabilities_listContext probabilities_list() {
			return getRuleContext(Probabilities_listContext.class,0);
		}
		public Probability_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterProbability_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitProbability_map(this);
		}
	}

	public final Probability_mapContext probability_map() throws RecognitionException {
		Probability_mapContext _localctx = new Probability_mapContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_probability_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(5);
			setState(105); probabilities_list();
			setState(106); match(2);
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

	public static class Probabilities_listContext extends ParserRuleContext {
		public Token STRING;
		public Probability_numberContext probability_number;
		public Probability_numberContext probability_number() {
			return getRuleContext(Probability_numberContext.class,0);
		}
		public ProbabilityContext probability(int i) {
			return getRuleContext(ProbabilityContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ToPSParser.STRING, 0); }
		public List<ProbabilityContext> probability() {
			return getRuleContexts(ProbabilityContext.class);
		}
		public Probabilities_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probabilities_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterProbabilities_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitProbabilities_list(this);
		}
	}

	public final Probabilities_listContext probabilities_list() throws RecognitionException {
		Probabilities_listContext _localctx = new Probabilities_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_probabilities_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); ((Probabilities_listContext)_localctx).STRING = match(STRING);
			setState(109); match(6);
			setState(110); ((Probabilities_listContext)_localctx).probability_number = probability_number();
			dblmap = new HashMap<String,Double>(); dblmap.put((((Probabilities_listContext)_localctx).STRING!=null?((Probabilities_listContext)_localctx).STRING.getText():null), Double.parseDouble((((Probabilities_listContext)_localctx).probability_number!=null?_input.getText(((Probabilities_listContext)_localctx).probability_number.start,((Probabilities_listContext)_localctx).probability_number.stop):null)));
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(112); match(8);
					setState(113); probability();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(120);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(119); match(8);
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

	public static class ProbabilityContext extends ParserRuleContext {
		public Token STRING;
		public Probability_numberContext probability_number;
		public Probability_numberContext probability_number() {
			return getRuleContext(Probability_numberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ToPSParser.STRING, 0); }
		public ProbabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterProbability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitProbability(this);
		}
	}

	public final ProbabilityContext probability() throws RecognitionException {
		ProbabilityContext _localctx = new ProbabilityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_probability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); ((ProbabilityContext)_localctx).STRING = match(STRING);
			setState(123); match(6);
			setState(124); ((ProbabilityContext)_localctx).probability_number = probability_number();
			dblmap.put((((ProbabilityContext)_localctx).STRING!=null?((ProbabilityContext)_localctx).STRING.getText():null), Double.parseDouble((((ProbabilityContext)_localctx).probability_number!=null?_input.getText(((ProbabilityContext)_localctx).probability_number.start,((ProbabilityContext)_localctx).probability_number.stop):null)));
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

	public static class Conditional_probability_mapContext extends ParserRuleContext {
		public Conditional_probabilities_listContext conditional_probabilities_list() {
			return getRuleContext(Conditional_probabilities_listContext.class,0);
		}
		public Conditional_probability_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_probability_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterConditional_probability_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitConditional_probability_map(this);
		}
	}

	public final Conditional_probability_mapContext conditional_probability_map() throws RecognitionException {
		Conditional_probability_mapContext _localctx = new Conditional_probability_mapContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditional_probability_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(5);
			setState(128); conditional_probabilities_list();
			setState(129); match(2);
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

	public static class Conditional_probabilities_listContext extends ParserRuleContext {
		public ConditionContext condition;
		public Probability_numberContext probability_number;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Conditional_probabilityContext conditional_probability(int i) {
			return getRuleContext(Conditional_probabilityContext.class,i);
		}
		public Probability_numberContext probability_number() {
			return getRuleContext(Probability_numberContext.class,0);
		}
		public List<Conditional_probabilityContext> conditional_probability() {
			return getRuleContexts(Conditional_probabilityContext.class);
		}
		public Conditional_probabilities_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_probabilities_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterConditional_probabilities_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitConditional_probabilities_list(this);
		}
	}

	public final Conditional_probabilities_listContext conditional_probabilities_list() throws RecognitionException {
		Conditional_probabilities_listContext _localctx = new Conditional_probabilities_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditional_probabilities_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131); ((Conditional_probabilities_listContext)_localctx).condition = condition();
			setState(132); match(6);
			setState(133); ((Conditional_probabilities_listContext)_localctx).probability_number = probability_number();
			dblmap = new HashMap<String,Double>(); dblmap.put((((Conditional_probabilities_listContext)_localctx).condition!=null?_input.getText(((Conditional_probabilities_listContext)_localctx).condition.start,((Conditional_probabilities_listContext)_localctx).condition.stop):null), Double.parseDouble((((Conditional_probabilities_listContext)_localctx).probability_number!=null?_input.getText(((Conditional_probabilities_listContext)_localctx).probability_number.start,((Conditional_probabilities_listContext)_localctx).probability_number.stop):null)));
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(135); match(8);
					setState(136); conditional_probability();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(143);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(142); match(8);
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

	public static class Conditional_probabilityContext extends ParserRuleContext {
		public ConditionContext condition;
		public Probability_numberContext probability_number;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Probability_numberContext probability_number() {
			return getRuleContext(Probability_numberContext.class,0);
		}
		public Conditional_probabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_probability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterConditional_probability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitConditional_probability(this);
		}
	}

	public final Conditional_probabilityContext conditional_probability() throws RecognitionException {
		Conditional_probabilityContext _localctx = new Conditional_probabilityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditional_probability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); ((Conditional_probabilityContext)_localctx).condition = condition();
			setState(146); match(6);
			setState(147); ((Conditional_probabilityContext)_localctx).probability_number = probability_number();
			dblmap.put((((Conditional_probabilityContext)_localctx).condition!=null?_input.getText(((Conditional_probabilityContext)_localctx).condition.start,((Conditional_probabilityContext)_localctx).condition.stop):null), Double.parseDouble((((Conditional_probabilityContext)_localctx).probability_number!=null?_input.getText(((Conditional_probabilityContext)_localctx).probability_number.start,((Conditional_probabilityContext)_localctx).probability_number.stop):null)));
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(ToPSParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ToPSParser.STRING); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(STRING);
			setState(151); match(9);
			setState(152); match(STRING);
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

	public static class Probability_numberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ToPSParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(ToPSParser.INT, 0); }
		public Probability_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterProbability_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitProbability_number(this);
		}
	}

	public final Probability_numberContext probability_number() throws RecognitionException {
		Probability_numberContext _localctx = new Probability_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_probability_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Sub_modelContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public Sub_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).enterSub_model(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToPSListener ) ((ToPSListener)listener).exitSub_model(this);
		}
	}

	public final Sub_modelContext sub_model() throws RecognitionException {
		Sub_modelContext _localctx = new Sub_modelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sub_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(4);
			setState(157); properties();
			setState(158); match(1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u00a3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7S\n\7\f\7\16"+
		"\7V\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nc\n\n\f\n\16\n"+
		"f\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\ru\n\r"+
		"\f\r\16\rx\13\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u008c\n\20\f\20\16\20\u008f\13"+
		"\20\3\20\5\20\u0092\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\3\3\2\17\20\u009e\2(\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2"+
		"\bH\3\2\2\2\nJ\3\2\2\2\fN\3\2\2\2\16W\3\2\2\2\20Z\3\2\2\2\22^\3\2\2\2"+
		"\24g\3\2\2\2\26j\3\2\2\2\30n\3\2\2\2\32|\3\2\2\2\34\u0081\3\2\2\2\36\u0085"+
		"\3\2\2\2 \u0093\3\2\2\2\"\u0098\3\2\2\2$\u009c\3\2\2\2&\u009e\3\2\2\2"+
		"()\5\4\3\2)\3\3\2\2\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2"+
		"\2.\5\3\2\2\2/\60\7\16\2\2\60\61\7\t\2\2\61\62\5\b\5\2\62\63\b\4\1\2\63"+
		"\7\3\2\2\2\64\65\7\21\2\2\65I\b\5\1\2\66\67\7\17\2\2\67I\b\5\1\289\7\20"+
		"\2\29I\b\5\1\2:;\5\20\t\2;<\b\5\1\2<I\3\2\2\2=>\5\n\6\2>?\b\5\1\2?I\3"+
		"\2\2\2@A\5\26\f\2AB\b\5\1\2BI\3\2\2\2CD\5\34\17\2DE\b\5\1\2EI\3\2\2\2"+
		"FI\5&\24\2GI\7\16\2\2H\64\3\2\2\2H\66\3\2\2\2H8\3\2\2\2H:\3\2\2\2H=\3"+
		"\2\2\2H@\3\2\2\2HC\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\t\3\2\2\2JK\7\7\2\2KL"+
		"\5\f\7\2LM\7\4\2\2M\13\3\2\2\2NO\7\20\2\2OT\b\7\1\2PQ\7\5\2\2QS\5\16\b"+
		"\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\r\3\2\2\2VT\3\2\2\2WX\7\20"+
		"\2\2XY\b\b\1\2Y\17\3\2\2\2Z[\7\7\2\2[\\\5\22\n\2\\]\7\4\2\2]\21\3\2\2"+
		"\2^_\7\21\2\2_d\b\n\1\2`a\7\5\2\2ac\5\24\13\2b`\3\2\2\2cf\3\2\2\2db\3"+
		"\2\2\2de\3\2\2\2e\23\3\2\2\2fd\3\2\2\2gh\7\21\2\2hi\b\13\1\2i\25\3\2\2"+
		"\2jk\7\7\2\2kl\5\30\r\2lm\7\4\2\2m\27\3\2\2\2no\7\21\2\2op\7\b\2\2pq\5"+
		"$\23\2qv\b\r\1\2rs\7\n\2\2su\5\32\16\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\7\n\2\2zy\3\2\2\2z{\3\2\2\2{\31\3\2\2"+
		"\2|}\7\21\2\2}~\7\b\2\2~\177\5$\23\2\177\u0080\b\16\1\2\u0080\33\3\2\2"+
		"\2\u0081\u0082\7\7\2\2\u0082\u0083\5\36\20\2\u0083\u0084\7\4\2\2\u0084"+
		"\35\3\2\2\2\u0085\u0086\5\"\22\2\u0086\u0087\7\b\2\2\u0087\u0088\5$\23"+
		"\2\u0088\u008d\b\20\1\2\u0089\u008a\7\n\2\2\u008a\u008c\5 \21\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\n\2\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\37\3\2\2\2\u0093\u0094\5\"\22"+
		"\2\u0094\u0095\7\b\2\2\u0095\u0096\5$\23\2\u0096\u0097\b\21\1\2\u0097"+
		"!\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\13\2\2\u009a\u009b\7\21\2"+
		"\2\u009b#\3\2\2\2\u009c\u009d\t\2\2\2\u009d%\3\2\2\2\u009e\u009f\7\6\2"+
		"\2\u009f\u00a0\5\4\3\2\u00a0\u00a1\7\3\2\2\u00a1\'\3\2\2\2\n-HTdvz\u008d"+
		"\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}