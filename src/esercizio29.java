import java.util.Scanner;

public class esercizio29 {
    public static void main(String[] args) {
        //for each per contare le vocali in una frase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci frase");
        String frase = scanner.nextLine();
        char[] array = frase.toCharArray();

        String vocali = "a,e,i,o,u";

        int count = 0;
        for(char lettere : array) {
            String voc = String.valueOf(lettere);
            if(vocali.contains(voc)) {
                count++;
            }
        }
        System.out.println("Le vocali sono: " + count);


    }
}
