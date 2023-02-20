package Order_8.DataAndTimeAPIInJava8;

public class About {
    /**Why do we need new Java Date Time API?
     - Let’s discuss some problems that came before Java 8:
     1. - The Java Date Time classes are not defined consistently, there are two classes to get the date one presented in java.util and another is presented in java.sql packages.
        - The date class of java.util package is human-readable and the date class of java.sql packages is used to save in the database.
        - Both classes have the same name, so it creates confusion. Another issue is formatting, and parsing classes are defined in java.text package.
     2. - The Date class of java.util package contains both date and time.
        - So, when we get the only date it's unnecessary to show the time also.
        - Where the date class of java.sql contains the only date.
        - It seems a bad API design because both the classes have the same name.
     3. - Another issue is formatting and parsing because for time, timestamp, formatting and parsing classes are not defined.
        - We have java.text.DateFormat class for parsing and formatting those are again defined in different packages.
        - Usually SimpleDateFormat class is used for parsing and formatting.
     4. - The biggest problem is thread safety. All the Date classes are not thread-safe because they are mutable.
     5. - The date class doesn’t provide internationalization, there is no time zone support.
        - The java.util.Calendar and java.util.TimeZone classes were introduced but they have also problems


     *Java 8 Date and time implementation:-
     1. Java 8 provides all the classes with thread safety. Because all classes in the new Date Time API are immutable
     2. Java 8 has separated classes for date and time, TimeStamp, TimeZone etc . Now there is no confusion in human-readable date time and machine time.
     3. Now the methods and their purpose are clearly defined and perform the same action in all the classes.
     4. All the new Date Time API classes have methods that can perform common tasks, like plus, minus, format, parsing, etc.

     *Java 8 Date Time API Examples
     1. Java LocalDate:-
     - In java LocalDate class exists in java.time package and it is an immutable class.
     - This class represents Date with the default format of yyyy-MM-dd.
     1. We can get the current date by of now() method and it will return the current system date in yyyy-MM-dd format.
     2. We can create an object of LocalDate by use of  input string.
     3. We can get the date in a specific time zone by the use of now() method because the now method is overloaded.
      - We can pass the zoneId and get the date.
      - This class provides the same functionality as java.sql.Date.

     2. Java LocalTime:-
     - The LocalTime class is also defined in java.time package.
     - It is an immutable class that is used to represent a time in the human-readable format.
     - This class returns the hh:mm:ss.zzz format and it is the default format.
     1. To get the current time we can use the now() method and it returns the current system time in hh:mm:ss.zzz format.
     2. By use of input string we can create an instance of LocalTime class.
     3. We can get the time according to the specific time zone. We can use the overloaded now() method.

     3. java LocalDateTime:-
     - The java LocalDateTime class is an immutable class that is used to represent date and time.
     - The default format of date and time is yyyy-MM-dd-HH-mm-ss.zzz.
     - This has a factory method that takes LocalDate and LocalTime input arguments to create a LocalDateTime instance.
     1. We can get the current date and time by use of the now() method and it returns the current system date and time in yyyy-MM-dd-HH-mm-ss.zzz format.
       - We can use the factory method to get Date and time by use of  LocalDate and LocalTime as input.
     2. We can get the current Date and time by use of input string.
     3. By use of specified time zone we can get the Date and time.

     4. Java instant:-
     - The Instant class represents the machine-readable time format. It stores date and time in unix timestamp.


     * */
}

