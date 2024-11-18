package CampusExercise;

import java.util.Scanner;

public class SampleExerciseTwo {
    public static void doOperation(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
        System.out.print("Integers[" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        int smallest = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (smallest > numbers[i])
                smallest = numbers[i];
        }
        System.out.println("Smallest value = " + smallest);

        System.out.println("Even numbers: ");
        for (int i = 0; i < 5; i++) {
            if(numbers[i] % 2 == 0)
                System.out.print(numbers[i] + " ");
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if(numbers[i] > 50)
                count++;
        }
        System.out.println();
        System.out.println("You have " + count + " numbers that are greater than 50");

    }
}
