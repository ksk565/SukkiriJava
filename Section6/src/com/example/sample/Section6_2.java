package com.example.sample;

import java.util.function.IntBinaryOperator;

public class Section6_2 {
    public static void main(String[] args) {
        IntBinaryOperator func = Section6_2::sub;
       int a = func.applyAsInt(5,3);
        System.out.println("5+3="+a);
    }
    public static int sub(int a,int b){
        return a - b;
    }


}
