import java.util.Scanner;
import java.util.TreeSet;

public class GradTreeSet {
    public static void main(String[] args) {

        TreeSet<String> gradovi = new TreeSet<>();


        gradovi.add("Zagreb");
        gradovi.add("Sarajevo");
        gradovi.add("Bugojno");
        gradovi.add("Split");
        gradovi.add("Imotski");


        System.out.println("Gradovi u sortiranom redoslijedu:");
        for (String grad : gradovi) {
            System.out.println(grad);
        }


        System.out.println("\nPrvi grad: " + gradovi.first());
        System.out.println("Posljednji grad: " + gradovi.last());


        Scanner scanner = new Scanner(System.in);
        System.out.print("\nUnesite naziv grada koji želite da obrišete: ");
        String gradZaBrisanje = scanner.nextLine();


        if (gradovi.remove(gradZaBrisanje)) {
            System.out.println(gradZaBrisanje + " je obrisan iz skupa.");
        } else {
            System.out.println(gradZaBrisanje + " nije pronađen u skupu.");
        }


        System.out.println("\nPreostali gradovi nakon brisanja:");
        for (String grad : gradovi) {
            System.out.println(grad);
        }

        scanner.close();
    }
}