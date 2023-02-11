package Order_4.MethodReference.ReferenceToInstanceMethodFromClassType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingCompareToMethod {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("sagar","suraj","shree","ram");
        List<String> sortUsingLambda=names.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
        System.out.println(sortUsingLambda);

        List<String> sortUsingMethodReference=names.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortUsingMethodReference);
    }
}
