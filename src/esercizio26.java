import java.util.Scanner;

public class esercizio26 {
    public static void main(String[] args) {
        //FOR EACH SOMMA E MEDIA ELEMENTI ARRAY + minimo e massimo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero 1");
        int a = scanner.nextInt();
        System.out.println("Inserisci numero 2");
        int b = scanner.nextInt();
        System.out.println("Inserisci numero 3");
        int c = scanner.nextInt();
        System.out.println("Inserisci numero 4");
        int d = scanner.nextInt();

        int[] numeri = {a, b, c, d};
        long min = Long.MAX_VALUE;
        int max = 0;
        int tot = 0;
        for(int numero:numeri) {
            tot = tot + numero;
            min = Math.min(numero, min);
            max = Math.max(numero, max);
        }
        double media = (double) tot / numeri.length;
        System.out.println("La media è: " + media);
        System.out.printf("Il più piccolo è: " + min + "\n");
        System.out.printf("Il più grande è: " + max + "\n");
    }
}
