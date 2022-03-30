package com.example.sample;

import java.io.*;

public class Section10_1 {
    public static void main(String[] args) throws IOException {
        Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
        w.write("名前"+"\n");
        w.write("hp"+"\n");
        w.write("mp"+"\n");

        w.flush();
        w.close();

        BufferedReader r = new BufferedReader(new FileReader("rpgsave.dat"));
        String line = r.readLine();
        while(line != null){
            System.out.println("readLine = "+line);
            line = r.readLine();
        }
        r.close();

    }
}
