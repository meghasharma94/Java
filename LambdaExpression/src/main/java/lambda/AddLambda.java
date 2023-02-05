package lambda;

public class AddLambda {
    public static void main(String[] args) {
        AddInterface add = (x, y) -> (x + y);
        System.out.println("The sum is : " + add.addTwoNumbers(100, 25));

        AddInterface add1 = (x, y) -> {
            int sum = x + y;
            System.out.println("The sum of the numbers are " + sum);
            return sum;
        };
        add1.addTwoNumbers(500, 600);
    }
}
