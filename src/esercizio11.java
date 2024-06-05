import java.util.Scanner;

public class esercizio11 {
    public static void main(String[] args) {
        Scanner scambio = new Scanner(System.in);

        System.out.print("inserisci numero 1: ");
        double num1 = scambio.nextDouble();

        System.out.print("Inserisci numero 2: ");
        double num2 = scambio.nextDouble();

        double num3 = num1+num2;
        double num4 = num3-num2;
        double num5 = num3-num1;

        System.out.println("nuovo numero 1: " + num5);
        System.out.println("nuovo numero 2: " + num4);



        scambio.close();
    }
}
