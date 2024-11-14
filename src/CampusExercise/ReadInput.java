package CampusExercise;

import java.util.Scanner;

public class ReadInput {
    public static void displayAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you? ❓😂: ");
        int age = scanner.nextInt();
        System.out.println("Hi,😂 you are " + age + " years old");
    }
    public static void displayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's you name? ❓😂: ");
        String name = scanner.nextLine();
        System.out.println("😂 Hi, " + name + " nice to meet you!");
    };

    public static void compareTwoListOfIntegers() {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        System.out.println("Enter First List of Integers:");
        int[] firstList = new int[size];
        for (int i = 0; i <size; i++) {
            System.out.print("firstList[" + i + "]: ");
            firstList[i] = scanner.nextInt();
        }

        System.out.println("Enter Second List of Integers:");
        int[] secondList = new int[size];
        for (int i = 0; i <size; i++) {
            System.out.print("secondList[" + i + "]: ");
            secondList[i] = scanner.nextInt();
        }

        // compare the two list

        int count = 0;
        for (int i = 0; i < size; i++)
            if (firstList[i] == secondList[i])
                count++;

        if (count == size)
            System.out.println("Equal!");
        else System.out.println("Not equal!");
    }
}
