package Order_8.DataAndTimeAPIInJava8.JavaLocalTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeAPI {
    public static void main(String[] args) {

        //Getting the Current Date
        LocalTime today=LocalTime.now();
        System.out.println("Current Date= "+today);

        //Creating an object of LocalTime by providing input arguments
        LocalTime specifiedTime=LocalTime.of(12,20,25,40);
        System.out.println("Specified Time= "+specifiedTime);

        //Current time in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalTime todayIndia=LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST "+todayIndia );

        //Getting date from the base date i.e 09/09/2020
        LocalTime spcificSecondTime=LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time ="+spcificSecondTime);
    }
}
