// This interface forces all implementing classes to define methods they might not need.
// For example, not every class will need to send notifications, which violates ISP.

public interface LibraryActions {
    void addBook(String book);
    void issueBook(String book, String user);
    void sendNotification(String message);
}

public class LibraryService implements LibraryActions {
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
