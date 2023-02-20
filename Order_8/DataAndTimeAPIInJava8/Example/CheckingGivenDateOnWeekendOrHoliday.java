package Order_8.DataAndTimeAPIInJava8.Example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CheckingGivenDateOnWeekendOrHoliday {
    public static void main(String[] args) {
        LocalDate specifiedDate=LocalDate.of(2022, Month.FEBRUARY,27);
        DayOfWeek day=specifiedDate.getDayOfWeek();//gets the day of the week as integer

        if(day.equals(DayOfWeek.SUNDAY))
            System.out.println("It is sunday");
        else
            System.out.println("It is not sunday");
    }
}
