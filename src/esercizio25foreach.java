public class esercizio25foreach {
    public static void main(String[] args) {
        //FOR EACH: somma tra loro degli elementi di un array
        double[] numeri = {1, 2, 3};
        double tot = 0;
        for (double numero : numeri) {
            tot = tot + numero;
        }
        System.out.println(tot);
    }
}
