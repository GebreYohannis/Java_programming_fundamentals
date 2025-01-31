package exceptions;

import java.io.IOException;

public class TestAccount {
    public static void doTest() {
        Account account = new Account();
//        try {
//            account.deposit(200);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            account.withdraw(300);
//        } catch (InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            account.betterCodeForChainingException(90);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
