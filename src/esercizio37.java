import java.util.Scanner;

public class esercizio37 {
    public static void main(String[] args) {
        //triangolo asterischi dove quelli di lunghezza pari vengono saltati
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero");
        int num = scanner.nextInt();


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                //System.out.print(asterisco);
                //asterisco += "*";
                continue;
            }
            String asterisco = " ";
            for (int j = 1; j <= i; j++) {
                asterisco += "* ";
            }
            System.out.println(asterisco);
        }
    }
}

