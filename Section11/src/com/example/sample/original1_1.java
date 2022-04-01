package com.example.sample;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class original1_1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://pro-foto.jp/free/img/images_big_420/sor0089-024.jpg");
        InputStream is = url.openStream();
//        InputStreamReader isr = new InputStreamReader(is);
        OutputStream os = new FileOutputStream("kumo.jpg");
        int i = is.read();
        while (i >= 0) {
            os.write(i);
            i = is.read();
        }
        is.close();
        os.flush();
        os.close();
    }
}
