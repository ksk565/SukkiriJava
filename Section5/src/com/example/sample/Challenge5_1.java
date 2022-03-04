package com.example.sample;

import java.awt.*;

public class Challenge5_1 {
    public static void main(String[] args) {
       StrongBox<String> sb = new StrongBox<String>("あいおうえと",KeyType.PADLICK);
       for(int i = 0; i <2000;i++){
               System.out.print(sb.get());

       }

    }
}
class StrongBox<E>{
    private E obj;
    private KeyType kt;
    private int count = 0;

    public StrongBox(E obj, KeyType kt) {
        this.obj = obj;
        this.kt = kt;
    }

    public E get() {

        switch (this.kt){
            case PADLICK:
                if(count >= 1024){
                    count = 0;
                    return obj;
            }
                break;
            case BUTTON:
                if(count >= 10000){
                    count = 0;
                    return obj;
                }
                break;
            case DIAL:
                if(count >= 30000){
                    count = 0;
                    return obj;
                }
                break;
            case FINGER:
                if(count >= 1000000){
                    count = 0;
                    return obj;
                }
                break;
        }
        count++;
        return null;
    }
}
enum KeyType{
    PADLICK ,BUTTON ,DIAL ,FINGER;
}
