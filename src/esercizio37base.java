import java.util.Scanner;

public class esercizio37base {
    public static void main(String[] args) {
        //creare una priamide di asterischi
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero");
        int num = scanner.nextInt();

        String asterisco = " ";
        for(int i = 1; i <= num; i++) {
            System.out.println(asterisco);
            asterisco += "* ";
        }
        System.out.println(asterisco);
    }
}
