package com.ilearn.junit.tests;

import com.ilearn.junit.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class RepeatedTests {

    @RepeatedTest(value = 25, name = RepeatedTest.LONG_DISPLAY_NAME)
    void test_repeated(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        List<Integer> iList = List.of(1, 2, 3, 4, 5);
        List<Integer> iSqlist = iList.stream()
                .map(n -> Calculator.multiply(n, n))
                .collect(Collectors.toList());

        assertIterableEquals(List.of(1, 4, 9, 16, 25), iSqlist);

        System.out.println("Repetition #:" + repetitionInfo.getCurrentRepetition()
                + "  Free : " + Runtime.getRuntime().freeMemory());

    }


}
