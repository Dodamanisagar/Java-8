package Order_1.Functional_Interface.PredicateInJava8;

import java.util.ArrayList;
import java.util.List;

public class ExampleWithoutPredicate {
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

        // Filter and print the college have rank less than 4
        System.out.println("Filtering and Printing by use of loop");
        for(College clg : colleges)
        {
            if(clg.getRank() < 4)
            {
                System.out.println("College Name: "+ clg.getName());
            }
        }
    }
}
class College
{
    String name;
    int rank;
    String city;

    public College(String name, int rank, String city)
    {
        this.name = name;
        this.rank = rank;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}

