package structural.adapter.adaptees;

public class ConsoleLogger {
    public void print(String level, String message){
        System.out.println("[Console " + level + "]: " + message);
    }
    public void printError(String level, String message, Throwable throwable){
        System.out.println("[Console " + level + "]: " + message);
        throwable.printStackTrace(System.out);
    }
}
