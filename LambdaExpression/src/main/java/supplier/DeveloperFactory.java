package supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class DeveloperFactory {
    public static void main(String[] args) {
        Developer obj = factory(Developer::new);
        System.out.println("Developer obj" + obj);

        Developer obj1 = factory(() -> new Developer("Megha", new BigDecimal(80), null));
        System.out.println("Developer new object " + obj1);



    }

    private static Developer factory(Supplier<? extends Developer> s) {

        Developer developer = s.get();
        if (developer.getName() == null || "".equals((developer.getName()))) {
            developer.setName("default");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.of(2017, 8, 8));

        return developer;
    }
}