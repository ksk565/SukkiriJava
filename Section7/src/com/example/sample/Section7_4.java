package com.example.sample;

public class Section7_4 {
    public static void main(String[] args) {
        final String BR = System.getProperty("line.separator");
        System.out.println("今日の天気は"+BR+"晴天なり");

        String ver = System.setProperty("rpg.version","03");
        String author = System.getProperty("rpg.author");
        System.out.println("RPG: スッキリ魔王成敗 ver" + ver);
    }
}
