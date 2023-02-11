package Order_5.StreamsAPIs.StreamOperations.IntermediateOperations.Sorted;
import java.util.ArrayList;
import java.util.List;

public class StreamSorted {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);//sorting and converting to the uppercase characters
    }
}
