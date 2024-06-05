import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello Antonio!");
        System.out.println("Hello Manuel!");
        System.out.println("Hello Carelli!");

        /*for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/

        int età = 26;
        double altezza = 1.69;
        boolean gay = false;
        char lettera = 'a';
        String name = "Antonio";
        String prename = "Carelli";

        System.out.println("name:" + name);
        System.out.println("età: " + età);
        System.out.printf("altezza: " + altezza + "\n");
        System.out.println("gay? " + gay);
        System.out.println("lettera: " + lettera);

        System.out.printf("prename: " + prename + "\netà:" + età + "\naltezza: " + altezza + "\ngay? " + gay + "\nlettera: " + lettera + "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci saluto: ");
        String saluto = scanner.nextLine();

        System.out.println("Inserisci numero: ");
        int num = scanner.nextInt();

        System.out.println("Inserisci decimale: ");
        double dec = scanner.nextDouble();

        System.out.println("Inserisci booleano: ");
        boolean truefalse = scanner.nextBoolean();

        System.out.println("il saluto è: " + saluto);
        System.out.println("il numero è: " + num);
        System.out.println("il decimale è: " + dec);
        System.out.println("il booleano è: " + truefalse);
        scanner.close();


    }
}