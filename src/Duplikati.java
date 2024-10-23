
import java.util.ArrayList;
import java.util.Scanner;

//Traziti od korisnika da unese broj elemenata u listi te popuni elemente lise.
//Nakon toga pretraziti po listi da li postoji ijedan duplikat, ukoliko postoji
//ispisi vrijednost true, ukoliko ne postoji ispisi false.


public class Duplikati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Unesite broj elemenata u listi: ");
        int n = scanner.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();


        System.out.println("Unesite " + n + " elemenata:");
        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextInt());
        }

        Boolean duplikat = false;
    }
    private static void provjeriDuplikate(ArrayList<Integer> lista){
        int velicina = lista.size();
        boolean duplikat = false;
        for (int i = 0; i < velicina; i++) {
            for (int j = i + 1; j < velicina; j++) {
                if (lista.get(i) == (lista.get(j))) {
                    System.out.println("true");
                    duplikat = true;
                    break;
                    
                }
            }
        }
        if(!duplikat){
            System.out.println("False");
        }
    }
}