package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
    public static void show(){
        try {
            var dataStream = new DataOutputStream(new FileOutputStream("data_file.txt",true));
            dataStream.writeUTF("Hello world");
            dataStream.writeChars("Characters");
            dataStream.writeChar('A');
            dataStream.writeDouble(1.1);
            dataStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
