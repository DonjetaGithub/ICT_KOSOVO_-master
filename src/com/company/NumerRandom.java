package com.company;
import java.util.Scanner;

public class NumerRandom
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Shtypni numrin: ");
        int n = in.nextInt();
        int r = (int)(Math.random() * n) + 1;
        System.out.print("Numri Random eshte = " + r);

    }
}