package com.company;

import java.util.Scanner;

public class PikteProvimit {



        public static String findGrade(int piket) {

            if (piket < 0 || piket > 100)
                return "Rezultat i pavlefshem";

            switch (piket / 10) {

                case 10:
                case 9:
                    return "Nota 10";
                case 8:
                    return "Nota 9";
                case 7:
                    return "Nota 8";
                case 6:
                    return "Nota 7";
                case 5:
                    return "Nota 6";
                default:
                    return "Nota 5";
            }
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Shkruani piket tuaja: ");
            int piket = scan.nextInt();

            System.out.println("piket = " + findGrade(piket));
            scan.close();
        }

    }

