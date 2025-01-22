package CampusExercise.LabExerciseThree;

import java.util.ArrayList;

public class SavingAccount extends  BankAccount {
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    private double interest;
    public SavingAccount(String accountHolderName, long accountNumber, String contactInformation,double balance) {
        super(accountHolderName, accountNumber, contactInformation, balance);
    }
    public void displayCustomerInfo() {
        for (var account: accounts)
            account.printStatement();
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    public void payInterest() {
        // logic for paying interest
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
}
