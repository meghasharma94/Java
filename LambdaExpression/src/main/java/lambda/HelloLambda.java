package lambda;

public class HelloLambda {
    public static void main(String[] args) {
        //implementing displayHello Using Lambda ; no need to have an implementation class

        HelloInterface hello = () -> System.out.println("Hello Lambda !!");
        hello.displayHello();
    }
}
