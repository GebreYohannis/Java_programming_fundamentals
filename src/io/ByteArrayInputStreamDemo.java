package io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void show(){
        try {
            var fileStream1 = new FileInputStream("file1.txt");
            var bytes = fileStream1.readAllBytes();
            fileStream1.close();

            var inStream = new ByteArrayInputStream(bytes);
            var data = inStream.readAllBytes();
            for (var d:data)
                System.out.print((char) d);
            inStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
