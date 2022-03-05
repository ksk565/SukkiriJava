package com.example.sample;

import java.util.ArrayList;
import java.util.List;

public class Section6_5 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(674);
        list.add(3536);
        list.add(3);
        list.add(643);
        list.add(8);
        list.add(0);

        list.stream().forEach(i -> System.out.println(i));

    }
}
