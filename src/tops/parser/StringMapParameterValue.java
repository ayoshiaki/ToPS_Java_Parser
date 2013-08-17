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
public class StringMapParameterValue extends ProbabilisticModelParameterValue {

    private HashMap<String, String> v;

    public String getParameterType() {
        return "StringMap";
    }

    void initialize(HashMap<String, String> value) {
        v = value;
    }

    @Override
    public HashMap<String, String> getStringMap() {
        return v; //To change body of generated methods, choose Tools | Templates.
    }
}
