import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Racun racun1 = new TekuciRacun("11111", new BigDecimal("100.00"), "Vladimir Tolic");
        Racun racun2 = new StedniRacun("22222", new BigDecimal("1000.00"), "Vladimir Tolic");



        System.out.println("Početno stanje na Tekućem računu: " + racun1.getStanje());
        System.out.println("Početno stanje na Štednom računu: " + racun2.getStanje());



        racun1.uplata(new BigDecimal("500.00"));



        racun2.uplata(new BigDecimal("1000.00"));



        racun1.isplata(new BigDecimal("200.00"));




        racun1.obracunKamate();
        racun2.obracunKamate();
    }
}