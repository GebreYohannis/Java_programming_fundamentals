package Exercises;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void doCalculation() {
        final byte  PERCENT = 100;
        final  byte MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        final double ANNUAL_INTEREST_RATE = scanner.nextDouble()/PERCENT;

        System.out.print("Period (Years): ");
        byte year = scanner.nextByte();
        final int numberOfPayments = year * MONTHS_IN_YEAR;

        final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / MONTHS_IN_YEAR;
        double mortgage = principal *(MONTHLY_INTEREST_RATE *
                Math.pow(1 + MONTHLY_INTEREST_RATE, numberOfPayments) /
                        (Math.pow(1 + MONTHLY_INTEREST_RATE, numberOfPayments)-1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgages: " + mortgageFormatted );

    }
}
