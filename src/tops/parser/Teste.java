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
        ToPSLexer lex = new ToPSLexer(new ANTLRFileStream("/Users/yoshiaki/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ToPSParser g = new ToPSParser(tokens);

        try {

            g.model();
            ProbabilisticModelParameters par = g.getParameters();
            ProbabilisticModelParameterValue v = par.getMandatoryParameterValue("teste_d");
            ArrayList<Double> a = v.getDoubleVector();
            for (Double e : a) {
                System.out.println("e: " + e);
            }
            v = par.getOptionalParameterValue("teste");
            ArrayList<String> strs = v.getStringVector();
            for (String e : strs) {
                System.out.println("e: " + e);
            }
            HashMap<String,Double> prob_map;
            v = par.getMandatoryParameterValue("prob");
            prob_map = v.getDoubleMap();
            for (String e: prob_map.keySet()){
                System.out.println(e + " " + prob_map.get(e));
            }
            v = par.getMandatoryParameterValue("probabilities");
            prob_map = v.getDoubleMap();
            for (String e: prob_map.keySet()){
                String partA ="", partB ="";
                String [] parts = e.split("\\|");
                 partA = parts[0];
                 partB = parts[1];
                System.out.println("a: " + partA + " b: " + partB + " prob: " + prob_map.get(e));
            }
            

        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
