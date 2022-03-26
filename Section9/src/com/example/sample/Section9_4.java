package com.example.sample;

import java.io.FileWriter;
import java.io.IOException;

public class Section9_4 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("/Users/naganokeisuke/Downloads/SC94rpgsave.dat",true);
            fw.write("TEST");
            fw.flush();
        }catch(IOException e){
            System.out.println("ファイル書き込みエラー発生");
        }finally {
            if(fw != null){
                try {
                    fw.close();
                }catch (IOException e2){}
            }
        }
    }
}
