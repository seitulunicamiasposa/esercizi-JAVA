import java.util.Scanner;

public class esercizio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero di cui calcolare il fattoriale");
        int num = scanner.nextInt();
        int fattoriale = 1;

        for(int i = 1; i <= num; i++) {
            System.out.println(i);
            fattoriale *= i;
        }
        System.out.println(fattoriale);
    }
}


