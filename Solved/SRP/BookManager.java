// This class now only handles book management tasks.
// It follows SRP by focusing on just one responsibility.

public class BookManager {
    public void addBook(String book) {
        System.out.println("Book added: " + book);
    }
}
