package defaultMethod;

public class MultipleInheritanceExample implements InterfaceA, InterfaceB, InterfaceC {

    public static void main(String[] args) {

        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(5, 9);
        multipleInheritanceExample.sumB(45, 50);
        multipleInheritanceExample.sumC(80, 50);
        multipleInheritanceExample.multiply(12, 3);

        System.out.println("Subtract InterfaceB :" + InterfaceB.subtract(4, 2));
        System.out.println("Subtract InterfaceC :" + InterfaceC.subtract(48, 72));


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
