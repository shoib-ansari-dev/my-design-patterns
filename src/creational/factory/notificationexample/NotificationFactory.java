package creational.factory.notificationexample;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void sendNotifications(String messgae){
        Notification notification = createNotification();
        notification.notifyUser(messgae);
    }
}
