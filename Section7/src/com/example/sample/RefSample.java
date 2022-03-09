package com.example.sample;

public class RefSample {
    public int times = 0;

    public RefSample(int times) {
        this.times = times;
    }

    public void hello(String msg){
        this.hello(msg, this.times);
    }
    public void hello(String msg, int times){
        System.out.println("Hello, "+ msg + " X" + times);
    }
 }
