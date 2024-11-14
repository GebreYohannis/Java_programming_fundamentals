package CampusExercise;

import java.time.chrono.MinguoChronology;

public class RandomArrayValue {
    public static void showRandomArray() {
        int randomArraySize = (int)Math.floor( Math.random()* 100 + 10);
        double[] randomNumbers = new double[randomArraySize];
        for (int i = 0; i < randomArraySize; i++) {
            randomNumbers[i] = Math.random() * (100 - 10) + 10;
        }
        for (double randomNumber : randomNumbers)
            System.out.println(randomNumber + " ");

        double[] cloned  = new double[randomArraySize];
        for (int i = 0; i < randomArraySize; i++)
            cloned[i] = randomNumbers[i];

        System.out.println("After cloned");
        for (double c : cloned)
            System.out.println(c);
        System.out.println("Done!");

        // Get Max of the array element
        double max = randomNumbers[0];
        for (int i = 1; i < randomArraySize; i++)
            if(max < randomNumbers[i])
                max = randomNumbers[i];
        System.out.println(max);

        // Get Min of the array element

        double min = randomNumbers[0];
        for (int i = 1; i < randomArraySize; ++i)
            if(min > randomNumbers[i])
                min = randomNumbers[i];
        System.out.println(min);
    }

}
