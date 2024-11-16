package ControlFlow;

public class SimplifyIFStatements {
    public static void doOperation() {
        int income = 1_000;
        // if(income > 1000) 
        // boolean hasIncome = true; // Variable declaration is not allowed here

        // if(income > 1000){
        //     boolean hasIncome = true; // Variable declaration is allowed here, but only work in this scope.
        // }
        
        // preferred way ,but even if it solve the problem it is not the best way 

        // boolean hasIncome;
        // if(income > 1000)
        //     hasIncome = true;
        // else
        //     hasIncome = false;
        
        // Another preferred way
        
        //boolean hasIncome = income > 1000 ? true: false; // it is best than the previous

        boolean hasIncome = income > 1000; // Which is the best ever way
        
    }
}