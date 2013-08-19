/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tops.parser;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yoshiaki
 */
public class DoubleMapParameterValue extends ProbabilisticModelParameterValue {

    private HashMap<String, Double> v;

     public DoubleMapParameterValue removeQuotes() {
        HashMap<String,Double> newMap = new HashMap<String,Double>();
        for (String s : v.keySet()) {
            newMap.put(s.replaceAll("\"", ""), v.get(s));
        }
        v = newMap;
        return this;
    }
    public String getParameterType() {
        return "DoubleMap";
    }

    DoubleMapParameterValue(HashMap<String, Double> value) {
        v = value;
    }

    @Override
    public HashMap<String, Double> getDoubleMap() {
        return v; //To change body of generated methods, choose Tools | Templates.
    }
}
