package com.example.sample;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Challenge11_2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("smtp.example.com",60025);
        OutputStream os = socket.getOutputStream();
        os.write("HELLO example.com\r\n".getBytes());
        os.flush();
        os.close();

    }
}
