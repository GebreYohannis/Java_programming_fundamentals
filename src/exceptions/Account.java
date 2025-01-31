package exceptions;

import java.io.IOException;

public class Account {
    private double balance;

    public void deposit(double amount) throws IOException {
        if (amount <= 0)
            throw new IOException("Amount cannot be 0 or less!");
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount >= balance)
            throw new InsufficientFundsException("Insufficient funds in your account!");
        this.balance -= amount;
    }

    //    I am going to use the following method for showing how to chain exceptions
    public void chainingExceptions(double amount) throws AccountException {
        if (amount >= balance) {
            var fundsException = new InsufficientFundsException("Insufficient funds.");
            var accountException = new AccountException("Account exception");
            accountException.initCause(fundsException); // Initialize the cause of this throwable exception object
            throw accountException;
        }
        this.balance -= amount;
    }

    public void betterCodeForChainingException(double amount) throws AccountException {
        if (amount >= balance)
            throw new AccountException(new InsufficientFundsException("Insufficient funds message!"));
        this.balance -= amount;
    }
}
