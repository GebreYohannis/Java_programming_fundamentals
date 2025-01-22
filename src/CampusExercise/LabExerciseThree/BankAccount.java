package CampusExercise.LabExerciseThree;

public class BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private String contactInformation;
    private double balance;
    public BankAccount(String accountHolderName, long accountNumber, String contactInformation, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.contactInformation = contactInformation;
        setBalance(balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void deposit(double amount) {
        if(amount <= 0)
            throw new IllegalArgumentException("Amount cannot be negative!");
        this.balance += amount;
    }

    protected void printStatement() {
        System.out.println("Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Contact Information: " + this.contactInformation);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative!");
        this.balance = balance;
    }
}
