import java.util.Arrays;
import java.util.Scanner;

public class esercizio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci giorno");
        int giorno = scanner.nextInt();
        System.out.println("Inserisci mese");
        int mese = scanner.nextInt();


        if (giorno > 0 && giorno < 32 && mese > 0 && mese < 13) {
            if (giorno == 1 && mese == 1)
                System.out.println("CAPODANNO");
             else if (giorno == 6 && mese == 1)
                System.out.println("Epifania!");
             else if (giorno == 15 && mese == 8)
                System.out.println("Feragosto");
            else if (giorno == 25 && mese == 12)
                System.out.println("Natale");
             else {
                System.out.println("Non è una festività");
            }
        }
        else {
            System.out.println("non è una data valida");
        }
    }
}



