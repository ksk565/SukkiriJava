package com.example.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Section3_1 {
    public static void main(String[] args) {
        names("田中","長野","大谷");
        System.out.println();
        namesArray("田中","長野","大谷");

    }
    public static void names(String name1 , String name2, String name3){
        String[] names = new String[3];
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;

        for(String str : names){
            System.out.println(str);
        }
        System.out.println(names.length);

    }

    public static void namesArray(String name1 , String name2, String name3){
        ArrayList<String> names = new ArrayList<String>();

        names.add(name1);
        names.add(name2);
        names.add(name3);
        for(String str: names){
            System.out.println(str);
        }
        System.out.println(names.size());

        System.out.println(names.indexOf("長野"));


        //イテレーター
        Iterator<String> it = names.iterator();

        System.out.println(it.next());

        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}
