package com.example.sample;

import java.util.Date;

public class BookX2 {
    private String title;
    private Date publishDate;
    private String comment;

    public BookX2(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof BookX2)){
            return false;
        }
        if(obj == null){
            return false;
        }
        BookX2 b = (BookX2) obj;
        if(!this.title.equals(b)){
            return false;
        }
        if(!this.publishDate.equals(b)){
            return false;
        }
        return true;
    }
    public int compareTo(BookX2 b){
        return this.publishDate.compareTo(b.publishDate);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookX2 b = new BookX2(this.title,(Date)this.publishDate,this.comment);
        return b;
    }
}
