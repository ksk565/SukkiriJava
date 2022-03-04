package com.example.sample;

public class Section5_1 {
    public static void main(String[] args) {
        Pocket<Integer> p = new Pocket<Integer>();
        p.put(1192);
        int s = p.get();
        System.out.println(p.get());
        System.out.println(s);
//        System.out.println(p.get().toString());
    }
}
class Pocket<E>{
    private E data;
    public void put(E d){
        this.data = d;
    }
    public E get(){
        return this.data;
    }
}
