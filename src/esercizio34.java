import java.util.Scanner;

public class esercizio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci parola");

        String parola = scanner.nextLine();

        String inverso = new StringBuilder(parola).reverse().toString();

        if(parola.equals(inverso)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Non palindromo");
        }

    }
}
