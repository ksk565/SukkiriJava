package com.example.sample;

import java.io.*;
import java.time.LocalDate;

public class Section9_1 {
    public static void main(String[] args) throws IOException {
        String drec = "/Users/naganokeisuke/Downloads/rpgsave.dat";
        FileWriter fw = new FileWriter(drec,true);
        //Step1
        fw.write('B');//Step2
        fw.write("TEST");
        fw.write(String.valueOf(LocalDate.now()));

        fw.flush();
        fw.close();//Step3

        FileReader fr = new FileReader(drec);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        System.out.println(line);

        File file = new File(drec);
        System.out.println(file.length()+"バイト");
//        file.delete();

    }
}
