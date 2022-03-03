package com.example.sample;

public class Section4_3 {
    public static void main(String[] args) {
        Account a = new Account("ABCDEFG");
        Account d = new Account("ABCDEFG");

        Account b = new Account("1234567");
        Account c = new Account(" aaaaaaa");
        Account e = new Account("aaaaaaa");


        if(e.equals(c)){
            System.out.println("イコール");
        }else{
            System.out.println("イコールではない");
        }
    }

}
class Account{
    String accountNo;

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Account)){
            return false;
        }
        Account r = (Account) obj;
        if(!this.accountNo.trim().equals(r.accountNo.trim())){
            return false;
        }
        return true;
    }
}
