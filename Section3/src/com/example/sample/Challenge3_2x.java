package com.example.sample;

import java.util.*;

public class Challenge3_2x {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();
        heros.add(new Hero("佐籐"));
        heros.add(new Hero("鈴木"));

        for(Hero h:heros){
            System.out.println(h.getName());
        }
        Map<Hero,Integer> skill = new HashMap<Hero, Integer>();
        skill.put(heros.get(0),3);
        skill.put(heros.get(1),7);

        for(Hero key: skill.keySet()){
            System.out.println(key.getName()+"が倒した敵の数＝"+skill.get(key));
        }
    }
}
