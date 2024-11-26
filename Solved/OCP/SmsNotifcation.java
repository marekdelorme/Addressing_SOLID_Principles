// This class handles SMS notifications.
// Notice how adding this doesn’t require changing any existing code.

public class SmsNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
