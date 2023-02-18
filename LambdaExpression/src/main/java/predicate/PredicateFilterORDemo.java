package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFilterORDemo {

    public static void main(String[] args) {

        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startsWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");


        List<String> collect = list.stream()
                .filter(lengthIs3.or(startsWithA))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
