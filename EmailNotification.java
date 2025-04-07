package Services;

public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}
