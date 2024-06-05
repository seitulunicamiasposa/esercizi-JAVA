import java.util.Scanner;

public class esercizio27while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String string1 = scanner.nextLine();
        String stop = "STOP";
      while (!(string1.equals(stop))) {
          System.out.println("Inserisci una stringa");
          string1 = scanner.nextLine();
      }
    }
}
