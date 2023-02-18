package function;

import java.util.function.Function;

public class FunctionDemo1 {

    public static void main(String[] args) {

        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s + " World";

        System.out.println("-------------------------------*****************************-----------------------------------");

        System.out.println("Output of function1 : " + function1.apply("Hello"));

        System.out.println("Output of andThen : " + function1.andThen(function2).apply("Hello"));


        Function<Integer, Integer> function3 = n1 -> n1 + n1;
        Function<Integer, Integer> function4 = n1 -> n1 * n1;
        System.out.println("-------------------------------*****************************-----------------------------------");

        System.out.println("Function1 andThen Function2 : " + function3.andThen(function4).apply(10));


    }
}
