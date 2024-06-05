import java.util.Scanner;

public class esercizio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il prezzo di un prdotto: ");
        float prezzo = scanner.nextFloat();

        System.out.println("inserisci lo sconto percentuale: ");
        int percsconto = scanner.nextInt();

        double sconto = ((prezzo*percsconto)/100);
        System.out.println("lo sconto è: " + sconto);
        double prezzoscontato = prezzo-sconto;
        System.out.println("il prezzo scontato è: " +prezzoscontato);

        scanner.close();
    }
}
