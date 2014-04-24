// Generated from ../../../ToPS.g by ANTLR 4.2

package tops.parser;
import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToPSParser}.
 */
public interface ToPSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToPSParser#conditional_probability}.
	 * @param ctx the parse tree
	 */
	void enterConditional_probability(@NotNull ToPSParser.Conditional_probabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#conditional_probability}.
	 * @param ctx the parse tree
	 */
	void exitConditional_probability(@NotNull ToPSParser.Conditional_probabilityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(@NotNull ToPSParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(@NotNull ToPSParser.ModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull ToPSParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull ToPSParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#list_double}.
	 * @param ctx the parse tree
	 */
	void enterList_double(@NotNull ToPSParser.List_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#list_double}.
	 * @param ctx the parse tree
	 */
	void exitList_double(@NotNull ToPSParser.List_doubleContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#conditional_probability_map}.
	 * @param ctx the parse tree
	 */
	void enterConditional_probability_map(@NotNull ToPSParser.Conditional_probability_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#conditional_probability_map}.
	 * @param ctx the parse tree
	 */
	void exitConditional_probability_map(@NotNull ToPSParser.Conditional_probability_mapContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull ToPSParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull ToPSParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#list_double_elements}.
	 * @param ctx the parse tree
	 */
	void enterList_double_elements(@NotNull ToPSParser.List_double_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#list_double_elements}.
	 * @param ctx the parse tree
	 */
	void exitList_double_elements(@NotNull ToPSParser.List_double_elementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#probability_map}.
	 * @param ctx the parse tree
	 */
	void enterProbability_map(@NotNull ToPSParser.Probability_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#probability_map}.
	 * @param ctx the parse tree
	 */
	void exitProbability_map(@NotNull ToPSParser.Probability_mapContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(@NotNull ToPSParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(@NotNull ToPSParser.PropertiesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#list_double_element}.
	 * @param ctx the parse tree
	 */
	void enterList_double_element(@NotNull ToPSParser.List_double_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#list_double_element}.
	 * @param ctx the parse tree
	 */
	void exitList_double_element(@NotNull ToPSParser.List_double_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#probabilities_list}.
	 * @param ctx the parse tree
	 */
	void enterProbabilities_list(@NotNull ToPSParser.Probabilities_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#probabilities_list}.
	 * @param ctx the parse tree
	 */
	void exitProbabilities_list(@NotNull ToPSParser.Probabilities_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#conditional_probabilities_list}.
	 * @param ctx the parse tree
	 */
	void enterConditional_probabilities_list(@NotNull ToPSParser.Conditional_probabilities_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#conditional_probabilities_list}.
	 * @param ctx the parse tree
	 */
	void exitConditional_probabilities_list(@NotNull ToPSParser.Conditional_probabilities_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#list_str_element}.
	 * @param ctx the parse tree
	 */
	void enterList_str_element(@NotNull ToPSParser.List_str_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#list_str_element}.
	 * @param ctx the parse tree
	 */
	void exitList_str_element(@NotNull ToPSParser.List_str_elementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#list_str_elements}.
	 * @param ctx the parse tree
	 */
	void enterList_str_elements(@NotNull ToPSParser.List_str_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#list_str_elements}.
	 * @param ctx the parse tree
	 */
	void exitList_str_elements(@NotNull ToPSParser.List_str_elementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#probability_number}.
	 * @param ctx the parse tree
	 */
	void enterProbability_number(@NotNull ToPSParser.Probability_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#probability_number}.
	 * @param ctx the parse tree
	 */
	void exitProbability_number(@NotNull ToPSParser.Probability_numberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#sub_model}.
	 * @param ctx the parse tree
	 */
	void enterSub_model(@NotNull ToPSParser.Sub_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#sub_model}.
	 * @param ctx the parse tree
	 */
	void exitSub_model(@NotNull ToPSParser.Sub_modelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ToPSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ToPSParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#probability}.
	 * @param ctx the parse tree
	 */
	void enterProbability(@NotNull ToPSParser.ProbabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#probability}.
	 * @param ctx the parse tree
	 */
	void exitProbability(@NotNull ToPSParser.ProbabilityContext ctx);

	/**
	 * Enter a parse tree produced by {@link ToPSParser#list_str}.
	 * @param ctx the parse tree
	 */
	void enterList_str(@NotNull ToPSParser.List_strContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToPSParser#list_str}.
	 * @param ctx the parse tree
	 */
	void exitList_str(@NotNull ToPSParser.List_strContext ctx);
}