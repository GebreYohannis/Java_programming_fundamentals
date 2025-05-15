package io;

import java.util.List;
import java.util.stream.Collectors;

public class TestObjectSerializer {
    public static void show(){
        var data = getData();

        var emails = data.stream()
                .map(customer -> customer.email())
                .filter(email->email.startsWith("d"))
                .collect(Collectors.toList());

        System.out.println(emails);

        var usernames = data.stream()
                .map(customer -> customer.username())
                .collect(Collectors.toList());


        System.out.println(usernames);
    }

    private static List<Customer> getData() {
        var customers = List.of(
                new Customer("@demis","demis@domain.com"),
                new Customer("@haile","haile@domain.com"),
                new Customer("@dereje","dereje@domain.com"),
                new Customer("@binyam","binyam@domain.com"),
                new Customer("@daniel","daniel@domain.com")
        );

        var serializer = new ObjectSerializer();

        serializer.<Customer>serialize(customers);

        var deserializer = new ObjectDeserializer();
        var data = deserializer.<Customer>deserialize();
        return data;
    }
}
