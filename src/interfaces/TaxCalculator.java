package interfaces;

public interface  TaxCalculator {
    double calculateTax();

//    Don't do the following
//    because all are bad practice according to the meaning of interfaces
//    float constantValue = 10;
//    static double getTaxableIncome(double income, double expenses){
//        return income - expenses;
//    }
//    default void defaultResult(){
//        System.out.println("Default logic");
//    }
}
