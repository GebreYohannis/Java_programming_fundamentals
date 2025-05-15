package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriterDemo {

    public static void fileWriter(String fileName, boolean append) {
        try(var writer = new FileWriter(fileName,append);){
            String line = "console.log('Hello world this is file writer')";
            writer.write(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferedFileWriter(String fileName, boolean append) {
        try(var bufferedWriter =
                    new BufferedWriter(new FileWriter(fileName,append));){
            String firstName = "let firstName = 'Demis';";
            var length  = firstName.length();
            bufferedWriter.write(firstName,0,length);
            bufferedWriter.newLine();

            String codeSnippet = "const printer = data => console.log(data);";
            length = codeSnippet.length();
            bufferedWriter.write(codeSnippet,0,length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
