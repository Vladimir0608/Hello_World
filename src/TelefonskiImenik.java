import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelefonskiImenik {

    private List<String> imena = new ArrayList<>();
    private List<String> brojevi = new ArrayList<>();

    public static void main(String[] args) {
        TelefonskiImenik imenik = new TelefonskiImenik();
        imenik.radi();
    }

    public void radi() {
        Scanner scanner = new Scanner(System.in);
        int izbor;

        do {
            System.out.println("\n1. Dodaj unos");
            System.out.println("2. Prikazi sve unose");
            System.out.println("3. Pretrazi po imenu");
            System.out.println("4. Obrisi unos");
            System.out.println("5. Izlaz");
            System.out.print("Odaberite opciju: ");
            izbor = scanner.nextInt();
            scanner.nextLine();

            switch (izbor) {
                case 1:
                    dodajUnos(scanner);
                    break;
                case 2:
                    prikažiUnose();
                    break;
                case 3:
                    pretražiPoImenu(scanner);
                    break;
                case 4:
                    obrišiUnos(scanner);
                    break;
                case 5:
                    System.out.println("Izlaz iz programa.");
                    break;
                default:
                    System.out.println("Nepoznata opcija, pokusajte ponovo.");
            }
        } while (izbor != 5);

        scanner.close();
    }

    private void dodajUnos(Scanner scanner) {
        System.out.print("Unesite ime: ");
        String ime = scanner.nextLine();
        System.out.print("Unesite broj: ");
        String broj = scanner.nextLine();
        imena.add(ime);
        brojevi.add(broj);
        System.out.println("Unos dodan.");
    }

    private void prikažiUnose() {
        if (imena.isEmpty()) {
            System.out.println("Imenik je prazan.");
            return;
        }
        System.out.println("\nPopis unosa:");
        for (int i = 0; i < imena.size(); i++) {
            System.out.println((i + 1) + ". " + imena.get(i) + ": " + brojevi.get(i));
        }
    }

    private void pretražiPoImenu(Scanner scanner) {
        System.out.print("Unesite ime za pretraživanje: ");
        String ime = scanner.nextLine();
        int index = imena.indexOf(ime);

        if (index != -1) {
            System.out.println("Pronađen unos: " + ime + ": " + brojevi.get(index));
        } else {
            System.out.println("Ime nije pronađeno.");
        }
    }

    private void obrišiUnos(Scanner scanner) {
        System.out.print("Unesite ime za brisanje: ");
        String ime = scanner.nextLine();
        int index = imena.indexOf(ime);

        if (index != -1) {
            imena.remove(index);
            brojevi.remove(index);
            System.out.println("Unos za " + ime + " je obrisan.");
        } else {
            System.out.println("Ime nije pronađeno.");
        }
    }
}