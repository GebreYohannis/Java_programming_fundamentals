package CampusExercise.LabExrciseOne;

import java.util.Scanner;

public class ShowVowels {
    public static void showVowels() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String newString = scanner.nextLine();
        char[] vowels = {'a','e','i','o','u'};

        char[] letters = new char[newString.length()];
        letters = newString.toCharArray();

        int vowelCounter = 0;
        int consonantCounter = 0;
        for (int i = 0; i < newString.length(); ++i ) {
            for(char l : vowels ) {
                if( l == letters[i]) {
//                    System.out.print(l);
                    vowelCounter++;
                }
            }
        }
        consonantCounter = newString.length() - vowelCounter;
        System.out.println("Vowels: " + vowelCounter);
        System.out.println("Consonants: " + consonantCounter);

    }
}
