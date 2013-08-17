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
public class DoubleParameterValue extends ProbabilisticModelParameterValue {

    private double v;

    public String getParameterType() {
        return "Double";
    }

    public DoubleParameterValue(double value) {
        v = value;
    }

    @Override
    public double getDouble() {
        return v;
    }
}
