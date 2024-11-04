import java.util.ArrayList;
import java.util.Scanner;

//Glavna klasa:
//U glavnoj klasi, kreirajte listu ArrayList<Student> kako biste pohranili sve unesene studente. DA
//Koristite metodu Scanner za unos podataka o studentima. DA
//Funkcionalnosti programa: DA
//Unos podataka: Omogućite korisniku unos podataka za više studenata. Nakon unosa svakog studenta, korisnik treba imati opciju da unese još jednog ili završi unos. DA
//Ispis svih studenata: Nakon unosa svih studenata, ispišite popis sa svim podacima o studentima.
//Analiza podataka:
//Pronađite i ispišite podatke o studentu s najvišim prosjekom. DA
//Pronađite i ispišite podatke o studentu s najnižim prosjekom. DA
//Ispišite prosjek ocjena svih studenata. DA

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studenti = new ArrayList<>();

        // Unos podataka o studentima

        while (true) {
            System.out.println("Unesite ime studenta");
            String ime = scanner.nextLine();

            System.out.println("Unesite prezime studenta");
            String prezime = scanner.nextLine();

            System.out.println("Unesite broj indeksa");
            String brojIndeksa = scanner.nextLine();

            System.out.println("Unesite prosjek ocjena");
            double prosjekOcjena = scanner.nextDouble();
            scanner.nextLine();

            // Dodavanje novog studenta

            studenti.add(new Student(ime, prezime, brojIndeksa, prosjekOcjena));

            System.out.println("Želite li unijeti još jednog studenta?(da/ne?): ");
            String odgovor = scanner.nextLine();
            if (odgovor.equalsIgnoreCase("ne")) {
                break;
            }
        }

        // Ispis svih studenata

        System.out.println("\nPopis svih studenata:");
        for (Student student : studenti) {
            System.out.println("Ime: " + student.getIme() + ", Prezime: " + student.getPrezime() +
                    ", Broj Indeksa: " + student.getBrojIndeksa() + ", Prosjek ocjena: " + student.getProsjekOcjena());
        }

        // Analiza

        if (studenti.size() > 0) {
            Student najboljiStudent = studenti.get(0);
            Student najlošijiStudent = studenti.get(0);
            double ukupniProsjek = 0;

            for (Student student : studenti) {
                if (student.getProsjekOcjena() > najboljiStudent.getProsjekOcjena()) {
                    najboljiStudent = student;
                }
                if (student.getProsjekOcjena() < najlošijiStudent.getProsjekOcjena()) {
                    najlošijiStudent = student;
                }
                ukupniProsjek += student.getProsjekOcjena();
            }

            double prosjekSvihStudenata = ukupniProsjek / studenti.size();

            // Ispis rezultata analize
            System.out.println("\nStudent s najvišim prosjekom:");
            System.out.println("Ime: " + najboljiStudent.getIme() + ", Prezime: " + najboljiStudent.getPrezime() +
                    ", Broj indeksa: " + najboljiStudent.getBrojIndeksa() + ", Prosjek ocjena: " + najboljiStudent.getProsjekOcjena());

            System.out.println("\nStudent s najnižim prosjekom:");
            System.out.println("Ime: " + najlošijiStudent.getIme() + ", Prezime: " + najlošijiStudent.getPrezime() +
                    ", Broj indeksa: " + najlošijiStudent.getBrojIndeksa() + ", Prosjek ocjena: " + najlošijiStudent.getProsjekOcjena());

            System.out.println("\nProsjek ocjena svih studenata: " + prosjekSvihStudenata);
        } else {
            System.out.println("Nema unesenih studenata.");
        }
    }
}

