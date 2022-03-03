package com.example.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Section4_4 {
    public static void main(String[] args) {
        Set<Hero1> list = new HashSet<Hero1>();
        Hero1 h1 = new Hero1();
        h1.name = "けすけ";
        System.out.println(h1.hashCode());
        list.add(h1);
        System.out.println("要素数："+list.size());
        h1 = new Hero1();
        h1.name = "けすけ";
        System.out.println(h1.hashCode());
        list.remove(h1);
        System.out.println("要素数："+list.size());


    }
}
class Hero1 {
    public String name;

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Hero1)){
            return false;
        }
        if(((Hero1) obj).name == this.name){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        if(name == null){
            return -1;
        }
        int result = 37;
        result = result * 31 + name.hashCode();

        return result;
    }
}
