import java.util.Scanner;

public class esercizio42 {
    public static boolean isPalindroma(String parola) {
        String inverso = new StringBuilder(parola).reverse().toString();

        if(parola.equals(inverso)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci parola");
        String parola = scanner.nextLine();

        boolean palindromo = isPalindroma(parola);
        if(palindromo == true) {
            System.out.println("palindromo");
        } else {
            System.out.println("non palindromo");
        }


    }
}
