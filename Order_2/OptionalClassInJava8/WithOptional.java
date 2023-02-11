package Order_2.OptionalClassInJava8;

import java.util.Optional;

public class WithOptional {
    public static void main(String[] args)
    {
        String s = "";
        String s1 = "Hello";

        Optional<String> objOfOptional = Optional.of(s);
        // Return true if it contain non-null value else false
        System.out.println(objOfOptional.isPresent());

        Optional<String> objOfOptional1 = Optional.of(s1);
        // Return true if it contain non-null value else false
        System.out.println(objOfOptional1.isPresent());
    }
}
