import java.util.Scanner;

public class Kusur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        float kusur = 500;


        System.out.print("Unesite iznos koji treba dobiti natrag: ");
        float iznos = scanner.nextFloat();
        if (iznos > kusur) {
            System.out.println("Unijeti iznos je veći od računa!");
            return;
        }


        float zaVratiti = kusur - iznos;
        System.out.println("Iznos koji treba vratiti: " + zaVratiti);


        double[] novcanice = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        System.out.println("Novčanice koje treba dati kupcu:");


        for (double novcanica : novcanice) {
            while (zaVratiti >= novcanica) {
                System.out.println(novcanica);
                zaVratiti -= novcanica;

                zaVratiti =(float)  (Math.round(zaVratiti * 10.0) / 10.0);
            }
        }
    }
}