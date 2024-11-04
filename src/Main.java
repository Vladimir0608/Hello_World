
public class Main {
    public static void main(String [] args) {

        Polaznik polaznik1 = new Polaznik("Andro", "Andrić");
        Polaznik polaznik2 = new Polaznik("Jure", "Jurić", 22, "Muško");
        Polaznik polaznik3 = new Polaznik();

        
        System.out.println(polaznik1.ime + " " + polaznik1.prezime);
        
        
        polaznik2.dob = 33;
        
        
        polaznik3.ime = "Marija";
        polaznik3.prezime = "Marić";
        
        
        System.out.println(polaznik3.ime + " " + polaznik3.prezime);
        
    }
}
