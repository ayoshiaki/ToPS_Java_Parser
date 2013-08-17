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

    StringVectorParameterValue(ArrayList<String> v) {
        values = v;
    }

    public ArrayList<String> getStringVector () {
        
        return values;
    }
}
