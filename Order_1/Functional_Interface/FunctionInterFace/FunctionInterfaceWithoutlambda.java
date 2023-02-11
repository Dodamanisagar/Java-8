package Order_1.Functional_Interface.FunctionInterFace;

public class FunctionInterfaceWithoutlambda
{
    public static void main(String[] args)
    {
        Function<String, String> function = new Function<String, String>()
        {
            @Override
            public String apply(String string)
            {
                return string.toUpperCase();
            }
        };

        System.out.println(function.apply("Hi"));
        System.out.println(function.apply("Hello"));
    }
}
