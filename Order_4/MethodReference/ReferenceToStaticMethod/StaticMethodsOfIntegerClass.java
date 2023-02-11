package Order_4.MethodReference.ReferenceToStaticMethod;

import java.util.function.Function;

public class StaticMethodsOfIntegerClass {
    public static void main(String[] args) {
        //Calling parseInt() method using lambda
        Function<String,Integer> lambdaExpression=(a)->Integer.parseInt(a);
        System.out.println(lambdaExpression.apply("7"));


        //Calling parseInt() method using method reference
        Function<String,Integer> methodReference=Integer::parseInt;
        System.out.println(methodReference.apply("7"));
    }
}
