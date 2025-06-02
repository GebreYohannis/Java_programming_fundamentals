package io.advancedSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {
    public static void show(){
        var person = new Person("Demis",22);
        try {
            var outStream = new ObjectOutputStream(
                    new FileOutputStream("person.psr"));
            outStream.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            var inStream = new ObjectInputStream(
                    new FileInputStream("person.psr"));
            Person person1 = (Person)inStream.readObject();
            System.out.println(person1);
            System.out.println("id: " + person1.getId());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
