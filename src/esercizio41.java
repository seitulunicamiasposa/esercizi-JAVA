import java.util.Scanner;

public class esercizio41 {
    public static int trovaMassimo(int a, int b) {
        int massimo = Math.max(a, b);
        return massimo;

    }
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Inserisci il primo numero");
int a = scanner.nextInt();
System.out.println("Inserisci il secondo numero");
int b = scanner.nextInt();

int numeromassimo = trovaMassimo(a, b);

System.out.println("Il numero maggiore è: " + numeromassimo);
    }
}
