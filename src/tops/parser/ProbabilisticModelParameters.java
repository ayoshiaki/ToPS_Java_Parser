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
public class ProbabilisticModelParameters {

    private HashMap<String, ProbabilisticModelParameterValue> values = new HashMap<String, ProbabilisticModelParameterValue>();

    public void add(String name, ProbabilisticModelParameterValue v) {
        values.put(name, v);

    }

    public void set(String name, ProbabilisticModelParameterValue v) {
        values.remove(name);
        values.put(name, v);
    }

    public ProbabilisticModelParameterValue getMandatoryParameterValue(String name) {
        if (values.containsKey(name)) {
            return values.get(name);
        }
        return new NullProbabilisticModelParameterValue();
    }

    public ProbabilisticModelParameterValue getOptionalParameterValue(String name) {
        if (values.containsKey(name)) {
            return values.get(name);
        }
        return new NullProbabilisticModelParameterValue();
    }
}
