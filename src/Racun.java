import java.math.BigDecimal;

public abstract class Racun {
    private String brojRacuna;
    private BigDecimal stanje;
    private String vlasnik;

    public Racun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        this.brojRacuna = brojRacuna;
        this.stanje = stanje;
        this.vlasnik = vlasnik;
    }

    public void uplata(BigDecimal iznos) {
        if (iznos.compareTo(BigDecimal.ZERO) > 0) {
            stanje = stanje.add(iznos);
            System.out.println("Uplata od " + iznos + " uspješno izvršena.");
        } else {
            System.out.println("Iznos za uplatu mora biti pozitivan.");
        }
    }

    public void isplata(BigDecimal iznos) {
        if (iznos.compareTo(BigDecimal.ZERO) > 0 && iznos.compareTo(stanje) <= 0) {
            stanje = stanje.subtract(iznos);
            System.out.println("Isplata od " + iznos + " uspješno izvršena.");
        } else {
            System.out.println("Iznos za isplatu je neispravan ");
        }
    }


    public abstract void obracunKamate();


    public BigDecimal getStanje() {
        return this.stanje;
    }

    public String getVlasnik() {
        return this.vlasnik;
    }

    public String getBrojRacuna() {
        return this.brojRacuna;
    }
}