package com.example.sample;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Section2_2 {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        Instant i2 = Instant.ofEpochMilli(31920281332L);
        long l = i2.toEpochMilli();
        System.out.println(i1);

        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2021,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        System.out.println("東京:" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
        System.out.println("ロンドン:" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
        if(z2.isEqual(z3)){
            System.out.println("東京とロンドンは同じ時間を指しています。");
        }
    }
}
