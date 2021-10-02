import java.util.Scanner;

public class LojaeFutbollit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ekipi Vendas: ");
        String EkipiVendas = sc.nextLine();
        System.out.print("Ekipi Musafir: ");
        String EkipiMusafir = sc.nextLine();

        System.out.print("Numri i tifozve: ");
        int numriiTifozve = sc.nextInt();
        sc.nextLine();

        System.out.print("Fusha: ");
        String fushaArena = sc.nextLine();


        System.out.print("Sa gola ka shenuar: " + EkipiVendas + " ");
        int numriiGolave2 = sc.nextInt();

        System.out.print("Sa gola ka shenuar:" + EkipiMusafir + " ");
        int  numriiGolave1 = sc.nextInt();

        System.out.println("------------------------------------------");
        System.out.println("Rezultati Perfundimtar: " );
        System.out.printf("%s - %s: %d - %d  %n", EkipiMusafir, EkipiVendas, numriiGolave1, numriiGolave2  );
        System.out.printf("Stadiumi  ka gjithsej : %s  Tifoz Prezent! %n ",  numriiTifozve, fushaArena  );

        System.out.println("------------------------------------------");


    }
}
