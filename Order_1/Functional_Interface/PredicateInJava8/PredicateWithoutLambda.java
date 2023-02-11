package Order_1.Functional_Interface.PredicateInJava8;

/**2. How to use the Predicate interface in java 8?
 ---->First of all, we will see how to use the Java 8 Predicate interface without a lambda expression.*/
public class PredicateWithoutLambda
{
    public static void main(String[] args) {
        String stringOne="hello";
        Predicate<String> predicate=new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return stringOne.equals(s);
            }
        };
        System.out.println("It test the given string with predicate: ");
        System.out.println(predicate.test("Hi"));
        System.out.println(predicate.test("Hello"));//case sensitive

    }
}
