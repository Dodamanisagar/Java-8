package Order_1.Functional_Interface.SupplierInterFace;

public class SupplierInterfaceWithLambda {
    public static void main(String[] args)
    {
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());
    }
}
