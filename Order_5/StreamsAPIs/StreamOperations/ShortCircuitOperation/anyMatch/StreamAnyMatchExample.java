package Order_5.StreamsAPIs.StreamOperations.ShortCircuitOperation.anyMatch;
import java.util.ArrayList;
import java.util.List;

public class StreamAnyMatchExample {
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

        boolean matchedResult=memberNames.stream().anyMatch((s)->s.startsWith("A"));//true
        System.out.println(matchedResult);

        matchedResult=memberNames.stream().allMatch((s)->s.startsWith("A"));//false
        System.out.println(matchedResult);

        matchedResult=memberNames.stream().noneMatch((s)->s.startsWith("A"));//false
        System.out.println(matchedResult);
    }
}
