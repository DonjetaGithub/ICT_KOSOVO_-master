package com.company;

public enum Notat {
    Dobet(1),
    Mjaftueshem(2),
    Mire(3),
    Shummire(4),
    Shkelqyshem(5);

    private int notat;

    private Notat(int notat){
        this.notat = notat;
    }
    public int getNotat(){
        return notat;
    }
    public void  print(){
        System.out.printf("%s - %s %n", this,notat);
    }


}

