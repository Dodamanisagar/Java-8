package Order_6.ForEachLoopInJava8.AboutForEachMethod;

public class About {
    /**What is java foreach() method in Java?
     - The forEach() method is defined in Iterable Interface and also declared in Stream Interface.
     - The Iterable Interface provides the default implementation of forEach(),
     - So it is available for collections because Collection implements the Iterable interface.
     - The forEach() method works as a utility method that helps to iterate over a collection or stream.
     - The forEach() method accepts the reference of Consumer Interface and performs a certain action on each element of it which define in Consumer.
     - forEach() accepts reference of Consumer. The reference will be provided by a class that implements the Consumer interface and is passed to forEach as an argument.

     *Syntax of forEach() in different interfaces:
      1) in Iterable Inteface
     default void forEach(Consumer<? super T> action)
     {
         Objects.requireNonNull(action);
         for (T t : this)
         {
            action.accept(t);
         }
     }

     2)in Stream Interface:
     - The Stream interface is just declaring the forEach() method.
     - The implements will be provided during the use of Streams.
     void forEach(Consumer<? super T> action);
     * */
}
