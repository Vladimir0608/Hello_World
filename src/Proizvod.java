import java.math.BigDecimal;
import java.math.RoundingMode;

    class Proizvod {
        private String naziv;
        private BigDecimal cijena;
        private BigDecimal popust;


        public Proizvod(String naziv, BigDecimal cijena) {
            this.naziv = naziv;
            this.cijena = cijena;
            this.popust = BigDecimal.ZERO;
        }


        public void postaviPopust(BigDecimal popust) {
            this.popust = popust;
        }


        public BigDecimal izracunajCijenu() {
            BigDecimal popustDecimal = popust.divide(BigDecimal.valueOf(100)); // pretvorba postotka u decimal
            BigDecimal iznosPopusta = cijena.multiply(popustDecimal);
            return this.cijena.subtract(iznosPopusta).setScale(2, RoundingMode.HALF_UP); // zaokruživanje na 2 decimale
        }


        public String getNaziv() {
            return this.naziv;
        }

        public BigDecimal getCijena() {
            return this.cijena;
        }

        public BigDecimal getPopust() {
            return this.popust;
        }
    }

