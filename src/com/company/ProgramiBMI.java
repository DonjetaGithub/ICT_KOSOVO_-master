package com.company;

import java.util.Scanner;

public class ProgramiBMI {

        public static String bmiCategory(double pesha, double lartesia) {
            double bmi = pesha / (lartesia * lartesia) ;

            if(bmi < 18.5)
                return "I/e Holle";
            else if(bmi < 25)
                return "Normal";
            else if(bmi < 30)
                return "Mbipeshe";
            else
                return "I/e trashe";
        }

        public static void main(String[] args) {


            double peshanekg = 0.0f;
            double lartesianeMetra = 0.0f;
            String rezultati = null;
            Scanner scan = new Scanner(System.in);
            System.out.print("Shkruani peshen ne Kg: ");
            peshanekg = scan.nextDouble();
            System.out.print("Shkruani lartesine ne metra: ");
            lartesianeMetra = scan.nextDouble();

            rezultati = bmiCategory( peshanekg,
                    lartesianeMetra );

            System.out.println(rezultati);

        }
    }

