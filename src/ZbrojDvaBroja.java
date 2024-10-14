import java.util.Scanner;

public class ZbrojDvaBroja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Unos prvog broja
        System.out.print("Unesite prvi broj: ");
        int prviBroj = scanner.nextInt();

        // Unos drugog broja
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = scanner.nextInt();

        // Izračunavanje zbroja
        int zbroj = prviBroj + drugiBroj;

        // Ispis rezultata
        System.out.println("Zbroj " + prviBroj + " i " + drugiBroj + " je: " + zbroj);


    }
}
