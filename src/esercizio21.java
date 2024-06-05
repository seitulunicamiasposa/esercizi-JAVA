import java.util.Scanner;

public class esercizio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero");
        int num1 = scanner.nextInt();
        System.out.println("Inserisci numero");
        int num2 = scanner.nextInt();

        /*if(num1 == num2) {
            System.out.println("Sono uguali");
        } else {
            System.out.println("Sono diversi");
        }*/

        String response = num1 == num2 ? "sono uguali" : "sono diversi";
        System.out.println(response);


    }
}
