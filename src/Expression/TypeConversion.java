package Expression;

public class TypeConversion {
    public static void doOperation() {
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 11;
        int z = x + 2; // implicit casting

        // Explicit casting
        double n = 1.2;
        double y = (double)n; // explicit casting
        y *= 1.2;

        String value = "1";

        int intValue = Integer.parseInt(value) + 2;
        System.out.println(intValue);

        short shortValue = Short.parseShort(value);
        System.out.println(shortValue);

        float floatValue = Float.parseFloat(value);
        System.out.println(floatValue);

        double doubleValue = Double.parseDouble(value);
        System.out.println(doubleValue);

        byte byteValue = Byte.parseByte(value);
        System.out.println(byteValue);

        long longValue = Long.parseLong(value);
        System.out.println(longValue);

        String trueValue = "true";
        boolean boolValue = Boolean.parseBoolean(trueValue);
        System.out.println(boolValue);

        if(boolValue)
            System.out.println("It's true.");
        String falseValue = "false";
        boolean boolFalse = Boolean.parseBoolean(falseValue);
        System.out.println(boolFalse);

    }
}
