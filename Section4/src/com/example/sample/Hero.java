package com.example.sample;

public class Hero implements Comparable<Hero>, Cloneable {
    private String name;
    private int hp,mp;
    private Sword sword;

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "勇者(名前:"+this.name+" /HP:"+hp+" /MP:"+this.mp+")";
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
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
    public int compareTo(Hero hero){
        if(this.hp < hero.hp){
            return -1;
        }
        if(this.hp > hero.hp){
            return 1;
        }
        return 0;
    }

    public Hero clone(){
        Hero result = new Hero(this.name,this.hp,this.mp);
        result.setSword(this.sword.clone());

        return result;
    }

}
