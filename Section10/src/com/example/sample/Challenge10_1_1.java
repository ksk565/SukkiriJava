package com.example.sample;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Challenge10_1_1 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("pref.properties");
        Properties p = new Properties();
        p.load(fr);
        String aichiC = p.getProperty("aichi.captal");
        String aichiF = p.getProperty("aichi.food");
        System.out.println(aichiC + " : " + aichiF);
    }
}
