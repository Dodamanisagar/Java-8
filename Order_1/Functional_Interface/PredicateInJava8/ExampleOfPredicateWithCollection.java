package Order_1.Functional_Interface.PredicateInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class ExampleOfPredicateWithCollection
{
    public static void main(String[] args)
    {
        Book bookOne = new Book(1, "ABC", "shiva");
        Book bookTwo = new Book(5, "DEF", "RAMA");
        Book bookThree = new Book(8, "GHI", "Krishna");

        List<Book> books = Arrays.asList(bookOne,bookTwo,bookThree);

        Predicate<Book> predicate = (book) -> (book.getBookId() >= 5);

        books = books.stream().filter(predicate).collect(Collectors.<Book>toList());
        for(Book book : books)
            System.out.println("BookId = "+ book.getBookId());
    }
    /**You see in the above example, we created Predicate and used it in a filter.
     The filter method of Stream takes Predicate as an argument.*/

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