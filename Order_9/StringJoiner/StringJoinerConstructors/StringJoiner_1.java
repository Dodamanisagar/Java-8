package Order_9.StringJoiner.StringJoinerConstructors;

import java.util.StringJoiner;

public class StringJoiner_1 {
    public static void main(String[] args) {
        StringJoiner string = new StringJoiner(",");
        string.add("Hi");
        string.add("All");
        string.add("This");
        string.add("is");
        string.add("Sagar");
        System.out.println("String by StringJoiner: "+ string);
    }
}
