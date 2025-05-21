package io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void show() {
        try {
            var outStream = new ByteArrayOutputStream();
            String text = "ByteArrayOutPutStream";
            var bytes = text.getBytes();
            outStream.writeBytes(bytes);
            var fileStream1 = new FileOutputStream("file1.txt");
            var fileStream2 = new FileOutputStream("file2.txt");

            outStream.writeTo(fileStream1);
            fileStream1.close();

            outStream.writeTo(fileStream2);
            fileStream2.close();

            outStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
