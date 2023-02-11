package Order_1.Functional_Interface.PredicateInJava8;

import java.util.ArrayList;
import java.util.List;

public class ExampleWithPredicate {
    public static void main(String[] args)
    {
        College ClgOne = new College("MLN", 1, "YamunaNagar");
        College clgTwo = new College("KUK", 4, "KKR");
        College clgThree = new College("JJP", 3, "Delhi");
        College clgFour = new College("KKL", 6, "UP");
        College clgFive = new College("DPS", 8, "Ambala");
        College clgSix = new College("JNU", 2, "J&K");

        List<College> colleges = new ArrayList<College>();
        colleges.add(ClgOne);
        colleges.add(clgTwo);
        colleges.add(clgThree);
        colleges.add(clgFour);
        colleges.add(clgFive);
        colleges.add(clgSix);

        // Filter the college have rank less than 4
        System.out.println("Filtering and Printng by use of predicate");
        colleges.stream().filter(clg -> (clg.getRank() < 4)).forEach((clg) -> System.out.println("College Name: "+clg.getName()));
    }
}
