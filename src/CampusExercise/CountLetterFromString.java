package CampusExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CountLetterFromString {
    public static void showCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String newString = scanner.nextLine();
        char[] letters = new char[newString.length()];
        letters = newString.toCharArray();
        int count = 0;
        for(int i = 0; i < newString.length(); ++i) {
            if(letters[i] == 'a')
                count++;
        }
        System.out.println("Count: " + count);
    }
}
