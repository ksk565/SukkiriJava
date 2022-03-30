package com.example.sample;

import java.io.Serializable;

public class Hero implements Serializable {
    private static final long serialVersionUID = 123456789L;
    private String name;
    private int hp;
    private int mp;

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;

    }
}
