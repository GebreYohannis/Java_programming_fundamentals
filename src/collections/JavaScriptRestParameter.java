package collections;

public class JavaScriptRestParameter {
    // JavaScript rest parameter
    private static double addAll(double... numbers) {
        double sum = 0;
        for(double num: numbers)
            sum += num;
        return sum;
    }
    public static void showSum() {
        double sum = addAll(1,2,3,4);
        System.out.println("Sum: " + sum);
    }
}
