package com.ilearn.junit;

public class Calculator {

    public static Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    public static Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public static Integer divide(Integer a, Integer b) {
        return b == 0 ? null : a / b;
    }

    public static Integer modulus(Integer a, Integer b) {
        return a % b;
    }
}
