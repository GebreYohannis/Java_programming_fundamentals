package lambdas;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void show() {
        Function<String, Integer> map = value->value.length();
        var length = map.apply("Sky");
        System.out.println(length);
        Function<Integer,String> intToString = (Integer item)-> item.toString();

        var convertedValueLength = intToString.andThen(map).apply(1234); // Chaining functional interface
        System.out.println(convertedValueLength);

        // Composing function
        // Convert "Key:Value" to "{Key=Value}" by composing the following functions
        Function<String, String> replaceColon = str->str.replace(":","=");
        Function<String, String> addBraces = str-> "{" + str + "}";

        // Declarative programming
        var result = replaceColon
                    .andThen(addBraces)
                    .apply("Key:Value");
        System.out.println("Result: " + result);

        // To Compose like the above you have to use the reverse of the functions as follows
        var composeResult = addBraces.compose(replaceColon).apply("Key:Value");
        System.out.println("Compose Result: " + composeResult);

    }
}
