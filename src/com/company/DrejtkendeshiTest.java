package com.company;

public class DrejtkendeshiTest {
    public static void main(String[] args) {
        Drejtkendeshi d1 = new Drejtkendeshi(2,3);
        Drejtkendeshi d2 = new Drejtkendeshi(3,3);


        System.out.println(d1.isSquare());
        System.out.println(d2.isSquare());

        System.out.println(d1.perimetriD());
        System.out.println(d2.syprinaD());
    }
}
