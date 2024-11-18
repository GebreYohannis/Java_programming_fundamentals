package CampusExercise;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String newString = scanner.nextLine();

        int length = newString.length();

        char[] letters = new char[length];
        letters = newString.toCharArray();

        System.out.println(letters);

        char[] reversedLetters = new char[length];

        for (int i = 0; i < length; i++) {
            reversedLetters[i] = letters[length - i - 1];
        }
        System.out.println(reversedLetters);

        boolean isPalindrome = true;
        for (int i = 0; i < length; i++) {
            if(letters[i] != reversedLetters[i]) {
                isPalindrome = false;
                break;
            }
        }
       String result = isPalindrome ? "Palindrome" : "Not palindrome";
        System.out.println(result);
    }
}
