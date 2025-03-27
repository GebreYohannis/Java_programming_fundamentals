package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorsDemo {
    public static void show() {
        BinaryOperator<Integer> add = (a, b)-> a + b;

        Function<Integer, Integer> squareWithFunction = a -> a * a;

        UnaryOperator<Integer>  squareWithUniaryOperator = (a)-> a * a;

        var result = add.andThen(squareWithFunction).apply(2,4);
        System.out.println("result: " + result);
    }
}
