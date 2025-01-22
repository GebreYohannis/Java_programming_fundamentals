package CampusExercise.LabExerciseThree;

import java.util.ArrayList;

public class CheckingAccount extends BankAccount {
    ArrayList<BankAccount> accounts = new ArrayList<>();
    public CheckingAccount(String accountHolderName, long accountNumber, String contactInformation, double balance) {
        super(accountHolderName, accountNumber, contactInformation, balance);
    }

    public void displayContactInfo() {
        for(var account: accounts)
            account.printStatement();
    }
}
