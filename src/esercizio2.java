import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("inserisci lunghezza rettangolo: ");
        double lunghezza = scanner2.nextDouble();

        System.out.print("Inserisci larghezza rettangolo: ");
        double larghezza = scanner2.nextDouble();

        double arearett = lunghezza * larghezza;
        System.out.print("l'area del rettangolo è: " + arearett);

        scanner2.close();
    }
}
