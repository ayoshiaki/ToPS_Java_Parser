/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tops.parser;

import java.util.ArrayList;

/**
 *
 * @author yoshiaki
 */
public class StringVectorParameterValue extends ProbabilisticModelParameterValue {

    private ArrayList<String> values;

    public StringVectorParameterValue removeQuotes() {
        ArrayList<String> newStr = new ArrayList<String>();
        for (String v : values) {
            newStr.add(v.substring(1, v.length() - 1));
        }
        values = newStr;
        return this;
    }

    StringVectorParameterValue(ArrayList<String> v) {
        values = v;
    }

    public ArrayList<String> getStringVector() {

        return values;
    }
}
