import java.util.Scanner;

public class esercizio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
