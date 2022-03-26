package com.example.sample;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Section9_6 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(66);
        byte[] data = baos.toByteArray();
        for(int i :data){
            System.out.println(i);
        }
        OutputStreamWriter osw = new OutputStreamWriter(baos);
        osw.write(65);
        osw.write(66);
        osw.flush();
        osw.close();
        System.out.println();

    }
}
