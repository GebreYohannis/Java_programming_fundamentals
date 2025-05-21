package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamDemo {
    public static void show(){
        var file = new File("filter_file.txt");
        try {
            var fileOutStream = new FileOutputStream(file);
            var filterOutStream = new FilterOutputStream(fileOutStream);
            String text  = "Hi there! This is FilterOutputStream.";
            var bytes = text.getBytes();
            filterOutStream.write(bytes);
            filterOutStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
