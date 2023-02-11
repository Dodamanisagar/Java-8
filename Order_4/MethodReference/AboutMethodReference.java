package Order_4.MethodReference;

public class AboutMethodReference {
    /**As you know before JAVA 8, we are not able to pass any method as a parameter.
     * If we want to pass a method, we must pass the object that contains the method.
     * In Java 8, we can refer a method from class or object using "class::methodName" type syntax.
     * Types:-
             * 1)Reference to static method--------------------->"Class::staticMethodName"
                   - Used to refer static methods from a class
             * 2)Reference to instance method from instance----->"ClassInstance::instanceMethodName"
                   - Refer to an instance method using a reference to the supplied object
             * 3)Reference to instance method from class type--->"Class::instanceMethodName"
                   - Invoke the instance method on a reference to an object supplied by the context
             * 4)Reference to constructor----------------------->"Class::new"
                   - Reference to a constructor
     */
}
