package dependenyinjection.calculators;

import dependenyinjection.annotations.Component;
import dependenyinjection.annotations.InjectConstructor;

@Component
public class PercentageDiscountCalculator implements DiscountCalculator {
    private final byte PERCENT = 100;

    @InjectConstructor
    public PercentageDiscountCalculator(){}

    @Override
    public double calculate(double discountableIncome, double discountPercent) {
        return discountableIncome * (discountPercent / PERCENT);
    }
}
