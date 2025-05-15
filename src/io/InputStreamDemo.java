package io;

import java.io.*;
import java.text.Format;
import java.util.Formatter;

public class InputStreamDemo {
    public static void show()  {
//        fileDescriptorDemo();

        var formatter = new Formatter();
        Appendable app = null;
        try {
            app = formatter.out().append('C');
            var formated = formatter.format("Hello","H","G");
            var newFormated = formated.out().append('}');

            newFormated.append("{").append("}");
            formated.out();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(app);
//        serialize();
//        deserialize();

    }

    public static void fileDescriptorDemo(){
        var out = FileDescriptor.out;
        System.out.println(out);
    }

    private static void serialize() {
        var person = new Person(1, "@demis");

        try (var fileOutput = new FileOutputStream("file.ser");
             var oos = new ObjectOutputStream(fileOutput);
        ) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        try (
                var fileInput = new FileInputStream("file.ser");
                var oi = new ObjectInputStream(fileInput);
        ) {
            var p = (Person) oi.readObject();
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


record Person(int id, String username) implements Serializable {
    @Override
    public String toString() {
        return "{ " +
                "id :" + id +
                ", username: " + username +
                " }";
    }
}