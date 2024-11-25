package CampusExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordsFromText {
    public static void doWordCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Message: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        System.out.println(Arrays.toString(words));

        int wordCount = 0;
        int letterCount = 0;
        for(String word: words) {
            System.out.println(word);
            if(word.length() > 1) wordCount++;
            else letterCount++;
        }

        System.out.println("Hey! You have " + wordCount + " words and " + letterCount +  " letters in your message!");

    }
}
