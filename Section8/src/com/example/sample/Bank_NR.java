package com.example.sample;

public class Bank_NR {
    String name;
    String address;

    public Bank_NR(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)return true;
        if(obj == null) return false;
        if(!(obj instanceof Bank_NR)) return false;
        Bank_NR b = (Bank_NR) obj;
        if(!this.name.equals(b.name))return false;
        if(!this.address.equals(b.address))return false;
        return true;
    }
}
