// Generated from C:/repo/paradox_util\Pdx.g4 by ANTLR 4.9.1
package com.popush.pdxtool.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PdxParser}.
 */
public interface PdxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PdxParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(PdxParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(PdxParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdxParser#nameSeparator}.
	 * @param ctx the parse tree
	 */
	void enterNameSeparator(PdxParser.NameSeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#nameSeparator}.
	 * @param ctx the parse tree
	 */
	void exitNameSeparator(PdxParser.NameSeparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdxParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PdxParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PdxParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdxParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(PdxParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(PdxParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdxParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PdxParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PdxParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdxParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PdxParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PdxParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdxParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(PdxParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(PdxParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdxParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PdxParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdxParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PdxParser.ArrayContext ctx);
}