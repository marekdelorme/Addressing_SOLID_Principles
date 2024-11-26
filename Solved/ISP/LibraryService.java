// This class implements multiple smaller interfaces, but only the ones it needs.
// This makes the code cleaner and more modular.

public class LibraryService implements BookActions, IssueActions, NotificationActions {
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
