import java.util.Scanner;

public class esercizio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il tuo voto: ");
        int voto = scanner.nextInt();


        System.out.print("Inserisci il punteggio massimo: ");
        int massimo = scanner.nextInt();

        double percentuale = (double)voto*100/(double)massimo;
        System.out.println("la percentuale è: " + percentuale);

        scanner.close();
    }
}
