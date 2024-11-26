package Solved.ISP;

// This interface is specifically for book-related actions.
// It follows ISP by only including methods that make sense for managing books.
public interface BookActions {
    void addBook(String book);
}
