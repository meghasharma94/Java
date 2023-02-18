package supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierDemo1 {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();

        System.out.println("Local time without formatter " + s.get());

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());

        System.out.println("Local time with formatter " + s1.get());
    }


}
