package ControlFlow;

public class TernaryOperator {
    public static void doOperation() {
        int income = 100;
        String className;
        if(income > 1000)
            className = "First";
        else
            className = "Economy";
        // the best way

        String userClass = income > 1000 ? "First" : "Economy";

        int number = 10;
        String result = number % 2 == 0 ? "Even" : "Odd";

        result = number >= 0 ? "Not negative" : "Negative";

    }
}