package Order_2.OptionalClassInJava8;

public class WithoutUseOfOptionalClass {
    public static void main(String[] args)
    {
        Integer[] intArray = new Integer[5];
        for(int i = 0; i < intArray.length; i++)
        {
            String word = intArray[i].toString();
            System.out.print(word);
        }
    }
}
