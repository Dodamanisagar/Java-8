package Order_2.OptionalClassInJava8;

import java.util.Optional;

public class WithUseOfOptionalClass {
    public static void main(String[] args)
    {
        Integer[] intArray = new Integer[5];
        for(int i = 0; i < intArray.length; i++)
        {
            Optional<Integer> checkNull = Optional.ofNullable(intArray[i]);
            if(checkNull.isPresent())
            {
                String word = intArray[i].toString();
                System.out.print(word);
            }
            else
                System.out.println("String is NULL");
        }
    }
}
