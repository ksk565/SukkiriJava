package com.example.sample;

import java.util.*;

public class Book implements Comparable<Book> ,Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Book)){
            return false;
        }
        Book b = (Book)obj;
        if(!((this.title.equals(b.title)) && (this.publishDate.equals(b.publishDate)))){
            return false;
        }
        return true;
    }


    @Override
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

    public Book clone(){
        Book b = new Book(this.title,(Date)this.publishDate.clone(),this.comment);
        return b;
    }
}
