package Violated.OCP;

// This class violates the Open/Closed Principle (OCP).
// Adding a new notification type means modifying this class, which isn’t ideal.
public class Notification {
    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending EMAIL: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}
