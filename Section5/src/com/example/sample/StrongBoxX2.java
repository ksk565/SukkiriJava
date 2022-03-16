package com.example.sample;


public class StrongBoxX2<E> {
    private E obj;
    private KyeTypeX2 k;
    private int count = 0;

    public StrongBoxX2(E obj, KyeTypeX2 k) {
        this.obj = obj;
        this.k = k;
    }
    public E get(){
        switch (this.k){
            case PADLOCK:
                if(count > 10){
                    count = 0;
                    return obj;
                }
                break;
            case FINGER:
                if(count > 100){
                    count = 0;
                    return obj;
                }
                break;
            case DIAL:
                if(count > 1000){
                    count = 0;
                    return obj;
                }
                break;
            case BUTTON:
                if(count > 10000){
                    count = 0;
                    return obj;
                }
            break;
        }
        count++;
        return null;
    }

    public void put(E obj){
        this.obj = obj;
    }






}
enum KyeTypeX2{
    PADLOCK,BUTTON,DIAL,FINGER
}
