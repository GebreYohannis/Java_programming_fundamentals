package CampusExercise;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomNumber {
    public static void generate() {
        Random random = new Random();
        int minValue = 10;
        int maxValue = 20;

        int[] randomValues = new int[5];
        for (int i = 0; i < 5; i++) {
            randomValues[i] = random.nextInt(minValue,maxValue);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(randomValues[i] + " ");
        }

        int minNumber  = randomValues[0];
        for (int i = 1; i < 5; i++) {
            if(minNumber > randomValues[i])
                minNumber = randomValues[i];
        }
        System.out.println();
        System.out.println("MinNumber: " + minNumber);


        int[] randomNumbers = new int[5];
        for (int i = 0; i < 5; ++i) {
            randomNumbers[i] = random.nextInt(1,50);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        Arrays.sort(randomNumbers);

        for (int i = 0; i < 5; i++) {
            System.out.print(randomNumbers[i] + " ");
        }

        int[] theLargestTwo = new int[2];
        for (int i = 3; i < 5 ; i++) {
            theLargestTwo[i-3] = randomNumbers[i];
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print(theLargestTwo[i] + " ");
        }

    }
}
