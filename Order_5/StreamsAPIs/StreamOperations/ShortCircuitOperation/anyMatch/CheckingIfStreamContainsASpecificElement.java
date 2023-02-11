package Order_5.StreamsAPIs.StreamOperations.ShortCircuitOperation.anyMatch;

import java.util.stream.Stream;

public class CheckingIfStreamContainsASpecificElement {
    /**we are using the anyMatch() method to check if the stream contains the string "four".
     * As we see that the stream contains the string, so the output of the example is true.*/
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four");

        boolean match = stream.anyMatch(s -> s.contains("four"));

        System.out.println(match);
    }
}
