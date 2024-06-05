import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci numero 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci numero 2: ");
        int num2 = scanner.nextInt();

        int somma = num1 + num2;
        System.out.println("la somma è: " + somma);

        float somma2 = (float) somma;
        System.out.print("la somma in float è: " + somma2);

        scanner.close();
    }
}
