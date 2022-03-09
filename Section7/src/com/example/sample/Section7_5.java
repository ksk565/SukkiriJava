package com.example.sample;

public class Section7_5 {
    public static void main(String[] args) {
        long f = Runtime.getRuntime().freeMemory() / 1024 /1024;
        long t = Runtime.getRuntime().totalMemory() / 1024 /1024;
        long m = Runtime.getRuntime().maxMemory() / 1024 /1024;
        System.out.println("メモリ空き容量："+f+"MB");
        System.out.println("メモリ総容量："+t+"MB");
        System.out.println("メモリ限界値："+m+"MB");


        Class<?> info1 = String.class;
        System.out.println(info1.getSimpleName());
        System.out.println(info1.getName());
        System.out.println(info1.getPackage().getName());

        System.out.println(info1.isArray());
        Class<?> info2 = info1.getSuperclass();
        System.out.println(info2.getName());
        Class<?> info3 =args.getClass();
        System.out.println(info3.isArray());
        System.out.println(info1.getDeclaredFields());

    }
}
