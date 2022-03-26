package com.example.sample;

import java.io.FileReader;
import java.io.IOException;

public class Section9_2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/naganokeisuke/Downloads/rpgsave.dat");
        System.out.println("すべてのデータを読んで表示する");
        int i = fr.read();
        while(i != -1){
            char c = (char) i;
            System.out.print(c);
            i = fr.read();
        }
        System.out.println();
        System.out.println("ファイルの末尾に到達しました。");
        fr.close();
    }
}
