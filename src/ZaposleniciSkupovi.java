import java.util.HashSet;

public class ZaposleniciSkupovi {
    public static void main(String[] args) {

        HashSet<String> odjelA = new HashSet<>();
        HashSet<String> odjelB = new HashSet<>();


        odjelA.add("Mate");
        odjelA.add("Ivan");
        odjelA.add("Ivana");
        odjelA.add("Marija");


        odjelB.add("Ana");
        odjelB.add("Marija");
        odjelB.add("Ivana");
        odjelB.add("Petar");


        HashSet<String> unija = new HashSet<>(odjelA);
        unija.addAll(odjelB);  // Unija A i B
        System.out.println("Zaposlenici iz oba odjela (Unija): " + unija);


        HashSet<String> presjek = new HashSet<>(odjelA);
        presjek.retainAll(odjelB);  // Presjek A i B
        System.out.println("Zaposlenici koji rade u oba odjela (Presjek): " + presjek);


        HashSet<String> razlika = new HashSet<>(odjelA);
        razlika.removeAll(odjelB);  // Razlika A - B
        System.out.println("Zaposlenici koji rade samo u odjelu A (Razlika): " + razlika);
    }
}
