package com.example.sample;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Section9_5 {
    public static void main(String[] args) throws IOException {
        String msg = "第一土曜日";
        Reader sr = new StringReader(msg);
        char c1 = (char)sr.read();
        char c2 = (char)sr.read();
        char c3 = (char)sr.read();
        char c4 = (char)sr.read();
        char c5 = (char)sr.read();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

    }
}
