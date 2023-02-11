package Order_1.Functional_Interface.ConsumerInJava8;

import java.util.ArrayList;
import java.util.List;

public class ExampleWithConsumer {
    public static void main(String[] args)
    {
        Book javaBook = new Book(123, "java begin", "RKK");
        Book digitalBook = new Book(432, "Digital logics", "KG");
        Book mathematicsBook = new Book(412, "mathmaticsc", "DL saini");


        List<Book> books = new ArrayList<Book>();
        books.add(javaBook);
        books.add(digitalBook);
        books.add(mathematicsBook);

        // print all the name of books
        System.out.println("Printng by use of loop");
        books.forEach(book -> System.out.println("Book Name: "+ book.getName().toUpperCase()));
    }
}
