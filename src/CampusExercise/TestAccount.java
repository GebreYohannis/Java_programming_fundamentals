package CampusExercise;

import java.util.Scanner;

public class TestAccount {
    public static void test() {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(100);
        System.out.print("Balance: ");
        double balance = scanner.nextDouble();
        account.deposit(balance);
        account.showBalance();
    }
}
