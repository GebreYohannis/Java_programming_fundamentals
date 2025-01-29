package Exercises;

import java.text.NumberFormat;
import java.util.Scanner;

public class ConsoleHandler {
    static void printMortgage(
            double principal,
            float monthlyInterestRate,
            short numberOfPayments) {
        double mortgage = MortgageCalculator.calculateMortgage(principal, monthlyInterestRate, numberOfPayments);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("-------------");
        System.out.println("Monthly Payment: " + mortgageFormatted);
    }

    static byte getYears() {
        return (byte) readNumber("Period (Years): ", 1, 30);
    }

    static float getAnnualInterestRate() {
        return (float) readNumber("Annual Interest Rate:", 0, 30);
    }

    static double getPrincipal() {
        return readNumber("Principal($1k - $1M): ", 1_1000, 1_000_000);
    }

    static void printPaymentSchedule(
            double principal,
            short numberOfPayments,
            float monthlyInterestRate) {
        System.out.println("PAYMENT SCHEDULES");
        System.out.println("-----------------");
        for (
                short numberOfPaymentsMade = 1;
                numberOfPaymentsMade <= numberOfPayments;
                numberOfPaymentsMade++) {
            double remainingLoan = MortgageCalculator.calculateRemainingLoanBalance(
                    principal, monthlyInterestRate,
                    numberOfPayments, numberOfPaymentsMade);
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingLoan));
        }
    }

    static double readNumber(
            String message,
            double minValue,
            double maxValue) {
        Scanner scanner = new Scanner(System.in);

        double value = 0;
        while (true) {
            System.out.print(message);
            value = scanner.nextDouble();
            if (value >= minValue && value <= maxValue)
                break;
            System.out.println("Enter a value between " + minValue + " and " + maxValue + ".:");
        }
        return value;
    }
}