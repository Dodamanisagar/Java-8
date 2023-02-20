package Order_9.StringJoiner.StringJoinerMethods;

import java.util.StringJoiner;

public class Length {
    public static void main(String[] args) {
        /** 4. StringJoiner length() :
         - This method returns the length of the String that returned by StringJoiner.*/
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Java");
        stringJoiner.add("8");
        stringJoiner.add("feature");
        System.out.println("Length: "+ stringJoiner.length());
    }
}
