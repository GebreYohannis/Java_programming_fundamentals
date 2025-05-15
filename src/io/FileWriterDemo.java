package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void show(){
        try {
            var writer = new FileWriter("./src/io/index.js",true);
            writer.write("console.log(\"Hello World\")");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
