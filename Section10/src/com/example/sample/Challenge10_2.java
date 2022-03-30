package com.example.sample;

import java.io.*;

public class Challenge10_2 {
    public static void main(String[] args) throws Exception {
        Department soumubu = new Department("総務部",new Employee("田中",41));

        FileOutputStream fos = new FileOutputStream("company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(soumubu);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("company.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Department reTanaka = (Department) ois.readObject();
        System.out.println(reTanaka.name);
        System.out.println(reTanaka.leader.name);
        System.out.println(reTanaka.leader.age );


    }
}
