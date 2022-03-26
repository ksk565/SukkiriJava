package com.example.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Section9_3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/naganokeisuke/Downloads/rpgstream.dat",true);
        fos.write(65);//65は２進数で01000001
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/naganokeisuke/Downloads/rpgstream.dat");
        int i = fis.read();
        System.out.println("バイナリデータ読み込み");
        while(i != -1){
            System.out.print(i);
            i = fis.read();
        }
        System.out.println();
        System.out.println("すべてのデータを読み終えました。");



    }
}
