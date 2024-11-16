package ControlFlow;

public class IFStatements {
    public static void doOperation() {
        double temperature = 23.2;
        if(temperature > 30) {
            System.out.println("It's hot day.");
            System.out.println("Drink more water.");
        } else if(temperature >= 20 && temperature <= 30){
            System.out.println("It's nice day");
        } else {
            System.out.println("It's cold.");
        }

        // another
        char letterGrade = 'A';
        if (letterGrade == 'A')
            System.out.println("Excellent");
        else if (letterGrade == 'B')
            System.out.println("Good");
        else if (letterGrade == 'C')
            System.out.println("Not bad");
        else if (letterGrade == 'D')
            System.out.println("Warning");
        else if(letterGrade == 'F')
            System.out.println("Failed");
        else
            System.out.println("Grade not known");
    }
}
