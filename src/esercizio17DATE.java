import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class esercizio17DATE {
    public static void main(String[] args) throws ParseException {
        String dateS = "2020/01/02 09:15:10";

        //Date\\
        SimpleDateFormat dataV = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //prima rispetto il suo formato
        SimpleDateFormat dataF = new SimpleDateFormat("dd/MM/yyyy HH:mm"); //poi do il formato in cui voglio cambiare la data

        Date data1 = dataV.parse(dateS);
        System.out.println(dataF.format(data1));

        //LocalDate\\
        DateTimeFormatter dateV = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dateF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data2 = LocalDate.parse(dateS, dateV);
        System.out.println(dateF.format(data2));

        //LocalDateTime\\
        DateTimeFormatter datV = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter datF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime data3 = LocalDateTime.parse(dateS, datV);
        System.out.println(datF.format(data3));

    }
}
