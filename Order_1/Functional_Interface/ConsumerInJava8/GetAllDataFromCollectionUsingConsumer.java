package Order_1.Functional_Interface.ConsumerInJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GetAllDataFromCollectionUsingConsumer {
    public static void main(String[] args)
    {
        Book bookOne = new Book(1, "ABC", "shiva");
        Book bookTwo = new Book(5, "DEF", "RAMA");
        Book bookThree = new Book(8, "GHI", "Krishna");

        List<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        GetAllDataFromCollectionUsingConsumer obj = new GetAllDataFromCollectionUsingConsumer();

        // foreach accepts object of consumer
        books.stream().forEach(obj.getConsumer());
    }

    private Consumer<Book> getConsumer()
    {
        // Creating consumer
        Consumer<Book> consumer = (book) ->
        {
            System.out.println("Book id :"+book.getBookId());
            System.out.println("Book name:"+ book.getName());
            System.out.println("Auther name");
        };
        return consumer;
    }
}

