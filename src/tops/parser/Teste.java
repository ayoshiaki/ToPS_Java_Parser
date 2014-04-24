/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tops.parser;

import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author yoshiaki
 */
public class Teste {

    public static void main(String args[]) throws Exception {
        ConfigurationReader reader = new ConfigurationReader();
        ProbabilisticModelParameters params = reader.load("/Users/yoshiaki/input.txt");
        
        ProbabilisticModelParameterValue v = params.getMandatoryParameterValue("teste_d");
        ArrayList<Double> a = v.getDoubleVector();
        for (Double e : a) {
            System.out.println("e: " + e);
        }
        
        v = params.getOptionalParameterValue("teste");
        ArrayList<String> strs = v.getStringVector();
        for (String e : strs) {
            System.out.println("e: " + e);
        }
        HashMap<String, Double> prob_map;
        v = params.getMandatoryParameterValue("prob");
        prob_map = v.getDoubleMap();
        for (String e : prob_map.keySet()) {
            System.out.println(e + " " + prob_map.get(e));
        }
        v = params.getMandatoryParameterValue("probabilities");
        prob_map = v.getDoubleMap();
        for (String e : prob_map.keySet()) {
            String partA = "", partB = "";
            String[] parts = e.split("\\|");
            partA = parts[0].trim();
            partB = parts[1].trim();
            System.out.println("a: " + partA + " b: " + partB + " prob: " + prob_map.get(e));
        }
        v = params.getOptionalParameterValue("lixao");
        System.out.println ("lixao: " + v.getDouble());

    }
}
