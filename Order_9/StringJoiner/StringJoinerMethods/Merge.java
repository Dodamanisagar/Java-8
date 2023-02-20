package Order_9.StringJoiner.StringJoinerMethods;

import java.util.StringJoiner;

public class Merge {
    /**3. StringJoiner merge(StringJoiner other):
     - The method is used to add two or more StringJoiner.
     - It appends the specified StringJoiner at the end of the first StringJoiner.
     - If the given StringJoiner is empty, the call has no effect.
     - If the first StringJoiner and the second have a different delimiter then elements from the second StringJoiner are concatenated with that delimiter.*/
    public static void main(String[] args) {
        StringJoiner stringJoiner1 = new StringJoiner(",");
        stringJoiner1.add("Java");
        stringJoiner1.add("8");
        stringJoiner1.add("feature");

        StringJoiner stringJoiner2 = new StringJoiner(" ");
        stringJoiner2.add("StringJoiner");
        stringJoiner2.add("and its");
        stringJoiner2.add("Constructors");

        System.out.println(stringJoiner1.merge(stringJoiner2));
    }
}
