package CampusExercise.LabExrciseTwo.Calculator;

public class SimpleArithmeticOperation {

    public static double add(double first, double second) {
        return first + second;
    }

    public static double subtract(double first, double second){
        return first - second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double division(double first, double second) {
        if(second == 0)
            throw new RuntimeException("Division by zero is not allowed.");
        return first / second;
    }

    public static int remainder(int first, int second) {
        if(second == 0)
            throw new RuntimeException("Cannot divide by zero.");
        return first / second;
    }
}
