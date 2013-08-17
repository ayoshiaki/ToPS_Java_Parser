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
public class NullProbabilisticModelParameterValue extends ProbabilisticModelParameterValue {

    @Override
    public String getParameterType() {
        return "NULL";
    }

    @Override
    public HashMap<String, Double> getDoubleMap() {
        return new HashMap();
    }

    @Override
    public ArrayList<String> getStringVector() {
        return new ArrayList<String>();
    }

    @Override
    public ArrayList<Double> getDoubleVector() {
        return new ArrayList<Double>();
    }

    @Override
    public ArrayList<Integer> getIntVector() {
        return new ArrayList<Integer>();
    }

    @Override
    public String getString() {
        return "NULL";
    }

    @Override
    public HashMap<String, String> getStringMap() {
        return new HashMap<String, String>();
    }

    @Override
    public int getInt() {
        return 0;
    }

    @Override
    public double getDouble() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "NULL";
    }
}
