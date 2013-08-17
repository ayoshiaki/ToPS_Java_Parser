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
public class DoubleMapParameterValue extends ProbabilisticModelParameterValue {

    private HashMap<String, Double> v;

    public String getParameterType() {
        return "DoubleMap";
    }

    void initialize(HashMap<String, Double> value) {
        v = value;
    }

    @Override
    public HashMap<String, Double> getDoubleMap() {
        return v; //To change body of generated methods, choose Tools | Templates.
    }
}
