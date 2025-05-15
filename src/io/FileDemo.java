package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
    public static void show() {
        var file = new File("./","./src/io/index.html");

//        var files = file.listFiles();
//        for (var f: files)
//            System.out.println(f.getName());

        System.out.println(file.exists());

        var parent = file.getParent();
        System.out.println(parent);

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        var result = file.canWrite() ? "Yes" : "No";
//        System.out.println(result);
//
//        var absolutPath = file.getAbsolutePath();
//        System.out.println(absolutPath);

        var newFile = new File("./");
        File[] files  = newFile.listFiles();
//        for (var f: files)
//            System.out.println(f.getName());

//        var filteredFiles = newFile.listFiles((_,name)->!name.equalsIgnoreCase("src"));
//
//        for (var f: filteredFiles)
//            System.out.println(f.getName());

        var endsWith = newFile.listFiles(f->f.getName().endsWith("t"));
        for (var v: endsWith)
            System.out.println(v.getName());



    }
}
