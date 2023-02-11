package Order_5.StreamsAPIs.StreamOperations.IntermediateOperations.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingNestedListsInToSingleList {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3);
        List<Integer> list2= Arrays.asList(4,5,6);
        List<Integer> list3= Arrays.asList(7,8,9);

        List<List<Integer>> listOfList=Arrays.asList(list1,list2,list3);
        System.out.println(listOfList);//Before flattening output:-[[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        List<Integer> listOfAllIntegers=listOfList.stream().flatMap(a->a.stream()).collect(Collectors.toList());
        System.out.println(listOfAllIntegers);//After flattening output:-[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
