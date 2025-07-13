package creational.factory.notificationexample;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory;
        factory = new EmailNotificationFactory();
        factory.sendNotifications("Email Notification Message");
        factory = new SMSNotificationFactory();
        factory.sendNotifications("SMS Notification Message");
    }
}
