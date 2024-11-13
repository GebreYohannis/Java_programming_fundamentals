package Expression;

public class Mathematics {
    public static void doOperation() {
        int floatRoundedToInt = Math.round(23.34f);
        long doubleRoundedToLong = Math.round(23.34);

        long ceil = (long)Math.ceil(3.4);
        int intCeil = (int)Math.ceil(3.4f);

        long floor = (long)Math.floor(3.4);
        int intFloor = (int)Math.floor(4.5);

        int maxNumber = Math.max(34,4);
        double doubleMax = Math.max(23.3,2.4);

        int intMin = Math.min(12,34);
        double doubleMin = Math.min(3.4,45.8);
        float floatMin = Math.min(2.3f,100.5f);
        long longMin = Math.min(123L,55L);

        double doubleRandom = Math.random();
        System.out.println(doubleRandom);

        // 0 - 100
        long typeLongRandom = (long) Math.floor(Math.random() * 100);
        System.out.println(typeLongRandom);

        long typeLongCeilRandom  = (long)Math.ceil(Math.random() * 100);
        System.out.println(typeLongCeilRandom);

        int intRandom = (int) (Math.random() * 100);
        short shortRandom = (short)( Math.random() * 10);
        System.out.println(shortRandom);

        long roundRandom = Math.round(Math.random()*1000);
        System.out.println(roundRandom);

        var absoluteValue = Math.abs(-10);
        System.out.println(absoluteValue);

        double sqrt = Math.sqrt(12.12);

        double power = Math.pow(12.2,3);
        double logarithmicValue = Math.log(100);
        System.out.println(logarithmicValue);

        double log10 = Math.log10(100);
        System.out.println(log10);

        double ln = Math.log1p(12);
        System.out.println(ln);

    }
}
