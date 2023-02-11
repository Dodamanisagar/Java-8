package Order_4.MethodReference.ReferenceToStaticMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StaticMethodsOfMathClass {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,20,30,3);
        Optional<Integer> max=integers.stream().reduce(Math::max);
        max.ifPresent(value->System.out.println(value));
    }
}
