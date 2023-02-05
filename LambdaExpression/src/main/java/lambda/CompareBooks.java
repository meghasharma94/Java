package lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CompareBooks {
    public static void main(String[] args) {
        Book book1 = new Book("The Complete Refrence", "Herbert Schildt", 350.50f);
        Book book2 = new Book("Harry Potter", "J K Rowling", 200.00f);

        Book book3 = new Book("David Cooperfield", "Charles Darwin", 30.50f);
        Book book4 = new Book("Sherlock Holmes", "Arthur Conan Doyle", 150.67f);

        List<Book> listOfBooks = Arrays.asList(book1, book2, book3, book4);


        // Without lambda

        Comparator<Book> compareAuthor = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        };

        System.out.println("The list of the books are " + listOfBooks);
        Collections.sort(listOfBooks, compareAuthor);
        System.out.println("The list of the books after sorting with author names are " + listOfBooks);

        // With lambda

        System.out.println("The list of the books are " + listOfBooks);
        Collections.sort(listOfBooks, (b1, b2) -> (int) (b2.getPrice() - b1.getPrice()));
        System.out.println("The list of the books after sorting with price names are " + listOfBooks);


    }
}

@Data
@AllArgsConstructor
class Book {
    private String title;
    private String author;
    private float price;
}
