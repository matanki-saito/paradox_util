package com.popush.pdxtool;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.popush.pdxtool.antlr.PdxLexer;
import com.popush.pdxtool.antlr.PdxParser;
import com.popush.pdxtool.antlr.PdxParser.ArrayContext;
import com.popush.pdxtool.antlr.PdxParser.ElementContext;
import com.popush.pdxtool.antlr.PdxParser.KeyValueContext;
import com.popush.pdxtool.antlr.PdxParser.PrimitiveContext;
import com.popush.pdxtool.antlr.PdxParser.RootContext;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Util {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String convertJson(Path file) throws IOException {
        var charStream = CharStreams.fromPath(file);
        var lexer = new PdxLexer(charStream);
        var tokens = new CommonTokenStream(lexer);
        var parser = new PdxParser(tokens);

        return toJson(parser.root());
    }

    public static String toJson(RootContext tree) throws JsonProcessingException {
        return toJson(tree, true);
    }

    public static String toJson(RootContext tree, boolean prettyPrint) throws JsonProcessingException {
        var map = toMap(tree);
        return prettyPrint ? mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map)
                           : mapper.writeValueAsString(map);
    }

    public static Object toMap(RootContext tree) {
        return traverse(tree);
    }

    public static Object traverse(ParseTree tree) {

        if (tree instanceof RootContext rootContext) {
            return rootContext
                    .elements
                    .stream()
                    .map(Util::traverse)
                    .collect(Collectors.toList());
        }

        if (tree instanceof ElementContext elementContext) {
            return traverse(elementContext.getChild(0));
        }

        if (tree instanceof ArrayContext arrayContext) {
            return arrayContext
                    .elements
                    .stream()
                    .map(Util::traverse)
                    .collect(Collectors.toList());
        }

        if (tree instanceof PrimitiveContext primitiveContext) {
            return primitiveContext.getChild(0).getText();
        }

        if (tree instanceof KeyValueContext keyValueContext) {
            var key = keyValueContext.key().getChild(0).toString();
            var operator = keyValueContext.nameSeparator().getChild(0).toString();
            return Map.of(
                    operator.equals("=") ? key : "%s|%s".formatted(key, operator),
                    traverse(keyValueContext.value().getChild(0))
            );
        }

        return null;
    }
}
