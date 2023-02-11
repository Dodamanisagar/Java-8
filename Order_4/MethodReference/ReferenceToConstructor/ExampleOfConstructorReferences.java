package Order_4.MethodReference.ReferenceToConstructor;

interface Information
{
    Show getInfo(String msg);
}
class Show{
    Show(String msg)
    {
        System.out.print(msg);
    }
}
public class ExampleOfConstructorReferences
{
    public static void main(String[] args)
    {

        Information info = Show::new;
        info.getInfo("JAVAGOAL");
    }
}