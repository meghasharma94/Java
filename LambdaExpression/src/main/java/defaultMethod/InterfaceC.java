package defaultMethod;

public interface InterfaceC {

    static int subtract(int a, int b) {
        return a - b;
    }

    default void sumC(int a, int b) {
        System.out.println("InterfaceC.sumC - " + (a + b));
    }

    default void multiply(int a, int b) {
        System.out.println("InterfaceC.multiply - " + (a * b));
    }

}
