import java.math.BigDecimal;

public class StedniRacun extends Racun {
    private static final BigDecimal KAMATNA_STOPA = new BigDecimal("0.015");


    public StedniRacun(String brojRacuna, BigDecimal stanje, String vlasnik) {
        super(brojRacuna, stanje, vlasnik);
    }


    @Override

    public void obracunKamate() {
        BigDecimal kamata = getStanje().multiply(KAMATNA_STOPA);
        BigDecimal novoStanje = getStanje().add(kamata);
        System.out.println("Kamata za Stedni racun: " + kamata + " | Novo stanje: " + novoStanje);
    }
}