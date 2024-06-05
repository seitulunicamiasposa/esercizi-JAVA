import java.util.Scanner;

public class esercizio10 {
    public static void main(String[] args) {
        Scanner calcolatrice = new Scanner(System.in);

        System.out.print("inserisci numero 1: ");
        double num1 = calcolatrice.nextDouble();

        System.out.print("Inserisci numero 2: ");
        double num2 = calcolatrice.nextDouble();

        double somma = num1 + num2;
        System.out.println("la somma è: " + somma);
        double differenza = num1 - num2;
        System.out.println("la differenza è:" + differenza);
        double moltiplicazione = num1*num2;
        System.out.println("la moltiplicazione è: " + moltiplicazione);
        double divisione = num1/num2;
        System.out.println("La divisione è: " + divisione);

        calcolatrice.close();
    }
}
