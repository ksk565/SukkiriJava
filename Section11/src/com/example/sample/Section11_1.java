package com.example.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Section11_1 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://dokojava.jp");//①工程
        InputStream is = url.openStream();//②工程
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while(i != -1){
            System.out.print((char)i);
            i = isr.read();
        }
        isr.close();
    }
}
