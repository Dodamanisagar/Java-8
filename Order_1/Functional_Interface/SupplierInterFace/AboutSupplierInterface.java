package Order_1.Functional_Interface.SupplierInterFace;

public class AboutSupplierInterface {
    /**The supplier interface is defined in the java.util.function package.
     -->It contains one abstract method which is known as get() method.
     -->This interface returns the result of Type T (dataType)
     -->The supplier interface has only one method that supplies the data, unlike the consumer interface it doesn’t consume any data.
     -->The Supplier interface is useful where you want to get an object of type T.
     -->It does not take any object as input but produces a value of type T.
     --> This interface is used in a lambda expression and method reference where the user wants to return an object.
     -->This interface is only used to get/supply the data to another function.*/
}

@FunctionalInterface
 interface Supplier<T>
{
    // Body of Interface
    public T get();

}

