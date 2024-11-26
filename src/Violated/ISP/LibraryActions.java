package Violated.ISP;

// This interface forces all implementing classes to define methods they might not need.
// For example, not every class will need to send notifications, which violates ISP.
public interface LibraryActions {
    void addBook(String book);
    void issueBook(String book, String user);
    void sendNotification(String message);
}
