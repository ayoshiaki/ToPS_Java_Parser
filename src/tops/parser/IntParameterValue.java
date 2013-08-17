/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tops.parser;

/**
 *
 * @author yoshiaki
 */
public class IntParameterValue extends ProbabilisticModelParameterValue {

    private int value;

    public String getParameterType() {
        return "Int";
    }

    public  IntParameterValue(int v) {
        value = v;
    }

    @Override
    public int getInt() {
        return value;
    }
}
