package interfaces;

public class DiscountCalculator2024 implements DiscountCalculator {
    private double discountableIncome;

    public DiscountCalculator2024(double discountableIncome) {
        this.discountableIncome = discountableIncome;
    }

    @Override
    public double calculateDiscount() {
        return discountableIncome * 0.3;
    }
}
