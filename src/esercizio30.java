import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class esercizio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero 1");
        int num1 = scanner.nextInt();
        System.out.println("Inserisci numero 2");
        int num2 = scanner.nextInt();
        System.out.println("Inserisci numero 3");
        int num3 = scanner.nextInt();

        int[] array = {num1, num2, num3};

        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);

        }
    }
}
