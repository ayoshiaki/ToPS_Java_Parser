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
public class IntVectorParameterValue extends ProbabilisticModelParameterValue {

    private ArrayList<Integer> values;

    public String getParameterType() {
        return "IntVector";
    }

    void IntVectorParameterValue(ArrayList<Integer> v) {
        values = v;
    }

    @Override
    public ArrayList<Integer> getIntVector() {
        return values;
    }
}
