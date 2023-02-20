package Order_8.DataAndTimeAPIInJava8.javaLocalDateTime;

import java.time.*;

public class LocalDateTimeApi {
    public static void main(String[] args)
    {
        //Get the Current Date and Time
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current DateTime="+today);

        //Get the Current Date using LocalDate and LocalTime
        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Current DateTime="+today);

        //Creating LocalDateTime by providing input arguments
        LocalDateTime specificDateTime = LocalDateTime.of(2020, Month.APRIL, 30, 10, 10, 30);
        System.out.println("Specific Date="+specificDateTime);

        LocalDateTime currentDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date and Time in IST="+currentDateTime);

        //Getting date from the base date i.e 01/01/1970
        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
        System.out.println("10000th second time from 01/01/1970= "+dateFromBase);
    }
}
