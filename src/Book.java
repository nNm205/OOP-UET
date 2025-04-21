import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book> {
    int numberOfPages;
    String title;
    String author;

    public Book(int numberOfPages, String title, String author) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        if (this.numberOfPages != o.numberOfPages) {
            return this.numberOfPages - o.numberOfPages;
        } else {
            if (!this.title.equals(o.title)) {
                return this.title.compareTo(o.title);
            } else {
                return this.author.compareTo(o.author);
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book(100, "Lap trinh C++", "Nhat Minh");
        Book book2 = new Book(150, "Lap trinh Java", "To Huy");
        Book book3 = new Book(100, "Lap trinh C++", "Van Manh");
        Book book4 = new Book(200, "Lap trinh Python", "To Huy");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        Collections.sort(bookList);

        for (Book book : bookList) {
            System.out.println(book.numberOfPages + " " + book.title + " " + book.author);
        }
    }
}
