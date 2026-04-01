
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Book class
class Book implements Comparable<Book> {

    int id;
    String title;
    double price;

    // Constructor
    Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    // Comparable: Sort by price
    public int compareTo(Book b) {

        if (this.price > b.price)
            return 1;
        else if (this.price < b.price)
            return -1;
        else
            return 0;
    }
}

// Comparator class to sort by title
class TitleComparator implements Comparator<Book> {

    public int compare(Book b1, Book b2) {
        return b1.title.compareTo(b2.title);
    }
}

public class Program_4 {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();

        // Adding book objects
        list.add(new Book(1, "Java", 500));
        list.add(new Book(2, "Python", 400));
        list.add(new Book(3, "C++", 300));

        // Sort by price
        Collections.sort(list);

        System.out.println("Sorted by Price:");

        for (Book b : list) {
            System.out.println(b.id + " " + b.title + " " + b.price);
        }

        // Sort by title
        Collections.sort(list, new TitleComparator());

        System.out.println("\nSorted by Title:");

        for (Book b : list) {
            System.out.println(b.id + " " + b.title + " " + b.price);
        }
    }
}