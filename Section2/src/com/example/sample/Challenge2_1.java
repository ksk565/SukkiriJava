package com.example.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Challenge2_1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Calendar c1 = Calendar.getInstance();

        c1.setTime(d1);

        int day = c1.get(Calendar.DAY_OF_MONTH);
        day += 100;
        Date future = c1.getTime();

        SimpleDateFormat f =
                new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));


    }
}
