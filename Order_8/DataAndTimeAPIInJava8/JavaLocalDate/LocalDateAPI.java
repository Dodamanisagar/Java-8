package Order_8.DataAndTimeAPIInJava8.JavaLocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateAPI {
    public static void main(String[] args) {

        //Getting the current Date
        LocalDate today=LocalDate.now();
        System.out.println("current Date= "+today);

        //Creating an object of LocalDate by providing input arguments
        LocalDate specifiedDate=LocalDate.of(2023, Month.FEBRUARY,27);
        System.out.println("Specified Date= "+specifiedDate);

        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayIndia=LocalDate.now(ZoneId.of("Asia/Kolkata"));//passed zone is case-sensitive
        System.out.println("Current Date in IST= "+todayIndia);

        //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase=LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= "+dateFromBase);

        LocalDate hundresDay2023=LocalDate.ofYearDay(2023,100);
        System.out.println("100th day of 2023="+hundresDay2023);
    }
}
