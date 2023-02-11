package Order_1.Functional_Interface.AboutFunctional_Interface;

public class AboutFunctionalInterFace {
    /**1)What is the functional interface in java 8?
     ---->An interface that can contain only one abstract method/function is known as a functional interface.
     ---->The term Java functional interface was introduced in Java 8.
     ---->From Java 8 onwards, you can ensure that your interface is functional or not.
     ---->To ensure the functional interface you should add the @FunctionalInterface annotation.
     ---->Runnable and Comparable are the most common examples of functional interfaces.
     ---->These interfaces are also called Single Abstract Method interfaces (SAM Interfaces).

     *2)What is the use of @FunctionalInterface annotation?
     ---->This notation ensures that your interface should contain only one abstract method.
     ---->This annotation is not necessary for the creation of a functional interface.
     ---->It’s not mandatory so the programmer can ignore it.
     */
}

/** *Without annotation:-
 ---->If the programmer does not specify annotation then the interface can contain any number of abstract methods.
 ---->If the interface contains only an abstract method, then it considers a functional interface otherwise not.*/
interface WithoutAnnotation
{
    public void firstMethodWithoutAnnotation();
    public void secondMethodWithoutAnnotation();

}

/**With annotation:-
 ---->If the programmer specifies annotation then the interface can contain only one abstract method.
 ---->If the programmer specifies more than one abstract method, then the compiler shows the error message “Invalid ‘@FunctionalInterface’ annotation”.*/
@FunctionalInterface
interface WithAnnotation
{
   public void firstMethodWithAnnotation();
    //public void secondMethodWithAnnotation();//Multiple non-overriding abstract methods found in interface $FunctionalInterface.WithAnnotation
}

/**3)Important points about the functional interface
 ---->1. In the functional interface, only one abstract method is allowed. If the programmer tries to add any other abstract method, then the compiler will show errors.
         The programmer must remove the @FunctionInterface annotation to add another abstract method, but it will make the interface a non-functional interface.
 ---->2. You can create a functional interface without @FunctionalInterface annotation.
         This annotation is only for informing the compiler to enforce a single abstract method inside the interface.
 ---->3. From Java 8 onwards, the interface can contain the default method. In the interface default method has an implementation, they are not abstract.
 ---->4. Conceptually, a functional interface can contain only one abstract method.
         Since the default method is not abstract, So, you can add the default method also in the functional interface.
 ---->5. You can’t inherit any functional interface to another functional interface. Because it breaks the law of functional interface has exactly one abstract method.
         The compiler will show the error “Invalid ‘@FunctionalInterface’ annotation; ExampleOfAnotherFunctionInterface is not a functional interface”
 ---->6. You can override the methods of the Objects class by declaring them as abstract. The
         compiler does not count toward the interface’s abstract method count.*/
@FunctionalInterface//4 point
interface ExampleOfFunctionInterface
{
    public void firstMethod();
    default void secondMethod()
    {
        System.out.println("It is a default method");
    }
}
@FunctionalInterface//5 point
interface ExampleOfFunctionInterfaceExtends
{
    public void firstMethod();

}
@FunctionalInterface
interface ExampleOfAnotherFunctionInterface //extends ExampleOfFunctionInterfaceExtends
{
    public void secondMethod();
}

@FunctionalInterface
interface ExampleOfFunctionInterfaceWithObjectClass
{
    public void firstMethod();
    @Override
    public String toString();

}
/**Java 8 provides a lot of functional interfaces. These interfaces are used in lambda expressions. All the interfaces are defined in java.util.function package.
 1.BiConsumer<T,U>: This interface has one method that performs an operation that accepts two input arguments and returns no result.??
 2.BiFunction<T,U,R>: This interface has one method that performs an operation and accepts two input arguments, and returns the result of the function.??
 3.BinaryOperator<T>: This interface performs the operation on two operands of same type. It returns the result of the same type.
 4.BiPredicate<T,U>: This interface has one method that checks the given input match with predicte or not.
 5.BooleanSupplier: This interface represents a boolean supplier. This interface has a method that returns boolean.
 6.Consumer<T>: This interface accepts the input but doesn’t produce output. There is one method that accepts only one argument.
 7.DoubleBinaryOperator: This interface accepts the input of double type and returns the result of the same type.
 8.DoubleConsumer: This interface accepts the input of double type but doesn’t produce output. There is one method that accepts only one argument.
 9.DoubleFunction<R>: This interface has one method that performs an operation and accepts one argument of double type and returns result.??
 10.DoublePredicate: This interface has one method that checks the given input of double type is matches with predicte or not.
 11.DoubleSupplier: This interface represents double supplier. This interface has a method that returns double.
 12.DoubleToIntFunction: This interface takes double as input and produces int value as output.
 13.DoubleToLongFunction: This interface takes long as the input and produces double value as output.
 14.DoubleUnaryOperator: This interface takes operand as input and produces the result.
 15.Function<T,R>: This interface has one method that performs an operation and accepts one input argument and returns the result of the function.
 16.IntBinaryOperator: This interface takes operand as input and produces the result of int type.
 17.IntConsumer: This interface accepts the input of int type but doesn’t produce output. There is one method that accepts only one argument.
 18.IntFunction<R>: This interface has one method that performs an operation and accepts one argument of int type and returns result.??
 19.IntPredicate: This interface has one method that checks the given input of int type is match with predicte or not.
 20.IntSupplier: This interface represents int supplier. This interface has a method that returns an int.
 21.IntToDoubleFunction: This interface takes an int as input and produces double value as output.
 22.IntToLongFunction: This interface takes an int as input and produces long value as output.
 23.IntUnaryOperator: This interface takes int operand as input and produces the result of the input type.
 24.LongBinaryOperator: This interface takes operand as input and produces the result of a long type.
 25.LongConsumer: This interface accepts the input of a long type but doesn’t produce output. There is one method that accepts only one argument.
 26.LongFunction<R>: This interface has one method that performs an operation and accepts one argument of long type and returns result.??
 27.LongPredicate: This interface represents a long predicate. This interface has a method that returns Long.
 28.LongSupplier: This interface represents a long supplier. This interface has a method that returns an int.
 29.LongToDoubleFunction: This interface takes long as the input and produces double value as output.
 30.LongToIntFunction: This interface takes long as the input and produces int value as output.
 31.LongUnaryOperator: This interface takes operand of long type as input and produces the result of the long type.
 32.ObjDoubleConsumer<T>:  This interface accepts two inputs. The first input is the specified type, and another is a double type but doesn’t produce output. There is one method that accepts two arguments.
 33.ObjIntConsumer<T>: This interface accepts the input of the specified type and int type but doesn’t produce output.
 34.ObjLongConsumer<T>: This interface accepts the input of the specified type and long type but doesn’t produce output.
 35.Predicate<T>: This interface is used to test the given argument is matched with predict.
 36.Supplier<T>: This interface supplies the object of specified for Supplier.
 37.ToDoubleBiFunction<T,U>: This interface returns the result as a double data type. It applies the function of two arguments.
 38.ToDoubleFunction<T>: This interface returns the result as a double data type. It applies the function of one argument.
 39.ToIntBiFunction<T,U>: This interface returns the result as the int data type. It applies the function on two arguments.
 40.ToIntFunction<T>: This interface returns the result as the int data type. It applies the function of one argument.
 41.ToLongBiFunction<T,U>: This interface returns the result as a long data type. It applies the function of two arguments.
 42.ToLongFunction<T>: This interface returns the result as a long data type. It applies the function of one argument.
 43.UnaryOperator<T>: This interface performs an operation on a single operand that produces a result of the*/