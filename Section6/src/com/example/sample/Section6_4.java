package com.example.sample;

import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

public class Section6_4 {
    public static void main(String[] args) {
        double pi = 3.14;
        IntToDoubleFunction piFunc = x -> x * x * pi;
        double dd = piFunc.applyAsDouble(3);
        System.out.println(dd);



        IntBinaryOperator func = (int a,int b) -> {return a - b;};
        int a = func.applyAsInt(5,3);
        System.out.println(a);

        IntToDoubleFunction dFunc = x -> x * x * 3.14;
        double d = dFunc.applyAsDouble(5);
        System.out.println(d);
    }
}
