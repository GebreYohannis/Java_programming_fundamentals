package interfaces;

public class TaxReport {
    private TaxCalculator calculator;

    // Constructor injection
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    //    Setter injection
    public void setTaxCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println("Tax :{ " + tax + " }");
    }

    //    Regular method injection
    public void show(TaxCalculator calculator) {
//        with this technique we don't need the TaxCalculator instance at a class level
        var tax = calculator.calculateTax();
        System.out.println("Tax: {" + tax + " }");
    }
}
