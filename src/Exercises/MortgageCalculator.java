package Exercises;

public class MortgageCalculator {
    private double principal;
    private float annualInterestRate;
    private short years;

    public MortgageCalculator(
            double principal,
            float annualInterestRate,
            short years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateMortgage() {
        var monthlyInterestRate = getMonthlyInterestRate();
        var principal = getPrincipal();
        var numberOfPayments = getNumberOfPayments();

        final double mortgage = principal * (monthlyInterestRate *
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) /
                        (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1)));
        return mortgage;
    }

    public double calculateLoanBalance(short numberOfPaymentsMade) {
        var monthlyInterestRate = getMonthlyInterestRate();
        var numberOfPayments = getNumberOfPayments();
        var principal = getPrincipal();

        final double loanBalance = principal * ((
                Math.pow(1 + monthlyInterestRate, numberOfPayments) -
                        Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        return loanBalance;
    }

    public double[] getRemainingLoanBalance(short numberOfPayments) {
        var balances = new double[getNumberOfPayments()];
        for (short numberOfPaymentsMade = 1;
             numberOfPaymentsMade <= numberOfPayments;
             numberOfPaymentsMade++) {
            balances[numberOfPaymentsMade - 1] = calculateLoanBalance(numberOfPaymentsMade);
        }
        return balances;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public short getYears() {
        return years;
    }

    public void setYears(short years) {
        this.years = years;
    }

    public short getNumberOfPayments() {
        return (short) (getYears() * getMonthInYears());
    }

    private int getMonthInYears() {
        return 12;
    }

    private float getPercent() {
        return 100;
    }

    private float getMonthlyInterestRate() {
        int monthInYears = getMonthInYears();
        var annualInterestRate = getAnnualInterestRate();
        final float PERCENT = getPercent();
        return annualInterestRate / PERCENT / monthInYears;
    }
}
