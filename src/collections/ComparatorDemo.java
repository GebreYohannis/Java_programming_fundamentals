package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void show() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a","e2"));
        customers.add(new Customer("d", "e1"));
        customers.add(new Customer("b","e3"));

        System.out.println(customers);
        Collections.sort(customers,new EmailComparator());
        System.out.println("After Sorted: " + customers);
    }
}
