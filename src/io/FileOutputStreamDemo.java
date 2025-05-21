package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void show() {
        try {
            var fileStream = new FileOutputStream("file.txt");
            for (int i = 0; i < 10; i++)
                fileStream.write(65 + i);
            String text = "Hello world";

            var bytes = text.getBytes();
            fileStream.write(bytes);
            fileStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showBuffered(){
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("file_buffered.txt"));
            String text = "Hello from Java";
            var bytes = text.getBytes();
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
