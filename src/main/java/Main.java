import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main{
    public static void main(String[] args) {
        LocalDateTime dateObj = LocalDateTime.now();
        System.out.println("Before formatting: "+dateObj);
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fromattedDate = dateObj.format(formatObj);
        System.out.println("After formatting : "+fromattedDate);
        LocalDate obj = LocalDate.now();
        LocalTime objTime = LocalTime.now();
        LocalDateTime objDateTime = LocalDateTime.now();
        System.out.println(obj);
        System.out.println(objTime);
        System.out.println(objDateTime);
    }

}