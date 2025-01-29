package Exercises;

import java.text.NumberFormat;

public class MortgageReport {
    private final MortgageCalculator calculator;
    private final NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage(double mortgage) {
        System.out.println("MORTGAGE");
        System.out.println("-------------");
        System.out.println("Monthly Payment: " +
                currency.format(mortgage));
    }

    public void printPaymentSchedule(short numberOfPayments) {
        System.out.println("PAYMENT SCHEDULES");
        System.out.println("-----------------");
        var loanBalances = calculator.getRemainingLoanBalance(numberOfPayments);
        for (var loanBalance : loanBalances)
            System.out.println(currency.format(loanBalance));
    }

    public void doReport() {
        short numberOfPayments = calculator.getNumberOfPayments();
        printMortgage(calculator.calculateMortgage());
        printPaymentSchedule(numberOfPayments);
    }
}