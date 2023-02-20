package Order_9.StringJoiner;

public class About {
    /**StringJoiner in java:-
     -StringJoiner in java is introduced in java 8, and it is a final class that exists in java.util package.
     -The StringJoiner class provides an easy way to create a String by joining the multiple strings by a delimiter.
     -We can also provide prefix and suffix to the string.
     -The prefix and suffix are optionally, and we can ignore them also.

     *Need of StringJoiner class:-
     - In java String literal or object is mostly used in every program.
     - Java provides three classes to handle the strings those are String, StringBuffer, StringBuilder.
     - But there are few things that are incomplete without StringJoiner class.
     - You might face a problem when you want to join multiple strings and separate them with a delimiter.
     - In these types of situations, you need to do manual code to join each string with the delimiter.
     - Because Java didn’t provide any way to join strings, so we write the loop structure and join all the strings.
     - This solution works, but we need to be careful because we don’t need a delimiter before the first element and after the last element.
     - Every developer faces this type of issue in coding. So, it is a very common requirement for developers.
     - Since Java 8, this issue has been resolved because StringJoiner class removed the headache of the string joining concept.
     - Java 8 provides some ways to join the string, we can use the join() method of String or by use of java StringJoiner class.

     *How to use the StringJoiner in Java?:-
     - There are two constructors that are used to create a String by use of multiple strings.
     1. StringJoiner(CharSequence delimiter)
        - This constructor creates an empty object of StringJoiner with a given delimiter.
        - It takes only one parameter which will be the delimiter of strings.
        - The given delimiter will not be added at the beginning and end of the string.
        - It will throw NullPointerException, if a given delimiter is null.

     2. StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
        - This constructor constructs an empty object of StringJoiner with no characters in it using copies of the supplied given prefix, delimiter and suffix.
        - If there is no string added to the object it will contain the prefix and suffix in the object.
        - It throws NullPointerException, if the delimiter, prefix or suffix is null.
        - It takes three parameters those are delimiter, prefix and suffix.
        - The delimiter is used between each string added to the StringJoiner.
        - The prefix added at the beginning and the suffix added at the end.

     *Methods of StringJoiner:-
     - There are a few methods used to handle the object of StringJoiner.
     - Here we will discuss each method with an example to see how the method works in java string join.
     1. StringJoiner toString():
        - Every programmer knows the toString() method is defined in the Object class.
        - The StringJoiner class overrides it and provides its own implementation.
        - The toString() method returns the object of String type.
        - There may be a situation when you want to deal with the string objects rather than StringJoiner.
        - For example, if you want to compare the values of String then you need to convert StringJoiner to a String object.

     2. StringJoiner add(CharSequence newElement):
        - This method is used to add the given CharSequence in the StringJoiner object.
        - It adds the CharSequence value as the next element of the StringJoiner value.
        - If the given element is null it adds the “null”.
        - It returns the object of StringJoiner after adding the value.

     3. StringJoiner merge(StringJoiner other):
        - The method is used to add two or more StringJoiner.
        - It appends the specified StringJoiner at the end of the first StringJoiner.
        - If the given StringJoiner is empty, the call has no effect.
        - If the first StringJoiner and the second have a different delimiter then elements from the second StringJoiner are concatenated with that delimiter.

     4. StringJoiner length() :
        - This method returns the length of the String that returned by StringJoiner.

     5. StringJoiner setEmptyValue(CharSequence emptyValue):
        - This method is used to set the string representation when no one string is added an object.
     */
}
