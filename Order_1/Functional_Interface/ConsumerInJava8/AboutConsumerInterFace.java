package Order_1.Functional_Interface.ConsumerInJava8;

public class AboutConsumerInterFace {
    /**->In Java 8 Consumer interface is defined in the java.util.function package.
     --->It contains one abstract method that is known as accept() method.
     --->This interface accepts a single input argument and doesn’t return the result.
     --->The Consumer interface is useful when an object needs to be consumed.
     --->It takes an object as input and you can perform the operation on an object without returning any result.
     --->This interface is used in a lambda expression and method reference where the user wants to perform the operation without returning the object.*/
}
@FunctionalInterface
 interface Consumer<T>
{
    // Body of Interface
    void accept(T t);
}
/**Where T, The type of input of Consumer. Basically, it is the data type for e.g: String, Integer.
 --->void accept(T t) method:- This method is used to consume and perform the operation on the object. Its return type is void.
 --->This interface contains a few extra methods but since they all come with a default implementation, you do not have to implement these extra methods.*/

/**Advantage of Consumer:-
 1. By use of Consumer, you can move the operation to one place.
 2. It improves code maintenance if you want to make any change in one place.*/