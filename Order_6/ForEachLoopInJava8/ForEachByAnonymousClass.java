package Order_6.ForEachLoopInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachByAnonymousClass {
    public static void main(String[] args)
    {
        //AnonymousClass
        Consumer<String> action = new Consumer<String>()
        {
            @Override
            public void accept(String s)
            {
                System.out.println("ForEach by anonymous class:"+ s);

            }
        };

        //here forEach used from Iterable interface(click on forEach by pressing ctrl button)
        List<String> names = Arrays.asList("Ram","Sham","Mohan");
        names.forEach(action);

    }
}
