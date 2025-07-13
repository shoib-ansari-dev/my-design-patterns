package creational.factory.notificationexample;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String message){
        System.out.println("SMS Notification: " + message);
    }
}
