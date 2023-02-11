package Order_1.Functional_Interface.SupplierInterFace;

public class SupplierInterFaceWithoutLambda {
    public static void main(String[] args) {

            Supplier<String> supplier = new Supplier<String>()
            {
                @Override
                public String get()
                {
                    return "Hello";
                }
            };
            System.out.println(supplier.get());
        }

}
