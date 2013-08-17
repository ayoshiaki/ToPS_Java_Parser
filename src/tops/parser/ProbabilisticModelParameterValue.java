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
public abstract class ProbabilisticModelParameterValue {

    public String getParameterType() {
        return "NULL";
    }

    public HashMap<String, Double> getDoubleMap() {
        return new HashMap();
    }

    public ArrayList<String> getStringVector() {
        return new ArrayList<String>();
    }

    public ArrayList<Double> getDoubleVector() {
        return new ArrayList<Double>();
    }

    public ArrayList<Integer> getIntVector() {
        return new ArrayList<Integer>();
    }

    public String getString() {
        return "NULL";
    }

    public HashMap<String, String> getStringMap() {
        return new HashMap<String, String>();
    }

    public int getInt() {
        return 0;
    }

    public double getDouble() {
        return 0.0;
    }

    public String toString() {
        return "NULL";
    }
}
