package CampusExercise;

import java.text.NumberFormat;

public class Bank {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void showInfo() {
        System.out.println("Balance: " + NumberFormat.getCurrencyInstance().format(this.balance));
    }
}
