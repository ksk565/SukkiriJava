package com.example.sample;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

public class Challenge11_1 {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://dokojava.jp/favicon.ico");
        InputStream is = url.openStream();
//        InputStreamReader isr = new InputStreamReader(is);
        OutputStream os = new FileOutputStream("dj.ico");
        int i = is.read();
        while(i != -1){
            os.write(i);
            i = is.read();
        }
        is.close();
        os.flush();
        os.close();


    }
}
