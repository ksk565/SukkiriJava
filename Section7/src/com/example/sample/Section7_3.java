package com.example.sample;

import java.util.Iterator;
import java.util.Properties;

public class Section7_3 {
    public static void main(String[] args) {
        System.out.println("Java Version");
        System.out.println(System.getProperty("java.version"));
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        System.out.println("【システムプロパティ一覧】");
        while(i.hasNext()){
            String key =i.next();
            System.out.print(key + " = ");
            System.out.println(System.getProperty(key));
        }
    }
}
