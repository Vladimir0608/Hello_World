import java.util.Scanner;

public class BrojZnamenki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite cijeli broj: ");
        int broj = scanner.nextInt();

        // Ako je broj negativan, koristimo apsolutnu vrijednost
        int apsolutniBroj = Math.abs(broj);

        int brojZnamenki = 0;

        // Ako je broj 0, broj znamenki je 1
        if (apsolutniBroj == 0) {
            brojZnamenki = 1;
        } else {
            while (apsolutniBroj > 0) {
                apsolutniBroj /= 10;
                brojZnamenki++;
            }
        }

        System.out.println("Broj znamenki unesenog broja je: " + brojZnamenki);

        scanner.close();
    }
}