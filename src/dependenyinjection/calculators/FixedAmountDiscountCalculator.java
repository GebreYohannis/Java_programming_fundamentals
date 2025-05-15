package dependenyinjection.calculators;

import dependenyinjection.annotations.Component;
import dependenyinjection.annotations.InjectConstructor;
import dependenyinjection.annotations.Value;

@Component
public class FixedAmountDiscountCalculator implements DiscountCalculator{
    private final double discountAmount;

    @InjectConstructor
    public FixedAmountDiscountCalculator(@Value(keys ="discount.amount") double discountAmount){
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculate(double orderAmount, double discountPercent) {
        return discountAmount;
    }
}
