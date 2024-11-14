package CampusExercise;

import java.util.Random;

public class RandomNumber {
    public static void generateRandomNumber() {
        Random random = new Random();
        int[] randomNumbersList = new int[10];
        for (int i = 0; i < 10; ++i)
            randomNumbersList[i] = random.nextInt(100);
        for(int randomNumber: randomNumbersList)
            System.out.print(randomNumber + " ");

    }
}
