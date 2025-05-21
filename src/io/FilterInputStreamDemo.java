package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStreamDemo {
    public static void show() {
        var file = new File("filter_file.txt");

        try {
            var fileInStream = new FileInputStream(file);
            FilterInputStream filterInStream = new BufferedInputStream(fileInStream);

            var bytes = filterInStream.readAllBytes();
            for (var bt : bytes)
                System.out.print((char) bt);

            fileInStream.close();
            filterInStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
