import java.util.Scanner;

public class esercizio12 {
    public static void main(String[] args) {
            Scanner scambio = new Scanner(System.in);

            System.out.print("inserisci numero 1: ");
            double num1 = scambio.nextDouble();

            System.out.print("Inserisci numero 2: ");
            double num2 = scambio.nextDouble();

            num1 = num1+num2;
            num2 = num1-num2;
            num1 = num1-num2;

            System.out.println("nuovo numero 1: " + num1);
            System.out.println("nuovo numero 2: " + num2);



            scambio.close();
    }
}
