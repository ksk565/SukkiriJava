package com.example.sample;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Challenge9_1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        GZIPOutputStream gzos = null;
        try{
            fis = new FileInputStream("/Users/naganokeisuke/Downloads/rpgsave.dat");
            FileOutputStream fos = new FileOutputStream("/Users/naganokeisuke/Downloads/Copy_rpgsave.dat");
            BufferedOutputStream br = new BufferedOutputStream(fos);
            gzos = new GZIPOutputStream(br);
            int i = fis.read();
            while(i != -1){
                gzos.write(i);
                i = fis.read();
            }
            gzos.flush();
            gzos.close();
            fis.close();
        }catch(IOException e){
            System.out.println("ファイルの操作に失敗しました。");
            try {
                if(fis != null){
                    fis.close();
                }
                if(gzos != null){
                    gzos.close();
                }
            }catch (IOException ee){}
        }

    }
}
