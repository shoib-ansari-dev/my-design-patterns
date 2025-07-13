package creational.factory.notificationexample;

/**
 * Notifaction interface for sending messages to users
 */
public interface Notification {
    /**
     * Send a notification to the user.
     * @param message this message
     * to be sent to the user
     */
    void notifyUser(String message);
}
