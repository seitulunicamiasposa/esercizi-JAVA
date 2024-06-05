import java.util.Arrays;

public class esercizio32 {
    public static void main(String[] args) {

        int[][] tavola = new int[10][10];

        for (int i=0 ; i<tavola.length ; i++) {
            for (int j=0 ; j<tavola[i].length ; j++) {
                tavola[i][j] = (i + 1) * (j + 1);
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.print("\n tabellina del " + (i + 1) + "\n");
            for(int j = 0; j < 10; j++) {
                System.out.print(tavola[i][j]+ " ");
        }
            System.out.print("\n");
    }

    }
}
