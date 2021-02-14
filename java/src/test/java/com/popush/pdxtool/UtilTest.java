package com.popush.pdxtool;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SoftAssertionsExtension.class)
class UtilTest {

    @Test
    void convertJson(SoftAssertions softAssertions) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        var url = classLoader.getResource("test.txt");
        if (url == null) {
            return;
        }

        var json = Util.convertJson(Paths.get(url.toURI()));

        Files.writeString(Paths.get("test.json"), json);
    }

}
