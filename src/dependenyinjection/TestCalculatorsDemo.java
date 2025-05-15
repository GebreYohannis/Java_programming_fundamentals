package dependenyinjection;

import dependenyinjection.calculators.DiscountCalculator;
import dependenyinjection.calculators.DiscountReport;
import dependenyinjection.calculators.FixedAmountDiscountCalculator;
import dependenyinjection.calculators.PercentageDiscountCalculator;
import dependenyinjection.container.ConfigurableConstructorInjectionContainer;
import dependenyinjection.container.ConstructorInjectionContainer;

import java.util.List;
import java.util.Map;

public class TestCalculatorsDemo {
    public static void show() {
        List<Class<?>> classes = List.of(
                FixedAmountDiscountCalculator.class,
                DiscountReport.class
        );

        Map<Class<?>,Class<?>> bindings = Map.of(
                DiscountCalculator.class,
                FixedAmountDiscountCalculator.class
        );

        Map<String, Object> configValues = Map.of(
                "discount.amount", 200
        );

        var container = new ConfigurableConstructorInjectionContainer(classes,bindings,configValues);
        var report = container.getInstance(DiscountReport.class);
        report.showReport(200,40);


        List<Class<?>> classes1 = List.of(
                PercentageDiscountCalculator.class,
                DiscountReport.class
        );

        Map<Class<?>,Class<?>> bindings1 = Map.of(
                DiscountCalculator.class,
                PercentageDiscountCalculator.class
        );

        var container1 = new ConstructorInjectionContainer(classes1,bindings1);
        var report1 = container1.getInstance(DiscountReport.class);
        report1.showReport(200,10);
    }
}
