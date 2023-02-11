package Order_7.DefaultMethodsAndStaticMethodsInInterFace.DefaultMethod;

public class About {
    /**default method in interface
     - Till java 7, Interfaces could have only abstract methods.
     - As we already know a separate class is used to provide the implementation of abstract methods.
     - If the programmer adds a new method to an interface, then the implementation of a new abstract method must be provided by the class which is implementing the interface.
     - To resolve the issue, Java 8 introduced default methods and static methods in interfaces.
     - Now the developer can add new functionality to the interface by use of default method without breaking their existing implementation.
     - The default methods in the interface are defined with the default keyword.
     - You can call a default method of the interface from the class that provides the implementation of the interface.

     *Syntax:
     - To define a default method in the interface, we must use the “default” keyword with the method signature.
     interface InterfaceName
     {
     default void methodName()
     {
     // Body of default method
     }
     }

     *The need of Default Method?:
     -The default method provides the flexibility to add the default method in the interface without hampering the existing functionality.
     1. The default method plays the main role to enable the functionality of lambda expression in java. As you know Lambda expression always uses the functional interface.
        To provide the support of lambda expressions in all core classes must be modified.
     2. But In java, a lot of core classes are written in other languages. We can’t modify them.
     3. The JDK framework is very complex if we introduced a new method in the interface. That could break millions of lines of code.
     - As you know forEach() method is introduced in Java 8. To provide the support of forEach() in Collection framework. The forEach() method is defined in the Iterable interface as a default method.
       So that all those classes that use the Iterable interface can use the forEach() method.
       syntax:
              default void forEach(Consumer<? super T> action) {
                 Objects.requireNonNull(action);
                 for (T t : this) {
                   action.accept(t);
                 }
              }.
     *Important points:
     1. The default methods help to extend the functionality of interfaces without breaking the implementation of existing classes.
     2. By the use of default methods in interfaces, the Collections API was enhanced in Java 8 to support lambda expressions.

     *How do achieve multiple inheritances by default methods?
     - A class can extend only one class in java but can implement N number of interfaces.
     - Let’s say we have two interfaces having the same default method which are implemented by a single class.
     - The class will get confused which default method to call.
     */
}
