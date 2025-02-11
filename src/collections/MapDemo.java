package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        Map<Integer, String> keyValuePair = new HashMap<>();
        keyValuePair.put(1, "Apple");
        keyValuePair.put(2, "Mango");
        keyValuePair.put(3, "Lemon");
        System.out.println(keyValuePair);

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> customers = new HashMap<>();
        customers.put(c1.getEmail(), c1);
        customers.put(c2.getEmail(), c2);

        var customer = customers.get("e1");
        System.out.println("Customer: " + customer);

        Customer unknown = new Customer("Unknown", "");
        var unknownCustomer = customers.getOrDefault("e10", unknown);
        System.out.println("Unknown Customer: " + unknownCustomer);

        var isWithInTheList = customers.containsKey("e11");
        System.out.println("Is with in the list: " + isWithInTheList);

        // Iterate over map element
        for (var key : customers.keySet())
            System.out.println("{ " + key + ": " + customers.get(key));

        for (var c : customers.values())
            System.out.println(c);

        for (var entry : customers.entrySet())
            System.out.println("Entry: { " + entry.getKey() + " : " + entry.getValue() + " }");

        // Update
        customers.replace("e1",new Customer("c","e1"));
        System.out.println(customers);
    }
}


