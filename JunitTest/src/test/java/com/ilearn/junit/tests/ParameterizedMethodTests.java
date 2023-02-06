package com.ilearn.junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.StringUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedMethodTests {


    private static Stream<Arguments> test_isBlank_shouldReturnTrueForNullorBlank() {
        return Stream.of(Arguments.of(null, true),
                Arguments.of("", true),
                Arguments.of(" ", true),
                Arguments.of("notBlank", false)
        );
    }

    @ParameterizedTest()
    @MethodSource()
        // no method name passed , it will match the same name as test method
    void test_isBlank_shouldReturnTrueForNullorBlank(String input) {
        assertTrue(StringUtils.isBlank(input));
    }


}
