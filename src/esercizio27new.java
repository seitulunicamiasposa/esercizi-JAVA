
import java.util.Scanner;

public class esercizio27new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String string1 = scanner.nextLine();
        String[] stop = {"stop", "Stop", "STOP"};
        while (!(string1.equals(stop[0]) || string1.equals(stop[1]) || string1.equals(stop[2]))) {
            System.out.println("Inserisci una stringa");
            string1 = scanner.nextLine();
        }
    }
}
