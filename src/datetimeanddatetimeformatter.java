import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class datetimeanddatetimeformatter {
    public static void main(String[]args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time =LocalTime.now();
        System.out.println(time);
        LocalDateTime datetime=LocalDateTime.now();
        System.out.println(datetime);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        String formatteddate=datetime.format(dtf);
        System.out.println(formatteddate);
    }
}
