package CampusExercise;

public class Mathematics {
    public static void doMathOperation() {
        int positiveCeil = (int)Math.ceil(12.23f); // 13
        long negativeCeil = (long) Math.ceil(-12009.34);// -12009

        long floor = (long)Math.floor(34.3);
        long negativeFloor = (long)Math.floor(-2.3); // -3

        long power = (long)Math.pow(21,3);
        double decimalPower = Math.pow(3.4,1.2);

        double max = Math.max(2.3,4.4);
        double min = Math.min(-1.2,-3.2);

        long rounded = Math.round(23.3); // 23
        rounded = Math.round(23.6); // 24

        long random = (long)Math.floor(Math.random() * 100);
        final double PI = Math.PI;

        double degreeValue = Math.toDegrees(10);
        System.out.println(degreeValue);

        double sine = Math.sin(degreeValue);
        System.out.println(sine);

        double radianValue = Math.toRadians(degreeValue);
        System.out.println(radianValue);

        float positiveSignum = Math.signum(10);// 1.0
        System.out.println(positiveSignum);

        float negativeSignum = Math.signum(-10);
        System.out.println(negativeSignum);

        float zeroSignum = Math.signum(0);
        System.out.println(zeroSignum);
    }
}
