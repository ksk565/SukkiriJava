package com.example.sample;

public class Main {

    public static void main(String[] args) {
        StrongBoxX2<String> sb2 = new StrongBoxX2<String>("yuto",KyeTypeX2.PADLOCK);
        for(int i = 0;i<12;i++){
            String str = sb2.get();
            if(!(str == null)){
                System.out.println(str);
            }
        }
    }
}
