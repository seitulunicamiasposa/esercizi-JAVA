import java.util.Scanner;

public class esercizio46 {
    public static void giornoNum(String a) {
        if(a.equals("LUNEDI")) {
            GiornoSettimana giorno = GiornoSettimana.valueOf(a);
            System.out.println(giorno.numeroSett);
        } else if (a.equals("MARTEDI")) {
            GiornoSettimana giorno = GiornoSettimana.valueOf(a);
            System.out.println(giorno.numeroSett);
        } else if (a.equals("MERCOLEDI")) {
            GiornoSettimana giorno = GiornoSettimana.valueOf(a);
            System.out.println(giorno.numeroSett);
        } else if (a.equals("GIOVEDI")) {
            GiornoSettimana giorno = GiornoSettimana.valueOf(a);
            System.out.println(giorno.numeroSett);
        } else if (a.equals("VENERDI")) {
            GiornoSettimana giorno = GiornoSettimana.valueOf(a);
            System.out.println(giorno.numeroSett);
        } else if (a.equals("SABATO")) {
            GiornoSettimana giorno = GiornoSettimana.valueOf(a);
            System.out.println(giorno.numeroSett);
        } else if (a.equals("DOMENICA")) {
            GiornoSettimana giorno = GiornoSettimana.valueOf(a);
            System.out.println(giorno.numeroSett);
        }

    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Inserisci il giorno");
         String giorno = scanner.nextLine();

         giornoNum(giorno);
    }
}
