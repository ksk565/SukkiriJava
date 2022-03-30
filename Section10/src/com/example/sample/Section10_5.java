package com.example.sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class Section10_5 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("rpgdata.properties");
        Properties p = new Properties();
        p.setProperty("heroName","カイザー");
        p.setProperty("heroHp","1000");
        p.setProperty("heroMp","40");
        p.store(fw ,"Yusya");//ファイルへ書き出し、先頭にコメントとして出力させる。
        //↑　storeで初めて書き出されるので、忘れないよう注意！！！
        fw.close();

    }
}
