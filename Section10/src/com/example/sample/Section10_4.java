package com.example.sample;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Section10_4 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("rpgdata.properties");
        Properties p = new Properties();
        p.load(fr);//ファイル内容を読み込む
        String name = p.getProperty("heroName");//キー値を指定して値を取り出す。
        String strHp = p.getProperty("heroHp");//キー値を指定して値を取り出す。
        int hp = Integer.parseInt(strHp);//文字列のため、型変換を行う必要がある。
        System.out.println("勇者の名前は　"+ name);
        System.out.println("勇者のHPは　"+ hp);
        fr.close();
    }
}
