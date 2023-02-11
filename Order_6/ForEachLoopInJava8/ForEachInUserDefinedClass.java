package Order_6.ForEachLoopInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachInUserDefinedClass {
    public static void main(String[] args) {

        System.out.println("forEach using Consumer reference");
        Consumer<Students> consumer= student->{
            System.out.println("student rollno: "+student.getRollNo());
            System.out.println("student name: "+student.getsName());
            System.out.println("student class Name: "+student.getClassName());
            System.out.println();
        };
        List<Students> list= Arrays.asList(new Students(1,"SAGAR","A"),
                                           new Students(2,"RAM","B"),
                                           new Students(3,"RAJ","A"));
        //using Consumer reference inside forEach()
        list.forEach(consumer);


        //If you don’t want to create a reference for Consumer. You can assign reference directly to the forEach() method.
        System.out.println("ForEach without Consumer reference");
        list.forEach(students -> {
            System.out.println("student rollno: "+students.getRollNo());
            System.out.println("student name: "+students.getsName());
            System.out.println("student class Name: "+students.getClassName());
            System.out.println();
        });

        //Using forEach() in Stream
        System.out.println("Using forEach() in Stream");
        list.stream().forEach(students -> {
            System.out.println("student rollno: "+students.getRollNo());
            System.out.println("student name: "+students.getsName());
            System.out.println("student class Name: "+students.getClassName());
            System.out.println();
        });



    }
}
class Students
{
    private int rollNo;
    private String sName;
    private String className;

    public Students(int rollNo, String sName, String className) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.className = className;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
