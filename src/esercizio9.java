import java.util.Scanner;

public class esercizio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la password: ");
        String password = scanner.nextLine();

        int lunghezza = password.length();
        String asterischi = "*".repeat(lunghezza);
        System.out.printf(asterischi);

       /*prima alternativa: String passwordnascosta = password.replaceAll(".", "*");
          System.out.printf(passwordnascosta);
        */

        /*seconda alternativa: for (int i = 0; i<password.length(); i++) {
            System.out.printf("*");*/
        }
    }

