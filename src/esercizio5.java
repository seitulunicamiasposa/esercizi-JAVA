import java.util.Scanner;

public class esercizio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il prezzo: ");
        float prezzo = scanner.nextFloat();

        int ivaperc = 22;
        double iva = ((prezzo * ivaperc)/100);
        double ivasulprezzo = iva + prezzo;
        System.out.println("L'IVA del 22% sul prezzo è: " + ivasulprezzo);
        int ivasulprezzo2 = (int) ivasulprezzo;
        System.out.println("L'IVA del 22% sul prezzo (INTERO) è: " + ivasulprezzo2);

        scanner.close();
    }
}
