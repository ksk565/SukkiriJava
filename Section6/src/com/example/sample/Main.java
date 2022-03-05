package com.example.sample;

import java.util.function.IntPredicate;
interface Func1{
    boolean call(int x);
}
interface Func2{
    String call(boolean b, String i);
}
public class Main {

    public static void main(String[] args) {
        FuncList func = new FuncList();
        Func1 func1 = FuncList::isOdd;
        Func2 func2 = func::addNamePrefix;

        System.out.println(func1.call(8)? "奇数":"偶数");
        String str = func2.call(true,"KSK");
        System.out.println(str);

        Func1 f1 = i -> i % 2 == 1;
        Func2 f2 = (male,name) -> {
            if(male){return "Mr. "+name;}
            else{return "Ms. "+name;}
        };
        System.out.println();
        System.out.println(f1.call(5)? "奇数":"偶数");
        System.out.println(f2.call(true,"KSK"));




    }
}
