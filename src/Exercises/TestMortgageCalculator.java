package Exercises;

public class TestMortgageCalculator {
    public static void doTest() {
        double principal = Console.readNumber(
                "Principal($1k - $1M): ",
                1_000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber(
                "Annual Interest Rate:", 0, 30);
        byte year = (byte) Console.readNumber(
                "Period (Years): ", 1, 30);

        MortgageCalculator calculator = new MortgageCalculator(
                principal, annualInterestRate, year);
        MortgageReport report = new MortgageReport(calculator);

        report.doReport();
    }
}