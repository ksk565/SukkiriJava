package com.example.sample;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Bank_JAR {
    String name;
    String address;

    public Bank_JAR(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj);
    }

    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
