package Solved.SRP;

// This class only takes care of sending notifications.
// Each responsibility is now split into separate classes, following SRP.
public class NotificationService {
    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }
}
