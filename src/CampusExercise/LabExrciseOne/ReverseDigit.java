package CampusExercise.LabExrciseOne;

import java.util.Scanner;

public class ReverseDigit {
    public static void reverseDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digit: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        int reversed = 0;
        number = number < 0 ? -number: number;

        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        reversed = originalNumber < 0 ? -reversed: reversed;
        number = originalNumber;

        System.out.println(number);

        System.out.println(reversed);
    }
}
