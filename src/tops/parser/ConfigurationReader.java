/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tops.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author yoshiaki
 */
public class ConfigurationReader {

    public ProbabilisticModelParameters load(String path) {
        try {
            ToPSLexer lex = new ToPSLexer(new ANTLRFileStream(path, "UTF8"));
            CommonTokenStream tokens = new CommonTokenStream(lex);
            ToPSParser g = new ToPSParser(tokens);
            g.model();
            return g.getParameters();

        } catch (RecognitionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ProbabilisticModelParameters();
    }
}
