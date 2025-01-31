package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show() {
        try {
            sayHello(null);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
            reader.close();
            var simpleDateFormat = new SimpleDateFormat("");
            simpleDateFormat.parse("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ParseException e) {
            System.out.println("Could not read data");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Done!");
        }
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name.toUpperCase());
    }

    public static void betterCodeForHandlingException() {
        // Based on the following case you don't need explicitly
        // implement the finally close to close the reader and
        // writer object java compiler does it for us because the code
        // inside try ( object instances here ) implements
        // the AutoThrowable Interface
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("file.txt");
        ) { // try with resources statement
            var value = reader.read();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
