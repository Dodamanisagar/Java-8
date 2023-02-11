package Order_6.ForEachLoopInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachUsingLambda {
    public static void main(String[] args) {
        //using Lambda with Consumer
        Consumer<String> action = (s) ->    System.out.println("ForEach by Lambda expression:"+ s);
        List<String> names = Arrays.asList("sagar","basaavaraj","ram");
        names.forEach(action);
    }
}
