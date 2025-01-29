package Exercises;
public class TestMortgageCalculator{
private static void doTest() {
        double principal = Exercises.Console.readNumber(
                "Principal($1k - $1M): ",
                1_000, 1_000_000);
        float annualInterestRate = (float) Exercises.Console.readNumber(
                "Annual Interest Rate:", 0, 30);
        byte year = (byte) Exercises.Console.readNumber(
                "Period (Years): ", 1, 30);

        Exercises.MortgageCalculator calculator = new Exercises.MortgageCalculator(
                principal, annualInterestRate, year);
        Exercises.MortgageReport report = new Exercises.MortgageReport(calculator);

        report.doReport();
    }}