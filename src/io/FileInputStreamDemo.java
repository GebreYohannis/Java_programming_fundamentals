package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void show(){
        try {
            var fileStream = new FileInputStream("file.txt");

            var c = fileStream.read();
            System.out.println((char) c);
            var av = fileStream.available();
            System.out.println("Available: " + av);
//            int i = -1;
//            while ((i = fileStream.read()) != -1)
//                System.out.print((char) i);

            var bytes = fileStream.readAllBytes();
            for (var b: bytes)
                System.out.print((char) b);

            fileStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showBuffered(){
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("file_buffered.txt"));
            var bytes = bufferedInputStream.readAllBytes();
            for (var b: bytes)
                System.out.print((char) b);
            bufferedInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
