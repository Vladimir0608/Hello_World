import java.util.HashSet;

public class StudentHashSet {
    public static void main(String[] args) {

        HashSet<String> studenti = new HashSet<>();


        studenti.add("Nikolina");
        studenti.add("Antonio");
        studenti.add("Danijela");
        studenti.add("Zvonimir");
        studenti.add("Vladimir");


        System.out.println("Studenti u skupu: " + studenti);


        String imeZaProvjeru = "Antonio";
        if (studenti.contains(imeZaProvjeru)) {
            System.out.println(imeZaProvjeru + " je prisutan u skupu.");
        } else {
            System.out.println(imeZaProvjeru + " nije prisutan u skupu.");
        }


        String imeZaUklanjanje = "Zvonimir";
        if (studenti.remove(imeZaUklanjanje)) {
            System.out.println(imeZaUklanjanje + " je uklonjen iz skupa.");
        } else {
            System.out.println(imeZaUklanjanje + " nije pronađeno u skupu.");
        }


        System.out.println("Studenti nakon uklanjanja: " + studenti);
    }
}