package com.example.sample;

public class Section5_8 {
    public static void main(String[] args) {
        Account ksk = new Account("29375409",AccountType.FUTSU,3154);

        System.out.println(ksk.getAccountNo()+":"+ksk.getAccountType()+":"+ksk.getBalance()+":");

    }
}
class Account{
    private String accountNo;
    private AccountType accountType;
    private int balance;

    public Account(String accountNo, AccountType accountType, int balance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
enum AccountType{
    FUTSU , TOUZA , TEIKI;
}
