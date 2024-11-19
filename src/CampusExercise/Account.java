package CampusExercise;

import java.text.NumberFormat;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance = amount;
    }

    public void showBalance() {
        System.out.println("Balance: " + NumberFormat.getCurrencyInstance().format(this.balance));
    }
}
