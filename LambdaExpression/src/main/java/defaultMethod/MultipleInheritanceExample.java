package defaultMethod;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {

    public static void main(String[] args) {

        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(5, 9);
        multipleInheritanceExample.sumB(45, 50);
        multipleInheritanceExample.sumC(80, 50);
        multipleInheritanceExample.multiply(12, 3);

    }

    public void sumC(int a, int b) {
        System.out.println("MultipleInheritanceExample.sumC - " + (a + b));
    }

    @Override
    public void multiply(int a, int b) {
        InterfaceA.super.multiply(a, b);
        InterfaceB.super.multiply(a, b);
        InterfaceC.super.multiply(a, b);

    }
}
