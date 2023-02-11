package Order_1.Functional_Interface.ConsumerInJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithCollection {

    public static void main(String[] args)
    {
        Book bookOne = new Book(1, "ABC", "shiva");
        Book bookTwo = new Book(5, "DEF", "RAMA");
        Book bookThree = new Book(8, "GHI", "Krishna");

        List<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        // Creating consumer
        Consumer<Book> consumer = (bookId) -> System.out.println("Book id :"+bookId.getBookId());
        Consumer<Book> consumer1=bookname-> System.out.println("book name :"+bookname.getName());
        Consumer<Book> consumer2=bookAuthorName-> System.out.println("book AuthorName :"+bookAuthorName.getAuthorName());


        // foreach accepts object of consumer
        books.stream().forEach(consumer);
        System.out.println();
        books.stream().forEach(consumer1);
        System.out.println();
        books.stream().forEach(consumer2);
    }
}
 class Book
{
    int bookId;
    String name;
    String authorName;

    public Book(int bookId, String name, String authorName)
    {
        this.bookId = bookId;
        this.name = name;
        this.authorName = authorName;
    }
    public int getBookId()
    {
        return bookId;
    }
    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
