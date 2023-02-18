package consumer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> print = x-> System.out.println(x);
        print.accept("hello world");
    }
}
