import java.util.Random;
import java.util.Scanner;

public class esercizio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza della matrice");
        int n = scanner.nextInt(); //input

        Random ran = new Random(); //oggetto random

        int[][] matrix = new int[n][n]; //definizione matrice

        //popolamento della matrice da 0 a 9 con numeri casuali
        System.out.println("Matrice:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ran.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sommamassimaRiga = 0; //inizializzazione riga con somma massima
        int sommamassimaColonna = 0; //inizializzazione colonna con somma massima
        int indiceRigamassima = -1;
        int indiceColonnamassima = -1;

        //calcolo somma massima per ogni riga e colonna
        for (int i = 0; i < n; i++) {
            int sommaRiga = 0;
            int sommaColonna = 0;
            for (int j = 0; j < n; j++) {
                sommaRiga += matrix[i][j];
                sommaColonna += matrix[j][i];
            }

            //confronto la somma della riga con la somma massima trovata
            if(sommaRiga > sommamassimaRiga){
                sommamassimaRiga = sommaRiga;
                indiceRigamassima = i;
            }

            //confronto la somma della colonna con la somma massima trovata
            if(sommaColonna > sommamassimaColonna) {
                sommamassimaColonna = sommaColonna;
                indiceColonnamassima = i; //i è uguale a j, essendo una matrice nxn. Quindi posso usare i al suo posto, dato che j è solo nello scope del for
            }
        }
      System.out.println("la riga con la somma massima è " + (indiceRigamassima + 1) + ": " + sommamassimaRiga);
      System.out.print("la colonna con la somma massima è " + (indiceColonnamassima + 1) + ": " + sommamassimaColonna);

    }
    }

