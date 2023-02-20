package Order_9.StringJoiner.StringJoinerMethods;

import java.util.StringJoiner;

public class ToString {

    /**1. StringJoiner toString():
     - Every programmer knows the toString() method is defined in the Object class.
     - The StringJoiner class overrides it and provides its own implementation.
     - The toString() method returns the object of String type.
     - There may be a situation when you want to deal with the string objects rather than StringJoiner.
     - For example, if you want to compare the values of String then you need to convert StringJoiner to a String object.*/
    public static void main(String[] args) {
        String str = "StringJoiner is java8 feature";
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add("StringJoiner");
        stringJoiner.add("is");
        stringJoiner.add("java8");
        stringJoiner.add("feature");

        System.out.println("Are they equals: "+ str.equals(stringJoiner.toString()));
        System.out.println("Are they equals: "+ str.equals(stringJoiner));
    }
}
