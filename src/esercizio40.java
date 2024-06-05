import java.util.Scanner;

public class esercizio40 {
    public static boolean isPari(int num) {
         if(num % 2 == 0) {
             return true;
         } else {
             return false;
         }
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci il numero");
            int num = scanner.nextInt();

            boolean paridispari = isPari(num);
            if(paridispari == true){
                System.out.println("Pari");
            } else {
                System.out.println("Dispari");
            }
    }
}
