import java.util.Scanner;

public class esercizio44 {
    public static String Password(int n) {
        final String caratteri = "abcdefghijklmnopqrstuwvxyzABCDEFGHIJKMLNOPQRSTUWVXYZ!£$%&!£$%&??##§§";
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * 68);
            arr[i] = caratteri.charAt(r);
        }
        return String.valueOf(arr);

    }

    public static void main(String[] args) {
        //PASSWORD

        Scanner scan = new Scanner(System.in);
        System.out.println("Lunghezza pasword");
        int lunghezza = scan.nextInt();

        String password = Password(lunghezza);
        System.out.println(password);

    }

}