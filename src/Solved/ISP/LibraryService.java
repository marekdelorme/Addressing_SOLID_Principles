package Solved.ISP;

// This class implements multiple smaller interfaces, but only the ones it needs.
// This makes the code cleaner and more modular.
public class LibraryService implements BookActions, IssueActions, NotificationActions {
    @Override
    public void addBook(String book) {
        System.out.println("Book added: " + book);
    }

    @Override
    public void issueBook(String book, String user) {
        System.out.println("Book issued: " + book + " to " + user);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }
}
