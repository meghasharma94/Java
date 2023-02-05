package lambda;

public class AddBeforeLambda implements AddInterface {
    public static void main(String[] args) {

        AddInterface add = new AddBeforeLambda();
        System.out.println(add.addTwoNumbers(50, 45));
    }

    @Override
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
