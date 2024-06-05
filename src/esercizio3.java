public class esercizio3 {
    public static void main(String[] args) {
        //da double a Double
        double primitivo = 2.5;
        Double wrapper = Double.valueOf(primitivo);
        System.out.println(wrapper);

        //da Double a double
        double secondoprimitivo = wrapper.doubleValue();
        System.out.println(secondoprimitivo);

    }
}
