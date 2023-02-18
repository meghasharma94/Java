package function;

import java.util.function.Function;

public class FunctionDemo2 {

    public static void main(String[] args) {

        Function<Integer, Integer> function1 = n1 -> n1 + n1;
        Function<Integer, Integer> function2 = n1 -> n1 * n1;
        System.out.println("-------------------------------*****************************-----------------------------------");

        System.out.println("Function1 compose Function2 : " + function1.compose(function2).apply(10));

        Function<String, String> function3 = s -> s.toUpperCase();
        Function<String, String> function4 = s -> s + " World";

        System.out.println("-------------------------------*****************************-----------------------------------");

        System.out.println("Output of function3 : " + function3.apply("Hello"));

        System.out.println("Output of compose : " + function3.compose(function4).apply("Hello"));

    }
}
