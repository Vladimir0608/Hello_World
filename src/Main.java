import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Odaberite broj od 1 do 4 za matematičku radnju:");
        System.out.println("1 - Zbrajanje");
        System.out.println("2 - Oduzimanje");
        System.out.println("3 - Množenje");
        System.out.println("4 - Dijeljenje");

        int odabir = scanner.nextInt();

        System.out.println("Unesite prvi broj:");
        double broj1 = scanner.nextDouble();
        System.out.println("Unesite drugi broj:");
        double broj2 = scanner.nextDouble();

        switch (odabir){
            case 1:
                System.out.println("Rezultat zbrajanja: " + (broj1 + broj2));
                break;
            case 2:
                System.out.println("Rezultat oduzimanja: " + (broj1 - broj2));
                break;
            case 3:
                System.out.println("Rezultat množenja: " + (broj1 * broj2));
                break;
            case 4:
                System.out.println("Rezultat dijeljenja: " + (broj1 / broj2));
                break;

            default:System.out.println("Nevažeći odabir. Molimo pokušajte ponovo.");
        }
    }
}
