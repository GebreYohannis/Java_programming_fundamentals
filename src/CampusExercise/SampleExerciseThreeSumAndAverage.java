package CampusExercise;

import java.util.Scanner;

public class SampleExerciseThreeSumAndAverage {
    public static void doOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            sum += i;
        }
        for (int i = 0; i >= number; i--) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        double average = (double)sum / (double)number;
        System.out.println("Average = " + average);
    }
}
