package CampusExercise.LabExrciseTwo;

import CampusExercise.LabExrciseTwo.Calculator.SimpleArithmeticOperation;
import static CampusExercise.LabExrciseTwo.Calculator.SimpleArithmeticOperation.*;

public class MathematicsOperation {

    public static void doMathematicalOperation() {
        double sum = add(12,12);
        System.out.println("Sum = " + sum);

        double difference = subtract(12,23);
        System.out.println("Difference = " + difference);

        double product = multiply(12,33);
        System.out.println("Product = " + product);

        int remainder = SimpleArithmeticOperation.remainder(12,5);
        System.out.println("Remainder = " + remainder);
    }

}
