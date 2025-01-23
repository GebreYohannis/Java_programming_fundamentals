package Exercises;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void doCalculate() {

        double principal = getPrincipal();
        float monthlyInterestRate = getMonthlyInterestRate();
        byte years = getYears();
        short numberOfPayments = getNumberOfPayments(years);

        printMortgage(principal, monthlyInterestRate, numberOfPayments);
        printPaymentSchedule( principal,numberOfPayments, monthlyInterestRate);
    }

    private static void printMortgage(
            double principal,
            float monthlyInterestRate,
            short numberOfPayments) {
        double mortgage = calculateMortgage(principal, monthlyInterestRate, numberOfPayments);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("-------------");
        System.out.println("Monthly Payment: " + mortgageFormatted );
    }

    private static int getMonthInYears(){
        return 12;
    }

    private static short getNumberOfPayments(byte years) {
        int monthInYears = getMonthInYears();
        return (short) (years * monthInYears);
    }

    private static byte getYears() {
        return (byte) readNumber("Period (Years): ",1,30);
    }

    private static float getAnnualInterestRate() {
        return (float) readNumber("Annual Interest Rate:",0,30);
    }

    private static float getMonthlyInterestRate() {
        int monthInYears = getMonthInYears();
        final float PERCENT = 100;
        final float ANNUAL_INTEREST_RATE = getAnnualInterestRate();
        return ANNUAL_INTEREST_RATE / PERCENT / monthInYears;
    }

    private static double getPrincipal() {
        return readNumber("Principal($1k - $1M): ", 1_1000,1_000_000);
    }

    private static void printPaymentSchedule(
            double principal,
            short numberOfPayments,
            float monthlyInterestRate) {
        System.out.println("PAYMENT SCHEDULES");
        System.out.println("-----------------");
        for(
                short numberOfPaymentsMade = 1;
                numberOfPaymentsMade <= numberOfPayments;
                numberOfPaymentsMade++) {
            double remainingLoan = calculateRemainingLoanBalance(
                    principal, monthlyInterestRate,
                    numberOfPayments,numberOfPaymentsMade);
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingLoan));
        }
    }

    private static double readNumber(
            String message,
            double minValue,
            double maxValue) {
        Scanner scanner = new Scanner(System.in);

        double value = 0;
        while(true){
            System.out.print(message);
            value = scanner.nextDouble();
            if(value >= minValue && value <= maxValue)
                break;
            System.out.println("Enter a value between" +  minValue + " and " +  maxValue + ".:");
        }
        return value;
    }

    public static double calculateMortgage(
            double principal,
            float monthlyInterestRate,
            short numberOfPayments){
        double mortgage = principal * ( monthlyInterestRate *
                (Math.pow(1 + monthlyInterestRate, numberOfPayments)/
                        (Math.pow(1 + monthlyInterestRate,numberOfPayments) - 1)));
       return mortgage;
    }

    public static double calculateRemainingLoanBalance(
            double principal,
            float monthlyInterestRate,
            short numberOfPayments,
            short numberOfPaymentsMade) {
        double remainingLoanBalance = principal* ((
                Math.pow(1 + monthlyInterestRate,numberOfPayments) -
                Math.pow(1 + monthlyInterestRate,numberOfPaymentsMade)) /
                        (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        return remainingLoanBalance;
    }
}
