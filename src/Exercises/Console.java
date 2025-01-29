package Exercises;

import java.util.Scanner;

public class Console {
    private final static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double readNumber(
            String prompt,
            double minValue,
            double maxValue) {
        double value = 0;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= minValue && value <= maxValue)
                break;
            System.out.println("Enter a value between " +
                    minValue + " and " + maxValue + ".:");
        }
        return value;
    }
}