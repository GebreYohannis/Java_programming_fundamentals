package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {
    public static void piedStream() {
        try {
            var pipeInput = new PipedInputStream();
            PipedOutputStream pipe = new PipedOutputStream(pipeInput);
            pipe.write("Hello world".getBytes());
            pipe.close();
            byte[] buffer = new byte[1024];
            int bytes = pipeInput.read(buffer);
            String messages = new String(buffer, 0, bytes);
            System.out.println(messages);

            pipeInput.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
