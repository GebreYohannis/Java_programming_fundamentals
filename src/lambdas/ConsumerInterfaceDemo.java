package lambdas;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
    public static void show() {
        List<Integer> items = List.of(1,2,3,4);

        // We have two ways to iterate over the list

        // Imperative programming (for,while,do...while, if/else, switch/case)
        // It says how something should be done
        for (var item: items)
            System.out.println(item);
        // Or we can iterate as follows
        // Declarative programming
        // It says what is to be done
        items.forEach((Integer item)-> System.out.println(item)); // or
        items.forEach(item -> System.out.println(item)); // or
        items.forEach(System.out::println);

        chainingConsumer();
    }

    public static void chainingConsumer() {
        List<String> list = List.of("a","b","c");
        Consumer<String> print = (String item)-> System.out.println(item);
        Consumer<String> printUpperCase = item-> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUpperCase)); // Chaining consumers: executing two operation
        list.forEach(print.andThen(printUpperCase).andThen(print)); // Chaining consumers: executing three operation
    }
}
