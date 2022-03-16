package com.example.sample;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class BookX2 implements Comparable<BookX2>, Cloneable{
    private String title;
    private Date publishDate;
    private String comment;

    public BookX2(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//        if(!(obj instanceof BookX2)){
//            return false;
//        }
//        if(obj == null){
//            return false;
//        }
//        BookX2 b = (BookX2) obj;
//        if(!this.title.equals(b)){
//            return false;
//        }
//        if(!this.publishDate.equals(b)){
//            return false;
//        }
//        return true;
//    }
//    public int compareTo(BookX2 b){
//        return this.publishDate.compareTo(b.publishDate);
//    }

    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public int compareTo(BookX2 o){
        return CompareToBuilder.reflectionCompare(this,o,"comment","title");
    }


    @Override
    protected BookX2 clone() throws CloneNotSupportedException {
        BookX2 b = new BookX2(this.title,(Date)this.publishDate,this.comment);
        return b;
    }


}
