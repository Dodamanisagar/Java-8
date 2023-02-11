package Order_2.OptionalClassInJava8;

public class AboutOptionalClass {
    /**What is the Optional class in Java 8?
     -->In Java 8, a new class was introduced which is an Optional class.
     -->The optional class is the final class that is present in java.util package.
     -->This class helps the programmer to write better code and avoid the use of null checks.

     *Let’s understand it in brief:-
     -->Every programmer knows about the NullPointerException in Java.
     -->Many of us must have encountered it.
     -->The NullPointerException exception occurs only when the programmer tries to use an object reference that doesn’t point to any instance.
     -->There is the various reason if the object doesn’t point to any instance,  maybe it is not initialized, or it initialized with null.
     -->It is not an easy job to avoid null without using too many null checks.

     *The solution is given by Java 8:-
     -->To resolve this problem Java 8, introduce a new class Optional class.
     -->The Optional class provides various methods to check the value of the object.
     -->The programmer can specify the alternate value to return.
     -->It makes the code in readable form and the programmer doesn’t need to specify the null check.

     *How to use the Optional class?
     Syntax:-
     public final class Optional<T> {
     /**
     * Common instance for {@code empty()
     }
     -->Optional is a generic class in java, so you must specify the type of data that can it hold.
     -->The Optional class provides a way, to replace the null reference of T Type with a non-null value.
     -->You can directly check whether the reference is present or absent.
     -->Because the Optional class either contains any non-null value or nothing.
     */
}
