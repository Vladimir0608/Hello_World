import java.util.Scanner;

public class prosDuljRijeci {

    //   Statistika riječi Napravi program koji učitava rečenicu i ispisuje:
    //1. Sve riječi duže od 5 slova
    //2. Najdužu riječ
    //3. Prosječnu duljinu riječi

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi rečenicu:");
        String rečenica = scanner.nextLine();

        String[] riječi = rečenica.split(" ");
        ispišiRiječiDužeOd(riječi, 5);
        System.out.println("Najduža riječ: " + najdužaRiječ(riječi));
        System.out.println("Prosječna duljina riječi: " + prosječnaDuljina(riječi));


    }

    public static void ispišiRiječiDužeOd(String[] riječi, int duljina) {
        System.out.println("Riječi duže od " + duljina + " slova:");
        for (String riječ : riječi) {
            if (riječ.length() > duljina) {
                System.out.println(riječ);
            }
        }
    }

    public static String najdužaRiječ(String[] riječi) {
        String najduža = "";
        for (String riječ : riječi) {
            if (riječ.length() > najduža.length()) {
                najduža = riječ;
            }
        }
        return najduža;
    }

    public static int prosječnaDuljina(String[] riječi) {
        int ukupnaDuljina = 0;

        for (String riječ : riječi) {
            ukupnaDuljina += riječ.length();
        }

        if (riječi.length > 0) {
            return ukupnaDuljina / riječi.length;
        } else {
            return 0;
        }
    }
}