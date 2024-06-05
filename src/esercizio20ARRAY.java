import java.util.Arrays;

public class esercizio20ARRAY {
    public static void main(String[] args) {
        int[][] matrice = new int[3][3];

        //int[][] matrice2 = {{1,2,3}, {4,5,6}, {7,8,9}};

        matrice[0][0] = 2;
        matrice[0][1] = 4;
        matrice[0][2] = 6;

        matrice[1][0] = 3;
        matrice[1][1] = 6;
        matrice[1][2] = 9;

        matrice[2][0] = 5;
        matrice[2][1] = 10;
        matrice[2][2] = 15;

        System.out.println(Arrays.toString(matrice[0]));
        System.out.println(Arrays.toString(matrice[1]));
        System.out.println(Arrays.toString(matrice[2]));
    }
}
