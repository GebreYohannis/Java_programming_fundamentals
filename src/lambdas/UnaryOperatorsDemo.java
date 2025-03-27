package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorsDemo {
    public static void show() {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        var result = increment.andThen(square).apply(10); // 121
        System.out.println(result);
        result = square.andThen(increment).apply(10); // 101
        System.out.println(result);
    }
}
