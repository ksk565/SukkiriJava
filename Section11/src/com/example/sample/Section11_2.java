package com.example.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Section11_2 {
    public static void main(String[] args) throws IOException {
        Socket sock =new Socket("dokojava.jp",80);
        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        os.write("GET /index.html HTTP/1.0\r\n".getBytes(StandardCharsets.UTF_8));
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));
        os.flush();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while(i != -1){
            System.out.print(i);
            i = isr.read();
        }
        sock.close();
    }
}
