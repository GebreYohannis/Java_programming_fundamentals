package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void show(){
        try {
            var dataStream = new DataInputStream(new FileInputStream("data_file.txt"));

//            var bytes = dataStream.readAllBytes();
//            for (var bt:bytes)
//                System.out.print((char) bt);

            var result = dataStream.readUTF();
            System.out.println(result);

            var charResult = dataStream.readChar();
            System.out.println(charResult);

            var doubleResult = dataStream.readDouble();
            System.out.println(doubleResult);

//            var result = dataStream.readLine();
//            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
