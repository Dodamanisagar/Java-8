package Order_4.MethodReference.ReferenceToInstanceMethodFromInstance;

import java.util.function.Function;

public class ExampleWithMethodRefer {
    public static void main(String[] args)
    {
        //Calling toLowerCase() method using lambda
        Function<String, String> lambdaFunction = (String s) -> s.toLowerCase();
        System.out.println(lambdaFunction.apply("JAVAGOAL"));

        //Calling toLowerCase() method using method reference
        Function<String, String> referenceFunction = String::toLowerCase;
        System.out.println(referenceFunction.apply("JAVAGOAL"));

    }
}
