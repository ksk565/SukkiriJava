package com.example.sample;


public class Section8_2 {
    public static void main(String[] args) {
      Bank_NR bn = new Bank_NR("山銀","山口県");
      Bank_NR bm = new Bank_NR("山銀","山口県");
      Bank_NR by = new Bank_NR("広銀","広島県");

        Bank_JAR an = new Bank_JAR("山銀","山口県");
        Bank_JAR am = new Bank_JAR("山銀","山口県");
        Bank_JAR ay = new Bank_JAR("広銀","広島県");

        System.out.println(bn.equals(bm));
        System.out.println(bn.equals(by));


        System.out.println(an.equals(am));
        System.out.println(an.equals(ay));

      System.out.println(an.hashCode());
      System.out.println(am.hashCode());
      System.out.println(ay.hashCode());

    }

}
