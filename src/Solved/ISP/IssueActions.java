package Solved.ISP;

// This interface is specifically for issuing books.
// It doesn’t force classes to define unrelated methods like sending notifications.
public interface IssueActions {
    void issueBook(String book, String user);
}
