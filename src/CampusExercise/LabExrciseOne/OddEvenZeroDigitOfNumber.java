package CampusExercise.LabExrciseOne;

import java.util.Scanner;

public class OddEvenZeroDigitOfNumber {
    public static void showResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        int zeroCounter = 0;
        int oddCounter = 0;
        int evenCounter = 0;


        while(number > 0) {
            int remainder = number % 10;
            if(remainder == 0)
                zeroCounter++;
            if (remainder % 2 == 0)
                evenCounter++;
            else
                oddCounter++;
            number /= 10;
        }

        System.out.println("ZeroCount: " + zeroCounter);
        System.out.println("OddCount: " + oddCounter);
        System.out.println("EvenCount: " + evenCounter);
    }
}
