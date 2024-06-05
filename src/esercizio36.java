import java.util.Random;
import java.util.Scanner;

public class esercizio36 {
    public static void main(String[] args) {
        Random random = new Random();

        //crea un array di 10 elementi
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100); //genera un numero casuale
        }

        System.out.println("Array:");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale numero vuoi cercare?");
        int num = scanner.nextInt(); //input

        //Ricerca
        boolean trovato = false;
        for (int i = 0; i < 10; i++) {
            if (array[i] == num) {
                trovato = true;
                break;
            }
        }
        if (!trovato) {
            System.out.println("Il numero non è presente");
        }else {
            System.out.println("Il numero è presente");
        }
    }
}
