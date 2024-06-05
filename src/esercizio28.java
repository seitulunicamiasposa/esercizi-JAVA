import java.util.Scanner;

public class esercizio28 {
    public static void main(String[] args) {
        //conta quante volte la lettera è nella frase
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci frase");
        String frase = scanner.nextLine();
        char[] array = frase.toCharArray();

        System.out.println("Quale lettera vuoi contare?");
        String lettera = scanner.nextLine();

        int count = 0;
        for(char lettere : array) {
            String lett = String.valueOf(lettere);
            if(lettera.contains(lett)) {
                count++;
            }
        }
       System.out.println("la lettera" + " " + lettera + " " + "è contenuta: " + count);

    }
}


