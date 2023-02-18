package function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        beforeJava8(); // without function functional interface
        fromJava8(); // with function functional interface
    }

    private static void fromJava8() {
        Double inrRate = 80.00;
        Function<Integer, Double> function = usd -> usd * inrRate;
        System.out.println("From java 8 onwards" + "10 USD = " + function.apply(10));
    }

    private static void beforeJava8() {
        Integer usd = 10;
        Double inrVal = convertUSDToINR(usd);
        System.out.println("From before java8" + usd + "USd =" + inrVal + "INR");
    }

    private static Double convertUSDToINR(Integer usd) {
        Double inrRate = 80.00;
        return usd * inrRate;

    }
}
