package com.example.sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class Challenge10_1 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("pref.properties");
        Properties p = new Properties();
        p.setProperty("tokyo.captal","東京");
        p.setProperty("tokyo.food","寿司");
        p.setProperty("aichi.captal","名古屋");
        p.setProperty("aichi.food","味噌カツ");
        p.store(fw,"東京");
        fw.close();
    }
}
