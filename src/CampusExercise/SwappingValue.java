package CampusExercise;

import java.util.Scanner;

public class SwappingValue {
    public static void doOperation() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(b < a) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
