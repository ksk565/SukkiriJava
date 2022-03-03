package com.example.sample;

public class Section4_9 {
    public static void main(String[] args) {
        Hero h1 = new Hero("けすけ",23,125);
        Sword s = new Sword("大剣");
        Sword t = new Sword("双剣");
        h1.setSword(s);

        System.out.println("1装備: "+h1.getSword().getName());
        System.out.println("clone()でコピーします");
        Hero h2 = h1.clone();
        System.out.println("2装備: "+h2.getSword().getName());
        h1.getSword().setName("弓");
        System.out.println("1装備: "+h1.getSword().getName());
        System.out.println("2装備: "+h2.getSword().getName());



    }
}
