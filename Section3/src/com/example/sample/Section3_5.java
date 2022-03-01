package com.example.sample;

import java.util.HashMap;
import java.util.Map;

public class Section3_5 {
    public static void main(String[] args) {
        Map<String , Integer> prefs = new HashMap<String , Integer>();

        prefs.put("山口県",14525);
        prefs.put("石川県",34524);
        prefs.put("京都県",362652);
        prefs.put("大阪県",698578);
        prefs.put("福岡県",364463);

        for(String str : prefs.keySet()){
            int k = prefs.get(str);
            System.out.println(str+" : "+k);
        }
    }
}
