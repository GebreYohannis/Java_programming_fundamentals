package CampusExercise.LabExerciseFour;

public class ArithmeticExpression {
    public static double addition(double x, double y){
        return  x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y){
        return x * y;
    }

    public  static double division(double x, double y) throws RuntimeException {
        if(y == 0)
            throw new RuntimeException("Divsion by zero!");
        return x / y;
    }
}
