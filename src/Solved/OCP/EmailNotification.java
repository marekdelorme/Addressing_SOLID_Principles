package Solved.OCP;

// This class handles email notifications.
// It implements the Notification interface, so we can easily add other notification types.
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
