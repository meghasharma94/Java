package lambda;

public class HelloBeforeLambda implements HelloInterface {
    public static void main(String[] args) {
        HelloInterface hello = new HelloBeforeLambda();
        hello.displayHello();
    }

    @Override
    public void displayHello() {
        System.out.println("Hello without Lambda!!");
    }
}
