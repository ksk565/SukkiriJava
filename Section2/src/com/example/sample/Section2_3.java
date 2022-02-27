package com.example.sample;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Section2_3 {
    public static void main(String[] args) {
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2014,1,2,3,4,5,6);

        System.out.println(l1);
        System.out.println(l2);

        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();

        System.out.println(z1);
        System.out.println(l3);



    }
}
