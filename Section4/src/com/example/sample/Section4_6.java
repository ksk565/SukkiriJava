package com.example.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Section4_6 {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<Hero>();
        Hero h1 = new Hero("ksk",234,234);
        list.add(h1);
        h1 = new Hero("test",346,123);
        list.add(h1);
        h1 = new Hero("rau",3436,0);
        list.add(h1);
        h1 = new Hero("nekuro",32,523);
        list.add(h1);

        for(Hero hero: list){
            System.out.println(hero.getName()+" : "+hero.getHp());
        }

        Collections.sort(list);

        for(Hero hero: list){
            System.out.println(hero.getName()+" : "+hero.getHp());
        }

    }
}
