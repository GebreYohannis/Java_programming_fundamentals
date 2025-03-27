package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void show() {
        Predicate<String> isLongerThan5 = str->str.length() > 5;
        var result = isLongerThan5.test("Hello");
        System.out.println("IsLongerThan5: " + result);

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str->str.endsWith("}");

        // Logical AND(&&)
        Predicate<String> hasLeftAndRightBraces = hasRightBrace.and(hasRightBrace);
        var computedANDResult = hasLeftAndRightBraces.test("{Key:Value}");
        System.out.println("Computed AND Result: " + computedANDResult);

        // Logical OR(||)
        Predicate<String> hasLeftOrRightBrace = hasLeftBrace.or(hasRightBrace);
        var computedORResult = hasLeftOrRightBrace.test("{Key:Value");
        System.out.println("Computed OR Result: " + computedORResult);

        // Logical NOT(!)
        Predicate<String> doesLeftBraceExists = hasLeftBrace.negate();
        var computedNOTResult = doesLeftBraceExists.test("{Key:Value");
        System.out.println("Computed NOT Result: " + computedNOTResult);
        
        var afterNegate = doesLeftBraceExists.and(hasRightBrace).test("{Key:value}");
        System.out.println("After Negate:" + afterNegate);

        composeFunction();
    }

    private  static void composeFunction() {
        Function<String, String> replaceColon = str-> str.replace(":","=");
        Function<String,String> addBraces = str-> "{" + str + "}";

        // Declarative (Functional programming)
        var result = replaceColon
                .andThen(addBraces)
                .apply("Key:Value");
        result = addBraces
                .compose(replaceColon)
                .apply("Key:Value");
        System.out.println(result);
    }
}
