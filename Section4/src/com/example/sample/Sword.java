package com.example.sample;

public class Sword implements Cloneable{
    private String name;

    public Sword(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sword clone(){
        Sword sword = new Sword(this.name);
        return sword;
    }
}
