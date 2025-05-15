package dependenyinjection.calculators;

import dependenyinjection.annotations.Component;
import dependenyinjection.annotations.InjectConstructor;

@Component
public class DiscountReport {

    private DiscountCalculator calculator;

    @InjectConstructor
    public DiscountReport(DiscountCalculator calculator){
        this.calculator = calculator;
    }

    public void showReport(double amount, double discountPercent) {
        var discount = calculator.calculate(amount,discountPercent);
        System.out.println("Discount: $" + discount);
    }

}
