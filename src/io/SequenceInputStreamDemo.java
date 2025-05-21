package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void show() {
        try {
            var sequenceFileReader = new SequenceInputStream(new FileInputStream("file.txt"), new FileInputStream("file_buffered.txt"));
            var bytes = sequenceFileReader.readAllBytes();
            for (var b : bytes)
                System.out.print((char) b);
            sequenceFileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showReadFrom2FilesAndWriteToAnotherFile() {
        try {
            var sequenceReader = new SequenceInputStream(
                    new FileInputStream("file.txt"),
                    new FileInputStream("file_buffered.txt")
            );
            var bytes = sequenceReader.readAllBytes();
            sequenceReader.close();

            var outStream = new BufferedOutputStream(new FileOutputStream("sequence_file.txt"));
            outStream.write(bytes);
            outStream.close();

            var inStream = new BufferedInputStream(new FileInputStream("sequence_file.txt"));
            var data = inStream.readAllBytes();
            for (var d:data)
                System.out.print((char) d);
            inStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showReadFromMultipleFileAndWriteToAnotherFile(){
        try {
            var file1 = new BufferedInputStream(new FileInputStream("file.txt"));
            var file2 = new BufferedInputStream(new FileInputStream("file_buffered.txt"));
            var file3 = new BufferedInputStream(new FileInputStream("Hello.txt"));
            var vector = new Vector();
            vector.add(file1);
            vector.add(file2);
            vector.add(file3);

            Enumeration e = vector.elements();
            var sequenceReader = new SequenceInputStream(e);
            var bytes = sequenceReader.readAllBytes();
            sequenceReader.close();

            var outStream = new BufferedOutputStream(new FileOutputStream("merged_file.txt"));
            outStream.write(bytes);
            outStream.close();

            var inStream = new BufferedInputStream(new FileInputStream("merged_file.txt"));
            var data = inStream.readAllBytes();
            for (var d: data)
                System.out.print((char) d);

            inStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
