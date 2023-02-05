package MethodReference;

/**
 * We are refering to a interface method using double colon;
 * As it allows to refer one method from another method.
 * It is an alternative syntax to lambda expressions
 *
 * <p>
 * Rules :
 * <p>
 * 1) Method name in interface and class need not be same , still we can refer the methods
 * 2) It is mandatory that parameters should be same in both the methods
 * 3) Method Reference can be used with functional interface only.
 * 4) The return type of interface method and class method can be different
 *
 **/
public class HelloMethodReference {
    static void sayHelloMethodReference() {  // Rule 1
        System.out.println("From helloMethodReference !!");
    }

    static void sayHelloMethodReferenceXYZ() { // Rule 2
        System.out.println("From helloMethodReferenceXYZ !!");
    }

    static int sayHelloMethodReferenceInt() { // Rule 4
        System.out.println("From helloMethodReference with int return type !!");
        return 1;
    }

    public static void main(String[] args) {
        HelloMethodReferenceInterface hello = HelloMethodReference::sayHelloMethodReference;
        hello.sayHelloMethodReference();

        HelloMethodReferenceInterface hello1 = HelloMethodReference::sayHelloMethodReferenceXYZ;
        hello1.sayHelloMethodReference();

        HelloMethodReferenceInterface helloInt = HelloMethodReference::sayHelloMethodReferenceInt;
        helloInt.sayHelloMethodReference();


        HelloMethodReference obj = new HelloMethodReference();
        HelloMethodReferenceInterface helloNon = obj::sayHelloMethodReferenceNon;
        helloNon.sayHelloMethodReference();

    }

    private void sayHelloMethodReferenceNon() {
        System.out.println("From helloMethodReference - Non static !!");
    }
}
