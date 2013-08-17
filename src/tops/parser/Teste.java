/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tops.parser;

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
            ProbabilisticModelParameterValue v = par.getMandatoryParameterValue("model_name");
            System.out.println(v.getString());
     
            
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
