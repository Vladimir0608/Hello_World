import java.util.Scanner;
/* Zadatak 1: Brojevi od 1 do N
Napišite program koji će izračunati sumu svih brojeva od 1 do N,
 gdje je N pozitivan cijeli broj unesen od strane korisnika.
 */

public class SumaSvihBrLeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int zbroj = 0;

        System.out.println("Molim unesite pozitivan broj");

        int uneseniBroj = scanner.nextInt();

        while (uneseniBroj < 0) {
            System.out.println("Molim unesite pozitivan broj");
            uneseniBroj = scanner.nextInt();

        }

        for (int i = 1; i <= uneseniBroj; i++) {
            zbroj += i;

        }

        System.out.println("Rezultat je:" + zbroj);

    }

}