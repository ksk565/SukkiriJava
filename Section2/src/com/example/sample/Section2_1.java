package com.example.sample;

import java.text.DateFormat;
import java.util.Date;

public class Section2_1 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        now.setTime(123051802);
        System.out.println(now);

    }
}
