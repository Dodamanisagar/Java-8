package Order_7.DefaultMethodsAndStaticMethodsInInterFace.DefaultMethod;

interface InterfaceWithDefaultMethod
{
    default void show()
    {
        System.out.println("This is default method");
    }
    void printData();
}
public class ExampleForDefaultMethod implements InterfaceWithDefaultMethod{
    public void printData()
    {
        System.out.println("Implementing abstract method in seprate class");
    }

    public static void main(String arg[])
    {
        ExampleForDefaultMethod obj = new ExampleForDefaultMethod();
        /*You can call a default method of the interface from the class that provides the
        implementation of the interface.*/
        obj.show();

        // Calling implemented method of same class
        obj.printData();
    }
}
