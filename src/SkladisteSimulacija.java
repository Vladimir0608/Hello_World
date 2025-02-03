import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SkladisteSimulacija {
    public static void main(String[] args) throws InterruptedException {
        Skladiste skladiste1 = new Skladiste(1, "Skladiste 1");
        Skladiste skladiste2 = new Skladiste(2, "Skladiste 2");


        Proizvod proizvod1 = new Proizvod(101, "Proizvod A", 100);
        Proizvod proizvod2 = new Proizvod(102, "Proizvod B", 200);

        skladiste1.dodajProizvod(proizvod1);
        skladiste2.dodajProizvod(proizvod2);


        skladiste1.ispisiStanje();
        skladiste2.ispisiStanje();


        ExecutorService executor = Executors.newFixedThreadPool(2);


        executor.submit(() -> {
            synchronized (skladiste1) {
                synchronized (skladiste2) {
                    if (skladiste1.prijenosProizvoda(skladiste2, 101, 50)) {
                        System.out.println("Transakcija 1 uspješno izvršena.");
                    } else {
                        System.out.println("Transakcija 1 nije uspjela.");
                    }
                    skladiste1.ispisiStanje();
                    skladiste2.ispisiStanje();
                }
            }
        });


        executor.submit(() -> {
            synchronized (skladiste2) {
                synchronized (skladiste1) {
                    if (skladiste2.prijenosProizvoda(skladiste1, 102, 100)) {
                        System.out.println("Transakcija 2 uspješno izvršena.");
                    } else {
                        System.out.println("Transakcija 2 nije uspjela.");
                    }
                    skladiste1.ispisiStanje();
                    skladiste2.ispisiStanje();
                }
            }
        });


        executor.shutdown();
    }
}

