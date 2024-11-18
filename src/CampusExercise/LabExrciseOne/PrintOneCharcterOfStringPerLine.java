package CampusExercise.LabExrciseOne;

import java.util.Scanner;

public class PrintOneCharcterOfStringPerLine {
    public static void showPrintedResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String: ");
        String newString = scanner.nextLine();

        char[] letters = new char[newString.length()];
        letters = newString.toCharArray();
        for(char c : letters)
            System.out.println(c);
    }
}
