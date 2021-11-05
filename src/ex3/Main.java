package ex3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(
                new Subtract(
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        ),
                        new Const(3)
                ).evaluate(x)
        );
    }
}
