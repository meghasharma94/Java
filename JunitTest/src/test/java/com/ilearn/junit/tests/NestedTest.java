package com.ilearn.junit.tests;

import com.ilearn.junit.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class NestedTest {
    @BeforeAll
    static void before_all(TestInfo testInfo) {
        System.out.println("Getting all connections" + testInfo.getDisplayName());
    }

    @AfterAll
    static void after_all(TestInfo testInfo) {
        System.out.println("Closing all connections" + testInfo.getDisplayName());
    }

    @BeforeEach
    void before_each(TestInfo info) {
        System.out.println("Prepare environment before test" + info.getDisplayName());
    }

    @AfterEach
    void after_each(TestInfo info) {
        System.out.println("Clean up environment after each test" + info.getDisplayName());
    }

    @DisplayName("Test Multiplication Success")
    @Test
    void test_multiply_assertTrue() {
        assertTrue(Calculator.multiply(3, 6).compareTo(18) == 0);
    }

    @Nested
    @DisplayName("Nested classes for calculator's exception functionality")
    class ExceptionTest {
        @DisplayName("Test Null Response")
        @Test
        void test_divide_nullResponse() {
            assertNull(Calculator.divide(1, 0));
        }

        @DisplayName("Test NullPointer Exception")
        @Test
        void test_exception() {
            assertThrows(NullPointerException.class, () -> Calculator.add(null, null));
        }
    }

    @Nested
    @DisplayName("Nested classes for calculator's addition functionality")
    class AdditionTest {
        @DisplayName("Test Addition Success")
        @Test
        void test_addition_success() {
            assertEquals(5, Calculator.add(2, 3));
        }

        @DisplayName("Test Addition Failure")
        @Test
        void test_addition_failure() {
            assertNotEquals(0, Calculator.add(1, 0));
        }
    }
}
