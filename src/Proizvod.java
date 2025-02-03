import java.util.HashMap;
import java.util.Map;

class Proizvod {
    private int id;
    private String naziv;
    private int kolicina;

    public Proizvod(int id, String naziv, int kolicina) {
        this.id = id;
        this.naziv = naziv;
        this.kolicina = kolicina;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void dodajKolicinu(int kolicina) {
        this.kolicina += kolicina;
    }

    public boolean oduzmiKolicinu(int kolicina) {
        if (this.kolicina >= kolicina) {
            this.kolicina -= kolicina;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return naziv + " (ID: " + id + ") - " + kolicina + " kom";
    }
}

class Skladiste {
    private int id;
    private String naziv;
    private Map<Integer, Proizvod> proizvodi;

    public Skladiste(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
        this.proizvodi = new HashMap<>();
    }

    public void dodajProizvod(Proizvod proizvod) {
        proizvodi.put(proizvod.getId(), proizvod);
    }

    public Proizvod getProizvod(int proizvodId) {
        return proizvodi.get(proizvodId);
    }

    public boolean prijenosProizvoda(Skladiste odrediSkladiste, int proizvodId, int kolicina) {
        Proizvod proizvod = this.getProizvod(proizvodId);
        if (proizvod != null && proizvod.oduzmiKolicinu(kolicina)) {
            Proizvod odrediProizvod = odrediSkladiste.getProizvod(proizvodId);
            if (odrediProizvod == null) {
                odrediProizvod = new Proizvod(proizvodId, proizvod.getNaziv(), 0);
                odrediSkladiste.dodajProizvod(odrediProizvod);
            }
            odrediProizvod.dodajKolicinu(kolicina);
            return true;
        }
        return false;
    }

    public void ispisiStanje() {
        System.out.println("Stanje u skladištu " + naziv + " (ID: " + id + "):");
        proizvodi.forEach((k, v) -> System.out.println(v));
    }
}