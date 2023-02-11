package Order_1.Functional_Interface.PredicateInJava8;
/**we will see how you can use the Predicate interface with a lambda expression:*/
public class PredicateWithLambda {
    public static void main(String[] args) {
        // Creating predicate by use of lambda expression
        Predicate<String> predicate = (stringOne) -> (stringOne.equals("Hello"));

        System.out.println("Is these Strings are equal = "+predicate.test("Hi"));
        System.out.println("Is these Strings are equal = "+predicate.test("Hello"));
    }
}
