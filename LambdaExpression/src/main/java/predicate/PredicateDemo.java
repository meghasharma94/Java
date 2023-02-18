package predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        withoutPredicate(); // without predicate functional interface
        withPredicate(); // with predicate functional interface
    }

    private static void withPredicate() {
        System.out.println("-------------------------------*****************************-----------------------------------");
        Integer amount = 20000;
        Predicate<Integer> p = transactionAmount -> transactionAmount > 10000;
        if (p.test(amount)) {
            System.out.println("#withPredicate -  Transaction Amount cant be greater than 10000");
        } else {
            System.out.println("#withPredicate - Transaction Amount is less than 10000");
        }
    }

    private static void withoutPredicate() {
        System.out.println("-------------------------------*****************************-----------------------------------");
        Integer transactionAmount = 20000;
        if (isGreater(transactionAmount)) {
            System.out.println("#withoutPredicate - Transaction Amount cant be greater than 10000");
        } else {
            System.out.println("withoutPredicate - Transaction Amount is less than 10000");
        }
    }

    private static boolean isGreater(Integer transactionAmount) {
        if (transactionAmount > 10000) {
            return true;
        }
        return false;
    }


}
