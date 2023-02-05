package defaultMethod;

public interface InterfaceC {

    default void sumC(int a, int b) {
        System.out.println("InterfaceC.sumC - " + (a + b));
    }

    default void multiply(int a, int b) {
        System.out.println("InterfaceC.multiply - " + (a * b));
    }

}
