package com.example.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Challenge2_2x2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate future = ld.plusDays(100);
        System.out.println(future);
        DateTimeFormatter f =
                DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
        System.out.println(future.format(f));//???
    }
}
