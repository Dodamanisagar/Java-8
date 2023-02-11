package Order_7.DefaultMethodsAndStaticMethodsInInterFace.StaticMethod;


interface InterfaceWithStaticMethod
{
    static void show()
    {
        System.out.println("This is static default method");
    }
    void printData();
}
//try to rin the program without implementing InterfaceWithStaticMethod
public class ExampleForStaticMethod implements InterfaceWithStaticMethod{
    public void printData()
    {
        System.out.println("Implementing abstract method in separate  class");
    }

    public static void main(String arg[])
    {
        ExampleForStaticMethod obj = new ExampleForStaticMethod();

        // Calling static default method
        InterfaceWithStaticMethod.show();

        // Calling implemented method of same class
        obj.printData();
    }
}
