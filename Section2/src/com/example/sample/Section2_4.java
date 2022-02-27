package com.example.sample;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Section2_4 {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime l1 = LocalDateTime.now();

        LocalDate d = LocalDate.parse("2012/11/21",f);
        d = d.plusDays(1000);

        System.out.println(l1.format(f));

        System.out.println(d);
    }
}
