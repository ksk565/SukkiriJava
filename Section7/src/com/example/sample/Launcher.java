package com.example.sample;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Launcher {
    public static void main(String[] args) {
        String fqcn = args[0];
        String str = args[1];
        showMemory();
        try {
            Class<?> clazz = Class.forName(fqcn);
            listMethods(clazz);
            if(str.equals('E')){
                lunchExternal(clazz);
            }else if(str.equals('I')){
                lunchInternal(clazz);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void lunchInternal(Class<?> clazz) {
        Method m = null;
        try {
            m = clazz.getMethod("main",String[].class);
            String[] args = {};
            m.invoke(null, (Object) args);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void lunchExternal(Class<?> clazz) {
        ProcessBuilder pb = new ProcessBuilder(
                "java", clazz.getName()
        );
        try {
        Process proc = pb.start();
            proc.waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

    }

    public static void showMemory(){
        long f = Runtime.getRuntime().freeMemory() / 1024 /1024;
        long t = Runtime.getRuntime().totalMemory() / 1024 /1024;
        long m = Runtime.getRuntime().maxMemory() / 1024 /1024;
        System.out.println("メモリ空き容量："+f+"MB");
        System.out.println("メモリ総容量："+t+"MB");
        System.out.println("メモリ限界値："+m+"MB");

    }
    public static void listMethods(Class<?> clazz){
        System.out.println("メソッドの一覧を表示します。");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m:methods) {
            System.out.println(m.getName());
        }
    }

}
