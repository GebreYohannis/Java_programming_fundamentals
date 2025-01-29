package Exercises;
public class MortgageReport{
static void printMortgage(
            double principal,
            float monthlyInterestRate,
            short numberOfPayments) {
        double mortgage = Exercises.MortgageCalculator.calculateMortgage(principal, monthlyInterestRate, numberOfPayments);
        java.lang.String mortgageFormatted = java.text.NumberFormat.getCurrencyInstance().format(mortgage);
        java.lang.System.out.println("MORTGAGE");
        java.lang.System.out.println("-------------");
        java.lang.System.out.println("Monthly Payment: " + mortgageFormatted);
    }static void printPaymentSchedule(
            double principal,
            short numberOfPayments,
            float monthlyInterestRate) {
        java.lang.System.out.println("PAYMENT SCHEDULES");
        java.lang.System.out.println("-----------------");
        for (
                short numberOfPaymentsMade = 1;
                numberOfPaymentsMade <= numberOfPayments;
                numberOfPaymentsMade++) {
            double remainingLoan = Exercises.MortgageCalculator.calculateRemainingLoanBalance(
                    principal, monthlyInterestRate,
                    numberOfPayments, numberOfPaymentsMade);
            java.lang.System.out.println(java.text.NumberFormat.getCurrencyInstance().format(remainingLoan));
        }
    }}