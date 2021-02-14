// Generated from C:/repo/paradox_util\Pdx.g4 by ANTLR 4.9.1
package com.popush.pdxtool.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PdxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PdxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PdxParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(PdxParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PdxParser#nameSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameSeparator(PdxParser.NameSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PdxParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PdxParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PdxParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(PdxParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PdxParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PdxParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PdxParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PdxParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PdxParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(PdxParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PdxParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PdxParser.ArrayContext ctx);
}