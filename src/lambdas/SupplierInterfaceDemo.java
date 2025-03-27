package lambdas;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void show() {
        Supplier<Integer> getRandom = ()-> new Random().nextInt();
        // The above function is not executed until we run the following operation
        // this is called lazy evaluation
        var randomInt = getRandom.get();
        System.out.println(randomInt);
    }
}
