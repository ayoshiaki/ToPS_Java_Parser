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
public class DoubleVectorParameterValue extends ProbabilisticModelParameterValue {

    private ArrayList<Double> values;

    public String getParameterType() {
        return "DoubleVector";
    }

    DoubleVectorParameterValue (ArrayList<Double> v) {
        values = v;
    }

    @Override
    public ArrayList<Double> getDoubleVector() {
        return values;
    }
}
