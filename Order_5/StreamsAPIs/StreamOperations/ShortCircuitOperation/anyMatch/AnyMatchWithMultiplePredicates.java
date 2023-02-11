package Order_5.StreamsAPIs.StreamOperations.ShortCircuitOperation.anyMatch;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AnyMatchWithMultiplePredicates {
    public static void main(String[] args) {
        Predicate<Employee> olderThan50=e->e.getAge()>50;
        Predicate<Employee> earningMoreThan40k=e->e.getSalary()>40000;
        Predicate<Employee> combinedCondition=olderThan50.and(earningMoreThan40k);

        boolean result=getEmployeeStream().anyMatch(combinedCondition);
        System.out.println(result);
    }
    private static Stream<Employee> getEmployeeStream()
    {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "A", 46, 30000));
        empList.add(new Employee(2, "B", 56, 30000));
        empList.add(new Employee(3, "C", 42, 50000));
        empList.add(new Employee(4, "D", 52, 50000));
        empList.add(new Employee(5, "E", 32, 80000));
        empList.add(new Employee(6, "F", 72, 80000));

        return empList.stream();
    }
}

class Employee
{
    private long id;
    private String name;
    private int age;
    private double salary;

    public Employee(long id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
