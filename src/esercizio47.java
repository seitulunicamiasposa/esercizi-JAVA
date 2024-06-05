import java.util.Scanner;

public class esercizio47 {
    public static void pianeta(String a, double b) {
        if(a.equals("MERCURIO")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
        if(a.equals("VENERE")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
        if(a.equals("URANO")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
        if(a.equals("MARTE")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
        if(a.equals("GIOVE")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
        if(a.equals("SATURNO")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
        if(a.equals("NETTUNO")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
        if(a.equals("PLUTONE")) {
            Pianeta pianeta = Pianeta.valueOf(a);

            int raggioseconda = (pianeta.raggio*pianeta.raggio);
            System.out.println(raggioseconda);

            double gravita = pianeta.massa/(double) raggioseconda;
            System.out.println(gravita);

            double peso = b/gravita;
            System.out.println(peso);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il pianeta");
        String pianeta = scanner.nextLine();
        System.out.println("Inserisci un peso");
        double peso = scanner.nextInt();

        pianeta(pianeta, peso);
    }
}
