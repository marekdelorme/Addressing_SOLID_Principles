package Solved.OCP;

// This interface defines a common contract for all notification types.
// We can now add new notification types without changing existing code.
public interface Notification {
    void send(String message);
}
