package com.ilearn.junit.tests;

import com.ilearn.junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.platform.commons.util.StringUtils;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test_valueSource_square(Integer n) {
        Assertions.assertEquals(Math.pow(n, 2), Calculator.multiply(n, n).doubleValue(), "Square is incorrect");
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    void test_valueSource_nullOrBlankStrings(String input) {
        assertTrue(StringUtils.isBlank(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t", "\n"})
    void test_valueSource_AllTypesOfBlankStrings(String input) {
        assertTrue(StringUtils.isBlank(input));
    }

    @ParameterizedTest
    @EnumSource(Month.class)
    void test_valueSource_isMonthAlwaysBetweenOneAndTwelve(Month input) {
        int monthNum = input.getValue();
        assertTrue(monthNum >= 1 && monthNum <= 12);
    }


    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"}, mode = EnumSource.Mode.EXCLUDE)
    void test_valueSource_AreMonths31Days(Month input) {
        int monthNum = input.getValue();
        assertEquals(31, input.length(false));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void test_valueSource_AreMonths30Days(Month input) {
        assertEquals(30, input.length(false));
    }

    @ParameterizedTest(name = "Check is {index} -  {0} is a multiple of 2")
    @ValueSource(ints = {2, 4, 6, 8, 9, -1})
    void test_multipleof2(Integer i) {
        assertTrue(Calculator.modulus(i, 2) == 0);
    }


    //CSV - comma separated value
    //"name1 , value1","name2, value2"
    @ParameterizedTest
    @CsvSource(value = {"Megha, 1", "Sunny, 2"})
    void test_csvSource(String name, Integer id) {
        System.out.println(name + ", " + id);
        assertNotNull(name);
        assertTrue(id > 0);
    }

    //large set of values with importing the csv file
    @ParameterizedTest
    @CsvFileSource(resources = "/testfile.csv")
    void test_csvFileSource(int num, int square) {
        System.out.println(num + ", " + square);
        assertEquals(square, Calculator.multiply(num, num));
    }


}
