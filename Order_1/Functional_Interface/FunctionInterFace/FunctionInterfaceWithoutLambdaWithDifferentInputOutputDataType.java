package Order_1.Functional_Interface.FunctionInterFace;

public class FunctionInterfaceWithoutLambdaWithDifferentInputOutputDataType {
    public static void main(String[] args)
    {
        Function<Integer, String> function = new Function<Integer, String>()
        {
            @Override
            public String apply(Integer integer)
            {
                return integer.toString();
            }

        };

        System.out.println(function.apply(123));
        System.out.println(function.apply(55555));
    }
}
