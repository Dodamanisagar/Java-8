package Order_1.Functional_Interface.PredicateInJava8;

 class AboutPredicateInterFace {
    /**1. What is the Predicate in Java?
     --->In Java 8 Predicate interface is defined in the java.util.function package.
     --->It contains one abstract method that is called test() method.
     --->This interface provides functionality to test/evaluate any condition.
     --->This interface is used in a lambda expression and method reference to evaluate the condition.*/
}
@FunctionalInterface
 interface Predicate<T>
{
    // Body of Interface
     boolean test(T t);
}
/**-->Where T, The type of input of Predicate. Basically, it is a data type for eg: String, Integer.
 ---->boolean test(T t) method:-This method is used to test the given input with the predicate. Its return type is boolean.
 ---->It returns true if the given argument matched with the predicate otherwise returns false.
 ---->This interface contains a few extra methods but since they all come with a default implementation, you do not have to implement these extra methods.*/

/**Advantage of Predicate:-
 1. By use of Java Predicate, you can move the conditional code in one place.
 2. It improves code maintenance because if you want to make any change in condition then you have to make it in a central place.*/