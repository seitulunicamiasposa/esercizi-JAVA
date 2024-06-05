public class esercizio24cicli {
    public static void main(String[] args) {
        //FOR
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //WHILE
        int count = 0;
        while (count <= 10) {
            System.out.println(count++);
        }
        //DO WHILE
        int count2 = 0;
        do {
            System.out.println(count2++);
        } while (count2 <= 10);

        //FOR EACH
        int[] numeri = {1,2,3,4,5,6,7,8,9,10};
        for(int numero : numeri) {
            System.out.println(numero);
        }
    }
}
