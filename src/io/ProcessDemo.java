package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessDemo {
    public static void buildProcess() {
        var builder = new ProcessBuilder("notepad.exe", "Hello.txt");
        try {
            Process process = builder.start();
//            if (process.isAlive())
//                System.out.println(process.getInputStream());

            var reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            var exitCode = process.waitFor();
            System.out.println("Process exit with exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
