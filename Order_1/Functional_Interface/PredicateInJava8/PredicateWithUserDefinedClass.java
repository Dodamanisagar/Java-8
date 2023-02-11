package Order_1.Functional_Interface.PredicateInJava8;
import java.util.function.Predicate;

public class PredicateWithUserDefinedClass {
    public static void main(String[] args) {

            // Adding data of Student
            Student studentOne =  new Student(1, "MCA", "Ram");
            Student studentTwo =  new Student(2, "MSC", "Sham");

            Predicate<Student> predicate = (student) -> (student.getRollNo() == 2);
            System.out.println("Is student rollNo is 2 = "+predicate.test(studentOne));

            System.out.println("Is student rollNo is 2 = "+predicate.test(studentTwo));

    }
}
class Student
{
    int rollNo;
    String className;
    String name;

    public Student(int rollNo, String className, String name)
    {
        this.rollNo = rollNo;
        this.className = className;
        this.name = name;
    }
    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public String getClassName()
    {
        return className;
    }
    public void setClassName(String className)
    {
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
