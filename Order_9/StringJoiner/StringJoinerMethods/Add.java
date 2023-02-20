package Order_9.StringJoiner.StringJoinerMethods;

import java.util.StringJoiner;

public class Add {
    /**2. StringJoiner add(CharSequence newElement):
     - This method is used to add the given CharSequence in the StringJoiner object.
     - It adds the CharSequence value as the next element of the StringJoiner value.
     - If the given element is null it adds the “null”.
     - It returns the object of StringJoiner after adding the value.*/
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add("java").add("8").add("StringJoiner").add(null);
        System.out.println(stringJoiner);
    }
}
