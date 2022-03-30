package com.example.sample;

import java.util.StringTokenizer;

public class Section10_2 {
    public static void main(String[] args) {
        String s = "ボクスター,アルトワークス,シルビアS15";
        StringTokenizer st = new StringTokenizer(s, ",");
        while (st.hasMoreTokens()){
            String t = st.nextToken();
            System.out.println(t);
        }
    }
}
