package interfaces;

public class TestDiscountCalculator {
    public static void doTest() {
        DiscountReport report = new DiscountReport(new DiscountCalculator2024(100_000));
        report.show();

        report.setDiscountCalculator(new DiscountCalculator2025(0));
        report.show();

        report.show(new DiscountCalculator2024(200_000));
    }
}
