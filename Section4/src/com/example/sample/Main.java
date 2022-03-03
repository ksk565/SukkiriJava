package com.example.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();

        Book a = new Book("青い空",new Date(132,05,13),"清々しい気持ち");
        books.add(a);
        a = new Book("うかる！行政書士",new Date(110,07,12),"勉強が続かない");
        books.add(a);
        a = new Book("スッキリJava",new Date(109,9,15),"分かりやすい");
        books.add(a);

        for(Book b : books){
            System.out.println(b.getTitle()+" : "+b.getPublishDate()+" : "+ b.getComment());
        }

        Collections.sort(books);

        for(Book b : books){
            System.out.println(b.getTitle()+" : "+b.getPublishDate()+" : "+ b.getComment());
        }
        System.out.println();
        Book c = a.clone();
        System.out.println(a.getTitle()+" : "+a.getPublishDate()+" : "+ a.getComment());
        System.out.println();
        System.out.println(c.getTitle()+" : "+c.getPublishDate()+" : "+ c.getComment());


    }
}
