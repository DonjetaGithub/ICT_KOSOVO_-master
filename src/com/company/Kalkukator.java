package com.company;

import java.util.Scanner;

public class Kalkukator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kalkulatori i llogaritjeve! ");
        System.out.println("Shtypni numrat sipas deshires ");
        System.out.print("Numri i pare: ");
        int numriipare = sc.nextInt();
        System.out.print("Numri i dyte: ");
        int numriidyte = sc.nextInt();
        System.out.println("====================");
        System.out.printf("%d + %d =%d %n", numriipare,numriidyte,numriipare + numriidyte);
        System.out.printf("%d - %d =%d %n", numriipare,numriidyte,numriipare - numriidyte);
        System.out.printf("%d * %d =%d %n", numriipare,numriidyte,numriipare * numriidyte);
        System.out.printf("%d / %d =%d %n", numriipare,numriidyte,numriipare / numriidyte);
        System.out.println("====================");


    }
}
