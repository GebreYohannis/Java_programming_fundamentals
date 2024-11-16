package ControlFlow;

public class IFStatements {
    public static void doOperation() {
        double temperature = 23.2;
        if(temperature > 30) {
            System.out.println("It's hot day.");
            System.out.println("Drink more water.");
        }
        else if(temperature >= 20 && temperature <= 30)
            System.out.println("It's nice day");
         else 
            System.out.println("It's cold.");
        
    }
}
