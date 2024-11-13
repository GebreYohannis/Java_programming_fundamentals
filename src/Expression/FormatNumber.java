package Expression;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {
    public static void doOperation() {
        NumberFormat current =NumberFormat.getCurrencyInstance();
        String result = current.format(1234576.23);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(10.19);
        System.out.println(percentResult);

        // To get decimal numbers format use the following
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        String numberInstanceResult = numberInstance.format(1090.18);
        System.out.println(numberInstanceResult);

        NumberFormat decimalInstance = NumberFormat.getInstance();
        String decimalInstanceResult = decimalInstance.format(122345.345);
        System.out.println(decimalInstanceResult);

        // To get Integer numbers format
        NumberFormat integerNumberFormat = NumberFormat.getIntegerInstance();
        String formattedInteger = integerNumberFormat.format(1223345);
        System.out.println(formattedInteger);

        NumberFormat UKCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        String localUKCurrencyFormat= UKCurrencyFormat.format(100.34);
        System.out.println(localUKCurrencyFormat);

        NumberFormat USCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String localUSCurrencyFormat = USCurrencyFormat.format(100.23);
        System.out.println(localUSCurrencyFormat);

        NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance();
        String compactResult = compactNumberInstance.format(1000);
        System.out.println(compactResult);

        // Method chaining
        String compactNumberFormat = NumberFormat.getCompactNumberInstance().format(100000000);
        System.out.println(compactNumberFormat);
    }

}
