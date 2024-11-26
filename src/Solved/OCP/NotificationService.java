package Solved.OCP;

// This service can now handle any type of notification without being modified.
// It adheres to OCP by depending on the Notification interface.
public class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}
