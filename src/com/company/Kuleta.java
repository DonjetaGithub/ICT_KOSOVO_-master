package com.company;

import java.util.Scanner;

public class Kuleta {

            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
                System.out.println("Kuleta juaj mban :");
                int sa5euro, sa10euro;
                int sa20euro;
                int sa50euro;
                int sa100euro;
                int sa200euro;
                int sa500euro;

                System.out.print("Sa 5 euro: ");
                sa5euro = reader.nextInt();

                System.out.print("Sa 10 euro: ");
                sa10euro = reader.nextInt();

                System.out.print("Sa 20 euro: ");
                sa20euro = reader.nextInt();

                System.out.print("Sa 50 euro: ");
                sa50euro = reader.nextInt();

                System.out.print("Sa 100 euro: ");
                sa100euro = reader.nextInt();

                System.out.print("Sa 200 euro: ");
                sa200euro = reader.nextInt();

                System.out.print("Sa 500 euro: ");
                sa500euro = reader.nextInt();


                System.out.println("-----------------------------------------");
                System.out.printf("Sa 5 euroshe: %5d %10.2f EUR %n", sa5euro, sa5euro * 5.00);
                System.out.printf("Sa 10 euroshe: %5d %10.2f EUR %n",sa10euro, sa10euro * 10.0);
                System.out.printf("Sa 20 euroshe: %5d %10.2f EUR %n",sa20euro, sa20euro * 20.0);
                System.out.printf("Sa 50 euroshe: %5d %10.2f EUR %n",sa50euro, sa50euro * 50.0);
                System.out.printf("Sa 100 euroshe: %5d %10.2f EUR %n",sa100euro, sa100euro * 100.0);
                System.out.printf("Sa 200 euroshe: %5d %10.2f EUR %n",sa200euro, sa200euro * 200.0);
                System.out.printf("Sa 500 euroshe: %5d %10.2f EUR %n",sa500euro, sa500euro * 500.0);
                System.out.println("-----------------------------------------");





            }
        }

