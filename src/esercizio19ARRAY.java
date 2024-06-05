import java.util.Arrays;

public class esercizio19ARRAY {
    public static void main(String[] args) {
        double[] array = new double[5];

        double[] arrayInt = {5, 10, 25, 2, 44};

        arrayInt[0] = arrayInt[0] * 2.5;
        arrayInt[1] = arrayInt[1] * 2.5;
        arrayInt[2] = arrayInt[2] * 2.5;
        arrayInt[3] = arrayInt[3] * 2.5;
        arrayInt[4] = arrayInt[4] * 2.5;

        System.out.println(Arrays.toString(arrayInt));
    }
}
