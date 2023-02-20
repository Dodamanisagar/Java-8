package Order_8.DataAndTimeAPIInJava8.JavaInstant;

import java.time.Duration;
import java.time.Instant;

public class InstantApi {
    public static void main(String[] args)
    {
        //Get Current timestamp
        Instant dateTimestamp = Instant.now();
        System.out.println("Current Timestamp = "+dateTimestamp);

        //Instant from timestamp
        Instant specificTime = Instant.ofEpochMilli(dateTimestamp.toEpochMilli());
        System.out.println("Specific Time = "+specificTime);

        //Duration example
        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);
    }
}
