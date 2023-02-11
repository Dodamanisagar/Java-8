package Order_1.Functional_Interface.FunctionInterFace;

public class FunctionInterfaceWithlambda {
    public static void main(String[] args)
    {
        Function<Integer, String> function = (value) -> value.toString();

        System.out.println(function.apply(123));
        System.out.println(function.apply(55555));
    }
}
