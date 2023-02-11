package Order_1.Functional_Interface.ConsumerInJava8;
import java.util.function.Consumer;
public class ConsumerInterFaceWithLambda {
    public static void main(String[] args)
    {
        Consumer<String> consumer = (value) -> System.out.println("It is a consumer: "+ value);
        consumer.accept("Hi!!!!!");
    }
}
