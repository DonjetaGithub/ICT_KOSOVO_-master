import java.util.Scanner;

public class Bertima {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kuleta juaj mban :");
        int sa1cent, sa2cent;
        int sa5cent;
        int sa50cent;
        int sa1euro;
        int sa2euro;

        System.out.print("Sa 1 cent: ");
        sa1cent = reader.nextInt();

        System.out.print("Sa 2 cent: ");
        sa2cent = reader.nextInt();

        System.out.print("Sa 5 cent: ");
        sa5cent = reader.nextInt();

        System.out.print("Sa 50 cent: ");
        sa50cent = reader.nextInt();

        System.out.print("Sa 1 euro: ");
        sa1euro = reader.nextInt();

        System.out.print("Sa 2 euro: ");
        sa2euro = reader.nextInt();

        System.out.println("-----------------------------------------");
        System.out.printf("Sa 1 centshe: %5d %10.2f EUR %n", sa1cent, sa1cent * 0.01);
        System.out.printf("Sa 2 centshe: %5d %10.2f EUR %n", sa2cent, sa2cent * 0.02);
        System.out.printf("Sa 5 centshe: %5d %10.2f EUR %n", sa5cent, sa5cent * 0.05);
        System.out.printf("Sa 50 centshe: %5d %10.5f EUR %n",sa50cent, sa50cent * 0.50);
        System.out.printf("Sa 1 euro: %5d %10f EUR %n", sa1euro, sa1euro * 1.00);
        System.out.printf("Sa 2 euro: %5d %20f EUR %n", sa2euro, sa2euro * 2.00);

        System.out.println("-----------------------------------------");
        System.out.printf("Total: %50.9f EUR %n", (sa1cent * 0.01 + sa2cent * 0.02 + sa5cent * 0.05 + sa50cent * 0.50 + sa1euro * 1.00 + sa2euro * 2.00));
        System.out.println("-----------------------------------------");


    }
}
