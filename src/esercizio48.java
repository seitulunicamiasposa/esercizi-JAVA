import java.util.Scanner;

public class esercizio48 {
    public static void codice(String colore) {
        if(colore.equals("GIALLO")) {
            ColoriRoma codice = ColoriRoma.valueOf(colore);
            System.out.println(codice.codcolore);
        } else if(colore.equals("ROSSO")) {
            ColoriRoma codice = ColoriRoma.valueOf(colore);
            System.out.println(codice.codcolore);
        } else {
            System.out.println("Questo colore non è un colore della Roma. Qui tifiamo solo A S MAGICA ROMA. Se tifi un'altra squadra ti invitiamo ad andare altrove!");
            System.out.println("Se invece hai scritto uno de due colori della NOSTRA ROMA, controlla di averli scritti in MAIUSCOLO!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi colore per scoprirne il codice esadecimale");
        String colore = scanner.nextLine();

        codice(colore);

    }
}
