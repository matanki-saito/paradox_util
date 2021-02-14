package com.popush.pdxtool;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

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
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String convertJson(Path txtFile) throws IOException {
        var charStream = CharStreams.fromPath(txtFile);
        var lexer = new PdxLexer(charStream);
        var tokens = new CommonTokenStream(lexer);
        var parser = new PdxParser(tokens);

        return toJson(parser.root());
    }

    public static String convertTxt(Path jsonFile) throws IOException {
        Object data = objectMapper.readValue(jsonFile.toFile(), Object.class);

        return decompile(data, 0);
    }

    public static String toJson(RootContext tree) throws JsonProcessingException {
        return toJson(tree, true);
    }

    public static String toJson(RootContext tree, boolean prettyPrint) throws JsonProcessingException {
        var map = compile(tree);
        return prettyPrint ? objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map)
                           : objectMapper.writeValueAsString(map);
    }

    public static String decompile(Object data, int depth) {
        final int incrementedDepth = depth + 1;
        final String indent = StringUtils.repeat(" ", depth);

        if (data instanceof List<?> arrayList) {
            var joiningListText = arrayList.stream()
                                           .map(x -> indent + Util.decompile(x, incrementedDepth))
                                           .collect(Collectors.joining("\n"));

            if (depth == 0) { // root
                return joiningListText;
            } else {
                return "{%n%s%n%s}".formatted(joiningListText, StringUtils.repeat(" ", depth - 2));
            }

        }

        if (data instanceof String string) {
            return string;
        }

        if (data instanceof Number number) {
            return number.toString();
        }

        if (data instanceof Map<?, ?> map) {
            var first = map
                    .entrySet()
                    .stream()
                    .findFirst();

            if (first.isPresent()) {
                var key = first.get().getKey().toString();
                var sKey = key.split("\\|");

                return "%s %s %s".formatted(
                        sKey.length > 1 ? sKey[0] : key,
                        sKey.length > 1 ? sKey[1] : "=",
                        decompile(first.get().getValue(), incrementedDepth)
                );
            }
        }

        throw new IllegalArgumentException();
    }

    public static Object compile(ParseTree tree) {
        if (tree instanceof RootContext rootContext) {
            return rootContext
                    .elements
                    .stream()
                    .map(Util::compile)
                    .collect(Collectors.toList());
        }

        if (tree instanceof ElementContext elementContext) {
            return compile(elementContext.getChild(0));
        }

        if (tree instanceof ArrayContext arrayContext) {
            return arrayContext
                    .elements
                    .stream()
                    .map(Util::compile)
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
                    compile(keyValueContext.value().getChild(0))
            );
        }

        return null;
    }
}
