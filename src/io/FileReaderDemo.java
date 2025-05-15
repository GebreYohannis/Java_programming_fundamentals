package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void show(){
        try {
//            var reader = new FileReader("./src/io/index.html");
            var reader = new FileReader("./src/io/index.js");
            int c;
            while ((c = reader.read()) != -1)
//                System.out.println(c);
                System.out.println((char)c);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
