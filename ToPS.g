grammar ToPS;

options {
backtrack=true;
}
@header{
package tops.parser;
import java.util.ArrayList;
}

@lexer::header {
package tops.parser;
}

@members {
private ProbabilisticModelParameters parameters = new ProbabilisticModelParameters();
private ProbabilisticModelParameterValue current_parameter;
private ArrayList<String> strlst;
private ArrayList<Double> dbllst;
private HashMap<String,Double> dblmap;
public ProbabilisticModelParameters getParameters() {
  return parameters;
}

}


model	:	properties
 	;
properties
	:	property +
	;
property: ID '=' value {parameters.add($ID.text, current_parameter);};

value	: STRING {current_parameter = (new StringParameterValue($STRING.text)).removeQuotes(); }
	| INT {current_parameter = new IntParameterValue(Integer.parseInt($INT.text));}
	| FLOAT {current_parameter = new DoubleParameterValue(Double.parseDouble($FLOAT.text));}
	| list_str {current_parameter = (new StringVectorParameterValue(strlst)).removeQuotes();}
	| list_double { current_parameter = new DoubleVectorParameterValue(dbllst);}
	| probability_map {current_parameter = (new DoubleMapParameterValue(dblmap)).removeQuotes();}
	| conditional_probability_map {current_parameter = (new DoubleMapParameterValue(dblmap)).removeQuotes();}
	| sub_model
	| ID
	;
	
list_double 
	:	 '(' list_double_elements ')'
	;
list_double_elements 
	:	FLOAT {dbllst = new ArrayList<Double>(); dbllst.add(Double.parseDouble($FLOAT.text)); } (',' list_double_element)*
        ;
	
list_double_element 
	:	FLOAT {dbllst.add(Double.parseDouble($FLOAT.text));}
	;
		
list_str 	:	 '(' list_str_elements ')' 
	;
list_str_elements : STRING {strlst = new ArrayList<String>(); strlst.add($STRING.text);} (',' list_str_element) *;

list_str_element 
	:	STRING {strlst.add($STRING.text);}
	;

probability_map : '(' probabilities_list ')'
	;
	
probabilities_list : STRING ':' probability_number {dblmap = new HashMap<String,Double>(); dblmap.put($STRING.text, Double.parseDouble($probability_number.text));} (';' probability )* ';'?
;

probability: STRING ':' probability_number {dblmap.put($STRING.text, Double.parseDouble($probability_number.text));}
	;
conditional_probability_map: '(' conditional_probabilities_list ')'
	;

conditional_probabilities_list:  condition ':' probability_number {dblmap = new HashMap<String,Double>(); dblmap.put($condition.text, Double.parseDouble($probability_number.text));} (';'  conditional_probability)* ';'?
	;
conditional_probability:	condition ':' probability_number {dblmap.put($condition.text, Double.parseDouble($probability_number.text));};
	
condition: STRING '|' STRING;
probability_number : INT | FLOAT ;
sub_model : '[' properties ']'
;	

LINE_COMMENT : '#' .* '\n';
WS 	:	(' '|'\r'|'\t'|'\n')+ {$channel=HIDDEN;}
    ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
