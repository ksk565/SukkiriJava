package com.example.sample;

import java.util.HashSet;
import java.util.Set;

public class Section3_4 {
    public static void main(String[] args) {
        Set<String> color = new HashSet<String>();
        color.add("赤");
        color.add("青");
        color.add("黃");
        color.add("赤");
        for(String str:color){
            System.out.println(str);
        }

        Set<String> animal = new HashSet<String>();
        animal.add("猫");
        animal.add("犬");
        animal.add("鳥");
        animal.add("象");

        for(String str: animal){
            System.out.print(str + "→");
        }


    }
}
