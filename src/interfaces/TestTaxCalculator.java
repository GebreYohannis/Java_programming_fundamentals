package interfaces;

public class TestTaxCalculator {
    static public void doTest() {
//         Constructor injection
        TaxCalculator2024 calculator = new TaxCalculator2024(1_300);
        TaxReport taxReport = new TaxReport(calculator);
        taxReport.show();

//         Setter injection
        taxReport.setTaxCalculator(new TaxCalculator2025());
        taxReport.show();

//        Regular method injection
        taxReport.show(calculator);
        taxReport.show(new TaxCalculator2025());
    }
}
