package Order_1.Functional_Interface.ConsumerInJava8;

public class ConsumerWithUserDefinedClass {
    public static void main(String[] args)
    {
        // Adding data of Student
        Student studentOne =  new Student(1, "MCA", "Ram");
        Student studentTwo =  new Student(2, "MSC", "Sham");

        Consumer<Student> consumer = (object) ->
        {
            System.out.println(object.getName());
            System.out.println(object.getRollNo());
            System.out.println(object.getClassName());
        };
        System.out.println("First student data:");
        consumer.accept(studentOne);
        System.out.println("Second student data:");
        consumer.accept(studentTwo);
    }
}
/**You see in the above example, we created a consumer and used foreach to print all data.
 Because forEach accepts the object of Consumer. */
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
