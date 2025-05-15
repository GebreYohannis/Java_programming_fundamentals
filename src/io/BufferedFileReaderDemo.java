package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderDemo {
    public static void fileReader(String fileName) {
        try(FileReader reader = new FileReader(fileName);) {
           int character;
            while ((character =  reader.read())!= -1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void bufferedFileReader(String fileName) {
        try (var bufferReader = new BufferedReader(new FileReader(fileName));) {
            String line;
            while (bufferReader.ready()) {
                line = bufferReader.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
