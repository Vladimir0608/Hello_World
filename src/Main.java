import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite naziv proizvoda: ");
        String naziv = scanner.nextLine();

        System.out.print("Unesite cijenu proizvoda: ");
        BigDecimal cijena = scanner.nextBigDecimal();

        Proizvod proizvod = new Proizvod(naziv, cijena);

        System.out.print("Unesite popust (u postocima): ");
        BigDecimal popust = scanner.nextBigDecimal();
        proizvod.postaviPopust(popust);

        BigDecimal konacnaCijena = proizvod.izracunajCijenu();

        System.out.println("Naziv proizvoda: " + proizvod.getNaziv());
        System.out.println("Cijena: " + proizvod.getCijena());
        System.out.println("Popust: " + proizvod.getPopust() + "%");
        System.out.println("Konačna cijena nakon popusta: " + konacnaCijena);
    }
}