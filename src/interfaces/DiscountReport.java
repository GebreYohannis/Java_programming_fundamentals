package interfaces;

public class DiscountReport {
    private DiscountCalculator calculator;
//    Constructor injection
    public DiscountReport(DiscountCalculator calculator) {
        this.calculator = calculator;
    }
//    Setter injection
    public void setDiscountCalculator(DiscountCalculator calculator) {
        this.calculator = calculator;
    }
//    Regular method injection
    public void show() {
        var discount = calculator.calculateDiscount();
        System.out.println("Discount: { " + discount + " }");
    }

    public void show(DiscountCalculator calculator) {
        var  discount = calculator.calculateDiscount();
        System.out.println("Discount: { " + discount + " }");
    }
}
