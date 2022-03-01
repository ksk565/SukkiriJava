package com.example.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Callenge3_2 {
    public static void main(String[] args) {
        ArrayList<Hero> heros = new ArrayList<Hero>();
        Hero h1 = new Hero("佐籐");
        Hero h2 = new Hero("鈴木");
        heros.add(h1);
        heros.add(h2);

        for(Hero h :heros){
            System.out.println(h.getName());
        }


        Map<Hero,Integer> score = new HashMap<Hero, Integer>();
        score.put(h1,3);
        score.put(h2,7);

        for(Hero h:score.keySet()){
            int i = score.get(h);
            System.out.println(h.getName()+"が倒した敵の数＝" + i);
        }

    }
}

class Hero{
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
