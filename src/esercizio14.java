import java.util.Scanner;

public class esercizio14 {
    public static void main(String[] args) {
        Scanner confronto = new Scanner(System.in);

        System.out.print("inserisci la prima stringa: ");
        String a = confronto.nextLine();

        System.out.println("inserisci la seconda: ");
        String b = confronto.nextLine();

        boolean c = a.equals(b);
        System.out.println(c);

    }
}
