package io;

public class TestFileOperation {
    public static void test(){
//        BufferedFileWriterDemo.fileWriter("./src/io/index.js",true);
//
//        BufferedFileReaderDemo.fileReader("./src/io/index.js");

        BufferedFileWriterDemo.bufferedFileWriter("./src/io/index.js",false);
        BufferedFileReaderDemo.bufferedFileReader("./src/io/index.js");

    }
}
