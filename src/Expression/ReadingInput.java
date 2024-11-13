package Expression;

import java.text.NumberFormat;
import java.util.Scanner;

public class ReadingInput {
    public static void doOperation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is you name? : ");
        String name = scanner.nextLine();

        System.out.print("How old are you? : ");
        int age  = scanner.nextInt();

        System.out.println("Hi, " + name + " you are " + age + " years old.");

        System.out.print("Hi, Product manger, What is your name? : ");
        String productMangerName = scanner.nextLine();

        System.out.print("Name of product: ");
        String productName = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.println("Hi, manager " + productMangerName + "You have the following product in details.");
        System.out.println(productName);
        System.out.println(NumberFormat.getCurrencyInstance().format(price));


    }
}
