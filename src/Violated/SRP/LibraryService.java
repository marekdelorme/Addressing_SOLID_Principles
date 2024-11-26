package Violated.SRP;

// This class breaks the Single Responsibility Principle (SRP).
// It tries to handle multiple responsibilities: managing books, issuing books, and sending notifications.
// This makes the class harder to maintain and extend in the future.
public class LibraryService {
    public void addBook(String book) {
        System.out.println("Book added: " + book);
    }

    public void issueBook(String book, String user) {
        System.out.println("Book issued: " + book + " to " + user);
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }
}
