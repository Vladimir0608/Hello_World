import java.util.Scanner;

public class SumaBrojeva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite pozitivan cijeli broj N: ");
        int N = scanner.nextInt();

        // Provjera da li je N pozitivan
        if (N <= 0) {
            System.out.println("Molimo unesite pozitivan cijeli broj.");
        } else {
            int suma = 0;

            // Izračunavanje sume
            for (int i = 1; i <= N; i++) {
                suma += i;
            }

            System.out.println("Suma svih brojeva od 1 do " + N + " je: " + suma);
        }

        scanner.close();
    }
}
