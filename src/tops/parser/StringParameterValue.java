/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tops.parser;

import java.util.HashMap;

/**
 *
 * @author yoshiaki
 */
public class StringParameterValue extends ProbabilisticModelParameterValue {

    private String v;

    public StringParameterValue removeQuotes() {
        v= v.substring(1, v.length()-1);
        return this;
    }
    public StringParameterValue(String s) {
        v = s;
    }

    public String getParameterType() {
        return "String";
    }

 
    @Override
    public String getString() {
        return v;
    }
}
