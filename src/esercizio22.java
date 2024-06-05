import java.util.Scanner;

public class esercizio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero");
        int num = scanner.nextInt();

    /*if(num % 2 == 0 && num <=100 && num > 0) {
        System.out.println("è pari e piccolo");
        } else {
        System.out.println("non è pari e piccolo");
        }*/

    String response = num % 2 == 0 && num <=100 && num > 0 ? "è pari e piccolo" : "non è pari e piccolo";
    System.out.println(response);
    }
}
