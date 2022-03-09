package com.example.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Challenge2_1x2 {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar calender = Calendar.getInstance();

        calender.setTime(now);
        int day = calender.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        day+=100;
        System.out.println(day);
        calender.set(Calendar.DAY_OF_MONTH,day);
        Date future = calender.getTime();
        System.out.println(future);
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
}
