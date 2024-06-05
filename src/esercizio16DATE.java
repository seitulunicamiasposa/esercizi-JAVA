import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class esercizio16DATE {
    public static void main(String[] args) throws ParseException {
        Date data = new Date();
        System.out.println(data);

        Date data2 = new Date();
        SimpleDateFormat dataF = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(dataF.format(data2));

        String dataS = "1998/03/12";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date data3 = dateFormat.parse(dataS);
        System.out.println(data3);

        LocalDate data4 = LocalDate.now();
        System.out.println(data4);

       String dateS = "1998/03/12";
        DateTimeFormatter dateF = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate data5 = LocalDate.parse(dateS, dateF);
        System.out.println(data5);
    }
}
