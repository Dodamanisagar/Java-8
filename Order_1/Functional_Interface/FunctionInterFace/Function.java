package Order_1.Functional_Interface.FunctionInterFace;

@FunctionalInterface
public interface Function<T, R> {
    // Body of Interface
    R apply(T t);
}
/**Where T is The type of input to the function.
 --> R is The type of the result of the function.
 * R apply(T t) method:-
 --> This method is used to perform the operation on the given input and produce the result.
 --> Its return type is R, where R is a data type specified while using the interface.

 *-->This interface contains a few extra methods but since they all come with a default implementation,
   you do not have to implement these extra methods.
 -->This method is very useful whenever you want to perform the operation on the object and want results accordingly.
 -->The programmer must have to specify the data type of input and result.Here T is used for the input data type and R is used for the result.*/
