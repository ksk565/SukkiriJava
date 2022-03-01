package com.example.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Section3_9 {
    public static void main(String[] args) {
        final String f = "%9s";
        List<String> tokusan = new ArrayList<String>();
        Map<String, List<String>> ranking = new HashMap<String,List<String>>();

        tokusan.add("ふぐ");
        tokusan.add("錦帯橋");
        tokusan.add("山賊");
        tokusan.add("瓦ぞば");
        tokusan.add("角島");

        ranking.put("山口",tokusan);

        tokusan = new ArrayList<String>();

        tokusan.add("カープ");
        tokusan.add("大和ミュージアム");
        tokusan.add("お好み焼き");
        tokusan.add("原爆ドーム");
        tokusan.add("瀬戸大橋");

        ranking.put("広島", tokusan);

        for(String str : ranking.keySet()){
            List<String> l = ranking.get(str);
            System.out.println(str+": ");
            for(String s: l){
                s = String.format(f,s);
                System.out.println(s);
            }
        }

    }
}
