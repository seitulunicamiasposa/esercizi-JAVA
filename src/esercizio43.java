import java.util.Scanner;

public class esercizio43 {
    public static int somma(int a, int b) {
        int somma = a+b;
        return somma;
    }
    public static int differenza(int a, int b) {
        int differenza = a-b;
        return differenza;
    }
    public static int prodotto(int a, int b) {
        int prodotto = a*b;
        return prodotto;
    }
    public static int divisione(int a, int b) {
        int divisione = a/b;
        return divisione;
    }
    public static int MCD(int a, int b) {
        int resto = 0;
        if(a > b) {
            resto = a%b;
        } else {
            resto = b%a;
        }

        if(resto == 0) {
            return b;
        }
        return MCD(b, resto);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi quale operazione fare");
        String operatore = scanner.nextLine();
        System.out.println("Inserisci numero 1");
        int a = scanner.nextInt();
        System.out.println("Inserisci numero 2");
        int b = scanner.nextInt();

        if(operatore.equals("somma")) {
            int somma = somma(a, b);
            System.out.println(somma);
        } else if (operatore.equals("differenza")) {
            int differenza = differenza(a, b);
            System.out.println(differenza);
        } else if (operatore.equals("prodotto")) {
            int prodotto = prodotto(a, b);
            System.out.println(prodotto);
        } else if (operatore.equals("divisione")) {
            int divisione = divisione(a, b);
            System.out.println(divisione);
        } else if (operatore.equals("MCD")) {
            int mcd = MCD(a, b);
            System.out.println(mcd);
        }

    }
}
