package com.ilearn.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeEach
    void setUp() {
        System.out.println("Printing the test results!!");
    }

    @Test
    void test_addition_success() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void test_addition_failure() {
        assertNotEquals(0, Calculator.add(1, 0));
    }

    @Test
    void test_multiply_assertTrue() {
        assertTrue(Calculator.multiply(3, 6).compareTo(18) == 0);
    }

    @Test
    void test_divide_nullResponse() {
        assertNull(Calculator.divide(1, 0));
    }

    @Test
    void test_exception() {
        assertThrows(NullPointerException.class, () -> Calculator.add(null, null));
    }
}