package com.company;

public class BankAccount {

    private String name;
    private double balance;


    public BankAccount(){
}

  public BankAccount(String name, double balance) {
        this.name=name;
        this.balance=balance;
  }
  public void setName(String name){
        this.name=name;
  }

    public String getName() {
        return name;
    }
    public double getBalance(){
        return  balance;
    }
}
