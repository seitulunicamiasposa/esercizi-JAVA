import java.util.Scanner;

public class esercizio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il prezzo del prodotto: ");
        double prezzo = scanner.nextDouble();

        System.out.print("Inserisci il numero di pezzi acquistati: ");
        int num = scanner.nextInt();

        int totale = (int)prezzo*num;
        System.out.print("il totale è: " + totale);

        scanner.close();
    }
}
