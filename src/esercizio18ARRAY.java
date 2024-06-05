import java.util.Arrays;
import java.util.Scanner;

public class esercizio18ARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrice = new int[3][31]; //qui gli dico dimensione e numero di elementi di ciascuna
        int[][] mesi = {{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28},
                {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
                };

        int[][] mesi2 = {{28}, {29}};

        int[] febbraio29 = {1,2,3,4,5,6,78,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
        System.out.println("L'anno è bisestile?");
        boolean bisestile = scanner.nextBoolean();
        System.out.println("Gennaio ha: " + Arrays.toString(mesi[0]));
        if(bisestile == true) {
            System.out.println("Febbraio ha: " + Arrays.toString(mesi2[1]));
            System.out.println(Arrays.toString(febbraio29));
        } else {
            System.out.println("Febbraio ha: " + Arrays.toString(mesi2[0]));
            System.out.println(Arrays.toString(mesi[1]));
        }

        System.out.println("Marzo ha: " + Arrays.toString(mesi[0]));
        System.out.println("Aprile ha: " + Arrays.toString(mesi[1]));
        System.out.println("Maggio ha: " + Arrays.toString(mesi[2]));
        System.out.println("Giugno ha: " + Arrays.toString(mesi[2]));
        System.out.println("Luglio ha: " + Arrays.toString(mesi[0]));
        System.out.println("Agosto ha: " + Arrays.toString(mesi[0]));
        System.out.println("Settembre ha: " + Arrays.toString(mesi[2]));
        System.out.println("Ottobre ha: " + Arrays.toString(mesi[0]));
        System.out.println("Novembre ha: " + Arrays.toString(mesi[2]));
        System.out.println("Dicembre ha: " + Arrays.toString(mesi[0]));

        //ALTERNATIVA\\
        //
        //        System.out.println("Gennaio ha: " + Arrays.toString(mesi[2]));
        //        System.out.println("Febbraio ha: " + Arrays.toString(mesi[0]));
        //        System.out.println("Marzo ha: " + Arrays.toString(mesi[2]));
        //        System.out.println("Aprile ha: " + Arrays.toString(mesi[1]));
        //        System.out.println("Maggio ha: " + Arrays.toString(mesi[2]));
        //        System.out.println("Giugno ha: " + Arrays.toString(mesi[1]));
        //        System.out.println("Luglio ha: " + Arrays.toString(mesi[2]));
        //        System.out.println("Agosto ha: " + Arrays.toString(mesi[2]));
        //        System.out.println("Settembre ha: " + Arrays.toString(mesi[1]));
        //        System.out.println("Ottobre ha: " + Arrays.toString(mesi[2]));
        //        System.out.println("Novembre ha: " + Arrays.toString(mesi[1]));
        //        System.out.println("Dicembre ha: " + Arrays.toString(mesi[2]));
    }
}
