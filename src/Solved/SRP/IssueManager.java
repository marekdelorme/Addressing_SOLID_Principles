package Solved.SRP;

// This class is only responsible for managing book issues.
// It doesn’t handle unrelated tasks like notifications or adding books.
public class IssueManager {
    public void issueBook(String book, String user) {
        System.out.println("Book issued: " + book + " to " + user);
    }
}
