package CampusExercise;

import java.util.Scanner;

public class SampleExerciseOne {
    public static void sumOfNNumbers(long n){
        long sum = 0;
        for (long i = 1; i <= n; ++i)
            sum += i;
        System.out.println("Sum: " + sum);
    }
    public static void readNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First:");
        int a = scanner.nextInt();

        System.out.print("Second:");
        int b = scanner.nextInt();

        for(int i = a; i <= b; i++)
            System.out.print(i + " ");

        for(int i = b; i <= a; i++)
            System.out.print(i + " ");
    }
    public static void showSumOfEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number >= 2: ");
        int number = scanner.nextInt();

        if(number < 2)
            System.out.println("Sorry! Please, try again!");
        else {
            int sum = 0;
            for (int i = 2; i <= number; i++)
                if(i % 2 == 0)
                    sum += i;
            System.out.println("Sum = "  + sum);
        }

    }
    public static void sumOfDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        number = number < 0 ? -1 * number : number;
        int sum = 0;
        while (number > 0 ) {
            int d = number % 10;
            sum  += d;
            number = number/10;
        }
        sum = number < 0 ?  -sum : sum;
        System.out.println("Sum = " + sum);
    }
}
