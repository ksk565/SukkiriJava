package com.example.sample;

import java.io.*;

public class Section10_8 {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("けすけ",50,60);
        FileOutputStream fos = new FileOutputStream("rpgsave8.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hero1);//インスタンス→バイトコードへ変換
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("rpgsave8.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero) ois.readObject();
        ois.close();

        System.out.println(hero1.getName());
        System.out.println(hero1.getHp());
        System.out.println(hero1.getMp());
        System.out.println(hero2.getName());
        System.out.println(hero2.getHp());
        System.out.println(hero2.getMp());
    }

}
