public class esercizio31 {
    public static void main(String[] args) {
        int cento = 100;

        for(int i = 0; i <= cento; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": multiplo di 3 e 5");
            } else if (i % 3 == 0) {
                System.out.println(i + ": multiplo di 3");
            } else if (i % 5 == 0) {
                System.out.println(i + ": multiplo di 5");
            } else {
                System.out.println(i);
            }
        }
    }
}
