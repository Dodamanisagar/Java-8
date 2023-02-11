package Order_4.MethodReference.ReferenceToStaticMethod;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UserDefinedStaticMethods {
     public static void main(String[] args) {
         BiFunction<Integer,Integer,Integer> additon=OperationsAll::add;
         Function<String,String> uppercase=OperationsAll::UpperCase;
         System.out.println(additon.apply(5,8));
         System.out.println(uppercase.apply("sagar"));
     }
}
class OperationsAll
{
    public static int add(int a, int b) {
        return a + b;
    }
    public static String UpperCase(String a)
    {
        return a.toUpperCase();
    }

}

