package Order_1.Functional_Interface.ConsumerInJava8;

public class ConsumerInterFaceWithOutLambda
{
    /**In Java by use of Consumer, you can perform the different operations on objects as per the requirement.
     * Here we have a common example of such an operation is printing.
     * To print any data, you just need the object and you can print it.*/
    public static void main(String[] args) {

            String stringOne = "Hello";
            Consumer<String> consumer = new Consumer<String>() {
                @Override
                public void accept(String string)
                {
                    System.out.println("Accept method of Consumer = "+ string);
                }
            };

            System.out.println("It accept method consumer the data ");
            consumer.accept(stringOne);


    }
}
