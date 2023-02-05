package defaultMethod;

public interface InterfaceA {

    default void sumA(int a, int b) {
        System.out.println("InterfaceA.sumA - " + (a + b));
    }

    default void multiply(int a, int b) {
        System.out.println("InterfaceA.multiply - " + (a * b));
    }

}
