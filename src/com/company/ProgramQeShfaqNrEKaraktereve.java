package com.company;

import java.util.*;

public class ProgramQeShfaqNrEKaraktereve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0, i = 0;
        System.out.print("Ju lutem shkruani ndonje karakter =  ");
        String str = sc.nextLine();
        while (i < str.length()) {
            if (str.charAt(i) != ' ') {
                count++;
            }
            i++;
        }
        System.out.println("\nNumri total i karaktereve eshte  =  " + count);
    }
}