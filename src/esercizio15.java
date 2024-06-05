import java.util.Scanner;

public class esercizio15 {
    public static void main(String[] args) {
        Scanner incrdecr = new Scanner(System.in);

        System.out.print("inserisci il primo numero: ");
        double num1 = incrdecr.nextDouble();

        System.out.println("inserisci il secondo numero: ");
        double num2 = incrdecr.nextDouble();

        double num3 = ++num1;
        System.out.println("incremento primo numero: " + num3);
        double num4 = ++num2;
        System.out.println("incremento secondo numero: " + num4);

        double num5 = --num1;
        System.out.println("decremento primo numero: " + num5);
        double num6 = --num2;
        System.out.println("decremento secondo numero: " + num6);
        incrdecr.close();
    }
}
