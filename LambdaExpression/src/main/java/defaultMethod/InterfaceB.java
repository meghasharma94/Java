
package defaultMethod;

public interface InterfaceB {

    default void sumB(int a, int b) {
        System.out.println("InterfaceB.sumB - " + (a + b));
    }

    default void multiply(int a, int b) {
        System.out.println("InterfaceB.multiply - " + (a * b));
    }

}
