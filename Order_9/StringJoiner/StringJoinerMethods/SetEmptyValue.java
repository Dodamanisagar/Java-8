package Order_9.StringJoiner.StringJoinerMethods;

import java.util.StringJoiner;

public class SetEmptyValue {
    public static void main(String[] args) {
        /**5. StringJoiner setEmptyValue(CharSequence emptyValue):
         - This method is used to set the string representation when no one string is added an object.*/
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.setEmptyValue("No string added yet");
        System.out.println("StringJoiner object after creation:"+ stringJoiner);
        stringJoiner.add("Learning");
        stringJoiner.add("java 8");
        stringJoiner.add("feature");
        System.out.println("StringJoiner object after added string:"+ stringJoiner);
    }
}
