import java.util.Scanner;

public class esercizio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.printf("Quante età vuoi inserire?");
int numero = scanner.nextInt();
long min = Long.MAX_VALUE;
int max = 0;
int somma = 0;
for(int i=0; i<numero; i++) {
    System.out.printf("Scrivi età: ");
    int età = scanner.nextInt();
    min = Math.min(età, min);
    max = Math.max(età, max);
    somma = (età+somma);
}
System.out.printf("Il più giovane è: " + min + "\n");
System.out.printf("Il più grande è: " + max + "\n");
double media = somma/numero;
System.out.printf("lA MEDIA è: " + media);

        scanner.close();
    }
}
