package structural.adapter.adaptees;

public class LegacyLogger {
    public void logLogger(String message) {
        System.out.println("Legacy log: " + message);
    }
    public void logInfo(String message) {
        System.out.println("Legacy info: " + message);
    }
    public void logWarning(String message) {
        System.out.println("Legacy warning: " + message);
    }
    public void logError(String message, Throwable throwable) {
        System.out.println("Legacy error: " + message);
        throwable.printStackTrace(System.out);
    }
}
