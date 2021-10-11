package com.company;

public class NotatTest {
    public static void main(String[] args) {
        System.out.println("Notat jane:");
        System.out.println("====================");
        for (Notat notat: Notat.values()){
            notat.print();
        }
        System.out.println("====================");
    }
}
