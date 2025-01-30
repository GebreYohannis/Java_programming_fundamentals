package interfaces;

public class DiscountCalculator2025 implements DiscountCalculator {
    private double discountableIncome;

    public DiscountCalculator2025(double discountableIncome) {
        this.discountableIncome = discountableIncome;
    }

    @Override
    public double calculateDiscount() {
        return discountableIncome * .4;
    }
}
